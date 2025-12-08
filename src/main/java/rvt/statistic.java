package rvt;


public class statistic {
    static class Statistics {
    private int count;

    public Statistics(int count) {
        this.count = count;
    }

    public void addNumber(int number) {
        this.count ++;
    }

    public int getCount() {
        return this.count;
    }
    }

    public static void main(String[] args) {
        Statistics statistic = new Statistics(0);
        statistic.addNumber(3);
        statistic.addNumber(5);
        statistic.addNumber(1);
        statistic.addNumber(2);
        System.out.println("Count: " + statistic.getCount());
    }
}
