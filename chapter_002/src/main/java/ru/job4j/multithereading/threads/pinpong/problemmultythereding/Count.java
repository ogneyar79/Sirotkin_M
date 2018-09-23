package ru.job4j.multithereading.threads.pinpong.problemmultythereding;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class Count {

    @GuardedBy("this")
    private int value;

    public void increment() {
        this.value++;
    }

    public int get() {
        return this.value;
    }
}
