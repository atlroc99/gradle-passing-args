package com.pass.args;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\nExecuting from the main class, args.length: " + args.length);
        System.out.println("\nprint from stream");

        Arrays.stream(args).forEach(System.out::println);

        if (args.length != 2) {
            System.exit(0);
        }

        System.out.println("-----------------------------------");
        String sourcePath = args[0].trim();
        String destinationPath = args[1].trim();

        System.out.println("sourcrePath: " + sourcePath);
        System.out.println("destinatinoPath: " + destinationPath);
    }
}
