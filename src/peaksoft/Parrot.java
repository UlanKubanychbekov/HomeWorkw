package peaksoft;

public class Parrot {
    private String vid;
    private String colour;
    private int size;
    private String name;

    static void fly(){
        System.out.println("летит");
    }static void repeat(){
        System.out.println("повторяет");
        }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}




