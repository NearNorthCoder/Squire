/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord;

import com.google.gson.annotations.SerializedName;
import com.openosrs.http.api.discord.DiscordEmbed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DiscordMessage {
    String username;
    String content;
    @SerializedName(value="avatar_url")
    String avatarUrl;
    @SerializedName(value="tts")
    boolean textToSpeech;
    final List<DiscordEmbed> embeds;

    public void setUsername(String username) {
        this.username = username != null ? username.substring(0, Math.min(31, username.length())) : null;
    }

    public static DiscordMessageBuilder builder() {
        return new DiscordMessageBuilder();
    }

    public String getUsername() {
        return this.username;
    }

    public String getContent() {
        return this.content;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public boolean isTextToSpeech() {
        return this.textToSpeech;
    }

    public List<DiscordEmbed> getEmbeds() {
        return this.embeds;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setTextToSpeech(boolean textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

    public String toString() {
        return "DiscordMessage(username=" + this.getUsername() + ", content=" + this.getContent() + ", avatarUrl=" + this.getAvatarUrl() + ", textToSpeech=" + this.isTextToSpeech() + ", embeds=" + String.valueOf(this.getEmbeds()) + ")";
    }

    public DiscordMessage(String username, String content, String avatarUrl, boolean textToSpeech, List<DiscordEmbed> embeds) {
        this.username = username;
        this.content = content;
        this.avatarUrl = avatarUrl;
        this.textToSpeech = textToSpeech;
        this.embeds = embeds;
    }

    public static class DiscordMessageBuilder {
        private String username;
        private String content;
        private String avatarUrl;
        private boolean textToSpeech;
        private ArrayList<DiscordEmbed> embeds;

        DiscordMessageBuilder() {
        }

        public DiscordMessageBuilder username(String username) {
            this.username = username;
            return this;
        }

        public DiscordMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public DiscordMessageBuilder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public DiscordMessageBuilder textToSpeech(boolean textToSpeech) {
            this.textToSpeech = textToSpeech;
            return this;
        }

        public DiscordMessageBuilder embed(DiscordEmbed embed) {
            if (this.embeds == null) {
                this.embeds = new ArrayList();
            }
            this.embeds.add(embed);
            return this;
        }

        public DiscordMessageBuilder embeds(Collection<? extends DiscordEmbed> embeds) {
            if (embeds == null) {
                throw new NullPointerException("embeds cannot be null");
            }
            if (this.embeds == null) {
                this.embeds = new ArrayList();
            }
            this.embeds.addAll(embeds);
            return this;
        }

        public DiscordMessageBuilder clearEmbeds() {
            if (this.embeds != null) {
                this.embeds.clear();
            }
            return this;
        }

        public DiscordMessage build() {
            List<DiscordEmbed> embeds;
            switch (this.embeds == null ? 0 : this.embeds.size()) {
                case 0: {
                    embeds = Collections.emptyList();
                    break;
                }
                case 1: {
                    embeds = Collections.singletonList(this.embeds.get(0));
                    break;
                }
                default: {
                    embeds = Collections.unmodifiableList(new ArrayList<DiscordEmbed>(this.embeds));
                }
            }
            return new DiscordMessage(this.username, this.content, this.avatarUrl, this.textToSpeech, embeds);
        }

        public String toString() {
            return "DiscordMessage.DiscordMessageBuilder(username=" + this.username + ", content=" + this.content + ", avatarUrl=" + this.avatarUrl + ", textToSpeech=" + this.textToSpeech + ", embeds=" + String.valueOf(this.embeds) + ")";
        }
    }
}

