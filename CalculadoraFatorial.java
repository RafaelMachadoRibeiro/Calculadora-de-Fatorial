package calculadorafatorial;
import java.util.Scanner;
import java.text.NumberFormat;
public class CalculadoraFatorial {
    public static void main(String[] args) {
        
        String epc = " ";
        String f1 = "Olá, esse programa foi desenvolvido com o objetivo de calcular o valor do fatorial do múmero que o usuário digitar";
        String f2 = "Digite um número: ";
        String f3 = "O valor de ";
        String f4 = "! é: ";
        
        Scanner in = new Scanner (System.in);
        int numero = 0;
        int cont = 1;
        long fatorial = 1;

        System.out.println(f1);
        System.out.println(epc);
        System.out.println(f2);
        numero = in.nextInt();
                
        for (cont = numero; cont > 1; cont--){
            fatorial = fatorial * cont;
        } 
        
        NumberFormat pontos = NumberFormat.getNumberInstance();
        String fat = pontos.format(fatorial);
        
        System.out.println(f3 + numero + f4 + fat);
    }   
}
