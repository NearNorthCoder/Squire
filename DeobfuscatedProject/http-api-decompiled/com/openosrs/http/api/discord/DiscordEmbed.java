/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.http.api.discord;

import com.openosrs.http.api.discord.DiscordMessage;
import com.openosrs.http.api.discord.embed.AuthorEmbed;
import com.openosrs.http.api.discord.embed.FieldEmbed;
import com.openosrs.http.api.discord.embed.FooterEmbed;
import com.openosrs.http.api.discord.embed.ImageEmbed;
import com.openosrs.http.api.discord.embed.ProviderEmbed;
import com.openosrs.http.api.discord.embed.ThumbnailEmbed;
import com.openosrs.http.api.discord.embed.VideoEmbed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DiscordEmbed {
    String title;
    String type;
    String description;
    String url;
    String timestamp;
    String iconurl;
    String color;
    FooterEmbed footer;
    ImageEmbed image;
    ThumbnailEmbed thumbnail;
    VideoEmbed video;
    ProviderEmbed provider;
    AuthorEmbed author;
    List<FieldEmbed> fields;

    public DiscordEmbed(AuthorEmbed author, ThumbnailEmbed thumb, String description, FooterEmbed footer, String color, List<FieldEmbed> fields) {
        this.author = author;
        this.thumbnail = thumb;
        this.description = description;
        this.footer = footer;
        this.color = color;
        this.fields = fields;
    }

    public DiscordMessage toDiscordMessage(String username, String content, String avatarUrl) {
        return this.toDiscordMessage(username, content, avatarUrl, false);
    }

    public DiscordMessage toDiscordMessage(String username, String content, String avatarUrl, boolean textToSpeech) {
        return new DiscordMessage(username, content, avatarUrl, textToSpeech, Collections.singletonList(this));
    }

    public static DiscordEmbedBuilder builder() {
        return new DiscordEmbedBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUrl() {
        return this.url;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getIconurl() {
        return this.iconurl;
    }

    public String getColor() {
        return this.color;
    }

    public FooterEmbed getFooter() {
        return this.footer;
    }

    public ImageEmbed getImage() {
        return this.image;
    }

    public ThumbnailEmbed getThumbnail() {
        return this.thumbnail;
    }

    public VideoEmbed getVideo() {
        return this.video;
    }

    public ProviderEmbed getProvider() {
        return this.provider;
    }

    public AuthorEmbed getAuthor() {
        return this.author;
    }

    public List<FieldEmbed> getFields() {
        return this.fields;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFooter(FooterEmbed footer) {
        this.footer = footer;
    }

    public void setImage(ImageEmbed image) {
        this.image = image;
    }

    public void setThumbnail(ThumbnailEmbed thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setVideo(VideoEmbed video) {
        this.video = video;
    }

    public void setProvider(ProviderEmbed provider) {
        this.provider = provider;
    }

    public void setAuthor(AuthorEmbed author) {
        this.author = author;
    }

    public void setFields(List<FieldEmbed> fields) {
        this.fields = fields;
    }

    public DiscordEmbed(String title, String type, String description, String url, String timestamp, String iconurl, String color, FooterEmbed footer, ImageEmbed image, ThumbnailEmbed thumbnail, VideoEmbed video, ProviderEmbed provider, AuthorEmbed author, List<FieldEmbed> fields) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.url = url;
        this.timestamp = timestamp;
        this.iconurl = iconurl;
        this.color = color;
        this.footer = footer;
        this.image = image;
        this.thumbnail = thumbnail;
        this.video = video;
        this.provider = provider;
        this.author = author;
        this.fields = fields;
    }

    public String toString() {
        return "DiscordEmbed(title=" + this.getTitle() + ", type=" + this.getType() + ", description=" + this.getDescription() + ", url=" + this.getUrl() + ", timestamp=" + this.getTimestamp() + ", iconurl=" + this.getIconurl() + ", color=" + this.getColor() + ", footer=" + String.valueOf(this.getFooter()) + ", image=" + String.valueOf(this.getImage()) + ", thumbnail=" + String.valueOf(this.getThumbnail()) + ", video=" + String.valueOf(this.getVideo()) + ", provider=" + String.valueOf(this.getProvider()) + ", author=" + String.valueOf(this.getAuthor()) + ", fields=" + String.valueOf(this.getFields()) + ")";
    }

    public static class DiscordEmbedBuilder {
        private String title;
        private String type;
        private String description;
        private String url;
        private String timestamp;
        private String iconurl;
        private String color;
        private FooterEmbed footer;
        private ImageEmbed image;
        private ThumbnailEmbed thumbnail;
        private VideoEmbed video;
        private ProviderEmbed provider;
        private AuthorEmbed author;
        private ArrayList<FieldEmbed> fields;

        DiscordEmbedBuilder() {
        }

        public DiscordEmbedBuilder title(String title) {
            this.title = title;
            return this;
        }

        public DiscordEmbedBuilder type(String type) {
            this.type = type;
            return this;
        }

        public DiscordEmbedBuilder description(String description) {
            this.description = description;
            return this;
        }

        public DiscordEmbedBuilder url(String url) {
            this.url = url;
            return this;
        }

        public DiscordEmbedBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public DiscordEmbedBuilder iconurl(String iconurl) {
            this.iconurl = iconurl;
            return this;
        }

        public DiscordEmbedBuilder color(String color) {
            this.color = color;
            return this;
        }

        public DiscordEmbedBuilder footer(FooterEmbed footer) {
            this.footer = footer;
            return this;
        }

        public DiscordEmbedBuilder image(ImageEmbed image) {
            this.image = image;
            return this;
        }

        public DiscordEmbedBuilder thumbnail(ThumbnailEmbed thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public DiscordEmbedBuilder video(VideoEmbed video) {
            this.video = video;
            return this;
        }

        public DiscordEmbedBuilder provider(ProviderEmbed provider) {
            this.provider = provider;
            return this;
        }

        public DiscordEmbedBuilder author(AuthorEmbed author) {
            this.author = author;
            return this;
        }

        public DiscordEmbedBuilder field(FieldEmbed field) {
            if (this.fields == null) {
                this.fields = new ArrayList();
            }
            this.fields.add(field);
            return this;
        }

        public DiscordEmbedBuilder fields(Collection<? extends FieldEmbed> fields) {
            if (fields == null) {
                throw new NullPointerException("fields cannot be null");
            }
            if (this.fields == null) {
                this.fields = new ArrayList();
            }
            this.fields.addAll(fields);
            return this;
        }

        public DiscordEmbedBuilder clearFields() {
            if (this.fields != null) {
                this.fields.clear();
            }
            return this;
        }

        public DiscordEmbed build() {
            List<FieldEmbed> fields;
            switch (this.fields == null ? 0 : this.fields.size()) {
                case 0: {
                    fields = Collections.emptyList();
                    break;
                }
                case 1: {
                    fields = Collections.singletonList(this.fields.get(0));
                    break;
                }
                default: {
                    fields = Collections.unmodifiableList(new ArrayList<FieldEmbed>(this.fields));
                }
            }
            return new DiscordEmbed(this.title, this.type, this.description, this.url, this.timestamp, this.iconurl, this.color, this.footer, this.image, this.thumbnail, this.video, this.provider, this.author, fields);
        }

        public String toString() {
            return "DiscordEmbed.DiscordEmbedBuilder(title=" + this.title + ", type=" + this.type + ", description=" + this.description + ", url=" + this.url + ", timestamp=" + this.timestamp + ", iconurl=" + this.iconurl + ", color=" + this.color + ", footer=" + String.valueOf(this.footer) + ", image=" + String.valueOf(this.image) + ", thumbnail=" + String.valueOf(this.thumbnail) + ", video=" + String.valueOf(this.video) + ", provider=" + String.valueOf(this.provider) + ", author=" + String.valueOf(this.author) + ", fields=" + String.valueOf(this.fields) + ")";
        }
    }
}

