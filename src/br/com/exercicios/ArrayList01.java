package br.com.exercicios;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Double> valorProduto = new ArrayList<>();

        valorProduto.add(55.00);
        valorProduto.add(28.00);
        valorProduto.add(39.00);
        valorProduto.add(20.00);
        valorProduto.add(100.00);

        System.out.println("Os valores dos produtos, respectivamente, são:");

        for (Double valor : valorProduto) {
            System.out.println(valor);

        }
    }
}
