/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Eating food", priority=20)
public class O
extends Task {
    private final /* synthetic */ SquireSepulchre ak;
    private final /* synthetic */ SquireSepulchreConfig al;
    private static /* synthetic */ String[] lllIIlIIlllI;
    private static /* synthetic */ int[] lllIIlIIllll;

    private static boolean lIIIlIlIIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        O.lIIIlIlIIIIIlII();
        O.lIIIlIlIIIIIIll();
    }

    private static void lIIIlIlIIIIIlII() {
        lllIIlIIllll = new int[8];
        O.lllIIlIIllll[0] = (22 + 22 - 3 + 205 ^ 39 + 85 - 99 + 157) & (71 + 105 - 126 + 84 ^ 194 + 88 - 191 + 107 ^ -1);
        O.lllIIlIIllll[1] = 1;
        O.lllIIlIIllll[2] = 3;
        O.lllIIlIIllll[3] = 2;
        O.lllIIlIIllll[4] = 0x68 ^ 0x6C;
        O.lllIIlIIllll[5] = 0x5C ^ 0x59;
        O.lllIIlIIllll[6] = 0x3D ^ 9 ^ (0x26 ^ 0x14);
        O.lllIIlIIllll[7] = 0x58 ^ 0x3A ^ (0x62 ^ 8);
    }

    private static String lIIIlIlIIIIIIII(String lllllllllllllllIIllIlIlIllllIlIl, String lllllllllllllllIIllIlIlIllllIlII) {
        lllllllllllllllIIllIlIlIllllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIlIllllIIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllllIIlI = lllllllllllllllIIllIlIlIllllIlII.toCharArray();
        int lllllllllllllllIIllIlIlIllllIIIl = lllIIlIIllll[0];
        char[] lllllllllllllllIIllIlIlIlllIlIll = lllllllllllllllIIllIlIlIllllIlIl.toCharArray();
        int lllllllllllllllIIllIlIlIlllIlIlI = lllllllllllllllIIllIlIlIlllIlIll.length;
        int lllllllllllllllIIllIlIlIlllIlIIl = lllIIlIIllll[0];
        while (O.lIIIlIlIIIIlIII(lllllllllllllllIIllIlIlIlllIlIIl, lllllllllllllllIIllIlIlIlllIlIlI)) {
            char lllllllllllllllIIllIlIlIllllIllI = lllllllllllllllIIllIlIlIlllIlIll[lllllllllllllllIIllIlIlIlllIlIIl];
            lllllllllllllllIIllIlIlIllllIIll.append((char)(lllllllllllllllIIllIlIlIllllIllI ^ lllllllllllllllIIllIlIlIllllIIlI[lllllllllllllllIIllIlIlIllllIIIl % lllllllllllllllIIllIlIlIllllIIlI.length]));
            0;
            ++lllllllllllllllIIllIlIlIllllIIIl;
            ++lllllllllllllllIIllIlIlIlllIlIIl;
            0;
            if (3 < (0x70 ^ 9 ^ (0xE3 ^ 0x9E))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIlIllllIIll);
    }

    private static String lIIIlIlIIIIIIlI(String lllllllllllllllIIllIlIlIlllIIIII, String lllllllllllllllIIllIlIlIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIllIlllll.getBytes(StandardCharsets.UTF_8)), lllIIlIIllll[7]), "DES");
            Cipher lllllllllllllllIIllIlIlIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlIlllIIIlI.init(lllIIlIIllll[3], lllllllllllllllIIllIlIlIlllIIIll);
            return new String(lllllllllllllllIIllIlIlIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlIlllIIIIl) {
            lllllllllllllllIIllIlIlIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIIIlIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        O lllllllllllllllIIllIlIllIIIlIIII;
        if (O.lIIIlIlIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lllIIlIIllll[0];
        }
        String[] stringArray = new String[lllIIlIIllll[1]];
        stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[0]];
        if (O.lIIIlIlIIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            Item lllllllllllllllIIllIlIllIIIIllll = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[lllIIlIIllll[1]];
                stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[4]];
                if (O.lIIIlIlIIIIIllI(item.hasAction(stringArray) ? 1 : 0) && O.lIIIlIlIIIIIllI(item.getName().equals(lllIIlIIlllI[lllIIlIIllll[5]]) ? 1 : 0)) {
                    n2 = lllIIlIIllll[1];
                    0;
                    if (1 < 0) {
                        return ((98 + 56 - 85 + 163 ^ 126 + 31 - 0 + 20) & (98 + 214 - 158 + 96 ^ 12 + 159 - 157 + 149 ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIIlIIllll[0];
                }
                return n2 != 0;
            });
            lllllllllllllllIIllIlIllIIIIllll.interact(lllIIlIIlllI[lllIIlIIllll[1]]);
            lllllllllllllllIIllIlIllIIIlIIII.sleep(lllIIlIIllll[2]);
            return lllIIlIIllll[1];
        }
        if (O.lIIIlIlIIIIIlll(Combat.getCurrentHealth(), lllllllllllllllIIllIlIllIIIlIIII.al.hpToEatAt())) {
            return lllIIlIIllll[0];
        }
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lllIIlIIllll[1]];
            stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[2]];
            return item.hasAction(stringArray);
        });
        item2.interact(lllIIlIIlllI[lllIIlIIllll[3]]);
        this.sleep(lllIIlIIllll[2]);
        return lllIIlIIllll[1];
    }

    private static String lIIIlIlIIIIIIIl(String lllllllllllllllIIllIlIllIIIIIlIl, String lllllllllllllllIIllIlIllIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIllIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIllIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIllIIIIIlll.init(lllIIlIIllll[3], lllllllllllllllIIllIlIllIIIIlIII);
            return new String(lllllllllllllllIIllIlIllIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIllIIIIIllI) {
            lllllllllllllllIIllIlIllIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIIIIIIll() {
        lllIIlIIlllI = new String[lllIIlIIllll[6]];
        O.lllIIlIIlllI[O.lllIIlIIllll[0]] = O."Monkfish";
        O.lllIIlIIlllI[O.lllIIlIIllll[1]] = O."Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[3]] = O."Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[2]] = O."Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[4]] = O."Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[5]] = O."Monkfish";
    }

    @Inject
    public O(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ak = squireSepulchre;
        this.al = squireSepulchreConfig;
    }

    private static boolean lIIIlIlIIIIIllI(int n2) {
        return n2 != 0;
    }
}

