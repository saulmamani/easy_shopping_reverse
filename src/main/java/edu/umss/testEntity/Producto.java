package edu.umss.testEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Producto {
    private Long id;
    private String codigoProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private BigDecimal precio;
    private Integer porcentajeOferta;
    private Integer idCategoria;
    private Integer idPersona;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Caracteristica> caracteristicasById;
    private Collection<Detalle> detallesById;
    private Collection<Imagen> imagensById;
    private Categoria categoriaByIdCategoria;
    private Persona personaByIdPersona;
    private Collection<RegistroIngreso> registroIngresosById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codigoProducto", nullable = false, length = 20)
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
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
    @Column(name = "marca", nullable = false, length = 255)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = -1)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "precio", nullable = false, precision = 2)
    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "porcentajeOferta", nullable = true)
    public Integer getPorcentajeOferta() {
        return porcentajeOferta;
    }

    public void setPorcentajeOferta(Integer porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }

    @Basic
    @Column(name = "idCategoria", nullable = false)
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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

        Producto producto = (Producto) o;

        if (id != null ? !id.equals(producto.id) : producto.id != null) return false;
        if (codigoProducto != null ? !codigoProducto.equals(producto.codigoProducto) : producto.codigoProducto != null)
            return false;
        if (nombre != null ? !nombre.equals(producto.nombre) : producto.nombre != null) return false;
        if (marca != null ? !marca.equals(producto.marca) : producto.marca != null) return false;
        if (descripcion != null ? !descripcion.equals(producto.descripcion) : producto.descripcion != null)
            return false;
        if (precio != null ? !precio.equals(producto.precio) : producto.precio != null) return false;
        if (porcentajeOferta != null ? !porcentajeOferta.equals(producto.porcentajeOferta) : producto.porcentajeOferta != null)
            return false;
        if (idCategoria != null ? !idCategoria.equals(producto.idCategoria) : producto.idCategoria != null)
            return false;
        if (idPersona != null ? !idPersona.equals(producto.idPersona) : producto.idPersona != null) return false;
        if (createdAt != null ? !createdAt.equals(producto.createdAt) : producto.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(producto.updatedAt) : producto.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codigoProducto != null ? codigoProducto.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (porcentajeOferta != null ? porcentajeOferta.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (idPersona != null ? idPersona.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productoByIdProducto")
    public Collection<Caracteristica> getCaracteristicasById() {
        return caracteristicasById;
    }

    public void setCaracteristicasById(Collection<Caracteristica> caracteristicasById) {
        this.caracteristicasById = caracteristicasById;
    }

    @OneToMany(mappedBy = "productoByIdProducto")
    public Collection<Detalle> getDetallesById() {
        return detallesById;
    }

    public void setDetallesById(Collection<Detalle> detallesById) {
        this.detallesById = detallesById;
    }

    @OneToMany(mappedBy = "productoByIdProducto")
    public Collection<Imagen> getImagensById() {
        return imagensById;
    }

    public void setImagensById(Collection<Imagen> imagensById) {
        this.imagensById = imagensById;
    }

    @ManyToOne
    @JoinColumn(name = "idCategoria", referencedColumnName = "id", nullable = false)
    public Categoria getCategoriaByIdCategoria() {
        return categoriaByIdCategoria;
    }

    public void setCategoriaByIdCategoria(Categoria categoriaByIdCategoria) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
    }

    @ManyToOne
    @JoinColumn(name = "idPersona", referencedColumnName = "id", nullable = false)
    public Persona getPersonaByIdPersona() {
        return personaByIdPersona;
    }

    public void setPersonaByIdPersona(Persona personaByIdPersona) {
        this.personaByIdPersona = personaByIdPersona;
    }

    @OneToMany(mappedBy = "productoByIdProducto")
    public Collection<RegistroIngreso> getRegistroIngresosById() {
        return registroIngresosById;
    }

    public void setRegistroIngresosById(Collection<RegistroIngreso> registroIngresosById) {
        this.registroIngresosById = registroIngresosById;
    }
}
