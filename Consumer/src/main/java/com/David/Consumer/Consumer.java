package com.David.Consumer;

import com.David.SetAndGet.SetterGetter;

public class Consumer implements Runnable{

    SetterGetter obj;

    public Consumer(SetterGetter obj) {
        this.obj = obj;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
//        SetterGetter obj = new SetterGetter();

        while(true){
//            System.out.println("Consumer : " +obj.getter());
            obj.getter();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
