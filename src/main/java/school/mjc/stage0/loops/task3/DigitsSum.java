package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) {
            t = -1 * t;
        }

        String digits = String.valueOf(t);
        int summ = 0;

        for (int i = 0; i < digits.length(); i++) {
            summ = summ + Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        System.out.println(summ);
    }
}
