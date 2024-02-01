package aulaPOO;
import java.util.Scanner;

public class quest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Preço da gasolina: ");
        double valorGA = scan.nextDouble(); 
        System.out.println("Preço do etanol: ");
        double valorET = scan.nextDouble(); 

        double calculo = valorET/valorGA;

        if(calculo <= 0.7){
            System.out.println("Abasteca com etanol! ");

        }else{
            System.out.println("Abasteca com gasolina! ");

        }






        scan.close();
    }
    
}
