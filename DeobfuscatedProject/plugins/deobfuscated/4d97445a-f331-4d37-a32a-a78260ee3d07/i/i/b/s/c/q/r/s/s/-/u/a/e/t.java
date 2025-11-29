/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=5)
public class t
extends Task {
    private static /* synthetic */ String[] llllIlIl;
    private final /* synthetic */ SquireCerberusConfig aE;
    private final /* synthetic */ a aD;
    private static /* synthetic */ int[] llllIllI;

    private static String llIlIlIlIl(String llIlIIIlIlIlIII, String llIlIIIlIlIIIlI) {
        llIlIIIlIlIlIII = new String(Base64.getDecoder().decode(llIlIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIlIlIIllI = new StringBuilder();
        char[] llIlIIIlIlIIlIl = llIlIIIlIlIIIlI.toCharArray();
        int llIlIIIlIlIIlII = llllIllI[1];
        char[] llIlIIIlIIllllI = llIlIIIlIlIlIII.toCharArray();
        int llIlIIIlIIlllIl = llIlIIIlIIllllI.length;
        int llIlIIIlIIlllII = llllIllI[1];
        while (t.llIlIllllI(llIlIIIlIIlllII, llIlIIIlIIlllIl)) {
            char llIlIIIlIlIlIIl = llIlIIIlIIllllI[llIlIIIlIIlllII];
            llIlIIIlIlIIllI.append((char)(llIlIIIlIlIlIIl ^ llIlIIIlIlIIlIl[llIlIIIlIlIIlII % llIlIIIlIlIIlIl.length]));
            0;
            ++llIlIIIlIlIIlII;
            ++llIlIIIlIIlllII;
            0;
            if (3 >= ((0x1C ^ 0x13 ^ (0xF3 ^ 0xB9)) & (96 + 69 - 11 + 71 ^ 96 + 27 - 46 + 87 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llIlIIIlIlIIllI);
    }

    private static boolean llIlIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIlIlII(String llIlIIIllIIIIll, String llIlIIIllIIIlII) {
        try {
            SecretKeySpec llIlIIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIllIIIlll = Cipher.getInstance("Blowfish");
            llIlIIIllIIIlll.init(llllIllI[3], llIlIIIllIIlIII);
            return new String(llIlIIIllIIIlll.doFinal(Base64.getDecoder().decode(llIlIIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIllIIIllI) {
            llIlIIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIII(Object object) {
        return object != null;
    }

    private static void llIlIlIllI() {
        llllIlIl = new String[llllIllI[7]];
        t.llllIlIl[t.llllIllI[1]] = t."Eating between kills as we're missing more than 25 hp.";
        t.llllIlIl[t.llllIllI[2]] = t."Eat";
        t.llllIlIl[t.llllIllI[3]] = t."Eat";
        t.llllIlIl[t.llllIllI[4]] = t."wild";
        t.llllIlIl[t.llllIllI[5]] = t."summer";
        t.llllIlIl[t.llllIllI[6]] = t."Eat";
    }

    private static void llIlIlIlll() {
        llllIllI = new int[9];
        t.llllIllI[0] = 5 ^ 0x1C;
        t.llllIllI[1] = (0x84 ^ 0xC3) & ~(0x22 ^ 0x65);
        t.llllIllI[2] = 1;
        t.llllIllI[3] = 2;
        t.llllIllI[4] = 3;
        t.llllIllI[5] = 0x1E ^ 0x2B ^ (0x34 ^ 5);
        t.llllIllI[6] = 95 + 52 - 49 + 51 ^ 45 + 133 - 120 + 86;
        t.llllIllI[7] = 67 + 7 - 6 + 98 ^ 127 + 56 - 157 + 134;
        t.llllIllI[8] = 0x5F ^ 0x57;
    }

    private static String llIlIlIIll(String llIlIIIlIllIllI, String llIlIIIlIllIlll) {
        try {
            SecretKeySpec llIlIIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), llllIllI[8]), "DES");
            Cipher llIlIIIlIlllIlI = Cipher.getInstance("DES");
            llIlIIIlIlllIlI.init(llllIllI[3], llIlIIIlIlllIll);
            return new String(llIlIIIlIlllIlI.doFinal(Base64.getDecoder().decode(llIlIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIlIlllIIl) {
            llIlIIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private t(a a2, SquireCerberusConfig squireCerberusConfig) {
        this.aD = a2;
        this.aE = squireCerberusConfig;
    }

    private static boolean llIlIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllIIl(Object object) {
        return object == null;
    }

    private static boolean llIlIlllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        t llIlIIIllIlIIII;
        void llIlIIIllIIllll;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (t.llIlIlllII(item.getName().toLowerCase().contains(llllIlIl[llllIllI[4]]) ? 1 : 0) && t.llIlIlllII(item.getName().toLowerCase().contains(llllIlIl[llllIllI[5]]) ? 1 : 0) && t.llIlIlllIl(item.hasAction(llllIlIl[llllIllI[6]]::equals) ? 1 : 0)) {
                n2 = llllIllI[2];
                0;
                if ((9 + 154 - 44 + 47 ^ 79 + 29 - -38 + 16) <= 0) {
                    return ((41 + 127 - 154 + 180 ^ 68 + 83 - 141 + 128) & (0xCE ^ 0x94 ^ (0x43 ^ 0x51) ^ -1)) != 0;
                }
            } else {
                n2 = llllIllI[1];
            }
            return n2 != 0;
        });
        if (!t.llIlIllIII(this.aD.k()) || t.llIlIllIIl(this.aD.k().y())) {
            if (t.llIlIllIlI(Combat.getMissingHealth(), llllIllI[0]) && t.llIlIllIII(llIlIIIllIIllll)) {
                Log.info((String)llllIlIl[llllIllI[1]]);
                llIlIIIllIIllll.interact(llllIlIl[llllIllI[2]]);
                llIlIIIllIlIIII.sleep(llllIllI[3]);
                return llllIllI[2];
            }
            return llllIllI[1];
        }
        if (t.llIlIllIll(Combat.getCurrentHealth(), llIlIIIllIlIIII.aE.eatAtHealth())) {
            return llllIllI[1];
        }
        if (t.llIlIllIIl(llIlIIIllIIllll)) {
            return llllIllI[1];
        }
        item2.interact(llllIlIl[llllIllI[3]]);
        this.sleep(llllIllI[3]);
        return llllIllI[2];
    }

    private static boolean llIlIlllIl(int n2) {
        return n2 != 0;
    }

    static {
        t.llIlIlIlll();
        t.llIlIlIllI();
    }
}

