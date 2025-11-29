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

    private static String lllIlIlIllIIIl(String lllllllllllllllIlIlllIllllIlIlll, String lllllllllllllllIlIlllIllllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIllllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIllllIllIIl.init(lIlllIlIIlll[3], lllllllllllllllIlIlllIllllIllIlI);
            return new String(lllllllllllllllIlIlllIllllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIllllIllIII) {
            lllllllllllllllIlIlllIllllIllIII.printStackTrace();
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
        a lllllllllllllllIlIlllIlllllIIIIl;
        if (a.lllIlIlIllIllI(this.p.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIlll(lllllllllllllllIlIlllIlllllIIIIl.q)) {
            lllllllllllllllIlIlllIlllllIIIIl.q -= lIlllIlIIlll[1];
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIllIllI(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray = new String[lIlllIlIIlll[1]];
        stringArray[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[0]];
        NPC lllllllllllllllIlIlllIlllllIIIII = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIlllIlIIlll[1]];
        stringArray2[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[1]];
        NPC lllllllllllllllIlIlllIllllIlllll = NPCs.getNearest((String[])stringArray2);
        if (a.lllIlIlIlllIII(lllllllllllllllIlIlllIlllllIIIII)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIIl(lllllllllllllllIlIlllIllllIlllll)) {
            return lIlllIlIIlll[0];
        }
        if (a.lllIlIlIlllIlI(lllllllllllllllIlIlllIllllIlllll.getAnimation(), lIlllIlIIlll[2])) {
            return lIlllIlIIlll[0];
        }
        String[] stringArray3 = new String[lIlllIlIIlll[1]];
        stringArray3[a.lIlllIlIIlll[0]] = lIlllIlIIllI[lIlllIlIIlll[3]];
        if (a.lllIlIlIllIllI(lllllllllllllllIlIlllIllllIlllll.hasAction(stringArray3) ? 1 : 0)) {
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

    private static String lllIlIlIllIIlI(String lllllllllllllllIlIlllIllllIIlIlI, String lllllllllllllllIlIlllIllllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIIlll[7]), "DES");
            Cipher lllllllllllllllIlIlllIllllIIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIllllIIllII.init(lIlllIlIIlll[3], lllllllllllllllIlIlllIllllIIllIl);
            return new String(lllllllllllllllIlIlllIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIllllIIlIll) {
            lllllllllllllllIlIlllIllllIIlIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlIllIlIl() {
        lIlllIlIIlll = new int[8];
        a.lIlllIlIIlll[0] = (0x56 ^ 0x13 ^ (0x24 ^ 0x3A)) & (0xB7 ^ 0x9F ^ (0xEE ^ 0x9D) ^ -" ".length());
        a.lIlllIlIIlll[1] = " ".length();
        a.lIlllIlIIlll[2] = -(0xFFFFA51B & 0x5FF5) & (0xFFFFEFFD & 0x37DF);
        a.lIlllIlIIlll[3] = "  ".length();
        a.lIlllIlIIlll[4] = -(0x56 ^ 0x77) & (0xFFFFA2FF & 0x7FEE);
        a.lIlllIlIIlll[5] = "   ".length();
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
        a.lIlllIlIIllI[a.lIlllIlIIlll[0]] = a.lllIlIlIllIIIl("vyndD8l5LUU=", "YRPDv");
        a.lIlllIlIIllI[a.lIlllIlIIlll[1]] = a.lllIlIlIllIIlI("3BiZLzez0Q5i4mSsfkwxzTGHbubF2KqZ", "uYrXz");
        a.lIlllIlIIllI[a.lIlllIlIIlll[3]] = a.lllIlIlIllIIll("ABI1Mw==", "CzZCj");
        a.lIlllIlIIllI[a.lIlllIlIIlll[5]] = a.lllIlIlIllIIll("ICMjNQ==", "cKLEL");
    }

    private static String lllIlIlIllIIll(String lllllllllllllllIlIlllIlllIlllIlI, String lllllllllllllllIlIlllIlllIlllIIl) {
        lllllllllllllllIlIlllIlllIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllIlllIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIlllIllIlll = lllllllllllllllIlIlllIlllIlllIIl.toCharArray();
        int lllllllllllllllIlIlllIlllIllIllI = lIlllIlIIlll[0];
        char[] lllllllllllllllIlIlllIlllIllIIII = lllllllllllllllIlIlllIlllIlllIlI.toCharArray();
        int lllllllllllllllIlIlllIlllIlIllll = lllllllllllllllIlIlllIlllIllIIII.length;
        int lllllllllllllllIlIlllIlllIlIlllI = lIlllIlIIlll[0];
        while (a.lllIlIlIlllIll(lllllllllllllllIlIlllIlllIlIlllI, lllllllllllllllIlIlllIlllIlIllll)) {
            char lllllllllllllllIlIlllIlllIlllIll = lllllllllllllllIlIlllIlllIllIIII[lllllllllllllllIlIlllIlllIlIlllI];
            lllllllllllllllIlIlllIlllIlllIII.append((char)(lllllllllllllllIlIlllIlllIlllIll ^ lllllllllllllllIlIlllIlllIllIlll[lllllllllllllllIlIlllIlllIllIllI % lllllllllllllllIlIlllIlllIllIlll.length]));
            "".length();
            ++lllllllllllllllIlIlllIlllIllIllI;
            ++lllllllllllllllIlIlllIlllIlIlllI;
            "".length();
            if (((121 + 116 - 232 + 172 ^ 79 + 30 - 77 + 143) & (0xE5 ^ 0xBD ^ (0x2D ^ 0x6B) ^ -" ".length()) & ("  ".length() & ("  ".length() ^ -" ".length()) ^ -" ".length())) == ("  ".length() & ("  ".length() ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIlllIlllIII);
    }

    private static boolean lllIlIlIlllIII(Object object) {
        return object != null;
    }
}

