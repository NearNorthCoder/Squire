/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j;

@TaskDesc(name="Walking to gate")
public class n
extends j {
    private static /* synthetic */ String[] llIIlIlIllll;
    private static /* synthetic */ int[] llIIlIllIIII;
    private static final /* synthetic */ WorldPoint X;

    private static boolean lllllIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIllIIIIlI(String lllllllllllllllIlIIllllIIIlllIII, String lllllllllllllllIlIIllllIIIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIIIllllII.init(llIIlIllIIII[5], lllllllllllllllIlIIllllIIIllllIl);
            return new String(lllllllllllllllIlIIllllIIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIIIlllIll) {
            lllllllllllllllIlIIllllIIIlllIll.printStackTrace();
            return null;
        }
    }

    private static String lllllIllIIIIIl(String lllllllllllllllIlIIllllIIlIIlIlI, String lllllllllllllllIlIIllllIIlIIlIIl) {
        lllllllllllllllIlIIllllIIlIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIIlIIllIl = new StringBuilder();
        char[] lllllllllllllllIlIIllllIIlIIllII = lllllllllllllllIlIIllllIIlIIlIIl.toCharArray();
        int lllllllllllllllIlIIllllIIlIIlIll = llIIlIllIIII[1];
        char[] lllllllllllllllIlIIllllIIlIIIlIl = lllllllllllllllIlIIllllIIlIIlIlI.toCharArray();
        int lllllllllllllllIlIIllllIIlIIIlII = lllllllllllllllIlIIllllIIlIIIlIl.length;
        int lllllllllllllllIlIIllllIIlIIIIll = llIIlIllIIII[1];
        while (n.lllllIllIIlIII(lllllllllllllllIlIIllllIIlIIIIll, lllllllllllllllIlIIllllIIlIIIlII)) {
            char lllllllllllllllIlIIllllIIlIlIIII = lllllllllllllllIlIIllllIIlIIIlIl[lllllllllllllllIlIIllllIIlIIIIll];
            lllllllllllllllIlIIllllIIlIIllIl.append((char)(lllllllllllllllIlIIllllIIlIlIIII ^ lllllllllllllllIlIIllllIIlIIllII[lllllllllllllllIlIIllllIIlIIlIll % lllllllllllllllIlIIllllIIlIIllII.length]));
            0;
            ++lllllllllllllllIlIIllllIIlIIlIll;
            ++lllllllllllllllIlIIllllIIlIIIIll;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllllIIlIIllIl);
    }

    private static boolean lllllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllIIIlll(Object object) {
        return object != null;
    }

    static {
        n.lllllIllIIIlII();
        n.lllllIllIIIIll();
        X = new WorldPoint(llIIlIllIIII[3], llIIlIllIIII[4], llIIlIllIIII[1]);
    }

    private static void lllllIllIIIIll() {
        llIIlIlIllll = new String[llIIlIllIIII[5]];
        n.llIIlIlIllll[n.llIIlIllIIII[1]] = n."Opening";
        n.llIIlIlIllll[n.llIIlIllIIII[2]] = n."Pass-through";
    }

    private static void lllllIllIIIlII() {
        llIIlIllIIII = new int[6];
        n.llIIlIllIIII[0] = -(0xFFFFF377 & 0x5DCA) & (0xFFFFFF7F & 0x77F7);
        n.llIIlIllIIII[1] = (0x89 ^ 0x8F) & ~(0x7A ^ 0x7C);
        n.llIIlIllIIII[2] = 1;
        n.llIIlIllIIII[3] = 0xFFFFCDCF & 0x3BB3;
        n.llIIlIllIIII[4] = 0xFFFFFFFF & 0xDBF;
        n.llIIlIllIIII[5] = 2;
    }

    @Inject
    public n(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n lllllllllllllllIlIIllllIIlIllIll;
        if (n.lllllIllIIIlIl(Locations.isRegionLoaded((int)llIIlIllIIII[0]) ? 1 : 0)) {
            return llIIlIllIIII[1];
        }
        if (n.lllllIllIIIllI(lllllllllllllllIlIIllllIIlIllIll.J() ? 1 : 0)) {
            return llIIlIllIIII[1];
        }
        String[] stringArray = new String[llIIlIllIIII[2]];
        stringArray[n.llIIlIllIIII[1]] = llIIlIlIllll[llIIlIllIIII[1]];
        TileObject lllllllllllllllIlIIllllIIlIllIlI = TileObjects.getNearest((String[])stringArray);
        if (!n.lllllIllIIIlll(lllllllllllllllIlIIllllIIlIllIlI) || n.lllllIllIIIlIl(Reachable.isInteractable((Locatable)lllllllllllllllIlIIllllIIlIllIlI) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)X);
            0;
            return llIIlIllIIII[2];
        }
        var1_1.interact(llIIlIlIllll[llIIlIllIIII[2]]);
        return llIIlIllIIII[2];
    }

    private static boolean lllllIllIIIllI(int n2) {
        return n2 != 0;
    }
}

