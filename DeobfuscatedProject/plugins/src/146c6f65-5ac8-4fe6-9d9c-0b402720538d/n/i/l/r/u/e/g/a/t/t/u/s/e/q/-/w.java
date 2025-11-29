/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering boss room", priority=1)
public class w
extends n {
    private static /* synthetic */ int[] llIIlIlllIIl;
    private static /* synthetic */ String[] llIIlIlllIII;

    static {
        w.lllllIlllllllI();
        w.lllllIllllllIl();
    }

    private static boolean llllllIIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object != null;
    }

    private static void lllllIlllllllI() {
        llIIlIlllIIl = new int[7];
        w.llIIlIlllIIl[0] = " ".length();
        w.llIIlIlllIIl[1] = (173 + 108 - 63 + 21 ^ 32 + 146 - 98 + 102) & (174 + 70 - 72 + 56 ^ 171 + 17 - 21 + 22 ^ -" ".length());
        w.llIIlIlllIIl[2] = -(0xFFFFE1AF & 0x3ED9) & (0xFFFFFFDE & 0x7DEB);
        w.llIIlIlllIIl[3] = 0x3E ^ 0x73 ^ (0x28 ^ 0x60);
        w.llIIlIlllIIl[4] = "  ".length();
        w.llIIlIlllIIl[5] = "   ".length();
        w.llIIlIlllIIl[6] = 34 + 134 - 75 + 45 ^ 35 + 60 - -10 + 25;
    }

    @Inject
    public w(c c2) {
        d[] dArray = new d[llIIlIlllIIl[0]];
        dArray[w.llIIlIlllIIl[1]] = d.AFK;
        super(c2, dArray);
    }

    private static boolean lllllIllllllll(int n2) {
        return n2 == 0;
    }

    private static String lllllIlllllIll(String lllllllllllllllIlIIllIIIlIIlllll, String lllllllllllllllIlIIllIIIlIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIlllII.getBytes(StandardCharsets.UTF_8)), llIIlIlllIIl[6]), "DES");
            Cipher lllllllllllllllIlIIllIIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIlIlIIIIl.init(llIIlIlllIIl[4], lllllllllllllllIlIIllIIIlIlIIIlI);
            return new String(lllllllllllllllIlIIllIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIlIlIIIII) {
            lllllllllllllllIlIIllIIIlIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object == null;
    }

    private static void lllllIllllllIl() {
        llIIlIlllIII = new String[llIIlIlllIIl[5]];
        w.llIIlIlllIII[w.llIIlIlllIIl[1]] = w.lllllIlllllIlI("NRMDCipJAxIANQ==", "dfjiA");
        w.llIIlIlllIII[w.llIIlIlllIIl[0]] = w.lllllIlllllIll("uy+f14Ify0NSFGYHH56/1y/Fw3PveAhMA3k6wpJLKnsAwPJXNX+s8+67qpJCnqZTuyOWWEQKk28=", "wOJan");
        w.llIIlIlllIII[w.llIIlIlllIIl[4]] = w.lllllIllllllII("4yrKiRdWM+A4vkV3AJlEyg==", "pcrxR");
    }

    private static boolean llllllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIllllllII(String lllllllllllllllIlIIllIIIlIIlIIlI, String lllllllllllllllIlIIllIIIlIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIIlIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIIlIIlIlII.init(llIIlIlllIIl[4], lllllllllllllllIlIIllIIIlIIlIlIl);
            return new String(lllllllllllllllIlIIllIIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIlIIlIIll) {
            lllllllllllllllIlIIllIIIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lllllIlllllIlI(String lllllllllllllllIlIIllIIIlIllIlII, String lllllllllllllllIlIIllIIIlIllIIll) {
        lllllllllllllllIlIIllIIIlIllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIlIllIIlI = new StringBuilder();
        char[] lllllllllllllllIlIIllIIIlIllIIIl = lllllllllllllllIlIIllIIIlIllIIll.toCharArray();
        int lllllllllllllllIlIIllIIIlIllIIII = llIIlIlllIIl[1];
        char[] lllllllllllllllIlIIllIIIlIlIlIlI = lllllllllllllllIlIIllIIIlIllIlII.toCharArray();
        int lllllllllllllllIlIIllIIIlIlIlIIl = lllllllllllllllIlIIllIIIlIlIlIlI.length;
        int lllllllllllllllIlIIllIIIlIlIlIII = llIIlIlllIIl[1];
        while (w.llllllIIIIIlII(lllllllllllllllIlIIllIIIlIlIlIII, lllllllllllllllIlIIllIIIlIlIlIIl)) {
            char lllllllllllllllIlIIllIIIlIllIlIl = lllllllllllllllIlIIllIIIlIlIlIlI[lllllllllllllllIlIIllIIIlIlIlIII];
            lllllllllllllllIlIIllIIIlIllIIlI.append((char)(lllllllllllllllIlIIllIIIlIllIlIl ^ lllllllllllllllIlIIllIIIlIllIIIl[lllllllllllllllIlIIllIIIlIllIIII % lllllllllllllllIlIIllIIIlIllIIIl.length]));
            "".length();
            ++lllllllllllllllIlIIllIIIlIllIIII;
            ++lllllllllllllllIlIIllIIIlIlIlIII;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIIIlIllIIlI);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_3;
        w lllllllllllllllIlIIllIIIllIIIIll;
        if (w.lllllIllllllll(this.ba.h().enterBossRoom() ? 1 : 0)) {
            return llIIlIlllIIl[1];
        }
        int[] nArray = new int[llIIlIlllIIl[0]];
        nArray[w.llIIlIlllIIl[1]] = llIIlIlllIIl[2];
        int lllllllllllllllIlIIllIIIllIIIIlI = Inventory.getCount((int[])nArray);
        if (w.llllllIIIIIIII(lllllllllllllllIlIIllIIIllIIIIlI, lllllllllllllllIlIIllIIIllIIIIll.ba.h().abortFishAmount())) {
            TileObject lllllllllllllllIlIIllIIIllIIIIIl = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (w.llllllIIIIIIIl(lllllllllllllllIlIIllIIIllIIIIIl)) {
                return llIIlIlllIIl[1];
            }
            lllllllllllllllIlIIllIIIllIIIIIl.interact(llIIlIlllIII[llIIlIlllIIl[1]]);
            return llIIlIlllIIl[0];
        }
        TileObject lllllllllllllllIlIIllIIIllIIIIIl = TileObjects.getNearest(tileObject -> e.aF.contains(tileObject.getId()));
        if (w.llllllIIIIIIIl(lllllllllllllllIlIIllIIIllIIIIIl)) {
            return llIIlIlllIIl[1];
        }
        NPC lllllllllllllllIlIIllIIIllIIIIII = lllllllllllllllIlIIllIIIllIIIIll.ba.X().aI();
        if (!w.llllllIIIIIIlI(lllllllllllllllIlIIllIIIllIIIIII) || w.llllllIIIIIIll(lllllllllllllllIlIIllIIIllIIIIIl.distanceTo((Locatable)Players.getLocal()), llIIlIlllIIl[3])) {
            ScenePoint lllllllllllllllIlIIllIIIlIllllll = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIllIIIllIIIIIl.getWorldLocation());
            Movement.setDestination((int)lllllllllllllllIlIIllIIIlIllllll.getX(), (int)lllllllllllllllIlIIllIIIlIllllll.getY());
            return llIIlIlllIIl[0];
        }
        if (w.llllllIIIIIIII(lllllllllllllllIlIIllIIIllIIIIII.getWorldArea().distanceTo(lllllllllllllllIlIIllIIIllIIIIIl.getWorldLocation()), llIIlIlllIIl[0])) {
            Log.info((String)llIIlIlllIII[llIIlIlllIIl[0]]);
            return llIIlIlllIIl[0];
        }
        var2_3.interact(llIIlIlllIII[llIIlIlllIIl[4]]);
        return llIIlIlllIIl[0];
    }
}

