/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.config;

public class Profile {
    final long id;
    String name;
    long rev;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public long getRev() {
        return this.rev;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRev(long rev) {
        this.rev = rev;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Profile)) {
            return false;
        }
        Profile other = (Profile)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getRev() != other.getRev()) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Profile;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $id = this.getId();
        result = result * 59 + (int)($id >>> 32 ^ $id);
        long $rev = this.getRev();
        result = result * 59 + (int)($rev >>> 32 ^ $rev);
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "Profile(id=" + this.getId() + ", name=" + this.getName() + ", rev=" + this.getRev() + ")";
    }

    public Profile(long id, String name, long rev) {
        this.id = id;
        this.name = name;
        this.rev = rev;
    }
}

