package fr.pwhy.home.mtg.service;

import fr.pwhy.home.mtg.entity.dto.CardDto;

import java.util.List;

public interface CardSearchService {

    /**
     * Fetch a card on MTG API with its name
     * @param cardName Name of the card, partial or exact
     * @return A list of CardDto to be displayed (contains card id)
     */
    List<CardDto> fetchCardsOnMtgApi(String cardName);
}
