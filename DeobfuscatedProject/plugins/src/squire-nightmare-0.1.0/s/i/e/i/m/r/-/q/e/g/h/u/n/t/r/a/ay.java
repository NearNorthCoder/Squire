/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
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
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Avoiding Spores", priority=0x7FFFFFFA, blocking=true)
public class ay
extends A {
    private static /* synthetic */ String[] llllIIIIlIlI;
    private static /* synthetic */ int[] llllIIIIllII;
    private static final /* synthetic */ Logger eC;

    private static void lIIIlllIllIIllI() {
        llllIIIIlIlI = new String[llllIIIIllII[2]];
        ay.llllIIIIlIlI[ay.llllIIIIllII[0]] = ay.lIIIlllIlIlllIl("drqTVJtfPixzvU/oYM37yPuPXMoRJbx+e2Ruv/OxIK4xR6sTiKQgYw==", "tgdCk");
        ay.llllIIIIlIlI[ay.llllIIIIllII[1]] = ay.lIIIlllIlIlllIl("8BAu3+cOdje0c7UNVIbMmJSPCg6pXRi+HHG/g0mBHaS/axiVeqdwSw==", "sEkaP");
    }

    private static boolean lIIIlllIllIlIII(int n2) {
        return n2 > 0;
    }

    @Inject
    protected ay(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    @Override
    public boolean bY() {
        if (ay.lIIIlllIllIlIII(this.cM.ap())) {
            return llllIIIIllII[0];
        }
        NPC lllllllllllllllIIllIIIIIllIIllII = SquireNightmarePlugin.d();
        WorldArea lllllllllllllllIIllIIIIIllIIlIll = lllllllllllllllIIllIIIIIllIIllII.getWorldArea();
        List<WorldArea> lllllllllllllllIIllIIIIIllIIlIlI = e.ax();
        if (ay.lIIIlllIllIlIIl(lllllllllllllllIIllIIIIIllIIlIlI.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        Player lllllllllllllllIIllIIIIIllIIlIIl = Players.getLocal();
        int lllllllllllllllIIllIIIIIllIIlIII = lllllllllllllllIIllIIIIIllIIlIlI.stream().anyMatch(worldArea -> worldArea.contains((Locatable)lllllllllllllllIIllIIIIIllIIlIIl)) ? 1 : 0;
        if (ay.lIIIlllIllIlIIl(lllllllllllllllIIllIIIIIllIIlIII)) {
            ay lllllllllllllllIIllIIIIIllIIllIl;
            WorldPoint lllllllllllllllIIllIIIIIllIIIlll = lllllllllllllllIIllIIIIIllIIllIl.cT.toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];
                    "".length();
                    if (((0x6E ^ 0x5A) & ~(0x13 ^ 0x27)) != 0) {
                        return ((7 ^ 0x55) & ~(0x25 ^ 0x77)) != 0;
                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(lllllllllllllllIIllIIIIIllIIlIll.contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];
                    "".length();
                    if (null != null) {
                        return ((0x58 ^ 0x57) & ~(0x56 ^ 0x59)) != 0;
                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> lllllllllllllllIIllIIIIIllIIlIlI.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> lllllllllllllllIIllIIIIIllIIlIIl.getWorldLocation().distanceTo(worldPoint))).orElse(null);
            if (!ay.lIIIlllIllIlIlI(lllllllllllllllIIllIIIIIllIIIlll) || ay.lIIIlllIllIlIIl(lllllllllllllllIIllIIIIIllIIlIIl.getWorldLocation().equals((Object)lllllllllllllllIIllIIIIIllIIIlll) ? 1 : 0)) {
                Log.info((String)llllIIIIlIlI[llllIIIIllII[0]]);
                return llllIIIIllII[0];
            }
            eC.info(llllIIIIlIlI[llllIIIIllII[1]], (Object)lllllllllllllllIIllIIIIIllIIIlll, (Object)Players.getLocal().getWorldLocation());
            lllllllllllllllIIllIIIIIllIIllIl.j(lllllllllllllllIIllIIIIIllIIIlll);
            "".length();
            return llllIIIIllII[1];
        }
        return llllIIIIllII[0];
    }

    static {
        ay.lIIIlllIllIIlll();
        ay.lIIIlllIllIIllI();
        eC = LoggerFactory.getLogger(ay.class);
    }

    private static void lIIIlllIllIIlll() {
        llllIIIIllII = new int[3];
        ay.llllIIIIllII[0] = (0x35 ^ 0x7F) & ~(0xD5 ^ 0x9F);
        ay.llllIIIIllII[1] = " ".length();
        ay.llllIIIIllII[2] = "  ".length();
    }

    private static String lIIIlllIlIlllIl(String lllllllllllllllIIllIIIIIlIllIlIl, String lllllllllllllllIIllIIIIIlIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIlIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIlIlllIIl.init(llllIIIIllII[2], lllllllllllllllIIllIIIIIlIlllIlI);
            return new String(lllllllllllllllIIllIIIIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIlIlllIII) {
            lllllllllllllllIIllIIIIIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllIlIlI(Object object) {
        return object != null;
    }
}

