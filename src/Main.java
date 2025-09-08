import java.util.Scanner;

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual operação deseja executar?");
    System.out.println("1- Soma");
    System.out.println("2- Subtração");
    System.out.println("3- Multiplicação");
    System.out.println("4- Divisão");

    int operacao = scan.nextInt();

    while (operacao < 0 || operacao > 4) {
        System.out.println("Digite uma operação válida!");
    }

    System.out.print("Digite um numero: ");
    double numero1 = scan.nextDouble();
    System.out.print("Digite outro numero: ");
    double numero2 = scan.nextDouble();
    double resultado;

    switch (operacao) {
        case 1:
            resultado = Operacoes.soma(numero1, numero2);
            break;
        case 2:
            resultado = Operacoes.subtracao(numero1, numero2);
            break;
        case 3:
            resultado = Operacoes.multiplicacao(numero1, numero2);
            break;
        case 4:
            resultado = Operacoes.divisao(numero1, numero2);
            break;
        default:
            resultado = 0;
    }

    System.out.println("Resultado de " + numero1+ " " + numero2 + " : " + resultado);
}