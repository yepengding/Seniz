package org.veritasopher.seniz.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.veritasopher.seniz.exception.type.InternalException;
import org.veritasopher.seniz.exception.type.ParsingException;

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
            } catch (ParseCancellationException e) {
                throw new ParsingException(e.getMessage());
            } catch (Exception e) {
                throw new InternalException(e.getMessage());
            }
        };
    }
}
