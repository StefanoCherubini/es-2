package es_2;


public class MioThread extends Thread {
    int ind;
    int[]array = new int[10];

    MioThread(int ind, int[] array)
    {
       this.ind = ind;
       this.array = array;
    }
}   
