import java.util.Random; // ¡Correcto! El import va al principio del archivo


// Si tu archivo se llama Corredor.java, el nombre de la clase pública debe ser Corredor.
public class Corredor implements Runnable { // Cambiado a 'public class Corredor'
    private String nombre;
    private int tiempoCarrera; // Tiempo que tardará en milisegundos

    public Corredor(String nombre) {
        this.nombre = nombre;
        // Asignamos un tiempo aleatorio entre 1 y 5 segundos para simular tiempos distintos
        this.tiempoCarrera = new Random().nextInt(4000) + 1000; // Entre 1000 y 5000 ms
    }

    @Override
    public void run() {
        System.out.println(nombre + " ha empezado a correr.");
        try {
            Thread.sleep(tiempoCarrera); // Simula el tiempo que tarda el corredor
            System.out.println(nombre + " ha terminado la carrera en " + (double)tiempoCarrera / 1000 + " segundos.");
        } catch (InterruptedException e) {
            System.out.println(nombre + " fue interrumpido durante la carrera.");
        }
    }
}