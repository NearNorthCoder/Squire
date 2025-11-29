/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a_Unknown;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.CEnum;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.k_Unknown;

/* TASK: Moving to next floor -> MovingtonextfloorTask */
@TaskDesc(name="Moving to next floor", priority=10)
public class MovingToNextFloorTask
extends k_Unknown {
    private static /* synthetic */ int[] lllllllIIIII;
    static final /* synthetic */ Set<Integer> A;
    private static /* synthetic */ String[] llllllIlIIll;

    private static void lIIlIlIIlIlllll() {
        lllllllIIIII = new int[13];
        g.lllllllIIIII[0] = (0x99 ^ 0x8F ^ (0xA0 ^ 0x98)) & (21 + 99 - 115 + 161 ^ 41 + 37 - 15 + 73 ^ -1);
        g.lllllllIIIII[1] = 1;
        g.lllllllIIIII[2] = 2;
        g.lllllllIIIII[3] = 3;
        g.lllllllIIIII[4] = 0xA4 ^ 0xA0;
        g.lllllllIIIII[5] = 0xE ^ 7 ^ (0x61 ^ 0x6D);
        g.lllllllIIIII[6] = 0xAF ^ 0x9D ^ (0x24 ^ 0x10);
        g.lllllllIIIII[7] = 0x4F ^ 0x4A ^ 2;
        g.lllllllIIIII[8] = 0xCA ^ 0xC2;
        g.lllllllIIIII[9] = 0xFFFFF75F & 0x5BAD;
        g.lllllllIIIII[10] = -(0xFFFFFB52 & 0x24FF) & (0xFFFFF3FF & 0x7F5F);
        g.lllllllIIIII[11] = 0xFFFFFF8F & 0x537F;
        g.lllllllIIIII[12] = 0x7D ^ 0x74;
    }

    private static void lIIlIlIIlIllllI() {
        llllllIlIIll = new String[lllllllIIIII[12]];
        g.llllllIlIIll[g.lllllllIIIII[0]] = g."Search";
        g.llllllIlIIll[g.lllllllIIIII[1]] = g."Quick-leave";
        g.llllllIlIIll[g.lllllllIIIII[2]] = g."Pick-lock";
        g.llllllIlIIll[g.lllllllIIIII[3]] = g."Tomb Door";
        g.llllllIlIIll[g.lllllllIIIII[4]] = g."Pick-lock";
        g.llllllIlIIll[g.lllllllIIIII[5]] = g."Tomb Door";
        g.llllllIlIIll[g.lllllllIIIII[6]] = g."Quick-leave";
        g.llllllIlIIll[g.lllllllIIIII[7]] = g."Grand Gold Chest";
        g.llllllIlIIll[g.lllllllIIIII[8]] = g."Search";
    }

    private static boolean lIIlIlIIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIllIIIII(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIlIllll(String var11, String var12) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllllllIIIII[2], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIllIIII(String var9, String var5) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var15 = lllllllIIIII[0];
        char[] var14 = var9.toCharArray();
        int var17 = var14.length;
        int var13 = lllllllIIIII[0];
        while (g.lIIlIlIIllIIlII(var13, var17)) {
            char var8 = var14[var13];
            var16.append((char)(var8 ^ var6[var15 % var6.length]));
            0;
            ++var15;
            ++var13;
            0;
            if ((0x5A ^ 0x69 ^ (0x89 ^ 0xBE)) != -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    @Inject
    protected g(a a2, Client client) {
        super(a2, client);
    }

    static {
        g.lIIlIlIIlIlllll();
        g.lIIlIlIIlIllllI();
        A = ImmutableSet.of((Object)lllllllIIIII[9], (Object)lllllllIIIII[10], (Object)lllllllIIIII[11]);
    }

    private static boolean lIIlIlIIllIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        TileObject var1;
        void var7;
        g var2;
        c c2 = c.f();
        if (g.lIIlIlIIllIIIII((Object)c2)) {
            return lllllllIIIII[0];
        }
        if (g.lIIlIlIIllIIIIl(var2.D.a((c)var7) ? 1 : 0) && g.lIIlIlIIllIIIlI(var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIII[1]];
                stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[8]];
                if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllllIIIII[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0x1A ^ 0x59 ^ (0x17 ^ 1)) & (88 + 69 - 131 + 174 ^ 145 + 2 - 93 + 103 ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIII[0];
            return n2 != 0;
        }))) {
            return lllllllIIIII[0];
        }
        if (g.lIIlIlIIllIIIIl(var2.D.b((c)var7) ? 1 : 0) && g.lIIlIlIIllIIIlI(var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(A.contains(tileObject.getActualId()) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lllllllIIIII[1];
                0;
                if (2 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                n2 = lllllllIIIII[0];
            }
            return n2 != 0;
        }))) {
            var1.interact(llllllIlIIll[lllllllIIIII[0]]);
            return lllllllIIIII[1];
        }
        if (g.lIIlIlIIllIIIll(c.g() ? 1 : 0)) {
            var1 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[5]]) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    String[] stringArray = new String[lllllllIIIII[1]];
                    stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[6]];
                    if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIII[1];
                        0;
                        if (((5 ^ 0x5D ^ (0xF1 ^ 0x97)) & (18 + 25 - -59 + 55 ^ 82 + 12 - 28 + 97 ^ -1)) == 0) return n2 != 0;
                        return ((0x28 ^ 0x51 ^ (0x6D ^ 0xD)) & (24 + 41 - -47 + 52 ^ 106 + 44 - 1 + 40 ^ -1)) != 0;
                    }
                }
                n2 = lllllllIIIII[0];
                return n2 != 0;
            });
            if (g.lIIlIlIIllIIIlI(var1)) {
                var1.interact(llllllIlIIll[lllllllIIIII[1]]);
                return lllllllIIIII[1];
            }
            return lllllllIIIII[0];
        }
        var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIII[1]];
                stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[4]];
                if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lllllllIIIII[1];
                    0;
                    if (((0x33 ^ 0xC ^ (0xDD ^ 0xBB)) & (0x71 ^ 0x6D ^ (0xC2 ^ 0x87) ^ -1)) == 0) return n2 != 0;
                    return ((0xA9 ^ 0x8A ^ (0x17 ^ 0x28)) & (0xAB ^ 0x89 ^ (0x29 ^ 0x17) ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIII[0];
            return n2 != 0;
        });
        if (g.lIIlIlIIllIIIII(var1)) {
            return lllllllIIIII[0];
        }
        var2_2.interact(llllllIlIIll[lllllllIIIII[2]]);
        return lllllllIIIII[1];
    }
}

