package utiles;

public class Item {
    private String nombre;
    private String rutaImagen;
    private int anchoImagen;
    private int altoImagen;

    public Item(String nombre, String rutaImagen, int anchoImagen, int altoImagen) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.anchoImagen = anchoImagen;
        this.altoImagen = altoImagen;
    }

    public Item(String nombre, String rutaImagen) {
        this(nombre, rutaImagen, 120, 80);
    }

    public String getNombre() { return nombre; }
    public String getRutaImagen() { return rutaImagen; }
    public int getAnchoImagen() { return anchoImagen; }
    public int getAltoImagen() { return altoImagen; }
}