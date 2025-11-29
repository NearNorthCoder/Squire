/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Post Kill Handler", blocking=true, priority=4999)
public class z
extends Task {
    private final /* synthetic */ SquireDukeSucellusConfig aY;
    private static /* synthetic */ int[] lIllIlllIlll;
    private /* synthetic */ a u;
    private final /* synthetic */ SquireDukeSucellus aX;
    private static /* synthetic */ String[] lIllIlllIllI;

    @Inject
    public z(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aY = squireDukeSucellusConfig;
        this.aX = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static void lllIlIIllllIIl() {
        lIllIlllIlll = new int[9];
        z.lIllIlllIlll[0] = (0xA9 ^ 0xA6) & ~(0xC ^ 3);
        z.lIllIlllIlll[1] = " ".length();
        z.lIllIlllIlll[2] = "  ".length();
        z.lIllIlllIlll[3] = "   ".length();
        z.lIllIlllIlll[4] = 0xEA ^ 0xA7 ^ (0xDC ^ 0x95);
        z.lIllIlllIlll[5] = 51 + 8 - -52 + 21 ^ 0 + 73 - -30 + 26;
        z.lIllIlllIlll[6] = 0x14 ^ 0x4A ^ (0x2E ^ 0x76);
        z.lIllIlllIlll[7] = 0x6C ^ 0xC ^ (0x4C ^ 0x2B);
        z.lIllIlllIlll[8] = 0x7F ^ 0x77;
    }

    static {
        z.lllIlIIllllIIl();
        z.lllIlIIllllIII();
    }

    private static String lllIlIIlllIlll(String lllllllllllllllIlIlllIIlllIIIIII, String lllllllllllllllIlIlllIIlllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIlllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIlllIIIlII.init(lIllIlllIlll[2], lllllllllllllllIlIlllIIlllIIIlIl);
            return new String(lllllllllllllllIlIlllIIlllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIlllIIIIll) {
            lllllllllllllllIlIlllIIlllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIllllIlI(int n2) {
        return n2 == 0;
    }

    private static String lllIlIIlllIllI(String lllllllllllllllIlIlllIIlllIlllll, String lllllllllllllllIlIlllIIlllIllllI) {
        lllllllllllllllIlIlllIIlllIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIllllIIIlI = new StringBuilder();
        char[] lllllllllllllllIlIlllIIllllIIIIl = lllllllllllllllIlIlllIIlllIllllI.toCharArray();
        int lllllllllllllllIlIlllIIllllIIIII = lIllIlllIlll[0];
        char[] lllllllllllllllIlIlllIIlllIllIlI = lllllllllllllllIlIlllIIlllIlllll.toCharArray();
        int lllllllllllllllIlIlllIIlllIllIIl = lllllllllllllllIlIlllIIlllIllIlI.length;
        int lllllllllllllllIlIlllIIlllIllIII = lIllIlllIlll[0];
        while (z.lllIlIIlllllII(lllllllllllllllIlIlllIIlllIllIII, lllllllllllllllIlIlllIIlllIllIIl)) {
            char lllllllllllllllIlIlllIIllllIIlIl = lllllllllllllllIlIlllIIlllIllIlI[lllllllllllllllIlIlllIIlllIllIII];
            lllllllllllllllIlIlllIIllllIIIlI.append((char)(lllllllllllllllIlIlllIIllllIIlIl ^ lllllllllllllllIlIlllIIllllIIIIl[lllllllllllllllIlIlllIIllllIIIII % lllllllllllllllIlIlllIIllllIIIIl.length]));
            "".length();
            ++lllllllllllllllIlIlllIIllllIIIII;
            ++lllllllllllllllIlIlllIIlllIllIII;
            "".length();
            if ("   ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIIllllIIIlI);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z lllllllllllllllIlIlllIlIIlIIlIII;
        if (z.lllIlIIllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIllllIlI(lllllllllllllllIlIlllIlIIlIIlIII.aX.l() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        TileObject lllllllllllllllIlIlllIlIIlIIIlll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (z.lllIlIIlllllIl(tileObject.getName().equals(lIllIlllIllI[lIllIlllIlll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIlll[1]];
                stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[7]];
                if (z.lllIlIIlllllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIlll[1];
                    "".length();
                    if ("  ".length() > ((69 + 25 - 79 + 134 ^ 58 + 78 - 66 + 61) & (131 + 102 - 145 + 100 ^ 3 + 42 - -5 + 120 ^ -" ".length()))) return n2 != 0;
                    return ((0xCF ^ 0xAB ^ (0x64 ^ 0x15)) & (0x21 ^ 0x6A ^ (0x9B ^ 0xC5) ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIlllIlll[0];
            return n2 != 0;
        });
        if (z.lllIlIIllllIll(lllllllllllllllIlIlllIlIIlIIIlll)) {
            lllllllllllllllIlIlllIlIIlIIlIII.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int lllllllllllllllIlIlllIlIIlIIIllI = Inventory.getAll(item -> {
            int n2;
            if (!z.lllIlIIllllIlI(item.getName().contains(lIllIlllIllI[lIllIlllIlll[4]]) ? 1 : 0) || z.lllIlIIlllllIl(item.getName().contains(lIllIlllIllI[lIllIlllIlll[5]]) ? 1 : 0)) {
                n2 = lIllIlllIlll[1];
                "".length();
                if (null != null) {
                    return ((0xFB ^ 0xAC ^ (0x1A ^ 0x6B)) & (0xA1 ^ 0xAD ^ (0xA1 ^ 0x8B) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllIlllIlll[0];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIllIlllIllI[lIllIlllIlll[1]])[lIllIlllIlll[1]].replace(lIllIlllIllI[lIllIlllIlll[2]], lIllIlllIllI[lIllIlllIlll[3]]))).sum();
        if (z.lllIlIIlllllII(lllllllllllllllIlIlllIlIIlIIIllI, lllllllllllllllIlIlllIlIIlIIlIII.aY.prayDoses())) {
            lllllllllllllllIlIlllIlIIlIIlIII.aX.f(lIllIlllIlll[1]);
            lllllllllllllllIlIlllIlIIlIIlIII.aX.g(lIllIlllIlll[1]);
            lllllllllllllllIlIlllIlIIlIIlIII.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int lllllllllllllllIlIlllIlIIlIIIlIl = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlllIlll[1]];
            stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[0]];
            return item.hasAction(stringArray);
        });
        if (z.lllIlIIlllllII(lllllllllllllllIlIlllIlIIlIIIlIl, lllllllllllllllIlIlllIlIIlIIlIII.aY.food())) {
            lllllllllllllllIlIlllIlIIlIIlIII.aX.f(lIllIlllIlll[1]);
            lllllllllllllllIlIlllIlIIlIIlIII.aX.g(lIllIlllIlll[1]);
            lllllllllllllllIlIlllIlIIlIIlIII.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIlllllIl(Players.getLocal().getWorldLocation().equals((Object)h.e(lllllllllllllllIlIlllIlIIlIIIlll)) ? 1 : 0)) {
            lllllllllllllllIlIlllIlIIlIIlIII.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        Movement.setDestination((WorldPoint)h.e((TileObject)var1_1));
        return lIllIlllIlll[1];
    }

    private static boolean lllIlIIllllIll(Object object) {
        return object == null;
    }

    private static void lllIlIIllllIII() {
        lIllIlllIllI = new String[lIllIlllIlll[8]];
        z.lIllIlllIllI[z.lIllIlllIlll[0]] = z.lllIlIIlllIlIl("j5asxJM9qtQ=", "YYwaZ");
        z.lIllIlllIllI[z.lIllIlllIlll[1]] = z.lllIlIIlllIlIl("u61mH7L79h0=", "ZYGvO");
        z.lIllIlllIllI[z.lIllIlllIlll[2]] = z.lllIlIIlllIllI("RQ==", "ldDQB");
        z.lIllIlllIllI[z.lIllIlllIlll[3]] = z.lllIlIIlllIllI("", "IWpyI");
        z.lIllIlllIllI[z.lIllIlllIlll[4]] = z.lllIlIIlllIlIl("U+lQHKA4QA8=", "ZkTNZ");
        z.lIllIlllIllI[z.lIllIlllIlll[5]] = z.lllIlIIlllIlll("+0D2phFDF0w=", "xipVR");
        z.lIllIlllIllI[z.lIllIlllIlll[6]] = z.lllIlIIlllIlIl("r9X7UEf65o8=", "iRhvp");
        z.lIllIlllIllI[z.lIllIlllIlll[7]] = z.lllIlIIlllIlll("A0DYNo/LwsM=", "lZPCQ");
    }

    private static String lllIlIIlllIlIl(String lllllllllllllllIlIlllIIlllIIllll, String lllllllllllllllIlIlllIIlllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), lIllIlllIlll[8]), "DES");
            Cipher lllllllllllllllIlIlllIIlllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIlllIlIIIl.init(lIllIlllIlll[2], lllllllllllllllIlIlllIIlllIlIIlI);
            return new String(lllllllllllllllIlIlllIIlllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIlllIlIIII) {
            lllllllllllllllIlIlllIIlllIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIlllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllllII(int n2, int n3) {
        return n2 < n3;
    }
}

