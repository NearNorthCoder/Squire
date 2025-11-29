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
        l lllllllllllllllIIlIlllIIlIIIIIII;
        Player player = Players.getLocal();
        if (l.lIIIllIllllIIlI(player.getAnimation(), lllIlllIlllI[0])) {
            return lllIlllIlllI[1];
        }
        f lllllllllllllllIIlIlllIIIllllllI = lllllllllllllllIIlIlllIIlIIIIIII.y().h().values().stream().filter(f2 -> {
            boolean bl;
            if (!l.lIIIllIllllIlIl((Object)f2.q(), (Object)g.FULL) || l.lIIIllIllllIlII((Object)f2.q(), (Object)g.EMPTY)) {
                bl = lllIlllIlllI[2];
                "".length();
                if (((0xF9 ^ 0xB3) & ~(0x4C ^ 6)) != ((0x19 ^ 0x35) & ~(0x6E ^ 0x42))) {
                    return ((0xC8 ^ 0x96) & ~(0x76 ^ 0x28)) != 0;
                }
            } else {
                bl = lllIlllIlllI[1];
            }
            return bl;
        }).min(Comparator.comparing(f2 -> -f2.m())).orElse(null);
        if (l.lIIIllIllllIIll(lllllllllllllllIIlIlllIIIllllllI)) {
            return lllIlllIlllI[1];
        }
        TileObject lllllllllllllllIIlIlllIIIlllllIl = TileObjects.getFirstAt((WorldPoint)lllllllllllllllIIlIlllIIIllllllI.o(), tileObject -> {
            String[] stringArray = new String[lllIlllIlllI[2]];
            stringArray[l.lllIlllIlllI[1]] = lllIlllIllII[lllIlllIlllI[3]];
            return tileObject.hasAction(stringArray);
        });
        if (l.lIIIllIllllIIll(lllllllllllllllIIlIlllIIIlllllIl)) {
            return lllIlllIlllI[1];
        }
        if (l.lIIIllIllllIlII((Object)lllllllllllllllIIlIlllIIIllllllI.q(), (Object)g.FULL)) {
            string = lllIlllIllII[lllIlllIlllI[1]];
            "".length();
            if (null != null) {
                return ((4 + 99 - 12 + 94 ^ 121 + 108 - 99 + 41) & (0x60 ^ 0x7F ^ (0xA2 ^ 0xAF) ^ -" ".length())) != 0;
            }
        } else {
            string = lllIlllIllII[lllIlllIlllI[2]];
        }
        lllllllllllllllIIlIlllIIIlllllIl.interact(string);
        return lllIlllIlllI[2];
    }

    static {
        l.lIIIllIllllIIIl();
        l.lIIIllIlllIlIll();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIllII = new String[lllIlllIlllI[4]];
        l.lllIlllIllII[l.lllIlllIlllI[1]] = l.lIIIllIlllIIlll("eLgaTiujZws=", "OWakT");
        l.lllIlllIllII[l.lllIlllIlllI[2]] = l.lIIIllIlllIlIIl("CCseOAwiNgEw", "LBmUm");
        l.lllIlllIllII[l.lllIlllIlllI[3]] = l.lIIIllIlllIlIlI("6Wtt4HYzVZs=", "uVOXk");
    }

    private static String lIIIllIlllIlIlI(String lllllllllllllllIIlIlllIIIllIIlII, String lllllllllllllllIIlIlllIIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlllIlllI[5]), "DES");
            Cipher lllllllllllllllIIlIlllIIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIIllIlIII.init(lllIlllIlllI[3], lllllllllllllllIIlIlllIIIllIlIIl);
            return new String(lllllllllllllllIIlIlllIIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIIllIIlll) {
            lllllllllllllllIIlIlllIIIllIIlll.printStackTrace();
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

    private static String lIIIllIlllIIlll(String lllllllllllllllIIlIlllIIIlllIIIl, String lllllllllllllllIIlIlllIIIlllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIIlllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIIlllIlIl.init(lllIlllIlllI[3], lllllllllllllllIIlIlllIIIlllIllI);
            return new String(lllllllllllllllIIlIlllIIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIIlllIlII) {
            lllllllllllllllIIlIlllIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIllllIIIl() {
        lllIlllIlllI = new int[6];
        l.lllIlllIlllI[0] = 0xFFFFBF5E & 0x54FD;
        l.lllIlllIlllI[1] = (0x9D ^ 0xB2) & ~(0xA2 ^ 0x8D);
        l.lllIlllIlllI[2] = " ".length();
        l.lllIlllIlllI[3] = "  ".length();
        l.lllIlllIlllI[4] = "   ".length();
        l.lllIlllIlllI[5] = 0x64 ^ 0x6C;
    }

    private static boolean lIIIllIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIllIlllIlIIl(String lllllllllllllllIIlIlllIIIlIlIllI, String lllllllllllllllIIlIlllIIIlIlIlIl) {
        lllllllllllllllIIlIlllIIIlIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIIlIlIlII = new StringBuilder();
        char[] lllllllllllllllIIlIlllIIIlIlIIll = lllllllllllllllIIlIlllIIIlIlIlIl.toCharArray();
        int lllllllllllllllIIlIlllIIIlIlIIlI = lllIlllIlllI[1];
        char[] lllllllllllllllIIlIlllIIIlIIllII = lllllllllllllllIIlIlllIIIlIlIllI.toCharArray();
        int lllllllllllllllIIlIlllIIIlIIlIll = lllllllllllllllIIlIlllIIIlIIllII.length;
        int lllllllllllllllIIlIlllIIIlIIlIlI = lllIlllIlllI[1];
        while (l.lIIIllIllllIllI(lllllllllllllllIIlIlllIIIlIIlIlI, lllllllllllllllIIlIlllIIIlIIlIll)) {
            char lllllllllllllllIIlIlllIIIlIlIlll = lllllllllllllllIIlIlllIIIlIIllII[lllllllllllllllIIlIlllIIIlIIlIlI];
            lllllllllllllllIIlIlllIIIlIlIlII.append((char)(lllllllllllllllIIlIlllIIIlIlIlll ^ lllllllllllllllIIlIlllIIIlIlIIll[lllllllllllllllIIlIlllIIIlIlIIlI % lllllllllllllllIIlIlllIIIlIlIIll.length]));
            "".length();
            ++lllllllllllllllIIlIlllIIIlIlIIlI;
            ++lllllllllllllllIIlIlllIIIlIIlIlI;
            "".length();
            if (" ".length() > ((0x9A ^ 0x83) & ~(0x17 ^ 0xE))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIIIlIlIlII);
    }

    private static boolean lIIIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllllIIll(Object object) {
        return object == null;
    }
}

