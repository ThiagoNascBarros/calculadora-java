import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("===============");
            System.out.println("  Calculadora");
            System.out.println("===============");

            System.out.println("Escolha uma das operações abaixo:\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");
            int scanOpMath = ler.nextInt();

            switch(scanOpMath){
                case 1 -> {
                    System.out.println("Digite o primeiro número: ");
                    int sumOneMath = ler.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int sumTwoMath = ler.nextInt();
                    int resultSum = sumOneMath + sumTwoMath;
                    System.out.println("Resultado: " + resultSum);
                }
                case 2 -> {
                    System.out.println("Digite o primeiro número: ");
                    int subOneMath = ler.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int subTwoMath = ler.nextInt();
                    int resultSub = subOneMath - subTwoMath;
                    System.out.println("Resultado: " +resultSub);
                }
                case 3 -> {
                    System.out.println("Digite o primeiro número: ");
                    int multOneMath = ler.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int multTwoMath = ler.nextInt();
                    int resultMult = multOneMath * multTwoMath;
                    System.out.println("Resultado: " + resultMult);
                }
                case 4 -> {
                    System.out.println("Digite o primeiro número: ");
                    int divOneMath = ler.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int divTwoMath = ler.nextInt();
                    int resultDiv = divOneMath / divTwoMath;
                    System.out.println("Resultado: " + resultDiv);
                }
            }
        }
    }
}
