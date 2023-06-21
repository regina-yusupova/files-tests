package com.yusupova;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class XlsxTest {

    @Test
    public void simpleXlsxTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("XLSX_file.xlsx");
        XLS xlsFile = new XLS(stream);
        String value = xlsFile.excel.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
        System.out.println(value);
    }

}
