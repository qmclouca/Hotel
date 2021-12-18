/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.rlbpc.reservasdehotel.HotelModerno;


/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Calendar DiaEntrada;
    int idReserva;
    int diaEntrada;
    String mesEntrada;
    int anoEntrada;
    int horaEntrada;
    int minutoEntrada;
    int diaSaida;
    String mesSaida;
    int anoSaida;
    int horaSaida;
    int minutoSaida;
    String nomeHospedePrincipal;
    int idadeHospedePrincipal;
    String nomeHospedeAdicional1;
    int idadeHospedeAdicional1;
    String nomeHospedeAdicional2;
    int idadeHospedeAdicional2;
    String nomeHospedeAdicional3;
    int idadeHospedeAdicional3;
    String nomeHospedeAdicional4;
    int idadeHospedeAdicional4;
    String nomeHospedeAdicional5;
    int idadeHospedeAdicional5;
    String nomeHospedeAdicional6;
    int idadeHospedeAdicional6;
    String nomeHospedeAdicional7;
    int idadeHospedeAdicional7;
    String nomeHospedeAdicional8;
    int idadeHospedeAdicional8;
    String nomeHospedeAdicional9;
    int idadeHospedeAdicional9;
    String nomeHospedeAdicional10;
    int idadeHospedeAdicional10;
    String formaPagamento;
    String apartamento;
    float valorDiaria;
    float valorTotal;    
    
    public Reserva(){
    }
   
    public Reserva(int idReserva, int diaEntrada, String mesEntrada, int anoEntrada, int horaEntrada, int minutoEntrada, int diaSaida, String mesSaida, int anoSaida, int horaSaida, int minutoSaida, String nomeHospedePrincipal, int idadeHospedePrincipal, String nomeHospedeAdicional1, int idadeHospedeAdicional1, String nomeHospedeAdicional2, int idadeHospedeAdicional2, String nomeHospedeAdicional3, int idadeHospedeAdicional3, String nomeHospedeAdicional4, int idadeHospedeAdicional4, String nomeHospedeAdicional5, int idadeHospedeAdicional5, String nomeHospedeAdicional6, int idadeHospedeAdicional6, String nomeHospedeAdicional7, int idadeHospedeAdicional7, String nomeHospedeAdicional8, int idadeHospedeAdicional8, String nomeHospedeAdicional9, int idadeHospedeAdicional9, String nomeHospedeAdicional10, int idadeHospedeAdicional10, String formaPagamento, String apartamento, float valorDiaria, float valorTotal) {
        this.idReserva = idReserva;
        this.diaEntrada = diaEntrada;
        this.mesEntrada = mesEntrada;
        this.anoEntrada = anoEntrada;
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
        this.diaSaida = diaSaida;
        this.mesSaida = mesSaida;
        this.anoSaida = anoSaida;
        this.horaSaida = horaSaida;
        this.minutoSaida = minutoSaida;
        this.nomeHospedePrincipal = nomeHospedePrincipal;
        this.idadeHospedePrincipal = idadeHospedePrincipal;
        this.nomeHospedeAdicional1 = nomeHospedeAdicional1;
        this.idadeHospedeAdicional1 = idadeHospedeAdicional1;
        this.nomeHospedeAdicional2 = nomeHospedeAdicional2;
        this.idadeHospedeAdicional2 = idadeHospedeAdicional2;
        this.nomeHospedeAdicional3 = nomeHospedeAdicional3;
        this.idadeHospedeAdicional3 = idadeHospedeAdicional3;
        this.nomeHospedeAdicional4 = nomeHospedeAdicional4;
        this.idadeHospedeAdicional4 = idadeHospedeAdicional4;
        this.nomeHospedeAdicional5 = nomeHospedeAdicional5;
        this.idadeHospedeAdicional5 = idadeHospedeAdicional5;
        this.nomeHospedeAdicional6 = nomeHospedeAdicional6;
        this.idadeHospedeAdicional6 = idadeHospedeAdicional6;
        this.nomeHospedeAdicional7 = nomeHospedeAdicional7;
        this.idadeHospedeAdicional7 = idadeHospedeAdicional7;
        this.nomeHospedeAdicional8 = nomeHospedeAdicional8;
        this.idadeHospedeAdicional8 = idadeHospedeAdicional8;
        this.nomeHospedeAdicional9 = nomeHospedeAdicional9;
        this.idadeHospedeAdicional9 = idadeHospedeAdicional9;
        this.nomeHospedeAdicional10 = nomeHospedeAdicional10;
        this.idadeHospedeAdicional10 = idadeHospedeAdicional10;
        this.formaPagamento = formaPagamento;
        this.apartamento = apartamento;
        this.valorDiaria = valorDiaria;
        this.valorTotal = valorTotal;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(int diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public String getMesEntrada() {
        return mesEntrada;
    }

    public void setMesEntrada(String mesEntrada) {
        this.mesEntrada = mesEntrada;
    }

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public int getDiaSaida() {
        return diaSaida;
    }

    public void setDiaSaida(int diaSaida) {
        this.diaSaida = diaSaida;
    }

    public String getMesSaida() {
        return mesSaida;
    }

    public void setMesSaida(String mesSaida) {
        this.mesSaida = mesSaida;
    }

    public int getAnoSaida() {
        return anoSaida;
    }

    public void setAnoSaida(int anoSaida) {
        this.anoSaida = anoSaida;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getMinutoSaida() {
        return minutoSaida;
    }

    public void setMinutoSaida(int minutoSaida) {
        this.minutoSaida = minutoSaida;
    }

    public String getNomeHospedePrincipal() {
        return nomeHospedePrincipal;
    }

    public void setNomeHospedePrincipal(String nomeHospedePrincipal) {
        this.nomeHospedePrincipal = nomeHospedePrincipal;
    }

    public int getIdadeHospedePrincipal() {
        return idadeHospedePrincipal;
    }

    public void setIdadeHospedePrincipal(int idadeHospedePrincipal) {
        this.idadeHospedePrincipal = idadeHospedePrincipal;
    }

    public String getNomeHospedeAdicional1() {
        return nomeHospedeAdicional1;
    }

    public void setNomeHospedeAdicional1(String nomeHospedeAdicional1) {
        this.nomeHospedeAdicional1 = nomeHospedeAdicional1;
    }

    public int getIdadeHospedeAdicional1() {
        return idadeHospedeAdicional1;
    }

    public void setIdadeHospedeAdicional1(int idadeHospedeAdicional1) {
        this.idadeHospedeAdicional1 = idadeHospedeAdicional1;
    }

    public String getNomeHospedeAdicional2() {
        return nomeHospedeAdicional2;
    }

    public void setNomeHospedeAdicional2(String nomeHospedeAdicional2) {
        this.nomeHospedeAdicional2 = nomeHospedeAdicional2;
    }

    public int getIdadeHospedeAdicional2() {
        return idadeHospedeAdicional2;
    }

    public void setIdadeHospedeAdicional2(int idadeHospedeAdicional2) {
        this.idadeHospedeAdicional2 = idadeHospedeAdicional2;
    }

    public String getNomeHospedeAdicional3() {
        return nomeHospedeAdicional3;
    }

    public void setNomeHospedeAdicional3(String nomeHospedeAdicional3) {
        this.nomeHospedeAdicional3 = nomeHospedeAdicional3;
    }

    public int getIdadeHospedeAdicional3() {
        return idadeHospedeAdicional3;
    }

    public void setIdadeHospedeAdicional3(int idadeHospedeAdicional3) {
        this.idadeHospedeAdicional3 = idadeHospedeAdicional3;
    }

    public String getNomeHospedeAdicional4() {
        return nomeHospedeAdicional4;
    }

    public void setNomeHospedeAdicional4(String nomeHospedeAdicional4) {
        this.nomeHospedeAdicional4 = nomeHospedeAdicional4;
    }

    public int getIdadeHospedeAdicional4() {
        return idadeHospedeAdicional4;
    }

    public void setIdadeHospedeAdicional4(int idadeHospedeAdicional4) {
        this.idadeHospedeAdicional4 = idadeHospedeAdicional4;
    }

    public String getNomeHospedeAdicional5() {
        return nomeHospedeAdicional5;
    }

    public void setNomeHospedeAdicional5(String nomeHospedeAdicional5) {
        this.nomeHospedeAdicional5 = nomeHospedeAdicional5;
    }

    public int getIdadeHospedeAdicional5() {
        return idadeHospedeAdicional5;
    }

    public void setIdadeHospedeAdicional5(int idadeHospedeAdicional5) {
        this.idadeHospedeAdicional5 = idadeHospedeAdicional5;
    }

    public String getNomeHospedeAdicional6() {
        return nomeHospedeAdicional6;
    }

    public void setNomeHospedeAdicional6(String nomeHospedeAdicional6) {
        this.nomeHospedeAdicional6 = nomeHospedeAdicional6;
    }

    public int getIdadeHospedeAdicional6() {
        return idadeHospedeAdicional6;
    }

    public void setIdadeHospedeAdicional6(int idadeHospedeAdicional6) {
        this.idadeHospedeAdicional6 = idadeHospedeAdicional6;
    }

    public String getNomeHospedeAdicional7() {
        return nomeHospedeAdicional7;
    }

    public void setNomeHospedeAdicional7(String nomeHospedeAdicional7) {
        this.nomeHospedeAdicional7 = nomeHospedeAdicional7;
    }

    public int getIdadeHospedeAdicional7() {
        return idadeHospedeAdicional7;
    }

    public void setIdadeHospedeAdicional7(int idadeHospedeAdicional7) {
        this.idadeHospedeAdicional7 = idadeHospedeAdicional7;
    }

    public String getNomeHospedeAdicional8() {
        return nomeHospedeAdicional8;
    }

    public void setNomeHospedeAdicional8(String nomeHospedeAdicional8) {
        this.nomeHospedeAdicional8 = nomeHospedeAdicional8;
    }

    public int getIdadeHospedeAdicional8() {
        return idadeHospedeAdicional8;
    }

    public void setIdadeHospedeAdicional8(int idadeHospedeAdicional8) {
        this.idadeHospedeAdicional8 = idadeHospedeAdicional8;
    }

    public String getNomeHospedeAdicional9() {
        return nomeHospedeAdicional9;
    }

    public void setNomeHospedeAdicional9(String nomeHospedeAdicional9) {
        this.nomeHospedeAdicional9 = nomeHospedeAdicional9;
    }

    public int getIdadeHospedeAdicional9() {
        return idadeHospedeAdicional9;
    }

    public void setIdadeHospedeAdicional9(int idadeHospedeAdicional9) {
        this.idadeHospedeAdicional9 = idadeHospedeAdicional9;
    }

    public String getNomeHospedeAdicional10() {
        return nomeHospedeAdicional10;
    }

    public void setNomeHospedeAdicional10(String nomeHospedeAdicional10) {
        this.nomeHospedeAdicional10 = nomeHospedeAdicional10;
    }

    public int getIdadeHospedeAdicional10() {
        return idadeHospedeAdicional10;
    }

    public void setIdadeHospedeAdicional10(int idadeHospedeAdicional10) {
        this.idadeHospedeAdicional10 = idadeHospedeAdicional10;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idReserva;
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
        if (this.idReserva != other.idReserva) {
            return false;
        }
        return true;
    }
    
    
}
