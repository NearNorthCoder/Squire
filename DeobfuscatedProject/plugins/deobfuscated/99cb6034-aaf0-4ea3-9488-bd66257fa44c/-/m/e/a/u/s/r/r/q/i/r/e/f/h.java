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

    private static String lllIlIllIIIlll(String lllllllllllllllIlIllIllllIlIlIll, String lllllllllllllllIlIllIllllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIlllIIlIIlI[11]), "DES");
            Cipher lllllllllllllllIlIllIllllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllllIlIllll.init(lIlllIIlIIlI[5], lllllllllllllllIlIllIllllIllIIII);
            return new String(lllllllllllllllIlIllIllllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllllIlIlllI) {
            lllllllllllllllIlIllIllllIlIlllI.printStackTrace();
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
                return ((47 + 87 - 84 + 105 ^ 170 + 31 - 101 + 80) & (1 + 8 - -99 + 37 ^ 155 + 114 - 232 + 153 ^ -1)) != 0;
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

    private static String lllIlIllIIIIIl(String lllllllllllllllIlIllIllllIIlllIl, String lllllllllllllllIlIllIllllIIlIlll) {
        lllllllllllllllIlIllIllllIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllllIIllIll = new StringBuilder();
        char[] lllllllllllllllIlIllIllllIIllIlI = lllllllllllllllIlIllIllllIIlIlll.toCharArray();
        int lllllllllllllllIlIllIllllIIllIIl = lIlllIIlIIlI[1];
        char[] lllllllllllllllIlIllIllllIIlIIll = lllllllllllllllIlIllIllllIIlllIl.toCharArray();
        int lllllllllllllllIlIllIllllIIlIIlI = lllllllllllllllIlIllIllllIIlIIll.length;
        int lllllllllllllllIlIllIllllIIlIIIl = lIlllIIlIIlI[1];
        while (h.lllIlIllIlIlII(lllllllllllllllIlIllIllllIIlIIIl, lllllllllllllllIlIllIllllIIlIIlI)) {
            char lllllllllllllllIlIllIllllIIllllI = lllllllllllllllIlIllIllllIIlIIll[lllllllllllllllIlIllIllllIIlIIIl];
            lllllllllllllllIlIllIllllIIllIll.append((char)(lllllllllllllllIlIllIllllIIllllI ^ lllllllllllllllIlIllIllllIIllIlI[lllllllllllllllIlIllIllllIIllIIl % lllllllllllllllIlIllIllllIIllIlI.length]));
            0;
            ++lllllllllllllllIlIllIllllIIllIIl;
            ++lllllllllllllllIlIllIllllIIlIIIl;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIllllIIllIll);
    }

    /*
     * WARNING - void declaration
     */
    public void h(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void lllllllllllllllIlIllIlllllIIlIII;
        void lllllllllllllllIlIllIlllllIIlIIl;
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)n2);
            return;
        }
        Widget lllllllllllllllIlIllIlllllIIIlll = Widgets.get((int)lIlllIIlIIlI[0], (int)lllllllllllllllIlIllIlllllIIlIIl.aF());
        if (h.lllIlIllIIlllI(lllllllllllllllIlIllIlllllIIIlll)) {
            return;
        }
        Object lllllllllllllllIlIllIlllllIIIllI = lIlllIIIlIlI[lIlllIIlIIlI[8]];
        if (!h.lllIlIllIlIIIl(lllllllllllllllIlIllIlllllIIlIII.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(lllllllllllllllIlIllIlllllIIlIII.intValue(), lIlllIIlIIlI[4])) {
            lllllllllllllllIlIllIlllllIIIllI = "Remove-" + (Integer)lllllllllllllllIlIllIlllllIIlIII;
        }
        if (h.lllIlIllIlIIlI(lllllllllllllllIlIllIlllllIIlIII.intValue(), lIlllIIlIIlI[6])) {
            lllllllllllllllIlIllIlllllIIIllI = lIlllIIIlIlI[lIlllIIlIIlI[4]];
        }
        if (h.lllIlIllIlIIll(lllllllllllllllIlIllIlllllIIlIIl, (Object)K.BOTTOMLESS_BUCKET)) {
            lllllllllllllllIlIllIlllllIIIllI = lIlllIIIlIlI[lIlllIIlIIlI[9]];
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
        Iterator lllllllllllllllIlIllIlllllIlllll = Inventory.getAll().iterator();
        while (h.lllIlIllIIllIl(lllllllllllllllIlIllIlllllIlllll.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIllIlllllIllllI = (Item)lllllllllllllllIlIllIlllllIlllll.next();
            if (h.lllIlIllIIllIl(L.bq.contains(lllllllllllllllIlIllIlllllIllllI.getId()) ? 1 : 0)) {
                h lllllllllllllllIlIllIllllllIIIIl;
                lllllllllllllllIlIllIllllllIIIIl.c(lllllllllllllllIlIllIlllllIllllI);
                int lllllllllllllllIlIllIllllllIIIII = lIlllIIlIIlI[2];
            }
            0;
            if (null == null) continue;
            return ((0xA9 ^ 0xBF) & ~(0x80 ^ 0x96)) != 0;
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
        void lllllllllllllllIlIllIlllllIlIIIl;
        void lllllllllllllllIlIllIlllllIlIIII;
        if (h.lllIlIllIlIIII(Inventory.contains((int[])k2.aH()) ? 1 : 0)) {
            return;
        }
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllllllllllllllIlIllIlllllIlIIII.intValue());
            return;
        }
        Widget lllllllllllllllIlIllIlllllIIllll = Widgets.get((int)lIlllIIlIIlI[3], (int)lllllllllllllllIlIllIlllllIlIIIl.aG());
        if (h.lllIlIllIIlllI(lllllllllllllllIlIllIlllllIIllll)) {
            return;
        }
        Object lllllllllllllllIlIllIlllllIIlllI = lIlllIIIlIlI[lIlllIIlIIlI[2]];
        if (!h.lllIlIllIlIIIl(lllllllllllllllIlIllIlllllIlIIII.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(lllllllllllllllIlIllIlllllIlIIII.intValue(), lIlllIIlIIlI[4])) {
            lllllllllllllllIlIllIlllllIIlllI = "Store-" + (Integer)lllllllllllllllIlIllIlllllIlIIII;
        }
        if (h.lllIlIllIlIIll(lllllllllllllllIlIllIlllllIlIIIl, (Object)K.BOTTOMLESS_BUCKET)) {
            lllllllllllllllIlIllIlllllIIlllI = lIlllIIIlIlI[lIlllIIlIIlI[5]];
        }
        if (h.lllIlIllIlIIlI(lllllllllllllllIlIllIlllllIlIIII.intValue(), lIlllIIlIIlI[6])) {
            lllllllllllllllIlIllIlllllIIlllI = lIlllIIIlIlI[lIlllIIlIIlI[7]];
        }
        var3_3.interact((String)var4_4);
    }

    private static String lllIlIllIIIIlI(String lllllllllllllllIlIllIllllIlllIII, String lllllllllllllllIlIllIllllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIllllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIllllIllllII.init(lIlllIIlIIlI[5], lllllllllllllllIlIllIllllIllllIl);
            return new String(lllllllllllllllIlIllIllllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllllIlllIll) {
            lllllllllllllllIlIllIllllIlllIll.printStackTrace();
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

