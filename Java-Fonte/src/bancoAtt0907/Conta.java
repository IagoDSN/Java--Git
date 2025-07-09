/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoAtt0907;

/**
 *
 * @author 13410289682
 */
public interface Conta {
    double getSaldo();
void deposita(double valor);
void retira(double valor);
void atualiza(double taxaSelic);

    public void setNunmero(int i);

    public void setNome(String iago);

    public void saca(int i);

    public String getNumero();

    public void transfere(Conta outraConta, int i);

    public String getTotalDeContas();
}
