package com.pass.args;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Executing from the main class, args.length: " + args.length);

        if (args.length == 0) {
            System.exit(0);
        }

        if (args.length == 1) {
            System.out.println(args[0]);
            String[] s = args[0].split(" ");
            Arrays.stream(s).forEach(System.out::println);
            return;
        }

        Arrays.stream(args).forEach(System.out::println);
    }
}
