package com.dgd.biblioteca;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        /**
         * Genero
         */

        Genero genero = new Genero();
        genero.setId(1);
        genero.setNombre("Accion");
        genero.setDescripcion("Genero de accion");

        System.out.println(genero.getId());
        System.out.println(genero.getNombre());
        System.out.println(genero.getDescripcion());

        /**
         * Autor
         */

        Autor autor = new Autor();
        autor.setId(1);
        autor.setNombre("Fernando");
        autor.setApellidos("Sanchez");
        autor.setFechaNacimiento("12-01-1999");
        autor.setLocalidadNacimiento("Madrid");

        System.out.println(autor.getId());
        System.out.println(autor.getNombre());
        System.out.println(autor.getApellidos());
        System.out.println(autor.getFechaNacimiento());
        System.out.println(autor.getLocalidadNacimiento());

        /**
         * Libro
         */

        Libro libro = new Libro();
        libro.setIsbn("678-38-6594-123-2");
        libro.setTitulo("El arbol");
        libro.setFechaPublicacion("14-10-2021");
        libro.setAutor(autor);
        libro.setGenero(genero);

        System.out.println(libro.getIsbn());
        System.out.println(libro.gettitulo());
        System.out.println(libro.getFechaPublicacion());
        System.out.println(libro.getAutor());
        System.out.println(libro.getGenero());

        /**
         * Usuario
         */

        Usuario usuario = new Usuario();
        usuario.setDni("37802231H");
        usuario.setNombre("Nuria");
        usuario.setApellidos("Soto");
        usuario.setTelefono("354323681");
        usuario.setDireccion("Avenida Carlos I Nº32 2ºC");
        usuario.setPoblacion("Avila");

        System.out.println(usuario.getDni());
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getApellidos());
        System.out.println(usuario.getTelefono());
        System.out.println(usuario.getDireccion());
        System.out.println(usuario.getPoblacion());

        /**
         * Prestamo
         */

        Prestamo prestamo = new Prestamo();
        prestamo.setId(1);
        prestamo.setFechaPrestamo("10-03-2022");
        prestamo.setFechaDevolucion("15-03-2022");
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);

        System.out.println(prestamo.getId());
        System.out.println(prestamo.getFechaPrestamo());
        System.out.println(prestamo.getFechaDevolucion());
        System.out.println(prestamo.getLibro());
        System.out.println(prestamo.getUsuario());
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}