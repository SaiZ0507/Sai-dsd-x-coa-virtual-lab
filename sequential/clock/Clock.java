package dsd.sequential.clock;

public class Clock {

    private int pulseCount = 0;

    public void pulse() {
        pulseCount++;
    }

    public int getPulseCount() {
        return pulseCount;
    }

    public void reset() {
        pulseCount = 0;
    }
}