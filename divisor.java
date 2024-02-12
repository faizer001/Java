interface alu {
    int divisorSum(int n);
}

class calculate implements alu {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class divisor {
    public static void main(String[] args) {
        calculate obj = new calculate();
        
        int result = obj.divisorSum(10);
        System.out.println("divisor sum of 10: " + result); 
    }
}
