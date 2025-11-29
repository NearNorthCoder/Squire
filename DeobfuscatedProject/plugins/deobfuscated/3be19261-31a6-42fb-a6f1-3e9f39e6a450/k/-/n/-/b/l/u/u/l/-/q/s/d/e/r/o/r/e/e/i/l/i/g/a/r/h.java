/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=130)
public class h
extends Task {
    private static /* synthetic */ String[] lIIllllIllIl;
    private static /* synthetic */ int[] lIIllllIlllI;
    private final /* synthetic */ SquireBlueDragonKillerConfig C;

    private static String llIlIIlIIIIlll(String lllllllllllllllIlllIlIIIlllllllI, String lllllllllllllllIlllIlIIIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIIIIIlI.init(lIIllllIlllI[1], lllllllllllllllIlllIlIIlIIIIIIll);
            return new String(lllllllllllllllIlllIlIIlIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIIIIIIl) {
            lllllllllllllllIlllIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        h.llIlIIlIIIlIIl();
        h.llIlIIlIIIlIII();
    }

    private static boolean llIlIIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIlIIlIIIlIll(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (h.llIlIIlIIIlIll(h.llIlIIlIIIlIlI(Combat.getHealthPercent(), this.C.eatAt()))) {
            return lIIllllIlllI[0];
        }
        Item lllllllllllllllIlllIlIIlIIIIlIII = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIIllllIlllI[2]];
            stringArray[h.lIIllllIlllI[0]] = lIIllllIllIl[lIIllllIlllI[2]];
            return item.hasAction(stringArray);
        });
        if (h.llIlIIlIIIllII(lllllllllllllllIlllIlIIlIIIIlIII)) {
            return lIIllllIlllI[0];
        }
        var1_1.interact(lIIllllIllIl[lIIllllIlllI[0]]);
        this.sleep(lIIllllIlllI[1]);
        return lIIllllIlllI[2];
    }

    @Inject
    public h(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.C = squireBlueDragonKillerConfig;
    }

    private static void llIlIIlIIIlIII() {
        lIIllllIllIl = new String[lIIllllIlllI[1]];
        h.lIIllllIllIl[h.lIIllllIlllI[0]] = h."Eat";
        h.lIIllllIllIl[h.lIIllllIlllI[2]] = h."Eat";
    }

    private static void llIlIIlIIIlIIl() {
        lIIllllIlllI = new int[3];
        h.lIIllllIlllI[0] = (138 + 21 - 2 + 10 ^ 96 + 147 - 193 + 110) & (114 + 110 - 187 + 149 ^ 176 + 33 - 86 + 66 ^ -1);
        h.lIIllllIlllI[1] = 2;
        h.lIIllllIlllI[2] = 1;
    }

    private static int llIlIIlIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

