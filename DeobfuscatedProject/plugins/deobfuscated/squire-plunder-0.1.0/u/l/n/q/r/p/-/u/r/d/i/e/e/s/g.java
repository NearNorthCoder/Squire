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
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.c;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.k;

@TaskDesc(name="Moving to next floor", priority=10)
public class g
extends k {
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

    private static String lIIlIlIIIlIllll(String lllllllllllllllIIlIIllIIllIlllII, String lllllllllllllllIIlIIllIIllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIlllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIlllIIIII.init(lllllllIIIII[2], lllllllllllllllIIlIIllIIlllIIIIl);
            return new String(lllllllllllllllIIlIIllIIlllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIllIlllll) {
            lllllllllllllllIIlIIllIIllIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIllIIII(String lllllllllllllllIIlIIllIIllIIlllI, String lllllllllllllllIIlIIllIIllIIllIl) {
        lllllllllllllllIIlIIllIIllIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIllIIllII = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIllIIlIll = lllllllllllllllIIlIIllIIllIIllIl.toCharArray();
        int lllllllllllllllIIlIIllIIllIIlIlI = lllllllIIIII[0];
        char[] lllllllllllllllIIlIIllIIllIIIlII = lllllllllllllllIIlIIllIIllIIlllI.toCharArray();
        int lllllllllllllllIIlIIllIIllIIIIll = lllllllllllllllIIlIIllIIllIIIlII.length;
        int lllllllllllllllIIlIIllIIllIIIIlI = lllllllIIIII[0];
        while (g.lIIlIlIIllIIlII(lllllllllllllllIIlIIllIIllIIIIlI, lllllllllllllllIIlIIllIIllIIIIll)) {
            char lllllllllllllllIIlIIllIIllIIllll = lllllllllllllllIIlIIllIIllIIIlII[lllllllllllllllIIlIIllIIllIIIIlI];
            lllllllllllllllIIlIIllIIllIIllII.append((char)(lllllllllllllllIIlIIllIIllIIllll ^ lllllllllllllllIIlIIllIIllIIlIll[lllllllllllllllIIlIIllIIllIIlIlI % lllllllllllllllIIlIIllIIllIIlIll.length]));
            0;
            ++lllllllllllllllIIlIIllIIllIIlIlI;
            ++lllllllllllllllIIlIIllIIllIIIIlI;
            0;
            if ((0x5A ^ 0x69 ^ (0x89 ^ 0xBE)) != -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIllIIllII);
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
        TileObject lllllllllllllllIIlIIllIIlllIlllI;
        void lllllllllllllllIIlIIllIIlllIllll;
        g lllllllllllllllIIlIIllIIllllIIII;
        c c2 = c.f();
        if (g.lIIlIlIIllIIIII((Object)c2)) {
            return lllllllIIIII[0];
        }
        if (g.lIIlIlIIllIIIIl(lllllllllllllllIIlIIllIIllllIIII.D.a((c)lllllllllllllllIIlIIllIIlllIllll) ? 1 : 0) && g.lIIlIlIIllIIIlI(lllllllllllllllIIlIIllIIlllIlllI = TileObjects.getNearest(tileObject -> {
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
        if (g.lIIlIlIIllIIIIl(lllllllllllllllIIlIIllIIllllIIII.D.b((c)lllllllllllllllIIlIIllIIlllIllll) ? 1 : 0) && g.lIIlIlIIllIIIlI(lllllllllllllllIIlIIllIIlllIlllI = TileObjects.getNearest(tileObject -> {
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
            lllllllllllllllIIlIIllIIlllIlllI.interact(llllllIlIIll[lllllllIIIII[0]]);
            return lllllllIIIII[1];
        }
        if (g.lIIlIlIIllIIIll(c.g() ? 1 : 0)) {
            lllllllllllllllIIlIIllIIlllIlllI = TileObjects.getNearest(tileObject -> {
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
            if (g.lIIlIlIIllIIIlI(lllllllllllllllIIlIIllIIlllIlllI)) {
                lllllllllllllllIIlIIllIIlllIlllI.interact(llllllIlIIll[lllllllIIIII[1]]);
                return lllllllIIIII[1];
            }
            return lllllllIIIII[0];
        }
        lllllllllllllllIIlIIllIIlllIlllI = TileObjects.getNearest(tileObject -> {
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
        if (g.lIIlIlIIllIIIII(lllllllllllllllIIlIIllIIlllIlllI)) {
            return lllllllIIIII[0];
        }
        var2_2.interact(llllllIlIIll[lllllllIIIII[2]]);
        return lllllllIIIII[1];
    }
}

