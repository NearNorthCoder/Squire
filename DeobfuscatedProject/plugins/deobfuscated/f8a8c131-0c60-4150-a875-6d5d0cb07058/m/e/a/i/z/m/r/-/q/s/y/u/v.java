/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.g;
import m.e.a.i.z.m.r.-.q.s.y.u.i;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class v
extends Task {
    private static /* synthetic */ String[] lIllIIIlIlIlI;
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireZammyConfig aq;
    private final /* synthetic */ l an;
    private static /* synthetic */ int[] lIllIIIlIlIll;

    private static boolean llIIIlIlIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIllllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        int llllllllllllllIllIIlIlllIlllIIlI;
        int n2;
        v llllllllllllllIllIIlIlllIlllIlII;
        if (!v.llIIIlIIllllIll(this.an.B() ? 1 : 0) || v.llIIIlIIllllIll(this.an.A() ? 1 : 0)) {
            return lIllIIIlIlIll[0];
        }
        TileItem llllllllllllllIllIIlIlllIlllIIll = llllllllllllllIllIIlIlllIlllIlII.P();
        if (v.llIIIlIIlllllII(llllllllllllllIllIIlIlllIlllIIll) && v.llIIIlIIlllllIl(llllllllllllllIllIIlIlllIlllIlII.ao.a(llllllllllllllIllIIlIlllIlllIIll), lIllIIIlIlIll[1])) {
            n2 = lIllIIIlIlIll[2];
            0;
            if ((0x5C ^ 0x58) == 2) {
                return ((0x6C ^ 0x30) & ~(0x25 ^ 0x79)) != 0;
            }
        } else {
            n2 = llllllllllllllIllIIlIlllIlllIIlI = lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(llllllllllllllIllIIlIlllIlllIlII.an.D() ? 1 : 0) && v.llIIIlIIllllllI(llllllllllllllIllIIlIlllIlllIIlI)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIlllllll(llllllllllllllIllIIlIlllIlllIlII.an.z(), lIllIIIlIlIll[3]) && v.llIIIlIIllllllI(llllllllllllllIllIIlIlllIlllIIlI)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Movement.isRunEnabled() ? 1 : 0) && v.llIIIlIIllllIll(llllllllllllllIllIIlIlllIlllIlII.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.llIIIlIlIIIIIII(llllllllllllllIllIIlIlllIlllIIll)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllIIIlIlIll[2]];
            nArray[v.lIllIIIlIlIll[0]] = llllllllllllllIllIIlIlllIlllIIll.getId();
            if (!v.llIIIlIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) || v.llIIIlIIllllllI(llllllllllllllIllIIlIlllIlllIIll.isStackable() ? 1 : 0)) {
                Item llllllllllllllIllIIlIlllIlllIIIl = llllllllllllllIllIIlIlllIlllIlII.ap.w();
                if (v.llIIIlIIlllllII(llllllllllllllIllIIlIlllIlllIIIl)) {
                    llllllllllllllIllIIlIlllIlllIIIl.interact(lIllIIIlIlIlI[lIllIIIlIlIll[0]]);
                    return lIllIIIlIlIll[2];
                }
                Item llllllllllllllIllIIlIlllIlllIIII = llllllllllllllIllIIlIlllIlllIlII.ao.y().orElse(null);
                if (v.llIIIlIlIIIIIII(llllllllllllllIllIIlIlllIlllIIII)) {
                    return lIllIIIlIlIll[0];
                }
                if (v.llIIIlIIllllllI(llllllllllllllIllIIlIlllIlllIlII.ao.a(llllllllllllllIllIIlIlllIlllIIII, llllllllllllllIllIIlIlllIlllIIll) ? 1 : 0)) {
                    return lIllIIIlIlIll[0];
                }
                llllllllllllllIllIIlIlllIlllIIII.interact(lIllIIIlIlIlI[lIllIIIlIlIll[2]]);
            }
        }
        if (v.llIIIlIIllllIll(Movement.shouldWalk() ? 1 : 0)) {
            llllllllllllllIllIIlIlllIlllIIll.interact(lIllIIIlIlIlI[lIllIIIlIlIll[4]]);
            llllllllllllllIllIIlIlllIlllIlII.sleep(lIllIIIlIlIll[2]);
        }
        return lIllIIIlIlIll[2];
    }

    private static void llIIIlIIllllIIl() {
        lIllIIIlIlIlI = new String[lIllIIIlIlIll[5]];
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[0]] = v."Eat";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[2]] = v."Drop";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[4]] = v."Take";
    }

    private static boolean llIIIlIIlllllII(Object object) {
        return object != null;
    }

    private static void llIIIlIIllllIlI() {
        lIllIIIlIlIll = new int[7];
        v.lIllIIIlIlIll[0] = (0x67 ^ 0x43) & ~(0x73 ^ 0x57);
        v.lIllIIIlIlIll[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        v.lIllIIIlIlIll[2] = 1;
        v.lIllIIIlIlIll[3] = 90 + 108 - 129 + 76 ^ 104 + 134 - 91 + 8;
        v.lIllIIIlIlIll[4] = 2;
        v.lIllIIIlIlIll[5] = 3;
        v.lIllIIIlIlIll[6] = 0x82 ^ 0x92 ^ (0x12 ^ 0xA);
    }

    private static boolean llIIIlIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private TileItem P() {
        return this.ao.x().orElse(null);
    }

    private static String llIIIlIIllllIII(String llllllllllllllIllIIlIlllIllIlIII, String llllllllllllllIllIIlIlllIllIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlllIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllIllIIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIlIll[6]), "DES");
            Cipher llllllllllllllIllIIlIlllIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlllIllIlIlI.init(lIllIIIlIlIll[4], llllllllllllllIllIIlIlllIllIlIll);
            return new String(llllllllllllllIllIIlIlllIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlllIllIlIIl) {
            llllllllllllllIllIIlIlllIllIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        v.llIIIlIIllllIlI();
        v.llIIIlIIllllIIl();
    }

    private static String llIIIlIIlllIlll(String llllllllllllllIllIIlIlllIlIllIII, String llllllllllllllIllIIlIlllIlIlIlll) {
        llllllllllllllIllIIlIlllIlIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlllIlIlIllI = new StringBuilder();
        char[] llllllllllllllIllIIlIlllIlIlIlIl = llllllllllllllIllIIlIlllIlIlIlll.toCharArray();
        int llllllllllllllIllIIlIlllIlIlIlII = lIllIIIlIlIll[0];
        char[] llllllllllllllIllIIlIlllIlIIlllI = llllllllllllllIllIIlIlllIlIllIII.toCharArray();
        int llllllllllllllIllIIlIlllIlIIllIl = llllllllllllllIllIIlIlllIlIIlllI.length;
        int llllllllllllllIllIIlIlllIlIIllII = lIllIIIlIlIll[0];
        while (v.llIIIlIlIIIIIIl(llllllllllllllIllIIlIlllIlIIllII, llllllllllllllIllIIlIlllIlIIllIl)) {
            char llllllllllllllIllIIlIlllIlIllIIl = llllllllllllllIllIIlIlllIlIIlllI[llllllllllllllIllIIlIlllIlIIllII];
            llllllllllllllIllIIlIlllIlIlIllI.append((char)(llllllllllllllIllIIlIlllIlIllIIl ^ llllllllllllllIllIIlIlllIlIlIlIl[llllllllllllllIllIIlIlllIlIlIlII % llllllllllllllIllIIlIlllIlIlIlIl.length]));
            0;
            ++llllllllllllllIllIIlIlllIlIlIlII;
            ++llllllllllllllIllIIlIlllIlIIllII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIlllIlIlIllI);
    }

    @Inject
    public v(l l2, i i2, g g2, SquireZammyConfig squireZammyConfig) {
        this.an = l2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireZammyConfig;
    }

    private static boolean llIIIlIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIIllllllI(int n2) {
        return n2 == 0;
    }
}

