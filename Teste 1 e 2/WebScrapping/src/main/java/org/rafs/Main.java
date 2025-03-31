package org.rafs;

import org.rafs.compressor.Compressor;
import org.rafs.compressor.ZipCompressor;
import org.rafs.config.Configurations;
import org.rafs.csv.CsvSaver;
import org.rafs.csv.SimpleCsvSaver;
import org.rafs.extractor.PdfDataExtractor;
import org.rafs.extractor.TabulaPdfDataExtractor;
import org.rafs.manager.DataExtractorManager;
import org.rafs.manager.WebScrapingManager;
import org.rafs.scrapper.JsoupWebScraper;
import org.rafs.scrapper.WebScraper;




public class Main {

    public static void executeTest1(){
        WebScraper scraper = new JsoupWebScraper();
        Compressor compressor = new ZipCompressor();

        WebScrapingManager manager = new WebScrapingManager(scraper, compressor);
        manager.executeScrapingAndCompression(
                Configurations.URL.getValue(), Configurations.DOWNLOAD_DIRECTORY.getValue(), Configurations.PDF_ZIP_FILE.getValue()
        );
    }

    public static void executeTest2(){
        Compressor compressor = new ZipCompressor();
        PdfDataExtractor pdfDataExtractor = new TabulaPdfDataExtractor();
        CsvSaver csvSaver = new SimpleCsvSaver();
        DataExtractorManager dataExtractorManager = new DataExtractorManager(compressor, pdfDataExtractor, csvSaver);

        dataExtractorManager.extractDataCsvZip(
                Configurations.PDF_I_PATH.getValue(),
                Configurations.CSV_FILE.getValue(),
                Configurations.CSV_ZIP_FILE.getValue()
        );
    }

    public static void main(String[] args) {
        executeTest1();
        executeTest2();
    }
}