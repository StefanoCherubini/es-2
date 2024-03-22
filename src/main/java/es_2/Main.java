package es_2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int [10];
        MioThread[] at = new MioThread [10];

        for(int i=0; i<at.length; i++){
            at[i] = new MioThread(i,array);
        }
        
        for(int i=0; i<10; i++){
        at.start();
        try {
            at.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    
        }

        

























     }
}