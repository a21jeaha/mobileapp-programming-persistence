package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button readButton;
    private Button writeButton;

    private EditText insertName;
    private EditText insertAge;
    private EditText insertHight;

    private TextView textToDB;

    private SQLiteDatabase db;
    private AssignmentDB databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new AssignmentDB(this);                                // Databas skapad
        db = databaseHelper.getWritableDatabase();                                      // möjliggör ändringar i databasen

        readButton = findViewById(R.id.Read_Button);
        writeButton = findViewById(R.id.Write_Button);

        insertName = findViewById(R.id.database_insert_Name);
        insertAge = findViewById(R.id.database_insert_Age);
        insertHight = findViewById(R.id.database_insert_Hight);

        textToDB = findViewById(R.id.texttodb);

        readButton.setOnClickListener(new View.OnClickListener() {        // GÖR KLART SENARE
            @Override
            public void onClick(View v) {



            }
        });

        writeButton.setOnClickListener(new View.OnClickListener() {        // registrarar klick
            @Override
            public void onClick(View v) {
                addToDB();
            }
        });

    }
    private long addToDB(){                                                // sätter in de värden som finns skrivna i EditText rutorna vid klick.

        ContentValues values = new ContentValues();
        values.put(AssignmentDB.COLUMN_NAMN, insertName.getText().toString());
        values.put(AssignmentDB.COLUMN_AGE, insertAge.getText().toString());
        values.put(AssignmentDB.COLUMN_HIGHT, insertHight.getText().toString());

        return db.insert(databaseHelper.TABLE_PEOPLE, null, values);

    }
}
