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

/* TASK: Plundering Chest -> PlunderingchestTask */
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

    private static String lIIlIlIIllllIIl(String var5, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lllllllIIlll[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllllllIIlll[3], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
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

    private static String lIIlIlIIllllIlI(String var13, String var1) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllllllIIlll[3], var17);
            return new String(var15.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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

    private static String lIIlIlIIllllIII(String var16, String var7) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var20 = var7.toCharArray();
        int var21 = lllllllIIlll[0];
        char[] var8 = var16.toCharArray();
        int var11 = var8.length;
        int var12 = lllllllIIlll[0];
        while (i.lIIlIlIlIIIIIIl(var12, var11)) {
            char var9 = var8[var12];
            var18.append((char)(var9 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var18);
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
                TileObject var4;
                void var19;
                i var14;
                c c2 = c.f();
                if (i.lIIlIlIIlllllIl((Object)c2)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIllllllI(var14.D.a((c)var19) ? 1 : 0)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(var14.D.b((c)var19) ? 1 : 0) && i.lIIlIlIlIIIIIII(var4 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (i.lIIlIlIIlllllll(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && i.lIIlIlIIlllllll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                        n2 = lllllllIIlll[1];
                        0;
                        
                        }
                    } else {
                        n2 = lllllllIIlll[0];
                    }
                    return n2 != 0;
                }))) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(var14.D.c((c)var19) ? 1 : 0)) {
                    int[] nArray = new int[lllllllIIlll[1]];
                    nArray[i.lllllllIIlll[0]] = lllllllIIlll[2];
                    var4 = TileObjects.getNearest((int[])nArray);
                    if (i.lIIlIlIlIIIIIII(var4)) {
                        return lllllllIIlll[0];
                    }
                }
                String[] stringArray = new String[lllllllIIlll[1]];
                stringArray[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[0]];
                var4 = TileObjects.getNearest((String[])stringArray);
                if (!i.lIIlIlIlIIIIIII(var4)) break block8;
                String[] stringArray2 = new String[lllllllIIlll[1]];
                stringArray2[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[1]];
                if (!i.lIIlIlIIllllllI(var4.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return lllllllIIlll[0];
        }
        var2_2.interact(lllllllIIllI[lllllllIIlll[3]]);
        return lllllllIIlll[1];
    }
}

