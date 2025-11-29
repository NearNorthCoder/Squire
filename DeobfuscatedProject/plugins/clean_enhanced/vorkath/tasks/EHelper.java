/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.vorkath.tasks;

import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;

public class EHelper {
     int H;
     Projectile G;
     WorldPoint I;

    public WorldPoint w() {
        return this.I;
    }

    public Projectile u() {
        return this.G;
    }

    public EHelper(Projectile projectile, int n2, WorldPoint worldPoint) {
        this.G = projectile;
        this.H = n2;
        this.I = worldPoint;
    }

    public int v() {
        return this.H;
    }
}

