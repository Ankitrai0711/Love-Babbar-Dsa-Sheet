import java.util.Arrays;
import java.util.Scanner;
public class Anangram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First String: ");
        String s1 = sc.next();
        System.out.print("Enter The Second String: ");
        String s2 = sc.next();
        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char ar1[] = s1.toCharArray();
        char ar2[] = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("The String is Anangram");
        }
        else{
            System.out.println("The String is not Anagram");
        }
    }
    
}
