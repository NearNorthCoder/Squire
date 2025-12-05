/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord.embed;

public class ProviderEmbed {
    String name;
    String url;

    public static ProviderEmbedBuilder builder() {
        return new ProviderEmbedBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ProviderEmbed(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public ProviderEmbed() {
    }

    public String toString() {
        return "ProviderEmbed(name=" + this.getName() + ", url=" + this.getUrl() + ")";
    }

    public static class ProviderEmbedBuilder {
        private String name;
        private String url;

        ProviderEmbedBuilder() {
        }

        public ProviderEmbedBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProviderEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public ProviderEmbed build() {
            return new ProviderEmbed(this.name, this.url);
        }

        public String toString() {
            return "ProviderEmbed.ProviderEmbedBuilder(name=" + this.name + ", url=" + this.url + ")";
        }
    }
}

