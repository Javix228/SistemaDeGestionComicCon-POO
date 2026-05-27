package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombreGrupo;
    private List<Persona> miembros; // Relación de agregación (acepta Cosplayers y Artistas por Polimorfismo)
    private Categoria categoriaPrincipal;

    public Agrupacion(String nombreGrupo, Categoria categoriaPrincipal) {
        this.nombreGrupo = nombreGrupo;
        this.categoriaPrincipal = categoriaPrincipal;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        // TODO: Completar lógica método
        miembros.add(persona);
    }

    public void eliminarMiembro(Persona persona) {
        // TODO: Completar lógica método
        miembros.remove(persona);
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (detalles del grupo, su categoría y recorrer la lista de miembros)
        System.out.println("Nombre grupo: " + this.nombreGrupo);
        System.out.println("Categoria: " + this.categoriaPrincipal.getNombre());
        System.out.println("==LISTA DE MIEMBROS==");
        for (Persona p : miembros){
            System.out.println("----------------------------------------------------");
            p.mostrarInformacion();
            System.out.println("----------------------------------------------------");
        }

    }

    // Getters y Setters
    public String getNombreGrupo() { return nombreGrupo; }
    public void setNombreGrupo(String nombreGrupo) { this.nombreGrupo = nombreGrupo; }
    public List<Persona> getMiembros() { return miembros; }
    public Categoria getCategoriaPrincipal() { return categoriaPrincipal; }
    public void setCategoriaPrincipal(Categoria categoriaPrincipal) { this.categoriaPrincipal = categoriaPrincipal; }
}
