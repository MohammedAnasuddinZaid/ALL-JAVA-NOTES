import java.util.Scanner;

public class CharAtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namefirst = "ANAS BHAI";
        String namesecond = " Is Pro";
        String fullname = namefirst + namesecond;
        System.out.println(fullname.length());
        
        for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
