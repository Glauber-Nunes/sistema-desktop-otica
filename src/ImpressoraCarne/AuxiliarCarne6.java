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
public class AuxiliarCarne6 {
    private String nomeres;
    private int codigo;
    private String nome;
    private String endereço;
    private String cpf;
    private String valor;
    private String vencimento6;
    private String valordaprest6;
    private String datadepgto6;
    private String saldo6;

    public AuxiliarCarne6() {
    }

    public AuxiliarCarne6(String nomeres,int codigo, String nome, String endereço, String cpf, String valor, String vencimento6, String valordaprest6, String datadepgto6, String saldo6) {
        this.nomeres=nomeres;
        this.codigo = codigo;
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.valor = valor;
        this.vencimento6 = vencimento6;
        this.valordaprest6 = valordaprest6;
        this.datadepgto6 = datadepgto6;
        this.saldo6 = saldo6;
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

    public String getVencimento6() {
        return vencimento6;
    }

    public void setVencimento6(String vencimento6) {
        this.vencimento6 = vencimento6;
    }

    public String getValordaprest6() {
        return valordaprest6;
    }

    public void setValordaprest6(String valordaprest6) {
        this.valordaprest6 = valordaprest6;
    }

    public String getDatadepgto6() {
        return datadepgto6;
    }

    public void setDatadepgto6(String datadepgto6) {
        this.datadepgto6 = datadepgto6;
    }

    public String getSaldo6() {
        return saldo6;
    }

    public void setSaldo6(String saldo6) {
        this.saldo6 = saldo6;
    }
    
    
}
