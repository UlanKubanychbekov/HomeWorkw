package peaksoft;

public class Cat {

    private String breed;
    private String name;
    private int years;

    static void play(){
        System.out.println("играется");
    }static void sleep(){
        System.out.println("спать");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
