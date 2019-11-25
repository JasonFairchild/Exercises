import java.util.ArrayList;
import java.util.List;

public class PermutationExcercise {
    static List<String> permutationsList = new ArrayList<>();

    static void Permutation(String s, String result){
        // The String s having no more characters is the base case
        if(s.length() > 0) {
            // Go through each character of s and add it to the answer, and pass the rest back to the Permutation function
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                String restOfString = s.substring(0,i) + s.substring(i+1);
                String answer = result + c;
                Permutation(restOfString, answer);
            }
        }
        // Add the result to our list of Strings when the base case is met
        if(s.length() == 0)
            permutationsList.add(result);
    }

    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args){
        String permute = "123456";
        Permutation(permute,"");
        System.out.println(permutationsList);
        if(permutationsList.size() == factorial(permute.length()))
            System.out.println("The list has the correct number of elements");
    }
}
