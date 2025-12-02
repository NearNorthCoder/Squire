/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.movement.pathfinder.model.dto;

import java.util.Arrays;

public static class TransportDto.ActionData {
    int id;
    String action;
    String name;
    String[] dialog;

    public int getId() {
        return this.id;
    }

    public String getAction() {
        return this.action;
    }

    public String getName() {
        return this.name;
    }

    public String[] getDialog() {
        return this.dialog;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDialog(String[] dialog) {
        this.dialog = dialog;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TransportDto.ActionData)) {
            return false;
        }
        TransportDto.ActionData other = (TransportDto.ActionData)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        return Arrays.deepEquals(this.getDialog(), other.getDialog());
    }

    protected boolean canEqual(Object other) {
        return other instanceof TransportDto.ActionData;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getDialog());
        return result;
    }

    public String toString() {
        return "TransportDto.ActionData(id=" + this.getId() + ", action=" + this.getAction() + ", name=" + this.getName() + ", dialog=" + Arrays.deepToString(this.getDialog()) + ")";
    }
}
