package com.yusupova;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class TxtTest {

    @Test
    public void junitPDFTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // InputStream stream = classLoader.getResourceAsStream("Txt_file.txt");
        String result;

        try (InputStream is = classLoader.getResourceAsStream("Txt_file.txt")) {
            result = new String(is.readAllBytes(), "UTF-8");
        }

        assertThat(result).contains("Lorem ipsum dolor sit amet,");
    }
}
