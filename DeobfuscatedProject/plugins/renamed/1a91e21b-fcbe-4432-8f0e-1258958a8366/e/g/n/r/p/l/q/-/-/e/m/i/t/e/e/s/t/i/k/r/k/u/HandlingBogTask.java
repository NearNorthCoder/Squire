/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.a_Unknown;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.u;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Handling bog -> HandlingbogTask */
@TaskDesc(name="Handling bog")
public class HandlingBogTask
extends x_Unknown {
    private static /* synthetic */ int[] lIIllIIlllIlI;
    private static /* synthetic */ String[] lIIllIIlllIIl;
    private /* synthetic */ List<TileObject> ad;

    private static String lIllIIIIIIIIIIl(String var1, String var6) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIllIIlllIlI[3], var17);
            return new String(var20.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIIIlIl() {
        lIIllIIlllIlI = new int[14];
        t.lIIllIIlllIlI[0] = 1;
        t.lIIllIIlllIlI[1] = (0x8D ^ 0xB8) & ~(0x2A ^ 0x1F);
        t.lIIllIIlllIlI[2] = 0x1E ^ 1 ^ (0x6F ^ 0x77);
        t.lIIllIIlllIlI[3] = 2;
        t.lIIllIIlllIlI[4] = 0x9A ^ 0x9F;
        t.lIIllIIlllIlI[5] = 3;
        t.lIIllIIlllIlI[6] = 0xA1 ^ 0xA5;
        t.lIIllIIlllIlI[7] = 98 + 76 - 40 + 1 ^ 101 + 109 - 134 + 105;
        t.lIIllIIlllIlI[8] = 0x82 ^ 0x9F ^ (0x88 ^ 0x9F);
        t.lIIllIIlllIlI[9] = 0xFFFFB75F & 0x7EAE;
        t.lIIllIIlllIlI[10] = 0x72 ^ 0x74;
        t.lIIllIIlllIlI[11] = 0x85 ^ 0x83 ^ (5 ^ 0xA);
        t.lIIllIIlllIlI[12] = 0x76 ^ 0x5E;
        t.lIIllIIlllIlI[13] = 0x43 ^ 0x50 ^ (0x61 ^ 0x7A);
    }

    private static void lIllIIIIIIIIIll() {
        lIIllIIlllIIl = new String[lIIllIIlllIlI[13]];
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[1]] = t."Hey...that's great...you did a great job...I'll follow you.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[0]] = t."Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[3]] = t."That's amazing! I'll have to do the same.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[5]] = t."Continue-trek";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[6]] = t."Stand-on";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[4]] = t."Adding solved bog path";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[10]] = t."Bog";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[2]] = t."Stand-on";
    }

    private static boolean lIllIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIlIIII(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] a(List<TileObject> list) {
        void var19;
        void var2;
        int[][] nArray = new int[lIIllIIlllIlI[8]][lIIllIIlllIlI[8]];
        int var21 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var21, var2.size())) {
            TileObject var4 = (TileObject)var2.get(var21);
            if (t.lIllIIIIIIIlIll(var4) && t.lIllIIIIIIIllll(var4.getId(), lIIllIIlllIlI[9])) {
                var19[var21 / t.lIIllIIlllIlI[8] + t.lIIllIIlllIlI[0]][var21 % t.lIIllIIlllIlI[8]] = lIIllIIlllIlI[0];
            }
            ++var21;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        var21 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var21, ((void)var19[lIIllIIlllIlI[1]]).length)) {
            var19[t.lIIllIIlllIlI[1]][var21] = lIIllIIlllIlI[0];
            var19[t.lIIllIIlllIlI[10]][var21] = lIIllIIlllIlI[0];
            ++var21;
            0;
            if (3 >= 0) continue;
            return null;
        }
        var21 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var21, lIIllIIlllIlI[5])) {
            var19[t.lIIllIIlllIlI[2] + var21][t.lIIllIIlllIlI[11]] = lIIllIIlllIlI[0];
            ++var21;
            0;
            if (2 > 0) continue;
            return null;
        }
        return nArray;
    }

    private static boolean lIllIIIIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public TileObject b(List<TileObject> list) {
        void var27;
        int var8 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var8, var27.size())) {
            TileObject var22 = (TileObject)var27.get(var8);
            if (t.lIllIIIIIIIlIll(var22) && t.lIllIIIIIIIIllI(var22.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && t.lIllIIIIIIIlllI(var8 + lIIllIIlllIlI[0], var27.size())) {
                return (TileObject)var27.get(var8 + lIIllIIlllIlI[0]);
            }
            ++var8;
            0;
            
            return null;
        }
        return list.get(lIIllIIlllIlI[1]);
    }

    private static boolean lIllIIIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean z() {
        Object var24;
        t var15;
        String string;
        if (t.lIllIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && t.lIllIIIIIIIIlll((string = Dialog.getText()).length()) && (!t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[1]]) ? 1 : 0) || !t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[0]]) ? 1 : 0) || t.lIllIIIIIIIIllI(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[3]]) ? 1 : 0))) {
            return lIIllIIlllIlI[1];
        }
        Player var14 = Players.getLocal();
        if (t.lIllIIIIIIIlIIl(var14)) {
            return lIIllIIlllIlI[1];
        }
        TileObject var25 = var15.A();
        if (t.lIllIIIIIIIlIIl(var25)) {
            return lIIllIIlllIlI[1];
        }
        if (t.lIllIIIIIIIlIlI(var14.distanceTo((Locatable)var25), lIIllIIlllIlI[4])) {
            var15.ad.clear();
            var25.interact(lIIllIIlllIIl[lIIllIIlllIlI[5]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIlIII(var15.ad.isEmpty() ? 1 : 0) && t.lIllIIIIIIIlIll(var24 = var15.b(var15.ad))) {
            var24.interact(lIIllIIlllIIl[lIIllIIlllIlI[6]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIIllI(var15.ad.isEmpty() ? 1 : 0)) {
            var24 = TileObjects.getAll(tileObject -> {
                int n2;
                if (t.lIllIIIIIIIIllI(tileObject.getName().equals(lIIllIIlllIIl[lIIllIIlllIlI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIlllIlI[0]];
                    stringArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIIl[lIIllIIlllIlI[2]];
                    if (t.lIllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIIlllIlI[0];
                        0;
                        if ((0x53 ^ 0x21 ^ (0xF5 ^ 0x83)) > 0) return n2 != 0;
                        return ((0x2A ^ 0x46 ^ (0x4E ^ 0x12)) & (84 + 7 - 37 + 73 ^ (0x1F ^ 0x50) ^ -1)) != 0;
                    }
                }
                n2 = lIIllIIlllIlI[1];
                return n2 != 0;
            });
            var24.sort(new u(var15));
            if (t.lIllIIIIIIIllII(var24.size(), lIIllIIlllIlI[7])) {
                int[][] var12 = var15.a((List<TileObject>)var24);
                int[][] var18 = a.b(var12);
                var15.ad = var15.a(var18, (List<TileObject>)var24);
                if (t.lIllIIIIIIIllIl(var25.getWorldY(), Players.getLocal().getWorldY())) {
                    Collections.reverse(var15.ad);
                }
            }
        }
        return lIIllIIlllIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    public List<TileObject> a(int[][] nArray, List<TileObject> list) {
        void var5_6;
        int var11;
        void var13;
        int var26;
        void var5;
        ArrayList arrayList = new ArrayList();
        int n2 = lIIllIIlllIlI[1];
        int llllllllllllllIllllIIIIIllIIIIlI22 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22, ((void)var5[lIIllIIlllIlI[1]]).length)) {
            if (t.lIllIIIIIIIllll((int)var5[lIIllIIlllIlI[1]][llllllllllllllIllllIIIIIllIIIIlI22], lIIllIIlllIlI[0])) {
                var26 = llllllllllllllIllllIIIIIllIIIIlI22;
                var13.add(var26);
                0;
                0;
                if (3 >= ((0x35 ^ 0x50 ^ (0x76 ^ 0x17)) & (0x5A ^ 0x5F ^ 1 ^ -1))) break;
                return null;
            }
            ++llllllllllllllIllllIIIIIllIIIIlI22;
            0;
            if (((0x58 ^ 0x44) & ~(0x46 ^ 0x5A)) == 0) continue;
            return null;
        }
        while (t.lIllIIIIIIIlllI(var26, lIIllIIlllIlI[12])) {
            llllllllllllllIllllIIIIIllIIIIlI22 = var26 / lIIllIIlllIlI[8];
            var11 = var26 % lIIllIIlllIlI[8];
            if (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0], lIIllIIlllIlI[4]) && t.lIllIIIIIIIllll((int)var5[llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]][var11], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var13.contains((llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var11) ? 1 : 0)) {
                var26 = (llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var11;
                var13.add(var26);
                0;
                0;
                
                }
            } else if (t.lIllIIIIIIlIIII(llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)var5[llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]][var11], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var13.contains((llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var11) ? 1 : 0)) {
                var26 = (llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var11;
                var13.add(var26);
                0;
                0;
                
                }
            } else if (t.lIllIIIIIIlIIII(var11 - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)var5[llllllllllllllIllllIIIIIllIIIIlI22][var11 - lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var13.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var11 - lIIllIIlllIlI[0]) ? 1 : 0)) {
                var26 = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var11 - lIIllIIlllIlI[0];
                var13.add(var26);
                0;
                0;
                if (2 <= 0) {
                    return null;
                }
            } else if (t.lIllIIIIIIIlllI(var11 + lIIllIIlllIlI[0], lIIllIIlllIlI[8]) && t.lIllIIIIIIIllll((int)var5[llllllllllllllIllllIIIIIllIIIIlI22][var11 + lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var13.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var11 + lIIllIIlllIlI[0]) ? 1 : 0)) {
                var26 = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var11 + lIIllIIlllIlI[0];
                var13.add(var26);
                0;
            }
            0;
            if (2 > 0) continue;
            return null;
        }
        ArrayList<TileObject> llllllllllllllIllllIIIIIllIIIIlI22 = new ArrayList<TileObject>();
        var11 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var11, var13.size())) {
            void var9;
            llllllllllllllIllllIIIIIllIIIIlI22.add((TileObject)var9.get((Integer)var13.get(var11)));
            0;
            ++var11;
            0;
            if (1 != 0) continue;
            return null;
        }
        System.out.println(lIIllIIlllIIl[lIIllIIlllIlI[4]]);
        return var5_6;
    }

    private static boolean lIllIIIIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected t(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIlI[0]];
        nArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIlI[2];
        super(templeTrekkingPlugin, nArray);
        this.ad = new ArrayDeque();
    }

    private static boolean lIllIIIIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        t.lIllIIIIIIIIlIl();
        t.lIllIIIIIIIIIll();
    }

    private static boolean lIllIIIIIIIIlll(int n2) {
        return n2 > 0;
    }

    private static String lIlIlllllllllll(String var3, String var23) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIlI[13]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIllIIlllIlI[3], var10);
            return new String(var16.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIIlIll(Object object) {
        return object != null;
    }
}

