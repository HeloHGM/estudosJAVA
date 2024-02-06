package aulaed1.Divisoes;

public class Algo40_2024 {
    public static void main(String[] args) {
        Divisao op = new Divisao();
        op.dividendo = 10;
        op.divisor = 3;

        op.quociente = op.dividendo / op.divisor;
        op.resto = op.dividendo % op.divisor;

        System.out.println("Dividendo..: " + op.dividendo);
        System.out.println("Divisor..: " + op.divisor);
        System.out.println("Quociente..: " + op.quociente);
        System.out.println("Resto..: " + op.resto);



    }
}
