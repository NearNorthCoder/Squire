/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina")
public class g
extends Task {
    private static /* synthetic */ int[] lIlIIlIIlIIll;
    private static /* synthetic */ String[] lIlIIlIIlIIlI;
    private final /* synthetic */ SquireSkipperConfig B;

    private static boolean lIlllIlIIllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlllIlIIlIllll() {
        lIlIIlIIlIIlI = new String[lIlIIlIIlIIll[3]];
        g.lIlIIlIIlIIlI[g.lIlIIlIIlIIll[0]] = g."Drink";
        g.lIlIIlIIlIIlI[g.lIlIIlIIlIIll[2]] = g."Stamina";
    }

    private static boolean lIlllIlIIllIlII(int n2) {
        return n2 != 0;
    }

    private static void lIlllIlIIllIIII() {
        lIlIIlIIlIIll = new int[4];
        g.lIlIIlIIlIIll[0] = (0xE3 ^ 0x96 ^ (0x85 ^ 0xAA)) & (0x40 ^ 0x3B ^ (0xA ^ 0x2B) ^ -1);
        g.lIlIIlIIlIIll[1] = 11 + 108 - 51 + 77 ^ 108 + 47 - 119 + 122;
        g.lIlIIlIIlIIll[2] = 1;
        g.lIlIIlIIlIIll[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.lIlllIlIIllIIIl(this.B.sipStam() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (g.lIlllIlIIllIIll(Movement.getRunEnergy(), lIlIIlIIlIIll[1]) && g.lIlllIlIIllIlII(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        Item llllllllllllllIllIlllIlllIlIlIII = Inventory.getFirst(item -> item.getName().contains(lIlIIlIIlIIlI[lIlIIlIIlIIll[2]]));
        if (g.lIlllIlIIllIlIl(llllllllllllllIllIlllIlllIlIlIII)) {
            return lIlIIlIIlIIll[0];
        }
        var1_1.interact(lIlIIlIIlIIlI[lIlIIlIIlIIll[0]]);
        return lIlIIlIIlIIll[2];
    }

    @Inject
    public g(SquireSkipperConfig squireSkipperConfig) {
        this.B = squireSkipperConfig;
    }

    private static String lIlllIlIIlIlllI(String llllllllllllllIllIlllIlllIIlllII, String llllllllllllllIllIlllIlllIIlIIlI) {
        llllllllllllllIllIlllIlllIIlllII = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlllIIllIII = new StringBuilder();
        char[] llllllllllllllIllIlllIlllIIlIllI = llllllllllllllIllIlllIlllIIlIIlI.toCharArray();
        int llllllllllllllIllIlllIlllIIlIlIl = lIlIIlIIlIIll[0];
        char[] llllllllllllllIllIlllIlllIIIlllI = llllllllllllllIllIlllIlllIIlllII.toCharArray();
        int llllllllllllllIllIlllIlllIIIllIl = llllllllllllllIllIlllIlllIIIlllI.length;
        int llllllllllllllIllIlllIlllIIIllII = lIlIIlIIlIIll[0];
        while (g.lIlllIlIIlllIII(llllllllllllllIllIlllIlllIIIllII, llllllllllllllIllIlllIlllIIIllIl)) {
            char llllllllllllllIllIlllIlllIIllllI = llllllllllllllIllIlllIlllIIIlllI[llllllllllllllIllIlllIlllIIIllII];
            llllllllllllllIllIlllIlllIIllIII.append((char)(llllllllllllllIllIlllIlllIIllllI ^ llllllllllllllIllIlllIlllIIlIllI[llllllllllllllIllIlllIlllIIlIlIl % llllllllllllllIllIlllIlllIIlIllI.length]));
            0;
            ++llllllllllllllIllIlllIlllIIlIlIl;
            ++llllllllllllllIllIlllIlllIIIllII;
            0;
            if ((0x1A ^ 0x1F) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIlllIIllIII);
    }

    static {
        g.lIlllIlIIllIIII();
        g.lIlllIlIIlIllll();
    }

    private static boolean lIlllIlIIlllIII(int n2, int n3) {
        return n2 < n3;
    }
}

