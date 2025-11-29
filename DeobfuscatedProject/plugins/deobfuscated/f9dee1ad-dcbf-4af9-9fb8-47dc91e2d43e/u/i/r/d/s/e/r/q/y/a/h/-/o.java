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
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Curing poison", priority=20)
public class o
extends Task {
    private final /* synthetic */ a aq;
    private static /* synthetic */ int[] llllIlIlIIll;
    private static /* synthetic */ String[] llllIlIlIIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (o.lIIlIIIIlllIIll(this.aq.g() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        if (o.lIIlIIIIlllIIll(Combat.isPoisoned() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        Item lllllllllllllllIIlIlIIIllllIIIII = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIlIIll[2]];
            stringArray[o.llllIlIlIIll[0]] = llllIlIlIIlI[llllIlIlIIll[2]];
            if (o.lIIlIIIIlllIlIl(item.hasAction(stringArray) ? 1 : 0) && o.lIIlIIIIlllIlIl(item.getName().toLowerCase().contains(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0)) {
                n2 = llllIlIlIIll[2];
                0;
                if ((152 + 117 - 198 + 124 ^ 79 + 197 - 129 + 51) <= 0) {
                    return ((37 + 175 - 205 + 241 ^ 95 + 102 - 37 + 1) & (18 + 3 - -203 + 18 ^ 169 + 113 - 230 + 119 ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        });
        if (o.lIIlIIIIlllIlII(lllllllllllllllIIlIlIIIllllIIIII)) {
            return llllIlIlIIll[0];
        }
        var1_1.interact(llllIlIlIIlI[llllIlIlIIll[0]]);
        this.sleep(llllIlIlIIll[1]);
        return llllIlIlIIll[2];
    }

    private static String lIIlIIIIlllIIII(String lllllllllllllllIIlIlIIIlllIIIllI, String lllllllllllllllIIlIlIIIlllIIIIII) {
        lllllllllllllllIIlIlIIIlllIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIIlllIIIlII = new StringBuilder();
        char[] lllllllllllllllIIlIlIIIlllIIIIll = lllllllllllllllIIlIlIIIlllIIIIII.toCharArray();
        int lllllllllllllllIIlIlIIIlllIIIIlI = llllIlIlIIll[0];
        char[] lllllllllllllllIIlIlIIIllIllllII = lllllllllllllllIIlIlIIIlllIIIllI.toCharArray();
        int lllllllllllllllIIlIlIIIllIlllIll = lllllllllllllllIIlIlIIIllIllllII.length;
        int lllllllllllllllIIlIlIIIllIlllIlI = llllIlIlIIll[0];
        while (o.lIIlIIIIlllIllI(lllllllllllllllIIlIlIIIllIlllIlI, lllllllllllllllIIlIlIIIllIlllIll)) {
            char lllllllllllllllIIlIlIIIlllIIIlll = lllllllllllllllIIlIlIIIllIllllII[lllllllllllllllIIlIlIIIllIlllIlI];
            lllllllllllllllIIlIlIIIlllIIIlII.append((char)(lllllllllllllllIIlIlIIIlllIIIlll ^ lllllllllllllllIIlIlIIIlllIIIIll[lllllllllllllllIIlIlIIIlllIIIIlI % lllllllllllllllIIlIlIIIlllIIIIll.length]));
            0;
            ++lllllllllllllllIIlIlIIIlllIIIIlI;
            ++lllllllllllllllIIlIlIIIllIlllIlI;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIIlllIIIlII);
    }

    private static String lIIlIIIIllIllll(String lllllllllllllllIIlIlIIIlllIlIllI, String lllllllllllllllIIlIlIIIlllIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIlllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[5]), "DES");
            Cipher lllllllllllllllIIlIlIIIlllIllIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIIlllIllIII.init(llllIlIlIIll[3], lllllllllllllllIIlIlIIIlllIllIIl);
            return new String(lllllllllllllllIIlIlIIIlllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIlllIlIlll) {
            lllllllllllllllIIlIlIIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIIl() {
        llllIlIlIIlI = new String[llllIlIlIIll[4]];
        o.llllIlIlIIlI[o.llllIlIlIIll[0]] = o."Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[2]] = o."Drink";
        o.llllIlIlIIlI[o.llllIlIlIIll[3]] = o."anti";
    }

    private static boolean lIIlIIIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.lIIlIIIIlllIIlI();
        o.lIIlIIIIlllIIIl();
    }

    private static boolean lIIlIIIIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIll = new int[6];
        o.llllIlIlIIll[0] = (0xDF ^ 0x86) & ~(0x9D ^ 0xC4);
        o.llllIlIlIIll[1] = 0x55 ^ 0x51;
        o.llllIlIlIIll[2] = 1;
        o.llllIlIlIIll[3] = 2;
        o.llllIlIlIIll[4] = 3;
        o.llllIlIlIIll[5] = 0x56 ^ 0x5E;
    }

    @Inject
    public o(a a2) {
        this.aq = a2;
    }

    private static boolean lIIlIIIIlllIlII(Object object) {
        return object == null;
    }
}

