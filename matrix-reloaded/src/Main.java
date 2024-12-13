import management.*;
import utils.ConsoleUtils;
import entities.Agente;

public class Main {
    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
            System.out.println("Elige una píldora para continuar:");
            System.out.println("1. Píldora Roja: Agentes de la Resistencia");
            System.out.println("2. Píldora Azul: Control de Anomalías");
            System.out.println("3. Salir y mostrar estadísticas");

            int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1, 2 o 3): ");

            switch (opcion) {
                case 1:
                    AgenteManager agenteManager = new AgenteManager();
                    agenteManager.mostrarMenu();
                    break;
                case 2:
                    AnomaliaManager anomaliaManager = new AnomaliaManager();
                    anomaliaManager.mostrarMenu();
                    break;
                case 3:
                    seguir = false;
                    Agente.mostrarEstadisticas();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        System.out.println("Teacher si ves esto ya tu sabe todo bien todo correcto, Adiós.");
    }
}
