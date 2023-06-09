import com.minecraft.minecraft_ana.entidades.Personaje;
import com.minecraft.minecraft_ana.entidades.Zombie;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int turno = 0;

        System.out.println("*****************************++ooOOoo++*****************************");
        System.out.println("Querido usuario, le damos la bienvenida para comenzar a jugar a -->> ");
        System.out.println("*--\"MINECRAFT-ANA\"--*");
        System.out.println("Seleccione un arma: ");
        System.out.println("1. Ninguna");
        System.out.println("2. Espada de madera");
        System.out.println("3. Espada de hierro");
        System.out.println("4. Espada de diamantes");

        int opcion = teclado.nextInt();
        int fuerza = 0;
        int defensa = 0;

        switch (opcion) {
            case 1:
                fuerza = 1;
                break;
            case 2:
                fuerza = 2;
                break;
            case 3:
                fuerza = 3;
                break;
            case 4:
                fuerza = 5;
                break;
            default:
                System.out.println("Opción incorrecta");
        }

        System.out.println("Seleccione una armadura");
        System.out.println("1. Ninguna");
        System.out.println("2. De cuero");
        System.out.println("3. De hierro");
        System.out.println("4. De diamente");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                defensa = 0;
                break;
            case 2:
                defensa = 1;
                break;
            case 3:
                defensa = 2;
                break;
            case 4:
                defensa = 3;
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

        Personaje personaje = new Personaje(fuerza, defensa);
        Zombie enemigo = new Zombie();

        System.out.println(" ******** BIENVENIDO AL COMBATE ********");

        while (personaje.getSalud() > 0 && enemigo.getSalud() > 0) {
            turno++;
        }
        int ataquePersonaje = personaje.atarcar();
        enemigo.recibirAtaque(ataquePersonaje);
        System.out.println("El personaje ataca al enemigo" + ataquePersonaje + " puntos de daño");

        if (enemigo.getSalud() >= 0) {
            System.out.println("El enemigo ha sido derrotado");
        }

        Random random = new Random();
        boolean ataqueEnemigo = random.nextBoolean();
        if (ataqueEnemigo) {
            int ataqueEnemigoValor = enemigo.atarcar();
            personaje.recibirAtaque(ataqueEnemigoValor);
            System.out.println("El enemigo ataca al personaje y le causa "
                    + ataqueEnemigoValor + " puntos de daño");
        } else {
            enemigo.moverse();
            System.out.println("El enemigo se mueve");
        }
        System.out.println("El combate ha finalizado");
        System.out.println("Turnos transcurridos : " + turno);

        if (personaje.getSalud() <= 0) {
            System.out.println("El enemigo ha ganado, es el \"victorioso\"");
        } else {
            System.out.println("El personaje ha ganado, es el \"victorioso\"");
        }
    }
}

