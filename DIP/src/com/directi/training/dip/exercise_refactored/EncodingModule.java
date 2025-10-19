package com.directi.training.dip.exercise;

public class EncodingModule {
    private IDataReader reader;
    private IDataWriter writer;

    public EncodingModule(IDataReader reader, IDataWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() {
        String content = reader.read();
        if (content != null) {
            String encoded = Base64.getEncoder().encodeToString(content.getBytes());
            writer.write(encoded);
        }
    }
}