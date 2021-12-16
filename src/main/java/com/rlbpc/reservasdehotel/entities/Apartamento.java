package com.rlbpc.reservasdehotel.entities;
import java.io.Serializable;
import java.util.Objects;
/**
 * @author Rodolfo Bortoluzzi
 */
public class Apartamento extends Agenda implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idApartamento;
    String numeroApartamento;
    String tipoApartamento;
    String capacidadeApartamento;
    String statusApartamento;
    Agenda agendaApartamento;
    String valorDiaria;
    String descricaoApartamento;

    public Apartamento(){
        
    }
    public Apartamento(Integer idApartamento,
            String numeroApartamento,
            String tipoApartamento,
            String capacidadeApartamento,
            String statusApartamento,
            Agenda agendaApartamento,
            String valorDiaria,
            String descricaoApartamento) {
        this.idApartamento = idApartamento;
        this.numeroApartamento = numeroApartamento;
        this.tipoApartamento = tipoApartamento;
        this.capacidadeApartamento = capacidadeApartamento;
        this.statusApartamento = statusApartamento;
        this.agendaApartamento = agendaApartamento;
        this.valorDiaria = valorDiaria;
        this.descricaoApartamento = descricaoApartamento;
    }

    @Override
    public String toString() {
        return "Apartamento{" 
                + "idApartamento=" + idApartamento 
                + ", numeroApartamento=" + numeroApartamento 
                + ", tipoApartamento=" + tipoApartamento 
                + ", capacidadeApartamento=" + capacidadeApartamento 
                + ", statusApartamento=" + statusApartamento 
                + ", agendaApartamento=" + agendaApartamento 
                + ", valorDiaria=" + valorDiaria 
                + ", descricaoApartamento=" + descricaoApartamento 
                + '}';
    }

    public String getDescricaoApartamento() {
        return descricaoApartamento;
    }

    public void setDescricaoApartamento(String descricaoApartamento) {
        this.descricaoApartamento = descricaoApartamento;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public String getCapacidadeApartamento() {
        return capacidadeApartamento;
    }

    public void setCapacidadeApartamento(String capacidadeApartamento) {
        this.capacidadeApartamento = capacidadeApartamento;
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

    public String getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(String numeroApartamento) {
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

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
