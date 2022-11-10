package com.dgd.biblioteca;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        /**
         * Libro
         */

        int isbn,titulo,autor,genero,fechaPublicacion;

        System.out.println("Introduciendo libro.");

        System.out.println("Introducir isbn:");
        Scanner scanIsbn = new Scanner(System.in);
        isbn = scanIsbn.nextInt();

        System.out.println("Introducir titulo:");
        Scanner scanTitulo = new Scanner(System.in);
        titulo = scanTitulo.nextInt();

        System.out.println("Introducir autor:");
        Scanner scanAutor = new Scanner(System.in);
        autor = scanAutor.nextInt();

        System.out.println("Introducir genero:");
        Scanner scan = new Scanner(System.in);
        genero = scan.nextInt();

        System.out.println("Introducir fecha de publicacion:");
        Scanner scanFechaPublicacion = new Scanner(System.in);
        fechaPublicacion = scanFechaPublicacion.nextInt();

        System.out.println("Libro.");
        System.out.println("Isbn: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero " + genero);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}