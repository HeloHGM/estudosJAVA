import java.util.Scanner;

public class palavras {
    public static void main(String[] args) {
        String[] palavras = new String[5];
        Scanner scan = new Scanner(System.in);


    for (int i = 0; i < palavras.length; i++) {
        System.out.println("Palavra " + (i + 1) + ": ");
        palavras[i] = scan.nextLine();
    }
    scan.close();

    System.out.println("\n Palavras armazenadas:");
    for (int i = 0; i < palavras.length; i++) {
        System.out.println("Palavra " + (i + 1) + ": " + palavras[i]);
    }

}}