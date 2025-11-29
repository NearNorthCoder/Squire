/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

@TaskDesc(name="Using Portal", priority=100, blocking=true)
public class g
extends Task {
    private static /* synthetic */ String[] lIllIIIIllI;
    private static /* synthetic */ int[] lIllIIIlIII;
    private final /* synthetic */ AgilityConfig v;

    private static boolean lIIlIlIlIIlIII(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public g(AgilityConfig agilityConfig) {
        this.v = agilityConfig;
    }

    private static String lIIlIlIlIIIIlI(String llllllllllllllllIlIlIlIIlllIllII, String llllllllllllllllIlIlIlIIlllIlIll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIII[4]), "DES");
            Cipher llllllllllllllllIlIlIlIIllllIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIIllllIIII.init(lIllIIIlIII[2], llllllllllllllllIlIlIlIIllllIIIl);
            return new String(llllllllllllllllIlIlIlIIllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIIlllIllll) {
            llllllllllllllllIlIlIlIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIllII(int n) {
        return n == 0;
    }

    private static boolean lIIlIlIlIIlIll(Object object) {
        return object == null;
    }

    static {
        g.lIIlIlIlIIIlll();
        g.lIIlIlIlIIIIll();
    }

    private static boolean lIIlIlIlIIlIlI(int n) {
        return n != 0;
    }

    private static String lIIlIlIlIIIIIl(String llllllllllllllllIlIlIlIIlllllIIl, String llllllllllllllllIlIlIlIIlllllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIIllllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIIllllllIl.init(lIllIIIlIII[2], llllllllllllllllIlIlIlIIlllllllI);
            return new String(llllllllllllllllIlIlIlIIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIIllllllII) {
            llllllllllllllllIlIlIlIIllllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIIIll() {
        lIllIIIIllI = new String[lIllIIIlIII[3]];
        g.lIllIIIIllI[g.lIllIIIlIII[0]] = g.lIIlIlIlIIIIIl("oF/sGJOM6s0=", "eiOKl");
        g.lIllIIIIllI[g.lIllIIIlIII[1]] = g.lIIlIlIlIIIIlI("8iNr7TNzk3w=", "xZuUY");
        g.lIllIIIIllI[g.lIllIIIlIII[2]] = g.lIIlIlIlIIIIlI("+3IIei2F+mw=", "gBCOo");
    }

    private static boolean lIIlIlIlIIlIIl(Object object) {
        return object != null;
    }

    private static void lIIlIlIlIIIlll() {
        lIllIIIlIII = new int[5];
        g.lIllIIIlIII[0] = (121 + 90 - 138 + 66 ^ 118 + 54 - 134 + 115) & (25 + 113 - 1 + 52 ^ 95 + 140 - 232 + 172 ^ -" ".length());
        g.lIllIIIlIII[1] = " ".length();
        g.lIllIIIlIII[2] = "  ".length();
        g.lIllIIIlIII[3] = "   ".length();
        g.lIllIIIlIII[4] = 0x52 ^ 0x5A;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (g.lIIlIlIlIIlIII((Object)this.v.course(), (Object)b.PRIFDDINAS)) {
            return lIllIIIlIII[0];
        }
        Player llllllllllllllllIlIlIlIlIIIIIllI = Players.getLocal();
        if (!g.lIIlIlIlIIlIIl(llllllllllllllllIlIlIlIlIIIIIllI) || g.lIIlIlIlIIlIlI(llllllllllllllllIlIlIlIlIIIIIllI.isAnimating() ? 1 : 0)) {
            return lIllIIIlIII[0];
        }
        TileObject llllllllllllllllIlIlIlIlIIIIIlIl = TileObjects.getNearest(tileObject -> {
            int n;
            if (g.lIIlIlIlIIlIlI(tileObject.getName().equals(lIllIIIIllI[lIllIIIlIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIlIII[1]];
                stringArray[g.lIllIIIlIII[0]] = lIllIIIIllI[lIllIIIlIII[2]];
                if (g.lIIlIlIlIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIlIII[1];
                    "".length();
                    if ((0xF3 ^ 0x86 ^ (0xF7 ^ 0x86)) >= ((73 + 7 - 47 + 94 ^ (0x11 ^ 0x21)) & (0x1F ^ 0x10 ^ (0xC6 ^ 0x86) ^ -" ".length()))) return n != 0;
                    return ((0x36 ^ 0x23 ^ (0x67 ^ 0x62)) & (0xF1 ^ 0xB4 ^ (0x31 ^ 0x64) ^ -" ".length())) != 0;
                }
            }
            n = lIllIIIlIII[0];
            return n != 0;
        });
        if (g.lIIlIlIlIIlIll(llllllllllllllllIlIlIlIlIIIIIlIl)) {
            return lIllIIIlIII[0];
        }
        if (g.lIIlIlIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIlIII[1];
        }
        var2_2.interact(lIllIIIIllI[lIllIIIlIII[0]]);
        return lIllIIIlIII[1];
    }
}

