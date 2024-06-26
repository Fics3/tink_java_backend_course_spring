package edu.java.domain.repository.jdbc;

import edu.java.domain.repository.GithubRepositoryRepository;
import edu.java.domain.repository.jdbc.mapper.GithubRepositoryMapper;
import edu.java.model.GithubRepositoryModel;
import edu.java.model.LinkModel;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class JdbcGithubRepositoryRepository implements GithubRepositoryRepository {
    private final JdbcTemplate jdbcTemplate;

    public GithubRepositoryModel getRepositoryByLinkId(UUID uuid) {
        String sql = "SELECT * FROM repositories WHERE link_id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new GithubRepositoryMapper(), uuid);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public LinkModel addRepository(LinkModel linkModel, Integer subscribersCount) {
        String sqlRelation = "INSERT INTO repositories(link_id, subscribers_count)  VALUES (?, ?)";

        jdbcTemplate.update(sqlRelation, linkModel.linkId(), subscribersCount);

        return linkModel;
    }

    @Override
    public void updateSubscribersCount(UUID linkId, Integer subscribersCount) {
        String sql = "UPDATE repositories set subscribers_count = ? where link_id = ?";
        jdbcTemplate.update(sql, subscribersCount, linkId);
    }

    @Override
    public void deleteRepository(Long tgChatId, String url) {
        String sql = "SELECT links.link_id "
            + "FROM links "
            + "JOIN chat_link_relation ON links.link_id = chat_link_relation.link_id "
            + "WHERE chat_link_relation.chat_id = ? AND links.link = ?";

        UUID linkId = jdbcTemplate.queryForObject(sql, UUID.class, tgChatId, url);

        String sqlDelete = "DELETE FROM repositories where link_id = ?";

        jdbcTemplate.update(sqlDelete, linkId);
    }

}
