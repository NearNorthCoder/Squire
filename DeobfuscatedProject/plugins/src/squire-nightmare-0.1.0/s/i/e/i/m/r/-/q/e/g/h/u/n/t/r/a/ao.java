/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Cleansing parasite", priority=0x7FFFFFFF, blocking=true, register=true)
public class ao
extends Task {
    private final /* synthetic */ h eh;
    private final /* synthetic */ SquireNightmarePlugin eg;
    private static /* synthetic */ String[] llllIIIlllll;
    private static final /* synthetic */ Logger ef;
    private final /* synthetic */ SquireNightmareConfig ei;
    private static /* synthetic */ int[] llllIIlIIIII;

    private static void lIIIllllIlIlllI() {
        llllIIlIIIII = new int[7];
        ao.llllIIlIIIII[0] = (0xC3 ^ 0x91 ^ (0x65 ^ 5) & ~(0x32 ^ 0x52)) & (133 + 87 - 146 + 157 ^ 35 + 122 - 8 + 32 ^ -" ".length());
        ao.llllIIlIIIII[1] = -(0xFFFF9E51 & 0x69EF) & (0xFFFFBFE7 & 0x6FFF);
        ao.llllIIlIIIII[2] = " ".length();
        ao.llllIIlIIIII[3] = "  ".length();
        ao.llllIIlIIIII[4] = "   ".length();
        ao.llllIIlIIIII[5] = 0xDF ^ 0xA7 ^ (0x2E ^ 0x52);
        ao.llllIIlIIIII[6] = 13 + 25 - 30 + 175 ^ 132 + 65 - 175 + 156;
    }

    static {
        ao.lIIIllllIlIlllI();
        ao.lIIIllllIlIllIl();
        ef = LoggerFactory.getLogger(ao.class);
    }

    private static boolean lIIIllllIlIllll(int n2) {
        return n2 == 0;
    }

    private static String lIIIllllIlIlIll(String lllllllllllllllIIlIlllllIIIIIIII, String lllllllllllllllIIlIlllllIIIIIlII) {
        lllllllllllllllIIlIlllllIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllllIIIIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIlllllIIIIIIlI = lllllllllllllllIIlIlllllIIIIIlII.toCharArray();
        int lllllllllllllllIIlIlllllIIIIIIIl = llllIIlIIIII[0];
        char[] lllllllllllllllIIlIllllIlllllIll = lllllllllllllllIIlIlllllIIIIIIII.toCharArray();
        int lllllllllllllllIIlIllllIlllllIlI = lllllllllllllllIIlIllllIlllllIll.length;
        int lllllllllllllllIIlIllllIlllllIIl = llllIIlIIIII[0];
        while (ao.lIIIllllIllIIlI(lllllllllllllllIIlIllllIlllllIIl, lllllllllllllllIIlIllllIlllllIlI)) {
            char lllllllllllllllIIlIlllllIIIIIllI = lllllllllllllllIIlIllllIlllllIll[lllllllllllllllIIlIllllIlllllIIl];
            lllllllllllllllIIlIlllllIIIIIIll.append((char)(lllllllllllllllIIlIlllllIIIIIllI ^ lllllllllllllllIIlIlllllIIIIIIlI[lllllllllllllllIIlIlllllIIIIIIIl % lllllllllllllllIIlIlllllIIIIIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIlllllIIIIIIIl;
            ++lllllllllllllllIIlIllllIlllllIIl;
            "".length();
            if (-(0xA1 ^ 0xA5) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllllIIIIIIll);
    }

    private static void lIIIllllIlIllIl() {
        llllIIIlllll = new String[llllIIlIIIII[6]];
        ao.llllIIIlllll[ao.llllIIlIIIII[0]] = ao.lIIIllllIlIlIll("EQAxCiQsCzNPJjYKdwAyLE44CWc7GyUKNHZOFgM0N04ZAGcrDzkJIi9OMQAyNgp3Bil4BzkZIjYaOB0+eAElTyg2TiMHIngJJQAyNgp7TzM9AjIfKCoaPgEgeAEiGw==", "XnWoG");
        ao.llllIIIlllll[ao.llllIIlIIIII[2]] = ao.lIIIllllIlIlIll("IR0AGD4=", "eoivU");
        ao.llllIIIlllll[ao.llllIIlIIIII[3]] = ao.lIIIllllIlIllII("c8RBO3xQHiNYzTCb7Ed8/v09DFCfbjB8", "cTzqQ");
        ao.llllIIIlllll[ao.llllIIlIIIII[4]] = ao.lIIIllllIlIllII("nc32kxFQK9g=", "VvbvT");
        ao.llllIIIlllll[ao.llllIIlIIIII[5]] = ao.lIIIllllIlIllII("EHgaOH7tuOE=", "BRdGD");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ao lllllllllllllllIIlIlllllIIIlIIIl;
        if (ao.lIIIllllIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIllIIII(lllllllllllllllIIlIlllllIIIlIIIl.eg.aq() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIlIllll(Static.getClient().getVarbitValue(llllIIlIIIII[1]))) {
            return llllIIlIIIII[0];
        }
        Item lllllllllllllllIIlIlllllIIIlIIII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[5]]));
        if (ao.lIIIllllIllIIIl(lllllllllllllllIIlIlllllIIIlIIII)) {
            lllllllllllllllIIlIlllllIIIlIIII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[4]]));
        }
        if (ao.lIIIllllIllIIIl(lllllllllllllllIIlIlllllIIIlIIII)) {
            Log.info((String)llllIIIlllll[llllIIlIIIII[0]]);
            return lllllllllllllllIIlIlllllIIIlIIIl.eg.m();
        }
        var1_1.interact(llllIIIlllll[llllIIlIIIII[2]]);
        ef.info(llllIIIlllll[llllIIlIIIII[3]]);
        this.sleep(llllIIlIIIII[4]);
        this.eg.p(llllIIlIIIII[0]);
        return llllIIlIIIII[2];
    }

    private static boolean lIIIllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllllIlIllII(String lllllllllllllllIIlIllllIlllIlllI, String lllllllllllllllIIlIllllIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIllllIIlI.init(llllIIlIIIII[3], lllllllllllllllIIlIllllIllllIIll);
            return new String(lllllllllllllllIIlIllllIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIllllIIIl) {
            lllllllllllllllIIlIllllIllllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public ao(SquireNightmarePlugin squireNightmarePlugin, h h2, SquireNightmareConfig squireNightmareConfig) {
        this.eg = squireNightmarePlugin;
        this.eh = h2;
        this.ei = squireNightmareConfig;
    }

    private static boolean lIIIllllIllIIII(int n2) {
        return n2 != 0;
    }
}

