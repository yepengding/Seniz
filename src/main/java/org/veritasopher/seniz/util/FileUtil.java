package org.veritasopher.seniz.util;

import org.veritasopher.seniz.exception.type.InternalException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * File Util
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
public class FileUtil {

    public static String readFromFileInResource(String filePath) {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(filePath);

        String fileContent;
        try {
            assert inputStream != null;
            fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new InternalException("Cannot read file (%s).".formatted(filePath));
        }
        return fileContent;
    }

    /**
     * Write string text to file
     *
     * @param content string text
     * @param pathToFile path to file
     */
    public static void writeToFile(String content, Path pathToFile) {
        try {
            Files.createDirectories(pathToFile.getParent());

            Files.writeString(pathToFile, content);

            // Test writing
//            String fileContent = Files.readString(pathToFile);
//            System.out.println(fileContent);

        } catch (IOException e) {
            throw new InternalException("Cannot write to file (%s).".formatted(pathToFile));
        }
    }

    /**
     * Get complete resource file path
     *
     * @param filePath file path without resource path
     * @return complete resource file path
     */
    public static String getFilePathInResource(String filePath) {
        return Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(filePath)).getPath();
    }
}
