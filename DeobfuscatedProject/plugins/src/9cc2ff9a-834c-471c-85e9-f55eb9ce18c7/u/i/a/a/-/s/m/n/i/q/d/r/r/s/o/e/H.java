/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Drinking range potion")
public class H
extends Task {
    private final /* synthetic */ g aP;
    private static /* synthetic */ String[] lIIlIlIlIIlII;
    private static /* synthetic */ int[] lIIlIlIlIIlIl;

    private static void lIlIlIlllllIlIl() {
        lIIlIlIlIIlIl = new int[7];
        H.lIIlIlIlIIlIl[0] = (0x48 ^ 0x29) & ~(0xF ^ 0x6E);
        H.lIIlIlIlIIlIl[1] = 0x3C ^ 0x28;
        H.lIIlIlIlIIlIl[2] = 0xB3 ^ 0xB5;
        H.lIIlIlIlIIlIl[3] = " ".length();
        H.lIIlIlIlIIlIl[4] = "  ".length();
        H.lIIlIlIlIIlIl[5] = "   ".length();
        H.lIIlIlIlIIlIl[6] = 0x51 ^ 0x26 ^ 100 + 28 - 64 + 63;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        H llllllllllllllIllllIlllIlIllllll;
        if (!H.lIlIlIlllllIllI(this.aP.m() ? 1 : 0) || H.lIlIlIlllllIllI(this.aP.l() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIlllllIlll(llllllllllllllIllllIlllIlIllllll.aP.k(), lIIlIlIlIIlIl[1])) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIllllllIII(llllllllllllllIllllIlllIlIllllll.aP.t()) && H.lIlIlIlllllIllI(llllllllllllllIllllIlllIlIllllll.aP.t().B() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        Item llllllllllllllIllllIlllIlIlllllI = Inventory.getFirst(item -> {
            int n2;
            if (!H.lIlIlIllllllIlI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[3]]) ? 1 : 0) || H.lIlIlIlllllIllI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[4]]) ? 1 : 0)) {
                n2 = lIIlIlIlIIlIl[3];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((110 + 96 - 203 + 135 ^ 30 + 7 - 3 + 144) & (9 ^ 0x16 ^ (0x7B ^ 0x5C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIlIlIlIIlIl[0];
            }
            return n2 != 0;
        });
        if (H.lIlIlIllllllIIl(llllllllllllllIllllIlllIlIlllllI)) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIlllllIlll(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIIlIlIlIIlIl[2])) {
            return lIIlIlIlIIlIl[0];
        }
        var1_1.interact(lIIlIlIlIIlII[lIIlIlIlIIlIl[0]]);
        return lIIlIlIlIIlIl[3];
    }

    private static boolean lIlIlIllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllllllIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllllllIIl(Object object) {
        return object == null;
    }

    @Inject
    public H(g g2) {
        this.aP = g2;
    }

    static {
        H.lIlIlIlllllIlIl();
        H.lIlIlIlllllIlII();
    }

    private static String lIlIlIlllllIIll(String llllllllllllllIllllIlllIlIIlllII, String llllllllllllllIllllIlllIlIIllIll) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIlIIllIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIIlIl[6]), "DES");
            Cipher llllllllllllllIllllIlllIlIIllllI = Cipher.getInstance("DES");
            llllllllllllllIllllIlllIlIIllllI.init(lIIlIlIlIIlIl[4], llllllllllllllIllllIlllIlIIlllll);
            return new String(llllllllllllllIllllIlllIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlllIlIIlllIl) {
            llllllllllllllIllllIlllIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlIlllllIlII() {
        lIIlIlIlIIlII = new String[lIIlIlIlIIlIl[5]];
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[0]] = H.lIlIlIlllllIIlI("FTEQNjE=", "QCyXZ");
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[3]] = H.lIlIlIlllllIIll("BHULWyCJRlA=", "ZmGhZ");
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[4]] = H.lIlIlIlllllIIlI("Mi00ICE/Ig==", "PLGTH");
    }

    private static String lIlIlIlllllIIlI(String llllllllllllllIllllIlllIlIllIIIl, String llllllllllllllIllllIlllIlIlIlIll) {
        llllllllllllllIllllIlllIlIllIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlllIlIlIllll = new StringBuilder();
        char[] llllllllllllllIllllIlllIlIlIlllI = llllllllllllllIllllIlllIlIlIlIll.toCharArray();
        int llllllllllllllIllllIlllIlIlIllIl = lIIlIlIlIIlIl[0];
        char[] llllllllllllllIllllIlllIlIlIIlll = llllllllllllllIllllIlllIlIllIIIl.toCharArray();
        int llllllllllllllIllllIlllIlIlIIllI = llllllllllllllIllllIlllIlIlIIlll.length;
        int llllllllllllllIllllIlllIlIlIIlIl = lIIlIlIlIIlIl[0];
        while (H.lIlIlIllllllIll(llllllllllllllIllllIlllIlIlIIlIl, llllllllllllllIllllIlllIlIlIIllI)) {
            char llllllllllllllIllllIlllIlIllIIlI = llllllllllllllIllllIlllIlIlIIlll[llllllllllllllIllllIlllIlIlIIlIl];
            llllllllllllllIllllIlllIlIlIllll.append((char)(llllllllllllllIllllIlllIlIllIIlI ^ llllllllllllllIllllIlllIlIlIlllI[llllllllllllllIllllIlllIlIlIllIl % llllllllllllllIllllIlllIlIlIlllI.length]));
            "".length();
            ++llllllllllllllIllllIlllIlIlIllIl;
            ++llllllllllllllIllllIlllIlIlIIlIl;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlllIlIlIllll);
    }

    private static boolean lIlIlIlllllIllI(int n2) {
        return n2 != 0;
    }
}

