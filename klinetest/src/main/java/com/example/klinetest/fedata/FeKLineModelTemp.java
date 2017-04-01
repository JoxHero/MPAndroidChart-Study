package com.example.klinetest.fedata;

/**
 * Created by zyp on 2017/3/27.
 */

public class FeKLineModelTemp {
    /**
     * close : 0.70526
     * open : 0.70527
     * high : 0.70527
     * low : 0.70526
     * date : 1490571000000
     * code : NZD/USD
     * interval : 300
     */

    private double close;
    private double open;
    private double high;
    private double low;
    private long date;
    private String code;
    private int interval;

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
