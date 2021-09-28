package ex31;

import CustomUtils.*;
import java.util.ArrayList;


public class FitnessCalculator {
    double restingPulse;
    double age;

    public FitnessCalculator(int restingPulse, int age) {
        this.restingPulse = restingPulse;
        this.age = age;
    }

    // Returns the target heart rate given intensity (as a percentage)
    public int CalculateTargetHeartRate(double intensity) {
        return (int) Math.round(((220d - age - restingPulse) * intensity / 100d) + restingPulse);
    }

    public void PrintHeartRateTable(int minIntensity, int maxIntensity, int step) {
        ArrayList<String> columnNames = new ArrayList<String>();
        columnNames.add("Intensity");
        columnNames.add("Heart Rate");

        Table heartRateTable = new Table(columnNames);

        for (int i = minIntensity; i <= maxIntensity; i += step) {
            ArrayList<String> rowData = new ArrayList<String>();
            rowData.add(i + "%");

            int hr = CalculateTargetHeartRate(i);
            rowData.add(hr + " bpm");

            heartRateTable.AddRow(rowData);
        }

        heartRateTable.PrintTable();
    }
}
