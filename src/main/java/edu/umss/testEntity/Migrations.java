package edu.umss.testEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Migrations {
    private Integer id;
    private String migration;
    private Integer batch;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "migration", nullable = false, length = 255)
    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    @Basic
    @Column(name = "batch", nullable = false)
    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Migrations that = (Migrations) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (migration != null ? !migration.equals(that.migration) : that.migration != null) return false;
        if (batch != null ? !batch.equals(that.batch) : that.batch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (migration != null ? migration.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        return result;
    }
}
