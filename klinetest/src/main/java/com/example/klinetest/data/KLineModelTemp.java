package com.example.klinetest.data;

/**
 * Created by zyp on 2017/3/22.
 */

public class KLineModelTemp {
    /**
     * code 合约代码
     */
    private String code;
    /**
     * open 开盘价
     */
    private float open;
    /**
     * high 最高价
     */
    private float high;
    /**
     * low 最低价
     */
    private float low;
    /**
     * close 收盘价
     */
    private float close;
    /**
     * pricechg涨跌幅
     */
//        private float pricechg;
    /**
     * pricechgrate涨跌百分比
     */
//        private float pricechgrate;
    /**
     * volume 成交量
     */
    private int volume;
    /**
     * lastvol 上一个成交量
     */
    private int lastVol;
    /**
     * date 日期
     */
    private long date;
    /**
     * tradingDay 交易日
     */
    private long tradingDay;
    /**
     * interval 周期（秒）
     */
    private int interval;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getLastVol() {
        return lastVol;
    }

    public void setLastVol(int lastVol) {
        this.lastVol = lastVol;
    }

    public long getTradingDay() {
        return tradingDay;
    }

    public void setTradingDay(long tradingDay) {
        this.tradingDay = tradingDay;
    }

    @Override
    public String toString() {
        return "KLinesModel{" +
                "code='" + code + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
//                    ", pricechg=" + pricechg +
//                    ", pricechgrate=" + pricechgrate +
                ", volume=" + volume +
                ", lastVol=" + lastVol +
                ", date=" + date +
                ", tradingDay=" + tradingDay +
                ", interval=" + interval +
                '}';
    }
}
