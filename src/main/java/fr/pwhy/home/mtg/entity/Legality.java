package fr.pwhy.home.mtg.entity;

import lombok.Data;

@Data
public class Legality {

    private String format;
    /*
    Commander
    Duel
    Explorer
    Gladiator
    Historic
    Historicbrawl
    Legacy
    Pioneer
    Modern
    Oathbreaker
    Pauper
    Paupercommander
    Penny
    Predh
    Premodern
    Vintage
     */
    private String legality;
    /*
    Legal
    Banned
    Restricted
    */

    /// CONSTRUCTORS ///
}
