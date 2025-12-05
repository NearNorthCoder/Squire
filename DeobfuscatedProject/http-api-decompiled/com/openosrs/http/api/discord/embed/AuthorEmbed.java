/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class AuthorEmbed {
    String name;
    String url;
    String icon_url;
    String proxy_icon_url;

    public static AuthorEmbedBuilder builder() {
        return new AuthorEmbedBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getProxy_icon_url() {
        return this.proxy_icon_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public void setProxy_icon_url(String proxy_icon_url) {
        this.proxy_icon_url = proxy_icon_url;
    }

    public AuthorEmbed(String name, String url, String icon_url, String proxy_icon_url) {
        this.name = name;
        this.url = url;
        this.icon_url = icon_url;
        this.proxy_icon_url = proxy_icon_url;
    }

    public AuthorEmbed() {
    }

    public String toString() {
        return "AuthorEmbed(name=" + this.getName() + ", url=" + this.getUrl() + ", icon_url=" + this.getIcon_url() + ", proxy_icon_url=" + this.getProxy_icon_url() + ")";
    }

    public static class AuthorEmbedBuilder {
        private String name;
        private String url;
        private String icon_url;
        private String proxy_icon_url;

        AuthorEmbedBuilder() {
        }

        public AuthorEmbedBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AuthorEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public AuthorEmbedBuilder icon_url(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public AuthorEmbedBuilder proxy_icon_url(String proxy_icon_url) {
            this.proxy_icon_url = proxy_icon_url;
            return this;
        }

        public AuthorEmbed build() {
            return new AuthorEmbed(this.name, this.url, this.icon_url, this.proxy_icon_url);
        }

        public String toString() {
            return "AuthorEmbed.AuthorEmbedBuilder(name=" + this.name + ", url=" + this.url + ", icon_url=" + this.icon_url + ", proxy_icon_url=" + this.proxy_icon_url + ")";
        }
    }
}

