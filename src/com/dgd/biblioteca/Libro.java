package com.dgd.biblioteca;

public class Libro {

    private String isbn;
    private String titulo;
    private String fechaPublicacion;
    private Autor autor;
    private Genero genero;

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String gettitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public Genero getGenero(){
        return genero;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }
}
