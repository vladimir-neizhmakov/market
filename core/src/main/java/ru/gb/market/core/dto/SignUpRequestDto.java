package ru.gb.market.core.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {

    private String login;

    private String password;
}