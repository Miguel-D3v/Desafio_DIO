import java.util.Scanner;


public class App {
     public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o primeiro numero");
      int primeiroNumero = scanner.nextInt();
      System.out.println("Digite o segundo numero");
      int segundoNumero = scanner.nextInt();
     try {
         count(primeiroNumero,segundoNumero);
    } catch (InvalidParams e) {
         System.out.println("Segundo numero solicitado deve ser maior que o primeiro numero");
    }    
 }
    static void count( int primeiroNumero , int segundoNumero)throws InvalidParams {
        if (primeiroNumero > segundoNumero){
            throw new InvalidParams();
        };

        int terceiroNumero = segundoNumero - primeiroNumero ;

           for( int n =1 ; n <= terceiroNumero; n++){
              System.out.println(n);
           }
    }
}