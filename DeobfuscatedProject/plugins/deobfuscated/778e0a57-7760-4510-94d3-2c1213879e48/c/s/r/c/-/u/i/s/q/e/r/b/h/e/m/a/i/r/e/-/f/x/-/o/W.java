/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Setting up raid", priority=20000, blocking=true)
public class W
extends U {
    private static /* synthetic */ int[] lIlIIllIIIIl;
    private static /* synthetic */ String[] lIlIIlIllIlI;

    private static boolean llIllIIlllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        if (W.llIllIIlllllll(u.bf() ? 1 : 0)) {
            bl2 = lIlIIllIIIIl[1];
            0;
            if (2 < 2) {
                return ((0x5C ^ 0x56) & ~(0x1E ^ 0x14)) != 0;
            }
        } else {
            bl2 = lIlIIllIIIIl[0];
        }
        return bl2;
    }

    private static void llIllIIllIIlII() {
        lIlIIlIllIlI = new String[lIlIIllIIIIl[6]];
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[0]] = W."Begin the raid.";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[1]] = W."Begin the raid.";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[4]] = W."Couldnt find button";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[5]] = W."Start raid";
    }

    static {
        W.llIllIIllllllI();
        W.llIllIIllIIlII();
    }

    private static String llIllIIllIIIlI(String lllllllllllllllIllIllIIIllllIIIl, String lllllllllllllllIllIllIIIlllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIllllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIllllIIll.init(lIlIIllIIIIl[4], lllllllllllllllIllIllIIIllllIlII);
            return new String(lllllllllllllllIllIllIIIllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIllllIIlI) {
            lllllllllllllllIllIllIIIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIllIIIIl(String lllllllllllllllIllIllIIlIIIIIIIl, String lllllllllllllllIllIllIIlIIIIIIII) {
        lllllllllllllllIllIllIIlIIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIlIIIIIlII = new StringBuilder();
        char[] lllllllllllllllIllIllIIlIIIIIIll = lllllllllllllllIllIllIIlIIIIIIII.toCharArray();
        int lllllllllllllllIllIllIIlIIIIIIlI = lIlIIllIIIIl[0];
        char[] lllllllllllllllIllIllIIIllllllII = lllllllllllllllIllIllIIlIIIIIIIl.toCharArray();
        int lllllllllllllllIllIllIIIlllllIll = lllllllllllllllIllIllIIIllllllII.length;
        int lllllllllllllllIllIllIIIlllllIlI = lIlIIllIIIIl[0];
        while (W.llIllIlIIIIIlI(lllllllllllllllIllIllIIIlllllIlI, lllllllllllllllIllIllIIIlllllIll)) {
            char lllllllllllllllIllIllIIlIIIIIlll = lllllllllllllllIllIllIIIllllllII[lllllllllllllllIllIllIIIlllllIlI];
            lllllllllllllllIllIllIIlIIIIIlII.append((char)(lllllllllllllllIllIllIIlIIIIIlll ^ lllllllllllllllIllIllIIlIIIIIIll[lllllllllllllllIllIllIIlIIIIIIlI % lllllllllllllllIllIllIIlIIIIIIll.length]));
            0;
            ++lllllllllllllllIllIllIIlIIIIIIlI;
            ++lllllllllllllllIllIllIIIlllllIlI;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIIlIIIIIlII);
    }

    private static String llIllIIllIIIll(String lllllllllllllllIllIllIIIlllIIlII, String lllllllllllllllIllIllIIIlllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIIl[7]), "DES");
            Cipher lllllllllllllllIllIllIIIlllIIllI = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIlllIIllI.init(lIlIIllIIIIl[4], lllllllllllllllIllIllIIIlllIIlll);
            return new String(lllllllllllllllIllIllIIIlllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIlllIIlIl) {
            lllllllllllllllIllIllIIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        W lllllllllllllllIllIllIIlIIIlIIlI;
        if (W.llIllIIlllllll(this.ck() ? 1 : 0)) {
            return lIlIIllIIIIl[0];
        }
        if (W.llIllIlIIIIIII(lllllllllllllllIllIllIIlIIIlIIlI.co.G() ? 1 : 0)) {
            return lIlIIllIIIIl[0];
        }
        if (W.llIllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0) && W.llIllIlIIIIIII(Dialog.hasOption((String)lIlIIlIllIlI[lIlIIllIIIIl[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIllIIIIl[1]];
            stringArray[W.lIlIIllIIIIl[0]] = lIlIIlIllIlI[lIlIIllIIIIl[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            System.out.println("[StartRaid] Starting raid, layout: " + String.valueOf(aa.e()));
            return lIlIIllIIIIl[1];
        }
        Widget lllllllllllllllIllIllIIlIIIlIIIl = Widgets.get((int)lIlIIllIIIIl[2], (int)lIlIIllIIIIl[3]);
        if (W.llIllIlIIIIIIl(lllllllllllllllIllIllIIlIIIlIIIl)) {
            System.out.println(lIlIIlIllIlI[lIlIIllIIIIl[4]]);
            return lIlIIllIIIIl[0];
        }
        this.co.b(s.ba());
        this.co.a(s.bc());
        this.co.c(s.bb());
        this.co.d(s.b(s.aZ()));
        var1_1.interact(lIlIIlIllIlI[lIlIIllIIIIl[5]]);
        this.sleep(this.cr.nextInt(lIlIIllIIIIl[4]) + lIlIIllIIIIl[1]);
        return lIlIIllIIIIl[1];
    }

    @Inject
    protected W(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIllIIllllllI() {
        lIlIIllIIIIl = new int[8];
        W.lIlIIllIIIIl[0] = (0x2B ^ 1) & ~(0xF ^ 0x25);
        W.lIlIIllIIIIl[1] = 1;
        W.lIlIIllIIIIl[2] = -(0xFFFFDF5B & 0x7EAF) & (0xFFFFDFFF & 0x7FFE);
        W.lIlIIllIIIIl[3] = 0x98 ^ 0x96;
        W.lIlIIllIIIIl[4] = 2;
        W.lIlIIllIIIIl[5] = 3;
        W.lIlIIllIIIIl[6] = 87 + 5 - -50 + 39 ^ 31 + 145 - 160 + 161;
        W.lIlIIllIIIIl[7] = 7 ^ 0xF;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIlIIIIIIl(Object object) {
        return object == null;
    }
}

