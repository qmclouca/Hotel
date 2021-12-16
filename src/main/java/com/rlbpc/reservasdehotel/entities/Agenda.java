package com.rlbpc.reservasdehotel.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Rodolfo Bortoluzzi
 */        
class Agenda implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idAgenda;
    Integer idApartamento;
    List<Date> datasAgendadas;
}
