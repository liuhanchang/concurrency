package com.mmall.concurrency.example.SyncContainer;

import java.util.Vector;

public class VectorExample2 {

    private static Vector<Integer> vector=new Vector<>();

    public static void main(String[] args) {
        while(true){
            for (int i = 0; i <10 ; i++) {
                vector.add(i);
            }

            Thread t1 = new Thread() {
                public void run() {
                    for (int i = 0; i <10 ; i++) {
                        vector.remove(i);
                    }
                }
            };
            Thread t2 = new Thread() {
                public void run() {
                    for (int i = 0; i <10 ; i++) {
                        vector.get(i);
                    }
                }
            };


            t1.start();
            t2.start();
        }
    }

}
