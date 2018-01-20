package nl.hsleiden.politiebrochureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class StatistiekenActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistieken);

        barChart = findViewById(R.id.bar_graph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f, 0));
        barEntries.add(new BarEntry(44f, 1));
        barEntries.add(new BarEntry(44f, 2));
        barEntries.add(new BarEntry(44f, 3));
        barEntries.add(new BarEntry(44f, 4));

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("Januari");
        theDates.add("februari");
        theDates.add("maart");
        theDates.add("april");
        theDates.add("mei");

        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");

        BarData theData = new BarData(theDates, barDataSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }
}
