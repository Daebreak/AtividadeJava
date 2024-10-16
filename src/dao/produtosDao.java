/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.produtos;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daebr
 */
public class produtosDao {
    
    private ConexaoBanco conexao;
    
    public produtosDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public void AtualizarProduto(int produto_id, String desc, float preco, int quantidade){
        String sql = "UPDATE produtos SET descricao = ?, preco = ?, quantidade = ? WHERE produto_id = ?";
        
        try{
            if(this.conexao.conectar()){
                PreparedStatement query = this.conexao.getConnection().prepareStatement(sql);
                
                query.setString(1, desc);
                query.setFloat(2, preco);
                query.setInt(3, quantidade);
                query.setInt(4, produto_id);
                
                query.executeUpdate();
            }
            this.conexao.getConnection().close();
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public void InserirProduto(String desc, float preco, int quantidade){
        String sql = "INSERT INTO produtos(descricao, preco, quantidade) VALUES (?,?,?)";
        
        try{
            if(this.conexao.conectar()){
                PreparedStatement query = this.conexao.getConnection().prepareStatement(sql);
                
                query.setString(1, desc);
                query.setFloat(2, preco);
                query.setInt(3, quantidade);
                
                query.executeUpdate();
            }
            this.conexao.getConnection().close();
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public void DeletaProduto(int produto_id){
        String sql = "DELETE FROM produtos WHERE produto_id = ?";
        
        try{
            if(this.conexao.conectar()){
                PreparedStatement query = this.conexao.getConnection().prepareStatement(sql);
            
                query.setInt(1, produto_id);
            
                query.executeUpdate();           
            }
            
            
            this.conexao.getConnection().close();

        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        
        
        
        
    }
    
    public ArrayList<produtos> ListaProdutos(){
        ArrayList<produtos> produtoArray = new ArrayList<>();
        
        String sql = "SELECT * FROM produtos";
                
        try{
            if(this.conexao.conectar()){
                PreparedStatement busca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet resultado = busca.executeQuery();
                
                while(resultado.next()){
                    produtos novoProduto = new produtos();
                    
                    novoProduto.setProduto_id(resultado.getInt("produto_id"));
                    novoProduto.setDescricao(resultado.getString("descricao"));
                    novoProduto.setPreco(resultado.getFloat("preco"));
                    novoProduto.setQuantidade(resultado.getInt("quantidade"));
                    
                    produtoArray.add(novoProduto);
                }
                resultado.close();
                this.conexao.getConnection().close();
            }
            
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }       
        
        return produtoArray;
    }
}
