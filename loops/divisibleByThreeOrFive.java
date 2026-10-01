package loops;

public class divisibleByThreeOrFive {

    public static void main(String[] args) {

        for (int i = 3; i < 100; i++) {
            if (i%3 == 0 || i%5==0) System.out.println(i);
        }
    }
}
