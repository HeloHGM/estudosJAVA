package estudo;
import java.util.Scanner;
import java.util.Arrays;

public class contagem {
  

    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 2; i<5; i++){
            System.out.println("Digite numero " + (i+1));
            numeros[i] = scan.nextInt();
        }
        
        Arrays.sort(numeros);

        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] == 0){
                numeros[i] = 10;
            }
        }

        System.out.println(Arrays.toString(numeros));
        scan.close();
    }
}
