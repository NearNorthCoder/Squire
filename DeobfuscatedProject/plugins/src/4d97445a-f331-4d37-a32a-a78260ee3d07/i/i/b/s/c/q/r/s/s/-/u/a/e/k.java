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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating Wild Pie", priority=10)
public class k
extends Task {
    private final /* synthetic */ a am;
    private static /* synthetic */ int[] llIlIlIIl;
    private static /* synthetic */ String[] llIlIlIII;

    private static String lIlllIlIlII(String lIlIlllllIllllI, String lIlIllllllIIIlI) {
        lIlIlllllIllllI = new String(Base64.getDecoder().decode(lIlIlllllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllllIIIIl = new StringBuilder();
        char[] lIlIllllllIIIII = lIlIllllllIIIlI.toCharArray();
        int lIlIlllllIlllll = llIlIlIIl[0];
        char[] lIlIlllllIllIIl = lIlIlllllIllllI.toCharArray();
        int lIlIlllllIllIII = lIlIlllllIllIIl.length;
        int lIlIlllllIlIlll = llIlIlIIl[0];
        while (k.lIlllIllIll(lIlIlllllIlIlll, lIlIlllllIllIII)) {
            char lIlIllllllIIlII = lIlIlllllIllIIl[lIlIlllllIlIlll];
            lIlIllllllIIIIl.append((char)(lIlIllllllIIlII ^ lIlIllllllIIIII[lIlIlllllIlllll % lIlIllllllIIIII.length]));
            "".length();
            ++lIlIlllllIlllll;
            ++lIlIlllllIlIlll;
            "".length();
            if ((0x4E ^ 0x5C ^ (0xB6 ^ 0xA0)) >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lIlIllllllIIIIl);
    }

    private static void lIlllIlIlll() {
        llIlIlIIl = new int[4];
        k.llIlIlIIl[0] = (239 + 193 - 407 + 230 ^ 109 + 95 - 90 + 83) & (53 + 204 - 242 + 240 ^ 167 + 177 - 173 + 26 ^ -" ".length());
        k.llIlIlIIl[1] = 0x54 ^ 0xF;
        k.llIlIlIIl[2] = " ".length();
        k.llIlIlIIl[3] = "  ".length();
    }

    private static boolean lIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIllIIl(Object object) {
        return object == null;
    }

    private static String lIlllIlIlIl(String lIlIlllllIIlllI, String lIlIlllllIIllIl) {
        try {
            SecretKeySpec lIlIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllllIlIIII = Cipher.getInstance("Blowfish");
            lIlIlllllIlIIII.init(llIlIlIIl[3], lIlIlllllIlIIIl);
            return new String(lIlIlllllIlIIII.doFinal(Base64.getDecoder().decode(lIlIlllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllllIIllll) {
            lIlIlllllIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!k.lIlllIllIII(this.am.k()) || k.lIlllIllIIl(this.am.k().y())) {
            return llIlIlIIl[0];
        }
        if (k.lIlllIllIlI(Skills.getBoostedLevel((Skill)Skill.SLAYER), llIlIlIIl[1])) {
            return llIlIlIIl[0];
        }
        Item lIlIllllllIlllI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIlIII[llIlIlIIl[2]]));
        if (k.lIlllIllIIl(lIlIllllllIlllI)) {
            return llIlIlIIl[0];
        }
        var1_1.interact(llIlIlIII[llIlIlIIl[0]]);
        return llIlIlIIl[2];
    }

    static {
        k.lIlllIlIlll();
        k.lIlllIlIllI();
    }

    private static void lIlllIlIllI() {
        llIlIlIII = new String[llIlIlIIl[3]];
        k.llIlIlIII[k.llIlIlIIl[0]] = k.lIlllIlIlII("NCws", "qMXJa");
        k.llIlIlIII[k.llIlIlIIl[2]] = k.lIlllIlIlIl("QXZj2PcrluFJFbpq3ANekw==", "OHMVz");
    }

    @Inject
    public k(a a2) {
        this.am = a2;
    }

    private static boolean lIlllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIllIII(Object object) {
        return object != null;
    }
}

