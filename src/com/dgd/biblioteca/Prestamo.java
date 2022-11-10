package com.dgd.biblioteca;

public class Prestamo {

    private Integer id;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getFechaPrestamo(){
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion(){
        return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }
    public Libro getLibro(){
        return libro;
    }
    public void setLibro(Libro libro){
        this.libro = libro;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
