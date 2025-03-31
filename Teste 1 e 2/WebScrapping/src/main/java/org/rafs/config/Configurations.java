package org.rafs.config;

public enum Configurations {


    DOWNLOAD_DIRECTORY(System.getProperty("user.dir") + "/downloads"),
    PDF_ZIP_FILE(System.getProperty("user.dir") + "/downloads/compressed_files.zip"),
    URL("https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos"),
    PDF_I_PATH(System.getProperty("user.dir") + "/downloads/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf"),
    CSV_FILE(DOWNLOAD_DIRECTORY.getValue() + "/result.csv"),
    CSV_ZIP_FILE(DOWNLOAD_DIRECTORY.getValue() + "/Teste_RafaelYudi.zip");

    private final String value;

    Configurations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}