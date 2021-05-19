package com.example.androidforbeginner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    View view;
    Context context;
    ArrayList<Programmer> hotGitProgrammers;

    public  GridViewAdapter(ArrayList<Programmer> persons, Context context){
        this.hotGitProgrammers = persons;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hotGitProgrammers.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            view = new View(context);
            view = layoutInflater.inflate(R.layout.layout_gridview,null);
            TextView userNameView = view.findViewById(R.id.username_gridview);
            ImageView avatarImage = view.findViewById(R.id.avatar_gridview);



            userNameView.setText(hotGitProgrammers.get(position).userName);
            avatarImage.setImageResource(hotGitProgrammers.get(position).avatar);
        }
        return view;
    }
}
