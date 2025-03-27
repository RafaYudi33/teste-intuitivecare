package org.rafs.scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JsoupWebScraper implements WebScraper {

    private final Logger logger = Logger.getLogger(String.valueOf(JsoupWebScraper.class));

    @Override
    public List<String> downloadFiles(String url, String downloadDirectory) {
        List<String> downloadedFilePaths = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href$='.pdf']:contains(Anexo I), a[href$='.pdf']:contains(Anexo II)");

            for (Element link : links) {
                String fileUrl = link.absUrl("href");
                String fileName = fileUrl.substring(fileUrl.lastIndexOf('/') + 1);
                File downloadFile = new File(downloadDirectory, fileName);
                downloadedFilePaths.add(downloadFile.getAbsolutePath());

                downloadPdf(fileUrl, downloadFile);
            }
        } catch (IOException e) {
            logger.severe("Failed to download files: " + e.getMessage());
        }
        logger.info("Download complete");
        return downloadedFilePaths;
    }

    private void downloadPdf(String fileUrl, File downloadFile) {

        try (InputStream in = new URL(fileUrl).openStream();
            ReadableByteChannel rbc = Channels.newChannel(in);
            FileOutputStream fos = new FileOutputStream(downloadFile)) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            logger.info("Downloaded: " + downloadFile.getPath());

        } catch (IOException e) {
            logger.severe("Error downloading file: " + downloadFile + " - " + e.getMessage());
        }
    }


}
