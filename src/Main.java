// Clase Main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Crear objeto Persona
        Persona persona = new Persona(peso, altura);

        // Mostrar resultado
        System.out.println(persona.obtenerMensajeIMC());

        scanner.close();
    }
}