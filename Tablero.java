import java.util.ArrayList;
import java.util.List;
import java.util.scanner;

public class Tablero {

    int numeroCasillas;
    List<Jugador> jugadores = new ArrayList<Jugador>();

    public Tablero(String nombre1, String nombre2){
        Ficha player1 = new Jugador(nombre1, "Rojo");
        Ficha player2 = new Jugador(nombre2, "Amarillo");
        numeroCasillas = 100;
        jugadores.add(player1);
        jugadores.add(player2);
    }
    
    public void gameLogic(){
        int ronda = 1;

        while ((jugadores.get(0).getFicha.posicion < numeroCasillas) && (jugadores.get(1).getFicha.posicion < numeroCasillas)){
            System.out.println("");
            System.out.println("Ronda " + ronda);
            System.out.print("Turno de " + jugadores.get(0).getNombre() + ": ");
            jugadores.get(0).getFicha.avanzar();
            if (jugadores.get(0).getFicha().posicion >= numeroCasillas)
                break;
                
            System.out.print("Turno de " + jugadores.get(1).getNombre() + ": ");
            jugadores.get(1).getFicha().avanzar();
            ronda ++;
        }

        System.out.println("");
        if (jugadores.get(0).getFicha().posicion >= numeroCasillas){
            System.out.println("Felicidades, " + jugadores.get(0).getNombre + "es el ganador del juego");
            System.out.println("");
        }
        else if (jugadores.get(1).getFicha().posicion >= numeroCasillas){
            System.out.println("Felicidades, " + jugadores.get(1).getNombre + "es el ganador del juego");
            System.out.println("");
        }
    }
}
