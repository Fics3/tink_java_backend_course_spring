/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables;

import edu.java.domain.jooq.DefaultSchema;
import edu.java.domain.jooq.Keys;
import edu.java.domain.jooq.tables.records.RepositoriesRecord;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

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
public class Repositories extends TableImpl<RepositoriesRecord> {

    /**
     * The reference instance of <code>REPOSITORIES</code>
     */
    public static final Repositories REPOSITORIES = new Repositories();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>REPOSITORIES.REPOSITORY_ID</code>.
     */
    public final TableField<RepositoriesRecord, Integer> REPOSITORY_ID =
        createField(DSL.name("REPOSITORY_ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");
    /**
     * The column <code>REPOSITORIES.LINK_ID</code>.
     */
    public final TableField<RepositoriesRecord, UUID> LINK_ID =
        createField(DSL.name("LINK_ID"), SQLDataType.UUID, this, "");
    /**
     * The column <code>REPOSITORIES.SUBSCRIBERS_COUNT</code>.
     */
    public final TableField<RepositoriesRecord, Integer> SUBSCRIBERS_COUNT =
        createField(DSL.name("SUBSCRIBERS_COUNT"), SQLDataType.INTEGER.nullable(false), this, "");
    private transient Links _links;

    private Repositories(Name alias, Table<RepositoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Repositories(Name alias, Table<RepositoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>REPOSITORIES</code> table reference
     */
    public Repositories(String alias) {
        this(DSL.name(alias), REPOSITORIES);
    }

    /**
     * Create an aliased <code>REPOSITORIES</code> table reference
     */
    public Repositories(Name alias) {
        this(alias, REPOSITORIES);
    }

    /**
     * Create a <code>REPOSITORIES</code> table reference
     */
    public Repositories() {
        this(DSL.name("REPOSITORIES"), null);
    }

    public <O extends Record> Repositories(Table<O> child, ForeignKey<O, RepositoriesRecord> key) {
        super(child, key, REPOSITORIES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<RepositoriesRecord> getRecordType() {
        return RepositoriesRecord.class;
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    @NotNull
    public Identity<RepositoriesRecord, Integer> getIdentity() {
        return (Identity<RepositoriesRecord, Integer>) super.getIdentity();
    }

    @Override
    @NotNull
    public UniqueKey<RepositoriesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8;
    }

    @Override
    @NotNull
    public List<UniqueKey<RepositoriesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CONSTRAINT_81);
    }

    @Override
    @NotNull
    public List<ForeignKey<RepositoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CONSTRAINT_81B);
    }

    /**
     * Get the implicit join path to the <code>PUBLIC.LINKS</code> table.
     */
    public Links links() {
        if (_links == null) {
            _links = new Links(this, Keys.CONSTRAINT_81B);
        }

        return _links;
    }

    @Override
    @NotNull
    public Repositories as(String alias) {
        return new Repositories(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Repositories as(Name alias) {
        return new Repositories(alias, this);
    }

    @Override
    @NotNull
    public Repositories as(Table<?> alias) {
        return new Repositories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Repositories rename(String name) {
        return new Repositories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Repositories rename(Name name) {
        return new Repositories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Repositories rename(Table<?> name) {
        return new Repositories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Integer, UUID, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super UUID, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(
        Class<U> toType,
        Function3<? super Integer, ? super UUID, ? super Integer, ? extends U> from
    ) {
        return convertFrom(toType, Records.mapping(from));
    }
}
