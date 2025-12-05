/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.events;

public final class NativeMouseInput {
    private final int x;
    private final int y;
    private final int button;
    private final Type type;

    public boolean isButton() {
        return this.type == Type.CLICK || this.type == Type.PRESS || this.type == Type.RELEASE;
    }

    public NativeMouseInput(int x, int y, int button, Type type) {
        this.x = x;
        this.y = y;
        this.button = button;
        this.type = type;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getButton() {
        return this.button;
    }

    public Type getType() {
        return this.type;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NativeMouseInput)) {
            return false;
        }
        NativeMouseInput other = (NativeMouseInput)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        if (this.getButton() != other.getButton()) {
            return false;
        }
        Type this$type = this.getType();
        Type other$type = other.getType();
        return !(this$type == null ? other$type != null : !((Object)((Object)this$type)).equals((Object)other$type));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getButton();
        Type $type = this.getType();
        result = result * 59 + ($type == null ? 43 : ((Object)((Object)$type)).hashCode());
        return result;
    }

    public String toString() {
        return "NativeMouseInput(x=" + this.getX() + ", y=" + this.getY() + ", button=" + this.getButton() + ", type=" + String.valueOf((Object)this.getType()) + ")";
    }

    public static enum Type {
        MOVEMENT,
        CLICK,
        PRESS,
        RELEASE,
        SCROLL;

    }
}

