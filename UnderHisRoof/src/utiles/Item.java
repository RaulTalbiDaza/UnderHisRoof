package utiles;

public class Item {

    private String nombre;
    private String rutaImagen;

    public Item(String nombre, String rutaImagen){
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre(){
        return nombre;
    }

    public String getRutaImagen(){
        return rutaImagen;
    }
}