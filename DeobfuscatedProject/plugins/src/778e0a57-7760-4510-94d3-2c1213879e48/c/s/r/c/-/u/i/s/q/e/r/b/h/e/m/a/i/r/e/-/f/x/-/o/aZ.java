/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Dropping Tools", priority=21000, blocking=true)
public class aZ
extends bg {
    private static /* synthetic */ int[] lIlIIIIIlIlI;

    private static boolean llIlIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIlIIIIllIl() {
        lIlIIIIIlIlI = new int[21];
        aZ.lIlIIIIIlIlI[0] = " ".length() & ~" ".length();
        aZ.lIlIIIIIlIlI[1] = 4 ^ 0xE;
        aZ.lIlIIIIIlIlI[2] = -(0xFFFFB657 & 0x69BB) & (0xFFFFF9BF & 0x77FF);
        aZ.lIlIIIIIlIlI[3] = " ".length();
        aZ.lIlIIIIIlIlI[4] = -(0xFFFF8FB1 & 0x7E5F) & (0xFFFFFFBF & 0x5FFF);
        aZ.lIlIIIIIlIlI[5] = "  ".length();
        aZ.lIlIIIIIlIlI[6] = -(0xFFFFC972 & 0x3EDF) & (0xFFFFDDFF & 0x7BFF);
        aZ.lIlIIIIIlIlI[7] = "   ".length();
        aZ.lIlIIIIIlIlI[8] = 0xFFFF9FFF & 0x74DD;
        aZ.lIlIIIIIlIlI[9] = 0x96 ^ 0x92;
        aZ.lIlIIIIIlIlI[10] = 0xFFFFC7BA & 0x3BFD;
        aZ.lIlIIIIIlIlI[11] = 0xC1 ^ 0xC4;
        aZ.lIlIIIIIlIlI[12] = 0xFFFFBFFF & 0x54DF;
        aZ.lIlIIIIIlIlI[13] = 0x6E ^ 0x77 ^ (0x4E ^ 0x51);
        aZ.lIlIIIIIlIlI[14] = -(0xFFFFFF4B & 0x2ABD) & (0xFFFFFBF9 & 0x7F4F);
        aZ.lIlIIIIIlIlI[15] = 0x32 ^ 0x35;
        aZ.lIlIIIIIlIlI[16] = 0xFFFFFD46 & 0x53F9;
        aZ.lIlIIIIIlIlI[17] = 0x79 ^ 0x2F ^ (0xF1 ^ 0xAF);
        aZ.lIlIIIIIlIlI[18] = 0xFFFFD7FB & 0x79AF;
        aZ.lIlIIIIIlIlI[19] = 0x3B ^ 0x5A ^ (0x7D ^ 0x15);
        aZ.lIlIIIIIlIlI[20] = -(0xFFFFEEB7 & 0x3D5B) & (0xFFFFFFFF & 0x7DBE);
    }

    @Override
    public boolean dY() {
        if (!aZ.llIlIlIIIIlllI(this.cq(), this.el) || aZ.llIlIlIIIIllll(this.cp(), this.ee())) {
            return lIlIIIIIlIlI[0];
        }
        int[] nArray = new int[lIlIIIIIlIlI[1]];
        nArray[aZ.lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        nArray[aZ.lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        nArray[aZ.lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        nArray[aZ.lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        nArray[aZ.lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        nArray[aZ.lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        nArray[aZ.lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        nArray[aZ.lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        nArray[aZ.lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        nArray[aZ.lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        if (aZ.llIlIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIIIlIlI[0];
        }
        int[] nArray2 = new int[lIlIIIIIlIlI[1]];
        nArray2[aZ.lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        nArray2[aZ.lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        nArray2[aZ.lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        nArray2[aZ.lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        nArray2[aZ.lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        nArray2[aZ.lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        nArray2[aZ.lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        nArray2[aZ.lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        nArray2[aZ.lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        nArray2[aZ.lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        Inventory.dropAll((int[])nArray2);
        "".length();
        return lIlIIIIIlIlI[3];
    }

    static {
        aZ.llIlIlIIIIllIl();
    }

    private static boolean llIlIlIIIlIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected aZ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

