/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * Represents the main image for a Discord webhook embed.
 * Contains the URL of the image.
 */
class WebhookImage {
    private String url;
    final DiscordWebhookEmbed embed;

    /**
     * Constructs a new WebhookImage.
     *
     * @param embed the parent embed
     * @param url the image URL
     */
    WebhookImage(DiscordWebhookEmbed embed, String url) {
        this.embed = embed;
        this.url = url;
    }

    /**
     * Gets the URL of this image.
     *
     * @return the image URL
     */
    String getUrl() {
        return this.url;
    }
}
