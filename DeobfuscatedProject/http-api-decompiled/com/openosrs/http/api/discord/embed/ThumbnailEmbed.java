/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class ThumbnailEmbed {
    String url;
    String proxy_url;
    int height;
    int width;

    public static ThumbnailEmbedBuilder builder() {
        return new ThumbnailEmbedBuilder();
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

    public ThumbnailEmbed(String url, String proxy_url, int height, int width) {
        this.url = url;
        this.proxy_url = proxy_url;
        this.height = height;
        this.width = width;
    }

    public ThumbnailEmbed() {
    }

    public String toString() {
        return "ThumbnailEmbed(url=" + this.getUrl() + ", proxy_url=" + this.getProxy_url() + ", height=" + this.getHeight() + ", width=" + this.getWidth() + ")";
    }

    public static class ThumbnailEmbedBuilder {
        private String url;
        private String proxy_url;
        private int height;
        private int width;

        ThumbnailEmbedBuilder() {
        }

        public ThumbnailEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public ThumbnailEmbedBuilder proxy_url(String proxy_url) {
            this.proxy_url = proxy_url;
            return this;
        }

        public ThumbnailEmbedBuilder height(int height) {
            this.height = height;
            return this;
        }

        public ThumbnailEmbedBuilder width(int width) {
            this.width = width;
            return this;
        }

        public ThumbnailEmbed build() {
            return new ThumbnailEmbed(this.url, this.proxy_url, this.height, this.width);
        }

        public String toString() {
            return "ThumbnailEmbed.ThumbnailEmbedBuilder(url=" + this.url + ", proxy_url=" + this.proxy_url + ", height=" + this.height + ", width=" + this.width + ")";
        }
    }
}

