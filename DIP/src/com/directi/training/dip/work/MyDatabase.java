package com.directi.training.dip.work;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IDataStore {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void write(String inputString) {
        _data.put(++_count, inputString);
    }
}