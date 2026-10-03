package dsd.sequential.registers;

public interface ShiftRegister {

    void reset();

    int getBitWidth();

    ShiftRegisterState getState();

    String getName();
}