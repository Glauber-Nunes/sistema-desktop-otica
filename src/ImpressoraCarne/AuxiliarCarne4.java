/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImpressoraCarne;

import Impressora_Jaspe.*;

/**
 *
 * @author gabri
 */
public class AuxiliarCarne4 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento4;
    private String valordaprest4;
    private String datadepgto4;
    private String saldo4;

    public AuxiliarCarne4() {
    }

    public AuxiliarCarne4(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento4, String valordaprest4, String datadepgto4, String saldo4) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento4 = vencimento4;
        this.valordaprest4 = valordaprest4;
        this.datadepgto4 = datadepgto4;
        this.saldo4 = saldo4;
    }

    public String getNomeres() {
        return nomeres;
    }

    public void setNomeres(String nomeres) {
        this.nomeres = nomeres;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getVencimento4() {
        return vencimento4;
    }

    public void setVencimento4(String vencimento4) {
        this.vencimento4 = vencimento4;
    }

    public String getValordaprest4() {
        return valordaprest4;
    }

    public void setValordaprest4(String valordaprest4) {
        this.valordaprest4 = valordaprest4;
    }

    public String getDatadepgto4() {
        return datadepgto4;
    }

    public void setDatadepgto4(String datadepgto4) {
        this.datadepgto4 = datadepgto4;
    }

    public String getSaldo4() {
        return saldo4;
    }

    public void setSaldo4(String saldo4) {
        this.saldo4 = saldo4;
    }
    
    
}
