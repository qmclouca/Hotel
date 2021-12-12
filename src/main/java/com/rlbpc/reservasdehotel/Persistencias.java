/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Persistencias{
    public Path arqHospedes = Paths.get("Persistencias/hospedes.txt");
    public Path arqFuncionarios = Paths.get("Persistencias/funcionarios.txt");
    public Path arqApartamentos = Paths.get("Persistencias/apartamentos.txt");
    public Path arqEnderecos = Paths.get("Persistencias/enderecos.txt");
    public Path arqAgendas = Paths.get("Persistencias/agendas.txt");
    public Path arqReservas = Paths.get("Persistencias/reservas.txt");

    public Persistencias() {
    }

    public Path getArqHospedes() {
        return arqHospedes;
    }

    public Path getArqFuncionarios() {
        return arqFuncionarios;
    }

    public Path getArqApartamentos() {
        return arqApartamentos;
    }

    public Path getArqEnderecos() {
        return arqEnderecos;
    }

    public Path getArqAgendas() {
        return arqAgendas;
    }

    public Path getArqReservas() {
        return arqReservas;
    }
}
