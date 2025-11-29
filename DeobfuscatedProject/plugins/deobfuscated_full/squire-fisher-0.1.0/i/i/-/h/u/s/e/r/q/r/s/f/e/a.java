/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Chopping Tentacle -> ChoppingtentacleTask */
@TaskDesc(name="Chopping Tentacle")
public class a
extends Task {
    private static /* synthetic */ int[] lIlllIlIIlll;
    private /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllIlIIllI;
    private static final /* synthetic */ Logger o;
    private final /* synthetic */ SquireFisherConfig p;

    private static boolean lllIlIlIllIllI(int n) {
        return n == 0;
    }

    private static String lllIlIlIllIIIl(String var14, String var13) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlllIlIIlll[3], var8);
            return new String(var16.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        a var22;
        if (a.lllIlIlIllIllI(this.p.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIlll(var22.q)) {
            var22.q -= lIlllIlIIlll[1];
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIllI(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray = new String[lIlllIlIIlll[1]];
        stringArray[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[0]];
        NPC var1 = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIlllIlIIlll[1]];
        stringArray2[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[1]];
        NPC var11 = NPCs.getNearest((String[])stringArray2);
        if (a.lllIlIlIlllIII(var1)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIIl(var11)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIlI(var11.getAnimation(), lIlllIlIIlll[2])) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray3 = new String[lIlllIlIIlll[1]];
        stringArray3[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[3]];
        if (a.lllIlIlIllIllI(var11.hasAction(stringArray3) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIlI(Players.getLocal().getAnimation(), lIlllIlIIlll[4])) {
            return lIlllIlIIlll[0];
        }
        var2_2.interact(lIlllIlIIllI[lIlllIlIIlll[5]]);
        return lIlllIlIIlll[1];
    }

    private static boolean lllIlIlIlllIlI(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIlIlIlllIll(int n, int n2) {
        return n < n2;
    }

    private static String lllIlIlIllIIlI(String var15, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlllIlIIlll[7]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlllIlIIlll[3], var6);
            return new String(var7.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlIllIlIl() {
        lIlllIlIIlll = new int[8];
        a.lIlllIlIIlll[0] = (0x56 ^ 0x13 ^ (0x24 ^ 0x3A)) & (0xB7 ^ 0x9F ^ (0xEE ^ 0x9D) ^ -1);
        a.lIlllIlIIlll[1] = 1;
        a.lIlllIlIIlll[2] = -(0xFFFFA51B & 0x5FF5) & (0xFFFFEFFD & 0x37DF);
        a.lIlllIlIIlll[3] = 2;
        a.lIlllIlIIlll[4] = -(0x56 ^ 0x77) & (0xFFFFA2FF & 0x7FEE);
        a.lIlllIlIIlll[5] = 3;
        a.lIlllIlIIlll[6] = 0x2F ^ 0x2B;
        a.lIlllIlIIlll[7] = 0x3B ^ 0x33;
    }

    static {
        a.lllIlIlIllIlIl();
        a.lllIlIlIllIlII();
        o = LoggerFactory.getLogger(a.class);
    }

    @Inject
    public a(SquireFisherConfig squireFisherConfig) {
        this.p = squireFisherConfig;
    }

    private static boolean lllIlIlIllIlll(int n) {
        return n >= 0;
    }

    private static void lllIlIlIllIlII() {
        lIlllIlIIllI = new String[lIlllIlIIlll[6]];
        a.lIlllIlIIllI[a.lIlllIlIIlll[0]] = a."Murphy";
        a.lIlllIlIIllI[a.lIlllIlIIlll[1]] = a."Enormous Tentacle";
        a.lIlllIlIIllI[a.lIlllIlIIlll[3]] = a."Chop";
        a.lIlllIlIIllI[a.lIlllIlIIlll[5]] = a."Chop";
    }

    private static String lllIlIlIllIIll(String var20, String var10) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var19 = var10.toCharArray();
        int var12 = lIlllIlIIlll[0];
        char[] var4 = var20.toCharArray();
        int var21 = var4.length;
        int var18 = lIlllIlIIlll[0];
        while (a.lllIlIlIlllIll(var18, var21)) {
            char var17 = var4[var18];
            var2.append((char)(var17 ^ var19[var12 % var19.length]));
            0;
            ++var12;
            ++var18;
            0;
            if (((121 + 116 - 232 + 172 ^ 79 + 30 - 77 + 143) & (0xE5 ^ 0xBD ^ (0x2D ^ 0x6B) ^ -1) & (2 & (2 ^ -1) ^ -1)) == (2 & (2 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lllIlIlIlllIII(Object object) {
        return object != null;
    }
}

