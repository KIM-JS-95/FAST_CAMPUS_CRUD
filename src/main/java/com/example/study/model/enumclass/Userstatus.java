package com.example.study.model.enumclass;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Userstatus {

    REGISTERED(0, "register","register user"),
    UNREGISTERED(1, "unregister", "Non-register user")
    ;

    private Integer id;
    private String title;
    private String description;
}
