# 🗃️ Cerámicas manchegas `Comunicación entre hilos`

Un negocio está regentado por dos amigos en Talavera de la Reina (Toledo / Castilla-La Mancha): un alfarero y un vendedor.
El alfarero hace platos de cerámica y el vendedor los vende. El alfarero coloca cada obra de arte en la galería de exposición, y hasta que no se vende no podrá colocar ninguna otra obra de arte. El vendedor, por lo tanto, emplea todo su esfuerzo y dedicación en vender obra a obra (solo puede vender la obra expuesta y únicamente habrá una en exposición)
Se pide resolver este problema utilizando hilos, wait/notify. Simula la producción/venta de 10 obras.

Ayuda en la codificación:

- Si la exposición está ocupada el alfarero tendrá que esperar
- Si la exposición está vacía el alfarero podrá exponer y después notificará que se puede vender.
- Si no hay nada que vender el vendedor esperará
- Si hay en exposición una obra, ésta se puede vender y el vendedor notificará que se puede producir una nueva.
- La llamada a estos métodos se realiza dentro de bloques synchronized, por lo tanto, ¡¡¡dentro del objeto a proteger!!!

---

## 📦 Estructura del Proyecto

📁 es.etg.dam.psp.sync.thrd

    📁 exposicion
  
      📄 Exposicion.java

    📁 roles
  
      📄 Alfarero.java

      📄 Vendedor.java
  
    📄 Main.java

---

## 📌 Funcionalidad

👨‍🏭 Alfarero → crea platos en la alfarería.

🛒 Vendedor → vende platos sincronizadamente.

🔄 Uso de wait() y notify() para coordinar los hilos.

## 🧑‍💻 Ejecución

Compilar y ejecutar el programa por consola con maven: desde la carpeta raíz donde se encuentra el `pom.xml`.

```bash
mvn clean compile `(desde comunicacion_hilos)`
java -cp target/classes es.etg.dam.psp.sync.thrd.Main ```
```

Mostrará la ejecución de los hilos sincronizados `Monitor`):

> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 9
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 8
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 7
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 6
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 5
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 4
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 3
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 2
>
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 1
> 
> Bonifacio ha realizado un nuevo plato.
> 
> Don Rogelio ha vendido un plato. Platos disponibles: 0
