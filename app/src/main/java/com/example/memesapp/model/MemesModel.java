package com.example.memesapp.model;


import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    @Generated("jsonschema2pojo")
    public class MemesModel {

        @SerializedName("postLink")
        @Expose
        private String postLink;
        @SerializedName("subreddit")
        @Expose
        private String subreddit;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("nsfw")
        @Expose
        private Boolean nsfw;
        @SerializedName("spoiler")
        @Expose
        private Boolean spoiler;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("ups")
        @Expose
        private Integer ups;
        @SerializedName("preview")
        @Expose
        private List<String> preview;

        public String getPostLink() {
            return postLink;
        }

        public void setPostLink(String postLink) {
            this.postLink = postLink;
        }

        public String getSubreddit() {
            return subreddit;
        }

        public void setSubreddit(String subreddit) {
            this.subreddit = subreddit;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getNsfw() {
            return nsfw;
        }

        public void setNsfw(Boolean nsfw) {
            this.nsfw = nsfw;
        }

        public Boolean getSpoiler() {
            return spoiler;
        }

        public void setSpoiler(Boolean spoiler) {
            this.spoiler = spoiler;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getUps() {
            return ups;
        }

        public void setUps(Integer ups) {
            this.ups = ups;
        }

        public List<String> getPreview() {
            return preview;
        }

        public void setPreview(List<String> preview) {
            this.preview = preview;
        }

    }

