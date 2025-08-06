/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13410289682
 */
public abstract class Conta {

    private int numero;

    Cliente objCliente = new Cliente();
    Cliente objClienteContaConjunto;
    private double saldo, limite;
    private String cliente;
    private static int totalDeContas;

    abstract void atualiza(double taxaSelic);

    public Conta() {
        System.out.println("Construindo uma conta...");
        //Conta.totalDeContas = Conta.totalDeContas + 1;
        Conta.totalDeContas++;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public Conta(double saldo) {
        this();
        this.saldo = saldo;
    }

    public Conta(double saldo, double limite, int numero) {
        this(saldo);
        //this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }

    public Conta(int numero, Cliente objClienteContaConjunto, double saldo, double limite) {
        this(saldo, limite, numero);
        this.objClienteContaConjunto = objClienteContaConjunto;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNunmero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.cliente = nome;
    }

    public void saca(double quantidade) { //double quantidade é um parâmetro
        if (quantidade <= this.saldo) {
            this.saldo = this.saldo - quantidade;
        } else {
            System.out.println("Prezado " + this.objCliente.getNome() + ", Quantidade de saldo insuficiente, seu saldo é: " + this.saldo);
        }
    }

    void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
    throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.10;
        }
    }

    public void transfere(Conta destino, double quantidade) throws ValorInvalidoException {
        if (this.saldo >= quantidade) {
            this.saca(quantidade);
            destino.deposita(quantidade);
        } else {
            System.out.println("Quantidade de saque insuficiente, seu saldo atual: " + this.getSaldo() + " Quantidade transferida canceleda, quantidade: " + quantidade);
        }
    }

}
