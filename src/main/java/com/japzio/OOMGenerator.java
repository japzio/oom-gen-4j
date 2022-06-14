package com.japzio;

public class OOMGenerator {

    /**
     * @author Crunchify.com
     * @throws Exception
     *
     */

    public static void main(String[] args) throws Exception {
        OOMGenerator memoryTest = new OOMGenerator();
        memoryTest.generateOOM();
    }

    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\n=================> OOM test started..\n");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            // feel memoryFillIntVar array in loop..
            System.out.println("array length : " + memoryFillIntVar.length);
            iteratorValue = iteratorValue * 5;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }

}
