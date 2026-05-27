package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel {
    private Categoria categoria;
    private List<Object> panelistas; // Almacena tanto instancias individuales (Persona) como grupales (Agrupacion)
    private String horaPresentacion;

    public Panel(Categoria categoria, String horaPresentacion) {
        this.categoria = categoria;
        this.horaPresentacion = horaPresentacion;
        this.panelistas = new ArrayList<>();
    }

    public void agregarPanelista(Object panelista) {
        // TODO: Completar lógica método (debe validar si es instancia de Persona o Agrupacion antes de añadir)
        if (panelista instanceof Persona esPersona){
            panelistas.add(panelista);
            System.out.println("Persona "+ esPersona.getNombre()+ " agregada a panelista.");
        } else if (panelista instanceof Agrupacion esAgrupacion){
            panelistas.add(panelista);
            System.out.println("Agrupación " + esAgrupacion.getNombreGrupo()+" agregada a panelistas.");
        }
    }

    public void eliminarPanelista(Object panelista) {
        // TODO: Completar lógica método
        if (panelista instanceof Persona esPersona){
            panelistas.remove(panelista);
            System.out.println("Persona "+ esPersona.getNombre()+ " eliminada de panelista.");
        } else if (panelista instanceof Agrupacion esAgrupacion){
            panelistas.remove(panelista);
            System.out.println("Agrupación " + esAgrupacion.getNombreGrupo()+" eliminada de panelista.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Hora presentación: " + this.horaPresentacion);
        System.out.println("Tema: " + this.categoria.getNombre());
        System.out.println("¿Quiénes exponen?");

        for (Object p : panelistas) {

            if (p instanceof Persona persona) {
                System.out.println("- Persona: " + persona.getNombre());

            } else if (p instanceof Agrupacion agrupacion) {
                System.out.println("- Agrupación: " + agrupacion.getNombreGrupo());
            }
        }
    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Object> getPanelistas() { return panelistas; }
    public String getHoraPresentacion() { return horaPresentacion; }
    public void setHoraPresentacion(String horaPresentacion) { this.horaPresentacion = horaPresentacion; }
}
