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
public class Programa {
    public static void main(String[] args) {
        
        Conta continha = new Conta();
        Conta continha2 = new Conta();
        
        continha.idConta = 1;
        continha.pro.descricao = "NoteBook core 17";
        continha.pro.valor = 1200;
        continha.cli.nomeCliente = "Iago";
        continha.cli.cpf = "134.102.896-82";
        continha.dataVencimento = "08/07/25";
        continha.dataPagamento = "03/07/25";
        
        continha.vizualizarConta();
        
        System.out.println("----------------------------------------------------");
        
        continha2.idConta = 2;
        continha2.pro.descricao = "NoteBook core 23";
        continha2.pro.valor = 1400;
        continha2.cli.nomeCliente = "Joao";
        continha2.cli.cpf = "154.191.896-42";
        continha2.dataVencimento = "08/08/25";
        continha2.dataPagamento = "15/08/25";
        
        continha2.vizualizarConta();
        
              
    }
}

/*- A classe “Conta” deverá conter um método sem retorno e sem parâmetro com o nome “visualizarConta” , esse método deverá imprimir na saída
padrão as seguintes informações: 1ª linha (identificador da conta), 2ª linha (nome do produto), 3ª linha (nome e cpf do cliente), 4ª linha (valor do
produto), 5ª linha (data do vencimento) e na 6ª linha (data do pagamento).
– A classe “Programa” necessitará do método principal (main), onde deverão ser instanciados dois objetos da classe “Produto”, dois da classe
“Cliente” e dois da classe “Conta”.
– Na classe “Programa” passe valores para os atributos dos objetos instanciados na questão anterior, utilize o método “visualizarConta” para
visualização das duas contas pagas anteriormente ”.
Exemplo de saída do sistema:*/
