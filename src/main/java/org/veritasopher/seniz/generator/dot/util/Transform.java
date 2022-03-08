package org.veritasopher.seniz.generator.dot.util;

/**
 * DOT Transform Tool
 *
 * @author Yepeng Ding
 * @date 3/8/2022
 */
public class Transform {


    public static String toDotStateName(String name) {
        return name.replace("-", "_");
    }

}
