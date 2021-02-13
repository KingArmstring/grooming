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


    /**
     * onCreate is the first method to be executed in the Activity.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //connecting the view(xml) to the java code.
        setContentView(R.layout.activity_feed);

        //referencing the recyclerView widget.
        rvPosts = findViewById(R.id.rv_posts);
        //calling the methods to setup the list and fill the data
        fillList();
        setupList();
    }

    /**
     * Setting up the recyclerView which is the list in Android.
     */
    private void setupList() {
        adapter = new PostsAdapter(posts, this);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        rvPosts.setAdapter(adapter);
    }

    /**
     * Dummy data to test the list
     */
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