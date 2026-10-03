package dsd.sequential.components;

public class DFlipFlop {

    private int q = 0;

    public int getQ() {
        return q;
    }

    public int getQBar() {
        return q == 0 ? 1 : 0;
    }

    public void clockPulse(int d) {

        if (d == 0 || d == 1) {
            q = d;
        } else {
            System.out.println("Invalid D input");
        }
    }
}