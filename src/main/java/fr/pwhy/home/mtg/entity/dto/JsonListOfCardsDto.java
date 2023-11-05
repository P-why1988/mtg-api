package fr.pwhy.home.mtg.entity.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to parse the JSON object that is returned by MTG API
 */
public class JsonListOfCardsDto {
    /** The actual list of cards */
    private List<CardDto> cards = new ArrayList<>();

    /// CONSTRUCTORS ///
    public JsonListOfCardsDto() {
    }

    /// GETTERS ///

    /** Return the list of CardDto objects with their legality map generated */
    public List<CardDto> getCards() {
        for (CardDto cardDto : cards) {
            cardDto.generateLegalityMap();
        }
        return cards;
    }
}
