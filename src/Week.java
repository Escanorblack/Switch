import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" DIAS DA SEMANA \n");
        System.out.print("Digite um número (1-7) para saber o dia da semana: ");
        int numero = ler.nextInt();
        
        switch (numero) {
            case 1 -> 
            System.out.println("Domingo");
            case 2 -> 
            System.out.println("Segunda");
            case 3 -> 
            System.out.println("Terça");
            case 4 -> 
            System.out.println("Quarta");
            case 5 -> 
            System.out.println("Quinta");
            case 6 -> 
            System.out.println("Sexta");
            case 7 -> 
            System.out.println("Sábado");
            default -> 
            System.out.println("ERRO: Valor inválido! Digite um número entre 1 e 7.");
        }
        
        ler.close();
    }
}