/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import gg.squire.chat.CustomResponseMessage;

public static class CustomResponseMessage.CustomResponseMessageBuilder {
    private String message;
    private int respond;

    CustomResponseMessage.CustomResponseMessageBuilder() {
    }

    public CustomResponseMessage.CustomResponseMessageBuilder message(String message) {
        this.message = message;
        return this;
    }

    public CustomResponseMessage.CustomResponseMessageBuilder respond(int respond) {
        this.respond = respond;
        return this;
    }

    public CustomResponseMessage build() {
        return new CustomResponseMessage(this.message, this.respond);
    }

    public String toString() {
        return "CustomResponseMessage.CustomResponseMessageBuilder(message=" + this.message + ", respond=" + this.respond + ")";
    }
}
