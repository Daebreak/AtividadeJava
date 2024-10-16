/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Daebr
 */
public class tarefas {

    public tarefas() {
    }
    
    public tarefas(String decricao, Date vencimento, int estado) {
        this.decricao = decricao;
        this.vencimento = vencimento;
        this.estado = estado;
    }
    
    
    public tarefas(int tarefa_id, String decricao, Date vencimento, int estado) {
        this.tarefa_id = tarefa_id;
        this.decricao = decricao;
        this.vencimento = vencimento;
        this.estado = estado;
    }
    
    private int tarefa_id;
    private String decricao;
    private Date vencimento;
    private int estado;

    public int getTarefa_id() {
        return tarefa_id;
    }

    public void setTarefa_id(int tarefa_id) {
        this.tarefa_id = tarefa_id;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
