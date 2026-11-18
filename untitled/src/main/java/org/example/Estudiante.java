package org.example;

public class Estudiante extends Persona {
    private String carrera;

    // Constructor que usa super para heredar los atributos de Persona
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Sobrescribimos toString para Estudiante con el formato exacto del ejemplo
    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", carrera='" + carrera + "'}";
    }
}