package com.example.klinetest;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.example.klinetest.data.KLineModelTemp;
import com.example.klinetest.data.KlineData;
import com.example.klinetest.fedata.FeKLineData;
import com.example.klinetest.fedata.FeKLineModelTemp;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends DemoBase {
    public static final String TAG = "KlineTest";
    private CandleStickChart mChart;
    private List<FeKLineModelTemp> kLines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        initData();
        initChart();
        initView();
    }

    private void initView() {
        mChart.resetTracking();
        //添加y轴数据集
        ArrayList<CandleEntry> yVals1 = new ArrayList<CandleEntry>();
        ArrayList<String> xVals = new ArrayList<String>();
        for(int i = 0 ;i< 100;i++){
            FeKLineModelTemp kLineModelTemp = kLines.get(i);
            yVals1.add(new CandleEntry(i,(float) kLineModelTemp.getHigh(),
                    (float) kLineModelTemp.getLow(),
                    (float) kLineModelTemp.getOpen(),
                    (float) kLineModelTemp.getClose()));
        }

       int prog = 100;
        /*for (int i = 0; i < prog; i++) {
            float mult = 10;
            float val = (float) (Math.random() * 40) + mult;

            float high = (float) (Math.random() * 9) + 8f;
            float low = (float) (Math.random() * 9) + 8f;

            float open = (float) (Math.random() * 6) + 1f;
            float close = (float) (Math.random() * 6) + 1f;

            boolean even = i % 2 == 0;

            yVals1.add(new CandleEntry(i, val + high, val - low, even ? val + open : val - open,
                    even ? val - close : val + close));
        }*/

        for (int i = 0; i < 100; i++) {
            xVals.add("" + (1990 + i));
        }
        CandleDataSet set1 = new CandleDataSet(yVals1, "Data Set");
        set1.setAxisDependency(YAxis.AxisDependency.LEFT);
//        set1.setColor(Color.rgb(80, 80, 80));

        set1.setShadowWidth(0.8f);
        set1.setShadowColorSameAsCandle(true);
        set1.setDecreasingColor(Color.RED);
        set1.setDecreasingPaintStyle(Paint.Style.FILL);
        set1.setIncreasingColor(Color.rgb(122, 242, 84));
        set1.setIncreasingPaintStyle(Paint.Style.FILL);
        //set1.setHighlightLineWidth(1f);

        CandleData data = new CandleData(xVals, set1);

        mChart.setData(data);
        mChart.invalidate();
    }

    private void initData() {
        kLines = FeKLineData.getAllKLine();
        Log.d(TAG, "kLine size = "+kLines.size());
        for (int i = 0; i < kLines.size(); i++) {
            Log.d(TAG, "kLines: " + kLines.get(i).toString());
        }
    }

    private void initChart() {
        mChart = (CandleStickChart) findViewById(R.id.chart);
        mChart.setDescription("K线");
        mChart.setMaxVisibleValueCount(500);
        mChart.setPinchZoom(true);
        mChart.setScaleYEnabled(false);

        mChart.setDrawGridBackground(true);
        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        //x轴距Label的距离
        xAxis.setSpaceBetweenLabels(2);
        //是否画表格线
        xAxis.setDrawGridLines(true);

        YAxis leftAxis = mChart.getAxisLeft();
//        leftAxis.setEnabled(false);
        leftAxis.setLabelCount(15, false);
        leftAxis.setDrawGridLines(true);
        leftAxis.setDrawAxisLine(true);
        leftAxis.setStartAtZero(false);

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setEnabled(false);
        mChart.getLegend().setEnabled(false);
    }
}
