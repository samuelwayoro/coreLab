package coreLab.codingame.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String str){
        boolean v = true ;
        int pos1 = 0 ;
        int pos2 = str.length() - 1; //recup du dernier caractère ...
        while (pos2 > pos1){
            //comparaison des caractères
            if (str.charAt(pos1) != str.charAt(pos2)){
                return false;
            }
            pos1++;
            pos2--;
        }
        return v;
    }

    public static void main(String [] args) {
        String str= "radar";
        System.out.println(str+" est il un palindrome  "+isPalindrome(str));



    }

}
