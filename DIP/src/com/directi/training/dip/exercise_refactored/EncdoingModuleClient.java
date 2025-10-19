package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) {
        IDataReader reader = new FileReader("beforeEncryption.txt");
        IDataWriter writer = MyDatabase.getInstance();
        
        EncodingModule encodingModule = new EncodingModule(reader, writer);
        encodingModule.encode();
    }
}