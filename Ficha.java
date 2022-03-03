public class Ficha {
    
    public String color = "";
    public Integer posicion = 0;

    Dado dado = new Dado(6);

    public Ficha(String colorP){
        color = colorP;
        posicion = 0;
    }

    public void avanzar(){
        int pasos = dado.lanzar();
        posicion += pasos;
        System.out.println(posicion);
    }
}
