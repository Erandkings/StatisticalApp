package com.example.erand.statisticalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.pie_chart);

        ArrayList<PieEntry> arrayList = new ArrayList<>();
        arrayList.add(new PieEntry(12.0000f));
        PieDataSet pieDataSet = new PieDataSet(getData(), "Hello");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
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
        entries.add(new PieEntry(12f, "Mon"));
        entries.add(new PieEntry(13f, "Tues"));
        entries.add(new PieEntry(14f, "Wed"));
        entries.add(new PieEntry(15f, "Thurs"));
        entries.add(new PieEntry(16f, "Fri"));
        entries.add(new PieEntry(17f, "Sat"));
        entries.add(new PieEntry(18f, "Sun"));
        return entries;
    }
}
