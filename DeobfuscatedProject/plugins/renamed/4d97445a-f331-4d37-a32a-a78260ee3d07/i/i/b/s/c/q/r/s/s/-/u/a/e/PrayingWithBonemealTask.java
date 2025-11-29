/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.AMEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.as_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Praying with bonemeal -> PrayingwithbonemealTask */
@TaskDesc(name="Praying with bonemeal", priority=10, blocking=true)
public class PrayingWithBonemealTask
extends as_Unknown {
    private static /* synthetic */ int[] lIIIIIII;
    private /* synthetic */ boolean dm;
    private static /* synthetic */ String[] lllllll;

    private static String llllIlIII(String lllIIlIllIIIlll, String lllIIlIllIIIllI) {
        try {
            SecretKeySpec lllIIlIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIllIIlIll = Cipher.getInstance("Blowfish");
            lllIIlIllIIlIll.init(lIIIIIII[0], lllIIlIllIIllII);
            return new String(lllIIlIllIIlIll.doFinal(Base64.getDecoder().decode(lllIIlIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIllIIlIlI) {
            lllIIlIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIll(int n2) {
        return n2 == 0;
    }

    private static void llllIlIlI() {
        lIIIIIII = new int[12];
        au.lIIIIIII[0] = 2;
        au.lIIIIIII[1] = (0x75 ^ 0x63) & ~(0xB9 ^ 0xAF);
        au.lIIIIIII[2] = 1;
        au.lIIIIIII[3] = -(0xFFFFBFEA & 0x6657) & (0xFFFFFFFF & 0x36FF);
        au.lIIIIIII[4] = 0xFFFFBEFF & 0x51B6;
        au.lIIIIIII[5] = 3;
        au.lIIIIIII[6] = 0x6E ^ 0x1D ^ (0x36 ^ 0x41);
        au.lIIIIIII[7] = 0x71 ^ 0x2F ^ (0x3D ^ 0x66);
        au.lIIIIIII[8] = 58 + 60 - 5 + 27 ^ 63 + 63 - 40 + 52;
        au.lIIIIIII[9] = 0x93 ^ 0x94;
        au.lIIIIIII[10] = -(0xFFFFFB7F & 0x7CFB) & (0xFFFFFFFF & Short.MAX_VALUE);
        au.lIIIIIII[11] = 0x1D ^ 0x12 ^ (5 ^ 2);
    }

    private static void llllIlIIl() {
        lllllll = new String[lIIIIIII[11]];
        au.lllllll[au.lIIIIIII[1]] = au."Collecting ecto from the guy";
        au.lllllll[au.lIIIIIII[2]] = au."Drop";
        au.lllllll[au.lIIIIIII[0]] = au."Ghost disciple";
        au.lllllll[au.lIIIIIII[5]] = au."Talk-to";
        au.lllllll[au.lIIIIIII[6]] = au."Something is going wrong when collecting ecto.";
        au.lllllll[au.lIIIIIII[7]] = au."Ectofuntus";
        au.lllllll[au.lIIIIIII[8]] = au."how";
        au.lllllll[au.lIIIIIII[9]] = au."Worship";
    }

    static {
        au.llllIlIlI();
        au.llllIlIIl();
    }

    private static boolean llllIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var1_2;
        au lllIIlIlllIllII;
        int[] nArray = new int[lIIIIIII[0]];
        nArray[au.lIIIIIII[1]] = this.de.bonesToUse().groundItemId;
        nArray[au.lIIIIIII[2]] = lIIIIIII[3];
        if (au.llllIlIll(Inventory.containsAllOf((int[])nArray) ? 1 : 0)) {
            return lIIIIIII[1];
        }
        if (au.llllIllII(Dialog.isOpen() ? 1 : 0)) {
            lllIIlIlllIllII.dm = lIIIIIII[2];
            if (au.llllIllII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIIIIII[2];
            }
            Log.info((String)lllllll[lIIIIIII[1]]);
        }
        int[] nArray2 = new int[lIIIIIII[2]];
        nArray2[au.lIIIIIII[1]] = lIIIIIII[4];
        if (au.llllIllII(Inventory.contains((int[])nArray2) ? 1 : 0) && au.llllIllII(lllIIlIlllIllII.dm ? 1 : 0)) {
            lllIIlIlllIllII.dm = lIIIIIII[1];
        }
        if (au.llllIllII(lllIIlIlllIllII.dm ? 1 : 0)) {
            Item lllIIlIlllIlIll;
            if (au.llllIllII(Inventory.isFull() ? 1 : 0) && au.llllIllIl(lllIIlIlllIlIll = Inventory.getFirst(item -> {
                boolean bl2;
                if (!au.llllIllll(item.getId(), lIIIIIII[10]) || au.lllllIIII(item.getId(), lIIIIIII[3])) {
                    bl2 = lIIIIIII[2];
                    0;
                    if (3 <= -1) {
                        return ((149 + 142 - 264 + 198 ^ 26 + 185 - 17 + 1) & (0xE1 ^ 0xAE ^ (0x38 ^ 0x55) ^ -1)) != 0;
                    }
                } else {
                    bl2 = lIIIIIII[1];
                }
                return bl2;
            }))) {
                lllIIlIlllIlIll.interact(lllllll[lIIIIIII[2]]);
                return lIIIIIII[2];
            }
            String[] stringArray = new String[lIIIIIII[2]];
            stringArray[au.lIIIIIII[1]] = lllllll[lIIIIIII[0]];
            lllIIlIlllIlIll = NPCs.getNearest((String[])stringArray);
            if (au.llllIllIl(lllIIlIlllIlIll)) {
                lllIIlIlllIlIll.interact(lllllll[lIIIIIII[5]]);
                return lIIIIIII[2];
            }
            Log.info((String)lllllll[lIIIIIII[6]]);
            return lIIIIIII[1];
        }
        if (au.llllIlIll(am.ECTOFUNTUS.bo() ? 1 : 0)) {
            return lllIIlIlllIllII.dd.bk();
        }
        String[] stringArray = new String[lIIIIIII[2]];
        stringArray[au.lIIIIIII[1]] = lllllll[lIIIIIII[7]];
        TileObject lllIIlIlllIlIll = TileObjects.getNearest((String[])stringArray);
        if (au.llllIlllI(lllIIlIlllIlIll)) {
            Log.info((String)lllllll[lIIIIIII[8]]);
            return lIIIIIII[1];
        }
        var1_2.interact(lllllll[lIIIIIII[9]]);
        return lIIIIIII[2];
    }

    private static boolean llllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public au(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static boolean llllIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIIllI(String lllIIlIllIllIIl, String lllIIlIllIlllIl) {
        lllIIlIllIllIIl = new String(Base64.getDecoder().decode(lllIIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIllIlllII = new StringBuilder();
        char[] lllIIlIllIllIll = lllIIlIllIlllIl.toCharArray();
        int lllIIlIllIllIlI = lIIIIIII[1];
        char[] lllIIlIllIlIlII = lllIIlIllIllIIl.toCharArray();
        int lllIIlIllIlIIll = lllIIlIllIlIlII.length;
        int lllIIlIllIlIIlI = lIIIIIII[1];
        while (au.lllllIIIl(lllIIlIllIlIIlI, lllIIlIllIlIIll)) {
            char lllIIlIllIlllll = lllIIlIllIlIlII[lllIIlIllIlIIlI];
            lllIIlIllIlllII.append((char)(lllIIlIllIlllll ^ lllIIlIllIllIll[lllIIlIllIllIlI % lllIIlIllIllIll.length]));
            0;
            ++lllIIlIllIllIlI;
            ++lllIIlIllIlIIlI;
            0;
            if (((0x25 ^ 0x74) & ~(0x41 ^ 0x10)) >= 0) continue;
            return null;
        }
        return String.valueOf(lllIIlIllIlllII);
    }

    private static boolean lllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllIIlll(String lllIIlIlIlllIlI, String lllIIlIlIlllIll) {
        try {
            SecretKeySpec lllIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIIIIIII[11]), "DES");
            Cipher lllIIlIlIlllllI = Cipher.getInstance("DES");
            lllIIlIlIlllllI.init(lIIIIIII[0], lllIIlIlIllllll);
            return new String(lllIIlIlIlllllI.doFinal(Base64.getDecoder().decode(lllIIlIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIlIllllIl) {
            lllIIlIlIllllIl.printStackTrace();
            return null;
        }
    }
}

