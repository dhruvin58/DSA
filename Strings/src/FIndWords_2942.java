import java.util.ArrayList;
import java.util.List;

public class FIndWords_2942 {
    public static void main(String[] args)
    {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> list = new ArrayList<>();
        list = findWordsContaining(words,x);
        System.out.println(list);
    }
//    static List<Integer> findWordsContaining(String[] words, char x) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=0; i<words.length; i++)
//        {
//            if(words[i].contains(String.valueOf(x)))
//            {
//                list.add(i);
//            }
//        }
//        return list;
//    }

    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<words.length; i++)
        {
            String s = words[i];
            if(s.indexOf(x) >= 0)
            {
                list.add(i);
            }
        }
        return list;
    }
}
