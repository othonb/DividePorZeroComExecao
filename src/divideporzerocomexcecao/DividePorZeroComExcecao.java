package divideporzerocomexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZeroComExcecao {
    
    private static int quocienteComExcecao (int numerador, int denominador)
            throws ArithmeticException {
        
        return numerador / denominador;
        
    }
    
    private static int quocienteSemExcecao (int numerador, int denominador) {
        
        return numerador / denominador;
        
    }
    
    private static int leInteiro (String msg) {
        
        Scanner scanner = new Scanner (System.in);
        
        boolean continuaNoLaco = true;
        
        int numero = 0;
        
        // Leitura do numerador
        while (continuaNoLaco) {
            
            try {
                
                System.out.print (msg);
                numero = scanner.nextInt();
                
                continuaNoLaco = false;
            
            } catch (InputMismatchException e) {
                
                System.out.println ("Numero invalido! Por favor informe um numero inteiro!!!");
                
                scanner.nextLine();
                
            } finally {
                
                System.out.println ("Com ou sem excecao, esse codigo e executado!!!");
                
            }
            
        }
        
        return numero;
        
    }

    public static void main(String[] args) {
        
        //Scanner scanner = new Scanner (System.in);
        //boolean continuaNoLaco = true;
        int numerador = 0;
        int denominador = 0;
        
        // Leitura do numerador
        /*
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
*/
        
        // Lê o numerador
        numerador = leInteiro("Numerador:");
        
        // Lê o denominador
        denominador = leInteiro("Denominador:");
        
       try {
                
            System.out.printf (
                    "\n\nResultado: %d / %d = %d\n\n", 
                    numerador, 
                    denominador, 
                    quocienteComExcecao (numerador, denominador)
            );
            
            System.out.println ("\n\nCódigo executado sem erro!!!\n\n");

        } catch (ArithmeticException e) {
                
            System.out.println ("Erro na divisão!!!");
                
        }
            
        
    }
    
}
