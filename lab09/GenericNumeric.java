public class GenericNumeric<T extends Number> {
    private T num;

    public GenericNumeric(T num) {
        this.num = num;
    }

    public double reciprocal() {
        return 1 / num.doubleValue();
    }

    public double fractionalPart() {
        double value = num.doubleValue();
        return value % 1;

    }

    public static boolean abs(Number n1, Number n2) {
        return Math.abs(n1.doubleValue()) == Math.abs(n2.doubleValue());
    }


    public static void main(String[] args) {

        GenericNumeric<Double> num1 = new GenericNumeric<>(9.76);
        GenericNumeric<Float> num2 = new GenericNumeric<>(-9.76f);

        
        System.out.println("Reciprocal: " + num1.reciprocal());

       
        System.out.println("Fractional part: " + num1.fractionalPart());

        
        boolean result = GenericNumeric.abs(num1.reciprocal(), num2.reciprocal());
        System.out.println("Is it equal?:  " + result);
    }
}
