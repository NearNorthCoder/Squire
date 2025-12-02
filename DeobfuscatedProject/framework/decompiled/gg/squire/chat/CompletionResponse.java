/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import java.util.List;

public class CompletionResponse {
    String id;
    String object;
    long created;
    String model;
    List<Choice> choices;
    Usage usage;
    String system_fingerprint;

    public String getId() {
        return this.id;
    }

    public String getObject() {
        return this.object;
    }

    public long getCreated() {
        return this.created;
    }

    public String getModel() {
        return this.model;
    }

    public List<Choice> getChoices() {
        return this.choices;
    }

    public Usage getUsage() {
        return this.usage;
    }

    public String getSystem_fingerprint() {
        return this.system_fingerprint;
    }

    public String toString() {
        return "CompletionResponse(id=" + this.getId() + ", object=" + this.getObject() + ", created=" + this.getCreated() + ", model=" + this.getModel() + ", choices=" + String.valueOf(this.getChoices()) + ", usage=" + String.valueOf(this.getUsage()) + ", system_fingerprint=" + this.getSystem_fingerprint() + ")";
    }

    public class Usage {
        int prompt_tokens;
        int completion_tokens;
        int total_tokens;

        public int getPrompt_tokens() {
            return this.prompt_tokens;
        }

        public int getCompletion_tokens() {
            return this.completion_tokens;
        }

        public int getTotal_tokens() {
            return this.total_tokens;
        }

        public String toString() {
            return "CompletionResponse.Usage(prompt_tokens=" + this.getPrompt_tokens() + ", completion_tokens=" + this.getCompletion_tokens() + ", total_tokens=" + this.getTotal_tokens() + ")";
        }
    }

    public class Message {
        String role;
        String content;

        public String getRole() {
            return this.role;
        }

        public String getContent() {
            return this.content;
        }

        public String toString() {
            return "CompletionResponse.Message(role=" + this.getRole() + ", content=" + this.getContent() + ")";
        }
    }

    public class Choice {
        int index;
        Message message;
        String logprobs;
        String finish_reason;

        public int getIndex() {
            return this.index;
        }

        public Message getMessage() {
            return this.message;
        }

        public String getLogprobs() {
            return this.logprobs;
        }

        public String getFinish_reason() {
            return this.finish_reason;
        }

        public String toString() {
            return "CompletionResponse.Choice(index=" + this.getIndex() + ", message=" + String.valueOf(this.getMessage()) + ", logprobs=" + this.getLogprobs() + ", finish_reason=" + this.getFinish_reason() + ")";
        }
    }
}
