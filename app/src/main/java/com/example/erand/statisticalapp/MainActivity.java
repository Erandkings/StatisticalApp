package com.example.erand.statisticalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.pie_chart);

        ArrayList<PieEntry> arrayList = new ArrayList<>();
        arrayList.add(new PieEntry(12f));

        PieDataSet pieDataSet = new PieDataSet(getData(), "Result of your activities for this year");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        Description desc = new Description();
        desc.setText("Goal Tracker App");

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
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(25f);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("Your Goal for this week");
        pieChart.setCenterTextSize(10);
        pieChart.animateXY(5000, 5000);
        pieChart.invalidate();

    }

    private ArrayList getData() {
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(11, "Jan"));
        entries.add(new PieEntry(12, "Feb"));
        entries.add(new PieEntry(13, "Mar"));
        entries.add(new PieEntry(14, "April"));
        entries.add(new PieEntry(15, "May"));
        entries.add(new PieEntry(16, "June"));
        entries.add(new PieEntry(17, "July"));
        entries.add(new PieEntry(18, "August"));
        entries.add(new PieEntry(19, "September"));
        entries.add(new PieEntry(20, "October"));
        entries.add(new PieEntry(21, "November"));
        entries.add(new PieEntry(22, "December"));
        return entries;
    }
}
