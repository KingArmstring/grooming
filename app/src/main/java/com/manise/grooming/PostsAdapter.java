package com.manise.grooming;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private List<Post> posts;

    PostsAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    @NonNull
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PostsAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView postImage;
        TextView postText;
        ImageButton btnSave;
        ImageButton btnLike;
        ImageButton btnDislike;

        public MyViewHolder(View itemView) {
            super(itemView);

            postImage = itemView.findViewById(R.id.post_image);
            postText = itemView.findViewById(R.id.post_text);
            btnLike = itemView.findViewById(R.id.btn_like);
            btnSave = itemView.findViewById(R.id.btn_save);
            btnDislike = itemView.findViewById(R.id.btn_dislike);
        }
    }
}
