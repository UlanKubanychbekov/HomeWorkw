package peaksoft;

public class Dog {
    private String breed ;
    private String name;
    private int weight;

    static void run (){
        System.out.println("бегал");
    }static void guard(){
        System.out.println("охранять");
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
