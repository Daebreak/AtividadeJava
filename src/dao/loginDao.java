/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Daebr
 */
public class loginDao {
    private ConexaoBanco conexao;
    
    public loginDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public boolean BuscaUsuario(String nome, String senha){
        String sql = "SELECT * FROM login WHERE nome = ? AND senha = ?";
        
        try{
            if(this.conexao.conectar()){
            
            PreparedStatement query = this.conexao.getConnection().prepareStatement(sql);

            query.setString(1, nome);
            query.setString(2, senha);
            
            ResultSet resultado = query.executeQuery();
            
            
            if(resultado.next()){
                return true;
            }
             this.conexao.getConnection().close();
        }
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }   
        
        return false;
    }
    
    public void InserirUsuario(String nome, String email, String senha){
    String sql = "INSERT INTO login(nome, email, senha) VALUES (?,?,?)";

    try{
        if(this.conexao.conectar()){
            PreparedStatement query = this.conexao.getConnection().prepareStatement(sql);

            query.setString(1, nome);
            query.setString(2, email);
            query.setString(3, senha);

            query.executeUpdate();
        }
        this.conexao.getConnection().close();
    } catch(SQLException ex){
        throw new RuntimeException(ex);
    }
    }
}
