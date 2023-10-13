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
public class AuxiliarCarne7 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento7;
    private String valordaprest7;
    private String datadepgto7;
    private String saldo7;

    public AuxiliarCarne7() {
    }

    public AuxiliarCarne7(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento7, String valordaprest7, String datadepgto7, String saldo7) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento7 = vencimento7;
        this.valordaprest7 = valordaprest7;
        this.datadepgto7 = datadepgto7;
        this.saldo7 = saldo7;
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

    public String getVencimento7() {
        return vencimento7;
    }

    public void setVencimento7(String vencimento7) {
        this.vencimento7 = vencimento7;
    }

    public String getValordaprest7() {
        return valordaprest7;
    }

    public void setValordaprest7(String valordaprest7) {
        this.valordaprest7 = valordaprest7;
    }

    public String getDatadepgto7() {
        return datadepgto7;
    }

    public void setDatadepgto7(String datadepgto7) {
        this.datadepgto7 = datadepgto7;
    }

    public String getSaldo7() {
        return saldo7;
    }

    public void setSaldo7(String saldo7) {
        this.saldo7 = saldo7;
    }
    
    
    
}
