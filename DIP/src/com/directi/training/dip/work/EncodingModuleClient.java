package com.directi.training.dip.work;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // File encoding
        IDataSource fileSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataStore fileDataStore = new MyDatabase(); // This could be a file writer implementation
        EncodingModule fileEncodingModule = new EncodingModule(fileSource, fileDataStore);
        fileEncodingModule.encode();

        // Network encoding
        IDataSource networkSource = new NetworkDataSource("http://myfirstappwith.appspot.com/index.html");
        EncodingModule networkEncodingModule = new EncodingModule(networkSource, fileDataStore);
        networkEncodingModule.encode();
    }
}
