/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageWithContext {
    private Map<String, Object> context;
    private List<String> history;
    private String message;

    private static Map<String, Object> $default$context() {
        return new HashMap<String, Object>();
    }

    private static List<String> $default$history() {
        return new ArrayList<String>();
    }

    MessageWithContext(Map<String, Object> context, List<String> history, String message) {
        this.context = context;
        this.history = history;
        this.message = message;
    }

    public static MessageWithContextBuilder builder() {
        return new MessageWithContextBuilder();
    }

    public static class MessageWithContextBuilder {
        private boolean context$set;
        private Map<String, Object> context$value;
        private boolean history$set;
        private List<String> history$value;
        private String message;

        MessageWithContextBuilder() {
        }

        public MessageWithContextBuilder context(Map<String, Object> context) {
            this.context$value = context;
            this.context$set = true;
            return this;
        }

        public MessageWithContextBuilder history(List<String> history) {
            this.history$value = history;
            this.history$set = true;
            return this;
        }

        public MessageWithContextBuilder message(String message) {
            this.message = message;
            return this;
        }

        public MessageWithContext build() {
            Map<String, Object> context$value = this.context$value;
            if (!this.context$set) {
                context$value = MessageWithContext.$default$context();
            }
            List<String> history$value = this.history$value;
            if (!this.history$set) {
                history$value = MessageWithContext.$default$history();
            }
            return new MessageWithContext(context$value, history$value, this.message);
        }

        public String toString() {
            return "MessageWithContext.MessageWithContextBuilder(context$value=" + String.valueOf(this.context$value) + ", history$value=" + String.valueOf(this.history$value) + ", message=" + this.message + ")";
        }
    }
}

