package com.David;

import com.David.Consumer.Consumer;
import com.David.Producer.Producer;
import com.David.SetAndGet.SetterGetter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        SetterGetter obj = new SetterGetter();
        new Producer(obj);
        new Consumer(obj);

    }


}