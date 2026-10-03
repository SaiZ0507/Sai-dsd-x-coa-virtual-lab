package dsd.sequential.components;

public class SRFlipFlop {
   
    private int q = 0;

    public int getQ() {
    return q;
    }

    public int getQBar() {
        return q == 0 ? 1 : 0;
    }

    public void clockPulse(int s, int r) {

        if (s == 0 && r == 0) {
            // No change
        }
        else if (s == 0 && r == 1) {
            q = 0;
        }
        else if (s == 1 && r == 0) {
             q = 1;
        }
        else {
            System.out.println("Invalid SR Flip-Flop state");
        }
    }
}
