/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.CHelper;
import net.runelite.api.TileObject;
import net.unethicalite.client.Static;

public class JHelper {
    private  TileObject W;
    private  int Z;
    private  int Y;
    private  int X;

    public TileObject aI() {
        return this.W;
    }

    public int aG() {
        return this.Y;
    }

    public JHelper(TileObject tileObject) {
        this.W = tileObject;
        this.X = var1[0];
        this.Z = var1[1];
    }

    private static void var2() {
        var1 = new int[2];
        J.var1[0] = (60 + 97 - 60 + 156 ^ 9 + 173 - 59 + 72) & (0xC9 ^ 0xC6 ^ (0x6D ^ 0x5C) ^ -1);
        J.var1[1] = -1;
    }

    public int aF() {
        return Static.getClient().getTickCount() - this.X;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    static {
        J.var2();
    }

    public int aH() {
        return this.Z;
    }

    public void aE() {
        int n2 = Static.getClient().getTickCount();
        int n3 = c.a(this.W);
        if (J.var3(this.Y, n3)) {
            return;
        }
        this.Z = this.Y;
        this.X = n2;
        this.Y = n3;
    }
}

