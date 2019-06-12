package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Rol {
    private Long id;
    private String nombreRol;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Usuario> usuariosById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombreRol", nullable = false, length = 50)
    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
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

        Rol rol = (Rol) o;

        if (id != null ? !id.equals(rol.id) : rol.id != null) return false;
        if (nombreRol != null ? !nombreRol.equals(rol.nombreRol) : rol.nombreRol != null) return false;
        if (createdAt != null ? !createdAt.equals(rol.createdAt) : rol.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(rol.updatedAt) : rol.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombreRol != null ? nombreRol.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "rolByIdRol")
    public Collection<Usuario> getUsuariosById() {
        return usuariosById;
    }

    public void setUsuariosById(Collection<Usuario> usuariosById) {
        this.usuariosById = usuariosById;
    }
}
