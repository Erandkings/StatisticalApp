package com.example.erand.statisticalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.pie_chart);

        ArrayList<PieEntry> arrayList = new ArrayList<>();
        arrayList.add(new PieEntry(6));

        PieDataSet pieDataSet = new PieDataSet(getData(), "");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        Description desc = new Description();
        desc.setText("Goal Tracker App");
        desc.setTextSize(30);
        desc.setPosition(400, 60);

//        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
//        String currentTime = time.format(new Date());
//
//        TextView textView = (TextView) findViewById(R.id.text_time);
//        textView.setText(currentTime);

//        String name = String.valueOf(Calendar.getInstance().getTime());
//        count = Integer.parseInt(name);

//        Date getCurrentTime = Calendar.getInstance().getTime();

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.setDescription(desc);
        pieChart.setRotationEnabled(false);
        pieChart.setHoleRadius(25f);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("2019 Goals");
        pieChart.setCenterTextSize(10);
        pieChart.animateXY(5000, 5000);
        pieChart.invalidate();


    }

    private ArrayList getData() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int count = 0; count < 500; count++) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            new Entry();
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(11, "Jan"));
        entries.add(new PieEntry(12, "Feb"));
        entries.add(new PieEntry(13, "Mar"));
        entries.add(new PieEntry(14, "April"));
        entries.add(new PieEntry(15, "May"));
//        entries.add(new PieEntry(16, "June"));
//        entries.add(new PieEntry(17, "July"));
//        entries.add(new PieEntry(18, "August"));
//        entries.add(new PieEntry(19, "September"));
//        entries.add(new PieEntry(20, "October"));
//        entries.add(new PieEntry(21, "November"));
//        entries.add(new PieEntry(22, "December"));
        return entries;
    }
}
