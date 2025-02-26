// Clase Persona
public class Persona {
    private double peso;
    private double altura;

    // Constructor
    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para obtener el mensaje personalizado según el IMC
    public String obtenerMensajeIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return String.format("Tu IMC es %.1f. Estás por debajo del peso normal. ¡Consulta con un médico!", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            return String.format("Tu IMC es %.1f. Tienes un peso saludable. ¡Buen trabajo!", imc);
        } else {
            return String.format("Tu IMC es %.1f. Tienes sobrepeso. ¡Cuida tu salud!", imc);
        }
    }
}
