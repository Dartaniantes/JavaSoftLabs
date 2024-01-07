import Lab5.*;

import javax.sound.midi.Soundbank;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Lab 1
        //CounterLab1.count();

        // Lab 2
        //MatrixLab2.XorAverages();

        // Lab 3
        //WordSorterLab3.sort();

        // Lab 4
        //FurnitureL4.sortArrs();

        //Lab 5
        TextProcessor.process();

    }

    public static void match(String[] arr, String regex){

        for (String str: arr) {
            System.out.println(str + " : " + str.matches(regex));
        }
    }

    public static void show(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

    public static void showSplit(String s, String regex){
        for (String el: s.split(regex)) {
            System.out.println(el);
        }
    }


}