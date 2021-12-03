/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.instances;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Rodolfo Bortoluzzi
 */
@Entity
public class Apartamento extends Agenda implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id    
    Integer idApartamento;
    Integer numeroApartamento;
    String tipoApartamento;
    String statusApartamento;
    Agenda agendaApartamento;
    Float valorDiaria;

    public Apartamento(){
        
    }
    public Apartamento(Integer idApartamento, Integer numeroApartamento, String tipoApartamento, String statusApartamento, Agenda agendaApartamento, Float valorDiaria) {
        this.idApartamento = idApartamento;
        this.numeroApartamento = numeroApartamento;
        this.tipoApartamento = tipoApartamento;
        this.statusApartamento = statusApartamento;
        this.agendaApartamento = agendaApartamento;
        this.valorDiaria = valorDiaria;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idApartamento);
        hash = 41 * hash + Objects.hashCode(this.numeroApartamento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apartamento other = (Apartamento) obj;
        if (!Objects.equals(this.idApartamento, other.idApartamento)) {
            return false;
        }
        if (!Objects.equals(this.numeroApartamento, other.numeroApartamento)) {
            return false;
        }
        return true;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Integer getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(Integer numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public String getStatusApartamento() {
        return statusApartamento;
    }

    public void setStatusApartamento(String statusApartamento) {
        this.statusApartamento = statusApartamento;
    }

    public Agenda getAgendaApartamento() {
        return agendaApartamento;
    }

    public void setAgendaApartamento(Agenda agendaApartamento) {
        this.agendaApartamento = agendaApartamento;
    }

    public Float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
