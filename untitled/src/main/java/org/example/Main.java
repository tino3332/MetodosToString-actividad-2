package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos la lista de estudiantes
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        // Agregamos los objetos usando los datos del ejemplo del TP
        listaEstudiantes.add(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        listaEstudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        listaEstudiantes.add(new Estudiante("Pedro", 21, "Medicina"));

        // Mostramos la lista completa por consola con System.out.println
        System.out.println(listaEstudiantes);
    }
}