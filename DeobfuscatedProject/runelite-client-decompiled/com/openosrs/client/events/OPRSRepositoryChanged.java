/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.events;

public class OPRSRepositoryChanged {
    private final String owner;
    private final boolean added;

    public OPRSRepositoryChanged(String owner, boolean added) {
        this.owner = owner;
        this.added = added;
    }

    public String getOwner() {
        return this.owner;
    }

    public boolean isAdded() {
        return this.added;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OPRSRepositoryChanged)) {
            return false;
        }
        OPRSRepositoryChanged other = (OPRSRepositoryChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isAdded() != other.isAdded()) {
            return false;
        }
        String this$owner = this.getOwner();
        String other$owner = other.getOwner();
        return !(this$owner == null ? other$owner != null : !this$owner.equals(other$owner));
    }

    protected boolean canEqual(Object other) {
        return other instanceof OPRSRepositoryChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isAdded() ? 79 : 97);
        String $owner = this.getOwner();
        result = result * 59 + ($owner == null ? 43 : $owner.hashCode());
        return result;
    }

    public String toString() {
        return "OPRSRepositoryChanged(owner=" + this.getOwner() + ", added=" + this.isAdded() + ")";
    }
}

