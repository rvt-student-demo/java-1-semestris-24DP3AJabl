package rvt;

public class OverloadedCounter {
    static class Counter { 
        private int Value;

        public Counter(int Value) {
            this.Value = Value;
        }

        public int Value() {
            return Value;
        }

        public void increase(int increaseBy) {
            if (increaseBy >= 0) {
                Value += increaseBy;
            }
        }

        public void decrease(int decreaseBy) {
            if (decreaseBy >= 0) {
                Value -= decreaseBy;
            }
        }
    }

    public static void main(String[] args) {
        Counter count = new Counter(10);

        count.increase(3);

        System.out.println(count.Value());

        count.decrease(5);

        System.out.println(count.Value());
    }
}
