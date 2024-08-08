package com.example.it_support.Service;

import com.example.it_support.DTO.TicketDTO;
import com.example.it_support.Model.PersonneModel;
import com.example.it_support.Model.TicketModel;
import com.example.it_support.Model.UtilisateurModel;

import java.util.List;

public interface TicketService {

    TicketModel CreateTicket(TicketModel ticketModel);
    TicketModel CreateTicketT(UtilisateurModel utilisateurModel, TicketDTO ticketDTO);
    List<TicketModel> getAllTicket();
    TicketModel AssignerTicket(Long id, TicketModel ticketModel);
}
