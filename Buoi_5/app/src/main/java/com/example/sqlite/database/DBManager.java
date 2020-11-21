package com.example.sqlite.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.sqlite.model.Student;

public class DBManager extends SQLiteOpenHelper {
    //Tên cơ sở dữ liệu
    public static final String DATABASE_NAME="students_db";
    //Tên bảng
    public static final String TABLE_NAME="student";
    //Bảng gồm 3 cột _id,_name,_class
    public static final String ID="_id";
    public static final String NAME="student_name";
    public static final String CLASS="student_class";
    private Context context;

    private static final String DATABASE_CREATE=""+
            "TABLE"+TABLE_NAME+" ( "
            +ID+" integer primary key autoincrement ,"
            +NAME+" text not null, "
            +CLASS+" text not null );";

    public DBManager(Context context){
        super(context,DATABASE_NAME,null,1);
        this.context=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
        Toast.makeText(context,"Dropped DB",Toast.LENGTH_SHORT).show();
    }
    public void addStudent(Student student) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(ID, student.getmStudentId());
        values.put(NAME, student.getmStudentName());
        values.put(CLASS, student.getmStudentClass());


        db.insert(TABLE_NAME, null, values);
        db.close();
    }
}
