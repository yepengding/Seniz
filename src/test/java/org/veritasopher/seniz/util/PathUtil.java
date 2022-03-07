package org.veritasopher.seniz.util;

import java.util.Objects;

/**
 * Path Util for test
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class PathUtil {

    public static String getFilePathInResource(String filePath) {
        return Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(filePath)).getPath();
    }
}
