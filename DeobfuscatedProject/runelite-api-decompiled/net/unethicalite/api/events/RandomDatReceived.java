/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.events;

import java.util.Arrays;

public final class RandomDatReceived {
    private final String username;
    private final byte[] data;

    public RandomDatReceived(String username, byte[] data) {
        this.username = username;
        this.data = data;
    }

    public String getUsername() {
        return this.username;
    }

    public byte[] getData() {
        return this.data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RandomDatReceived)) {
            return false;
        }
        RandomDatReceived other = (RandomDatReceived)o;
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        return Arrays.equals(this.getData(), other.getData());
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
        return "RandomDatReceived(username=" + this.getUsername() + ", data=" + Arrays.toString(this.getData()) + ")";
    }
}

