package com.yusupova;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class PdfTest {

    @Test
    public void junitPDFTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("Pdf_file.pdf");
        PDF pdfFile = new PDF(stream);
        assertThat(pdfFile.text).contains("Заявка на оказание транспортно-экспедиторских услуг");
    }
}
