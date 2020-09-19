package pl.witampanstwa.wordscrape;

import java.util.List;

public class Building {
    private final List<String> street;
    private final List<String> numbers;

    public Building(List<String> street, List<String> numbers) {
        this.street = street;
        this.numbers = numbers;
    }

    public List<String> getStreet() {
        return street;
    }

    public String getStringStreet() {
        return String.join(", ", street);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getStringNumbers() {
        return String.join(", ", numbers);
    }
}
