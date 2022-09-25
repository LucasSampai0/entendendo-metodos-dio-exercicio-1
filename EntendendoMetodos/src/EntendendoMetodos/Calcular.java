package EntendendoMetodos;
import java.util.Scanner;

public class Calcular {
    

    public double valorA;
    public double valorB;

    public static double Somar(double valorA, double valorB){
        return valorA + valorB;
    }
    public static double Subtrair(double valorA, double valorB){
        return valorA - valorB;
    }
    public static double Multiplicar(double valorA, double valorB){
        return valorA * valorB;
    }
    public static double Dividir(double valorA, double valorB){
        return valorA / valorB;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorA = sc.nextDouble();
        double valorB = sc.nextDouble();

        System.out.println(Somar(valorA, valorB));
        sc.close();

    }   
}
