/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * Represents the footer information for a Discord webhook embed.
 * Contains the footer text and icon URL.
 */
class WebhookFooter {
    final DiscordWebhookEmbed embed;
    private String text;
    private String iconUrl;

    /**
     * Constructs a new WebhookFooter.
     *
     * @param embed the parent embed
     * @param text the footer text
     * @param iconUrl the footer icon URL
     */
    WebhookFooter(DiscordWebhookEmbed embed, String text, String iconUrl) {
        this.embed = embed;
        this.text = text;
        this.iconUrl = iconUrl;
    }

    /**
     * Gets the icon URL for this footer.
     *
     * @return the footer icon URL
     */
    String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Gets the text of this footer.
     *
     * @return the footer text
     */
    String getText() {
        return this.text;
    }
}
