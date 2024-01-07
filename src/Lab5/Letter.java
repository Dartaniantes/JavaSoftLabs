package Lab5;

public class Letter {

    private char l;

    public Letter(char l) {
        if(!Character.toString(l).matches("[A-Za-z]"))
            throw new RuntimeException("Not an word format passed into word class. Mistake:" + l);
        this.l = l;
    }

    public char getLetter(){
        return l;
    }

    @Override
    public String toString(){
        return Character.toString(l);
    }

    public boolean equals(Letter l){
        return getLetter() == l.getLetter();
    }

    public void setL(char l) {
        this.l = l;
    }
}
