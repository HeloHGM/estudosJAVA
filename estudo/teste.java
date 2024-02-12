package estudo;

public class teste {
   /*  public static void main(String[] args) {
      System.out.println("Hello, World!");
        
int contador = 0;
while (contador < 5) {
    System.out.println("Contagem " + contador);
    contador++;
} }*/

// Definição de um método
public static int somar(int a, int b) {
    return a + b;
}

// Chamada do método
public static void main(String[] args) {
int resultado = somar(3, 7);
System.out.println("A soma é: " + resultado);
   
}}