package com.example.it_support.Service;

import com.example.it_support.Model.TicketModel;

import java.util.List;

public interface TicketService {

    TicketModel CreateTicket(TicketModel ticketModel);
    List<TicketModel> getAllTicket();
    TicketModel AssignerTicket(Long id, TicketModel ticketModel);
}
