package peaksoft;

public class Class {

    private int san;
    private String word;
    private int[] massiv;

    public Class (){

    }

    public Class(int san, String word, int[] massiv) {
        this.san = san;
        this.word = word;
        this.massiv = massiv;
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
}
