public class BinaryObserver extends Observer{
    Subject subject;

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary observer: "+Integer.toBinaryString(subject.getState()));
    }
}
