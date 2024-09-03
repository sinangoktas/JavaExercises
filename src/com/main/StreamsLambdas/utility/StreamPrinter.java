package com.main.StreamsLambdas.utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrinter {

    /**
     Displays the first ten values in a stream, followed by ...
     if there are additional values.
     @param caption the caption preceding the values
     @param stream the stream to be displayed (which is consumed
     in the process)
     */
    public static <T> void show(String caption, Stream<T> stream)
    {
        final int SHOW_LIMIT = 10;
        List<T> values = stream.limit(SHOW_LIMIT + 1).toList();
        System.out.print(caption + ": ");
        for (int i = 0; i < Math.min(SHOW_LIMIT, values.size()); i++)
        {
            if (i > 0) { System.out.print(", "); }
            System.out.print(values.get(i));
        }
        if (values.size() > SHOW_LIMIT) { System.out.print(", ..."); }
        System.out.println();
    }
}
