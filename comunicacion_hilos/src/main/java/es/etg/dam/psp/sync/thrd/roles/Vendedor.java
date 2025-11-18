package es.etg.dam.psp.sync.thrd.roles;

import es.etg.dam.psp.sync.thrd.exposicion.Exposicion;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Vendedor implements Runnable {

    private final String MSG_ERROR = "El hilo ha sido interrumpido.";
    private Exposicion exposicion;
    private String nombre;

    @Override
    public void run() {
        
        while (exposicion.getPlatos() > 0) {
            try {
                Thread.sleep(1000);
                exposicion.vender(nombre);
            } catch (InterruptedException e) {
                System.err.println(MSG_ERROR + e.getMessage());
            }
        }

    }
    
}
