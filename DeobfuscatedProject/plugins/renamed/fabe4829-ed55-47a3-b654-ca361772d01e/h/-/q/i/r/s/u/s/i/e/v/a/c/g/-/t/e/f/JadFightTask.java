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
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n_Unknown;
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

/* TASK: jad fight -> JadfightTask */
@TaskDesc(name="jad fight", priority=10)
public class JadFightTask
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

    private static String llllIllIIIlIlI(String var9, String var4) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var4.toCharArray();
        int var17 = llIIIllIllII[0];
        char[] var7 = var9.toCharArray();
        int var29 = var7.length;
        int var22 = llIIIllIllII[0];
        while (o.llllIllIlIIIII(var22, var29)) {
            char var26 = var7[var22];
            var3.append((char)(var26 ^ var2[var17 % var2.length]));
            0;
            ++var17;
            ++var22;
            0;
            if (-(0x6B ^ 0x78 ^ (0x92 ^ 0x84)) < 0) continue;
            return null;
        }
        return String.valueOf(var3);
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
        List var21;
        WorldPoint var12;
        void var20;
        NPC nPC2 = NPCs.getNearest((int[])c.v);
        if (o.llllIllIIlIlll(nPC2)) {
            return llIIIllIllII[0];
        }
        SquireFightCavesPlugin.f = llIIIllIllII[1];
        NPC var23 = NPCs.getNearest(arg_0 -> o.a((NPC)var20, arg_0));
        NPC var18 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var8;
            if (!(o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[7]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[8]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[9]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[10]) && !o.llllIllIIllllI(nPC.getId(), llIIIllIllII[7]) || !o.llllIllIIlllII(var8.isDead() ? 1 : 0) || !o.llllIllIIlllll(var8.getInteracting(), Players.getLocal()))) {
                n2 = llIIIllIllII[1];
                0;
                if (2 < 0) {
                    return ((0xC5 ^ 0xAF ^ (0x36 ^ 0x17)) & (0x40 ^ 0x3C ^ (0x86 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        });
        if (o.llllIllIIlIlll(var23) && o.llllIllIIllIII(var18)) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[0]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var18.interact(llIIIllIlIlI[llIIIllIllII[1]]);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIlIlll(var23) && o.llllIllIIlIlll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[2]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var20.interact(llIIIllIlIlI[llIIIllIllII[3]]);
            return llIIIllIllII[0];
        }
        List var15 = var20.getWorldArea().toWorldPointList();
        if (o.llllIllIIllIlI(n.c(var15) ? 1 : 0) && o.llllIllIIllIII(var12 = (WorldPoint)(var21 = Players.getLocal().getWorldLocation().createWorldArea(llIIIllIllII[4]).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (o.llllIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && o.llllIllIIlllII(var15.contains(worldPoint) ? 1 : 0) && o.llllIllIIlllII(n.a(worldPoint) ? 1 : 0)) {
                n2 = llIIIllIllII[1];
                0;
                if (3 == -1) {
                    return false;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
            Movement.setDestination((WorldPoint)var12);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIllIII(var23) && (!o.llllIllIIllIlI(var23.isMoving() ? 1 : 0) || o.llllIllIIllIll(var23.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIllII[4]))) {
            o var28;
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[5]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && o.llllIllIIlllII(var28.av.avoidDefXp() ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
            }
            var23.interact(llIIIllIlIlI[llIIIllIllII[6]]);
            return llIIIllIllII[0];
        }
        return llIIIllIllII[0];
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(NPC nPC, NPC nPC2) {
        int n2;
        NPC var10;
        void var1;
        if ((!o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[7]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[8]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[9]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[10]) || o.llllIllIIllllI(nPC2.getId(), llIIIllIllII[7])) && o.llllIllIIllIll(var1.getWorldLocation().distanceTo(var10.getWorldLocation()), llIIIllIllII[11]) && o.llllIllIIlllII(var1.isDead() ? 1 : 0) && o.llllIllIIllIIl(var1.getInteracting(), Players.getLocal())) {
            n2 = llIIIllIllII[1];
            0;
            if (1 != 1) {
                return false;
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
        o.llIIIllIllII[1] = 1;
        o.llIIIllIllII[2] = 2;
        o.llIIIllIllII[3] = 3;
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
        o.llIIIllIlIlI[o.llIIIllIllII[0]] = o."Killing healers";
        o.llIIIllIlIlI[o.llIIIllIllII[1]] = o."Attack";
        o.llIIIllIlIlI[o.llIIIllIllII[2]] = o."Attacking jad";
        o.llIIIllIlIlI[o.llIIIllIllII[3]] = o."Attack";
        o.llIIIllIlIlI[o.llIIIllIllII[5]] = o."Luring healer";
        o.llIIIllIlIlI[o.llIIIllIllII[6]] = o."Attack";
    }

    private static String llllIllIIIlIIl(String var19, String var24) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llIIIllIllII[12]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIIllIllII[2], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String llllIllIIIlIII(String var13, String var16) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(llIIIllIllII[2], var6);
            return new String(var25.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

