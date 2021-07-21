package com.dreamshop.controller;

import com.dreamshop.bean.Message;
import com.dreamshop.servicer.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    MessageService messageService;

    @CrossOrigin(origins = {"http://www.atomlavie.com","http://www.atomlavie.com/contact","http://localhost:3000"})
    @GetMapping("/messages")
    public List<Message> messages() {
        return messageService.getAllMsg();
    }

    @CrossOrigin(origins = {"http://www.atomlavie.com","http://www.atomlavie.com/contact","http://localhost:3000"})
    @PostMapping("/addmsg")
    public String addMsg(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("msg") String msg) {
        Message message = new Message(name, email, msg);
        messageService.addMsg(message);
        return name;
    }

    // @PostMapping("/addmsg")
    // public String addMsg(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("msg") String msg) {
    //     Message message = new Message(101,name, email, msg);
    //     messageService.addMsg(message);
    //     return name;
    // }

    @CrossOrigin(origins = {"http://www.atomlavie.com","http://www.atomlavie.com/contact","http://localhost:3000"})
    @DeleteMapping("/delMsg/{id}")
    public String deleteMsg(@PathVariable("id") Integer id){
        messageService.deleteMsg(id);
        return "Delete done.";
    }


}
