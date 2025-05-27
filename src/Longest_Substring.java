import java.util.ArrayList;

public class Longest_Substring {
    public int LongestSubstring(String s) {
        int maior_length = 0;
        ArrayList<Character> letras =  new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(letras.contains(s.charAt(i))){
                letras = new ArrayList<>(letras.subList(letras.indexOf(s.charAt(i)) + 1, letras.size()));
            }
            letras.add(s.charAt(i));
            int length_aual = letras.size();

            if(length_aual > maior_length){
                maior_length = length_aual;
            }
        }
        return maior_length;
    }

    public static  void main(String[] args){
         Longest_Substring ls = new Longest_Substring();

         int resposta =  ls.LongestSubstring("pwwkew");

         System.out.println(resposta);
    }
}
