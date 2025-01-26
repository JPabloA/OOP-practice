public class Jugador {
    private String nombre;
    private Ficha ficha;

    public Jugador (String nombre, String color){
        this.nombre = nombre;
        this.ficha = new Ficha(color);
    }

    public String getNombre(){
        return nombre;
    }

    public String getFicha(){
        return ficha;
    }
}