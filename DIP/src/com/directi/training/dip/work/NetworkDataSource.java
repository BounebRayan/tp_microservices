package com.directi.training.dip.work;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements IDataSource {
    private final String urlString;

    public NetworkDataSource(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String readData() throws IOException {
        StringBuilder data = new StringBuilder();
        URL url = new URL(urlString);
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                data.append((char) c);
            }
        }
        return data.toString();
    }
}
