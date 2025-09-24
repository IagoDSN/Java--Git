/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author 02338079698
 */
public class Funcionario implements Serializable{
    private Integer codigoFuncionario;
    private String nomeFuncionario;
    private Double salarioFuncionario;
    private Calendar nascimentoFuncionario;
    private Cidade objCidade; 
    
    public Funcionario() {
        
    }

    public Funcionario(Integer codigoFuncionario, String nomeFuncionario, Cidade objCidade) {
        this.codigoFuncionario = codigoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.objCidade = objCidade;
    }

    public Integer getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Calendar getNascimentoFuncionario() {
        return nascimentoFuncionario;
    }

    public void setNascimentoFuncionario(Calendar nascimentoFuncionario) {
        this.nascimentoFuncionario = nascimentoFuncionario;
    }

    public Cidade getObjCidade() {
        return objCidade;
    }

    public void setObjCidade(Cidade objCidade) {
        this.objCidade = objCidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codigoFuncionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.codigoFuncionario, other.codigoFuncionario)) {
            return false;
        }
        return true;
    }
    
    
    
}
