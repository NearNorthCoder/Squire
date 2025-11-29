/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Dialog
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

/* TASK: talk to supervisor -> TalktosupervisorTask */
@TaskDesc(name="talk to supervisor")
public class p
extends Task {
    private static /* synthetic */ String[] lllllllIIlll;
    private static /* synthetic */ int[] lllllllIlIII;

    static {
        p.lIIlIlIlIIlIlll();
        p.lIIlIlIlIIlIllI();
    }

    private static String lIIlIlIlIIlIlIl(String var1, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllllllIlIII[4]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllllllIlIII[3], var8);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (p.lIIlIlIlIIllIII(Vars.getBit((int)lllllllIlIII[0]), lllllllIlIII[1])) {
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIIl(s.e() ? 1 : 0)) {
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIlIII[1]];
            stringArray[p.lllllllIlIII[2]] = lllllllIIlll[lllllllIlIII[2]];
            NPCs.getNearest((String[])stringArray).interact(lllllllIIlll[lllllllIlIII[1]]);
            return lllllllIlIII[2];
        }
        if (p.lIIlIlIlIIllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        return lllllllIlIII[2];
    }

    private static String lIIlIlIlIIlIlII(String var9, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllllllIlIII[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIlIlll() {
        lllllllIlIII = new int[5];
        p.lllllllIlIII[0] = 0xFFFFAF5F & 0x7CE8;
        p.lllllllIlIII[1] = 1;
        p.lllllllIlIII[2] = (0xFB ^ 0xB3 ^ (0x67 ^ 0x7D)) & (0x1A ^ 0x7F ^ (0x51 ^ 0x66) ^ -1);
        p.lllllllIlIII[3] = 2;
        p.lllllllIlIII[4] = 78 + 175 - 152 + 77 ^ 99 + 27 - 47 + 107;
    }

    private static boolean lIIlIlIlIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIlIIllIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIlIIlIllI() {
        lllllllIIlll = new String[lllllllIlIII[3]];
        p.lllllllIIlll[p.lllllllIlIII[2]] = p."Supervisor Lalo";
        p.lllllllIIlll[p.lllllllIlIII[1]] = p."Talk-to";
    }
}

