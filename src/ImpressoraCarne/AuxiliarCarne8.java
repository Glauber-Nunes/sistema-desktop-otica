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
public class AuxiliarCarne8 {
    private String nomeres;
     private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento8;
    private String valordaprest8;
    private String datadepgto8;
    private String saldo8;

    public AuxiliarCarne8() {
    }

    public AuxiliarCarne8(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento8, String valordaprest8, String datadepgto8, String saldo8) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento8 = vencimento8;
        this.valordaprest8 = valordaprest8;
        this.datadepgto8 = datadepgto8;
        this.saldo8 = saldo8;
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

    public String getVencimento8() {
        return vencimento8;
    }

    public void setVencimento8(String vencimento8) {
        this.vencimento8 = vencimento8;
    }

    public String getValordaprest8() {
        return valordaprest8;
    }

    public void setValordaprest8(String valordaprest8) {
        this.valordaprest8 = valordaprest8;
    }

    public String getDatadepgto8() {
        return datadepgto8;
    }

    public void setDatadepgto8(String datadepgto8) {
        this.datadepgto8 = datadepgto8;
    }

    public String getSaldo8() {
        return saldo8;
    }

    public void setSaldo8(String saldo8) {
        this.saldo8 = saldo8;
    }
    
    
}
