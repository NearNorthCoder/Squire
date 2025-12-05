/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public final class FriendAdded {
    private final String name;

    public FriendAdded(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FriendAdded)) {
            return false;
        }
        FriendAdded other = (FriendAdded)o;
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "FriendAdded(name=" + this.getName() + ")";
    }
}

