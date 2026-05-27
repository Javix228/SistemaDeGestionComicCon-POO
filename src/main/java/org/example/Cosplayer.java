package org.example;

public class Cosplayer extends Persona implements Interactivable {
    private int cantidadTrajes;
    private EstiloCosplay estiloPreferido;

    public Cosplayer(String nombre, String paisOrigen, int edad, int cantidadTrajes, EstiloCosplay estiloPreferido) {
        super(nombre, paisOrigen, edad);
        this.cantidadTrajes = cantidadTrajes;
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Cosplayer)
        System.out.println("Nombre: " + getNombre());
        System.out.println("Pais origen: " + getPaisOrigen());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Cantidad de trajes: " + this.cantidadTrajes);
        System.out.println("Estilo preferido: " + getEstiloPreferido());
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación e imprimir tiempo estimado de preparación)
        int tiempoPreparacion = cantidadTrajes * 15;

        System.out.println("El cosplayer " + getNombre() +
                " está realizando una presentación de estilo "
                + this.estiloPreferido + ".");

        System.out.println("Cantidad de trajes: " + this.cantidadTrajes);

        System.out.println("Tiempo estimado de preparación: "
                + tiempoPreparacion + " minutos.");
    }

    // Getters y Setters
    public int getCantidadTrajes() { return cantidadTrajes; }
    public void setCantidadTrajes(int cantidadTrajes) { this.cantidadTrajes = cantidadTrajes; }
    public EstiloCosplay getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(EstiloCosplay estiloPreferido) { this.estiloPreferido = estiloPreferido; }
}
