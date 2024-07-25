package Day14;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(0,10);
        arr.remove(0);
        //add - insert
        //get = read
        //set = update
        

        //print all the elements
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
                int x = 5;
                Integer y=5;//adds additional functionality    to work with integers

    }
}

//2:19:22 ArrayList
/*
 * we are going to restaurant
 * ordered some food item -- pizza, sweet
 * after this we added 2 more things
 * same thing with array
 * we know that array has fix size
 * if we are having an array with size =5
 * then we need to add 8 elements
 * manual way of doing this is
 * you create a new array, you copy all the elements here add new 3 elements
 * means 1. manually create a new array 2.copy the elements 3. Destroy the old array by setting like oldarr = null
 * if we do it, the garbage collector will destroy the old array
 *but java has library -- which we call as collection framework
 * it actually implemented the functionality inside the container is known as Arraylist
 * so Arraylist does the same thing but code is already written for you behind the implementation of Arraylist
 * code is same, working is the same
 * it way to give dynamic array, that means array can grow when the limit exits
 *actual array does not grow
 * */