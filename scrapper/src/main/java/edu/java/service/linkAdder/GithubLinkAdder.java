package edu.java.service.linkAdder;

import edu.java.client.GithubClient;
import edu.java.configuration.ClientConfig;
import edu.java.domain.repository.GithubRepositoryRepository;
import edu.java.domain.repository.LinksRepository;
import edu.java.exception.BadRequestScrapperException;
import edu.java.model.LinkModel;
import java.net.URI;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
public class GithubLinkAdder implements LinkAdder {

    private final ClientConfig clientConfig;
    private final GithubClient githubClient;
    private final LinksRepository linksRepository;
    private final GithubRepositoryRepository githubRepositoryRepository;

    @Override
    @Transactional
    public LinkModel addLink(URI url, Long tgChatId) {
        var repository = githubClient.fetchRepository(url).block();
        if (repository != null && repository.name() == null) {
            throw new BadRequestScrapperException("Внутрение проблемы", "Подождите");
        }
        var link = linksRepository.addLink(
            tgChatId,
            url.toString(),
            Objects.requireNonNull(repository).pushedAt()
        );
        return githubRepositoryRepository.addRepository(
            link,
            repository.subscribersCount()
        );
    }

    @Override
    public String getDomain() {
        return clientConfig.githubProperties().domain();
    }
}
