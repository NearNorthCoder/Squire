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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Drinking range potion")
public class x
extends Task {
    private static /* synthetic */ String[] lllIIIIllll;
    private static /* synthetic */ int[] lllIIIlIIIl;
    private final /* synthetic */ e ax;

    private static boolean lIlIllIllIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public x(e e2) {
        this.ax = e2;
    }

    private static boolean lIlIllIllIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIlIllllI(String llllllllllllllllIIlIIlllIllIlIIl, String llllllllllllllllIIlIIlllIllIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIllIlIll.init(lllIIIlIIIl[4], llllllllllllllllIIlIIlllIllIllII);
            return new String(llllllllllllllllIIlIIlllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIllIlIlI) {
            llllllllllllllllIIlIIlllIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIllIIllI(Object object) {
        return object == null;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIIllll = new String[lllIIIlIIIl[5]];
        x.lllIIIIllll[x.lllIIIlIIIl[0]] = x.lIlIllIlIlllIl("Kvv2BhGQxSc=", "vyEVi");
        x.lllIIIIllll[x.lllIIIlIIIl[3]] = x.lIlIllIlIllllI("PNYySuQCDVM=", "vKQnf");
        x.lllIIIIllll[x.lllIIIlIIIl[4]] = x.lIlIllIlIllllI("KADTKeOZKwA=", "cpFBa");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x llllllllllllllllIIlIIlllIlllIlII;
        if (!x.lIlIllIllIIlII(this.ax.t() ? 1 : 0) || x.lIlIllIllIIlII(this.ax.s() ? 1 : 0)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(llllllllllllllllIIlIIlllIlllIlII.ax.r(), lllIIIlIIIl[1])) {
            return lllIIIlIIIl[0];
        }
        Item llllllllllllllllIIlIIlllIlllIIll = Inventory.getFirst(item -> {
            int n2;
            if (!x.lIlIllIllIIlll(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[3]]) ? 1 : 0) || x.lIlIllIllIIlII(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[4]]) ? 1 : 0)) {
                n2 = lllIIIlIIIl[3];
                "".length();
                if ((0xAB ^ 0xAF) < "   ".length()) {
                    return ((0x5D ^ 0x1B) & ~(0x39 ^ 0x7F)) != 0;
                }
            } else {
                n2 = lllIIIlIIIl[0];
            }
            return n2 != 0;
        });
        if (x.lIlIllIllIIllI(llllllllllllllllIIlIIlllIlllIIll)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lllIIIlIIIl[2])) {
            return lllIIIlIIIl[0];
        }
        var1_1.interact(lllIIIIllll[lllIIIlIIIl[0]]);
        return lllIIIlIIIl[3];
    }

    private static String lIlIllIlIlllIl(String llllllllllllllllIIlIIlllIlIlllII, String llllllllllllllllIIlIIlllIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIl[6]), "DES");
            Cipher llllllllllllllllIIlIIlllIlIllllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIlIllllI.init(lllIIIlIIIl[4], llllllllllllllllIIlIIlllIlIlllll);
            return new String(llllllllllllllllIIlIIlllIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIlIlllIl) {
            llllllllllllllllIIlIIlllIlIlllIl.printStackTrace();
            return null;
        }
    }

    static {
        x.lIlIllIllIIIll();
        x.lIlIllIllIIIlI();
    }

    private static void lIlIllIllIIIll() {
        lllIIIlIIIl = new int[7];
        x.lllIIIlIIIl[0] = (0xD9 ^ 0x87 ^ (0x1A ^ 0x43)) & (0x13 ^ 0x2B ^ (0x14 ^ 0x2B) ^ -" ".length());
        x.lllIIIlIIIl[1] = 0x94 ^ 0x91;
        x.lllIIIlIIIl[2] = 0x14 ^ 0x12;
        x.lllIIIlIIIl[3] = " ".length();
        x.lllIIIlIIIl[4] = "  ".length();
        x.lllIIIlIIIl[5] = "   ".length();
        x.lllIIIlIIIl[6] = 0x9A ^ 0x95 ^ (0x43 ^ 0x44);
    }
}

