package peaksoft;

public class Fish {

    private String vid;
    private String colour;
    private int size;

    static void swim(){
        System.out.println("плавает");
    }static void eat(){
        System.out.println("кушает");
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
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
