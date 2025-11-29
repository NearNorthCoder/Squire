/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Leaving the altar -> LeavingthealtarTask */
@TaskDesc(name="Leaving the altar", blocking=true, priority=5)
public class LeavingTheAltarTask
extends h_Unknown {
    private static /* synthetic */ int[] llIlIIIIIlII;
    private static /* synthetic */ String[] llIlIIIIIIlI;

    private static boolean lIIIIIIIIIlIIII(Object object) {
        return object != null;
    }

    private static String lIIIIIIIIIIIlll(String var7, String var6) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llIlIIIIIlII[3], var16);
            return new String(var17.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    public r(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIlII[0]];
        cArray[r.llIlIIIIIlII[1]] = c.ACTIVE;
        cArray[r.llIlIIIIIlII[2]] = c.FINISHING;
        cArray[r.llIlIIIIIlII[3]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIlIll(int n2) {
        return n2 <= 0;
    }

    private static void lIIIIIIIIIIlIlI() {
        llIlIIIIIlII = new int[5];
        r.llIlIIIIIlII[0] = 3;
        r.llIlIIIIIlII[1] = (0x41 ^ 0x72 ^ (0xD2 ^ 0xB5)) & (223 + 82 - 197 + 121 ^ 14 + 2 - -109 + 52 ^ -1);
        r.llIlIIIIIlII[2] = 1;
        r.llIlIIIIIlII[3] = 2;
        r.llIlIIIIIlII[4] = 0xFFFFE8FF & Short.MAX_VALUE;
    }

    private static boolean lIIIIIIIIIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        r var8;
        int var5;
        int n2;
        int[] nArray = new int[llIlIIIIIlII[2]];
        nArray[r.llIlIIIIIlII[1]] = llIlIIIIIlII[4];
        if (!r.lIIIIIIIIIIlIll(Inventory.getCount((int[])nArray)) || r.lIIIIIIIIIIllII(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIlIIIIIlII[2];
            0;
            if (-1 < -1) {
                return false;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        if (!r.lIIIIIIIIIIllIl(var5 = n2) || r.lIIIIIIIIIIlllI(var8.aV.g() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIIIIIIIIlllI(tileObject.getName().contains(llIlIIIIIIlI[llIlIIIIIlII[2]]) ? 1 : 0) && r.lIIIIIIIIIIlllI(tileObject.hasAction(string -> {
                int n2;
                if (r.lIIIIIIIIIlIIII(string) && r.lIIIIIIIIIIlllI(string.equals(llIlIIIIIIlI[llIlIIIIIlII[3]]) ? 1 : 0)) {
                    n2 = llIlIIIIIlII[2];
                    0;
                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    n2 = llIlIIIIIlII[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIlIIIIIlII[2];
                0;
                if (3 <= 2) {
                    return false;
                }
            } else {
                n2 = llIlIIIIIlII[1];
            }
            return n2 != 0;
        });
        if (r.lIIIIIIIIIIllll(var3)) {
            return llIlIIIIIlII[1];
        }
        var2_2.interact(llIlIIIIIIlI[llIlIIIIIlII[1]]);
        this.b(llIlIIIIIlII[2], () -> Players.getLocal().isMoving());
        return llIlIIIIIlII[2];
    }

    static {
        r.lIIIIIIIIIIlIlI();
        r.lIIIIIIIIIIlIIl();
    }

    private static String lIIIIIIIIIIIllI(String var4, String var1) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var15 = var1.toCharArray();
        int var11 = llIlIIIIIlII[1];
        char[] var13 = var4.toCharArray();
        int var12 = var13.length;
        int var9 = llIlIIIIIlII[1];
        while (r.lIIIIIIIIIlIIIl(var9, var12)) {
            char var10 = var13[var9];
            var2.append((char)(var10 ^ var15[var11 % var15.length]));
            0;
            ++var11;
            ++var9;
            0;
            if (((62 + 128 - 171 + 130 ^ 64 + 40 - -10 + 66) & (0xFB ^ 0x8C ^ (0x3B ^ 0x6D) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIIIIIIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIlIIIIIIlI = new String[llIlIIIIIlII[0]];
        r.llIlIIIIIIlI[r.llIlIIIIIlII[1]] = r."Use";
        r.llIlIIIIIIlI[r.llIlIIIIIlII[2]] = r."Portal";
        r.llIlIIIIIIlI[r.llIlIIIIIlII[3]] = r."Use";
    }

    private static boolean lIIIIIIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIIIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIIIIIllll(Object object) {
        return object == null;
    }
}

