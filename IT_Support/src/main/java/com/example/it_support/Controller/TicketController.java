package com.example.it_support.Controller;


import com.example.it_support.DTO.TicketDTO;
import com.example.it_support.Model.PersonneModel;
import com.example.it_support.Model.TicketModel;
import com.example.it_support.Model.UtilisateurModel;
import com.example.it_support.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/Admin")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/CreateTicket")
    public TicketModel CreateTicket(@RequestBody TicketModel ticketModel){
        return ticketService.CreateTicket(ticketModel);
    }

    @PostMapping("/CreateTicketT")
    public TicketModel CreateTicketT(@RequestBody TicketDTO ticketModel){
        return ticketService.CreateTicketT(ticketModel);
    }

    @GetMapping("/ShowAllTicket")
    public List<TicketModel> getAllTicket(){
        return  ticketService.getAllTicket();
    }

    @PutMapping("/Assigner/{id}")
    public TicketModel AssignerTicket(@PathVariable Long id , @RequestBody TicketModel ticketModel){
        return ticketService.AssignerTicket(id, ticketModel);
    }
}
