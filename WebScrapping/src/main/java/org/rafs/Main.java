package org.rafs;

import org.rafs.compressor.Compressor;
import org.rafs.compressor.ZipCompressor;
import org.rafs.config.Configurations;
import org.rafs.manager.WebScrapingManager;
import org.rafs.scrapper.JsoupWebScraper;
import org.rafs.scrapper.WebScraper;


public class Main {
    public static void main(String[] args) {
        WebScraper scraper = new JsoupWebScraper();
        Compressor compressor = new ZipCompressor();

        String url = Configurations.URL.getValue();
        String downloadDirectory = Configurations.DOWNLOAD_DIRECTORY.getValue();
        String outputZipFileName = Configurations.OUTPUT_ZIP_FILE.getValue();

        WebScrapingManager manager = new WebScrapingManager(scraper, compressor, downloadDirectory, outputZipFileName);
        manager.executeScrapingAndCompression(url);
    }
}