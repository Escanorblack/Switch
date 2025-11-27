import java.util.Scanner;

public class At3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("SISTEMA DE PAGAMENTO\n");
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = ler.nextDouble();
        
        System.out.println("\nEscolha um método de pagamento:");
        System.out.println("1 - Dinheiro (5% de desconto)");
        System.out.println("2 - Cartão de Débito (sem alteração)");
        System.out.println("3 - Cartão de Crédito (2% de juros)");
        System.out.println("4 - Pix (3% de desconto)");
        System.out.print("\nOpção: ");
        int op= ler.nextInt();
        
        double valorFinal = 0;
        String metodo = "";
        
        switch (op) {
            case 1 -> {
                metodo = "Dinheiro";
                valorFinal = valorCompra * 0.95; 
                System.out.println("\n Desconto de 5% aplicado!");
            }
            case 2 -> {
                metodo = "Cartão de Débito";
                valorFinal = valorCompra;
                System.out.println("\n Sem alteração no valor!");
            }
            case 3 -> {
                metodo = "Cartão de Crédito";
                valorFinal = valorCompra * 1.02; 
                System.out.println("\nJuros de 2% adicionados!");
            }
            case 4 -> {
                metodo = "Pix";
                valorFinal = valorCompra * 0.97; 
                System.out.println("\n Desconto de 3% aplicado!");
            }
            default -> {
                System.out.println("\nERRO: Opção inválida! Digite um número entre 1 e 4.");
                ler.close();
                return;
            }
        }
        
        System.out.println("\n RESUMO DA COMPRA ");
        System.out.println("Valor Original: R$ " + String.format("%.2f", valorCompra));
        System.out.println("Método de Pagamento: " + metodo);
        System.out.println("Valor Final: R$ " + String.format("%.2f", valorFinal));
        System.out.println("\nObrigado pela compra! Volte sempre!");
        
        ler.close();
    }
} 