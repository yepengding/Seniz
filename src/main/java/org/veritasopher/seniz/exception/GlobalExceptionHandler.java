package org.veritasopher.seniz.exception;

/**
 * Global Exception Handler
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(e.getMessage());
    }

}
