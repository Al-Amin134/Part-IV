public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaDecimal(subject);
        System.out.println("First state is: 12");
        subject.setState(12);
        System.out.println("Second State is: 15");
        subject.setState(15);
    }
}
