package es.etg.dam.psp.sync.thrd.exposicion;

import lombok.Data;

@Data
public class Exposicion {

    public static String MSG_NUEVO_PLATO = " ha realizado un nuevo plato.";
    public static String MSG_VENDIDO = " ha vendido un plato.";
    private int numPlatos;
    private int platos;

    public Exposicion(int platos) {
        this.numPlatos = 0;
        this.platos = platos;
    }

    public synchronized void crear(String nombre) throws InterruptedException {
        
        if (numPlatos == 0) {
            numPlatos++;
            notify();
            System.out.println(nombre + MSG_NUEVO_PLATO);
        } else {
            wait();
        }
        
    }

    public synchronized void vender(String nombre) throws InterruptedException {
        
        if (numPlatos == 1) {
            numPlatos--;
            platos--;
            notify();
            System.out.println(nombre + MSG_VENDIDO + platos);
        } else {
            wait();
        }
        
    }

}
