package Day17;
class Car{
    String model = "HatchBack";
    String color = "Black";
    int price = 1000000;
    boolean isLocked = true;

    void drive(){
        System.out.println("Zoom Zoom Zoom");
    }
    void lock(){
        System.out.println("Car is now locked");
        isLocked=true;
    }
    void unlock(){
        System.out.println("Car is now unlocked");

    }
    String getDetails(){
        return model + " " + color + price ;
    }
    float getPrice(){
        return price;
    }
}

class ComplexNumber{
    int real;
    int imaginary;

    ComplexNumber(){
        System.out.println("Inside the Constructor ");
    }
    //while parametrised constructor
//    ComplexNumber(int r,int i){
//        System.out.println("Inside the Parameterised Constructor");
//        real=r;
//        imaginary=i;
//    }
    //while this keyword
    ComplexNumber(int real, int imaginary){
        System.out.println("real: " +real+" imaginary:  "+imaginary);
        real=real; //here we are assigning same real which we are using in parameters not parent one, so thats why we used this
        imaginary=imaginary;
        this.real=real;
        this.imaginary=imaginary;
    }


    void print(){
        System.out.println(real+" + "+imaginary+"i");
       // System.out.println(this);
    }
    void toCheckPrint(){
        System.out.println(this);
    }

    ComplexNumber addition(ComplexNumber y){
        int sumOfReal = this.real + y.real;
        int sumOfImag = this.imaginary + y.imaginary;
        ComplexNumber result = new ComplexNumber(sumOfReal,sumOfImag);
        return result;
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);
        c2.color="Gary";
        System.out.println(c2.color);
        c1.drive();
        c2.lock();
        c2.unlock();
        String s = "abc";
        s.length();
        System.out.println(c1.getDetails());
        System.out.println(c1.getPrice());

        /*...................Constructor..........................*/

        ComplexNumber cn = new ComplexNumber();
        cn.real=5;
        cn.imaginary=10;
        cn.print();
        ComplexNumber cpn = new ComplexNumber();
        cpn.real=10;
        cpn.imaginary=20;
        cpn.print();
        System.out.println(cpn.real);

        /*.............Parametrised Constructor.....................*/
        ComplexNumber cpnx = new ComplexNumber(5,10);
        cpnx.print();
        ComplexNumber cpny = new ComplexNumber(2,4);
        cpny.print();

        /*.............this keyword..........................*/
        ComplexNumber cnthis = new ComplexNumber(3,6);
        cnthis.print();

        ComplexNumber cpnthis = new ComplexNumber();
        cpnthis.toCheckPrint();
        System.out.println(cpnthis);

        /*.........................................................*/
        ComplexNumber cpnz = cpnx.addition(cpny);
        cpnz.print();
    }
}

/*
* While creation of object -- new ComplexNumber , constructor was called internally by java itself
*1) Constructor: - same name as class
* no return type
* called automatically when object is created
* so any kind of work which we want to show at the object creation, we can call those inside constructor
*
*2)Parametrised Constructor:
*
*3) this keyword:
* In java, this keyword is used to refer to the current object inside a class method
*
* */