/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables.pojos;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer questionId;
    private UUID linkId;
    private Integer answerCount;

    public Questions() {
    }

    public Questions(Questions value) {
        this.questionId = value.questionId;
        this.linkId = value.linkId;
        this.answerCount = value.answerCount;
    }

    @ConstructorProperties({"questionId", "linkId", "answerCount"})
    public Questions(
        @Nullable Integer questionId,
        @Nullable UUID linkId,
        @NotNull Integer answerCount
    ) {
        this.questionId = questionId;
        this.linkId = linkId;
        this.answerCount = answerCount;
    }

    /**
     * Getter for <code>QUESTIONS.QUESTION_ID</code>.
     */
    @Nullable
    public Integer getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for <code>QUESTIONS.QUESTION_ID</code>.
     */
    public void setQuestionId(@Nullable Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * Getter for <code>QUESTIONS.LINK_ID</code>.
     */
    @Nullable
    public UUID getLinkId() {
        return this.linkId;
    }

    /**
     * Setter for <code>QUESTIONS.LINK_ID</code>.
     */
    public void setLinkId(@Nullable UUID linkId) {
        this.linkId = linkId;
    }

    /**
     * Getter for <code>QUESTIONS.ANSWER_COUNT</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getAnswerCount() {
        return this.answerCount;
    }

    /**
     * Setter for <code>QUESTIONS.ANSWER_COUNT</code>.
     */
    public void setAnswerCount(@NotNull Integer answerCount) {
        this.answerCount = answerCount;
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
        final Questions other = (Questions) obj;
        if (this.questionId == null) {
            if (other.questionId != null) {
                return false;
            }
        } else if (!this.questionId.equals(other.questionId)) {
            return false;
        }
        if (this.linkId == null) {
            if (other.linkId != null) {
                return false;
            }
        } else if (!this.linkId.equals(other.linkId)) {
            return false;
        }
        if (this.answerCount == null) {
            if (other.answerCount != null) {
                return false;
            }
        } else if (!this.answerCount.equals(other.answerCount)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.questionId == null) ? 0 : this.questionId.hashCode());
        result = prime * result + ((this.linkId == null) ? 0 : this.linkId.hashCode());
        result = prime * result + ((this.answerCount == null) ? 0 : this.answerCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Questions (");

        sb.append(questionId);
        sb.append(", ").append(linkId);
        sb.append(", ").append(answerCount);

        sb.append(")");
        return sb.toString();
    }
}
