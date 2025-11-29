/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * Represents the thumbnail image for a Discord webhook embed.
 * Contains the URL of the thumbnail image.
 */
class WebhookThumbnail {
    private String url;
    final DiscordWebhookEmbed embed;

    /**
     * Constructs a new WebhookThumbnail.
     *
     * @param embed the parent embed
     * @param url the thumbnail image URL
     */
    WebhookThumbnail(DiscordWebhookEmbed embed, String url) {
        this.embed = embed;
        this.url = url;
    }

    /**
     * Gets the URL of this thumbnail.
     *
     * @return the thumbnail URL
     */
    String getUrl() {
        return this.url;
    }
}
