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
public class AuxiliarCarne1 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento1;
    private String valordaprest1;
    private String datadepgto1;
    private String saldo1;

    public AuxiliarCarne1() {
    }

    public AuxiliarCarne1(String nomeres ,int codigo, String nome, String endereço, String cpf, String valor, String vencimento1, String valordaprest1, String datadepgto1, String saldo1) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento1 = vencimento1;
        this.valordaprest1 = valordaprest1;
        this.datadepgto1 = datadepgto1;
        this.saldo1 = saldo1;
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

    public String getVencimento1() {
        return vencimento1;
    }

    public void setVencimento1(String vencimento1) {
        this.vencimento1 = vencimento1;
    }

    public String getValordaprest1() {
        return valordaprest1;
    }

    public void setValordaprest1(String valordaprest1) {
        this.valordaprest1 = valordaprest1;
    }

    public String getDatadepgto1() {
        return datadepgto1;
    }

    public void setDatadepgto1(String datadepgto1) {
        this.datadepgto1 = datadepgto1;
    }

    public String getSaldo1() {
        return saldo1;
    }

    public void setSaldo1(String saldo1) {
        this.saldo1 = saldo1;
    }
    
    
}
