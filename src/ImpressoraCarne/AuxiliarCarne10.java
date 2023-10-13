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
public class AuxiliarCarne10 {
    private String nomeres;
     private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento10;
    private String valordaprest10;
    private String datadepgto10;
    private String saldo10;

    public AuxiliarCarne10() {
    }

    public AuxiliarCarne10(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento10, String valordaprest10, String datadepgto10, String saldo10) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento10 = vencimento10;
        this.valordaprest10 = valordaprest10;
        this.datadepgto10 = datadepgto10;
        this.saldo10 = saldo10;
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

    public String getVencimento10() {
        return vencimento10;
    }

    public void setVencimento10(String vencimento10) {
        this.vencimento10 = vencimento10;
    }

    public String getValordaprest10() {
        return valordaprest10;
    }

    public void setValordaprest10(String valordaprest10) {
        this.valordaprest10 = valordaprest10;
    }

    public String getDatadepgto10() {
        return datadepgto10;
    }

    public void setDatadepgto10(String datadepgto10) {
        this.datadepgto10 = datadepgto10;
    }

    public String getSaldo10() {
        return saldo10;
    }

    public void setSaldo10(String saldo10) {
        this.saldo10 = saldo10;
    }
    
    
}
