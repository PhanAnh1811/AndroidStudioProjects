package com.example.sqlite.adapter;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.sqlite.database.DBManager;
import com.example.sqlite.model.Student;

import java.util.List;

public class MyCustomAdapter extends ArrayAdapter {
    private Context context;
    private int resouce;
    private  List<Student> studentList;

    public MyCustomAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resouce=resource;
        this.studentList=objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        return super.getView(position,convertView,parent);
    }
}
