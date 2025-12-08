package rvt;

public class PaymentCard {
    static class paymentCard {
    private double balance;

    public paymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return Double.toString(balance);
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount >= 0){
            if (this.balance + amount <= 150) {
                this.balance += amount;
            }else{
                this.balance = 150.0;
            }
        }
    }

    }

    public static void main(String[] args) {
        paymentCard paulsCard = new paymentCard(20);
        paymentCard mattsCard = new paymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul cash: " + paulsCard);
        System.out.println("Matt cash: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul cash: " + paulsCard);
        System.out.println("Matt cash: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println("Paul cash: " + paulsCard);
        System.out.println("Matt cash: " + mattsCard);
    }
}
