/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.carOS.obj;

/**
 *
 * @author nilton
 */
public class Mecanico extends Pessoa {
    
    private float comissao;

    public Mecanico() {
    }

    public Mecanico(float comissao, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.comissao = comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }
    
    
    
}
