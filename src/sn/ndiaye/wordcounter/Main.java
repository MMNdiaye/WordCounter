package sn.ndiaye.wordcounter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        try {
            System.out.println(wc.count("resources/example1.txt"));
        } catch (IOException e) {
            System.out.println("e");
            e.printStackTrace();
        }
    }
}
