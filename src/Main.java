// Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
// от A до B включительно.

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 19;
        int result;

        result = sum(a, b);
        System.out.println(result);
    }

    static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }
}
