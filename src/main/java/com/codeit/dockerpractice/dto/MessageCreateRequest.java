package com.codeit.dockerpractice.dto;


import jakarta.validation.constraints.NotBlank;

public class MessageCreateRequest {

    @NotBlank
    private String content;

    public String getContent() {
        return content;
    }
}
