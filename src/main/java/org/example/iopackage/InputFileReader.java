package org.example.iopackage;

import org.example.data.DataParser;
import org.example.data.InputData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final DataParser dataParser;

    public FileReader(DataParser dataParser) {
        this.dataParser = dataParser;
    }

    public List<InputData> readFile(String fileName) throws IOException {
        List<InputData> result = new ArrayList<>();
        
    }
}
