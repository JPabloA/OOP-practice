import java.util.ArrayList;
import java.util.List;

public class Tablero {

    int numeroCasillas;
    List<Ficha> fichas = new ArrayList<Ficha>();

    public Tablero(){
        Ficha player1 = new Ficha("Rojo");
        Ficha player2 = new Ficha("Amarillo");
        numeroCasillas = 100;
        fichas.add(player1);
        fichas.add(player2);
    }
    

    public void gameLogic(){
        int ronda = 1;

        while ((fichas.get(0).posicion < numeroCasillas) && (fichas.get(1).posicion < numeroCasillas)){
            System.out.println("");
            System.out.println("Ronda " + ronda);
            System.out.print("Ficha de color " + fichas.get(0).color + ": ");
            fichas.get(0).avanzar();
            if (fichas.get(0).posicion > numeroCasillas)
                break;
                
            System.out.print("Ficha de color " + fichas.get(1).color + ": ");
            fichas.get(1).avanzar();
            ronda ++;
        }

        System.out.println("");
        if (fichas.get(0).posicion >= numeroCasillas){
            System.out.println("Felicidades, la ficha de color " + fichas.get(0).color + " es la ganadora del juego");
            System.out.println("");
        }
        else if (fichas.get(1).posicion >= numeroCasillas){
            System.out.println("Felicidades, la ficha de color " + fichas.get(1).color + " es la ganadora del juego");
            System.out.println("");
        }
    }
}
