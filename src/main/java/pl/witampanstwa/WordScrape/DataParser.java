package pl.witampanstwa.wordscrape;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Processes collected objects / collections of objects
 */
public class DataParser {
    private int whatIndexMatchedAt;
    private int whereIndexMatchedAt;

    public DataParser(List<Building> itemsLookedFor, List<Building> itemsLookedThrough) {
        List<List<String>> streetsLookedFor = itemsLookedFor.stream()
                .map(Building::getStreet)
                .collect(Collectors.toList());
        List<List<String>> streetsLookedThrough = itemsLookedThrough.stream()
                .map(Building::getStreet)
                .collect(Collectors.toList());
        List<List<String>> numbersLookedFor = itemsLookedFor.stream()
                .map(Building::getNumbers)
                .collect(Collectors.toList());
        List<List<String>> numbersLookedThrough = itemsLookedThrough.stream()
                .map(Building::getNumbers)
                .collect(Collectors.toList());
    }

    public int getWhatIndexMatchedAt() {
        return whatIndexMatchedAt;
    }

    public int getWhereIndexMatchedAt() {
        return whereIndexMatchedAt;
    }
}
