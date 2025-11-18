package es.etg.dam.psp.sync.thrd.exposicion;

import lombok.Data;

@Data
public class Exposicion {

    public static final String MSG_NUEVO_PLATO = " ha realizado un nuevo plato.";
    public static final String MSG_VENDIDO = " ha vendido un plato.";
    public static final String MSG_PLATOS = " Platos disponibles: ";
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
            System.out.println(nombre + MSG_VENDIDO + MSG_PLATOS + platos);
        } else {
            wait();
        }
        
    }

}
