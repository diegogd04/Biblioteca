package com.dgd.biblioteca;

public class Prestamo {

    private Integer id;
    private String libro;
    private String usuario;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Integer setId(){
        return id;
    }
    public void getId(Integer id){
        this.id = id;
    }
    public String getLibro(){
        return libro;
    }
    public void getLibro(String libro){
        this.libro = libro;
    }
    public String getUsuario(){
        return usuario;
    }
    public void getUsuario(String usuario){
        this.usuario = usuario;
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
}
