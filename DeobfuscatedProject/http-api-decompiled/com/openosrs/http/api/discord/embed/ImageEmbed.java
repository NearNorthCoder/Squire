/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class ImageEmbed {
    String url;
    String proxy_url;
    int height;
    int width;

    public static ImageEmbedBuilder builder() {
        return new ImageEmbedBuilder();
    }

    public String getUrl() {
        return this.url;
    }

    public String getProxy_url() {
        return this.proxy_url;
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

    public void setProxy_url(String proxy_url) {
        this.proxy_url = proxy_url;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ImageEmbed(String url, String proxy_url, int height, int width) {
        this.url = url;
        this.proxy_url = proxy_url;
        this.height = height;
        this.width = width;
    }

    public ImageEmbed() {
    }

    public String toString() {
        return "ImageEmbed(url=" + this.getUrl() + ", proxy_url=" + this.getProxy_url() + ", height=" + this.getHeight() + ", width=" + this.getWidth() + ")";
    }

    public static class ImageEmbedBuilder {
        private String url;
        private String proxy_url;
        private int height;
        private int width;

        ImageEmbedBuilder() {
        }

        public ImageEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public ImageEmbedBuilder proxy_url(String proxy_url) {
            this.proxy_url = proxy_url;
            return this;
        }

        public ImageEmbedBuilder height(int height) {
            this.height = height;
            return this;
        }

        public ImageEmbedBuilder width(int width) {
            this.width = width;
            return this;
        }

        public ImageEmbed build() {
            return new ImageEmbed(this.url, this.proxy_url, this.height, this.width);
        }

        public String toString() {
            return "ImageEmbed.ImageEmbedBuilder(url=" + this.url + ", proxy_url=" + this.proxy_url + ", height=" + this.height + ", width=" + this.width + ")";
        }
    }
}

