package com.example.androidforbeginner;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<Programmer> hotGitPersons = new ArrayList<Programmer>();
    Context context;

    public  RecyclerAdapter(ArrayList<Programmer> programmers, Context context){
        hotGitPersons = programmers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycle, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Programmer user = hotGitPersons.get(position);

        holder.avatar.setImageResource(user.avatar);
        holder.name.setText(user.name);
        holder.userName.setText(user.userName);
        holder.social.setText(user.social);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, user.name, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return hotGitPersons.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView avatar;
        TextView name;
        TextView userName;
        TextView social;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            userName = itemView.findViewById(R.id.username);
            social = itemView.findViewById(R.id.social);
            linearLayout = itemView.findViewById(R.id.hot_git_person_item_layout);
        }
    }
}
