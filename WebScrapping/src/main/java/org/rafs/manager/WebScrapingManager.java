package org.rafs.manager;

import org.rafs.compressor.Compressor;
import org.rafs.scrapper.WebScraper;

import java.util.List;

public class WebScrapingManager {
    private final WebScraper scraper;
    private final Compressor compressor;
    private final String downloadDirectory;
    private final String outputZipFileName;

    public WebScrapingManager(WebScraper webScrapper, Compressor compressor, String downloadDirectory, String outputZipFileName) {
        this.scraper = webScrapper;
        this.compressor = compressor;
        this.downloadDirectory = downloadDirectory;
        this.outputZipFileName = outputZipFileName;
    }

    public void executeScrapingAndCompression(String url) {
        List<String> downloadedFiles = scraper.downloadFiles(url, downloadDirectory);
        compressor.compressFiles(downloadedFiles, outputZipFileName);
    }
}
