/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Prep Get Vials -> PrepgetvialsTask */
@TaskDesc(name="Prep Get Vials", priority=21001, blocking=true)
public class PrepGetVialsTask
extends bg_Unknown {
    private static /* synthetic */ String[] lIlIIIIlllll;
    private static /* synthetic */ int[] lIlIIIlIIIII;

    private static String llIlIlIlIlIIII(String var23, String var5) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIII[9]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIIIlIIIII[4], var16);
            return new String(var10.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIlIlIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlIllIll(int n2) {
        return n2 == 0;
    }

    static {
        bc.llIlIlIlIlIlII();
        bc.llIlIlIlIlIIll();
    }

    private static String llIlIlIlIlIIIl(String var15, String var19) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var8 = var19.toCharArray();
        int var11 = lIlIIIlIIIII[2];
        char[] var12 = var15.toCharArray();
        int var21 = var12.length;
        int var13 = lIlIIIlIIIII[2];
        while (bc.llIlIlIlIlIllI(var13, var21)) {
            char var7 = var12[var13];
            var6.append((char)(var7 ^ var8[var11 % var8.length]));
            0;
            ++var11;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_4;
        bc var14;
        int n2 = this.ef();
        if (bc.llIlIlIlIlIlIl(n2, this.ed())) {
            void var18;
            int n3 = lIlIIIlIIIII[0];
            int[] nArray = new int[lIlIIIlIIIII[1]];
            nArray[bc.lIlIIIlIIIII[2]] = lIlIIIlIIIII[3];
            List list = Inventory.getAll((int[])nArray);
            int var9 = lIlIIIlIIIII[2];
            while (bc.llIlIlIlIlIllI(var9, var18.size())) {
                void var17;
                if (bc.llIlIlIlIlIlll((int)var17)) {
                    0;
                    if (2 != ((202 + 111 - 135 + 33 ^ 97 + 27 - 65 + 69) & (0x5F ^ 0x12 ^ (0xB9 ^ 0xA7) ^ -1))) break;
                    return ((0x12 ^ 0x64 ^ (0x69 ^ 0x5A)) & (126 + 172 - 240 + 135 ^ 24 + 81 - -18 + 9 ^ -1)) != 0;
                }
                if (bc.llIlIlIlIllIII(var9, var14.ed())) {
                    ((Item)var18.get(var9)).drop();
                    --var17;
                }
                ++var9;
                0;
                if (((0xDC ^ 0x93) & ~(0xCF ^ 0x80)) == 0) continue;
                return false;
            }
            return lIlIIIlIIIII[1];
        }
        if (bc.llIlIlIlIllIII(var14.eh(), var14.ed())) {
            return lIlIIIlIIIII[2];
        }
        if (bc.llIlIlIlIllIIl(var14.ef())) {
            TileObject var17 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIlIIIII[1]];
                    stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[9]];
                    if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIlIIIII[1];
                        0;
                        if (2 > 1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIlIIIII[2];
                return n2 != 0;
            });
            if (bc.llIlIlIlIllIlI(var17)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[2]]);
                return lIlIIIlIIIII[2];
            }
            if (!bc.llIlIlIlIllIll(var14.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(var14.bS.isMoving() ? 1 : 0)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[1]]);
                return lIlIIIlIIIII[1];
            }
            var17.interact(lIlIIIIlllll[lIlIIIlIIIII[4]]);
            var14.sleep(lIlIIIlIIIII[4]);
            return lIlIIIlIIIII[1];
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIII[1]];
                stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[7]];
                if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIII[1];
                    0;
                    if (-(0xB2 ^ 0xB6) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIII[2];
            return n2 != 0;
        });
        if (bc.llIlIlIlIllIlI(var17)) {
            return lIlIIIlIIIII[2];
        }
        if (!bc.llIlIlIlIllIll(var14.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(var14.bS.isMoving() ? 1 : 0)) {
            System.out.println(lIlIIIIlllll[lIlIIIlIIIII[5]]);
            return lIlIIIlIIIII[1];
        }
        var2_4.interact(lIlIIIIlllll[lIlIIIlIIIII[6]]);
        return lIlIIIlIIIII[1];
    }

    private static boolean llIlIlIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIlIlIlIIlI(String var4, String var1) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIIIlIIIII[4], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIlIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected bc(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIlIlIIll() {
        lIlIIIIlllll = new String[lIlIIIlIIIII[10]];
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[2]] = bc."NO GYSER";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[1]] = bc."moving to gyser";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[4]] = bc."Use";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[5]] = bc."moving to tree";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[6]] = bc."Pick-lots";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[0]] = bc."Gourd tree";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[7]] = bc."Pick-lots";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[8]] = bc."Geyser";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[9]] = bc."Use";
    }

    private static void llIlIlIlIlIlII() {
        lIlIIIlIIIII = new int[11];
        bc.lIlIIIlIIIII[0] = 0xF3 ^ 0xC5 ^ (0x45 ^ 0x76);
        bc.lIlIIIlIIIII[1] = 1;
        bc.lIlIIIlIIIII[2] = (0x82 ^ 0x8C ^ (0x5F ^ 0x7A)) & (149 + 95 - 174 + 119 ^ 113 + 85 - 114 + 66 ^ -1);
        bc.lIlIIIlIIIII[3] = 0xFFFFDFEA & 0x7155;
        bc.lIlIIIlIIIII[4] = 2;
        bc.lIlIIIlIIIII[5] = 3;
        bc.lIlIIIlIIIII[6] = 0xC1 ^ 0xAB ^ (0x76 ^ 0x18);
        bc.lIlIIIlIIIII[7] = 0x5C ^ 0x5A;
        bc.lIlIIIlIIIII[8] = 0x56 ^ 0x51;
        bc.lIlIIIlIIIII[9] = 21 + 162 - 126 + 123 ^ 70 + 9 - -4 + 105;
        bc.lIlIIIlIIIII[10] = 0xC9 ^ 0xC0;
    }
}

