package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Empresa {
    private Long id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String funcacion;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "telefono", nullable = false, length = 20)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "direccion", nullable = false, length = 255)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "funcacion", nullable = true, length = 255)
    public String getFuncacion() {
        return funcacion;
    }

    public void setFuncacion(String funcacion) {
        this.funcacion = funcacion;
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

        Empresa empresa = (Empresa) o;

        if (id != null ? !id.equals(empresa.id) : empresa.id != null) return false;
        if (nombre != null ? !nombre.equals(empresa.nombre) : empresa.nombre != null) return false;
        if (telefono != null ? !telefono.equals(empresa.telefono) : empresa.telefono != null) return false;
        if (direccion != null ? !direccion.equals(empresa.direccion) : empresa.direccion != null) return false;
        if (funcacion != null ? !funcacion.equals(empresa.funcacion) : empresa.funcacion != null) return false;
        if (createdAt != null ? !createdAt.equals(empresa.createdAt) : empresa.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(empresa.updatedAt) : empresa.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (funcacion != null ? funcacion.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "empresaByIdEmpresa")
    public Collection<Persona> getPersonasById() {
        return personasById;
    }

    public void setPersonasById(Collection<Persona> personasById) {
        this.personasById = personasById;
    }
}
