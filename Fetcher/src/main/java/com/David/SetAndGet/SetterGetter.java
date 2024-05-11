package com.David.SetAndGet;

public class SetterGetter {


    int val;
    boolean isVisited ;
    public synchronized void setter(int val)
    {
        while(isVisited){
            try{wait();}catch (Exception e){}
        }
       this.val = val;
        System.out.println("Producer : " + val);
        isVisited = true;
        notify();

    }

    public synchronized void getter()
    {
        while(!isVisited){
            try{wait();}catch (Exception e){}
        }

        System.out.println("Consumer : " + val);
        isVisited = false;
        notify();
    }
}
