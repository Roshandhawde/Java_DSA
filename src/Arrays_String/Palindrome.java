package Arrays_String;

public class Palindrome {
    static void checkPalindrome(String str){
        int i=0, j = str.length()-1;
String message="palindrome";
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                message="not Palindrome";
                break;
            }
            i++; j--;
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        checkPalindrome("racecar");
    }
}
