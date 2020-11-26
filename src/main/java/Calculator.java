public class Calculator implements ICalculator{


    /**
     * addition mehtod
     *
     * @param value
     * @param value2
     * @return ergebnis
     */
    @Override
    public int add(int value, int value2) {
        return value + value2;
    }

    /**
     * subtraction method
     *
     * @param value
     * @param value2
     * @return ergebnis
     */
    @Override
    public int subtract(int value, int value2) {
        return value - value2;
    }

    /**
     * multiplication method
     *
     * @param value
     * @param value2
     * @return ergebnis
     */
    @Override
    public int multiply(int value, int value2) {
        return value * value2;
    }

    /**
     * division method
     *
     * @param value
     * @param value2
     * @return ergebnis
     */
    @Override
    public int divide(int value, int value2) {
        int ergebnis = 0;
        if(value2 != 0){
            ergebnis = value / value2;
        }
        return ergebnis;
    }
}
