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
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler")
public class p
extends Task {
    private static /* synthetic */ String[] lIIllIIllIlII;
    private final /* synthetic */ TempleTrekkingConfig P;
    private final /* synthetic */ TempleTrekkingPlugin O;
    private static /* synthetic */ int[] lIIllIIllIlIl;

    private static String lIlIlllllllIllI(String llllllllllllllIllllIIIIIllllIlIl, String llllllllllllllIllllIIIIIlllllIIl) {
        llllllllllllllIllllIIIIIllllIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIlllllIII = new StringBuilder();
        char[] llllllllllllllIllllIIIIIllllIlll = llllllllllllllIllllIIIIIlllllIIl.toCharArray();
        int llllllllllllllIllllIIIIIllllIllI = lIIllIIllIlIl[0];
        char[] llllllllllllllIllllIIIIIllllIIII = llllllllllllllIllllIIIIIllllIlIl.toCharArray();
        int llllllllllllllIllllIIIIIlllIllll = llllllllllllllIllllIIIIIllllIIII.length;
        int llllllllllllllIllllIIIIIlllIlllI = lIIllIIllIlIl[0];
        while (p.lIlIlllllllllII(llllllllllllllIllllIIIIIlllIlllI, llllllllllllllIllllIIIIIlllIllll)) {
            char llllllllllllllIllllIIIIIlllllIll = llllllllllllllIllllIIIIIllllIIII[llllllllllllllIllllIIIIIlllIlllI];
            llllllllllllllIllllIIIIIlllllIII.append((char)(llllllllllllllIllllIIIIIlllllIll ^ llllllllllllllIllllIIIIIllllIlll[llllllllllllllIllllIIIIIllllIllI % llllllllllllllIllllIIIIIllllIlll.length]));
            "".length();
            ++llllllllllllllIllllIIIIIllllIllI;
            ++llllllllllllllIllllIIIIIlllIlllI;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIIlllllIII);
    }

    private static boolean lIlIllllllllIIl(Object object) {
        return object == null;
    }

    private static void lIlIlllllllIlll() {
        lIIllIIllIlII = new String[lIIllIIllIlIl[4]];
        p.lIIllIIllIlII[p.lIIllIIllIlIl[0]] = p.lIlIlllllllIllI("Cjo8OQE=", "NHUWj");
        p.lIIllIIllIlII[p.lIIllIIllIlIl[3]] = p.lIlIlllllllIllI("PBUzNCcBAA==", "oaRYN");
    }

    private static boolean lIlIlllllllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllllllllIII() {
        lIIllIIllIlIl = new int[5];
        p.lIIllIIllIlIl[0] = (0x62 ^ 0x40) & ~(0x6E ^ 0x4C);
        p.lIIllIIllIlIl[1] = 0xBB ^ 0xA5;
        p.lIIllIIllIlIl[2] = 0x6A ^ 3 ^ (0xF9 ^ 0xAC);
        p.lIIllIIllIlIl[3] = " ".length();
        p.lIIllIIllIlIl[4] = "  ".length();
    }

    static {
        p.lIlIllllllllIII();
        p.lIlIlllllllIlll();
    }

    @Inject
    p(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.O = templeTrekkingPlugin;
        this.P = templeTrekkingConfig;
    }

    private static boolean lIlIllllllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIIllIIllIlII[lIIllIIllIlIl[3]]));
        if (p.lIlIllllllllIIl(item2)) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIllllllllIlI(Movement.getRunEnergy(), lIIllIIllIlIl[1])) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIllllllllIll(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIlllllllllII(Movement.getRunEnergy(), lIIllIIllIlIl[2])) {
            void llllllllllllllIllllIIIIlIIIIIlIl;
            llllllllllllllIllllIIIIlIIIIIlIl.interact(lIIllIIllIlII[lIIllIIllIlIl[0]]);
            return lIIllIIllIlIl[3];
        }
        return lIIllIIllIlIl[0];
    }
}

