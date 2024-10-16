/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daebr
 */
public class produtos {

    public produtos() {
    }

    
    public produtos(String descricao, float preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public produtos(int produto_id, String descricao, float preco, int quantidade) {
        this.produto_id = produto_id;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    private int produto_id;
    private String descricao;
    private float preco;
    private int quantidade;
    
    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
