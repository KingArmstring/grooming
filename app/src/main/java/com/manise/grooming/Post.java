package com.manise.grooming;

public class Post {

    private String textPost;
    private int imageResource;
    private boolean isLiked = false;
    private boolean isDisliked = false;
    private boolean isSaved = false;

    public Post(String textPost, int imageResource) {
        this.textPost = textPost;
        this.imageResource = imageResource;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
