import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaração de variáveis
        int numero1, numero2, soma;
        System.out.println("Por favor digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Por favor digite o segundo numero: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros é :" + soma);

    }
}