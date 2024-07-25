package Day15;

public class StringWithNew {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        if(s==s2){
            System.out.println("s==s2");
        }else{
            System.out.println("over");
        }
        if(s.equals(s2)){
            System.out.println("s.equals(s2)");
        }
        if(s==s3){
            System.out.println("s==s3");
        }

    }
}

/*
* here s and s3 both are referring to same object
* s is pointing to abc in string pool memory location
* and s2 is pointing to abc in heap memory location
* "equals" compares the data is same or not
* == compares the object are same or not
*
* 1:29:38 break.......................
*
* 1:42:38 StringBuilder
* Java StringBuilder class is used to create mutable(modified) String.
*
* Strings are immutable by nature
*
* but if we faced many updates
* we can use StringBuilder
*
* */