/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
@Entity
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    Integer idReserva;
    Date dataEntrada;
    Date dataSaida;
    Integer statusReserva;
    Integer idHospede;
    Integer idApartamento;
    Integer qteHospedes;

    public Reserva(){
        
    }
    public Reserva(Integer idReserva, Date dataEntrada, Date dataSaida, Integer statusReserva, Integer idHospede, Integer idApartamento, Integer qteHospedes) {
        this.idReserva = idReserva;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.statusReserva = statusReserva;
        this.idHospede = idHospede;
        this.idApartamento = idApartamento;
        this.qteHospedes = qteHospedes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idReserva);
        hash = 53 * hash + Objects.hashCode(this.idHospede);
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
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.idReserva, other.idReserva)) {
            return false;
        }
        if (!Objects.equals(this.idHospede, other.idHospede)) {
            return false;
        }
        return true;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(Integer statusReserva) {
        this.statusReserva = statusReserva;
    }

    public Integer getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(Integer idHospede) {
        this.idHospede = idHospede;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Integer getQteHospedes() {
        return qteHospedes;
    }

    public void setQteHospedes(Integer qteHospedes) {
        this.qteHospedes = qteHospedes;
    }
    
    
}
