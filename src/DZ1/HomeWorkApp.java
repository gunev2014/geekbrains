package DZ1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        CompareNumbers();
    }

    public static void printThreeWords() {
        String name = "apple";
        System.out.println("Orange" + ' ' + name);
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -11;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum +");
        } else {
            System.out.println("Sum -");
        }
    }
    public static void printColor() {
        int value = 100;
        if (value<0) {
            System.out.println("Yellow");
        }
        if (value>0 && value<100) {
            System.out.println("Red");
        }
        if (value>100) {
            System.out.println("Green");
        }
        if (value==0 || value==100){
            System.out.println("Blue");
        }
    }
    public static void CompareNumbers() {
        int a = 5;
        int b =10;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

}
