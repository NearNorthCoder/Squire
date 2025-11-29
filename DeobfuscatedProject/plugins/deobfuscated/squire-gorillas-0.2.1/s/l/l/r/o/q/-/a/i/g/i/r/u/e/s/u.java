/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.World
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.World;
import net.unethicalite.api.Locations;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.y;

@TaskDesc(name="Hopping (too busy)", priority=100, blocking=true)
public class u
extends Task {
    private static /* synthetic */ int[] llIIlIllIIlI;
    @Inject
    protected /* synthetic */ y ah;
    private static /* synthetic */ String[] llIIlIllIIIl;

    private static void lllllIllIIlIlI() {
        llIIlIllIIIl = new String[llIIlIllIIlI[3]];
        u.llIIlIllIIIl[u.llIIlIllIIlI[1]] = u."Attack";
    }

    private static boolean lllllIllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllIIllll(int n2) {
        return n2 != 0;
    }

    static {
        u.lllllIllIIlIll();
        u.lllllIllIIlIlI();
    }

    private static boolean lllllIllIIlllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var8_8;
        int lllllllllllllllIlIIllllIIIIllIlI;
        u lllllllllllllllIlIIllllIIIlIIIIl;
        if (u.lllllIllIIllII(Locations.isRegionLoaded((int)llIIlIllIIlI[0]) ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        int lllllllllllllllIlIIllllIIIlIIIII = Players.getAll().size();
        if (u.lllllIllIIllIl(lllllllllllllllIlIIllllIIIlIIIII, llIIlIllIIlI[2])) {
            return llIIlIllIIlI[1];
        }
        if (u.lllllIllIIllII(lllllllllllllllIlIIllllIIIlIIIIl.ah.P().isEmpty() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        NPC lllllllllllllllIlIIllllIIIIlllll = (NPC)Players.getLocal().getInteracting();
        if (u.lllllIllIIlllI(lllllllllllllllIlIIllllIIIIlllll) && u.lllllIllIIllII(lllllllllllllllIlIIllllIIIIlllll.isDead() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        NPC lllllllllllllllIlIIllllIIIIllllI = NPCs.getNearest(nPC -> {
            int n2;
            if (u.lllllIllIlIIlI(nPC.getInteracting(), Players.getLocal()) && u.lllllIllIIllll(nPC.hasAction(llIIlIllIIIl[llIIlIllIIlI[1]]::equals) ? 1 : 0)) {
                n2 = llIIlIllIIlI[3];
                0;
                if (1 <= 0) {
                    return ((1 ^ 0x11 ^ (0x1D ^ 6)) & (0x9B ^ 0xAA ^ (0xFC ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIllIIlI[1];
            }
            return n2 != 0;
        });
        if (u.lllllIllIIlllI(lllllllllllllllIlIIllllIIIIllllI)) {
            return llIIlIllIIlI[1];
        }
        World lllllllllllllllIlIIllllIIIIlllIl = Worlds.getCurrentWorld();
        List lllllllllllllllIlIIllllIIIIlllII = Worlds.getAll(world2 -> {
            int n2;
            if (u.lllllIllIlIIIl(world2.getId(), lllllllllllllllIlIIllllIIIIlllIl.getId()) && u.lllllIllIIllll(world2.isNormal() ? 1 : 0) && u.lllllIllIIllll(world2.isMembers() ? 1 : 0) && u.lllllIllIIllII(world2.isSkillTotal() ? 1 : 0) && u.lllllIllIIllII(world2.isAllPkWorld() ? 1 : 0)) {
                n2 = llIIlIllIIlI[3];
                0;
                if ((1 & ~1) != 0) {
                    return ((0x6A ^ 0x2D) & ~(0x4D ^ 0xA)) != 0;
                }
            } else {
                n2 = llIIlIllIIlI[1];
            }
            return n2 != 0;
        }).stream().sorted(Comparator.comparingInt(World::getPlayerCount)).limit(100L).collect(Collectors.toList());
        if (u.lllllIllIIllll(lllllllllllllllIlIIllllIIIIlllII.isEmpty() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        int lllllllllllllllIlIIllllIIIIllIll = Rand.nextInt((int)llIIlIllIIlI[1], (int)lllllllllllllllIlIIllllIIIIlllII.size());
        World lllllllllllllllIlIIllllIIIIllIIl = (World)lllllllllllllllIlIIllllIIIIlllII.get(Math.min(lllllllllllllllIlIIllllIIIIllIll, lllllllllllllllIlIIllllIIIIllIlI = Rand.nextInt((int)llIIlIllIIlI[1], (int)lllllllllllllllIlIIllllIIIIlllII.size())));
        if (u.lllllIllIlIIII(lllllllllllllllIlIIllllIIIIllIIl)) {
            return llIIlIllIIlI[1];
        }
        Worlds.hopTo((World)var8_8);
        return llIIlIllIIlI[3];
    }

    private static boolean lllllIllIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lllllIllIIlIll() {
        llIIlIllIIlI = new int[6];
        u.llIIlIllIIlI[0] = -(0xFFFFB7BD & 0x5FE7) & (0xFFFFBFFC & 0x77FF);
        u.llIIlIllIIlI[1] = (0x6B ^ 0x59) & ~(0x6C ^ 0x5E);
        u.llIIlIllIIlI[2] = 0x97 ^ 0x93;
        u.llIIlIllIIlI[3] = 1;
        u.llIIlIllIIlI[4] = 0x90 ^ 0xA9 ^ (0x41 ^ 0x70);
        u.llIIlIllIIlI[5] = 2;
    }

    private static boolean lllllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIllIIlIIl(String lllllllllllllllIlIIllllIIIIIlIIl, String lllllllllllllllIlIIllllIIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), llIIlIllIIlI[4]), "DES");
            Cipher lllllllllllllllIlIIllllIIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIIIIIllIl.init(llIIlIllIIlI[5], lllllllllllllllIlIIllllIIIIIlllI);
            return new String(lllllllllllllllIlIIllllIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIIIIIllII) {
            lllllllllllllllIlIIllllIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIllIlIIII(Object object) {
        return object == null;
    }

    private static boolean lllllIllIlIIIl(int n2, int n3) {
        return n2 != n3;
    }
}

