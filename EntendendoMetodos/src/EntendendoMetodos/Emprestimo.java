package EntendendoMetodos;
import java.util.Scanner;

public class Emprestimo {
    
    double valorEmprestimo;
    int tempoEmprestimo;
    double taxaJuros;

    public static double totalEmprestimo(double valorEmprestimo, int tempoEmprestimo, double taxaJuros){
        double totalJuros = tempoEmprestimo * taxaJuros;
        return valorEmprestimo + valorEmprestimo * (totalJuros / 100);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("valor do emprestimo: ");
        double valorEmprestimo = sc.nextDouble();
        System.out.print("tempo do emprestimo em meses: ");
        int tempoEmprestimo = sc.nextInt();
        System.out.print("taxa de juros: ");
        double taxaJuros = sc.nextDouble();

        System.out.println();
        System.out.print("Total: ");
        System.out.print(totalEmprestimo(valorEmprestimo, tempoEmprestimo, taxaJuros));

        sc.close();
    }
}
