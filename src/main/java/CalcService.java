public class CalcService {

    private Calc calc;

    public CalcService(Calc calc) {
        this.calc = calc;
    }

    public int add(int a, int b) {
        return calc.add(a, b);
    }

    public int subtractWithSwap(int a, int b) {  // a = 4 i b = 5 == 5-4    a = 5 b = 4 == 5 - 4
        if (a > b) {
            return calc.subtractPositive(a, b);
        } else {
            return calc.subtractPositive(b, a);
        }
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return calc.divide(a, b);
    }

}
