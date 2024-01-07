package Lab5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text {

    private Sentence[] sentences;

    public Text(String text){
        sentences = initText(text);
    }

    public Sentence[] getSentences() {
        return sentences;
    }



    public Sentence[] initText(String s){
        String[] text = s.split("[.!?]\\s?");
        Sentence[] sentences = new Sentence[text.length];
        char[] endSymbols = getEndSymbols(s);
        for (int i = 0; i < text.length; i++) {
            sentences[i] = new Sentence(text[i] + endSymbols[i]);
        }
        return sentences;
    }

    public static char[] getEndSymbols(String str){
        String[] split = str.split("[.?!]");
        char[] endSymbols = new char[split.length];
        int len = 0;
        for (int i = 0; i < endSymbols.length; i++) {
            len += split[i].length();
            endSymbols[i] = str.charAt(len + i);
        }
        return endSymbols;
    }

    public Word[] getWords(){
        List<Word> words = new LinkedList<>();
        for (Sentence sentence : sentences)
            words = Stream.concat(words.stream(), sentence.getWords().stream()).collect(Collectors.toList());
        return words.toArray(new Word[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentences.length-1; i++) {
            sb.append(sentences[i]).append(" ");
        }
        return sb.append(sentences[sentences.length-1]).toString();
    }
}
