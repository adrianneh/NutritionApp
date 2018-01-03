package adrianne.nutritionapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NutritionDBHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "Nutrition.db";
    public static String TABLE_NAME = "NUTRITION";
    public static int VERSION_NUM =1;
    public static final String KEY_ID = " _id";
    public static final String COL_CALORIES = "calories";
    public static final String COL_FAT = "fat";
    public static final String COL_CARBS = "carbohydrates";
    public static final String COL_DATE = "";

    public NutritionDBHelper(Context ctx) { super(ctx, DATABASE_NAME, null, VERSION_NUM);}
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_CALORIES + " VARCHAR2(10)"
                + COL_FAT + " VARCHAR2(10)"
                + COL_CARBS + " VARCHAR2(10)"
                + COL_DATE + " VARCHAR2(30)"
                + ");";
        db.execSQL(query);
        Log.i("NutritionDBHelper", "Calling onCreate");}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
        Log.i("NutritionDBHelper", "Calling onUpgrade, oldVersion = " + oldVer + "newVersion=" + newVer);

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVer, int newVer) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
        Log.i("NutritionDBHelper", "Calling onDowngrade, oldVersion = " + oldVer + "newVersion=" + newVer);

    }
}
