/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Restoring prayer", priority=20)
public class p
extends Task {
    private final /* synthetic */ SquireAlchemicalHydraConfig as;
    private static /* synthetic */ int[] llllIIlllIll;
    private static /* synthetic */ String[] llllIIlllIlI;
    private final /* synthetic */ a ar;

    private static boolean lIIlIIIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public p(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ar = a2;
        this.as = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIIIlllII(String lllllllllllllllIIlIlIIllllIlllIl, String lllllllllllllllIIlIlIIllllIlIlll) {
        lllllllllllllllIIlIlIIllllIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIllllIllIll = new StringBuilder();
        char[] lllllllllllllllIIlIlIIllllIllIlI = lllllllllllllllIIlIlIIllllIlIlll.toCharArray();
        int lllllllllllllllIIlIlIIllllIllIIl = llllIIlllIll[0];
        char[] lllllllllllllllIIlIlIIllllIlIIll = lllllllllllllllIIlIlIIllllIlllIl.toCharArray();
        int lllllllllllllllIIlIlIIllllIlIIlI = lllllllllllllllIIlIlIIllllIlIIll.length;
        int lllllllllllllllIIlIlIIllllIlIIIl = llllIIlllIll[0];
        while (p.lIIlIIIIIlIIlII(lllllllllllllllIIlIlIIllllIlIIIl, lllllllllllllllIIlIlIIllllIlIIlI)) {
            char lllllllllllllllIIlIlIIllllIllllI = lllllllllllllllIIlIlIIllllIlIIll[lllllllllllllllIIlIlIIllllIlIIIl];
            lllllllllllllllIIlIlIIllllIllIll.append((char)(lllllllllllllllIIlIlIIllllIllllI ^ lllllllllllllllIIlIlIIllllIllIlI[lllllllllllllllIIlIlIIllllIllIIl % lllllllllllllllIIlIlIIllllIllIlI.length]));
            "".length();
            ++lllllllllllllllIIlIlIIllllIllIIl;
            ++lllllllllllllllIIlIlIIllllIlIIIl;
            "".length();
            if (" ".length() < (0xB3 ^ 0xB7)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIllllIllIll);
    }

    private static String lIIlIIIIIIllIll(String lllllllllllllllIIlIlIIlllllIlIll, String lllllllllllllllIIlIlIIlllllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIlllIll[5]), "DES");
            Cipher lllllllllllllllIIlIlIIlllllIllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlllllIllll.init(llllIIlllIll[2], lllllllllllllllIIlIlIIllllllIIII);
            return new String(lllllllllllllllIIlIlIIlllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlllllIlllI) {
            lllllllllllllllIIlIlIIlllllIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIllllI() {
        llllIIlllIlI = new String[llllIIlllIll[4]];
        p.llllIIlllIlI[p.llllIIlllIll[0]] = p.lIIlIIIIIIllIll("gOvz1o2792g=", "kofIR");
        p.llllIIlllIlI[p.llllIIlllIll[1]] = p.lIIlIIIIIIlllII("NjEFIiY=", "rClLM");
        p.llllIIlllIlI[p.llllIIlllIll[2]] = p.lIIlIIIIIIlllIl("xVaTEpjIFnw=", "drqkk");
        p.llllIIlllIlI[p.llllIIlllIll[3]] = p.lIIlIIIIIIlllII("Jx0qJTUnHQ==", "UxYQZ");
    }

    static {
        p.lIIlIIIIIIlllll();
        p.lIIlIIIIIIllllI();
    }

    private static boolean lIIlIIIIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p lllllllllllllllIIlIlIIlllllllIII;
        if (p.lIIlIIIIIlIIIII(this.ar.g() ? 1 : 0)) {
            return llllIIlllIll[0];
        }
        if (p.lIIlIIIIIlIIIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), lllllllllllllllIIlIlIIlllllllIII.as.restorePrayAt())) {
            return llllIIlllIll[0];
        }
        Item lllllllllllllllIIlIlIIllllllIlll = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIlllIll[1]];
            stringArray[p.llllIIlllIll[0]] = llllIIlllIlI[llllIIlllIll[1]];
            if (p.lIIlIIIIIlIIIll(item.hasAction(stringArray) ? 1 : 0) && (!p.lIIlIIIIIlIIIII(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[2]]) ? 1 : 0) || p.lIIlIIIIIlIIIll(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[3]]) ? 1 : 0))) {
                n2 = llllIIlllIll[1];
                "".length();
                if ((0x4A ^ 0x2D ^ (0x1A ^ 0x79)) < ((0xEA ^ 0x9D ^ (0x49 ^ 0x37)) & (0x8F ^ 0xAE ^ (0xEA ^ 0xC2) ^ -" ".length()))) {
                    return ((0x9B ^ 0xA2 ^ (0x43 ^ 0x63)) & (54 + 115 - 107 + 72 ^ 0 + 133 - 77 + 103 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llllIIlllIll[0];
            }
            return n2 != 0;
        });
        if (p.lIIlIIIIIlIIIlI(lllllllllllllllIIlIlIIllllllIlll)) {
            return llllIIlllIll[0];
        }
        var1_1.interact(llllIIlllIlI[llllIIlllIll[0]]);
        return llllIIlllIll[1];
    }

    private static boolean lIIlIIIIIlIIIll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIIIIlllIl(String lllllllllllllllIIlIlIIllllIIlIII, String lllllllllllllllIIlIlIIllllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllllIIlIlI.init(llllIIlllIll[2], lllllllllllllllIIlIlIIllllIIlIll);
            return new String(lllllllllllllllIIlIlIIllllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIllllIIlIIl) {
            lllllllllllllllIIlIlIIllllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllIll = new int[6];
        p.llllIIlllIll[0] = (105 + 75 - 134 + 129 ^ 71 + 111 - 147 + 143) & (99 + 55 - 27 + 17 ^ 102 + 95 - 128 + 72 ^ -" ".length());
        p.llllIIlllIll[1] = " ".length();
        p.llllIIlllIll[2] = "  ".length();
        p.llllIIlllIll[3] = "   ".length();
        p.llllIIlllIll[4] = 0xB8 ^ 0xAC ^ (0x26 ^ 0x36);
        p.llllIIlllIll[5] = 0x68 ^ 0x60;
    }
}

