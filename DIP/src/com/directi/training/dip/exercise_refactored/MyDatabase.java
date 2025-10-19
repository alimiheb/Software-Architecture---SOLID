package com.directi.training.dip.exercise;

public class MyDatabase implements IDataWriter {
    private static MyDatabase instance;
    private StringBuilder stringBuilder;

    private MyDatabase() {
        stringBuilder = new StringBuilder();
    }

    public static MyDatabase getInstance() {
        if (instance == null) {
            instance = new MyDatabase();
        }
        return instance;
    }

    @Override
    public void write(String encoded) {
        stringBuilder.append(encoded);
    }

    public String toString() {
        return stringBuilder.toString();
    }
}