public class HexaDecimal extends Observer{

    protected Subject subject;
    public HexaDecimal(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("HexaDecimal: "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
