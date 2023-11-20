# **Recorridos de un array bidimensional:**
Para recorrer un array bidimensional tenemos diferentes formas de hacerlo. En este documento se explican las más básicas.

Para estos ejemplos se instancia un random con la clase `Random`:
```java
static Random rnd = new Random();
```

## **Recorrer el array fila a fila de izquierda a darecha**
Tenemos dos formas para recorrer el array fila a fila:
* *Recorrido con dos bucles:*
```java
public static void recorrerFilaAFila() {
    int[][] numeros = new int[5][4];

    for (int f=0; f< numeros.length; f++){
        for (int c=0; c< numeros[0].length; c++){
            numeros[f][c] = rnd.nextInt(1, 101);
        }
    }
}
```
* *Recorrido con un bucle:*
```java
public static void recFilFil1() {
    int[][] numeros = new int[5][4];
    int c = numeros[0].length;

    for (int p=0; p< numeros.length*numeros[0].length; p++){
        numeros[p/c][p%c] = rnd.nextInt(1, 101);
    }
}
```