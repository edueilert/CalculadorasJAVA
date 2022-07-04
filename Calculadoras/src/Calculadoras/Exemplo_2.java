package calculadora;

import java.util.Scanner;


public class Exemplo_2 {
    public static void main(String[] args) {
        
        double n1, n2, resultado = 0;
        String operacao;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextDouble();
        
        ler.skip("\\R");
        
        System.out.println("Digite a operação: ");
        operacao = ler.nextLine();
        
        System.out.println("Digite o segundo número:");
        n2 = ler.nextDouble();
        
        
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
            break;
            
            case "-":
                resultado = n1 - n2;
            break;
            
            case "*":
                resultado = n1 * n2;
                break;
                
            case "/":
                resultado = n1 / n2;
                break;
                
            default: 
                System.out.println("Erro no sistema!");
            
        }
            
        System.out.println("O seu resultado é: "+ resultado);
        
    }
    
}
