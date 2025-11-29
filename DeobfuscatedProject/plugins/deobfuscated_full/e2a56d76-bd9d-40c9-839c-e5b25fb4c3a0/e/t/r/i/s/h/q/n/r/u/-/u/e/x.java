/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.i;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

public abstract class x
extends j {
    private static /* synthetic */ int[] llllIIIlIlII;
    private static /* synthetic */ String[] llllIIIlIIll;

    private static boolean lIIIlllIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    protected i H() {
        return this.z().pitfallAnimal();
    }

    private boolean a(NPC nPC) {
        RectangularArea rectangularArea = this.H().w();
        if (x.lIIIlllIlllIllI(rectangularArea)) {
            return llllIIIlIlII[1];
        }
        return rectangularArea.contains(nPC.getWorldLocation());
    }

    private static void lIIIlllIlllIIll() {
        llllIIIlIIll = new String[llllIIIlIlII[4]];
        x.llllIIIlIIll[x.llllIIIlIlII[0]] = x."Collapsed trap";
        x.llllIIIlIIll[x.llllIIIlIlII[1]] = x."Dismantle";
        x.llllIIIlIIll[x.llllIIIlIlII[2]] = x."Spiked pit";
        x.llllIIIlIIll[x.llllIIIlIlII[3]] = x."Jump";
    }

    private static String lIIIlllIlllIIIl(String var22, String var17) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llllIIIlIlII[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIIIlIlII[2], var19);
            return new String(var10.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIlllIIII(String var7, String var2) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llllIIIlIlII[2], var15);
            return new String(var14.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    protected TileObject a(boolean bl) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[llllIIIlIlII[1]];
                stringArray[x.llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[1]];
                if (x.lIIIlllIllllIII(tileObject.hasAction(stringArray) ? 1 : 0, bl ? 1 : 0)) {
                    n2 = llllIIIlIlII[1];
                    0;
                    if (((0x4A ^ 0x57 ^ (0x3A ^ 0x18)) & (82 + 77 - 146 + 160 ^ 73 + 113 - 105 + 65 ^ -1)) != 2) return n2 != 0;
                    return ((0xD8 ^ 0x91 ^ (0xD4 ^ 0xAC)) & (124 + 95 - 82 + 50 ^ 32 + 111 - 69 + 64 ^ -1)) != 0;
                }
            }
            n2 = llllIIIlIlII[0];
            return n2 != 0;
        });
    }

    protected TileObject F() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[2]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[llllIIIlIlII[1]];
                stringArray[x.llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[3]];
                if (x.lIIIlllIlllIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllIIIlIlII[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllIIIlIlII[0];
            return n2 != 0;
        });
    }

    public x(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

    private static String lIIIlllIlllIIlI(String var21, String var8) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var1 = var8.toCharArray();
        int var18 = llllIIIlIlII[0];
        char[] var9 = var21.toCharArray();
        int var3 = var9.length;
        int var11 = llllIIIlIlII[0];
        while (x.lIIIlllIllllIlI(var11, var3)) {
            char var4 = var9[var11];
            var20.append((char)(var4 ^ var1[var18 % var1.length]));
            0;
            ++var18;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var20);
    }

    protected NPC D() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.lIIIlllIlllIllI(nPC.getInteracting())) {
                bl = llllIIIlIlII[1];
                0;
                if (((0xA6 ^ 0x83 ^ (0 ^ 6)) & (75 + 116 - 101 + 46 ^ 30 + 29 - -68 + 44 ^ -1)) >= 1) {
                    return ((29 + 90 - 81 + 145 ^ 101 + 7 - 48 + 69) & (0xED ^ 0xC3 ^ (0x11 ^ 9) ^ -1)) != 0;
                }
            } else {
                bl = llllIIIlIlII[0];
            }
            return bl;
        });
    }

    private static boolean lIIIlllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    protected NPC E() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.lIIIlllIllllIIl(nPC.getInteracting(), Players.getLocal())) {
                bl = llllIIIlIlII[1];
                0;
                if ((10 + 13 - -64 + 44 ^ 108 + 77 - 117 + 67) < ((0x52 ^ 0x7B ^ (0xC4 ^ 0xC3)) & (9 + 127 - 38 + 31 ^ 137 + 113 - 96 + 21 ^ -1))) {
                    return ((0x3B ^ 0xF ^ (0x8C ^ 0x9E)) & (0xCF ^ 0xC6 ^ (0x49 ^ 0x66) ^ -1)) != 0;
                }
            } else {
                bl = llllIIIlIlII[0];
            }
            return bl;
        });
    }

    private static boolean lIIIlllIlllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected NPC a(Predicate<NPC> predicate) {
        WorldPoint worldPoint;
        TileObject tileObject = this.G();
        if (x.lIIIlllIlllIllI(tileObject)) {
            worldPoint = Players.getLocal().getWorldLocation();
            0;
            if (((0x1F ^ 0x23) & ~(0xBB ^ 0x87)) > ((0x14 ^ 0x2E) & ~(0x1B ^ 0x21))) {
                return null;
            }
        } else {
            void var16;
            worldPoint = var16.getWorldLocation();
        }
        WorldPoint worldPoint2 = worldPoint;
        return NPCs.getNearest((WorldPoint)worldPoint2, predicate.and(nPC -> {
            int n2;
            if (x.lIIIlllIlllIlll(this.H().v().equalsIgnoreCase(nPC.getName()) ? 1 : 0) && x.lIIIlllIlllIlll(this.a((NPC)nPC) ? 1 : 0)) {
                n2 = llllIIIlIlII[1];
                0;
                if (-2 > 0) {
                    return ((5 ^ 0x68 ^ (0x3C ^ 0xC)) & (0x3A ^ 0x51 ^ (0x19 ^ 0x2F) ^ -1) & ((0x46 ^ 0x4E ^ (0x2F ^ 0x7A)) & (3 ^ (0xDC ^ 0x82) ^ -1) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIIlIlII[0];
            }
            return n2 != 0;
        }));
    }

    private static boolean lIIIlllIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        x.lIIIlllIlllIlII();
        x.lIIIlllIlllIIll();
    }

    private static void lIIIlllIlllIlII() {
        llllIIIlIlII = new int[6];
        x.llllIIIlIlII[0] = (0x6B ^ 0x58) & ~(0xA8 ^ 0x9B);
        x.llllIIIlIlII[1] = 1;
        x.llllIIIlIlII[2] = 2;
        x.llllIIIlIlII[3] = 3;
        x.llllIIIlIlII[4] = 83 + 169 - 128 + 75 ^ 190 + 6 - 125 + 124;
        x.llllIIIlIlII[5] = 0x9F ^ 0x97;
    }

    private static boolean lIIIlllIlllIlIl(Object object) {
        return object != null;
    }

    protected TileObject G() {
        x var5;
        TileObject var12;
        TileObject tileObject = this.F();
        if (x.lIIIlllIlllIlIl(tileObject)) {
            return var12;
        }
        var12 = var5.a(llllIIIlIlII[0]);
        if (x.lIIIlllIlllIlIl(var12)) {
            return var12;
        }
        return this.a(llllIIIlIlII[1]);
    }
}

