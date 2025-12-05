/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.events;

import java.util.Arrays;

public class RandomDatSent {
    String username;
    byte[] data;

    public String getUsername() {
        return this.username;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RandomDatSent)) {
            return false;
        }
        RandomDatSent other = (RandomDatSent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        return Arrays.equals(this.getData(), other.getData());
    }

    protected boolean canEqual(Object other) {
        return other instanceof RandomDatSent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        result = result * 59 + Arrays.hashCode(this.getData());
        return result;
    }

    public String toString() {
        return "RandomDatSent(username=" + this.getUsername() + ", data=" + Arrays.toString(this.getData()) + ")";
    }
}

