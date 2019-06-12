package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Ciudad {
    private Long id;
    private String nombre;
    private Integer idPais;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Pais paisByIdPais;
    private Collection<Persona> personasById;

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
    @Column(name = "idPais", nullable = false)
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
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

        Ciudad ciudad = (Ciudad) o;

        if (id != null ? !id.equals(ciudad.id) : ciudad.id != null) return false;
        if (nombre != null ? !nombre.equals(ciudad.nombre) : ciudad.nombre != null) return false;
        if (idPais != null ? !idPais.equals(ciudad.idPais) : ciudad.idPais != null) return false;
        if (createdAt != null ? !createdAt.equals(ciudad.createdAt) : ciudad.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(ciudad.updatedAt) : ciudad.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (idPais != null ? idPais.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idPais", referencedColumnName = "id", nullable = false)
    public Pais getPaisByIdPais() {
        return paisByIdPais;
    }

    public void setPaisByIdPais(Pais paisByIdPais) {
        this.paisByIdPais = paisByIdPais;
    }

    @OneToMany(mappedBy = "ciudadByIdCiudad")
    public Collection<Persona> getPersonasById() {
        return personasById;
    }

    public void setPersonasById(Collection<Persona> personasById) {
        this.personasById = personasById;
    }
}
