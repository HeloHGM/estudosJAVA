import java.util.Scanner;

public class quest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valorET;
        float valorGA;

        System.out.println("Preço da gasolina: ");
        valorGA = scan.nextFloat(); 
        System.out.println("Preço do etanol: ");
        valorET = scan.nextFloat(); 

        if( valorET/valorGA <= 0.7){
            System.out.println("Abasteca com etanol! ");

        }else{
            System.out.println("Abasteca com gasolina! ");

        }


        scan.close();
    }
    
}
