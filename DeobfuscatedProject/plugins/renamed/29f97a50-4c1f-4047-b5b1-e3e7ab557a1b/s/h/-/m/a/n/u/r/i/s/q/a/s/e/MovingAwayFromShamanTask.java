/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a_Unknown;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.GEnum;

/* TASK: Moving away from Shaman -> MovingawayfromshamanTask */
@TaskDesc(name="Moving away from Shaman", priority=55, blocking=true)
public class MovingAwayFromShamanTask
extends Task {
    private final /* synthetic */ SquireShamanConfig as;
    private final /* synthetic */ a ar;
    private static /* synthetic */ int[] lIIllIIIIlllI;
    private final /* synthetic */ c aq;
    private static /* synthetic */ String[] lIIllIIIIlIll;

    private static boolean lIlIlllIllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIlllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIllIlllI(Object object) {
        return object != null;
    }

    private static String lIlIlllIllIIlll(String var20, String var12) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var21 = var12.toCharArray();
        int var3 = lIIllIIIIlllI[0];
        char[] var9 = var20.toCharArray();
        int var6 = var9.length;
        int var5 = lIIllIIIIlllI[0];
        while (u.lIlIlllIlllIlII(var5, var6)) {
            char var13 = var9[var5];
            var15.append((char)(var13 ^ var21[var3 % var21.length]));
            0;
            ++var3;
            ++var5;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIlIlllIllIllIl(int n2) {
        return n2 == 0;
    }

    static {
        u.lIlIlllIllIlIll();
        u.lIlIlllIllIlIlI();
    }

    private static boolean lIlIlllIllIllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public u(c c2, a a2, SquireShamanConfig squireShamanConfig) {
        this.aq = c2;
        this.ar = a2;
        this.as = squireShamanConfig;
    }

    private static void lIlIlllIllIlIll() {
        lIIllIIIIlllI = new int[6];
        u.lIIllIIIIlllI[0] = (140 + 23 - 143 + 161 ^ 134 + 90 - 178 + 104) & (0x72 ^ 1 ^ (0x21 ^ 0x71) ^ -1);
        u.lIIllIIIIlllI[1] = 2;
        u.lIIllIIIIlllI[2] = 1;
        u.lIIllIIIIlllI[3] = 3;
        u.lIIllIIIIlllI[4] = 0x25 ^ 0x21;
        u.lIIllIIIIlllI[5] = 0x89 ^ 0x81;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_7;
        u var16;
        List list = NPCs.getAll(nPC -> nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[3]]));
        if (!u.lIlIlllIllIllII(this.aq.s() ? 1 : 0) || u.lIlIlllIllIllIl(list.isEmpty() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        if (u.lIlIlllIllIllII(var16.ar.m() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        Player var1 = Players.getLocal();
        TileItem var8 = var16.ar.k().orElse(null);
        NPC var18 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (u.lIlIlllIllIllII(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.lIlIlllIllIllII(nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[1]]) ? 1 : 0)) {
                n2 = lIIllIIIIlllI[2];
                0;
                if (2 == 0) {
                    return ((0x36 ^ 0x6B ^ (0x51 ^ 5)) & (0x7F ^ 0x61 ^ (0x9E ^ 0x89) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIIIIlllI[0];
            }
            return n2 != 0;
        });
        if (u.lIlIlllIllIlllI(var8)) {
            var18 = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (u.lIlIlllIllIllII(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.lIlIlllIllIllII(nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[2]]) ? 1 : 0) && u.lIlIlllIlllIIIl(nPC.getInteracting(), var1)) {
                    n2 = lIIllIIIIlllI[2];
                    0;
                    if (3 < 0) {
                        return ((0xAF ^ 0x9D) & ~(0x74 ^ 0x46) & ~((0x85 ^ 0xB2) & ~(0xB1 ^ 0x86))) != 0;
                    }
                } else {
                    n2 = lIIllIIIIlllI[0];
                }
                return n2 != 0;
            });
        }
        if (u.lIlIlllIllIllll(var18)) {
            return lIIllIIIIlllI[0];
        }
        NPC var4 = var18;
        if (u.lIlIlllIlllIIII(var4.distanceTo((Locatable)Players.getLocal()), lIIllIIIIlllI[1])) {
            return lIIllIIIIlllI[0];
        }
        g var19 = var16.as.room();
        Stream stream = var19.z().stream();
        c c2 = var16.aq;
        Objects.requireNonNull(c2);
        0;
        WorldPoint var7 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            String[] stringArray = new String[lIIllIIIIlllI[2]];
            stringArray[u.lIIllIIIIlllI[0]] = lIIllIIIIlIll[lIIllIIIIlllI[0]];
            if (u.lIlIlllIlllIIII(worldPoint.distanceTo((Locatable)NPCs.getNearest((WorldPoint)worldPoint, (String[])stringArray)), lIIllIIIIlllI[1])) {
                bl = lIIllIIIIlllI[2];
                0;
                if ((0x5C ^ 0x58) < 0) {
                    return false;
                }
            } else {
                bl = lIIllIIIIlllI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (u.lIlIlllIllIllll(var7)) {
            return lIIllIIIIlllI[0];
        }
        Movement.walkTo((WorldPoint)var7_7, (boolean)lIIllIIIIlllI[0]);
        0;
        return lIIllIIIIlllI[2];
    }

    private static String lIlIlllIllIIIll(String var10, String var2) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlllI[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIllIIIIlllI[1], var17);
            return new String(var14.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlllIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlllIllIlIlI() {
        lIIllIIIIlIll = new String[lIIllIIIIlllI[4]];
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[0]] = u."Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[2]] = u."Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[1]] = u."Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[3]] = u."Spawn";
    }

    private static boolean lIlIlllIlllIIII(int n2, int n3) {
        return n2 > n3;
    }
}

