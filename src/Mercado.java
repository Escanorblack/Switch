import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double total = 0;
        String carrinho = "";
        int op, quantidade;
        double preco;
        
        System.out.println("BEM-VINDO AO MERCADO\n");
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha um Produto:");
            System.out.println("1. Arroz (R$ 5.50)");
            System.out.println("2. Feijão (R$ 8.00)");
            System.out.println("3. Tomate (R$ 3.50)");
            System.out.println("4. Cebola (R$ 2.00)");
            System.out.println("5. Costela (R$ 25.00)");
            System.out.println("6. Refrigerante (R$ 6.50)");
            System.out.println("7. Suco (R$ 4.00)");
            System.out.println("0. Finalizar Compra");
            System.out.print("\nOpção: ");
            op = ler.nextInt();
            
            if (op == 0) {
                continuar = false;
            } else if (op >= 1 && op <= 7) {
                System.out.print("Digite a quantidade desejada: ");
                quantidade = ler.nextInt();
                
                switch (op) {
                    case 1 -> {
                        preco = 5.50 * quantidade;
                        carrinho += "Arroz - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 2 -> {
                        preco = 8.00 * quantidade;
                        carrinho += "Feijão - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 3 -> {
                        preco = 3.50 * quantidade;
                        carrinho += "Tomate - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 4 -> {
                        preco = 2.00 * quantidade;
                        carrinho += "Cebola - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 5 -> {
                        preco = 25.00 * quantidade;
                        carrinho += "Costela - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 6 -> {
                        preco = 6.50 * quantidade;
                        carrinho += "Refrigerante - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                    case 7 -> {
                        preco = 4.00 * quantidade;
                        carrinho += "Suco - Qtd: " + quantidade + " - R$ " + String.format("%.2f", preco) + "\n";
                        total += preco;
                    }
                }
                System.out.println("Produto adicionado ao carrinho!\n");
            } else {
                System.out.println("Opção inválida! Tente novamente.\n");
            }
        }
        
        System.out.println("\n========== RESUMO DA COMPRA ==========");
        System.out.println(carrinho);
        System.out.println("Total: R$ " + String.format("%.2f", total));

        System.out.println("FIM DO PROGRAMA");
        
        ler.close();
    }
}