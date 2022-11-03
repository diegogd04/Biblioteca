package com.dgd.biblioteca;

public class Libro {

    private Integer isbn;
    private String titulo;
    private String autor;
    private String genero;
    private String fechaPublicacion;

    public Integer getIsbn(){
        return isbn;
    }
    public void setIsbn(Integer isbn){
        this.isbn = isbn;
    }
    public String gettitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
}
