package dsd.sequential.components;

public class MasterSlaveJKFlipFlop {

    private int masterQ = 0;
    private int q = 0;

    public int getQ() {
        return q;
    }

    public int getQBar() {
        return q == 0 ? 1 : 0;
    }

    public int getMasterQ() {
        return masterQ;
    }

    /*
     * CLOCK HIGH:
     *
     * The master section becomes active.
     * The slave output Q does not change yet.
     */
    public void clockHigh(int j, int k) {

        validateInput(j);
        validateInput(k);

        if (j == 0 && k == 0) {
            // No change
            masterQ = q;
        }
        else if (j == 0 && k == 1) {
            // Reset
            masterQ = 0;
        }
        else if (j == 1 && k == 0) {
            // Set
            masterQ = 1;
        }
        else {
            // Toggle
            masterQ = q == 0 ? 1 : 0;
        }
    }

    /*
     * CLOCK LOW:
     *
     * The slave becomes active and copies
     * the state stored by the master.
     */
    public void clockLow() {
        q = masterQ;
    }

    /*
     * Convenience method representing
     * one complete clock cycle.
     */
    public void clockPulse(int j, int k) {
        clockHigh(j, k);
        clockLow();
    }

    public void reset() {
        masterQ = 0;
        q = 0;
    }

    private void validateInput(int input) {

        if (input != 0 && input != 1) {
            throw new IllegalArgumentException(
                    "JK inputs must be either 0 or 1."
            );
        }
    }
}