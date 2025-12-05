/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.model;

import net.runelite.api.model.Vertex;

public final class Triangle {
    private final Vertex a;
    private final Vertex b;
    private final Vertex c;

    public Triangle rotate(int orientation) {
        return new Triangle(this.a.rotate(orientation), this.b.rotate(orientation), this.c.rotate(orientation));
    }

    public Triangle(Vertex a, Vertex b, Vertex c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vertex getA() {
        return this.a;
    }

    public Vertex getB() {
        return this.b;
    }

    public Vertex getC() {
        return this.c;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle)o;
        Vertex this$a = this.getA();
        Vertex other$a = other.getA();
        if (this$a == null ? other$a != null : !((Object)this$a).equals(other$a)) {
            return false;
        }
        Vertex this$b = this.getB();
        Vertex other$b = other.getB();
        if (this$b == null ? other$b != null : !((Object)this$b).equals(other$b)) {
            return false;
        }
        Vertex this$c = this.getC();
        Vertex other$c = other.getC();
        return !(this$c == null ? other$c != null : !((Object)this$c).equals(other$c));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Vertex $a = this.getA();
        result = result * 59 + ($a == null ? 43 : ((Object)$a).hashCode());
        Vertex $b = this.getB();
        result = result * 59 + ($b == null ? 43 : ((Object)$b).hashCode());
        Vertex $c = this.getC();
        result = result * 59 + ($c == null ? 43 : ((Object)$c).hashCode());
        return result;
    }

    public String toString() {
        return "Triangle(a=" + String.valueOf(this.getA()) + ", b=" + String.valueOf(this.getB()) + ", c=" + String.valueOf(this.getC()) + ")";
    }
}

