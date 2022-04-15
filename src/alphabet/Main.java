package alphabet;

public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        alphabet.setY(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());
        Alphabet alphabet1 = new Alphabet();
        alphabet1.setA(5);
        System.out.println(alphabet1.getSum());
    }

}
