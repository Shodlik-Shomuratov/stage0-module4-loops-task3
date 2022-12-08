package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int summ = 0;

        for (int i = 1; i <= lengthOfLastNumber ; i++) {
            summ = summ + Integer.parseInt("9".repeat(i));
        }

        System.out.println(summ);
    }
}
