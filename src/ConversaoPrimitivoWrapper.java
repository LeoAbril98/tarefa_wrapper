import java.util.Scanner;

public class ConversaoPrimitivoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        System.out.println("Número primitivo: " + numeroPrimitivo);
        System.out.println("Número wrapper: " + numeroWrapper);

        scanner.close();
    }
}
