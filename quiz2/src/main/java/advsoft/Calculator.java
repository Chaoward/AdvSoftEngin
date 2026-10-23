package advsoft;

public class Calculator {

    public int sum(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }
    
    public int multiply(int x, int y) {
        return x * y;
    }
    
    public int divide(int x, int y) {
        return x / y;
    }

    public Boolean isEven(int value) {
        return value % 2 == 0;
    }
}
