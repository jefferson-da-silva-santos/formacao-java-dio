public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);

        int nota = 6;
        String resu = nota > 6 ? "Aprovado" : "Reprovado";
        System.out.println(resu);

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }


        for (int carneirinhos = 1; carneirinhos <= 29; carneirinhos++) {
            System.out.println("Carneirinho " + carneirinhos);
        }

        int numeros[] = {2, 4, 3, 23, 23, 233};

        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.println("Número: " + numeros[i]);

            if (numeros[i] == 23) {
                System.out.println("Um 23 apareceu, não gosto do número 23! ");
                break;
            }
        }

        int numero = 1;
        for (int x = 1; x < 2; x++) {
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);
    }
}
