/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.EEnum;

/* TASK: Drinking brew -> DrinkingbrewTask */
@TaskDesc(name="Drinking brew", priority=100)
public class DrinkingBrewTask
extends Z_Unknown {
    private final /* synthetic */ SquireAutoTOA cH;
    private static /* synthetic */ int[] llIllIlIllI;
    private final /* synthetic */ C cG;
    private static /* synthetic */ String[] llIllIlIlIl;

    private static boolean lIlIlIlIIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int llllllllllllllllIIlIllIlIIIlIIIl2;
        int n2;
        ae var7;
        if (ae.lIlIlIlIIIIIII(this.cH.e() ? 1 : 0)) {
            return llIllIlIllI[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.lIlIlIlIIIIIlI(e.NECTAR.d(item.getId()) ? 1 : 0) || ae.lIlIlIlIIIIIII(item.getName().contains(llIllIlIlIl[llIllIlIllI[1]]) ? 1 : 0)) {
                n2 = llIllIlIllI[1];
                0;
                if (2 != 2) {
                    return false;
                }
            } else {
                n2 = llIllIlIllI[0];
            }
            return n2 != 0;
        });
        if (ae.lIlIlIlIIIIIIl(var8)) {
            return llIllIlIllI[0];
        }
        if (ae.lIlIlIlIIIIIlI(var7.aq() ? 1 : 0)) {
            int[] nArray = new int[llIllIlIllI[1]];
            nArray[ae.llIllIlIllI[0]] = llIllIlIllI[2];
            Item llllllllllllllllIIlIllIlIIIlIIIl2 = Inventory.getFirst((int[])nArray);
            if (ae.lIlIlIlIIIIIll(llllllllllllllllIIlIllIlIIIlIIIl2) && ae.lIlIlIlIIIIlII(Combat.getSpecEnergy(), llIllIlIllI[3]) && ae.lIlIlIlIIIIlII(Combat.getCurrentHealth(), llIllIlIllI[4])) {
                return llIllIlIllI[0];
            }
        }
        if (ae.lIlIlIlIIIIIII(var7.bf() ? 1 : 0) && !ae.lIlIlIlIIIIlIl(Combat.getCurrentHealth(), llIllIlIllI[5]) || ae.lIlIlIlIIIIIII(var7.cG.ap() ? 1 : 0)) {
            n2 = llIllIlIllI[1];
            0;
            if (3 == 0) {
                return false;
            }
        } else {
            n2 = llllllllllllllllIIlIllIlIIIlIIIl2 = llIllIlIllI[0];
        }
        if (!ae.lIlIlIlIIIIIII(var7.cG.am() ? 1 : 0) || ae.lIlIlIlIIIIIlI(llllllllllllllllIIlIllIlIIIlIIIl2)) {
            return llIllIlIllI[0];
        }
        var1_1.interact(llIllIlIlIl[llIllIlIllI[0]]);
        this.cG.ao();
        return llIllIlIllI[1];
    }

    private static void lIlIlIIllllllI() {
        llIllIlIlIl = new String[llIllIlIllI[6]];
        ae.llIllIlIlIl[ae.llIllIlIllI[0]] = ae."Drink";
        ae.llIllIlIlIl[ae.llIllIlIllI[1]] = ae."brew";
    }

    private static void lIlIlIIlllllll() {
        llIllIlIllI = new int[8];
        ae.llIllIlIllI[0] = (3 + 74 - -110 + 19 ^ 16 + 107 - 108 + 120) & (150 + 49 - 12 + 10 ^ 1 + 39 - 1 + 101 ^ -1);
        ae.llIllIlIllI[1] = 1;
        ae.llIllIlIllI[2] = -(0xFFFF8DFD & 0x7743) & (0xFFFFFFDF & 0x6FFB);
        ae.llIllIlIllI[3] = 0x79 ^ 0x71 ^ (0x55 ^ 0x1B);
        ae.llIllIlIllI[4] = 0x44 ^ 0x6C;
        ae.llIllIlIllI[5] = 0x93 ^ 0xC3;
        ae.llIllIlIllI[6] = 2;
        ae.llIllIlIllI[7] = 0x61 ^ 0x41 ^ (0x89 ^ 0xA1);
    }

    private static String lIlIlIIlllllIl(String var4, String var1) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var9 = var1.toCharArray();
        int var16 = llIllIlIllI[0];
        char[] var13 = var4.toCharArray();
        int var2 = var13.length;
        int var15 = llIllIlIllI[0];
        while (ae.lIlIlIlIIIIllI(var15, var2)) {
            char var14 = var13[var15];
            var3.append((char)(var14 ^ var9[var16 % var9.length]));
            0;
            ++var16;
            ++var15;
            0;
            if (((0xDC ^ 0x81) & ~(0x70 ^ 0x2D)) == ((0x37 ^ 0x31) & ~(0x62 ^ 0x64))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIlIlIlIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIlIIlllllII(String var6, String var5) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llIllIlIllI[7]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIllIlIllI[6], var12);
            return new String(var10.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        ae.lIlIlIIlllllll();
        ae.lIlIlIIllllllI();
    }

    @Inject
    protected ae(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cG = c2;
        this.cH = squireAutoTOA;
    }
}

