package org.veritasopher.seniz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.veritasopher.seniz.config.Info;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

/**
 * Application Test
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class AppTest {

    @Test
    public void testEmptyArg() {
        String[] args = {};
        App.main(args);
    }

    @Test
    public void testVersion() {
        String[] args = {"-v"};
        App.main(args);
    }

    @Test
    public void testHelp() {
        String[] args = {"-h"};
        App.main(args);
    }

}
