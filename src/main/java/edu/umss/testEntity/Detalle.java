package edu.umss.testEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Detalle {
    private Long id;
    private Integer cantidad;
    private BigDecimal precio;
    private BigDecimal subTotal;
    private Integer idVenta;
    private Integer idProducto;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Venta ventaByIdVenta;
    private Producto productoByIdProducto;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cantidad", nullable = false)
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
    @Column(name = "subTotal", nullable = false, precision = 2)
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @Basic
    @Column(name = "idVenta", nullable = false)
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    @Basic
    @Column(name = "idProducto", nullable = false)
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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

        Detalle detalle = (Detalle) o;

        if (id != null ? !id.equals(detalle.id) : detalle.id != null) return false;
        if (cantidad != null ? !cantidad.equals(detalle.cantidad) : detalle.cantidad != null) return false;
        if (precio != null ? !precio.equals(detalle.precio) : detalle.precio != null) return false;
        if (subTotal != null ? !subTotal.equals(detalle.subTotal) : detalle.subTotal != null) return false;
        if (idVenta != null ? !idVenta.equals(detalle.idVenta) : detalle.idVenta != null) return false;
        if (idProducto != null ? !idProducto.equals(detalle.idProducto) : detalle.idProducto != null) return false;
        if (createdAt != null ? !createdAt.equals(detalle.createdAt) : detalle.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(detalle.updatedAt) : detalle.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (subTotal != null ? subTotal.hashCode() : 0);
        result = 31 * result + (idVenta != null ? idVenta.hashCode() : 0);
        result = 31 * result + (idProducto != null ? idProducto.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idVenta", referencedColumnName = "id", nullable = false)
    public Venta getVentaByIdVenta() {
        return ventaByIdVenta;
    }

    public void setVentaByIdVenta(Venta ventaByIdVenta) {
        this.ventaByIdVenta = ventaByIdVenta;
    }

    @ManyToOne
    @JoinColumn(name = "idProducto", referencedColumnName = "id", nullable = false)
    public Producto getProductoByIdProducto() {
        return productoByIdProducto;
    }

    public void setProductoByIdProducto(Producto productoByIdProducto) {
        this.productoByIdProducto = productoByIdProducto;
    }
}
