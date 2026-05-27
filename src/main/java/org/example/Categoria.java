package org.example;

public class Categoria {
    private String nombre;
    private int numeroCuposMaximos;
    private double popularidadEstimada;

    public Categoria(String nombre, int numeroCuposMaximos, double popularidadEstimada) {
        this.nombre = nombre;
        this.numeroCuposMaximos = numeroCuposMaximos;
        this.popularidadEstimada = popularidadEstimada;
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir los atributos de la categoría)
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cupos máximos: " + this.numeroCuposMaximos);
        System.out.println("Popularidad: " + this.popularidadEstimada);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNumeroCuposMaximos() { return numeroCuposMaximos; }
    public void setNumeroCuposMaximos(int numeroCuposMaximos) { this.numeroCuposMaximos = numeroCuposMaximos; }
    public double getPopularidadEstimada() { return popularidadEstimada; }
    public void setPopularidadEstimada(double popularidadEstimada) { this.popularidadEstimada = popularidadEstimada; }
}
