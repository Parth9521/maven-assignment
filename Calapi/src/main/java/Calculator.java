/** * */
public class Calculator {

    /**
     * @param num1
     * @param num2
     * @return it will return addition
     */
    public int add(final int num1, final int num2) {
        int result = num1 + num2;
        System.out.println("addition is " + result);
        return result;

    }

    /**
     * @param num1
     * @param num2
     * @return it will return difference
     */
    public int substract(final int num1, final int num2) {
        int result = num1 - num2;
        System.out.println("Sub is " + result);
        return result;
    }

    /**
     * @param num1
     * @param num2
     * @return it will return multiply
     */
    public int multiply(final int num1, final int num2) {
        int result = num1 * num2;
        System.out.println("Multi " + result);
        return result;
    }

    /**
     * @param num1
     * @param num2
     * @return it will return division
     */
    public double divide(final double num1, final double num2) {
         double result = num1 / num2;
        System.out.println("Div " + result);
        return result;
    }

}
