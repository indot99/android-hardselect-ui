package org.richcode.hardselect.Data;

import android.graphics.drawable.Drawable;

public class FeedData {

    int feedId;
    int userId;
    int count;
    int like_count;
    int unlike_count;
    String userName;
    String content;

    public FeedData(int feedId, int userId, int count, int like_count, int unlike_count, String userName, String content) {
        this.feedId = feedId;
        this.userId = userId;
        this.count = count;
        this.like_count = like_count;
        this.unlike_count = unlike_count;
        this.userName = userName;
        this.content = content;
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

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getUnlike_count() {
        return unlike_count;
    }

    public void setUnlike_count(int unlike_count) {
        this.unlike_count = unlike_count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
