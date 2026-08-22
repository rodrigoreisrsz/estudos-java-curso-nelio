package com.reis.exercises;

import java.util.Scanner;

import static com.reis.exercises.TipoPessoa.PESSOA_JURIDICA;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de contibuintes:");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            sc.nextLine();

            System.out.println("Digite o nome do contribuinte #" + i+ ": ");
            String nome = sc.nextLine();
            System.out.println("Digite o tipo de pessoa: (F/J)");

            TipoPessoa tipoPessoa = TipoPessoa.valueOf(sc.nextLine());
            System.out.println("Digite a renda anual: ");
            double rendaAnual = sc.nextDouble();
            sc.nextLine();

            switch (tipoPessoa) {

                case PESSOA_FISICA:
                    System.out.println("Teve gastos com saude: (S/N0)");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Digite o valor dos gastos em saude: ");
                        double gastosSaude = sc.nextDouble();
                        PessoFisica pfisica = new PessoFisica(nome, rendaAnual, gastosSaude);
                        System.out.println("Imposto sem  gastos de saude: " + pfisica.calcularImposto());
                        break;

                    } else {
                        PessoFisica pfisica = new PessoFisica(nome, rendaAnual);
                        System.out.println(pfisica.calcularImposto());
                        break;
                    }
                case PESSOA_JURIDICA:
                    System.out.println("Digite o numero de funcionarios: ");
                    int quantidadeFuncionarios = sc.nextInt();
                    PessoaJuridica pjuridica = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);
                    System.out.println(pjuridica.calcularImposto());
            }
        }
    }
}
