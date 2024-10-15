package memory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MemoryFinderTest {

    @Test
    void get() {
        MemoryFinder memoryFinder = new MemoryFinder();
        Memory memory = memoryFinder.get();
        Assertions.assertThat(memory).isNotNull();
    }
}