public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Calc calc = new Calc();
        CalcService calcService = new CalcService(calc);
        System.out.println(calcService.add(5,4));
        System.out.println(calcService.subtractWithSwap(4,5));
        System.out.println(calcService.divide(2,0));

    }
}
