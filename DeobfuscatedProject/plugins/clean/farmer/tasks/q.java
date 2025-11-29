/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum19;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public class q {
    private final  String aJ;
    private final  N[] aM;
    private final  int aK;
    
    private final  boolean aL;

    /*
     * WARNING - void declaration
     */
    q(String string, int n2, boolean bl, N ... nArray) {
        void var1;
        this.aJ = string;
        this.aK = n2;
        this.aL = bl;
        this.aM = nArray;
        N[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var2 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var2, (int)var1)) {
            q var3;
            void var4;
            void var5 = var4[var2];
            var5.d(var3);
            ++var2;

            if (2 < 3) continue;
            throw null;
        }
    }

    private static boolean lllIllIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllIlIIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIllIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean c(WorldPoint worldPoint) {
        return lIlllIllIllI[1];
    }

    /*
     * WARNING - void declaration
     */
    public N aa() {
        void var6;
        N[] nArray = this.aM;
        int n2 = nArray.length;
        int var7 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var7, (int)var6)) {
            void var8;
            void var9 = var8[var7];
            if (!q.lllIllIlIIIIll((Object)var9.aL(), (Object)P.COMPOST) || q.lllIllIlIIIlII((Object)var9.aL(), (Object)P.GIANT_COMPOST)) {
                return var9;
            }
            ++var7;

            if (((0x12 ^ 0x5A ^ (9 ^ 0x75)) & (82 + 83 - 161 + 241 ^ 72 + 80 - 131 + 172 ^ -1)) < 1) continue;
            return null;
        }
        return null;
    }

    private static boolean lllIllIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    public String ac() {
        return this.aJ;
    }

    public int X() {
        return this.aK;
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> ab() {
        void var10;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        N[] nArray = this.aM;
        int n2 = nArray.length;
        int var11 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var11, (int)var10)) {
            void var12;
            void var13;
            void var14 = var13[var11];
            var12.add(var14.aN());

            ++var11;

            if (2 != 0) continue;
            return null;
        }
        return arrayList;
    }

    public String toString() {
        return this.aJ;
    }

    public boolean a(Client client) {
        boolean bl;
        WorldPoint worldPoint = client.getLocalPlayer().getWorldLocation();
        if (q.lllIllIlIIIIlI(worldPoint.getRegionID(), this.aK)) {
            bl = lIlllIllIllI[1];

            if (2 < 0) {
                return false;
            }
        } else {
            bl = lIlllIllIllI[0];
        }
        return bl;
    }

    public N[] ae() {
        return this.aM;
    }

    public boolean ad() {
        return this.aL;
    }

    static {
        q.lllIllIlIIIIII();
    }
}

