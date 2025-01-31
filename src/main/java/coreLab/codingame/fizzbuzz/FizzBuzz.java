package coreLab.codingame.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(Integer n){
        String res ="";
        if(n%5 == 0 && n%3 ==0){
            res = "FizzBuzz";
        } else if (n%3 == 0) {
            res = "Fizz";
        } else if (n%5 == 0) {
            res = "Buzz";
        }else {
            res = n.toString();
        }
        return res ;
    }

    public static void main(String[]args){

        int n = 55 ;
        String r ;

        r = fizzBuzz(n);

        System.out.println("le resultat est "+r);


    }

}
