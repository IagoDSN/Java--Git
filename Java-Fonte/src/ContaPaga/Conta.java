/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaPaga;

/**
 *
 * @author 13410289682
 */
public class Conta {
    int idConta;
    String dataVencimento, dataPagamento;
    Produto pro = new Produto();
    Cliente cli = new Cliente();
    
    public void vizualizarConta(){
        System.out.println("Identificador da conta: "+this.idConta+
                " \nNome do produto: "+this.pro.descricao+
                " \nNome do cliente: "+this.cli.cpf+" CPF: "+this.cli.cpf+
                " \nValor do produto: "+this.pro.valor+
                " \nData do vencimento: "+this.dataVencimento+
                " \nData do pagamento: "+this.dataPagamento+"\n");
    }
}
