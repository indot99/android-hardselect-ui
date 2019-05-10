package org.richcode.hardselect.Data;

import android.graphics.drawable.Drawable;

public class FeedData {

    int feedId;
    int userId;
    int count;
    int left_count;
    int right_count;
    String user_name;
    String left_content;
    String right_content;

    public FeedData(int feedId, int userId, int count, int left_count, int right_count, String user_name, String left_content, String right_content) {
        this.feedId = feedId;
        this.userId = userId;
        this.count = count;
        this.left_count = left_count;
        this.right_count = right_count;
        this.user_name = user_name;
        this.left_content = left_content;
        this.right_content = right_content;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLeft_count() {
        return left_count;
    }

    public void setLeft_count(int left_count) {
        this.left_count = left_count;
    }

    public int getRight_count() {
        return right_count;
    }

    public void setRight_count(int right_count) {
        this.right_count = right_count;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLeft_content() {
        return left_content;
    }

    public void setLeft_content(String left_content) {
        this.left_content = left_content;
    }

    public String getRight_content() {
        return right_content;
    }

    public void setRight_content(String right_content) {
        this.right_content = right_content;
    }
}
