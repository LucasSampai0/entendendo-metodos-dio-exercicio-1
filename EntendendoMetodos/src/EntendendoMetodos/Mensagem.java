package EntendendoMetodos;
import java.util.Scanner;

public class Mensagem {

    public int Hora;

    public static void Saudacao(int Hora){
        if(Hora < 0 || Hora > 23)
        System.out.println("Insira um horário válido!");
        else if(Hora >= 0 && Hora < 12)
        System.out.println("Bom dia!");
        else if(Hora >= 12 && Hora < 18)
        System.out.println("Boa tarde!");
        else
        System.out.println("Boa noite!");
    }

    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int Hora = sc.nextInt();

        Mensagem.Saudacao(Hora);

        sc.close();
    }
}
