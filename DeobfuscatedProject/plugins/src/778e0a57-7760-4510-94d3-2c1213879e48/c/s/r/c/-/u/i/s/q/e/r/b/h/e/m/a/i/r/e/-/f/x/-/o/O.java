/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import net.runelite.api.coords.WorldPoint;

public class O {
    private /* synthetic */ WorldPoint bq;
    private final /* synthetic */ char cj;
    private final /* synthetic */ int ci;
    private /* synthetic */ O cl;
    private /* synthetic */ O ck;

    public char ca() {
        return this.cj;
    }

    public void c(O o2) {
        this.cl = o2;
    }

    public O cc() {
        return this.cl;
    }

    public void b(O o2) {
        this.ck = o2;
    }

    public int bZ() {
        return this.ci;
    }

    public O cb() {
        return this.ck;
    }

    public void b(WorldPoint worldPoint) {
        this.bq = worldPoint;
    }

    public WorldPoint cd() {
        return this.bq;
    }

    O(int n2, char c2) {
        this.ci = n2;
        this.cj = c2;
    }
}

