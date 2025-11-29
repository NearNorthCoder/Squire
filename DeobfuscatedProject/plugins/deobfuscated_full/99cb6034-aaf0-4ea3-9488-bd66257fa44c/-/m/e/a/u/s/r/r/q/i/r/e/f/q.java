/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public class q {
    private final /* synthetic */ String aJ;
    private final /* synthetic */ N[] aM;
    private final /* synthetic */ int aK;
    private static /* synthetic */ int[] lIlllIllIllI;
    private final /* synthetic */ boolean aL;

    /*
     * WARNING - void declaration
     */
    q(String string, int n2, boolean bl, N ... nArray) {
        void var9;
        this.aJ = string;
        this.aK = n2;
        this.aL = bl;
        this.aM = nArray;
        N[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var14 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var14, (int)var9)) {
            q var4;
            void var13;
            void var6 = var13[var14];
            var6.d(var4);
            ++var14;
            0;
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
        void var10;
        N[] nArray = this.aM;
        int n2 = nArray.length;
        int var5 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var5, (int)var10)) {
            void var2;
            void var7 = var2[var5];
            if (!q.lllIllIlIIIIll((Object)var7.aL(), (Object)P.COMPOST) || q.lllIllIlIIIlII((Object)var7.aL(), (Object)P.GIANT_COMPOST)) {
                return var7;
            }
            ++var5;
            0;
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
        void var12;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        N[] nArray = this.aM;
        int n2 = nArray.length;
        int var3 = lIlllIllIllI[0];
        while (q.lllIllIlIIIIIl(var3, (int)var12)) {
            void var11;
            void var8;
            void var1 = var8[var3];
            var11.add(var1.aN());
            0;
            ++var3;
            0;
            if (2 != 0) continue;
            return null;
        }
        return arrayList;
    }

    private static void lllIllIlIIIIII() {
        lIlllIllIllI = new int[2];
        q.lIlllIllIllI[0] = (0xA5 ^ 0x8B ^ (0x57 ^ 0x21)) & (0x9A ^ 0x9E ^ (0xD3 ^ 0x8F) ^ -1);
        q.lIlllIllIllI[1] = 1;
    }

    public String toString() {
        return this.aJ;
    }

    public boolean a(Client client) {
        boolean bl;
        WorldPoint worldPoint = client.getLocalPlayer().getWorldLocation();
        if (q.lllIllIlIIIIlI(worldPoint.getRegionID(), this.aK)) {
            bl = lIlllIllIllI[1];
            0;
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

