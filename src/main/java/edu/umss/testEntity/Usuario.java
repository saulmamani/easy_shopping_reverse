package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Usuario {
    private Long id;
    private String email;
    private String password;
    private Boolean estado;
    private Integer idRol;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Persona> personasById;
    private Rol rolByIdRol;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "estado", nullable = false)
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "idRol", nullable = false)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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

        Usuario usuario = (Usuario) o;

        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (password != null ? !password.equals(usuario.password) : usuario.password != null) return false;
        if (estado != null ? !estado.equals(usuario.estado) : usuario.estado != null) return false;
        if (idRol != null ? !idRol.equals(usuario.idRol) : usuario.idRol != null) return false;
        if (createdAt != null ? !createdAt.equals(usuario.createdAt) : usuario.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(usuario.updatedAt) : usuario.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public Collection<Persona> getPersonasById() {
        return personasById;
    }

    public void setPersonasById(Collection<Persona> personasById) {
        this.personasById = personasById;
    }

    @ManyToOne
    @JoinColumn(name = "idRol", referencedColumnName = "id", nullable = false)
    public Rol getRolByIdRol() {
        return rolByIdRol;
    }

    public void setRolByIdRol(Rol rolByIdRol) {
        this.rolByIdRol = rolByIdRol;
    }
}
