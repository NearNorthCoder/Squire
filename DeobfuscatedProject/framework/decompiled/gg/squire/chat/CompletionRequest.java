/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package gg.squire.chat;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CompletionRequest {
    String model;
    List<Message> messages;
    @SerializedName(value="n")
    int numberOfChoices;

    private static int $default$numberOfChoices() {
        return 1;
    }

    CompletionRequest(String model, List<Message> messages, int numberOfChoices) {
        this.model = model;
        this.messages = messages;
        this.numberOfChoices = numberOfChoices;
    }

    public static CompletionRequestBuilder builder() {
        return new CompletionRequestBuilder();
    }

    public static class CompletionRequestBuilder {
        private String model;
        private List<Message> messages;
        private boolean numberOfChoices$set;
        private int numberOfChoices$value;

        CompletionRequestBuilder() {
        }

        public CompletionRequestBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CompletionRequestBuilder messages(List<Message> messages) {
            this.messages = messages;
            return this;
        }

        public CompletionRequestBuilder numberOfChoices(int numberOfChoices) {
            this.numberOfChoices$value = numberOfChoices;
            this.numberOfChoices$set = true;
            return this;
        }

        public CompletionRequest build() {
            int numberOfChoices$value = this.numberOfChoices$value;
            if (!this.numberOfChoices$set) {
                numberOfChoices$value = CompletionRequest.$default$numberOfChoices();
            }
            return new CompletionRequest(this.model, this.messages, numberOfChoices$value);
        }

        public String toString() {
            return "CompletionRequest.CompletionRequestBuilder(model=" + this.model + ", messages=" + String.valueOf(this.messages) + ", numberOfChoices$value=" + this.numberOfChoices$value + ")";
        }
    }

    public static class Message {
        String role;
        String content;

        Message(String role, String content) {
            this.role = role;
            this.content = content;
        }

        public static MessageBuilder builder() {
            return new MessageBuilder();
        }

        public static class MessageBuilder {
            private String role;
            private String content;

            MessageBuilder() {
            }

            public MessageBuilder role(String role) {
                this.role = role;
                return this;
            }

            public MessageBuilder content(String content) {
                this.content = content;
                return this;
            }

            public Message build() {
                return new Message(this.role, this.content);
            }

            public String toString() {
                return "CompletionRequest.Message.MessageBuilder(role=" + this.role + ", content=" + this.content + ")";
            }
        }
    }
}
