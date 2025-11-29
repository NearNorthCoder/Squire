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

/* TASK: Prayer Flicking -> PrayerflickingTask */
@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
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
        NPC var17 = NPCs.getNearest(nPC -> {
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
        if (A.lllIlIlIlIIllI(var17)) {
            Prayers.disableAll();
            return lIlllIIIIIlI[0];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (A.lllIlIlIlIlIII(tileObject.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIIlI[4]];
                stringArray[A.lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[4]];
                if (A.lllIlIlIlIlIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIIlI[4];
                    0;
                    if (-1 <= 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlllIIIIIlI[0];
            return n2 != 0;
        });
        if (A.lllIlIlIlIIllI(var6)) {
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

    private static String lllIlIlIIlllII(String var1, String var12) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var13 = var12.toCharArray();
        int var7 = lIlllIIIIIlI[0];
        char[] var8 = var1.toCharArray();
        int var3 = var8.length;
        int var9 = lIlllIIIIIlI[0];
        while (A.lllIlIlIlIlIIl(var9, var3)) {
            char var4 = var8[var9];
            var19.append((char)(var4 ^ var13[var7 % var13.length]));
            0;
            ++var7;
            ++var9;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var19);
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
            void var10;
            var10.add(Prayer.PIETY);
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

    private static String lllIlIlIIlllIl(String var5, String var11) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlllIIIIIlI[5], var2);
            return new String(var16.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlIIllllI(String var18, String var21) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIlllIIIIIlI[2]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlllIIIIIlI[5], var20);
            return new String(var15.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

