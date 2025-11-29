/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Configure Party", priority=0x7FFFFF99, blocking=true)
public class av
extends az {
    private final /* synthetic */ SquireChambersConfig du;
    private static /* synthetic */ String[] lIIlllllllII;
    private final /* synthetic */ SquireChambersPlugin dt;
    private static /* synthetic */ int[] lIIlllllllIl;

    private static boolean llIlIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static String llIlIIlIllllII(String lllllllllllllllIlllIIlllIlllIIll, String lllllllllllllllIlllIIlllIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllIl[6]), "DES");
            Cipher lllllllllllllllIlllIIlllIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlllIlIl.init(lIIlllllllIl[2], lllllllllllllllIlllIIlllIlllIllI);
            return new String(lllllllllllllllIlllIIlllIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIlllIlII) {
            lllllllllllllllIlllIIlllIlllIlII.printStackTrace();
            return null;
        }
    }

    static {
        av.llIlIIlIlllllI();
        av.llIlIIlIllllIl();
    }

    private static void llIlIIlIllllIl() {
        lIIlllllllII = new String[lIIlllllllIl[5]];
        av.lIIlllllllII[av.lIIlllllllIl[0]] = av.llIlIIlIlllIlI("a/Zif+pkmGCuw97lbLnyNX3byCWscSVE", "qLiDP");
        av.lIIlllllllII[av.lIIlllllllIl[1]] = av.llIlIIlIlllIlI("edQ0Kj2GC7O1ns9O0J8mtm1atRmtbnBYG05NdRd/aS49+O0Z1ZtO0w==", "GHXji");
        av.lIIlllllllII[av.lIIlllllllIl[2]] = av.llIlIIlIlllIll("ICwbLjM=", "eBoKA");
        av.lIIlllllllII[av.lIIlllllllIl[3]] = av.llIlIIlIllllII("2nZGMlvatLzyxhYhe4vdGiGsBfuQfMCb", "vYOBE");
        av.lIIlllllllII[av.lIIlllllllIl[4]] = av.llIlIIlIlllIll("HBQQEDc=", "YzduE");
    }

    private static String llIlIIlIlllIlI(String lllllllllllllllIlllIIlllIllllllI, String lllllllllllllllIlllIIlllIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllllIIIIIlI.init(lIIlllllllIl[2], lllllllllllllllIlllIIllllIIIIIll);
            return new String(lllllllllllllllIlllIIllllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllllIIIIIIl) {
            lllllllllllllllIlllIIllllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIlllllI() {
        lIIlllllllIl = new int[7];
        av.lIIlllllllIl[0] = (0xB3 ^ 0x83 ^ (0x71 ^ 0x1D)) & (0x60 ^ 0x7E ^ (0xE8 ^ 0xAA) ^ -" ".length());
        av.lIIlllllllIl[1] = " ".length();
        av.lIIlllllllIl[2] = "  ".length();
        av.lIIlllllllIl[3] = "   ".length();
        av.lIIlllllllIl[4] = 7 ^ 3;
        av.lIIlllllllIl[5] = 114 + 85 - 178 + 118 ^ 108 + 97 - 125 + 62;
        av.lIIlllllllIl[6] = 0x3D ^ 0x31 ^ (0x69 ^ 0x6D);
    }

    private static boolean llIlIIllIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if (av.llIlIIlIllllll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Bank.isPinWindowOpen() ? 1 : 0)) {
            System.out.println(lIIlllllllII[lIIlllllllIl[0]]);
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.isViewingOptions() ? 1 : 0) && av.llIlIIllIIIIII(Dialog.hasOption((String)lIIlllllllII[lIIlllllllIl[1]]) ? 1 : 0)) {
            Game.logout();
            return lIIlllllllIl[1];
        }
        TileObject lllllllllllllllIlllIIllllIlIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (av.llIlIIllIIIIII(tileObject.getName().equals(lIIlllllllII[lIIlllllllIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllllIl[1]];
                stringArray[av.lIIlllllllIl[0]] = lIIlllllllII[lIIlllllllIl[4]];
                if (av.llIlIIllIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllllllIl[1];
                    "".length();
                    if ((0xFB ^ 0x93 ^ (0xCA ^ 0xA6)) != "   ".length()) return n2 != 0;
                    return ((105 + 39 - 70 + 60 ^ 68 + 123 - 183 + 128) & (9 ^ 0x1F ^ (0x73 ^ 0x6B) ^ -" ".length())) != 0;
                }
            }
            n2 = lIIlllllllIl[0];
            return n2 != 0;
        });
        if (av.llIlIIllIIIIIl(lllllllllllllllIlllIIllllIlIIIlI)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        var1_1.interact(lIIlllllllII[lIIlllllllIl[2]]);
        return lIIlllllllIl[1];
    }

    private static boolean llIlIIllIIIIII(int n2) {
        return n2 != 0;
    }

    private static String llIlIIlIlllIll(String lllllllllllllllIlllIIllllIIlIlIl, String lllllllllllllllIlllIIllllIIIllll) {
        lllllllllllllllIlllIIllllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllllIIlIIll = new StringBuilder();
        char[] lllllllllllllllIlllIIllllIIlIIlI = lllllllllllllllIlllIIllllIIIllll.toCharArray();
        int lllllllllllllllIlllIIllllIIlIIIl = lIIlllllllIl[0];
        char[] lllllllllllllllIlllIIllllIIIlIll = lllllllllllllllIlllIIllllIIlIlIl.toCharArray();
        int lllllllllllllllIlllIIllllIIIlIlI = lllllllllllllllIlllIIllllIIIlIll.length;
        int lllllllllllllllIlllIIllllIIIlIIl = lIIlllllllIl[0];
        while (av.llIlIIllIIIIlI(lllllllllllllllIlllIIllllIIIlIIl, lllllllllllllllIlllIIllllIIIlIlI)) {
            char lllllllllllllllIlllIIllllIIlIllI = lllllllllllllllIlllIIllllIIIlIll[lllllllllllllllIlllIIllllIIIlIIl];
            lllllllllllllllIlllIIllllIIlIIll.append((char)(lllllllllllllllIlllIIllllIIlIllI ^ lllllllllllllllIlllIIllllIIlIIlI[lllllllllllllllIlllIIllllIIlIIIl % lllllllllllllllIlllIIllllIIlIIlI.length]));
            "".length();
            ++lllllllllllllllIlllIIllllIIlIIIl;
            ++lllllllllllllllIlllIIllllIIIlIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIllllIIlIIll);
    }

    @Inject
    public av(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dt = squireChambersPlugin;
        this.du = squireChambersConfig;
    }
}

