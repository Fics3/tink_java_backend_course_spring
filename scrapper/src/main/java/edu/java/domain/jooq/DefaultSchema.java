/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq;

import edu.java.domain.jooq.tables.*;
import org.jetbrains.annotations.NotNull;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;


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
public class DefaultSchema extends SchemaImpl {

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>CHAT_LINK_RELATION</code>.
     */
    public final ChatLinkRelation CHAT_LINK_RELATION = ChatLinkRelation.CHAT_LINK_RELATION;

    /**
     * The table <code>CHATS</code>.
     */
    public final Chats CHATS = Chats.CHATS;

    /**
     * The table <code>LINKS</code>.
     */
    public final Links LINKS = Links.LINKS;

    /**
     * The table <code>QUESTIONS</code>.
     */
    public final Questions QUESTIONS = Questions.QUESTIONS;

    /**
     * The table <code>REPOSITORIES</code>.
     */
    public final Repositories REPOSITORIES = Repositories.REPOSITORIES;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    @NotNull
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    @NotNull
    public final List<Table<?>> getTables() {
        return Arrays.asList(
                ChatLinkRelation.CHAT_LINK_RELATION,
                Chats.CHATS,
                Links.LINKS,
                Questions.QUESTIONS,
                Repositories.REPOSITORIES
        );
    }
}
