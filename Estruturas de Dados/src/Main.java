import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * PILHAS em Java
        * LITO: Last in First Out
        * O último a entrar sempre é o primeiro a sair
        */

        Stack<String> pilha1 = new Stack<>();
        pilha1.push("Carro");
        pilha1.push("Casa");
        pilha1.push("Camaro");
        pilha1.push("Relogio");
        pilha1.push("Arma");
        pilha1.push("KKK");
        pilha1.push("Oxi"); // ultimo a entrar (tôpo)

        String oxi = pilha1.pop();

        String itemdotopo_KKK = pilha1.peek();

        System.out.println(oxi);
        System.out.println(pilha1);
        System.out.println(itemdotopo_KKK);
        boolean aListaEstaVazia = pilha1.empty();
        System.out.println(aListaEstaVazia);

        System.out.println(pilha1.search("KKK"));

        System.out.println(pilha1.size());
        System.out.println(pilha1.get(0));
        String camarao = pilha1.set(4, "Camarao");
        System.out.println(pilha1);

    }
}