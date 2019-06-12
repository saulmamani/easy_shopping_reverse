package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Pais {
    private Long id;
    private String nombre;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Ciudad> ciudadsById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 255)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pais pais = (Pais) o;

        if (id != null ? !id.equals(pais.id) : pais.id != null) return false;
        if (nombre != null ? !nombre.equals(pais.nombre) : pais.nombre != null) return false;
        if (createdAt != null ? !createdAt.equals(pais.createdAt) : pais.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(pais.updatedAt) : pais.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "paisByIdPais")
    public Collection<Ciudad> getCiudadsById() {
        return ciudadsById;
    }

    public void setCiudadsById(Collection<Ciudad> ciudadsById) {
        this.ciudadsById = ciudadsById;
    }
}
