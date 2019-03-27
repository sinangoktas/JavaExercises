package com.practices.tij4.Initialisation;

public class MainWithVarArgs {

    public static void main(String... args) {
        args = new String[]{"ab", "cd", "ef"};
        VarArgString.printStrings(args);
        System.out.println();
        args = new String[]{"v", "g"};
        VarArgString.printStrings(args);

    }
}
