import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" CONVERSOR DE NOTAS \n");
        
        double nota1, nota2, nota3, nota4;
        
        System.out.print("Digite a 1ª nota (0-10): ");
        nota1 = ler.nextDouble();
        
        System.out.print("Digite a 2ª nota (0-10): ");
        nota2 = ler.nextDouble();
        
        System.out.print("Digite a 3ª nota (0-10): ");
        nota3 = ler.nextDouble();
        
        System.out.print("Digite a 4ª nota (0-10): ");
        nota4 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        String conceito;
        int notaInteira = (int) media;
        
        switch (notaInteira) {
            case 10, 9 -> conceito = "A";
            case 8, 7 -> conceito = "B";
            case 6, 5 -> conceito = "C";
            case 4, 3 -> conceito = "D";
            case 2, 1, 0 -> conceito = "E";
            default -> conceito = "Inválido";
        }
        
        System.out.println("\n RESULTADO ");
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3 + " | " + nota4);
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Conceito: " + conceito);
        ler.close();
    }
}