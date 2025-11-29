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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking range potion")
public class C
extends Task {
    private final /* synthetic */ l aF;
    private static /* synthetic */ int[] lIllIIlIlIlII;
    private static /* synthetic */ String[] lIllIIlIlIIII;

    @Inject
    public C(l l2) {
        this.aF = l2;
    }

    private static boolean llIIIllIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIIllIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIllIIIIlIIl() {
        lIllIIlIlIlII = new int[6];
        C.lIllIIlIlIlII[0] = (0x36 ^ 0x26) & ~(0x9A ^ 0x8A);
        C.lIllIIlIlIlII[1] = 3 ^ (0x2D ^ 0x2B);
        C.lIllIIlIlIlII[2] = 0x16 ^ 0x10;
        C.lIllIIlIlIlII[3] = 1;
        C.lIllIIlIlIlII[4] = 2;
        C.lIllIIlIlIlII[5] = 3;
    }

    static {
        C.llIIIllIIIIlIIl();
        C.llIIIllIIIIIlIl();
    }

    private static String llIIIlIllllllll(String llllllllllllllIllIIlIlIIIIIlIlII, String llllllllllllllIllIIlIlIIIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIIIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIIIIIllIII.init(lIllIIlIlIlII[4], llllllllllllllIllIIlIlIIIIIllIIl);
            return new String(llllllllllllllIllIIlIlIIIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIIIIIlIlll) {
            llllllllllllllIllIIlIlIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIIIIlIl() {
        lIllIIlIlIIII = new String[lIllIIlIlIlII[5]];
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[0]] = C."Drink";
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[3]] = C."ranging";
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[4]] = C."bastion";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        C llllllllllllllIllIIlIlIIIIlIIIIl;
        if (!C.llIIIllIIIIlIlI(this.aF.B() ? 1 : 0) || C.llIIIllIIIIlIlI(this.aF.A() ? 1 : 0)) {
            return lIllIIlIlIlII[0];
        }
        if (C.llIIIllIIIIlIll(llllllllllllllIllIIlIlIIIIlIIIIl.aF.z(), lIllIIlIlIlII[1])) {
            return lIllIIlIlIlII[0];
        }
        Item llllllllllllllIllIIlIlIIIIlIIIII = Inventory.getFirst(item -> {
            int n2;
            if (!C.llIIIllIIIIlllI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[3]]) ? 1 : 0) || C.llIIIllIIIIlIlI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[4]]) ? 1 : 0)) {
                n2 = lIllIIlIlIlII[3];
                0;
                if (null != null) {
                    return ((0xDE ^ 0x90) & ~(0xDA ^ 0x94)) != 0;
                }
            } else {
                n2 = lIllIIlIlIlII[0];
            }
            return n2 != 0;
        });
        if (C.llIIIllIIIIllIl(llllllllllllllIllIIlIlIIIIlIIIII)) {
            return lIllIIlIlIlII[0];
        }
        if (C.llIIIllIIIIlIll(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIllIIlIlIlII[2])) {
            return lIllIIlIlIlII[0];
        }
        var1_1.interact(lIllIIlIlIIII[lIllIIlIlIlII[0]]);
        return lIllIIlIlIlII[3];
    }

    private static String llIIIllIIIIIlII(String llllllllllllllIllIIlIlIIIIIIIIIl, String llllllllllllllIllIIlIlIIIIIIIlIl) {
        llllllllllllllIllIIlIlIIIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlIIIIIIIlII = new StringBuilder();
        char[] llllllllllllllIllIIlIlIIIIIIIIll = llllllllllllllIllIIlIlIIIIIIIlIl.toCharArray();
        int llllllllllllllIllIIlIlIIIIIIIIlI = lIllIIlIlIlII[0];
        char[] llllllllllllllIllIIlIIllllllllII = llllllllllllllIllIIlIlIIIIIIIIIl.toCharArray();
        int llllllllllllllIllIIlIIlllllllIll = llllllllllllllIllIIlIIllllllllII.length;
        int llllllllllllllIllIIlIIlllllllIlI = lIllIIlIlIlII[0];
        while (C.llIIIllIIIIllll(llllllllllllllIllIIlIIlllllllIlI, llllllllllllllIllIIlIIlllllllIll)) {
            char llllllllllllllIllIIlIlIIIIIIIlll = llllllllllllllIllIIlIIllllllllII[llllllllllllllIllIIlIIlllllllIlI];
            llllllllllllllIllIIlIlIIIIIIIlII.append((char)(llllllllllllllIllIIlIlIIIIIIIlll ^ llllllllllllllIllIIlIlIIIIIIIIll[llllllllllllllIllIIlIlIIIIIIIIlI % llllllllllllllIllIIlIlIIIIIIIIll.length]));
            0;
            ++llllllllllllllIllIIlIlIIIIIIIIlI;
            ++llllllllllllllIllIIlIIlllllllIlI;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIlIIIIIIIlII);
    }

    private static boolean llIIIllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIIIlIll(int n2, int n3) {
        return n2 > n3;
    }
}

