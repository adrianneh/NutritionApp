package adrianne.nutritionapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button dailySummaryBtn = findViewById(R.id.summaryBtn);
        Button addItemBtn = findViewById(R.id.addItemBtn);

        dailySummaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, DisplaySummaryActivity.class);
                startActivityForResult(intent, 10);
            }
        });

        addItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, NutritionActivity.class);
                startActivityForResult(intent, 10);
            }
        });
    }
}
