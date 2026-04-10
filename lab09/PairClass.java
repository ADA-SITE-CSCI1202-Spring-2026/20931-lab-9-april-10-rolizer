public class PairClass<A, B> {
    private A first;
    private B second;

    public PairClass(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getKey() {
        return first;
    }

    public B getValue() {
        return second;
    }

    public void setKey(A first) {
        this.first = first;
    }

    public void setValue(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {

        PairClass<Integer, String> p1 = new PairClass<>(1, "Paracetamol");
        System.out.println(p1);

        PairClass<String, Double> p2 = new PairClass<>("Price", 9.99);
        System.out.println(p2);


        System.out.println("Key: " + p2.getKey());
        System.out.println("Value: " + p2.getValue());
    }
}