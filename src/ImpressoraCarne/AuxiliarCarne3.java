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
public class AuxiliarCarne3 {
    private String nomeres;
     private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento3;
    private String valordaprest3;
    private String datadepgto3;
    private String saldo3;

    public AuxiliarCarne3() {
    }

    public AuxiliarCarne3(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento3, String valordaprest3, String datadepgto3, String saldo3) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento3 = vencimento3;
        this.valordaprest3 = valordaprest3;
        this.datadepgto3 = datadepgto3;
        this.saldo3 = saldo3;
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

    public String getVencimento3() {
        return vencimento3;
    }

    public void setVencimento3(String vencimento3) {
        this.vencimento3 = vencimento3;
    }

    public String getValordaprest3() {
        return valordaprest3;
    }

    public void setValordaprest3(String valordaprest3) {
        this.valordaprest3 = valordaprest3;
    }

    public String getDatadepgto3() {
        return datadepgto3;
    }

    public void setDatadepgto3(String datadepgto3) {
        this.datadepgto3 = datadepgto3;
    }

    public String getSaldo3() {
        return saldo3;
    }

    public void setSaldo3(String saldo3) {
        this.saldo3 = saldo3;
    }
    
    
}
