package org.example.data;

public class IntegerDataParser implements DataParser {

    @Override
    public IntegerData parseLine(String line) {
        try {
            int value = Integer.parseInt(line);
            return new IntegerData(value);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Integer data in line: " + line);
            return null;
        }
    }
}
