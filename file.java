import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class EmailValidator
{
    static void validateAddress(String str) {
        System.out.println("The email address \""+str+ "\" is");
        Pattern p = Pattern.compile
        ("^[a-zA-Z][^!?@$%#]*[@][^!?@$%#]{2,20}(\\.[a-zA-Z]{2,3})$");
        Matcher m = p.matcher(str);
        if (m.matches())
            System.out.println("valid");
        else
            System.out.println ("invalid");
    }
    
    public static void main(String[] args) {
        Scanner em = new Scanner(System.in);
        validateAddress(em.nextLine());    
    }
}
