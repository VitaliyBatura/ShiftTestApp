package org.example.iopackage;

import org.example.data.InputData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OutputFileWriter {

    public static void writeData(List<InputData> data, String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        for (InputData inputData : data) {
            lines.add(inputData.getValue().toString());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException ex) {
            throw new IOException("Error of writing to file " + fileName + ": " + ex.getMessage());
        }
    }
}
