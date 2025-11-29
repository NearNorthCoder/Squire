/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Walking to nightmare", priority=10, blocking=true)
public class aD
extends D {
    private static /* synthetic */ String[] lllIllIlllll;
    private static final /* synthetic */ Logger eL;
    private static /* synthetic */ int[] lllIlllIIIII;

    @Inject
    protected aD(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIllIllIIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIllIIIlll(String lllllllllllllllIIllIIlIlIlllIlIl, String lllllllllllllllIIllIIlIlIllIllll) {
        lllllllllllllllIIllIIlIlIlllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIlllIIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlIlllIIlI = lllllllllllllllIIllIIlIlIllIllll.toCharArray();
        int lllllllllllllllIIllIIlIlIlllIIIl = lllIlllIIIII[0];
        char[] lllllllllllllllIIllIIlIlIllIlIll = lllllllllllllllIIllIIlIlIlllIlIl.toCharArray();
        int lllllllllllllllIIllIIlIlIllIlIlI = lllllllllllllllIIllIIlIlIllIlIll.length;
        int lllllllllllllllIIllIIlIlIllIlIIl = lllIlllIIIII[0];
        while (aD.lIIIllIllIIllIl(lllllllllllllllIIllIIlIlIllIlIIl, lllllllllllllllIIllIIlIlIllIlIlI)) {
            char lllllllllllllllIIllIIlIlIlllIllI = lllllllllllllllIIllIIlIlIllIlIll[lllllllllllllllIIllIIlIlIllIlIIl];
            lllllllllllllllIIllIIlIlIlllIIll.append((char)(lllllllllllllllIIllIIlIlIlllIllI ^ lllllllllllllllIIllIIlIlIlllIIlI[lllllllllllllllIIllIIlIlIlllIIIl % lllllllllllllllIIllIIlIlIlllIIlI.length]));
            "".length();
            ++lllllllllllllllIIllIIlIlIlllIIIl;
            ++lllllllllllllllIIllIIlIlIllIlIIl;
            "".length();
            if (((86 + 149 - 173 + 116 ^ 171 + 135 - 192 + 68) & (99 + 108 - 103 + 52 ^ 139 + 135 - 190 + 68 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIlllIIll);
    }

    private static void lIIIllIllIIlIIl() {
        lllIlllIIIII = new int[4];
        aD.lllIlllIIIII[0] = (0x46 ^ 6) & ~(0x64 ^ 0x24);
        aD.lllIlllIIIII[1] = 0x5B ^ 0x71 ^ (0x89 ^ 0xAF);
        aD.lllIlllIIIII[2] = " ".length();
        aD.lllIlllIIIII[3] = "  ".length();
    }

    private static void lIIIllIllIIlIII() {
        lllIllIlllll = new String[lllIlllIIIII[3]];
        aD.lllIllIlllll[aD.lllIlllIIIII[0]] = aD.lIIIllIllIIIllI("hHlRsWukYTxiNR0Y9vchsTUH4B9ZuT3hDyUs2v07KtyD6hvanUceKv2Kd1aqjGME", "QYrlS");
        aD.lllIllIlllll[aD.lllIlllIIIII[2]] = aD.lIIIllIllIIIlll("CQwAB1U2BU8lHD4LGwYUKwYc", "Ycoku");
    }

    static {
        aD.lIIIllIllIIlIIl();
        aD.lIIIllIllIIlIII();
        eL = LoggerFactory.getLogger(aD.class);
    }

    private static String lIIIllIllIIIllI(String lllllllllllllllIIllIIlIlIlIllllI, String lllllllllllllllIIllIIlIlIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIlIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIlIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIlIllIIIlI.init(lllIlllIIIII[3], lllllllllllllllIIllIIlIlIllIIIll);
            return new String(lllllllllllllllIIllIIlIlIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIlIllIIIIl) {
            lllllllllllllllIIllIIlIlIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        aD lllllllllllllllIIllIIlIllIIIIIlI;
        if (aD.lIIIllIllIIlIlI(this.cW.ae() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(lllllllllllllllIIllIIlIllIIIIIlI.cW.s() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(lllllllllllllllIIllIIlIllIIIIIlI.cW.ad() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        TileObject lllllllllllllllIIllIIlIllIIIIIIl = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllIllIlllll[lllIlllIIIII[2]]));
        Player lllllllllllllllIIllIIlIllIIIIIII = Players.getLocal();
        if (aD.lIIIllIllIIllII(lllllllllllllllIIllIIlIllIIIIIIl) && aD.lIIIllIllIIllIl(lllllllllllllllIIllIIlIllIIIIIII.distanceTo((Locatable)lllllllllllllllIIllIIlIllIIIIIIl), lllIlllIIIII[1])) {
            Log.info((String)lllIllIlllll[lllIlllIIIII[0]]);
            return lllIlllIIIII[0];
        }
        Movement.walkTo((WorldPoint)cU);
        "".length();
        return lllIlllIIIII[2];
    }
}

