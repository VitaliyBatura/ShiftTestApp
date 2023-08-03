package org.example.data;

public interface InputData {

    <T> T getValue();

    int compareTo(InputData o);
}
