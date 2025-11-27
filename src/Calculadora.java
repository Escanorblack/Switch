
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        int n1, n2, op;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = ler.nextInt();
        System.out.println("Digite um número:");
        n2 = ler.nextInt();
    
        System.out.println("\n Escolha a operação: \n 1.Adição: \n 2.Subtração \n 3.Mutiplicação \n 4.Divisão");
        op = ler.nextInt();

        switch (op) {
            case 1 ->
            System.out.print(n1+" + "+n2+" = "+(n1+n2));
            case 2 ->
            System.out.print(n1+" + "+n2+" = "+(n1+n2));
            case 3 ->
            System.out.print(n1+" + "+n2+" = "+(n1+n2));
            case 4 ->
            System.out.print(n1+" + "+n2+" = "+(n1+n2));
             default ->
                System.out.println("Opção ivalida!");
    
        }
}
}