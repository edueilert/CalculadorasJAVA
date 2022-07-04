package calculadora;

import java.util.Scanner;


public class Exemplo_1 {


    public static void main(String[] args) {
       
        int n1, n2, opcao;
        float resultado = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();
        
        System.out.println("    Menu de opções      ");
        
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Escolha uma das opções: ");
        opcao = ler.nextInt();
        
        switch (opcao){
            case 1:
                resultado = n1 + n2;
                break;
                
            case 2:
                resultado = n1 - n2;
                break;
                
            case 3:
                resultado = n1 * n2;
                break;
                
            case 4:
                resultado = n1 / n2;
                break;
                
            default: 
                System.out.println("Erro no sistema!");
                
        }
        
        System.out.println("O resultado da operação é: "+ resultado);
        
    }
    
}
