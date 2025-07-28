import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = sc.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {
            System.out.println("Digite o tipo de imposto a cadastrar (PIS, IPI) ou 'pare' para encerrar:");
            String tipo = sc.nextLine().trim();

            if (tipo.equalsIgnoreCase("pare")) {
                break;
            }

            switch (tipo.toUpperCase()) {
                case "PIS":
                    System.out.print("Informe o valor total de débito: ");
                    double debito = lerDouble(sc);

                    System.out.print("Informe o valor total de crédito: ");
                    double credito = lerDouble(sc);

                    PIS pis = new PIS(debito, credito);
                    pagamentos.adicionarImposto(pis);
                    break;

                case "IPI":
                    System.out.print("Informe o valor do produto: ");
                    double valorProduto = lerDouble(sc);

                    System.out.print("Informe o valor do frete: ");
                    double frete = lerDouble(sc);

                    System.out.print("Informe o valor do seguro: ");
                    double seguro = lerDouble(sc);

                    System.out.print("Informe outras despesas: ");
                    double outrasDespesas = lerDouble(sc);

                    System.out.print("Informe a alíquota (exemplo: 0.05 para 5%): ");
                    double aliquota = lerDouble(sc);

                    IPI ipi = new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota);
                    pagamentos.adicionarImposto(ipi);
                    break;

                default:
                    System.out.println("Tipo de imposto inválido. Tente novamente.");
            }
        }

        System.out.println("\nImpostos cadastrados para a empresa " + pagamentos.getNomeEmpresa() + ":");
        for (Imposto imposto : pagamentos.getImpostos()) {
            System.out.printf("%s: R$ %.2f\n", imposto.getDescricao(), imposto.calcularImposto());
        }

        sc.close();
    }

    // Função auxiliar para ler número aceitando "," ou "."
    private static double lerDouble(Scanner sc) {
        while (true) {
            try {
                String entrada = sc.nextLine().trim().replace(",", ".");
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Tente novamente: ");
            }
        }
    }
}
