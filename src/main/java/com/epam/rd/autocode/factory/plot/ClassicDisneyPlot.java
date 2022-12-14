package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyPlot implements Plot {
    private final Character hero;
    private final Character beloved;
    private final Character villain;
    private final String plot;

    public ClassicDisneyPlot(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
        this.plot = asText();
    }

    @Override
    public String asText() {
        return hero.name() + " is young and adorable. " +
                hero.name() + " and " +
                beloved.name() + " love each other. " +
                villain.name() + " interferes with their happiness, but loses in the end.";
    }

    @Override
    public String toString() {
        return plot;
    }
}
