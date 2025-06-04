// No necesitas importar Random aquí si solo lo usas en la clase Corredor.
// Asume que Corredor.java está en el mismo paquete o es accesible.

public class CarreraHilos {
    public static void main(String[] args) {
        System.out.println("¡La carrera ha comenzado!");

        Corredor corredor1 = new Corredor("Corredor 1");
        Corredor corredor2 = new Corredor("Corredor 2");
        Corredor corredor3 = new Corredor("Corredor 3");

        Thread hiloCorredor1 = new Thread(corredor1);
        Thread hiloCorredor2 = new Thread(corredor2);
        Thread hiloCorredor3 = new Thread(corredor3);

        hiloCorredor1.start();
        hiloCorredor2.start();
        hiloCorredor3.start();

        System.out.println("Todos los corredores han salido de la línea de inicio.");
    }
}