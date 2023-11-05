package fr.pwhy.home.mtg.entity;

import lombok.Data;

@Data
public class ForeignName {

    private String name;
    private String text;
    private String type;
    private String flavor;
    private String imageUrl;
    private String language;
    private int multiverseid;
}
