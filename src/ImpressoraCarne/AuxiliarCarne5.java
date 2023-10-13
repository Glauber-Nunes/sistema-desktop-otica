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
public class AuxiliarCarne5 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento5;
    private String valordaprest5;
    private String datadepgto5;
    private String saldo5;

    public AuxiliarCarne5() {
    }

    public AuxiliarCarne5(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento5, String valordaprest5, String datadepgto5, String saldo5) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento5 = vencimento5;
        this.valordaprest5 = valordaprest5;
        this.datadepgto5 = datadepgto5;
        this.saldo5 = saldo5;
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

    public String getVencimento5() {
        return vencimento5;
    }

    public void setVencimento5(String vencimento5) {
        this.vencimento5 = vencimento5;
    }

    public String getValordaprest5() {
        return valordaprest5;
    }

    public void setValordaprest5(String valordaprest5) {
        this.valordaprest5 = valordaprest5;
    }

    public String getDatadepgto5() {
        return datadepgto5;
    }

    public void setDatadepgto5(String datadepgto5) {
        this.datadepgto5 = datadepgto5;
    }

    public String getSaldo5() {
        return saldo5;
    }

    public void setSaldo5(String saldo5) {
        this.saldo5 = saldo5;
    }
    
    
}
