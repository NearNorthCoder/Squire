/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="jad fight", priority=10)
public class o
extends Task {
    private final /* synthetic */ f au;
    private static /* synthetic */ int[] llIIIllIllII;
    private final /* synthetic */ n aw;
    private static /* synthetic */ String[] llIIIllIlIlI;
    private final /* synthetic */ SquireFightCavesConfig av;

    private static boolean llllIllIIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIllIIllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIllIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llllIllIIlllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public o(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.au = f2;
        this.av = squireFightCavesConfig;
        this.aw = n2;
    }

    private static String llllIllIIIlIlI(String lllllllllllllllIlIlIIIlllIIlIIll, String lllllllllllllllIlIlIIIlllIIlIIlI) {
        lllllllllllllllIlIlIIIlllIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlllIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIIlllIIlIIII = lllllllllllllllIlIlIIIlllIIlIIlI.toCharArray();
        int lllllllllllllllIlIlIIIlllIIIllll = llIIIllIllII[0];
        char[] lllllllllllllllIlIlIIIlllIIIlIIl = lllllllllllllllIlIlIIIlllIIlIIll.toCharArray();
        int lllllllllllllllIlIlIIIlllIIIlIII = lllllllllllllllIlIlIIIlllIIIlIIl.length;
        int lllllllllllllllIlIlIIIlllIIIIlll = llIIIllIllII[0];
        while (o.llllIllIlIIIII(lllllllllllllllIlIlIIIlllIIIIlll, lllllllllllllllIlIlIIIlllIIIlIII)) {
            char lllllllllllllllIlIlIIIlllIIlIlII = lllllllllllllllIlIlIIIlllIIIlIIl[lllllllllllllllIlIlIIIlllIIIIlll];
            lllllllllllllllIlIlIIIlllIIlIIIl.append((char)(lllllllllllllllIlIlIIIlllIIlIlII ^ lllllllllllllllIlIlIIIlllIIlIIII[lllllllllllllllIlIlIIIlllIIIllll % lllllllllllllllIlIlIIIlllIIlIIII.length]));
            "".length();
            ++lllllllllllllllIlIlIIIlllIIIllll;
            ++lllllllllllllllIlIlIIIlllIIIIlll;
            "".length();
            if (-(0x6B ^ 0x78 ^ (0x92 ^ 0x84)) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIlllIIlIIIl);
    }

    private static boolean llllIllIIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIllIIlIlll(Object object) {
        return object == null;
    }

    private static boolean llllIllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        List lllllllllllllllIlIlIIIlllIlIlIIl;
        WorldPoint lllllllllllllllIlIlIIIlllIlIlIII;
        void lllllllllllllllIlIlIIIlllIlIllIl;
        NPC nPC2 = NPCs.getNearest((int[])c.v);
        if (o.llllIllIIlIlll(nPC2)) {
            return llIIIllIllII[0];
        }
        SquireFightCavesPlugin.f = llIIIllIllII[1];
        NPC lllllllllllllllIlIlIIIlllIlIllII = NPCs.getNearest(arg_0 -> o.a((NPC)lllllllllllllllIlIlIIIlllIlIllIl, arg_0));
        NPC lllllllllllllllIlIlIIIlllIlIlIll = NPCs.getNearest(nPC -> {
            int n2;
            NPC lllllllllllllllIlIlIIIlllIlIIIlI;
            if (!(o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[7]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[8]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[9]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[10]) && !o.llllIllIIllllI(nPC.getId(), llIIIllIllII[7]) || !o.llllIllIIlllII(lllllllllllllllIlIlIIIlllIlIIIlI.isDead() ? 1 : 0) || !o.llllIllIIlllll(lllllllllllllllIlIlIIIlllIlIIIlI.getInteracting(), Players.getLocal()))) {
                n2 = llIIIllIllII[1];
                "".length();
                if ("  ".length() < 0) {
                    return ((0xC5 ^ 0xAF ^ (0x36 ^ 0x17)) & (0x40 ^ 0x3C ^ (0x86 ^ 0xB1) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        });
        if (o.llllIllIIlIlll(lllllllllllllllIlIlIIIlllIlIllII) && o.llllIllIIllIII(lllllllllllllllIlIlIIIlllIlIlIll)) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[0]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            lllllllllllllllIlIlIIIlllIlIlIll.interact(llIIIllIlIlI[llIIIllIllII[1]]);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIlIlll(lllllllllllllllIlIlIIIlllIlIllII) && o.llllIllIIlIlll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[2]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            lllllllllllllllIlIlIIIlllIlIllIl.interact(llIIIllIlIlI[llIIIllIllII[3]]);
            return llIIIllIllII[0];
        }
        List lllllllllllllllIlIlIIIlllIlIlIlI = lllllllllllllllIlIlIIIlllIlIllIl.getWorldArea().toWorldPointList();
        if (o.llllIllIIllIlI(n.c(lllllllllllllllIlIlIIIlllIlIlIlI) ? 1 : 0) && o.llllIllIIllIII(lllllllllllllllIlIlIIIlllIlIlIII = (WorldPoint)(lllllllllllllllIlIlIIIlllIlIlIIl = Players.getLocal().getWorldLocation().createWorldArea(llIIIllIllII[4]).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (o.llllIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && o.llllIllIIlllII(lllllllllllllllIlIlIIIlllIlIlIlI.contains(worldPoint) ? 1 : 0) && o.llllIllIIlllII(n.a(worldPoint) ? 1 : 0)) {
                n2 = llIIIllIllII[1];
                "".length();
                if ("   ".length() == -" ".length()) {
                    return ((0x50 ^ 0x7E) & ~(0x4B ^ 0x65)) != 0;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlIlIIIlllIlIlIII);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIllIII(lllllllllllllllIlIlIIIlllIlIllII) && (!o.llllIllIIllIlI(lllllllllllllllIlIlIIIlllIlIllII.isMoving() ? 1 : 0) || o.llllIllIIllIll(lllllllllllllllIlIlIIIlllIlIllII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIllII[4]))) {
            o lllllllllllllllIlIlIIIlllIlIlllI;
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[5]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && o.llllIllIIlllII(lllllllllllllllIlIlIIIlllIlIlllI.av.avoidDefXp() ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
            }
            lllllllllllllllIlIlIIIlllIlIllII.interact(llIIIllIlIlI[llIIIllIllII[6]]);
            return llIIIllIllII[0];
        }
        return llIIIllIllII[0];
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(NPC nPC, NPC nPC2) {
        int n2;
        NPC lllllllllllllllIlIlIIIlllIIlllll;
        void lllllllllllllllIlIlIIIlllIIllllI;
        if ((!o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[7]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[8]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[9]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[10]) || o.llllIllIIllllI(nPC2.getId(), llIIIllIllII[7])) && o.llllIllIIllIll(lllllllllllllllIlIlIIIlllIIllllI.getWorldLocation().distanceTo(lllllllllllllllIlIlIIIlllIIlllll.getWorldLocation()), llIIIllIllII[11]) && o.llllIllIIlllII(lllllllllllllllIlIlIIIlllIIllllI.isDead() ? 1 : 0) && o.llllIllIIllIIl(lllllllllllllllIlIlIIIlllIIllllI.getInteracting(), Players.getLocal())) {
            n2 = llIIIllIllII[1];
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x55 ^ 0x34) & ~(0x7C ^ 0x1D)) != 0;
            }
        } else {
            n2 = llIIIllIllII[0];
        }
        return n2 != 0;
    }

    private static boolean llllIllIIllIII(Object object) {
        return object != null;
    }

    private static boolean llllIllIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        o.llllIllIIlIllI();
        o.llllIllIIIlIll();
    }

    private static boolean llllIllIIlllll(Object object, Object object2) {
        return object == object2;
    }

    private static void llllIllIIlIllI() {
        llIIIllIllII = new int[13];
        o.llIIIllIllII[0] = (0x9E ^ 0xA3) & ~(0x4A ^ 0x77);
        o.llIIIllIllII[1] = " ".length();
        o.llIIIllIllII[2] = "  ".length();
        o.llIIIllIllII[3] = "   ".length();
        o.llIIIllIllII[4] = 0xD3 ^ 0xB8 ^ (0x27 ^ 0x4A);
        o.llIIIllIllII[5] = 0x10 ^ 0x33 ^ (0x96 ^ 0xB1);
        o.llIIIllIllII[6] = 57 + 19 - 2 + 81 ^ 40 + 141 - 168 + 145;
        o.llIIIllIllII[7] = 0xFFFF8F39 & 0x7CFE;
        o.llIIIllIllII[8] = -(0xFFFFEBE9 & 0x75DF) & (0xFFFFFFFD & 0x7FDF);
        o.llIIIllIllII[9] = 0xFFFFDE19 & 0x3FFF;
        o.llIIIllIllII[10] = -(0xFFFFF53F & 0x5EDD) & (0xFFFFFF9C & 0x7DFF);
        o.llIIIllIllII[11] = 0x40 ^ 0x4F;
        o.llIIIllIllII[12] = 0x87 ^ 0x8F;
    }

    private static void llllIllIIIlIll() {
        llIIIllIlIlI = new String[llIIIllIllII[4]];
        o.llIIIllIlIlI[o.llIIIllIllII[0]] = o.llllIllIIIlIII("V1pqegEiyDqBqiz99OLvFQ==", "pUFNl");
        o.llIIIllIlIlI[o.llIIIllIllII[1]] = o.llllIllIIIlIIl("Q88nago86Yk=", "VmLeM");
        o.llIIIllIlIlI[o.llIIIllIllII[2]] = o.llllIllIIIlIII("dUpTQFwWYNThHDxebHKmag==", "jxfKz");
        o.llIIIllIlIlI[o.llIIIllIllII[3]] = o.llllIllIIIlIII("UvoszjihEn8=", "WXBhX");
        o.llIIIllIlIlI[o.llIIIllIllII[5]] = o.llllIllIIIlIlI("OAMQIg8TVgouABgTEA==", "tvbKa");
        o.llIIIllIlIlI[o.llIIIllIllII[6]] = o.llllIllIIIlIlI("OQUsERAT", "xqXps");
    }

    private static String llllIllIIIlIIl(String lllllllllllllllIlIlIIIllIllIllll, String lllllllllllllllIlIlIIIllIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIllIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIllIlllI.getBytes(StandardCharsets.UTF_8)), llIIIllIllII[12]), "DES");
            Cipher lllllllllllllllIlIlIIIllIlllIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIllIlllIIll.init(llIIIllIllII[2], lllllllllllllllIlIlIIIllIlllIlII);
            return new String(lllllllllllllllIlIlIIIllIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIllIlllIIlI) {
            lllllllllllllllIlIlIIIllIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIllIIIlIII(String lllllllllllllllIlIlIIIllIlllllII, String lllllllllllllllIlIlIIIllIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIlllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIlllIIIIIII.init(llIIIllIllII[2], lllllllllllllllIlIlIIIlllIIIIIIl);
            return new String(lllllllllllllllIlIlIIIlllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIllIlllllll) {
            lllllllllllllllIlIlIIIllIlllllll.printStackTrace();
            return null;
        }
    }
}

