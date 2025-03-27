package org.rafs.config;

public enum Configurations {

    DOWNLOAD_DIRECTORY("C:\\Users\\rafay\\Downloads"),
    OUTPUT_ZIP_FILE("C:\\Users\\rafay\\Downloads\\compressed_files.zip"),
    URL("https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos");

    private final String value;

    Configurations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}