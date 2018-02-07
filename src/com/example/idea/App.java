package com.example.idea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static com.example.idea.StreamsLambdas.producingStreams.Streams.show;

public class App {

    public static void main(String[] args) {

        Integer[] digitArray = {1,2,3,4,5};
        Stream<Integer> digitStream = Stream.of(digitArray);
        Stream<Integer> digStr = Arrays.stream(digitArray);

    }
}

