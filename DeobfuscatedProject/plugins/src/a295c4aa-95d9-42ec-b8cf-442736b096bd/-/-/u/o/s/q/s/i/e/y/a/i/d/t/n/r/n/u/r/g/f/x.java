/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pouring crucible", priority=200)
public class x
extends j {
    private static final /* synthetic */ int ar;
    private static final /* synthetic */ WorldPoint as;
    private static /* synthetic */ int[] llIlIlIlllII;
    private static /* synthetic */ String[] llIlIlIllIll;

    private static boolean lIIIIIllIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public x(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    static {
        x.lIIIIIllIlIlIll();
        x.lIIIIIllIlIlIlI();
        ar = llIlIlIlllII[1];
        as = new WorldPoint(llIlIlIlllII[4], llIlIlIlllII[5], llIlIlIlllII[0]);
    }

    private static void lIIIIIllIlIlIll() {
        llIlIlIlllII = new int[7];
        x.llIlIlIlllII[0] = (0xC6 ^ 0x87) & ~(0x6D ^ 0x2C);
        x.llIlIlIlllII[1] = 0xFFFFF759 & 0x3EFF;
        x.llIlIlIlllII[2] = " ".length();
        x.llIlIlIlllII[3] = -(0xFFFFF9BB & 0x1757) & (0xFFFFBFFB & 0xFFFE);
        x.llIlIlIlllII[4] = -(0xFFFF92CD & 0x7FF7) & (0xFFFF9FFF & 0x7FED);
        x.llIlIlIlllII[5] = -(0x92 ^ 0x8F) & (0xFFFFBCFF & 0x6FFD);
        x.llIlIlIlllII[6] = "  ".length();
    }

    private static boolean lIIIIIllIlIllII(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIllIlIlIlI() {
        llIlIlIllIll = new String[llIlIlIlllII[6]];
        x.llIlIlIllIll[x.llIlIlIlllII[0]] = x.lIIIIIllIlIlIIl("5VhRSOwvdZE=", "LDZOn");
        x.llIlIlIllIll[x.llIlIlIlllII[2]] = x.lIIIIIllIlIlIIl("r4ofreIwRy8=", "yfENI");
    }

    private static boolean lIIIIIllIlIllIl(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIllIlIlIIl(String lllllllllllllllIlIIIIlIIlIIIIIll, String lllllllllllllllIlIIIIlIIlIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIIlIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIlIIIIlIl.init(llIlIlIlllII[6], lllllllllllllllIlIIIIlIIlIIIIllI);
            return new String(lllllllllllllllIlIIIIlIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIlIIlIIIIlII) {
            lllllllllllllllIlIIIIlIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        if (x.lIIIIIllIlIllII(this.T.g() ? 1 : 0)) {
            return llIlIlIlllII[0];
        }
        if (x.lIIIIIllIlIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIlIlIlllII[0];
        }
        if (x.lIIIIIllIlIllIl(Vars.getBit((int)llIlIlIlllII[1])) && x.lIIIIIllIlIllII(Players.getLocal().getWorldLocation().equals((Object)as) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)as);
            return llIlIlIlllII[2];
        }
        TileObject lllllllllllllllIlIIIIlIIlIIIllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIIIllIlIllll(tileObject.getId(), llIlIlIlllII[3])) {
                String[] stringArray = new String[llIlIlIlllII[2]];
                stringArray[x.llIlIlIlllII[0]] = llIlIlIllIll[llIlIlIlllII[2]];
                if (x.lIIIIIllIlIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIlIlllII[2];
                    "".length();
                    if (-" ".length() < "  ".length()) return n2 != 0;
                    return ((28 + 108 - 31 + 74 ^ 126 + 65 - 190 + 140) & (0x1F ^ 0x7D ^ (0x11 ^ 0x4D) ^ -" ".length())) != 0;
                }
            }
            n2 = llIlIlIlllII[0];
            return n2 != 0;
        });
        if (x.lIIIIIllIlIlllI(lllllllllllllllIlIIIIlIIlIIIllIl)) {
            return llIlIlIlllII[0];
        }
        var1_1.interact(llIlIlIllIll[llIlIlIlllII[0]]);
        return llIlIlIlllII[2];
    }

    private static boolean lIIIIIllIlIlllI(Object object) {
        return object == null;
    }
}

