package adrianne.nutritionapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class NutritionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        ListView listView = findViewById(R.id.lv_Nutrition);

    }


}
