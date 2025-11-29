/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@Singleton
public class h {
    private static /* synthetic */ int[] lIlllIIlIIlI;
    private static /* synthetic */ String[] lIlllIIIlIlI;
    private static final /* synthetic */ int ao;

    private static boolean lllIlIllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIlIllIIIlll(String var4, String var5) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlllIIlIIlI[11]), "DES");
            Cipher var30 = Cipher.getInstance("DES");
            var30.init(lIlllIIlIIlI[5], var26);
            return new String(var30.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    public boolean G() {
        return Widgets.isVisible((Widget)this.H());
    }

    public boolean K() {
        boolean bl;
        if (h.lllIlIllIIllll(this.I())) {
            bl = lIlllIIlIIlI[2];
            0;
            if (2 == 0) {
                return false;
            }
        } else {
            bl = lIlllIIlIIlI[1];
        }
        return bl;
    }

    private static void lllIlIllIIllII() {
        lIlllIIlIIlI = new int[12];
        h.lIlllIIlIIlI[0] = 0x4D ^ 0x30;
        h.lIlllIIlIIlI[1] = (0x91 ^ 0x83) & ~(0x42 ^ 0x50);
        h.lIlllIIlIIlI[2] = 1;
        h.lIlllIIlIIlI[3] = 0xDB ^ 0xB0 ^ (0x89 ^ 0x9C);
        h.lIlllIIlIIlI[4] = 0xC ^ 9;
        h.lIlllIIlIIlI[5] = 2;
        h.lIlllIIlIIlI[6] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        h.lIlllIIlIIlI[7] = 3;
        h.lIlllIIlIIlI[8] = 0xD ^ 9;
        h.lIlllIIlIIlI[9] = 0x70 ^ 0x76;
        h.lIlllIIlIIlI[10] = 0xB4 ^ 0x88 ^ (0xB0 ^ 0x8B);
        h.lIlllIIlIIlI[11] = 0xB ^ 3;
    }

    private static String lllIlIllIIIIIl(String var14, String var2) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var8 = var2.toCharArray();
        int var21 = lIlllIIlIIlI[1];
        char[] var7 = var14.toCharArray();
        int var27 = var7.length;
        int var29 = lIlllIIlIIlI[1];
        while (h.lllIlIllIlIlII(var29, var27)) {
            char var11 = var7[var29];
            var18.append((char)(var11 ^ var8[var21 % var8.length]));
            0;
            ++var21;
            ++var29;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    /*
     * WARNING - void declaration
     */
    public void h(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var22;
        void var13;
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)n2);
            return;
        }
        Widget var6 = Widgets.get((int)lIlllIIlIIlI[0], (int)var13.aF());
        if (h.lllIlIllIIlllI(var6)) {
            return;
        }
        Object var15 = lIlllIIIlIlI[lIlllIIlIIlI[8]];
        if (!h.lllIlIllIlIIIl(var22.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(var22.intValue(), lIlllIIlIIlI[4])) {
            var15 = "Remove-" + (Integer)var22;
        }
        if (h.lllIlIllIlIIlI(var22.intValue(), lIlllIIlIIlI[6])) {
            var15 = lIlllIIIlIlI[lIlllIIlIIlI[4]];
        }
        if (h.lllIlIllIlIIll(var13, (Object)K.BOTTOMLESS_BUCKET)) {
            var15 = lIlllIIIlIlI[lIlllIIlIIlI[9]];
        }
        var3_3.interact((String)var4_4);
    }

    public void c(Item item) {
        NPC nPC = this.I();
        if (h.lllIlIllIIlllI(nPC)) {
            return;
        }
        item.useOn((Actor)nPC);
    }

    private static boolean lllIlIllIIllll(Object object) {
        return object != null;
    }

    static {
        h.lllIlIllIIllII();
        h.lllIlIllIIlIII();
        ao = lIlllIIlIIlI[0];
    }

    public boolean J() {
        boolean bl = lIlllIIlIIlI[1];
        Iterator var12 = Inventory.getAll().iterator();
        while (h.lllIlIllIIllIl(var12.hasNext() ? 1 : 0)) {
            Item var20 = (Item)var12.next();
            if (h.lllIlIllIIllIl(L.bq.contains(var20.getId()) ? 1 : 0)) {
                h var17;
                var17.c(var20);
                int lllllllllllllllIlIllIllllllIIIII = lIlllIIlIIlI[2];
            }
            0;
            
            return false;
        }
        return bl;
    }

    private static boolean lllIlIllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public void L() {
        NPC nPC = this.I();
        if (h.lllIlIllIIlllI(nPC)) {
            return;
        }
        nPC.interact(lIlllIIIlIlI[lIlllIIlIIlI[10]]);
    }

    public Widget H() {
        return Widgets.get((int)lIlllIIlIIlI[0], (int)lIlllIIlIIlI[1]);
    }

    private static boolean lllIlIllIIlllI(Object object) {
        return object == null;
    }

    private static void lllIlIllIIlIII() {
        lIlllIIIlIlI = new String[lIlllIIlIIlI[11]];
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[1]] = h."Tool Leprechaun";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[2]] = h."Store-X";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[5]] = h."Store";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[7]] = h."Store-All";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[8]] = h."Remove-X";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[4]] = h."Remove-All";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[9]] = h."Remove";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[10]] = h."Exchange";
    }

    private static boolean lllIlIllIlIIII(int n2) {
        return n2 == 0;
    }

    public NPC I() {
        String[] stringArray = new String[lIlllIIlIIlI[2]];
        stringArray[h.lIlllIIlIIlI[1]] = lIlllIIIlIlI[lIlllIIlIIlI[1]];
        return NPCs.getNearest((String[])stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public void g(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var9;
        void var28;
        if (h.lllIlIllIlIIII(Inventory.contains((int[])k2.aH()) ? 1 : 0)) {
            return;
        }
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var28.intValue());
            return;
        }
        Widget var23 = Widgets.get((int)lIlllIIlIIlI[3], (int)var9.aG());
        if (h.lllIlIllIIlllI(var23)) {
            return;
        }
        Object var19 = lIlllIIIlIlI[lIlllIIlIIlI[2]];
        if (!h.lllIlIllIlIIIl(var28.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(var28.intValue(), lIlllIIlIIlI[4])) {
            var19 = "Store-" + (Integer)var28;
        }
        if (h.lllIlIllIlIIll(var9, (Object)K.BOTTOMLESS_BUCKET)) {
            var19 = lIlllIIIlIlI[lIlllIIlIIlI[5]];
        }
        if (h.lllIlIllIlIIlI(var28.intValue(), lIlllIIlIIlI[6])) {
            var19 = lIlllIIIlIlI[lIlllIIlIIlI[7]];
        }
        var3_3.interact((String)var4_4);
    }

    private static String lllIlIllIIIIlI(String var1, String var16) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlllIIlIIlI[5], var24);
            return new String(var10.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIllIlIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIlIllIlIIIl(int n2, int n3) {
        return n2 != n3;
    }
}

