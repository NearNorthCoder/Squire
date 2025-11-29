/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import e.t.r.i.s.h.q.n.r.u.-.u.e.g;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Resetting box trap -> ResettingboxtrapTask */
@TaskDesc(name="Resetting box trap", priority=15)
public class l
extends j {
    private static /* synthetic */ int[] lllIlllIlllI;
    private static /* synthetic */ String[] lllIlllIllII;

    private static boolean lIIIllIllllIlIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean x() {
        String string;
        l var9;
        Player player = Players.getLocal();
        if (l.lIIIllIllllIIlI(player.getAnimation(), lllIlllIlllI[0])) {
            return lllIlllIlllI[1];
        }
        f var6 = var9.y().h().values().stream().filter(f2 -> {
            boolean bl;
            if (!l.lIIIllIllllIlIl((Object)f2.q(), (Object)g.FULL) || l.lIIIllIllllIlII((Object)f2.q(), (Object)g.EMPTY)) {
                bl = lllIlllIlllI[2];
                0;
                if (((0xF9 ^ 0xB3) & ~(0x4C ^ 6)) != ((0x19 ^ 0x35) & ~(0x6E ^ 0x42))) {
                    return false;
                }
            } else {
                bl = lllIlllIlllI[1];
            }
            return bl;
        }).min(Comparator.comparing(f2 -> -f2.m())).orElse(null);
        if (l.lIIIllIllllIIll(var6)) {
            return lllIlllIlllI[1];
        }
        TileObject var19 = TileObjects.getFirstAt((WorldPoint)var6.o(), tileObject -> {
            String[] stringArray = new String[lllIlllIlllI[2]];
            stringArray[l.lllIlllIlllI[1]] = lllIlllIllII[lllIlllIlllI[3]];
            return tileObject.hasAction(stringArray);
        });
        if (l.lIIIllIllllIIll(var19)) {
            return lllIlllIlllI[1];
        }
        if (l.lIIIllIllllIlII((Object)var6.q(), (Object)g.FULL)) {
            string = lllIlllIllII[lllIlllIlllI[1]];
            0;
            
            }
        } else {
            string = lllIlllIllII[lllIlllIlllI[2]];
        }
        var19.interact(string);
        return lllIlllIlllI[2];
    }

    static {
        l.lIIIllIllllIIIl();
        l.lIIIllIlllIlIll();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIllII = new String[lllIlllIlllI[4]];
        l.lllIlllIllII[l.lllIlllIlllI[1]] = l."Check";
        l.lllIlllIllII[l.lllIlllIlllI[2]] = l."Dismantle";
        l.lllIlllIllII[l.lllIlllIlllI[3]] = l."Reset";
    }

    private static String lIIIllIlllIlIlI(String var18, String var1) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIlllIlllI[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIlllIlllI[3], var20);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllllIlII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public l(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

    private static String lIIIllIlllIIlll(String var14, String var22) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIlllIlllI[3], var11);
            return new String(var2.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIllllIIIl() {
        lllIlllIlllI = new int[6];
        l.lllIlllIlllI[0] = 0xFFFFBF5E & 0x54FD;
        l.lllIlllIlllI[1] = (0x9D ^ 0xB2) & ~(0xA2 ^ 0x8D);
        l.lllIlllIlllI[2] = 1;
        l.lllIlllIlllI[3] = 2;
        l.lllIlllIlllI[4] = 3;
        l.lllIlllIlllI[5] = 0x64 ^ 0x6C;
    }

    private static boolean lIIIllIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIllIlllIlIIl(String var5, String var16) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var3 = var16.toCharArray();
        int var15 = lllIlllIlllI[1];
        char[] var8 = var5.toCharArray();
        int var17 = var8.length;
        int var12 = lllIlllIlllI[1];
        while (l.lIIIllIllllIllI(var12, var17)) {
            char var4 = var8[var12];
            var13.append((char)(var4 ^ var3[var15 % var3.length]));
            0;
            ++var15;
            ++var12;
            0;
            if (1 > ((0x9A ^ 0x83) & ~(0x17 ^ 0xE))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIIIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllllIIll(Object object) {
        return object == null;
    }
}

