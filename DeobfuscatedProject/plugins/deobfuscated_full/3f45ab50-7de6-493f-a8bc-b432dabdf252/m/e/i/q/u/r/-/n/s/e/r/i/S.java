/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMinerConfig;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public abstract class S
extends Task {
    protected static final /* synthetic */ int at;
    protected static final /* synthetic */ int ar;
    protected final /* synthetic */ SquireMinerConfig au;
    protected static final /* synthetic */ int as;
    private static /* synthetic */ int[] lllllIlIIIlI;

    private static boolean lIIlIIllIIlIlIl(int n2) {
        return n2 > 0;
    }

    public boolean run() {
        S var1;
        if (S.lIIlIIllIIlIIlI((Object)this.au.activity(), (Object)a.SANDSTONE) && S.lIIlIIllIIlIIlI((Object)this.au.activity(), (Object)a.GRANITE)) {
            return lllllIlIIIlI[1];
        }
        if (S.lIIlIIllIIlIIll(var1.au.waterskins())) {
            return lllllIlIIIlI[1];
        }
        int[] nArray = new int[lllllIlIIIlI[3]];
        nArray[S.lllllIlIIIlI[1]] = lllllIlIIIlI[11];
        if (S.lIIlIIllIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return lllllIlIIIlI[1];
        }
        if (S.lIIlIIllIIlIlIl(var1.y()) && S.lIIlIIllIIlIlII(var1.z() ? 1 : 0)) {
            return lllllIlIIIlI[1];
        }
        return this.t();
    }

    private static boolean lIIlIIllIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    protected boolean z() {
        boolean bl;
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        if (!S.lIIlIIllIIlIIII(worldPoint.getX(), lllllIlIIIlI[9]) || S.lIIlIIllIIlIIIl(worldPoint.getY(), lllllIlIIIlI[10])) {
            bl = lllllIlIIIlI[3];
            0;
            if (((72 + 198 - 192 + 128 ^ 112 + 73 - 65 + 77) & (0x78 ^ 0x21 ^ (0xEE ^ 0xBC) ^ -1)) >= 1) {
                return ((26 + 24 - -37 + 66 ^ 37 + 6 - -104 + 4) & (0x1F ^ 0xD ^ (0xD ^ 0x11) ^ -1)) != 0;
            }
        } else {
            bl = lllllIlIIIlI[1];
        }
        return bl;
    }

    protected int y() {
        int[] nArray = new int[lllllIlIIIlI[0]];
        nArray[S.lllllIlIIIlI[1]] = lllllIlIIIlI[2];
        nArray[S.lllllIlIIIlI[3]] = lllllIlIIIlI[4];
        nArray[S.lllllIlIIIlI[5]] = lllllIlIIIlI[6];
        nArray[S.lllllIlIIIlI[7]] = lllllIlIIIlI[8];
        return Inventory.getCount((int[])nArray);
    }

    private static boolean lIIlIIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    protected S(SquireMinerConfig squireMinerConfig) {
        this.au = squireMinerConfig;
    }

    public abstract boolean t();

    private static boolean lIIlIIllIIlIlII(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIllIIIllll() {
        lllllIlIIIlI = new int[13];
        S.lllllIlIIIlI[0] = 22 + 40 - 40 + 116 ^ 53 + 123 - 38 + 4;
        S.lllllIlIIIlI[1] = (32 + 149 - 157 + 143 ^ 44 + 44 - -6 + 88) & (103 + 60 - 145 + 192 ^ 148 + 50 - 63 + 60 ^ -1);
        S.lllllIlIIIlI[2] = -(0xFFFFBEBF & 0x79C1) & (0xFFFFFF9F & 0x3FFF);
        S.lllllIlIIIlI[3] = 1;
        S.lllllIlIIIlI[4] = -(0x28 ^ 0x2F) & (0xFFFF8F27 & 0x77FF);
        S.lllllIlIIIlI[5] = 2;
        S.lllllIlIIIlI[6] = -(0xFFFFFCDB & 0x7BE5) & (0xFFFFFFE3 & Short.MAX_VALUE);
        S.lllllIlIIIlI[7] = 3;
        S.lllllIlIIIlI[8] = 0xFFFF9737 & 0x6FED;
        S.lllllIlIIIlI[9] = -(0xFFFFFFC7 & 0x12BF) & (0xFFFFDFFF & 0x3EFF);
        S.lllllIlIIIlI[10] = 0xFFFF9BE2 & 0x6F3F;
        S.lllllIlIIIlI[11] = 0xFFFFFB59 & 0x6DFF;
        S.lllllIlIIIlI[12] = -(0xFFFFFFDD & 0x4E33) & (0xFFFFFFFF & 0xEF7E);
    }

    private static boolean lIIlIIllIIlIIll(int n2) {
        return n2 == 0;
    }

    static {
        S.lIIlIIllIIIllll();
        at = lllllIlIIIlI[12];
        as = lllllIlIIIlI[10];
        ar = lllllIlIIIlI[9];
    }
}

