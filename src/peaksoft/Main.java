package peaksoft;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Class class1 = new Class(34,"красавчик",new int[]{54, 43, 34,45,24,54,13});
        System.out.println(class1.getWord() +" "+class1.getSan()+" "+ Arrays.toString(class1.getMassiv()));

    }


    }


