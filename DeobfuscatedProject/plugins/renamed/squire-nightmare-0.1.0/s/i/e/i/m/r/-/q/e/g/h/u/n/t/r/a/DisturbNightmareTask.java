/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

/* TASK: Disturb Nightmare -> DisturbnightmareTask */
@TaskDesc(name="Disturb Nightmare", priority=250, blocking=false)
public class DisturbNightmareTask
extends Task {
    private final /* synthetic */ h dG;
    private static /* synthetic */ String[] llllIIIlllIl;
    private final /* synthetic */ SquireNightmareConfig dF;
    private static /* synthetic */ int[] llllIIIllllI;
    private static final /* synthetic */ Logger dE;

    private static String lIIIllllIlIIlII(String var12, String var22) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var16 = var22.toCharArray();
        int var6 = llllIIIllllI[0];
        char[] var13 = var12.toCharArray();
        int var24 = var13.length;
        int var4 = llllIIIllllI[0];
        while (ab.lIIIllllIlIlIlI(var4, var24)) {
            char var20 = var13[var4];
            var7.append((char)(var20 ^ var16[var6 % var16.length]));
            0;
            ++var6;
            ++var4;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        ab.lIIIllllIlIIllI();
        ab.lIIIllllIlIIlIl();
        dE = LoggerFactory.getLogger(DisturbNightmareTask.class);
    }

    private static String lIIIllllIlIIIlI(String var18, String var5) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(llllIIIllllI[2], var3);
            return new String(var21.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIlIlIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public ab(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dF = squireNightmareConfig;
        this.dG = h2;
    }

    private static boolean lIIIllllIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllllIlIIlIl() {
        llllIIIlllIl = new String[llllIIIllllI[9]];
        ab.llllIIIlllIl[ab.llllIIIllllI[0]] = ab."Disturb";
        ab.llllIIIlllIl[ab.llllIIIllllI[1]] = ab."[DisturbNightmare]: No combat potions";
        ab.llllIIIlllIl[ab.llllIIIllllI[2]] = ab."[DisturbNightmare]: Combat potions: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[3]] = ab."[DisturbNightmare]: Not enough cleanse doses";
        ab.llllIIIlllIl[ab.llllIIIllllI[4]] = ab."[DisturbNightmare]:  Cleanse doses: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[5]] = ab."[DisturbNightmare]: Not enough food";
        ab.llllIIIlllIl[ab.llllIIIllllI[6]] = ab."[DisturbNightmare]: Food: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[7]] = ab."Disturb";
    }

    private static boolean lIIIllllIlIlIIl(Object object) {
        return object == null;
    }

    private static void lIIIllllIlIIllI() {
        llllIIIllllI = new int[10];
        ab.llllIIIllllI[0] = (0x1F ^ 0x42) & ~(0x2D ^ 0x70);
        ab.llllIIIllllI[1] = 1;
        ab.llllIIIllllI[2] = 2;
        ab.llllIIIllllI[3] = 3;
        ab.llllIIIllllI[4] = 50 + 129 - 27 + 11 ^ 86 + 151 - 226 + 156;
        ab.llllIIIllllI[5] = 0x9B ^ 0x9E;
        ab.llllIIIllllI[6] = 107 + 36 - 49 + 35 ^ 5 + 49 - -63 + 18;
        ab.llllIIIllllI[7] = 0xBE ^ 0x8E ^ (0x47 ^ 0x70);
        ab.llllIIIllllI[8] = 0x11 ^ 3;
        ab.llllIIIllllI[9] = 135 + 95 - 82 + 16 ^ 62 + 26 - -34 + 50;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ab var2;
        if (ab.lIIIllllIlIIlll(this.dF.assistantMode() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        if (ab.lIIIllllIlIlIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        NPC var11 = SquireNightmarePlugin.d();
        if (ab.lIIIllllIlIlIIl(var11)) {
            return llllIIIllllI[0];
        }
        String[] stringArray = new String[llllIIIllllI[1]];
        stringArray[ab.llllIIIllllI[0]] = llllIIIlllIl[llllIIIllllI[0]];
        if (ab.lIIIllllIlIlIII(var11.hasAction(stringArray) ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        int var23 = SquireNightmarePlugin.b();
        int var1 = SquireNightmarePlugin.a();
        int var19 = SquireNightmarePlugin.c();
        if (ab.lIIIllllIlIlIII(var19) && ab.lIIIllllIlIlIII(var2.dF.continueWithNoPots() ? 1 : 0)) {
            dE.info(llllIIIlllIl[llllIIIllllI[1]]);
            dE.info(llllIIIlllIl[llllIIIllllI[2]], (Object)var19);
            return var2.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(var1, var2.dF.teleportCleanse())) {
            dE.info(llllIIIlllIl[llllIIIllllI[3]]);
            dE.info(llllIIIlllIl[llllIIIllllI[4]], (Object)var1);
            return var2.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(var23, var2.dF.minimumFood())) {
            dE.info(llllIIIlllIl[llllIIIllllI[5]]);
            dE.info(llllIIIlllIl[llllIIIllllI[6]], (Object)var23);
            return var2.dG.aP();
        }
        var1_1.interact(llllIIIlllIl[llllIIIllllI[7]]);
        this.sleep(llllIIIllllI[8]);
        return llllIIIllllI[1];
    }

    private static String lIIIllllIlIIIll(String var15, String var17) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llllIIIllllI[9]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIIIllllI[2], var9);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

