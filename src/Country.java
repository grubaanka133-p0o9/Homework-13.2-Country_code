public class Country {
    private String code;
    private String name;
    private int numberOfPeople;

    public Country(String code, String name, int population) {
        this.code = code;
        this.name = name;
        this.numberOfPeople = population;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return numberOfPeople;
    }
}
