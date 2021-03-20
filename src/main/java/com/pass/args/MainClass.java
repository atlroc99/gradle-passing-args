package com.pass.args;

import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\nExecuting from the main class, args.length: " + args.length);
        System.out.println("\nprint from stream");

        Arrays.stream(args).forEach(System.out::println);

        Properties properties = System.getProperties();
//        Stream.of(properties).forEach(System.out::println);
        System.out.println(System.getProperty("simple.message") + " : " + args[0] + " from simple");
    }
}
