package org.example.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.net.URI;
import java.time.OffsetDateTime;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record GithubRepositoryResponse(
    String name,
    String fullName,
    URI htmlUrl,
    OffsetDateTime pushedAt,
    Integer subscribersCount
) {
}
