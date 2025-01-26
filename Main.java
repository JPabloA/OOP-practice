import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del Jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingresa el nombre del Jugador 2: ");
        String nombre2 = scanner.nextLine();

        Tablero prueba = new Tablero(nombre1, nombre2);
        prueba.gameLogic();
    }

}