package divideporzerocomexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZeroComExcecao {
    
    public static int quociente (int numerador, int denominador)
            throws ArithmeticException {
        
        return numerador / denominador;
        
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        boolean continuaNoLaco = true;
        int numerador = 0;
        int denominador = 0;
        
        // Leitura do numerador
        while (continuaNoLaco) {
            
            try {
                
                System.out.print ("Numerador: ");
                numerador = scanner.nextInt();
                
                continuaNoLaco = false;
            
            } catch (InputMismatchException e) {
                
                System.out.println ("Numerador inválido! Por favor informe um número inteiro!!!");
                
                scanner.nextLine();
                
            }
            
        }
        
        continuaNoLaco = true;
        
        // Leitura do denominador
        while (continuaNoLaco) {
            
            try {
                
                System.out.print ("Denominador: ");
                denominador = scanner.nextInt();
                
                continuaNoLaco = false;
            
            } catch (InputMismatchException e) {
                
                System.out.println ("Denominador inválido! Por favor informe um número inteiro!!!");
                
                scanner.nextLine();
                
            }
            
        }
        
        try {
                
            System.out.printf ("\n\nResultado: %d / %d = %d\n\n", numerador, denominador, quociente (numerador, denominador));

        } catch (ArithmeticException e) {
                
            System.out.println ("Erro na divisão!!!");
                
        }
            
        
    }
    
}
