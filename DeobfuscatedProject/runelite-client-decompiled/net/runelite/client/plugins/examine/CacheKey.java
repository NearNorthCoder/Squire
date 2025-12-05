/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.examine;

import java.util.Objects;
import net.runelite.client.plugins.examine.ExamineType;

class CacheKey {
    private final ExamineType type;
    private final int id;

    public CacheKey(ExamineType type, int id) {
        this.type = type;
        this.id = id;
    }

    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode((Object)this.type);
        hash = 23 * hash + this.id;
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        CacheKey other = (CacheKey)obj;
        if (this.id != other.id) {
            return false;
        }
        return this.type == other.type;
    }
}

