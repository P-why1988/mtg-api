package fr.pwhy.home.mtg.entity;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * Every information from a JSON card
 */
@Data
public class Card {

    private String name;
    private String manaCost;
    private int cmc;
    private Set<Color> colors;
    private Set<Color> colorIdentity;
    private String type;
    private Set<String> supertypes;
    private Set<String> types;
    private Set<String> subtypes;
    private String rarity;
    private String set;
    private String setName;
    private String text;
    private String artist;
    // Must parse from String
    private int number;
    // Must parse from String
    private int power;
    // Must parse from String
    private int toughness;
    private String imageUrl;
    // Must parse from String
    private int loyalty;
    private List<Ruling> rulings;
    private List<ForeignName> foreignNames;
    private String originalText;
    private String originalType;
    private Set<Legality> legalities;
    private String id;

    /// CONSTRUCTORS ///
    public Card() {
    }

    /**
     * Special constructor that parses Strings to int for specific attributes
     * @param name
     * @param manaCost
     * @param cmc Can be String, will be parsed as Integer
     * @param colors
     * @param colorIdentity
     * @param type
     * @param supertypes
     * @param types
     * @param subtypes
     * @param rarity
     * @param set
     * @param setName
     * @param text
     * @param artist
     * @param number Can be String, will be parsed as Integer
     * @param power Can be String, will be parsed as Integer
     * @param toughness Can be String, will be parsed as Integer
     * @param imageUrl
     * @param loyalty
     * @param rulings
     * @param foreignNames
     * @param originalText
     * @param originalType
     * @param legalities
     * @param id
     */
    public Card(String name, String manaCost, String cmc, Set<Color> colors, Set<Color> colorIdentity, String type,
                Set<String> supertypes, Set<String> types, Set<String> subtypes, String rarity, String set,
                String setName, String text, String artist, String number, String power, String toughness, String imageUrl,
                String loyalty, List<Ruling> rulings, List<ForeignName> foreignNames, String originalText,
                String originalType, Set<Legality> legalities, String id) {

        this.name = name;
        this.manaCost = manaCost;
        this.cmc = Integer.parseInt(cmc);
        this.colors = colors;
        this.colorIdentity = colorIdentity;
        this.type = type;
        this.supertypes = supertypes;
        this.types = types;
        this.subtypes = subtypes;
        this.rarity = rarity;
        this.set = set;
        this.setName = setName;
        this.text = text;
        this.artist = artist;
        this.number = Integer.parseInt(number);
        this.power = Integer.parseInt(power);
        this.toughness = Integer.parseInt(toughness);
        this.imageUrl = imageUrl;
        this.loyalty = Integer.parseInt(loyalty);
        this.rulings = rulings;
        this.foreignNames = foreignNames;
        this.originalText = originalText;
        this.originalType = originalType;
        this.legalities = legalities;
        this.id = id;
    }
}
