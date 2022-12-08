package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = first > second ? first : second;
        int result = 1;

        for (int i = 1; i <= max; i++) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
        }

        System.out.println(result);
    }
}
