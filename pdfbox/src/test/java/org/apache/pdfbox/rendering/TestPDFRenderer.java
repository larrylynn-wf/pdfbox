package org.apache.pdfbox.rendering;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class TestPDFRenderer {

    public static final String type4_shading_pdf = "minimal.pdf";

    @Test
    public void testConvertType4Shading() throws Exception {
        InputStream is = this.getClass().getResourceAsStream("/input/rendering/minimal.pdf");
//        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//        URL resource = classloader.getResource("/rendering");
//        String filePath = resource.getFile();
//        File inputFile = new File(filePath);
        String filePath = this.getClass().getResource("/input/rendering/minimal.pdf").getFile();
        File inputFile = new File(filePath);


        TestPDFToImage.doTestFile(inputFile, "src/test/resources/input/rendering", "target/test-output");

    }
}
