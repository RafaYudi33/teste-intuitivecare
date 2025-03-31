package org.rafs.compressor;

import java.util.List;

public interface Compressor {
    void compressFiles(List<String> filePaths, String outputZipFile);
}
