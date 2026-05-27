package org.example;

public class Artista extends Persona implements Interactivable {
    private String marcaTableta;
    private int cantidadArtbooksPublicados;

    public Artista(String nombre, String paisOrigen, int edad, String marcaTableta, int cantidadArtbooksPublicados) {
        super(nombre, paisOrigen, edad);
        this.marcaTableta = marcaTableta;
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Artista)
        System.out.println("Nombre: " + getNombre());
        System.out.println("Pais origen: " + getPaisOrigen());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Marca Tableta: " + this.marcaTableta);
        System.out.println("Artbooks publicados: " + this.cantidadArtbooksPublicados);
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación, mostrar portafolio y artbooks)

        System.out.println("El artista " + getNombre() +
                " está realizando una presentación artística.");

        System.out.println("Usando tableta marca: " + this.marcaTableta);

        System.out.println("Mostrando portafolio digital...");

        System.out.println("Cantidad de artbooks publicados: "
                + this.cantidadArtbooksPublicados);

        if (this.cantidadArtbooksPublicados > 0) {
            System.out.println("Exhibiendo colección de artbooks.");
        } else {
            System.err.println("Aún no posee artbooks publicados.");
        }
    }

    // Getters y Setters
    public String getMarcaTableta() { return marcaTableta; }
    public void setMarcaTableta(String marcaTableta) { this.marcaTableta = marcaTableta; }
    public int getCantidadArtbooksPublicados() { return cantidadArtbooksPublicados; }
    public void setCantidadArtbooksPublicados(int cantidadArtbooksPublicados) { this.cantidadArtbooksPublicados = cantidadArtbooksPublicados; }
}
