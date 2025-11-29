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

/* TASK: Setting up raid -> SettingupraidTask */
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
                return false;
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

    private static String llIllIIllIIIlI(String var11, String var6) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIIllIIIIl[4], var17);
            return new String(var3.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIllIIIIl(String var8, String var18) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var2 = var18.toCharArray();
        int var10 = lIlIIllIIIIl[0];
        char[] var16 = var8.toCharArray();
        int var14 = var16.length;
        int var13 = lIlIIllIIIIl[0];
        while (W.llIllIlIIIIIlI(var13, var14)) {
            char var20 = var16[var13];
            var9.append((char)(var20 ^ var2[var10 % var2.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static String llIllIIllIIIll(String var7, String var21) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIIl[7]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIIllIIIIl[4], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        W var19;
        if (W.llIllIIlllllll(this.ck() ? 1 : 0)) {
            return lIlIIllIIIIl[0];
        }
        if (W.llIllIlIIIIIII(var19.co.G() ? 1 : 0)) {
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
        Widget var15 = Widgets.get((int)lIlIIllIIIIl[2], (int)lIlIIllIIIIl[3]);
        if (W.llIllIlIIIIIIl(var15)) {
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

