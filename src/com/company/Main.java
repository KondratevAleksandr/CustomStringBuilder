package com.company;

public class Main {

    public static void main(String[] args) {

        CustomStringBuilder builder = new CustomStringBuilder();
        builder.append("Hello");
        System.out.println(builder);
        System.out.println(builder.append(" World"));
        builder.undo();
        System.out.println(builder.replace(0, 5, "Hi"));
        builder.undo();
        System.out.println(builder);
    }
}
