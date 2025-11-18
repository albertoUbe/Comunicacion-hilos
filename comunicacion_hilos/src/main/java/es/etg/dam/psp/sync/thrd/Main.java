package es.etg.dam.psp.sync.thrd;

import es.etg.dam.psp.sync.thrd.exposicion.Exposicion;
import es.etg.dam.psp.sync.thrd.roles.Alfarero;
import es.etg.dam.psp.sync.thrd.roles.Vendedor;

public class Main {

    public static final int PLATOS = 10;
    public static void main(String[] args) {

        Exposicion exposicion = new Exposicion(PLATOS);

        Thread alfarero = new Thread(new Alfarero(exposicion, "Bonifacio"));
        Thread vendedor = new Thread(new Vendedor(exposicion, "Don Rogelio"));

        alfarero.start();
        vendedor.start();
        
    }
}