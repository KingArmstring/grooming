package com.manise.grooming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView rvPosts;

    private List<Post> posts = new ArrayList<>();
    private PostsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        rvPosts = findViewById(R.id.rv_posts);
        fillList();
        setupList();
    }

    private void setupList() {
        adapter = new PostsAdapter(posts, this);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        rvPosts.setAdapter(adapter);
    }

    private void fillList() {
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
        posts.add(new Post("This is placeholder text for the post content", R.drawable.ic_doggy));
    }

}