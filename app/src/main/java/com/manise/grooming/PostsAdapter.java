package com.manise.grooming;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private List<Post> posts;
    private Context context;

    PostsAdapter(List<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @Override
    @NonNull
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PostsAdapter.MyViewHolder holder, int position) {
        holder.postImage.setImageDrawable(ContextCompat.getDrawable(context, posts.get(position).getImageResource()));
        holder.postText.setText(posts.get(position).getTextPost());
        holder.setButtonClickListeners();
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

        private void setButtonClickListeners() {
            btnLike.setOnClickListener(v -> {
                Toast.makeText(context, "dislike!!", Toast.LENGTH_SHORT).show();
            });

            btnDislike.setOnClickListener(v -> {
                Toast.makeText(context, "like!!", Toast.LENGTH_SHORT).show();
            });

            btnSave.setOnClickListener(v -> {
                Toast.makeText(context, "save!!", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
