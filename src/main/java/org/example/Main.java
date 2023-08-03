package org.example;

import org.example.data.DataParser;
import org.example.data.InputData;
import org.example.data.IntegerDataParser;
import org.example.data.StringDataParser;
import org.example.iopackage.CmdParser;
import org.example.iopackage.InputFileReader;
import org.example.iopackage.OutputFileWriter;
import org.example.sort.MergeSorter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            CmdParser cmdParser = new CmdParser(args);
            DataParser dataParser = null;
            switch (cmdParser.getDataType()) {
                case STRING:
                    dataParser = new StringDataParser();
                    break;
                case INTEGER:
                    dataParser = new IntegerDataParser();
                    break;
            }
            InputFileReader inputFileReader = new InputFileReader(dataParser);
            MergeSorter mergeSorter = new MergeSorter(inputFileReader, cmdParser.getSortMode());
            List<InputData> result = mergeSorter.sort(cmdParser.getInputFiles());
            OutputFileWriter.writeData(result, cmdParser.getOutputFile());
        } catch (IllegalArgumentException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}