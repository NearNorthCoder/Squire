/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Builder class for creating Discord webhook embeds.
 * Allows building rich embed messages with title, description, color, fields, author, thumbnail, image, and footer.
 */
public class DiscordWebhookEmbed {
    private WebhookThumbnail thumbnail;
    private WebhookImage image;
    private WebhookAuthor author;
    private List<WebhookField> fields;
    private String url;
    private String description;
    private Color color;
    private String title;
    private WebhookFooter footer;

    public DiscordWebhookEmbed() {
        this.fields = new ArrayList<WebhookField>();
    }

    /**
     * Sets the thumbnail for this embed.
     *
     * @param thumbnailUrl the URL of the thumbnail image
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setThumbnail(String thumbnailUrl) {
        this.thumbnail = new WebhookThumbnail(this, thumbnailUrl);
        return this;
    }

    /**
     * Gets the title of this embed.
     *
     * @return the embed title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Adds a field to this embed.
     *
     * @param name the field name
     * @param value the field value
     * @param inline whether the field should be displayed inline
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed addField(String name, String value, boolean inline) {
        this.fields.add(new WebhookField(this, name, value, inline));
        return this;
    }

    /**
     * Sets the author for this embed.
     *
     * @param name the author name
     * @param url the author URL
     * @param iconUrl the author icon URL
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setAuthor(String name, String url, String iconUrl) {
        this.author = new WebhookAuthor(this, name, url, iconUrl);
        return this;
    }

    /**
     * Gets the footer of this embed.
     *
     * @return the embed footer
     */
    public WebhookFooter getFooter() {
        return this.footer;
    }

    /**
     * Gets the URL of this embed.
     *
     * @return the embed URL
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Gets the image of this embed.
     *
     * @return the embed image
     */
    public WebhookImage getImage() {
        return this.image;
    }

    /**
     * Sets the title for this embed.
     *
     * @param title the embed title
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets the author of this embed.
     *
     * @return the embed author
     */
    public WebhookAuthor getAuthor() {
        return this.author;
    }

    /**
     * Sets the description for this embed.
     *
     * @param description the embed description
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets the color of this embed.
     *
     * @return the embed color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Gets the description of this embed.
     *
     * @return the embed description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the color for this embed.
     *
     * @param color the embed color
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Sets the URL for this embed.
     *
     * @param url the embed URL
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Sets the image for this embed.
     *
     * @param imageUrl the URL of the image
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setImage(String imageUrl) {
        this.image = new WebhookImage(this, imageUrl);
        return this;
    }

    /**
     * Gets the thumbnail of this embed.
     *
     * @return the embed thumbnail
     */
    public WebhookThumbnail getThumbnail() {
        return this.thumbnail;
    }

    /**
     * Gets the list of fields in this embed.
     *
     * @return the embed fields
     */
    public List<WebhookField> getFields() {
        return this.fields;
    }

    /**
     * Sets the footer for this embed.
     *
     * @param text the footer text
     * @param iconUrl the footer icon URL
     * @return this builder instance for method chaining
     */
    public DiscordWebhookEmbed setFooter(String text, String iconUrl) {
        this.footer = new WebhookFooter(this, text, iconUrl);
        return this;
    }
}
