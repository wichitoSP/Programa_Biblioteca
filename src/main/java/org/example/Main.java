package org.example;

import org.example.Model.Libro;
import org.example.Model.Prestamo;
import org.example.Model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Usuario>usuarios = new ArrayList<>();
    private static ArrayList<Prestamo> prestamos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        do {
            System.out.println("/n---Sistema Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2.Registar Usuario");
            System.out.println("3.Prestar Libro");
            System.out.println("4.Devolver Libro");
            System.out.println("5.Mostar todo los libros");
            System.out.println("6.Mostar todo los usuarios");
            System.out.println("7.Mostar todo los prestamos");
            System.out.println("0. Salir de las opciones");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 :
                    agregarLibro();
                    break;

                case 2 :
                    registarUsuario();

                    break;

                case 3:
                    prestarLibro();

                    break;

                case 4 :

                    devolverLibro();

                    break;

                case 5 :

                    mostrarLibros();

                    break;

                case 6 :
                    mostarUsuarios();

                    break;

                case 7 :
                    mostarPrestamos();

                    break;

                case 0 :

                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opcion no valida.........");



            }


        }while (opcion!= 0);



    }

    private static void mostarPrestamos() {
        if (prestamos.isEmpty()){
            System.out.println("No hay prestamos registrados....");

            return;
        }
        System.out.println("/n--- Lista de Prestamos ---");
        for (int i = 0; i<prestamos.size();i++){
            System.out.println(i+"."+prestamos.get(i));

        }
    }

    private static void mostarUsuarios() {
        if (usuarios.isEmpty()){
            System.out.println("No hay usuarios registrados.");
            return;
        }
        System.out.println("/n--- Lista de Usuarios ---");
        for (int i = 0; i <usuarios.size(); i++){
            System.out.println(i+"."+ usuarios.get(i));
        }
    }

    private static void mostrarLibros() {
        if (libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }

        System.out.println("/n---Lista de Libros---");

        for (int i = 0; i <libros.size(); i++){
            System.out.println(i+"."+libros.get(i));
        }
    }

    private static void devolverLibro() {
    }

    private static void prestarLibro() {
        if(libros.isEmpty() || usuarios.isEmpty()){
            System.out.println("Debe haber al menos un libro y un usuario registrado....");

            return;
        }

    }

    private static void registarUsuario() {
        System.out.print("Ingerese nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese ID del usuario: ");
        String id = scanner.nextLine();

        Usuario usuario = new Usuario(nombre,id);
        usuarios.add(usuario);
        System.out.println("Usuario registrado exitosamente...");
    }

    private static void agregarLibro() {

        System.out.println("Ingrese titulo del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese ISBN del libro: ");
        String isbn = scanner.nextLine();

        Libro libro = new Libro(titulo, autor, isbn);
        libros.add(libro);




    }
}