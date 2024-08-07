package com.example.it_support.Controller;


import com.example.it_support.Model.TicketModel;
import com.example.it_support.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/ShowAllTicket")
    public List<TicketModel> getAllTicket(){
        return  ticketService.getAllTicket();
    }

    @PutMapping("/Assigner/{id}")
    public TicketModel AssignerTicket(@PathVariable Long id , @RequestBody TicketModel ticketModel){
        return ticketService.AssignerTicket(id, ticketModel);
    }
}
