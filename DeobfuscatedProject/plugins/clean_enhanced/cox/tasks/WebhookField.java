/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * Represents a field in a Discord webhook embed.
 * Fields contain a name, value, and inline flag.
 */
class WebhookField {
    private String value;
    private boolean inline;
    final DiscordWebhookEmbed embed;
    private String name;

    /**
     * Constructs a new WebhookField.
     *
     * @param embed the parent embed
     * @param name the field name
     * @param value the field value
     * @param inline whether the field should be displayed inline
     */
    WebhookField(DiscordWebhookEmbed embed, String name, String value, boolean inline) {
        this.embed = embed;
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    /**
     * Checks if this field should be displayed inline.
     *
     * @return true if the field is inline, false otherwise
     */
    boolean isInline() {
        return this.inline;
    }

    /**
     * Gets the name of this field.
     *
     * @return the field name
     */
    String getName() {
        return this.name;
    }

    /**
     * Gets the value of this field.
     *
     * @return the field value
     */
    String getValue() {
        return this.value;
    }
}
