/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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

@TaskDesc(name="Plundering Chest", priority=10)
public class i
extends k {
    private static /* synthetic */ int[] lllllllIIlll;
    private static /* synthetic */ String[] lllllllIIllI;

    private static boolean lIIlIlIlIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIllllllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected i(a a2, Client client) {
        super(a2, client);
    }

    private static String lIIlIlIIllllIIl(String lllllllllllllllIIlIIllIIIIllIlII, String lllllllllllllllIIlIIllIIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lllllllIIlll[5]), "DES");
            Cipher lllllllllllllllIIlIIllIIIIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIIIllIllI.init(lllllllIIlll[3], lllllllllllllllIIlIIllIIIIllIlll);
            return new String(lllllllllllllllIIlIIllIIIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIIllIlIl) {
            lllllllllllllllIIlIIllIIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIlllllII() {
        lllllllIIlll = new int[6];
        i.lllllllIIlll[0] = (0x5C ^ 0x79 ^ (0x5E ^ 0x66)) & (60 + 6 - -31 + 123 ^ 86 + 105 - 53 + 55 ^ -1);
        i.lllllllIIlll[1] = 1;
        i.lllllllIIlll[2] = -(0xFFFFBDDD & 0x66F3) & (0xFFFFFFF7 & 0x77DF);
        i.lllllllIIlll[3] = 2;
        i.lllllllIIlll[4] = 3;
        i.lllllllIIlll[5] = 12 + 32 - -25 + 89 ^ 34 + 12 - 8 + 112;
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIllI = new String[lllllllIIlll[4]];
        i.lllllllIIllI[i.lllllllIIlll[0]] = i."Grand Gold Chest";
        i.lllllllIIllI[i.lllllllIIlll[1]] = i."Search";
        i.lllllllIIllI[i.lllllllIIlll[3]] = i."Search";
    }

    private static String lIIlIlIIllllIlI(String lllllllllllllllIIlIIllIIIIlIIlll, String lllllllllllllllIIlIIllIIIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIIlIlIIl.init(lllllllIIlll[3], lllllllllllllllIIlIIllIIIIlIlIlI);
            return new String(lllllllllllllllIIlIIllIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIIlIlIII) {
            lllllllllllllllIIlIIllIIIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIlllllll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIlIIllllIII(String lllllllllllllllIIlIIllIIIIIlIIlI, String lllllllllllllllIIlIIllIIIIIlIllI) {
        lllllllllllllllIIlIIllIIIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIIIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIIIIlIlII = lllllllllllllllIIlIIllIIIIIlIllI.toCharArray();
        int lllllllllllllllIIlIIllIIIIIlIIll = lllllllIIlll[0];
        char[] lllllllllllllllIIlIIllIIIIIIllIl = lllllllllllllllIIlIIllIIIIIlIIlI.toCharArray();
        int lllllllllllllllIIlIIllIIIIIIllII = lllllllllllllllIIlIIllIIIIIIllIl.length;
        int lllllllllllllllIIlIIllIIIIIIlIll = lllllllIIlll[0];
        while (i.lIIlIlIlIIIIIIl(lllllllllllllllIIlIIllIIIIIIlIll, lllllllllllllllIIlIIllIIIIIIllII)) {
            char lllllllllllllllIIlIIllIIIIIllIII = lllllllllllllllIIlIIllIIIIIIllIl[lllllllllllllllIIlIIllIIIIIIlIll];
            lllllllllllllllIIlIIllIIIIIlIlIl.append((char)(lllllllllllllllIIlIIllIIIIIllIII ^ lllllllllllllllIIlIIllIIIIIlIlII[lllllllllllllllIIlIIllIIIIIlIIll % lllllllllllllllIIlIIllIIIIIlIlII.length]));
            0;
            ++lllllllllllllllIIlIIllIIIIIlIIll;
            ++lllllllllllllllIIlIIllIIIIIIlIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIIIIlIlIl);
    }

    static {
        i.lIIlIlIIlllllII();
        i.lIIlIlIIllllIll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        block9: {
            block8: {
                TileObject lllllllllllllllIIlIIllIIIlIIIIII;
                void lllllllllllllllIIlIIllIIIlIIIIIl;
                i lllllllllllllllIIlIIllIIIlIIIIlI;
                c c2 = c.f();
                if (i.lIIlIlIIlllllIl((Object)c2)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIllllllI(lllllllllllllllIIlIIllIIIlIIIIlI.D.a((c)lllllllllllllllIIlIIllIIIlIIIIIl) ? 1 : 0)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(lllllllllllllllIIlIIllIIIlIIIIlI.D.b((c)lllllllllllllllIIlIIllIIIlIIIIIl) ? 1 : 0) && i.lIIlIlIlIIIIIII(lllllllllllllllIIlIIllIIIlIIIIII = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (i.lIIlIlIIlllllll(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && i.lIIlIlIIlllllll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                        n2 = lllllllIIlll[1];
                        0;
                        if (null != null) {
                            return ((0x6F ^ 0x50) & ~(0x24 ^ 0x1B)) != 0;
                        }
                    } else {
                        n2 = lllllllIIlll[0];
                    }
                    return n2 != 0;
                }))) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(lllllllllllllllIIlIIllIIIlIIIIlI.D.c((c)lllllllllllllllIIlIIllIIIlIIIIIl) ? 1 : 0)) {
                    int[] nArray = new int[lllllllIIlll[1]];
                    nArray[i.lllllllIIlll[0]] = lllllllIIlll[2];
                    lllllllllllllllIIlIIllIIIlIIIIII = TileObjects.getNearest((int[])nArray);
                    if (i.lIIlIlIlIIIIIII(lllllllllllllllIIlIIllIIIlIIIIII)) {
                        return lllllllIIlll[0];
                    }
                }
                String[] stringArray = new String[lllllllIIlll[1]];
                stringArray[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[0]];
                lllllllllllllllIIlIIllIIIlIIIIII = TileObjects.getNearest((String[])stringArray);
                if (!i.lIIlIlIlIIIIIII(lllllllllllllllIIlIIllIIIlIIIIII)) break block8;
                String[] stringArray2 = new String[lllllllIIlll[1]];
                stringArray2[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[1]];
                if (!i.lIIlIlIIllllllI(lllllllllllllllIIlIIllIIIlIIIIII.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return lllllllIIlll[0];
        }
        var2_2.interact(lllllllIIllI[lllllllIIlll[3]]);
        return lllllllIIlll[1];
    }
}

