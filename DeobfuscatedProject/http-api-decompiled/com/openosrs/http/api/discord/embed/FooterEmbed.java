/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class FooterEmbed {
    String text;
    String icon_url;
    String proxy_icon_url;

    public static FooterEmbedBuilder builder() {
        return new FooterEmbedBuilder();
    }

    public String getText() {
        return this.text;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getProxy_icon_url() {
        return this.proxy_icon_url;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public void setProxy_icon_url(String proxy_icon_url) {
        this.proxy_icon_url = proxy_icon_url;
    }

    public FooterEmbed(String text, String icon_url, String proxy_icon_url) {
        this.text = text;
        this.icon_url = icon_url;
        this.proxy_icon_url = proxy_icon_url;
    }

    public FooterEmbed() {
    }

    public String toString() {
        return "FooterEmbed(text=" + this.getText() + ", icon_url=" + this.getIcon_url() + ", proxy_icon_url=" + this.getProxy_icon_url() + ")";
    }

    public static class FooterEmbedBuilder {
        private String text;
        private String icon_url;
        private String proxy_icon_url;

        FooterEmbedBuilder() {
        }

        public FooterEmbedBuilder text(String text) {
            this.text = text;
            return this;
        }

        public FooterEmbedBuilder icon_url(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public FooterEmbedBuilder proxy_icon_url(String proxy_icon_url) {
            this.proxy_icon_url = proxy_icon_url;
            return this;
        }

        public FooterEmbed build() {
            return new FooterEmbed(this.text, this.icon_url, this.proxy_icon_url);
        }

        public String toString() {
            return "FooterEmbed.FooterEmbedBuilder(text=" + this.text + ", icon_url=" + this.icon_url + ", proxy_icon_url=" + this.proxy_icon_url + ")";
        }
    }
}

