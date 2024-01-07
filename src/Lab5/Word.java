package Lab5;

import java.util.Arrays;

public class Word extends SentencePart{

    private Letter[] letters;

    public Word(String s){
        letters = initWord(s);
    }

    public Letter[] initWord(String str){
        if(!str.matches("[a-zA-Z]+"))
            throw new RuntimeException("Not an word format passed into word class. Mistake:" + str);

        Letter[] letters = new Letter[str.length()];

        for (int i = 0; i < letters.length; i++)
            letters[i] = new Letter(str.charAt(i));
        return letters;
    }

    public Letter[] getLetters(){
        return letters;
    }

    public int countLetter(Letter l) throws NullPointerException{
        int counter = 0;

        for (int i = 0; i < letters.length; i++) {
            if(letters[i].equals(l))
                counter++;
        }
        return counter;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Arrays.stream(letters).forEach(sb::append);
        return sb.toString();
    }


}
