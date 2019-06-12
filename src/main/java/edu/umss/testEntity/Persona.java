package edu.umss.testEntity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Persona {
    private Long id;
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private Date fechaNacimiento;
    private String direccion;
    private Integer idCiudad;
    private Integer idUsuario;
    private Integer idEmpresa;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Ciudad ciudadByIdCiudad;
    private Usuario usuarioByIdUsuario;
    private Empresa empresaByIdEmpresa;
    private Collection<Producto> productosById;
    private Collection<TarjetaCredito> tarjetaCreditosById;
    private Collection<Venta> ventasById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ci", nullable = false, length = 20)
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 30)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido", nullable = false, length = 30)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "celular", nullable = false, length = 20)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "fechaNacimiento", nullable = false)
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "direccion", nullable = true, length = 255)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "idCiudad", nullable = false)
    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Basic
    @Column(name = "idUsuario", nullable = false)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "idEmpresa", nullable = false)
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
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

        Persona persona = (Persona) o;

        if (id != null ? !id.equals(persona.id) : persona.id != null) return false;
        if (ci != null ? !ci.equals(persona.ci) : persona.ci != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        if (apellido != null ? !apellido.equals(persona.apellido) : persona.apellido != null) return false;
        if (celular != null ? !celular.equals(persona.celular) : persona.celular != null) return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(persona.fechaNacimiento) : persona.fechaNacimiento != null)
            return false;
        if (direccion != null ? !direccion.equals(persona.direccion) : persona.direccion != null) return false;
        if (idCiudad != null ? !idCiudad.equals(persona.idCiudad) : persona.idCiudad != null) return false;
        if (idUsuario != null ? !idUsuario.equals(persona.idUsuario) : persona.idUsuario != null) return false;
        if (idEmpresa != null ? !idEmpresa.equals(persona.idEmpresa) : persona.idEmpresa != null) return false;
        if (createdAt != null ? !createdAt.equals(persona.createdAt) : persona.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(persona.updatedAt) : persona.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ci != null ? ci.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idEmpresa != null ? idEmpresa.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idCiudad", referencedColumnName = "id", nullable = false)
    public Ciudad getCiudadByIdCiudad() {
        return ciudadByIdCiudad;
    }

    public void setCiudadByIdCiudad(Ciudad ciudadByIdCiudad) {
        this.ciudadByIdCiudad = ciudadByIdCiudad;
    }

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "id", nullable = false)
    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }

    @ManyToOne
    @JoinColumn(name = "idEmpresa", referencedColumnName = "id", nullable = false)
    public Empresa getEmpresaByIdEmpresa() {
        return empresaByIdEmpresa;
    }

    public void setEmpresaByIdEmpresa(Empresa empresaByIdEmpresa) {
        this.empresaByIdEmpresa = empresaByIdEmpresa;
    }

    @OneToMany(mappedBy = "personaByIdPersona")
    public Collection<Producto> getProductosById() {
        return productosById;
    }

    public void setProductosById(Collection<Producto> productosById) {
        this.productosById = productosById;
    }

    @OneToMany(mappedBy = "personaByIdPersona")
    public Collection<TarjetaCredito> getTarjetaCreditosById() {
        return tarjetaCreditosById;
    }

    public void setTarjetaCreditosById(Collection<TarjetaCredito> tarjetaCreditosById) {
        this.tarjetaCreditosById = tarjetaCreditosById;
    }

    @OneToMany(mappedBy = "personaByIdPersona")
    public Collection<Venta> getVentasById() {
        return ventasById;
    }

    public void setVentasById(Collection<Venta> ventasById) {
        this.ventasById = ventasById;
    }
}
