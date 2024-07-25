package Day15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringWithBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        sb.append("world");
        System.out.println(sb);
        /*...................................................................*/
        System.out.println("...................................................");
        StringBuilder sbr = new StringBuilder();
        String str = "Satyam";
        String rev =" ";
        for(int i =0;i<str.length();i++){
           // rev = str.charAt(i)+rev;
            sbr.insert(0,str.charAt(i));
        }
       // System.out.println(rev);
        System.out.println(sbr);
        /*....................................................................*/
        System.out.println("...................................................");
        String str1 = "tenet";
        StringBuilder stb = new StringBuilder(str1);
        stb.reverse();
        String rever = stb.toString();
        System.out.println(rever);
        if(str1.equals(rever)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
        System.out.println(stb);

        /*.......................................................................*/
        System.out.println("...................................................");
        System.out.println("Please Enter a String");
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        StringBuilder stb1 = new StringBuilder(str2);
        stb1.reverse();
        String rev1 = stb1.toString(); // here we are using toString to convert the stringbuilder to string
        if(str2.equals(rev1)){
            System.out.println("Yes its Palindrome");
        }else {
            System.out.println("No, its not Palindrome");
        }
    }
}

/*
*  1:42:38 StringBuilder
 * Java StringBuilder class is used to create mutable(modified) String.
 *
 * Strings are immutable by nature
 *
 * but if we faced many updates
 * we can use StringBuilder
 *
 * StringBuilder is much stronger than StringBuffer
 * String and StringBuilder both are classes
 *
* */