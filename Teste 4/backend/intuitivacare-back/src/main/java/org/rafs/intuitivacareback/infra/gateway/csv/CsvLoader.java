package org.rafs.intuitivacareback.infra.gateway.csv;

import java.util.List;

public interface CsvLoader <T>{
    List<T> load(String path);
}
