package com.example.it_support.Service;


import com.example.it_support.Model.Panne;
import com.example.it_support.Model.TicketModel;
import com.example.it_support.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public TicketModel CreateTicket(TicketModel ticketModel){
        ticketModel.setDateCreation(ticketModel.getDateCreation());
        return ticketRepository.save(ticketModel);
    }

    @Override
    public List<TicketModel> getAllTicket(){
        return  ticketRepository.findAll();
    }

    @Override
    public TicketModel AssignerTicket(Long id, TicketModel ticketModel){
        ticketRepository.findById(id);

        TicketModel AssignerTicket = new TicketModel();
        AssignerTicket.setTechnicienModels(ticketModel.getTechnicienModels());

        return ticketRepository.save(AssignerTicket);
    }


}
