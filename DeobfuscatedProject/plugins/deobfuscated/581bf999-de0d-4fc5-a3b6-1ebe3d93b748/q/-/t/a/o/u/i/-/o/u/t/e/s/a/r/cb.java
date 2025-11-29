/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.B;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Claiming supplies", priority=50, blocking=true)
public class cb
extends Z {
    @Inject
    protected /* synthetic */ TOAConfig d;
    private /* synthetic */ boolean hJ;
    private final /* synthetic */ C hI;
    private static final /* synthetic */ int hF;
    private static /* synthetic */ int[] llIllIlIIlI;
    @Inject
    protected /* synthetic */ z cV;
    private final /* synthetic */ B hH;
    private static /* synthetic */ String[] llIllIlIIIl;
    private static final /* synthetic */ int[] hG;

    private static String lIlIlIIllIlIIl(String llllllllllllllllIIlIllIllIlIIlIl, String llllllllllllllllIIlIllIllIlIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIllIlIlIIl.init(llIllIlIIlI[3], llllllllllllllllIIlIllIllIlIlIlI);
            return new String(llllllllllllllllIIlIllIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIllIlIlIII) {
            llllllllllllllllIIlIllIllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIllIlllI(Object object) {
        return object == null;
    }

    private static void lIlIlIIllIlIll() {
        llIllIlIIIl = new String[llIllIlIIlI[9]];
        cb.llIllIlIIIl[cb.llIllIlIIlI[0]] = cb."Helpful Spirit";
        cb.llIllIlIIIl[cb.llIllIlIIlI[1]] = cb."Eat";
        cb.llIllIlIIIl[cb.llIllIlIIlI[3]] = cb."Choose";
        cb.llIllIlIIIl[cb.llIllIlIIlI[4]] = cb."Claim";
        cb.llIllIlIIIl[cb.llIllIlIIlI[5]] = cb."Eat";
    }

    static {
        cb.lIlIlIIllIllII();
        cb.lIlIlIIllIlIll();
        hF = llIllIlIIlI[2];
        int[] nArray = new int[llIllIlIIlI[4]];
        nArray[cb.llIllIlIIlI[0]] = llIllIlIIlI[6];
        nArray[cb.llIllIlIIlI[1]] = llIllIlIIlI[7];
        nArray[cb.llIllIlIIlI[3]] = llIllIlIIlI[8];
        hG = nArray;
    }

    private static boolean lIlIlIIllIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIllIllII() {
        llIllIlIIlI = new int[11];
        cb.llIllIlIIlI[0] = (219 + 137 - 205 + 91 ^ 7 + 158 - 119 + 148) & (2 ^ (0x2D ^ 0x1F) ^ -1);
        cb.llIllIlIIlI[1] = 1;
        cb.llIllIlIIlI[2] = -(0xFFFFEF3D & 0x54D7) & (0xFFFFF77D & 0x4F9F);
        cb.llIllIlIIlI[3] = 2;
        cb.llIllIlIIlI[4] = 3;
        cb.llIllIlIIlI[5] = 0x2E ^ 0x2A;
        cb.llIllIlIIlI[6] = 0x4E ^ 0x6B ^ (0x11 ^ 0x32);
        cb.llIllIlIIlI[7] = 0xA1 ^ 0xA8;
        cb.llIllIlIIlI[8] = 0x50 ^ 0x5C;
        cb.llIllIlIIlI[9] = 0x64 ^ 0x61;
        cb.llIllIlIIlI[10] = 0x80 ^ 0x88;
    }

    private static boolean lIlIlIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIIllIlIlI(String llllllllllllllllIIlIllIllIIllIlI, String llllllllllllllllIIlIllIllIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), llIllIlIIlI[10]), "DES");
            Cipher llllllllllllllllIIlIllIllIIlllII = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIllIIlllII.init(llIllIlIIlI[3], llllllllllllllllIIlIllIllIIlllIl);
            return new String(llllllllllllllllIIlIllIllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIllIIllIll) {
            llllllllllllllllIIlIllIllIIllIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        Widget llllllllllllllllIIlIllIllIllIIII;
        int llllllllllllllllIIlIllIllIllIIIl2;
        int n2;
        cb llllllllllllllllIIlIllIllIllIIll;
        if (cb.lIlIlIIllIllIl(this.bb() ? 1 : 0)) {
            this.hJ = llIllIlIIlI[0];
            return llIllIlIIlI[0];
        }
        String[] stringArray = new String[llIllIlIIlI[1]];
        stringArray[cb.llIllIlIIlI[0]] = llIllIlIIIl[llIllIlIIlI[0]];
        NPC llllllllllllllllIIlIllIllIllIIlI = NPCs.getNearest((String[])stringArray);
        if (cb.lIlIlIIllIlllI(llllllllllllllllIIlIllIllIllIIlI)) {
            return llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(llllllllllllllllIIlIllIllIllIIll.hJ ? 1 : 0)) {
            return llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
            if (cb.lIlIlIIllIllll(llllllllllllllllIIlIllIllIllIIll.cV.c(llllllllllllllllIIlIllIllIllIIll.cV.a(llllllllllllllllIIlIllIllIllIIll.d.meleeGearAkkha())) ? 1 : 0)) {
                return llIllIlIIlI[1];
            }
            Item llllllllllllllllIIlIllIllIllIIIl2 = Inventory.getFirst(item -> item.hasAction(llIllIlIIIl[llIllIlIIlI[5]]::equals));
            if (cb.lIlIlIIlllIIII(llllllllllllllllIIlIllIllIllIIIl2)) {
                llllllllllllllllIIlIllIllIllIIIl2.interact(llIllIlIIIl[llIllIlIIlI[1]]);
                return llIllIlIIlI[1];
            }
            llllllllllllllllIIlIllIllIllIIll.bh();
            return llIllIlIIlI[1];
        }
        if (!cb.lIlIlIIllIllIl(llllllllllllllllIIlIllIllIllIIll.hI.av().containsKey((Object)e.LIQUID_ADRENALINE) ? 1 : 0) || cb.lIlIlIIllIllll(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            n2 = llIllIlIIlI[1];
            0;
            if (3 == -1) {
                return ((0x2D ^ 0x69) & ~(0x7C ^ 0x38)) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIllIllIllIIIl2 = llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(llllllllllllllllIIlIllIllIllIIll.d.dehydration() ? 1 : 0)) {
            llllllllllllllllIIlIllIllIllIIIl2 = llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(Widgets.isVisible((Widget)(llllllllllllllllIIlIllIllIllIIII = Widgets.get((int)llIllIlIIlI[2], (int)hG[llIllIlIIlI[0]]))) ? 1 : 0)) {
            int n3;
            if (cb.lIlIlIIllIllll(llllllllllllllllIIlIllIllIllIIIl2)) {
                n3 = hG[llIllIlIIlI[0]];
                0;
                if (3 > (56 + 70 - 73 + 140 ^ 105 + 17 - -60 + 15)) {
                    return ((0xFF ^ 0x9F ^ (0x6F ^ 0x30)) & (64 + 89 - 128 + 128 ^ 6 + 157 - 162 + 165 ^ -1)) != 0;
                }
            } else {
                n3 = hG[llIllIlIIlI[3]];
            }
            int llllllllllllllllIIlIllIllIlIllll = n3;
            Widgets.get((int)llIllIlIIlI[2], (int)llllllllllllllllIIlIllIllIlIllll).interact(llIllIlIIIl[llIllIlIIlI[3]]);
            llllllllllllllllIIlIllIllIllIIll.hI.a(Widgets.get((int)llIllIlIIlI[2], (int)(llllllllllllllllIIlIllIllIlIllll - llIllIlIIlI[3])));
            llllllllllllllllIIlIllIllIllIIll.hJ = llIllIlIIlI[1];
            return llIllIlIIlI[1];
        }
        var1_1.interact(llIllIlIIIl[llIllIlIIlI[4]]);
        return llIllIlIIlI[1];
    }

    private static String lIlIlIIllIlIII(String llllllllllllllllIIlIllIllIIIIlIl, String llllllllllllllllIIlIllIllIIIIlII) {
        llllllllllllllllIIlIllIllIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIllIIIlIII = new StringBuilder();
        char[] llllllllllllllllIIlIllIllIIIIlll = llllllllllllllllIIlIllIllIIIIlII.toCharArray();
        int llllllllllllllllIIlIllIllIIIIllI = llIllIlIIlI[0];
        char[] llllllllllllllllIIlIllIllIIIIIII = llllllllllllllllIIlIllIllIIIIlIl.toCharArray();
        int llllllllllllllllIIlIllIlIlllllll = llllllllllllllllIIlIllIllIIIIIII.length;
        int llllllllllllllllIIlIllIlIllllllI = llIllIlIIlI[0];
        while (cb.lIlIlIIlllIIIl(llllllllllllllllIIlIllIlIllllllI, llllllllllllllllIIlIllIlIlllllll)) {
            char llllllllllllllllIIlIllIllIIIlIll = llllllllllllllllIIlIllIllIIIIIII[llllllllllllllllIIlIllIlIllllllI];
            llllllllllllllllIIlIllIllIIIlIII.append((char)(llllllllllllllllIIlIllIllIIIlIll ^ llllllllllllllllIIlIllIllIIIIlll[llllllllllllllllIIlIllIllIIIIllI % llllllllllllllllIIlIllIllIIIIlll.length]));
            0;
            ++llllllllllllllllIIlIllIllIIIIllI;
            ++llllllllllllllllIIlIllIlIllllllI;
            0;
            if ((0x17 ^ 0x13) > -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIllIllIIIlIII);
    }

    private static boolean lIlIlIIllIllll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected cb(Client client, B b2, C c2) {
        super(client);
        this.hJ = llIllIlIIlI[0];
        this.hH = b2;
        this.hI = c2;
    }

    private static boolean lIlIlIIlllIIII(Object object) {
        return object != null;
    }
}

