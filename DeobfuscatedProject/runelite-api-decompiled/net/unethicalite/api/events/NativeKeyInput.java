/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.events;

public final class NativeKeyInput {
    private final char keyChar;
    private final int keyCode;
    private final int keyLocation;
    private final Type type;

    public NativeKeyInput(char keyChar, int keyCode, int keyLocation, Type type) {
        this.keyChar = keyChar;
        this.keyCode = keyCode;
        this.keyLocation = keyLocation;
        this.type = type;
    }

    public char getKeyChar() {
        return this.keyChar;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public int getKeyLocation() {
        return this.keyLocation;
    }

    public Type getType() {
        return this.type;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NativeKeyInput)) {
            return false;
        }
        NativeKeyInput other = (NativeKeyInput)o;
        if (this.getKeyChar() != other.getKeyChar()) {
            return false;
        }
        if (this.getKeyCode() != other.getKeyCode()) {
            return false;
        }
        if (this.getKeyLocation() != other.getKeyLocation()) {
            return false;
        }
        Type this$type = this.getType();
        Type other$type = other.getType();
        return !(this$type == null ? other$type != null : !((Object)((Object)this$type)).equals((Object)other$type));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getKeyChar();
        result = result * 59 + this.getKeyCode();
        result = result * 59 + this.getKeyLocation();
        Type $type = this.getType();
        result = result * 59 + ($type == null ? 43 : ((Object)((Object)$type)).hashCode());
        return result;
    }

    public String toString() {
        return "NativeKeyInput(keyChar=" + this.getKeyChar() + ", keyCode=" + this.getKeyCode() + ", keyLocation=" + this.getKeyLocation() + ", type=" + String.valueOf((Object)this.getType()) + ")";
    }

    public static enum Type {
        TYPED,
        PRESSED,
        RELEASED;

    }
}

