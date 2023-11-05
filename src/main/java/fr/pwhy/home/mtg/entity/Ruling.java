package fr.pwhy.home.mtg.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Ruling {

    // Must parse from String
    private Date date;
    private String text;
}
