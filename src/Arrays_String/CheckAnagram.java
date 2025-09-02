package Arrays_String;

import java.util.Arrays;

public class CheckAnagram {
    static void checkAna(String str1, String str2) {

        if (str1.length() == str2.length()) {
            char[] s1Array = str1.toCharArray();
            char[] s2Array = str2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("Anagram");
            } else {
                System.out.println("not anagram");

            }

        } else {
            System.out.println("Not Anagram");
        }
    }

    static void rawAnagram(String str1, String str2){

        if (str1.length() == str2.length()) {
            int count=0;
            for (int i = 0; i <str1.length();i++){
                char x= str1.charAt(i);
                int y = str2.indexOf(x);

                if(y>=0){
                    count++;
                }

            }
if(count==str1.length()){
    System.out.println("Anagaram");

}else{
    System.out.println("NOt ANagram");
}
        }else {
            System.out.println("not Anagram");
        }
    }


    public static void main(String[] args) {
        checkAna("listen", "silent");

        rawAnagram("listen", "silent");

    }


}
