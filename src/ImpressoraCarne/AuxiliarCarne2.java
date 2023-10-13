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
public class AuxiliarCarne2 {
    private String nomeres;
     private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento2;
    private String valordaprest2;
    private String datadepgto2;
    private String saldo2;

    public AuxiliarCarne2() {
    }

    public AuxiliarCarne2(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento2, String valordaprest2, String datadepgto2, String saldo2) {
        this.nomeres = nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento2 = vencimento2;
        this.valordaprest2 = valordaprest2;
        this.datadepgto2 = datadepgto2;
        this.saldo2 = saldo2;
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

    public String getVencimento2() {
        return vencimento2;
    }

    public void setVencimento2(String vencimento2) {
        this.vencimento2 = vencimento2;
    }

    public String getValordaprest2() {
        return valordaprest2;
    }

    public void setValordaprest2(String valordaprest2) {
        this.valordaprest2 = valordaprest2;
    }

    public String getDatadepgto2() {
        return datadepgto2;
    }

    public void setDatadepgto2(String datadepgto2) {
        this.datadepgto2 = datadepgto2;
    }

    public String getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(String saldo2) {
        this.saldo2 = saldo2;
    }
    
    
}
