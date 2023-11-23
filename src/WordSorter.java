import java.util.Arrays;
import java.util.Comparator;

public class WordSorter {
    public static void  sort(){
        String text = "aaaffa avfa fffbbbbssds";
        char ch = 'f';

        String []words = text.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(countLetter(o1, ch), countLetter(o2, ch));
            }
        });
        show(words);

    }

    public static int countLetter(String str, char ch) {
        int counter = 0;
        try {
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == ch)
                    counter += 1;
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        return counter;
    }

    public static void show(String[] arr){
        try{
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    }

}
