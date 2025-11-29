/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making party", priority=2147483547, blocking=true)
public class ay
extends az {
    private static /* synthetic */ String[] lIIlllllIllI;
    private final /* synthetic */ SquireChambersPlugin dy;
    private final /* synthetic */ SquireChambersConfig dz;
    private static /* synthetic */ int[] lIIllllllIll;

    private static boolean llIlIIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static void llIlIIlIllIlII() {
        lIIlllllIllI = new String[lIIllllllIll[8]];
        ay.lIIlllllIllI[ay.lIIllllllIll[0]] = ay."Make party";
        ay.lIIlllllIllI[ay.lIIllllllIll[2]] = ay."Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[3]] = ay."Recruiting board";
        ay.lIIlllllIllI[ay.lIIllllllIll[4]] = ay."Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[5]] = ay."Recruiting board";
        ay.lIIlllllIllI[ay.lIIllllllIll[6]] = ay."Read";
        ay.lIIlllllIllI[ay.lIIllllllIll[7]] = ay."Make party";
    }

    private static boolean llIlIIlIllIlll(Object object) {
        return object != null;
    }

    private static String llIlIIlIlIllIl(String lllllllllllllllIlllIIlllllIIlIIl, String lllllllllllllllIlllIIlllllIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIIlIII.getBytes(StandardCharsets.UTF_8)), lIIllllllIll[9]), "DES");
            Cipher lllllllllllllllIlllIIlllllIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllllIIllIl.init(lIIllllllIll[3], lllllllllllllllIlllIIlllllIIlllI);
            return new String(lllllllllllllllIlllIIlllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllllIIllII) {
            lllllllllllllllIlllIIlllllIIllII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIlIlllI(String lllllllllllllllIlllIIlllllIllIII, String lllllllllllllllIlllIIlllllIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllllIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllllIllIlI.init(lIIllllllIll[3], lllllllllllllllIlllIIlllllIllIll);
            return new String(lllllllllllllllIlllIIlllllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllllIllIIl) {
            lllllllllllllllIlllIIlllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIlllIII(Object object) {
        return object == null;
    }

    private static String llIlIIlIlIllll(String lllllllllllllllIlllIIllllIlllIll, String lllllllllllllllIlllIIllllIllIlIl) {
        lllllllllllllllIlllIIllllIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllllIlllIIl = new StringBuilder();
        char[] lllllllllllllllIlllIIllllIlllIII = lllllllllllllllIlllIIllllIllIlIl.toCharArray();
        int lllllllllllllllIlllIIllllIllIlll = lIIllllllIll[0];
        char[] lllllllllllllllIlllIIllllIllIIIl = lllllllllllllllIlllIIllllIlllIll.toCharArray();
        int lllllllllllllllIlllIIllllIllIIII = lllllllllllllllIlllIIllllIllIIIl.length;
        int lllllllllllllllIlllIIllllIlIllll = lIIllllllIll[0];
        while (ay.llIlIIlIlllIIl(lllllllllllllllIlllIIllllIlIllll, lllllllllllllllIlllIIllllIllIIII)) {
            char lllllllllllllllIlllIIllllIllllII = lllllllllllllllIlllIIllllIllIIIl[lllllllllllllllIlllIIllllIlIllll];
            lllllllllllllllIlllIIllllIlllIIl.append((char)(lllllllllllllllIlllIIllllIllllII ^ lllllllllllllllIlllIIllllIlllIII[lllllllllllllllIlllIIllllIllIlll % lllllllllllllllIlllIIllllIlllIII.length]));
            0;
            ++lllllllllllllllIlllIIllllIllIlll;
            ++lllllllllllllllIlllIIllllIlIllll;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIllllIlllIIl);
    }

    static {
        ay.llIlIIlIllIlIl();
        ay.llIlIIlIllIlII();
    }

    private static boolean llIlIIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public ay(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dy = squireChambersPlugin;
        this.dz = squireChambersConfig;
    }

    private static void llIlIIlIllIlIl() {
        lIIllllllIll = new int[10];
        ay.lIIllllllIll[0] = (56 + 215 - 245 + 214 ^ 118 + 46 - 109 + 110) & (0x70 ^ 0x3A ^ (0x48 ^ 0x57) ^ -1);
        ay.lIIllllllIll[1] = 0xFFFF81F7 & 0x7FFB;
        ay.lIIllllllIll[2] = 1;
        ay.lIIllllllIll[3] = 2;
        ay.lIIllllllIll[4] = 3;
        ay.lIIllllllIll[5] = 0x42 ^ 0x53 ^ (0x2A ^ 0x3F);
        ay.lIIllllllIll[6] = 0x10 ^ 0x74 ^ (0xEF ^ 0x8E);
        ay.lIIllllllIll[7] = 0x48 ^ 0x4E;
        ay.lIIllllllIll[8] = 0xA8 ^ 0xAF;
        ay.lIIllllllIll[9] = 0x7C ^ 0x3A ^ (8 ^ 0x46);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        ay lllllllllllllllIlllIIllllllIIllI;
        if (ay.llIlIIlIllIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn() ? 1 : 0)) {
            return lIIllllllIll[0];
        }
        Widget lllllllllllllllIlllIIllllllIIlIl = Widgets.get((int)lIIllllllIll[1], widget -> {
            String[] stringArray = new String[lIIllllllIll[2]];
            stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[7]];
            return widget.hasAction(stringArray);
        });
        if (ay.llIlIIlIllIlll(lllllllllllllllIlllIIllllllIIlIl)) {
            lllllllllllllllIlllIIllllllIIlIl.interact(lIIlllllIllI[lIIllllllIll[0]]);
            return lIIllllllIll[0];
        }
        TileObjects.getNearest((WorldPoint)lllllllllllllllIlllIIllllllIIllI.cy, tileObject -> {
            int n2;
            if (ay.llIlIIlIllIllI(tileObject.getName().equals(lIIlllllIllI[lIIllllllIll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllllllIll[2]];
                stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[6]];
                if (ay.llIlIIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllllllIll[2];
                    0;
                    if (((0xBD ^ 0xB9) & ~(0x4F ^ 0x4B)) < 2) return n2 != 0;
                    return ((0xAC ^ 0x81) & ~(0x73 ^ 0x5E)) != 0;
                }
            }
            n2 = lIIllllllIll[0];
            return n2 != 0;
        });
        0;
        TileObject lllllllllllllllIlllIIllllllIIlII = TileObjects.getNearest((WorldPoint)lllllllllllllllIlllIIllllllIIllI.cy, tileObject -> {
            int n2;
            if (ay.llIlIIlIllIllI(tileObject.getName().equals(lIIlllllIllI[lIIllllllIll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllllllIll[2]];
                stringArray[ay.lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[4]];
                if (ay.llIlIIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllllllIll[2];
                    0;
                    if (3 != 0) return n2 != 0;
                    return ((0x2D ^ 0xA) & ~(2 ^ 0x25)) != 0;
                }
            }
            n2 = lIIllllllIll[0];
            return n2 != 0;
        });
        if (ay.llIlIIlIlllIII(lllllllllllllllIlllIIllllllIIlII)) {
            return lIIllllllIll[0];
        }
        var2_2.interact(lIIlllllIllI[lIIllllllIll[2]]);
        return lIIllllllIll[2];
    }
}

