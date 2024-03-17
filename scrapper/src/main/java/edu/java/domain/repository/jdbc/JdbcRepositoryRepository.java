package edu.java.domain.repository.jdbc;

import edu.java.domain.repository.mapper.RepositoryMapper;
import edu.java.model.RepositoryModel;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class JdbcRepositoryRepository {
    private final JdbcTemplate jdbcTemplate;

    public RepositoryModel getRepositoryByLinkId(UUID uuid) {
        String sql = "SELECT * FROM repositories WHERE link_id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new RepositoryMapper(), uuid);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
