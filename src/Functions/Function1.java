package Functions;

import java.util.Scanner;

public class Function1 {
        //Define a function
        public static void greet(){
            System.out.println("Hello Everyone!");
        }
        public static void greetWithPara(String Person){
            System.out.println("Hi "+ Person);
        }
        public static void bringVeggies(int qty,String itemName){
            System.out.println("Bringging "+qty+"Kg of "+itemName);
        }
        public static int shopForGrocery(int qty,String itemName, int money){
            System.out.println("Bringing "+qty+"kg of "+itemName);
            int unit_price = 12;
            int money_left = money - qty * unit_price;
            return money_left;
        }
        //scope demo
        public static void getMarket(){
            int stalls = 10;
            int money = 0;
            if(stalls>10){
                money = 20;
            }
            System.out.println(money);
        }

        //Doubt - 1 return a Scanner
        public static Scanner getMeAScanner(){
            Scanner sc = new Scanner(System.in);
            return sc;
        }
        //doubt - 2 return an float inside int
        public static int getMeAInt(){
            float num = 3.124f;
            return (int) num;
        }
        public static void main(String[] args) {
        System.out.println("Function 1");
        //call a function
        greet();
        greet();
        greet();
        greetWithPara("satyam");
        greetWithPara("shivam");
        greetWithPara("sundaram");

        bringVeggies(5,"Tomato");
        bringVeggies(3,"Potato");
        int remMoney = shopForGrocery(5,"Milk",1000);
        System.out.println(remMoney);
    }
}
