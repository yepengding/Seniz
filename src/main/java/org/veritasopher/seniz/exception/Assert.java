package org.veritasopher.seniz.exception;

import javax.annotation.Nullable;

/**
 * Assertion tool
 *
 * @author Yepeng Ding
 * @date 3/8/2022
 */
public class Assert {

    public static void isNull(@Nullable Object object, BaseException exception) {
        if (object != null) {
            throw exception;
        }
    }

    public static void notNull(@Nullable Object object, BaseException exception) {
        if (object == null) {
            throw exception;
        }
    }

    public static void isTrue(boolean expression, BaseException exception) {
        if (!expression) {
            throw exception;
        }
    }

}
