package com.jxnu.fundCrawler.business.grabThread;

import com.jxnu.fundCrawler.business.grabThread.specific.Grab;

/**
 * Created by coder on 2017/11/11.
 */
public class CrobThread implements Runnable {
    private Grab grab;
    private Integer num;

    public CrobThread(Grab grab, Integer num) {
        this.grab = grab;
        this.num = num;
    }

    @Override
    public void run() {
        this.grab.hander(this.num);
    }
}
