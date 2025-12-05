/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

public class CustomResponseMessage {
    private String message;
    private int respond;

    CustomResponseMessage(String message, int respond) {
        this.message = message;
        this.respond = respond;
    }

    public static CustomResponseMessageBuilder builder() {
        return new CustomResponseMessageBuilder();
    }

    public String getMessage() {
        return this.message;
    }

    public int getRespond() {
        return this.respond;
    }

    public static class CustomResponseMessageBuilder {
        private String message;
        private int respond;

        CustomResponseMessageBuilder() {
        }

        public CustomResponseMessageBuilder message(String message) {
            this.message = message;
            return this;
        }

        public CustomResponseMessageBuilder respond(int respond) {
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
}

