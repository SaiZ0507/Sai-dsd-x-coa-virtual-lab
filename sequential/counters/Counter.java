package dsd.sequential.counters;

public interface Counter {

    void clockTick();

    void reset();

    int getValue();

    int getBitWidth();

    CounterState getState();

    String getName();
}