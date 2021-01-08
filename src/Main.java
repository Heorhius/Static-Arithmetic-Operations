public class Main {

    public static void main(String[] args) {
        System.out.println("11/2= " + StaticMathOperations.divideWithIntResult(11,2));
        System.out.println("-10/5= " + StaticMathOperations.divideWithIntResult(-10,5));
        System.out.println("-8/-3= " + StaticMathOperations.divideWithIntResult(-8,-3));

        System.out.println("8/3= " + StaticMathOperations.divideWithDoubleResult(8,3));
        System.out.println("-9/3= " + StaticMathOperations.divideWithDoubleResult(-9,3));
        System.out.println("7/-2= " + StaticMathOperations.divideWithDoubleResult(7,-2));

        System.out.println("12/3= " + StaticMathOperations.getRemainderOfDivision(12, 3));
        System.out.println("-15/4= " + StaticMathOperations.getRemainderOfDivision(-15, 4));
        System.out.println("10/-3= " + StaticMathOperations.getRemainderOfDivision(10, -3));
    }


}
