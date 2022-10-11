package br.com.calculadoradecortinas.calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testes {

    public static void main(String[] args) {


        double dblArr[] = new double[12];
        double[] dblArr2 = new double[12];

        // var blah[] = new int[10];

        List<Integer> lista;
        lista = new ArrayList<>();
        lista.add(1);
        lista.add(4);
        System.out.println(lista);
        for (Integer i : lista) {
            System.out.println("i é:" + i);
        }


        lista.add(4);
        lista.add(4);
        lista.add(444);

        lista.forEach(System.out::println);

        String c = "carlos ";
        String c2 = "carlos";

        String str = """
                Text blocks make multiple lines easy because they eliminate
                 the need to use \n escape sequences to indicate a newline.
                As a result, text blocks make the programmer's life better!
                """;

        System.out.println(str);


        System.out.println(Arrays.toString("carlos".getBytes()));
    }

}
