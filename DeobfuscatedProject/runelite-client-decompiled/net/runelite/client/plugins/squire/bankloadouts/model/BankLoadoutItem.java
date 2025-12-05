/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.squire.bankloadouts.model;

public final class BankLoadoutItem {
    private final int id;
    private final int quantity;

    public BankLoadoutItem(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BankLoadoutItem)) {
            return false;
        }
        BankLoadoutItem other = (BankLoadoutItem)o;
        if (this.getId() != other.getId()) {
            return false;
        }
        return this.getQuantity() == other.getQuantity();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getQuantity();
        return result;
    }

    public String toString() {
        return "BankLoadoutItem(id=" + this.getId() + ", quantity=" + this.getQuantity() + ")";
    }
}

