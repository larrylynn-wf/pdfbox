package org.apache.pdfbox.rendering;

import org.junit.Test;

import java.io.File;

public class TestPDFRenderer {

    public static final String type4_shading_pdf = "minimal.pdf";
    public static final String test_path = "/input/rendering/";

    @Test
    public void testConvertType4Shading() throws Exception {
        String filePath = this.getClass().getResource(test_path + type4_shading_pdf).getFile();
        File inputFile = new File(filePath);

        TestPDFToImage testPDFToImage = new TestPDFToImage(type4_shading_pdf);

        //testPDFToImage.doTestFile(inputFile, test_path, "target/test-output");
        testPDFToImage.testRenderImage();

    }
}
