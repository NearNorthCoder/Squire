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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Disturb Nightmare", priority=250, blocking=false)
public class ab
extends Task {
    private final /* synthetic */ h dG;
    private static /* synthetic */ String[] llllIIIlllIl;
    private final /* synthetic */ SquireNightmareConfig dF;
    private static /* synthetic */ int[] llllIIIllllI;
    private static final /* synthetic */ Logger dE;

    private static String lIIIllllIlIIlII(String lllllllllllllllIIlIlllllIIlIlIll, String lllllllllllllllIIlIlllllIIlIlIlI) {
        lllllllllllllllIIlIlllllIIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllllIIlIlIIl = new StringBuilder();
        char[] lllllllllllllllIIlIlllllIIlIlIII = lllllllllllllllIIlIlllllIIlIlIlI.toCharArray();
        int lllllllllllllllIIlIlllllIIlIIlll = llllIIIllllI[0];
        char[] lllllllllllllllIIlIlllllIIlIIIIl = lllllllllllllllIIlIlllllIIlIlIll.toCharArray();
        int lllllllllllllllIIlIlllllIIlIIIII = lllllllllllllllIIlIlllllIIlIIIIl.length;
        int lllllllllllllllIIlIlllllIIIlllll = llllIIIllllI[0];
        while (ab.lIIIllllIlIlIlI(lllllllllllllllIIlIlllllIIIlllll, lllllllllllllllIIlIlllllIIlIIIII)) {
            char lllllllllllllllIIlIlllllIIlIllII = lllllllllllllllIIlIlllllIIlIIIIl[lllllllllllllllIIlIlllllIIIlllll];
            lllllllllllllllIIlIlllllIIlIlIIl.append((char)(lllllllllllllllIIlIlllllIIlIllII ^ lllllllllllllllIIlIlllllIIlIlIII[lllllllllllllllIIlIlllllIIlIIlll % lllllllllllllllIIlIlllllIIlIlIII.length]));
            0;
            ++lllllllllllllllIIlIlllllIIlIIlll;
            ++lllllllllllllllIIlIlllllIIIlllll;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllllIIlIlIIl);
    }

    static {
        ab.lIIIllllIlIIllI();
        ab.lIIIllllIlIIlIl();
        dE = LoggerFactory.getLogger(ab.class);
    }

    private static String lIIIllllIlIIIlI(String lllllllllllllllIIlIlllllIIlllIIl, String lllllllllllllllIIlIlllllIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllllIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllllIIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllllIIllllIl.init(llllIIIllllI[2], lllllllllllllllIIlIlllllIIlllllI);
            return new String(lllllllllllllllIIlIlllllIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllllIIllllII) {
            lllllllllllllllIIlIlllllIIllllII.printStackTrace();
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
        ab lllllllllllllllIIlIlllllIlIlIlII;
        if (ab.lIIIllllIlIIlll(this.dF.assistantMode() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        if (ab.lIIIllllIlIlIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        NPC lllllllllllllllIIlIlllllIlIlIIll = SquireNightmarePlugin.d();
        if (ab.lIIIllllIlIlIIl(lllllllllllllllIIlIlllllIlIlIIll)) {
            return llllIIIllllI[0];
        }
        String[] stringArray = new String[llllIIIllllI[1]];
        stringArray[ab.llllIIIllllI[0]] = llllIIIlllIl[llllIIIllllI[0]];
        if (ab.lIIIllllIlIlIII(lllllllllllllllIIlIlllllIlIlIIll.hasAction(stringArray) ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        int lllllllllllllllIIlIlllllIlIlIIlI = SquireNightmarePlugin.b();
        int lllllllllllllllIIlIlllllIlIlIIIl = SquireNightmarePlugin.a();
        int lllllllllllllllIIlIlllllIlIlIIII = SquireNightmarePlugin.c();
        if (ab.lIIIllllIlIlIII(lllllllllllllllIIlIlllllIlIlIIII) && ab.lIIIllllIlIlIII(lllllllllllllllIIlIlllllIlIlIlII.dF.continueWithNoPots() ? 1 : 0)) {
            dE.info(llllIIIlllIl[llllIIIllllI[1]]);
            dE.info(llllIIIlllIl[llllIIIllllI[2]], (Object)lllllllllllllllIIlIlllllIlIlIIII);
            return lllllllllllllllIIlIlllllIlIlIlII.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(lllllllllllllllIIlIlllllIlIlIIIl, lllllllllllllllIIlIlllllIlIlIlII.dF.teleportCleanse())) {
            dE.info(llllIIIlllIl[llllIIIllllI[3]]);
            dE.info(llllIIIlllIl[llllIIIllllI[4]], (Object)lllllllllllllllIIlIlllllIlIlIIIl);
            return lllllllllllllllIIlIlllllIlIlIlII.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(lllllllllllllllIIlIlllllIlIlIIlI, lllllllllllllllIIlIlllllIlIlIlII.dF.minimumFood())) {
            dE.info(llllIIIlllIl[llllIIIllllI[5]]);
            dE.info(llllIIIlllIl[llllIIIllllI[6]], (Object)lllllllllllllllIIlIlllllIlIlIIlI);
            return lllllllllllllllIIlIlllllIlIlIlII.dG.aP();
        }
        var1_1.interact(llllIIIlllIl[llllIIIllllI[7]]);
        this.sleep(llllIIIllllI[8]);
        return llllIIIllllI[1];
    }

    private static String lIIIllllIlIIIll(String lllllllllllllllIIlIlllllIlIIlIII, String lllllllllllllllIIlIlllllIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllllIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIIIllllI[9]), "DES");
            Cipher lllllllllllllllIIlIlllllIlIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllllIlIIlIlI.init(llllIIIllllI[2], lllllllllllllllIIlIlllllIlIIlIll);
            return new String(lllllllllllllllIIlIlllllIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllllIlIIlIIl) {
            lllllllllllllllIIlIlllllIlIIlIIl.printStackTrace();
            return null;
        }
    }
}

