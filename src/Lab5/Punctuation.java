package Lab5;

public class Punctuation extends SentencePart{

    private char p;

    public Punctuation(char p) {
        if(!Character.toString(p).matches("[\\p{P}\\n\\t]"))
            throw new RuntimeException("Invalid punctuation index. Mistake: " + p);
        this.p = p;
    }

    public char getP() {
        return p;
    }

    @Override
    public String toString() {
        return p+"";
    }
}
