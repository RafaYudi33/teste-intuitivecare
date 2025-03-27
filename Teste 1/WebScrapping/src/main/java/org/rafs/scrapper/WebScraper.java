package org.rafs.scrapper;

import java.util.List;

public interface WebScraper {
    List<String> downloadFiles(String url, String downloadDirectory);
}
