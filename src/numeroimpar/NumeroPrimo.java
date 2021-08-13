
package numeroimpar;

import java.util.InputMismatchException;
import java.util.Scanner;


public class NumeroPrimo {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int count=0;
        System.out.println("Verificar se um número é Primo");
        System.out.println("Insira um número: ");
        try{
        int numero = teclado.nextInt();
        for (int i=1; i<=numero;i++){
            if(numero%i==0){
                count++;
            }
        }
        System.out.println(count==2 ? "Número Primo":"Número não primo");
        teclado.close();
        }
        catch(InputMismatchException e){
            System.out.println("Digite apenas números");
        }
    }
}