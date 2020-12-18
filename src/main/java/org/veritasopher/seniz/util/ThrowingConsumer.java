package org.veritasopher.seniz.util;

import java.util.function.Consumer;

/**
 * Throwing Consumer Interface
 * Wrapping error throwing in lambda functions
 *
 * @author Yepeng Ding
 * @date 12/17/2020
 */
@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {

    void accept(T t) throws E;

    static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {

        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
