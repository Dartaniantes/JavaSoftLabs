package Lab5;

import java.util.Arrays;
import java.util.Comparator;

public class TextProcessor {
    public static void process(){
        Text text = new Text("Good evening, friends. Here is our topic for today: history of Ukraine!");
        System.out.println("Input text:\n" + text);
        Letter letter = new Letter('n');
        System.out.println("\nSource words order:");
        show(text.getWords());
        System.out.println("\nOutput words order:");
        show(sortWordsByLetter(text,letter));

    }

    public static void show(Word[] words){
        for (Word word: words)
            System.out.print(word + " ");
        System.out.println();
    }

    public static Word[] sortWordsByLetter(Text t, Letter l){
        Word[] words = t.getWords();
        Arrays.sort(words, new Comparator<Word>() {
            @Override
            public int compare(Word w1, Word w2) {
                return Integer.compare(w1.countLetter(l) - w2.countLetter(l), 0);
            }
        });
        return words;
    }

}
