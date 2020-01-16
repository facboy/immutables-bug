package org.facboy.immutables;

import org.immutables.value.Value;

@Value.Enclosing
public class InitShimBug {

    @Value.Immutable(builder = false)
    abstract static class SomeValue extends InitShimBug {
        @Value.Default
        boolean value1() {
            return true;
        }

        @Value.Default
        int value2() {
            return 10;
        }
    }
}
