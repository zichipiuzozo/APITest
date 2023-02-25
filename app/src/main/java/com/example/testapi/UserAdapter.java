package com.example.testapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserItemViewHolder> {
    private List<User> users;
    private Context context;

    public UserAdapter(List<User> users, Context c){
        this.users = users;
        this.context = c;
    }

    @Override
    public int getItemCount(){
        return users.size();
    }

    @Override
    public UserItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);

        return new UserItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserItemViewHolder holder,int position){
        User u = users.get(position);
        holder.tvName.setText(u.name);
        holder.tvDes.setText(String.valueOf(u.description));
    }

    public static class UserItemViewHolder extends RecyclerView.ViewHolder{
        public TextView tvName;
        public TextView tvDes;


        public UserItemViewHolder(View itemView){
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_login_name);
            tvDes = (TextView) itemView.findViewById(R.id.tv_id);
        }
    }
}
