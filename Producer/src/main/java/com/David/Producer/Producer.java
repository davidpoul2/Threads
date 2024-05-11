package com.David.Producer;

import com.David.SetAndGet.SetterGetter;

public class Producer implements Runnable{

    SetterGetter obj;

    public Producer(SetterGetter obj){
        this.obj = obj;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){

        int i = 0;
//        SetterGetter obj = new SetterGetter();
        while(true){
            obj.setter(i++);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
