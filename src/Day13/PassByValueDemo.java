package Day13;

public class PassByValueDemo {
    public static  void paisaDouble(int paisa){
        paisa = 2 * paisa;
        System.out.println("Paisa: "+ paisa);
    }
    public static void main(String[] args) {
        int money = 100;
        System.out.println("Money Before Doubling :"+money);
        paisaDouble(money);
        System.out.println("Money After Doubling :"+money);
    }
}
