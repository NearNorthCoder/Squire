/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking Demiboss", priority=3, blocking=true)
public class G
extends n {
    private static /* synthetic */ int[] llIIlIllllII;
    private static /* synthetic */ String[] llIIlIlllIll;
    private final /* synthetic */ b bT;

    private static boolean llllllIIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static /* synthetic */ int a(Player player, l l2) {
        return l2.aW().distanceTo((Locatable)player);
    }

    private static boolean llllllIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llllllIIIlIIll(Object object) {
        return object != null;
    }

    @Inject
    public G(b b2, c c2) {
        d[] dArray = new d[llIIlIllllII[0]];
        dArray[G.llIIlIllllII[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bT = b2;
    }

    private static String llllllIIIIlIlI(String lllllllllllllllIlIIllIIIIIlIlllI, String lllllllllllllllIlIIllIIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIIIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIIIIllIIlI.init(llIIlIllllII[3], lllllllllllllllIlIIllIIIIIllIIll);
            return new String(lllllllllllllllIlIIllIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIIIllIIIl) {
            lllllllllllllllIlIIllIIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static void llllllIIIIllII() {
        llIIlIllllII = new int[8];
        G.llIIlIllllII[0] = " ".length();
        G.llIIlIllllII[1] = (0x38 ^ 7) & ~(2 ^ 0x3D);
        G.llIIlIllllII[2] = 0xDE ^ 0xA2 ^ (0xEB ^ 0x9B);
        G.llIIlIllllII[3] = "  ".length();
        G.llIIlIllllII[4] = "   ".length();
        G.llIIlIllllII[5] = 0x95 ^ 0x87 ^ (0x7D ^ 0x6B);
        G.llIIlIllllII[6] = 9 + 29 - 12 + 110 ^ 98 + 126 - 193 + 110;
        G.llIIlIllllII[7] = 0x75 ^ 0x7D;
    }

    private static boolean llllllIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(NPC nPC, Player player, l l2) {
        int n2;
        if (G.llllllIIIIllll(l2.aY() ? 1 : 0) && G.llllllIIIlIlII(l2.aW().distanceTo(nPC.getWorldLocation()), nPC.getWorldLocation().distanceTo((Locatable)player))) {
            n2 = llIIlIllllII[0];
            "".length();
            if ("   ".length() == 0) {
                return ((0x23 ^ 0x77) & ~(0x28 ^ 0x7C)) != 0;
            }
        } else {
            n2 = llIIlIllllII[1];
        }
        return n2 != 0;
    }

    private static void llllllIIIIlIll() {
        llIIlIlllIll = new String[llIIlIllllII[6]];
        G.llIIlIlllIll[G.llIIlIllllII[1]] = G.llllllIIIIlIII("w6G88Z6d7vzLdTICdeE3ptfjqFD5tJqUt5buKk2TBYYQeyJaI0x76GzOSsZK445m", "DXVnV");
        G.llIIlIlllIll[G.llIIlIllllII[0]] = G.llllllIIIIlIIl("EjUNLy0sM1kzK2IgGDUjJyBZKTQheFkzJTAzHDNkMDsWKmQrJ1khKzc6HWdpYi8E", "BTyGD");
        G.llIIlIlllIll[G.llIIlIllllII[3]] = G.llllllIIIIlIIl("MQxRMQ5GBxk3Sw8HAiYZBwoCKgUBSQEqHw5JFy0SEgEfLQxKSRc3HwcKHSoFAUkYMwhI", "fivCk");
        G.llIIlIlllIll[G.llIIlIllllII[4]] = G.llllllIIIIlIII("r4+c+Q5mLrQ=", "ELdVy");
        G.llIIlIlllIll[G.llIIlIllllII[5]] = G.llllllIIIIlIlI("Xr5DdWKMC46o7lm5CEVSQCe4Pm9ePewjomT3Xwso+hdbDzv0pACiTw==", "ENCub");
    }

    private static boolean llllllIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        G.llllllIIIIllII();
        G.llllllIIIIlIll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void lllllllllllllllIlIIllIIIIllIlllI;
        G lllllllllllllllIlIIllIIIIllIllll;
        Player player = Players.getLocal();
        if (G.llllllIIIIllIl(player)) {
            return llIIlIllllII[1];
        }
        g lllllllllllllllIlIIllIIIIllIllIl = lllllllllllllllIlIIllIIIIllIllll.ba.J();
        if (G.llllllIIIIllIl((Object)lllllllllllllllIlIIllIIIIllIllIl)) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIlllI(Inventory.getCount((boolean)llIIlIllllII[0], (int[])lllllllllllllllIlIIllIIIIllIllIl.an().aB()))) {
            return llIIlIllllII[1];
        }
        NPC lllllllllllllllIlIIllIIIIllIllII = NPCs.getNearest((int[])lllllllllllllllIlIIllIIIIllIllIl.ah());
        if (G.llllllIIIIllIl(lllllllllllllllIlIIllIIIIllIllII) && G.llllllIIIIllIl(lllllllllllllllIlIIllIIIIllIllII = NPCs.getNearest(nPC -> {
            boolean bl;
            if (!G.llllllIIIlIIIl(g.DRAGON.f((NPC)nPC) ? 1 : 0) || G.llllllIIIIllll(g.DARK_BEAST.f((NPC)nPC) ? 1 : 0)) {
                bl = llIIlIllllII[0];
                "".length();
                if ("  ".length() == 0) {
                    return ((0x37 ^ 0x31) & ~(0xC3 ^ 0xC5)) != 0;
                }
            } else {
                bl = llIIlIllllII[1];
            }
            return bl;
        }))) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIllll(lllllllllllllllIlIIllIIIIllIllII.isDead() ? 1 : 0)) {
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIII(lllllllllllllllIlIIllIIIIllIllII.distanceTo((Locatable)lllllllllllllllIlIIllIIIIllIlllI), llIIlIllllII[2])) {
            h lllllllllllllllIlIIllIIIIllIlIll = lllllllllllllllIlIIllIIIIllIllll.ba.V();
            l lllllllllllllllIlIIllIIIIllIlIlI = lllllllllllllllIlIIllIIIIllIlIll.d(lllllllllllllllIlIIllIIIIllIllII.getWorldLocation());
            if (G.llllllIIIIllIl(lllllllllllllllIlIIllIIIIllIlIlI)) {
                NPC lllllllllllllllIlIIllIIIIllIlIIl = lllllllllllllllIlIIllIIIIllIllII;
                l lllllllllllllllIlIIllIIIIllIlIII = lllllllllllllllIlIIllIIIIllIlIll.b(arg_0 -> G.a(lllllllllllllllIlIIllIIIIllIlIIl, (Player)lllllllllllllllIlIIllIIIIllIlllI, arg_0)).stream().min(Comparator.comparingInt(arg_0 -> G.a((Player)lllllllllllllllIlIIllIIIIllIlllI, arg_0))).orElse(null);
                if (G.llllllIIIIllIl(lllllllllllllllIlIIllIIIIllIlIII)) {
                    return llIIlIllllII[1];
                }
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = lllllllllllllllIlIIllIIIIllIllII.distanceTo((Locatable)lllllllllllllllIlIIllIIIIllIlllI);
                Log.info((String)llIIlIlllIll[llIIlIllllII[1]], (Object[])objectArray);
                lllllllllllllllIlIIllIIIIllIllll.ba.a(lllllllllllllllIlIIllIIIIllIlIII, Players.getLocal().getWorldLocation());
                "".length();
                "".length();
                if (-(121 + 73 - 134 + 98 ^ 133 + 135 - 127 + 14) >= 0) {
                    return ((0x38 ^ 5 ^ (0x4E ^ 0x76)) & (84 + 123 - 76 + 18 ^ 3 + 49 - 3 + 95 ^ -" ".length())) != 0;
                }
            } else {
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = lllllllllllllllIlIIllIIIIllIllII.distanceTo((Locatable)lllllllllllllllIlIIllIIIIllIlllI);
                Log.info((String)llIIlIlllIll[llIIlIllllII[0]], (Object[])objectArray);
                lllllllllllllllIlIIllIIIIllIllll.ba.a(lllllllllllllllIlIIllIIIIllIlIll.d(lllllllllllllllIlIIllIIIIllIllII.getWorldLocation()), Players.getLocal().getWorldLocation());
                "".length();
            }
            return llIIlIllllII[0];
        }
        Actor lllllllllllllllIlIIllIIIIllIlIll = lllllllllllllllIlIIllIIIIllIlllI.getInteracting();
        if (G.llllllIIIIllIl(lllllllllllllllIlIIllIIIIllIlIll) && G.llllllIIIlIIIl(lllllllllllllllIlIIllIIIIllIllll.bT.p() ? 1 : 0)) {
            Log.info((String)llIIlIlllIll[llIIlIllllII[3]]);
            lllllllllllllllIlIIllIIIIllIllII.interact(llIIlIlllIll[llIIlIllllII[4]]);
            lllllllllllllllIlIIllIIIIllIllll.bT.c(llIIlIllllII[5]);
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIlI(lllllllllllllllIlIIllIIIIllIlIll, lllllllllllllllIlIIllIIIIllIllII)) {
            l lllllllllllllllIlIIllIIIIllIlIlI = lllllllllllllllIlIIllIIIIllIllll.ba.V().d(lllllllllllllllIlIIllIIIIllIlIll.getWorldLocation());
            WorldPoint lllllllllllllllIlIIllIIIIllIlIIl = null;
            int lllllllllllllllIlIIllIIIIllIlIII = Integer.MIN_VALUE;
            ScenePoint lllllllllllllllIlIIllIIIIllIIlll = lllllllllllllllIlIIllIIIIllIlIlI.aR().toWorldPointList().iterator();
            while (G.llllllIIIIllll(lllllllllllllllIlIIllIIIIllIIlll.hasNext() ? 1 : 0)) {
                WorldPoint lllllllllllllllIlIIllIIIIllIIllI = (WorldPoint)lllllllllllllllIlIIllIIIIllIIlll.next();
                int lllllllllllllllIlIIllIIIIllIIlIl = lllllllllllllllIlIIllIIIIllIIllI.distanceTo(lllllllllllllllIlIIllIIIIllIllll.ba.V().aq().aQ());
                if (G.llllllIIIlIIII(lllllllllllllllIlIIllIIIIllIIlIl, lllllllllllllllIlIIllIIIIllIlIII) && G.llllllIIIlIIIl(Reachable.isObstacle((WorldPoint)lllllllllllllllIlIIllIIIIllIIllI) ? 1 : 0) && G.llllllIIIIllll(lllllllllllllllIlIIllIIIIllIIllI.toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), lllllllllllllllIlIIllIIIIllIlIll.getWorldArea()) ? 1 : 0)) {
                    lllllllllllllllIlIIllIIIIllIlIII = lllllllllllllllIlIIllIIIIllIIlIl;
                    lllllllllllllllIlIIllIIIIllIlIIl = lllllllllllllllIlIIllIIIIllIIllI;
                }
                "".length();
                if ("   ".length() < (75 + 139 - 195 + 157 ^ 44 + 144 - 103 + 95)) continue;
                return ((0x31 ^ 0x2C ^ (0x13 ^ 0x44)) & (105 + 87 - 49 + 0 ^ 81 + 181 - 140 + 75 ^ -" ".length())) != 0;
            }
            if (G.llllllIIIlIIll(lllllllllllllllIlIIllIIIIllIlIIl) && G.llllllIIIlIIII(lllllllllllllllIlIIllIIIIllIlllI.getWorldLocation().distanceTo(lllllllllllllllIlIIllIIIIllIlIIl), llIIlIllllII[4])) {
                Log.info((String)llIIlIlllIll[llIIlIllllII[5]]);
                lllllllllllllllIlIIllIIIIllIIlll = ScenePoint.fromWorld(lllllllllllllllIlIIllIIIIllIlIIl);
                Movement.setDestination((int)lllllllllllllllIlIIllIIIIllIIlll.getX(), (int)lllllllllllllllIlIIllIIIIllIIlll.getY());
                lllllllllllllllIlIIllIIIIllIllll.bT.e(Rand.nextInt((int)llIIlIllllII[3], (int)llIIlIllllII[5]));
            }
        }
        return llIIlIllllII[0];
    }

    private static String llllllIIIIlIII(String lllllllllllllllIlIIllIIIIIlllIll, String lllllllllllllllIlIIllIIIIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), llIIlIllllII[7]), "DES");
            Cipher lllllllllllllllIlIIllIIIIIllllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIIIllllll.init(llIIlIllllII[3], lllllllllllllllIlIIllIIIIlIIIIII);
            return new String(lllllllllllllllIlIIllIIIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIIIlllllI) {
            lllllllllllllllIlIIllIIIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static String llllllIIIIlIIl(String lllllllllllllllIlIIllIIIIlIlIIlI, String lllllllllllllllIlIIllIIIIlIlIIIl) {
        lllllllllllllllIlIIllIIIIlIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIIlIlIIII = new StringBuilder();
        char[] lllllllllllllllIlIIllIIIIlIIllll = lllllllllllllllIlIIllIIIIlIlIIIl.toCharArray();
        int lllllllllllllllIlIIllIIIIlIIlllI = llIIlIllllII[1];
        char[] lllllllllllllllIlIIllIIIIlIIlIII = lllllllllllllllIlIIllIIIIlIlIIlI.toCharArray();
        int lllllllllllllllIlIIllIIIIlIIIlll = lllllllllllllllIlIIllIIIIlIIlIII.length;
        int lllllllllllllllIlIIllIIIIlIIIllI = llIIlIllllII[1];
        while (G.llllllIIIlIlII(lllllllllllllllIlIIllIIIIlIIIllI, lllllllllllllllIlIIllIIIIlIIIlll)) {
            char lllllllllllllllIlIIllIIIIlIlIIll = lllllllllllllllIlIIllIIIIlIIlIII[lllllllllllllllIlIIllIIIIlIIIllI];
            lllllllllllllllIlIIllIIIIlIlIIII.append((char)(lllllllllllllllIlIIllIIIIlIlIIll ^ lllllllllllllllIlIIllIIIIlIIllll[lllllllllllllllIlIIllIIIIlIIlllI % lllllllllllllllIlIIllIIIIlIIllll.length]));
            "".length();
            ++lllllllllllllllIlIIllIIIIlIIlllI;
            ++lllllllllllllllIlIIllIIIIlIIIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIIIIlIlIIII);
    }
}

