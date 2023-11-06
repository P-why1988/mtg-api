package fr.pwhy.home.mtg.entity.dto;

import fr.pwhy.home.mtg.entity.Legality;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Only necessary attributes for a card DTO
 */
@Data
public class CardDto {

    private String name;
    private int cmc;
    private String type;
    // Must parse from String
    private int power;
    // Must parse from String
    private int toughness;
    private String imageUrl;
    // Must parse from String
    private int loyalty;
    private Set<Legality> legalities;
    // Created from a Set<Legality> to obtain Map<String format, String legality>
    private Map<String, String> legalityMap = new HashMap<>();
    private String id;

    /// CONSTRUCTORS ///

    public CardDto() {
        generateLegalityMap();
    }

    /// METHODS ///
    public void generateLegalityMap() {
        if (legalities != null) {
            for (Legality leg : this.legalities) {
                this.legalityMap.put(leg.getFormat(), leg.getLegality());
            }
        }
    }
}
