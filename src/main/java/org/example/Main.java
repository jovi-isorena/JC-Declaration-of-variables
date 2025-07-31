package org.example;

public class Main {
    // Static variables
    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection";
    // Instance variables
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1_234.95;

    public static void main(String[] args) {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";
        Main mainObject = new Main();

        System.out.println("Local Variables:");
        System.out.println("\tlocalDecimal = " + localDecimal);
        System.out.println("\tlocalHex = " + localHex);
        System.out.println("\tlocalBinary = " + localBinary);
        System.out.println("\tlocalOctal = " + localOctal);
        System.out.println("\tlocalLong = " + localLong);
        System.out.println("\tlocalString = " + localString);
        System.out.println("\nInstance Variables:");
        System.out.println("\tinstanceBinary = " + mainObject.instanceBinary);
        System.out.println("\tinstanceOctal = " + mainObject.instanceOctal);
        System.out.println("\tinstanceDouble = " + mainObject.instanceDouble);
        System.out.println("\nStatic Variables:");
        System.out.println("\tstaticHex = " + staticHex);
        System.out.println("\tstaticByte = " + staticByte);
        System.out.println("\tstatingString = " + staticString);
    }
}