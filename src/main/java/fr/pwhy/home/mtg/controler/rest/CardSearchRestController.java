package fr.pwhy.home.mtg.controler.rest;

import fr.pwhy.home.mtg.entity.dto.CardDto;
import fr.pwhy.home.mtg.service.CardSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "${front.url}")
@RequestMapping("search")
public class CardSearchRestController {

    /** Service injected through Setters **/
    private CardSearchService cardSearchService;

    /// METHODS ///
//    @GetMapping("/cards/{cardName}")
    @RequestMapping(value = "/cards/{cardName}", method = RequestMethod.GET)
    public List<CardDto> fetchCardWithNameOnMtgApi(@PathVariable String cardName) {
        return cardSearchService.fetchCardsOnMtgApi(cardName);
    }

    /// SETTERS ///
    @Autowired
    public CardSearchRestController(CardSearchService cardSearchService) {
        this.cardSearchService = cardSearchService;
    }
}
