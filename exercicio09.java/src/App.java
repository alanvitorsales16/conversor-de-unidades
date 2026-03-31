import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== CONVERSOR DE UNIDADES ===");
            System.out.println("1 - Quilômetros para Milhas");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Quilogramas para Libras");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite os km: ");
                    double km = sc.nextDouble();
                    System.out.println("Resultado: " + (km * 0.621371) + " milhas");
                    break;

                case 2:
                    System.out.print("Digite o Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Resultado: " + ((c * 9/5) + 32) + " °F");
                    break;

                case 3:
                    System.out.print("Digite os kg: ");
                    double kg = sc.nextDouble();
                    System.out.println("Resultado: " + (kg * 2.20462) + " libras");
                    break;

                case 0:
                    System.out.println("Encerrando. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}