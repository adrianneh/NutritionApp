package adrianne.nutritionapp;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NutritionActivity extends Activity {

    private SQLiteDatabase db;
    private Cursor cursor;
    private ArrayList<String> calsArray = new ArrayList<String>();
    private ArrayList<String> fatArray = new ArrayList<String>();
    private ArrayList<String> carbsArray = new ArrayList<String>();
    private ArrayList<String> dateArray = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        ListView listView = findViewById(R.id.lv_Nutrition);

        NutritionDBHelper dbHelper = new NutritionDBHelper(this);
        db = dbHelper.getWritableDatabase();

        cursor = db.rawQuery("SELECT * from "+ NutritionDBHelper.TABLE_NAME, null);
        int colIndCals = cursor.getColumnIndex(NutritionDBHelper.COL_CALORIES);
        int colIndCarbs = cursor.getColumnIndex(NutritionDBHelper.COL_CARBS);
        int colIndFat = cursor.getColumnIndex(NutritionDBHelper.COL_FAT);
        int colIndDate = cursor.getColumnIndex(NutritionDBHelper.COL_DATE);

        //nutritionAdapter = new NutritionAdapter(this);
       // listView.setAdapter(nutritionAdapter);

        while(cursor.moveToNext()){
            String cals = cursor.getString(colIndCals);
            String carbs = cursor.getString(colIndCarbs);
            String fat = cursor.getString(colIndFat);
            String date = cursor.getString(colIndDate);
            calsArray.add(cals);
            carbsArray.add(carbs);
            fatArray.add(fat);
            dateArray.add(date);

        }
    }


}
