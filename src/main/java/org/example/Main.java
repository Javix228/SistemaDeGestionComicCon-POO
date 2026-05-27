package org.example;

public class Main {
    public static void main(String[] args) {

        Categoria catVideojuegos = new Categoria("Gaming & E-Sports", 100, 9.8);
        Categoria catArteVisual = new Categoria("Arte Visual y Cómic", 45, 8.5);

        Cosplayer cosplayerJavi = new Cosplayer("Javi", "Chile", 26, 4, EstiloCosplay.VIDEOJUEGOS);
        Artista artistaSofia = new Artista("Sofía", "Colombia", 24, "Huion Kamvas Pro", 2);

        Agrupacion comunidadGaming = new Agrupacion("Legión Trifuerza", catVideojuegos);
        Panel panelPrincipal = new Panel(catVideojuegos, "17:00 hrs");

        cosplayerJavi.agregarCategoria(catVideojuegos);
        artistaSofia.agregarCategoria(catArteVisual);

        comunidadGaming.agregarMiembro(cosplayerJavi);

        panelPrincipal.agregarPanelista(cosplayerJavi);
        panelPrincipal.agregarPanelista(artistaSofia);
        panelPrincipal.agregarPanelista(comunidadGaming);


        cosplayerJavi.realizarPresentacion();
        System.out.println();
        artistaSofia.realizarPresentacion();

        System.out.println("Información de la Agrupación");
        comunidadGaming.mostrarInformacion();

        System.out.println("Información del Panel");
        panelPrincipal.mostrarInformacion();
    }
}