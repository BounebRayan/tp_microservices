package com.directi.training.dip.work;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final IDataSource dataSource;
    private final IDataStore dataStore;

    public EncodingModule(IDataSource dataSource, IDataStore dataStore) {
        this.dataSource = dataSource;
        this.dataStore = dataStore;
    }

    public void encode() throws IOException {
        String inputString = dataSource.readData();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        dataStore.write(encodedString);
    }
}
