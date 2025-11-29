/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Teleporting to corp -> TeleportingtocorpTask */
@TaskDesc(name="Teleporting to corp")
public class TeleportingToCorpTask
extends m_Unknown {
    private static /* synthetic */ String[] lIlIllllIIll;
    private static /* synthetic */ int[] lIlIllllIlII;

    static {
        n.lllIIIlIIlIIlI();
        n.lllIIIlIIlIIIl();
    }

    private static boolean lllIIIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static String lllIIIlIIIllll(String var6, String var1) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var9 = var1.toCharArray();
        int var13 = lIlIllllIlII[0];
        char[] var16 = var6.toCharArray();
        int var2 = var16.length;
        int var11 = lIlIllllIlII[0];
        while (n.lllIIIlIIlIllI(var11, var2)) {
            char var10 = var16[var11];
            var14.append((char)(var10 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var11;
            0;
            if (-(0xF ^ 0xA) < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var3;
        if (n.lllIIIlIIlIIll(this.l() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(var3.m() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(lIlIllllIIll[lIlIllllIlII[5]]));
        if (n.lllIIIlIIlIlIl(var15)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(Widgets.isVisible((Widget)Widgets.get((int)lIlIllllIlII[1], (int)lIlIllllIlII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIlIllllIlII[2]);
            return lIlIllllIlII[3];
        }
        String[] stringArray = new String[lIlIllllIlII[3]];
        stringArray[n.lIlIllllIlII[0]] = lIlIllllIIll[lIlIllllIlII[0]];
        if (n.lllIIIlIIlIIll(var15.hasAction(stringArray) ? 1 : 0)) {
            var15.interact(lIlIllllIIll[lIlIllllIlII[3]]);
            return lIlIllllIlII[3];
        }
        var1_1.interact(lIlIllllIIll[lIlIllllIlII[4]]);
        return lIlIllllIlII[3];
    }

    private static String lllIIIlIIlIIII(String var8, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIllllIlII[4], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIlIlIl(Object object) {
        return object == null;
    }

    private static void lllIIIlIIlIIIl() {
        lIlIllllIIll = new String[lIlIllllIlII[6]];
        n.lIlIllllIIll[n.lIlIllllIlII[0]] = n."Corporeal Beast";
        n.lIlIllllIIll[n.lIlIllllIlII[3]] = n."Teleport Menu";
        n.lIlIllllIIll[n.lIlIllllIlII[4]] = n."Corporeal Beast";
        n.lIlIllllIIll[n.lIlIllllIlII[5]] = n."jewellery";
    }

    private static void lllIIIlIIlIIlI() {
        lIlIllllIlII = new int[7];
        n.lIlIllllIlII[0] = (0xE3 ^ 0xAA) & ~(7 ^ 0x4E);
        n.lIlIllllIlII[1] = 0xFFFFCBDF & 0x366E;
        n.lIlIllllIlII[2] = 0xF5 ^ 0xC2;
        n.lIlIllllIlII[3] = 1;
        n.lIlIllllIlII[4] = 2;
        n.lIlIllllIlII[5] = 3;
        n.lIlIllllIlII[6] = 0x47 ^ 0x43;
    }
}

