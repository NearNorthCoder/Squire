/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 */
package com.openosrs.http.api.discord.embed;

import lombok.NonNull;

public class FieldEmbed {
    @NonNull
    String name;
    @NonNull
    String value;
    boolean inline;

    public static FieldEmbedBuilder builder() {
        return new FieldEmbedBuilder();
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }

    public boolean isInline() {
        return this.inline;
    }

    public void setName(@NonNull String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.name = name;
    }

    public void setValue(@NonNull String value) {
        if (value == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        this.value = value;
    }

    public void setInline(boolean inline) {
        this.inline = inline;
    }

    public FieldEmbed(@NonNull String name, @NonNull String value, boolean inline) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (value == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    public FieldEmbed() {
    }

    public String toString() {
        return "FieldEmbed(name=" + this.getName() + ", value=" + this.getValue() + ", inline=" + this.isInline() + ")";
    }

    public static class FieldEmbedBuilder {
        private String name;
        private String value;
        private boolean inline;

        FieldEmbedBuilder() {
        }

        public FieldEmbedBuilder name(@NonNull String name) {
            if (name == null) {
                throw new NullPointerException("name is marked non-null but is null");
            }
            this.name = name;
            return this;
        }

        public FieldEmbedBuilder value(@NonNull String value) {
            if (value == null) {
                throw new NullPointerException("value is marked non-null but is null");
            }
            this.value = value;
            return this;
        }

        public FieldEmbedBuilder inline(boolean inline) {
            this.inline = inline;
            return this;
        }

        public FieldEmbed build() {
            return new FieldEmbed(this.name, this.value, this.inline);
        }

        public String toString() {
            return "FieldEmbed.FieldEmbedBuilder(name=" + this.name + ", value=" + this.value + ", inline=" + this.inline + ")";
        }
    }
}

