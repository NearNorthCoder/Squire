/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Farming", priority=21002, blocking=true)
public class bf
extends bg {
    private final /* synthetic */ int ek = 7603;
    private static /* synthetic */ int[] lIlIlIIllIll;
    private final /* synthetic */ int ej = 29742;

    private static void llIlllIlIlIIll() {
        lIlIlIIllIll = new int[7];
        bf.lIlIlIIllIll[0] = 0xFFFFFE3F & 0x75EE;
        bf.lIlIlIIllIll[1] = 0xFFFFDFFF & 0x3DB3;
        bf.lIlIlIIllIll[2] = " ".length();
        bf.lIlIlIIllIll[3] = (0xDC ^ 0x93) & ~(0x11 ^ 0x5E);
        bf.lIlIlIIllIll[4] = 0xFFFFFCDF & 0x17FF;
        bf.lIlIlIIllIll[5] = -(0x17 ^ 0x54) & (0xFFFFF5FF & 0x5BEF);
        bf.lIlIlIIllIll[6] = -(0xFFFFEA97 & 0x1FEB) & (0xFFFFFFE7 & 0x7EDF);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_2;
        void var1_1;
        int[] nArray = new int[lIlIlIIllIll[2]];
        nArray[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[4];
        if (bf.llIlllIlIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIllIll[3];
        }
        int[] nArray2 = new int[lIlIlIIllIll[2]];
        nArray2[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[5];
        Item lllllllllllllllIllIlIIIlIlIlIllI = Inventory.getFirst((int[])nArray2);
        if (bf.llIlllIlIlIlIl(lllllllllllllllIllIlIIIlIlIlIllI)) {
            return lIlIlIIllIll[3];
        }
        int[] nArray3 = new int[lIlIlIIllIll[2]];
        nArray3[bf.lIlIlIIllIll[3]] = lIlIlIIllIll[6];
        TileObject lllllllllllllllIllIlIIIlIlIlIlIl = TileObjects.getNearest((int[])nArray3);
        if (bf.llIlllIlIlIlIl(lllllllllllllllIllIlIIIlIlIlIlIl)) {
            return lIlIlIIllIll[3];
        }
        var1_1.useOn((TileObject)var2_2);
        return lIlIlIIllIll[2];
    }

    @Inject
    protected bf(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ej = lIlIlIIllIll[0];
        this.ek = lIlIlIIllIll[1];
    }

    private static boolean llIlllIlIlIlIl(Object object) {
        return object == null;
    }

    private static boolean llIlllIlIlIlII(int n2) {
        return n2 == 0;
    }

    static {
        bf.llIlllIlIlIIll();
    }
}

