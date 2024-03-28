package edu.java.scrapper.service.linkAdder;

import edu.java.client.GithubClient;
import edu.java.domain.repository.LinksRepository;
import edu.java.model.LinkModel;
import edu.java.service.linkAdder.GithubLinkAdder;
import java.net.URI;
import java.time.OffsetDateTime;
import org.example.dto.GithubRepositoryResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GithubLinkAdderTest {

    @Mock
    private GithubClient githubClient;

    @Mock
    private LinksRepository jooqLinksRepository;

    @InjectMocks
    private GithubLinkAdder linkAdder;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddLink() {
        // Arrange
        URI url = URI.create("https://github.com/owner/repo");
        Long tgChatId = 123456L;
        OffsetDateTime updatedAt = OffsetDateTime.now();
        int subscribersCount = 1000;

        when(githubClient.fetchRepository(any(URI.class))).thenReturn(Mono.just(new GithubRepositoryResponse(
            null,
            null,
            null,
            updatedAt,
            subscribersCount
        )));

        when(jooqLinksRepository.addRepository(
            any(Long.class),
            any(String.class),
            any(OffsetDateTime.class),
            any(Integer.class)
        ))
            .thenReturn(new LinkModel(
                null,
                null,
                updatedAt,
                updatedAt
            ));

        // Act
        LinkModel addedLink = linkAdder.addLink(url, tgChatId);

        // Assert
        verify(jooqLinksRepository, times(1)).addRepository(
            eq(tgChatId),
            eq(url.toString()),
            eq(updatedAt),
            eq(subscribersCount)
        );
    }

}