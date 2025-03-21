package edu.jefferson.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        //Para uma variável ser imutável é necessário o uso de uma palavra reservado chamada final na sua atribuição
        final String BR = "Brazil";
        final double PI = 3.14;
        String $text = "Texto";
        int _value = 90;

        String meuNome = "Jefferson";
        int anoFabricacao = 2022;
        boolean isTrue = false;
        System.out.println(isTrue);
        isTrue = !isTrue;
        System.out.println(isTrue);

        System.out.println(BR);
        final String FIRST_NAME = "Ana";
        final String LAST_NAME = "Julia";

        System.out.println(nomeCompleto("Ana", "Julia"));
        System.out.println(nomeCompleto(FIRST_NAME, LAST_NAME));

        String resu = !isTrue ? "Ok" : "Eitaaa";
        System.out.println(resu);

        double numero = 90;
        int numero2 = (int) numero;

        SmartTV tv = new SmartTV();
        tv.toggleOnSmartTV();
        for (int i = 0; i <= 10; i++) {
            tv.acressValumeTV();
        }

        System.out.println(tv.getVolume());
        System.out.println(tv.getChannel());

        tv.alterChannel(89);
        System.out.println("Canal: "+ tv.getChannel());

    }

    public static String nomeCompleto(String firstName, String lastName) {
        return firstName.concat(' ' + lastName);
    }
}
