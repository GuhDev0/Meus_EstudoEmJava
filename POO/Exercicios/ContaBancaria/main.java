package Exercicios.ContaBancaria;

public class main {


    public static void main(String[] args) {
            ContaBancaria contaBancariaGustavo = new ContaBancaria(0,false);
            ContaBancaria contaBancarialucas = new ContaBancaria(0,false);
            contaBancariaGustavo.abrirConta("Gustavo", "CP",12345);
            contaBancariaGustavo.print();
            contaBancariaGustavo.pagarMensal();

    }
}
