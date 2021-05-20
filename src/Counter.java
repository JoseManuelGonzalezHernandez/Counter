import java.util.Scanner;

public class Counter {
    final int valInicial;
    final int valIncrement;
    final int valLimit;
    int counter;

    Scanner entrada = new Scanner(System.in);

    public int getValInicial() {
        return this.valInicial;
    }

    public int getValIncrement() {
        return this.valIncrement;
    }

    public int getValLimit() {
        return this.valLimit;
    }

    public Counter(int valInicial, int valIncrement, int valLimit) {
        this.valInicial = valInicial;
        this.valIncrement = valIncrement;
        this.valLimit = valLimit;
        this.counter = valInicial;
    }

    public Counter(int valLimit) {
        this.valInicial = 0;
        this.valIncrement = 1;
        this.valLimit = valLimit;
        this.counter = valInicial;
    }

    public int [] getVals() {
        int [] vals = {getValInicial(), getValIncrement(), getValLimit()};
        return vals;
    }

    public void doCounter() {
        this.counter += this.valIncrement;
    }

    public void resetCounter() {
        this.counter = valInicial;
    }
}


