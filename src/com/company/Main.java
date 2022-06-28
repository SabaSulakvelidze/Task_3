package com.company;

import static com.company.Task3.VersionSteps.*;

public class Main {

    public static void main(String[] args) {
        printVersion(Version1.factorRecords());
    }

    //Task3
    public static <F> void printVersion(F[] vectorElement){
        for (F f:vectorElement){
            System.out.println(f);
        }
    }
}
