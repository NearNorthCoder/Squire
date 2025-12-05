/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.telemetry;

public class Telemetry {
    private int id;
    private int qty;

    public int getId() {
        return this.id;
    }

    public int getQty() {
        return this.qty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Telemetry)) {
            return false;
        }
        Telemetry other = (Telemetry)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        return this.getQty() == other.getQty();
    }

    protected boolean canEqual(Object other) {
        return other instanceof Telemetry;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getQty();
        return result;
    }

    public String toString() {
        return "Telemetry(id=" + this.getId() + ", qty=" + this.getQty() + ")";
    }

    public Telemetry() {
    }

    public Telemetry(int id, int qty) {
        this.id = id;
        this.qty = qty;
    }
}

