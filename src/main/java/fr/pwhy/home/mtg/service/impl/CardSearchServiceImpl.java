package fr.pwhy.home.mtg.service.impl;

import fr.pwhy.home.mtg.entity.dto.CardDto;
import fr.pwhy.home.mtg.entity.dto.JsonListOfCardsDto;
import fr.pwhy.home.mtg.service.CardSearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CardSearchServiceImpl implements CardSearchService {

    private static final Logger log = LogManager.getLogger();
    private static final String MTG_API_ENTRY_POINT = "https://api.magicthegathering.io/v1/";

    private final RestTemplate restTemplate;

    /// CONSTRUCTORS ///
    public CardSearchServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    /// METHODS ///
    @Override
    public List<CardDto> fetchCardsOnMtgApi(String cardName) {
        String url = MTG_API_ENTRY_POINT + "/cards/?name=" + cardName;
        log.info("Starting search with keyword(s): {} on\n{}", cardName, url);
        JsonListOfCardsDto jsonListOfCardsDto = restTemplate.getForObject(
                url, JsonListOfCardsDto.class);
        List<CardDto> cards = jsonListOfCardsDto.getCards();

        int cardNumber = 0;
        for (CardDto card : cards) {
//            card.generateLegalityMap();
            log.info("Card #{}: {} || Legality in Commander: {}",
                    cardNumber,
                    card.getName(),
//                    card.getLegalities() == null ? "null" : card.getLegalities().toString());
                    card.getLegalityMap().get("Commander"));
            cardNumber++;
        }
        return cards;
    }

    /// GETTERS ///
    /// SETTERS ///
}
