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

    /**
     * Constructor
     * @param posts
     * @param context
     */
    PostsAdapter(List<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    /**
     * Inflating the xml layout.
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    @NonNull
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list_item, parent, false));
    }

    //binding(connecting) the data to the views of the list.
    @Override
    public void onBindViewHolder(PostsAdapter.MyViewHolder holder, int position) {
        holder.postImage.setImageDrawable(ContextCompat.getDrawable(context, posts.get(position).getImageResource()));
        holder.postText.setText(posts.get(position).getTextPost());
        holder.setButtonClickListeners();
    }

    //returning the count of the item being viewed in the list.
    @Override
    public int getItemCount() {
        return posts.size();
    }

    //ViewHolder of the recyclerView.
    class MyViewHolder extends RecyclerView.ViewHolder {

        //declaring all views of the list item layout xml.
        ImageView postImage;
        TextView postText;
        ImageButton btnSave;
        ImageButton btnLike;
        ImageButton btnDislike;

        public MyViewHolder(View itemView) {
            super(itemView);

            //referencing the views of the list item xml layout (see post_list_item)
            postImage = itemView.findViewById(R.id.post_image);
            postText = itemView.findViewById(R.id.post_text);
            btnLike = itemView.findViewById(R.id.btn_like);
            btnSave = itemView.findViewById(R.id.btn_save);
            btnDislike = itemView.findViewById(R.id.btn_dislike);
        }

        /**
         * Buttons click handlers
         */
        private void setButtonClickListeners() {
            //Like button click handler
            btnLike.setOnClickListener(v -> {
                //showing simple placeholder message to the user when the like button gets clicked
                Toast.makeText(context, "dislike!!", Toast.LENGTH_SHORT).show();
            });

            //Dislike button click handler
            btnDislike.setOnClickListener(v -> {
                //showing simple placeholder message to the user when the dislike button gets clicked
                Toast.makeText(context, "like!!", Toast.LENGTH_SHORT).show();
            });

            //Save button click handler
            btnSave.setOnClickListener(v -> {
                //showing simple placeholder message to the user when the save button gets clicked
                Toast.makeText(context, "save!!", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
