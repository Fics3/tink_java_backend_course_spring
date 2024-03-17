/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables.pojos;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class Chats implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long telegramChatId;
    private OffsetDateTime createdAt;

    public Chats() {
    }

    public Chats(Chats value) {
        this.telegramChatId = value.telegramChatId;
        this.createdAt = value.createdAt;
    }

    @ConstructorProperties({"telegramChatId", "createdAt"})
    public Chats(
        @NotNull Long telegramChatId,
        @NotNull OffsetDateTime createdAt
    ) {
        this.telegramChatId = telegramChatId;
        this.createdAt = createdAt;
    }

    /**
     * Getter for <code>CHATS.TELEGRAM_CHAT_ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTelegramChatId() {
        return this.telegramChatId;
    }

    /**
     * Setter for <code>CHATS.TELEGRAM_CHAT_ID</code>.
     */
    public void setTelegramChatId(@NotNull Long telegramChatId) {
        this.telegramChatId = telegramChatId;
    }

    /**
     * Getter for <code>CHATS.CREATED_AT</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>CHATS.CREATED_AT</code>.
     */
    public void setCreatedAt(@NotNull OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chats other = (Chats) obj;
        if (this.telegramChatId == null) {
            if (other.telegramChatId != null) {
                return false;
            }
        } else if (!this.telegramChatId.equals(other.telegramChatId)) {
            return false;
        }
        if (this.createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!this.createdAt.equals(other.createdAt)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.telegramChatId == null) ? 0 : this.telegramChatId.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chats (");

        sb.append(telegramChatId);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}
