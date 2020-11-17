package Collections.Map;

public class Country {
    private String name;
    private String language;
    private int area;
    private int population;
    private double abAge;

    public Country(String name, String language, int area, int population, double abAge) {
        this.name = name;
        this.language = language;
        this.area = area;
        this.population = population;
        this.abAge = abAge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", abAge=" + abAge +
                '}';
    }
}
