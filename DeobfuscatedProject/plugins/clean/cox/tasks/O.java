/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import net.runelite.api.coords.WorldPoint;

public class O {
    private  WorldPoint bq;
    private final  char cj;
    private final  int ci;
    private  O cl;
    private  O ck;

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

