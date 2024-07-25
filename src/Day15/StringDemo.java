package Day15;

public class StringDemo {
    public static void main(String[] args) {
        String str = "hello1234";
        String str2 = "abcd";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str.charAt(1));

        String s1 = "satyam";
        String s2 = "Satyam";
        String s3 = "def";
        s2="Hello World";
         s2 = s2 + s2;
        System.out.println(s2);
        System.out.println(s2 + " "+s3);
        System.out.println(s1.indexOf('y')); // 3
        System.out.println(s1.indexOf("tyam"));//2
        System.out.println(s1.lastIndexOf('a'));

        if(s1.contains("am")){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

        String s5 = "Hello World";
        System.out.println(s5.toLowerCase());
        String s = "I love Programming";
        System.out.println(s.replace("Programming","Java"));

        System.out.println(s.substring(2,5));
        System.out.println(s.substring(2));

        System.out.println(s5 +" "+ s);
        int x =5;
        float y = 2.2345f;
        char a = 'A';
        boolean b = true;
        System.out.println(s+" "+x);
        System.out.println(s+" "+y);
        System.out.println(s+" "+a);
        System.out.println(s+" "+b);

        String name = "Hello World";
        String rev = "";
        for(int i =0;i<name.length();i++){
            rev = name.charAt(i)+rev;
        }
        System.out.println(rev);


    }
}

/*String class - represents character strings. All strings literals in java programs
such as "abc" are implemented as instance of this class
String in java are immutable

String pool is the area in heap memory where string literals are stored

String methods
1.charAt - it allows us to access the character at the specific index
2.indexOf - it returns the index of the first occurrence of the specified char or string in the given string
it if is present then it return - 1
3.contains
4.toLowerCase()
5.toUpperCase() returns new strings after changing the case. Original string remains intact
6.replace() - it replaces the target string(fist) with the given replacement string(second) and returns a new string

String using new
we can also create new strings using the new keyword. These strings do not reside in the string pool,
instead they are created and stored in the heap memory.

 */