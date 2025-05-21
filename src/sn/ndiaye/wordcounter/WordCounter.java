package sn.ndiaye.wordcounter;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCounter {

    public String count(String filePath) throws IOException {
        int wordsCount = 0;
        int charsCount = 0;
        int linesCount = 0;
        Scanner scanner = new Scanner(Paths.get(filePath));
        String currentLine;
        while (scanner.hasNextLine()){
           currentLine = scanner.nextLine();
           linesCount++;
           charsCount += currentLine.length();
           if (!currentLine.isEmpty())
               wordsCount += currentLine.split(" ").length;

        }
        String allCounts =
                "Total words: " + wordsCount +
                "\nTotal chars: " + charsCount +
                "\n Total lines: " + linesCount;

        return allCounts;
    }

}
