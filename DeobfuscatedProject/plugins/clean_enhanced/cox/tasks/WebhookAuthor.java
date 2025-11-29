/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * Represents the author information for a Discord webhook embed.
 * Contains the author's name, URL, and icon URL.
 */
class WebhookAuthor {
    private String name;
    private String url;
    final DiscordWebhookEmbed embed;
    private String iconUrl;

    /**
     * Constructs a new WebhookAuthor.
     *
     * @param embed the parent embed
     * @param name the author name
     * @param url the author URL
     * @param iconUrl the author icon URL
     */
    WebhookAuthor(DiscordWebhookEmbed embed, String name, String url, String iconUrl) {
        this.embed = embed;
        this.name = name;
        this.url = url;
        this.iconUrl = iconUrl;
    }

    /**
     * Gets the icon URL for this author.
     *
     * @return the author icon URL
     */
    String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Gets the URL for this author.
     *
     * @return the author URL
     */
    String getUrl() {
        return this.url;
    }

    /**
     * Gets the name of this author.
     *
     * @return the author name
     */
    String getName() {
        return this.name;
    }
}
