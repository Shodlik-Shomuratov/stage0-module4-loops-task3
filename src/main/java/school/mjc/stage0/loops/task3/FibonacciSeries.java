package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int former = 0;
        int latter = 1;

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(former);
            former = latter;
            latter = i;
        }
    }
}
