package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Venta {
    private Long id;
    private Integer nroTransaccion;
    private Timestamp fecha;
    private String concepto;
    private Integer idPersona;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Detalle> detallesById;
    private Persona personaByIdPersona;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nroTransaccion", nullable = false)
    public Integer getNroTransaccion() {
        return nroTransaccion;
    }

    public void setNroTransaccion(Integer nroTransaccion) {
        this.nroTransaccion = nroTransaccion;
    }

    @Basic
    @Column(name = "fecha", nullable = false)
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "concepto", nullable = false, length = 1000)
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Basic
    @Column(name = "idPersona", nullable = false)
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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

        Venta venta = (Venta) o;

        if (id != null ? !id.equals(venta.id) : venta.id != null) return false;
        if (nroTransaccion != null ? !nroTransaccion.equals(venta.nroTransaccion) : venta.nroTransaccion != null)
            return false;
        if (fecha != null ? !fecha.equals(venta.fecha) : venta.fecha != null) return false;
        if (concepto != null ? !concepto.equals(venta.concepto) : venta.concepto != null) return false;
        if (idPersona != null ? !idPersona.equals(venta.idPersona) : venta.idPersona != null) return false;
        if (createdAt != null ? !createdAt.equals(venta.createdAt) : venta.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(venta.updatedAt) : venta.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nroTransaccion != null ? nroTransaccion.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (concepto != null ? concepto.hashCode() : 0);
        result = 31 * result + (idPersona != null ? idPersona.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "ventaByIdVenta")
    public Collection<Detalle> getDetallesById() {
        return detallesById;
    }

    public void setDetallesById(Collection<Detalle> detallesById) {
        this.detallesById = detallesById;
    }

    @ManyToOne
    @JoinColumn(name = "idPersona", referencedColumnName = "id", nullable = false)
    public Persona getPersonaByIdPersona() {
        return personaByIdPersona;
    }

    public void setPersonaByIdPersona(Persona personaByIdPersona) {
        this.personaByIdPersona = personaByIdPersona;
    }
}
