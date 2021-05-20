public class Counter {
    int valInicial;
    int valIncrement;
    int valLimit;

    public int getValInicial() {
        return this.valInicial;
    }

    public void setValInicial(int valInicial) {
        this.valInicial = valInicial;
    }

    public int getValIncrement() {
        return this.valIncrement;
    }

    public void setValIncrement(int valIncrement) {
        this.valIncrement = valIncrement;
    }

    public int getValLimit() {
        return this.valLimit;
    }

    public void setValLimit(int valLimit) {
        this.valLimit = valLimit;
    }

    public Counter(int valInicial, int valIncrement, int valLimit) {
        this.valInicial = valInicial;
        this.valIncrement = valIncrement;
        this.valLimit = valLimit;
    }

    public int [] getVals() {
        int [] vals = {getValIncrement(), getValInicial(), getValLimit()};
        return vals;
    }
    public static void main(String[] args) {
        
    }
}
