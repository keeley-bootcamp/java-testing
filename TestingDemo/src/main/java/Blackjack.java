public class Blackjack {
    public int blackjack(int num1, int num2) {
        if (num1 > 21 && num2 > 21) {
            return 0;
        }
        else if (num1 > 21) {
            return num2;
        }
        else if (num2 > 21) {
            return num1;
        }
        else if (num1 > num2) {
            return num1;
        }
        else if (num2 > num1) {
            return num2;
        }
        else {
            return num1;
        }
    }
}
