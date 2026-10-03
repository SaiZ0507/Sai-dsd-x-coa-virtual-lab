
package dsd.sequential.counters;

import java.util.List;

public record CounterState(
        int decimalValue,
        List<Boolean> bits
) {
}