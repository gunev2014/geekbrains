package DZ2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        printWordNTimes("gunya", 5);
        System.out.println(integer(700));
        plusOrminus(8);
        if (trueOrfalse(10, 7) == true) {
            System.out.println("good");
        }
        System.out.println(trueOrfalse(10, 7));

    }

    public static boolean trueOrfalse(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static int plusOrminus(int a) {
        if (a >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    return a;
    }
    public static boolean integer(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i<times;i++) {
            System.out.println(word);
        }
    }
}
