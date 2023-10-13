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
public class AuxiliarCarne9 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento9;
    private String valordaprest9;
    private String datadepgto9;
    private String saldo9;

    public AuxiliarCarne9() {
    }

    public AuxiliarCarne9(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento9, String valordaprest9, String datadepgto9, String saldo9) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento9 = vencimento9;
        this.valordaprest9 = valordaprest9;
        this.datadepgto9 = datadepgto9;
        this.saldo9 = saldo9;
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

    public String getVencimento9() {
        return vencimento9;
    }

    public void setVencimento9(String vencimento9) {
        this.vencimento9 = vencimento9;
    }

    public String getValordaprest9() {
        return valordaprest9;
    }

    public void setValordaprest9(String valordaprest9) {
        this.valordaprest9 = valordaprest9;
    }

    public String getDatadepgto9() {
        return datadepgto9;
    }

    public void setDatadepgto9(String datadepgto9) {
        this.datadepgto9 = datadepgto9;
    }

    public String getSaldo9() {
        return saldo9;
    }

    public void setSaldo9(String saldo9) {
        this.saldo9 = saldo9;
    }
    
    
}
