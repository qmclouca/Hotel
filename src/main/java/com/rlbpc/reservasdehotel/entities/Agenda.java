/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
@Entity        
class Agenda implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    Integer idAgenda;
    Integer idApartamento;
    List<Date> datasAgendadas;
}
