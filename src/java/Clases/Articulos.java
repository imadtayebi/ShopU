/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Imad
 */
public class Articulos {
    
  
    private Long idarticulo;
    
    private String nombre;

    private String descripcion;

    private String categoria;

    private String estado;
   
    private Integer anioAdquisicion;

    private Double precio;

    private Long idusuario;

    public Articulos() {
    }

    public Articulos(Long idarticulo) {
        this.idarticulo = idarticulo;
    }

    public Articulos(Long idarticulo, String nombre, String descripcion, String categoria) {
        this.idarticulo = idarticulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
     public Articulos(String nombre, String descripcion, String categoria,String estado,int anioAdquisicion,double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado=estado;
        this.anioAdquisicion=anioAdquisicion;
        this.precio=precio;
    }

    public Long getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(Long idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(Integer anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    
    
}
