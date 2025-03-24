import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int numeroAgencia = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.print("Insira o número da agência: ");
        numeroAgencia = input.nextInt();

        System.out.print("Insira a agência: ");
        agencia = input.next();

        System.out.print("Insira seu nome (cliente): ");
        nomeCliente = input.nextLine();
        input.next();

        System.out.print("Insira seu saldo: ");
        saldo = input.nextDouble();

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+agencia+", conta "+numeroAgencia+" e seu saldo "+(format.format(saldo))+" já está disponível para saque");
    }
}
