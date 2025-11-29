/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class A
extends Task {
    private final /* synthetic */ SquireDukeSucellus aZ;
    private static /* synthetic */ String[] lIlllIIIIIII;
    private final /* synthetic */ SquireDukeSucellusConfig ba;
    private static /* synthetic */ int[] lIlllIIIIIlI;

    private static boolean lllIlIlIlIIllI(Object object) {
        return object == null;
    }

    public boolean run() {
        if (A.lllIlIlIlIIlIl(Prayers.getPoints())) {
            return lIlllIIIIIlI[0];
        }
        NPC lllllllllllllllIlIlllIIlIIIlIIll = NPCs.getNearest(nPC -> {
            int n2;
            if (A.lllIlIlIlIlIII(nPC.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIIlI[4]];
                stringArray[A.lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[3]];
                if (A.lllIlIlIlIlIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIIlI[4];
                    0;
                    if (3 > -1) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = lIlllIIIIIlI[0];
            return n2 != 0;
        });
        if (A.lllIlIlIlIIllI(lllllllllllllllIlIlllIIlIIIlIIll)) {
            Prayers.disableAll();
            return lIlllIIIIIlI[0];
        }
        TileObject lllllllllllllllIlIlllIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (A.lllIlIlIlIlIII(tileObject.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIIlI[4]];
                stringArray[A.lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[4]];
                if (A.lllIlIlIlIlIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIIlI[4];
                    0;
                    if (-1 <= 3) return n2 != 0;
                    return ((0xE4 ^ 0xB7) & ~(0xE8 ^ 0xBB)) != 0;
                }
            }
            n2 = lIlllIIIIIlI[0];
            return n2 != 0;
        });
        if (A.lllIlIlIlIIllI(lllllllllllllllIlIlllIIlIIIlIIlI)) {
            return lIlllIIIIIlI[0];
        }
        Prayers.flick(this.V());
        0;
        return lIlllIIIIIlI[0];
    }

    private static void lllIlIlIlIIlII() {
        lIlllIIIIIlI = new int[7];
        A.lIlllIIIIIlI[0] = (0x19 ^ 0x25) & ~(0xF ^ 0x33);
        A.lIlllIIIIIlI[1] = 0xFFFFCFD7 & 0x3F6D;
        A.lIlllIIIIIlI[2] = 55 + 158 - 139 + 106 ^ 130 + 164 - 254 + 148;
        A.lIlllIIIIIlI[3] = 3;
        A.lIlllIIIIIlI[4] = 1;
        A.lIlllIIIIIlI[5] = 2;
        A.lIlllIIIIIlI[6] = 2 ^ (0xB4 ^ 0xB2);
    }

    private static boolean lllIlIlIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public A(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aZ = squireDukeSucellus;
        this.ba = squireDukeSucellusConfig;
    }

    private static String lllIlIlIIlllII(String lllllllllllllllIlIlllIIIlllllIlI, String lllllllllllllllIlIlllIIIlllllIIl) {
        lllllllllllllllIlIlllIIIlllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIllllllIl = new StringBuilder();
        char[] lllllllllllllllIlIlllIIIllllllII = lllllllllllllllIlIlllIIIlllllIIl.toCharArray();
        int lllllllllllllllIlIlllIIIlllllIll = lIlllIIIIIlI[0];
        char[] lllllllllllllllIlIlllIIIllllIlIl = lllllllllllllllIlIlllIIIlllllIlI.toCharArray();
        int lllllllllllllllIlIlllIIIllllIlII = lllllllllllllllIlIlllIIIllllIlIl.length;
        int lllllllllllllllIlIlllIIIllllIIll = lIlllIIIIIlI[0];
        while (A.lllIlIlIlIlIIl(lllllllllllllllIlIlllIIIllllIIll, lllllllllllllllIlIlllIIIllllIlII)) {
            char lllllllllllllllIlIlllIIlIIIIIIII = lllllllllllllllIlIlllIIIllllIlIl[lllllllllllllllIlIlllIIIllllIIll];
            lllllllllllllllIlIlllIIIllllllIl.append((char)(lllllllllllllllIlIlllIIlIIIIIIII ^ lllllllllllllllIlIlllIIIllllllII[lllllllllllllllIlIlllIIIlllllIll % lllllllllllllllIlIlllIIIllllllII.length]));
            0;
            ++lllllllllllllllIlIlllIIIlllllIll;
            ++lllllllllllllllIlIlllIIIllllIIll;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIIIllllllIl);
    }

    private static boolean lllIlIlIlIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> V() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (A.lllIlIlIlIIlll(Static.getClient().getVarbitValue(lIlllIIIIIlI[1]), lIlllIIIIIlI[2])) {
            Prayer[] prayerArray = new Prayer[lIlllIIIIIlI[3]];
            prayerArray[A.lIlllIIIIIlI[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[A.lIlllIIIIIlI[4]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[A.lIlllIIIIIlI[5]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if ((0x59 ^ 0x5C) <= 0) {
                return null;
            }
        } else {
            void lllllllllllllllIlIlllIIlIIIIllll;
            lllllllllllllllIlIlllIIlIIIIllll.add(Prayer.PIETY);
            0;
        }
        arrayList.add(Prayer.PROTECT_FROM_MELEE);
        0;
        return arrayList;
    }

    private static boolean lllIlIlIlIIlIl(int n2) {
        return n2 <= 0;
    }

    private static void lllIlIlIIlllll() {
        lIlllIIIIIII = new String[lIlllIIIIIlI[6]];
        A.lIlllIIIIIII[A.lIlllIIIIIlI[0]] = A."Gate";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[4]] = A."Quick-escape";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[5]] = A."Duke Sucellus";
        A.lIlllIIIIIII[A.lIlllIIIIIlI[3]] = A."Attack";
    }

    static {
        A.lllIlIlIlIIlII();
        A.lllIlIlIIlllll();
    }

    private static String lllIlIlIIlllIl(String lllllllllllllllIlIlllIIIllIllIll, String lllllllllllllllIlIlllIIIllIlllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIlllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIIllIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIIllIlllll.init(lIlllIIIIIlI[5], lllllllllllllllIlIlllIIIlllIIIII);
            return new String(lllllllllllllllIlIlllIIIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIIllIllllI) {
            lllllllllllllllIlIlllIIIllIllllI.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlIIllllI(String lllllllllllllllIlIlllIIIlllIlIlI, String lllllllllllllllIlIlllIIIlllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), lIlllIIIIIlI[2]), "DES");
            Cipher lllllllllllllllIlIlllIIIlllIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIIlllIllII.init(lIlllIIIIIlI[5], lllllllllllllllIlIlllIIIlllIllIl);
            return new String(lllllllllllllllIlIlllIIIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIIlllIlIll) {
            lllllllllllllllIlIlllIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

