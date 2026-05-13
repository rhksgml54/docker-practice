package com.codeit.dockerpractice.cotroller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> create(@Valid @RequestBody MessageCreateReqeust req) {
        MessageResponse saved = messageService.create(req);
        return ResponseEntity.created(URI.create("/message/" + saved.getId())).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<MessageResponse>> findAll() {
        return ResponseEntity.ok(messageService.findAll());
    }
}
