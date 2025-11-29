/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Getting Killcount", priority=5)
public class y
extends Task {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ g au;
    private final /* synthetic */ SquireSaraConfig av;
    private static /* synthetic */ int[] lIIlIlIIIllll;
    private static /* synthetic */ String[] lIIlIlIIIlllI;
    private static final /* synthetic */ WorldPoint at;

    private static String lIlIlIllIIlllll(String llllllllllllllIlllllIIIIllIIIIIl, String llllllllllllllIlllllIIIIllIIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIllll[9]), "DES");
            Cipher llllllllllllllIlllllIIIIllIIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIIllIIIlIl.init(lIIlIlIIIllll[2], llllllllllllllIlllllIIIIllIIIllI);
            return new String(llllllllllllllIlllllIIIIllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIIllIIIlII) {
            llllllllllllllIlllllIIIIllIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public y(g g2, SquireSaraConfig squireSaraConfig) {
        this.au = g2;
        this.av = squireSaraConfig;
        this.aw = Static.getClient();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        List<String> list;
        y llllllllllllllIlllllIIIIllIlIlII;
        if (y.lIlIlIllIlIIlII(this.au.s() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(llllllllllllllIlllllIIIIllIlIlII.au.m() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIllI(llllllllllllllIlllllIIIIllIlIlII.au.q(), llllllllllllllIlllllIIIIllIlIlII.au.r())) {
            return lIIlIlIIIllll[0];
        }
        Player llllllllllllllIlllllIIIIllIlIIll = Players.getLocal();
        if (y.lIlIlIllIlIIlll(llllllllllllllIlllllIIIIllIlIIll.getInteracting())) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(llllllllllllllIlllllIIIIllIlIlII.av.kcSpirituals() ? 1 : 0)) {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[0]], lIIlIlIIIlllI[lIIlIlIIIllll[1]]);
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((0xED ^ 0xC1) & ~(0x46 ^ 0x6A)) != 0;
            }
        } else {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[2]]);
        }
        List<String> llllllllllllllIlllllIIIIllIlIIlI = list;
        NPC llllllllllllllIlllllIIIIllIlIIIl = NPCs.getNearest(nPC -> {
            int n2;
            if (y.lIlIlIllIlIIlII(nPC.isDead() ? 1 : 0) && y.lIlIlIllIlIIlIl(llllllllllllllIlllllIIIIllIlIIlI.contains(nPC.getName()) ? 1 : 0)) {
                n2 = lIIlIlIIIllll[1];
                "".length();
                if ((0x28 ^ 0x2C) != (0x36 ^ 0x32)) {
                    return ((0x83 ^ 0xAE) & ~(0x8E ^ 0xA3)) != 0;
                }
            } else {
                n2 = lIIlIlIIIllll[0];
            }
            return n2 != 0;
        });
        if (y.lIlIlIllIlIlIII(llllllllllllllIlllllIIIIllIlIIll.distanceTo(at), lIIlIlIIIllll[3])) {
            Movement.walkTo((WorldPoint)at);
            "".length();
            return lIIlIlIIIllll[1];
        }
        if (y.lIlIlIllIlIlIIl(llllllllllllllIlllllIIIIllIlIIIl)) {
            if (y.lIlIlIllIlIlIlI(Players.getLocal().distanceTo(at), lIIlIlIIIllll[4])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (y.lIlIlIllIlIIlIl(world.isMembers() ? 1 : 0) && y.lIlIlIllIlIIlIl(world.isNormal() ? 1 : 0)) {
                        n2 = lIIlIlIIIllll[1];
                        "".length();
                        if ((0x65 ^ 0x60) == 0) {
                            return ((0x62 ^ 0x57) & ~(0xA8 ^ 0x9D)) != 0;
                        }
                    } else {
                        n2 = lIIlIlIIIllll[0];
                    }
                    return n2 != 0;
                }));
                llllllllllllllIlllllIIIIllIlIlII.sleep(lIIlIlIIIllll[5]);
                return lIIlIlIIIllll[1];
            }
            return lIIlIlIIIllll[0];
        }
        var3_3.interact(lIIlIlIIIlllI[lIIlIlIIIllll[6]]);
        this.sleep(lIIlIlIIIllll[2]);
        return lIIlIlIIIllll[1];
    }

    private static boolean lIlIlIllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIllIlIIIll() {
        lIIlIlIIIllll = new int[10];
        y.lIIlIlIIIllll[0] = (0x5F ^ 0x78) & ~(0x74 ^ 0x53);
        y.lIIlIlIIIllll[1] = " ".length();
        y.lIIlIlIIIllll[2] = "  ".length();
        y.lIIlIlIIIllll[3] = 0x71 ^ 0x5E ^ (0x61 ^ 0x48);
        y.lIIlIlIIIllll[4] = 40 + 46 - -2 + 63 ^ 126 + 53 - 57 + 35;
        y.lIIlIlIIIllll[5] = 0xB9 ^ 0xB6 ^ (0x44 ^ 0x4F);
        y.lIIlIlIIIllll[6] = "   ".length();
        y.lIIlIlIIIllll[7] = -(0x81 ^ 0x86) & (0xFFFFDBDF & 0x2F7F);
        y.lIIlIlIIIllll[8] = -(0xFFFF8735 & 0x7ACB) & (0xFFFF9EFD & 0x77B7);
        y.lIIlIlIIIllll[9] = 0xCC ^ 0xC4;
    }

    private static boolean lIlIlIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIllIlIIIIl(String llllllllllllllIlllllIIIIlIllIllI, String llllllllllllllIlllllIIIIlIllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIIlIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIIlIlllIII.init(lIIlIlIIIllll[2], llllllllllllllIlllllIIIIlIlllIIl);
            return new String(llllllllllllllIlllllIIIIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIIlIllIlll) {
            llllllllllllllIlllllIIIIlIllIlll.printStackTrace();
            return null;
        }
    }

    static {
        y.lIlIlIllIlIIIll();
        y.lIlIlIllIlIIIlI();
        at = new WorldPoint(lIIlIlIIIllll[7], lIIlIlIIIllll[8], lIIlIlIIIllll[2]);
    }

    private static String lIlIlIllIlIIIII(String llllllllllllllIlllllIIIIlIlIIllI, String llllllllllllllIlllllIIIIlIlIIIII) {
        llllllllllllllIlllllIIIIlIlIIllI = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIIIlIlIIlII = new StringBuilder();
        char[] llllllllllllllIlllllIIIIlIlIIIll = llllllllllllllIlllllIIIIlIlIIIII.toCharArray();
        int llllllllllllllIlllllIIIIlIlIIIlI = lIIlIlIIIllll[0];
        char[] llllllllllllllIlllllIIIIlIIlllII = llllllllllllllIlllllIIIIlIlIIllI.toCharArray();
        int llllllllllllllIlllllIIIIlIIllIll = llllllllllllllIlllllIIIIlIIlllII.length;
        int llllllllllllllIlllllIIIIlIIllIlI = lIIlIlIIIllll[0];
        while (y.lIlIlIllIlIlIll(llllllllllllllIlllllIIIIlIIllIlI, llllllllllllllIlllllIIIIlIIllIll)) {
            char llllllllllllllIlllllIIIIlIlIIlll = llllllllllllllIlllllIIIIlIIlllII[llllllllllllllIlllllIIIIlIIllIlI];
            llllllllllllllIlllllIIIIlIlIIlII.append((char)(llllllllllllllIlllllIIIIlIlIIlll ^ llllllllllllllIlllllIIIIlIlIIIll[llllllllllllllIlllllIIIIlIlIIIlI % llllllllllllllIlllllIIIIlIlIIIll.length]));
            "".length();
            ++llllllllllllllIlllllIIIIlIlIIIlI;
            ++llllllllllllllIlllllIIIIlIIllIlI;
            "".length();
            if ("  ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllIIIIlIlIIlII);
    }

    private static void lIlIlIllIlIIIlI() {
        lIIlIlIIIlllI = new String[lIIlIlIIIllll[5]];
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[0]] = y.lIlIlIllIIlllll("kZe1mIF8BcEbVjnkMaR/IgbNiNY34Qwq", "zPPcS");
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[1]] = y.lIlIlIllIlIIIII("MgAxPRoVBTkjUwwRPyo=", "apXOs");
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[2]] = y.lIlIlIllIlIIIIl("ePcex2wcAVKfubvsojr6vixNsFrnZKF5", "PIKDb");
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[6]] = y.lIlIlIllIlIIIII("BgE4Lw8s", "GuLNl");
    }

    private static boolean lIlIlIllIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

