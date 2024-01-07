package Lab5;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
    SentencePart[] parts;

    public Sentence(String str){
        parts = initSentence(str);
    }

    public SentencePart[] initSentence(String str){
        if(!str.matches("([A-Z][a-z]*)(\\p{P}?\\s?[A-Z]?[a-z]*)*[.!?]"))
            throw new RuntimeException("Not an sentence format passed into sentence class. Mistake:" + str);

        String[] s = str.split("\\s");
        int signs_amount = countPunctuation(s);
        SentencePart[] result = new SentencePart[s.length + signs_amount];

        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if(hasPunctuation(s[i])) {
                SentencePart[] sp = separatePunctuation(s[i]);
                result[j++] = sp[0];
                result[j] = sp[1];
                continue;
            }
            result[j] = new Word(s[i]);
        }
        result[result.length-1] = new Punctuation(str.charAt(str.length()-1));

        return result;
    }

    public List<Word> getWords(){
        List<Word> words = new LinkedList<>();
        for (SentencePart part: parts) {
           if (part instanceof Word)
               words.add((Word)part);
        }
        return words;
    }

    public boolean hasPunctuation(String s){
        return Character.toString(s.charAt(s.length()-1)).matches("\\p{P}");
    }

    public int countPunctuation(String[] arr){
        int punctCounter = 0;
        for (String s: arr)
            if(hasPunctuation(s))
                punctCounter++;


        return punctCounter;
    }

    public static void show(SentencePart[] sps){
        for (SentencePart sp: sps)
            System.out.print(sp);
        System.out.println();
    }

    public SentencePart[] separatePunctuation(String s){
        SentencePart[] sp = null;
        if(hasPunctuation(s)) {
            sp = new SentencePart[2];
            sp[0] = new Word(s.substring(0, s.length() - 1));
            sp[1] = new Punctuation(s.charAt(s.length() - 1));
        }

        return sp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length-1; i++) {
            if(parts[i+1] instanceof Punctuation){
                sb.append(parts[i]);
            }
            else {
                sb.append(parts[i]).append(" ");
            }
        }
        return sb.append(parts[parts.length-1]).toString();
    }

}
