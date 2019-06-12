package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class TarjetaCredito {
    private Long id;
    private String empresaBanco;
    private String numero;
    private Timestamp fechaVencimiento;
    private String codigoSeguridad;
    private Boolean estaActivo;
    private Integer idPersona;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "empresaBanco", nullable = false, length = 255)
    public String getEmpresaBanco() {
        return empresaBanco;
    }

    public void setEmpresaBanco(String empresaBanco) {
        this.empresaBanco = empresaBanco;
    }

    @Basic
    @Column(name = "Numero", nullable = false, length = 50)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "fechaVencimiento", nullable = false)
    public Timestamp getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Timestamp fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Basic
    @Column(name = "codigoSeguridad", nullable = false, length = 255)
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Basic
    @Column(name = "estaActivo", nullable = false)
    public Boolean getEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(Boolean estaActivo) {
        this.estaActivo = estaActivo;
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

        TarjetaCredito that = (TarjetaCredito) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (empresaBanco != null ? !empresaBanco.equals(that.empresaBanco) : that.empresaBanco != null) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (fechaVencimiento != null ? !fechaVencimiento.equals(that.fechaVencimiento) : that.fechaVencimiento != null)
            return false;
        if (codigoSeguridad != null ? !codigoSeguridad.equals(that.codigoSeguridad) : that.codigoSeguridad != null)
            return false;
        if (estaActivo != null ? !estaActivo.equals(that.estaActivo) : that.estaActivo != null) return false;
        if (idPersona != null ? !idPersona.equals(that.idPersona) : that.idPersona != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (empresaBanco != null ? empresaBanco.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (fechaVencimiento != null ? fechaVencimiento.hashCode() : 0);
        result = 31 * result + (codigoSeguridad != null ? codigoSeguridad.hashCode() : 0);
        result = 31 * result + (estaActivo != null ? estaActivo.hashCode() : 0);
        result = 31 * result + (idPersona != null ? idPersona.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
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
