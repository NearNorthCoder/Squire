/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.h;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/* TASK: Panic tping -> PanicTeleportTask */
@TaskDesc(name="Panic tping", priority=0x7FFFFFFF, blocking=true)
public class aa
extends ad {
    private static /* synthetic */ int[] lIllIllIlIlll;
    private static /* synthetic */ String[] lIllIllIlIIll;

    private static boolean llIIlIIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIlIIlIIlIIlI() {
        lIllIllIlIIll = new String[lIllIllIlIlll[3]];
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[0]] = aa."Equip";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[2]] = aa."Wear";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[1]] = aa."Eat";
    }

    private static boolean llIIlIIlIIlIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    protected aa(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static String llIIlIIlIIIllII(String var19, String var20) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIllIllIlIlll[1], var3);
            return new String(var14.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        aa var16;
        if (aa.llIIlIIlIIlIllI(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIlIlll[0];
        }
        int var10 = Inventory.getCount(item -> item.hasAction(lIllIllIlIIll[lIllIllIlIlll[1]]::equals));
        if (aa.llIIlIIlIIlIlll(var10)) {
            return lIllIllIlIlll[0];
        }
        if (aa.llIIlIIlIIllIII(Combat.getCurrentHealth(), var16.aA.eatAtHP())) {
            return lIllIllIlIlll[0];
        }
        h[] var5 = h.values();
        int var1 = var5.length;
        int var18 = lIllIllIlIlll[0];
        while (aa.llIIlIIlIIllIIl(var18, var1)) {
            h var17 = var5[var18];
            if (aa.llIIlIIlIIlIllI(Inventory.contains((int[])var17.u()) ? 1 : 0) && aa.llIIlIIlIIlIllI(Equipment.contains((int[])var17.u()) ? 1 : 0)) {
                0;
                
                }
            } else if (aa.llIIlIIlIIllIlI(var17.t() ? 1 : 0)) {
                if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])var17.u()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllIllIlIlll[1]];
                    stringArray[aa.lIllIllIlIlll[0]] = lIllIllIlIIll[lIllIllIlIlll[0]];
                    stringArray[aa.lIllIllIlIlll[2]] = lIllIllIlIIll[lIllIllIlIlll[2]];
                    Inventory.getFirst((int[])var17.u()).interact(stringArray);
                }
                if (aa.llIIlIIlIIllIlI(Equipment.contains((int[])var17.u()) ? 1 : 0)) {
                    Equipment.getFirst((int[])var17.u()).interact(var17.s());
                    0;
                    if (1 >= 0) break;
                    return false;
                }
            } else if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])var17.u()) ? 1 : 0)) {
                Inventory.getFirst((int[])var17.u()).interact(var17.s());
                0;
                if (null == null) break;
                return ((25 + 139 - 133 + 160 ^ 74 + 146 - 174 + 124) & (0xEE ^ 0x80 ^ (0x2A ^ 0x51) ^ -1)) != 0;
            }
            ++var18;
            0;
            if ((0xB ^ 0xF) >= ((0x19 ^ 0x3A) & ~(0x18 ^ 0x3B))) continue;
            return false;
        }
        this.E.a(lIllIllIlIlll[2]);
        return lIllIllIlIlll[2];
    }

    private static boolean llIIlIIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aa.llIIlIIlIIlIlIl();
        aa.llIIlIIlIIlIIlI();
    }

    private static void llIIlIIlIIlIlIl() {
        lIllIllIlIlll = new int[4];
        aa.lIllIllIlIlll[0] = 3 & ~3;
        aa.lIllIllIlIlll[1] = 2;
        aa.lIllIllIlIlll[2] = 1;
        aa.lIllIllIlIlll[3] = 3;
    }

    private static String llIIlIIlIIIlIll(String var8, String var15) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var12 = var15.toCharArray();
        int var9 = lIllIllIlIlll[0];
        char[] var7 = var8.toCharArray();
        int var6 = var7.length;
        int var13 = lIllIllIlIlll[0];
        while (aa.llIIlIIlIIllIIl(var13, var6)) {
            char var2 = var7[var13];
            var4.append((char)(var2 ^ var12[var9 % var12.length]));
            0;
            ++var9;
            ++var13;
            0;
            if (2 <= (2 ^ 0x34 ^ (0x70 ^ 0x42))) continue;
            return null;
        }
        return String.valueOf(var4);
    }
}

