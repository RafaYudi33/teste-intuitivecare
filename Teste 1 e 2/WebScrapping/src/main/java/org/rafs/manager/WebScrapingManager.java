package org.rafs.manager;

import org.rafs.compressor.Compressor;
import org.rafs.scrapper.WebScraper;

import java.util.List;

public class WebScrapingManager {
    private final WebScraper scraper;
    private final Compressor compressor;

    public WebScrapingManager(WebScraper webScrapper, Compressor compressor) {
        this.scraper = webScrapper;
        this.compressor = compressor;
    }

    public void executeScrapingAndCompression(String url,String downloadDirectory, String outputZipFileName) {
        List<String> downloadedFiles = scraper.downloadFiles(url, downloadDirectory);
        compressor.compressFiles(downloadedFiles, outputZipFileName);
    }
}
