/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class VideoEmbed {
    String url;
    int height;
    int width;

    public static VideoEmbedBuilder builder() {
        return new VideoEmbedBuilder();
    }

    public String getUrl() {
        return this.url;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public VideoEmbed(String url, int height, int width) {
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public VideoEmbed() {
    }

    public String toString() {
        return "VideoEmbed(url=" + this.getUrl() + ", height=" + this.getHeight() + ", width=" + this.getWidth() + ")";
    }

    public static class VideoEmbedBuilder {
        private String url;
        private int height;
        private int width;

        VideoEmbedBuilder() {
        }

        public VideoEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public VideoEmbedBuilder height(int height) {
            this.height = height;
            return this;
        }

        public VideoEmbedBuilder width(int width) {
            this.width = width;
            return this;
        }

        public VideoEmbed build() {
            return new VideoEmbed(this.url, this.height, this.width);
        }

        public String toString() {
            return "VideoEmbed.VideoEmbedBuilder(url=" + this.url + ", height=" + this.height + ", width=" + this.width + ")";
        }
    }
}

