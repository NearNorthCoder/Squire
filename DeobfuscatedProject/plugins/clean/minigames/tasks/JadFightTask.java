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
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.NHelper;
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
public class JadFightTask
extends Task {
    private final  f au;
    
    private final  n aw;
    
    private final  SquireFightCavesConfig av;

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
    public JadFightTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.au = f2;
        this.av = squireFightCavesConfig;
        this.aw = n2;
    }

        return String.valueOf(var1);
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
        List var2;
        WorldPoint var3;
        void var4;
        NPC nPC2 = NPCs.getNearest((int[])c.v);
        if (o.llllIllIIlIlll(nPC2)) {
            return llIIIllIllII[0];
        }
        SquireFightCavesPlugin.f = llIIIllIllII[1];
        NPC var5 = NPCs.getNearest(arg_0 -> o.a((NPC)var4, arg_0));
        NPC var6 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var7;
            if (!(o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[7]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[8]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[9]) && o.llllIllIIlllIl(nPC.getId(), llIIIllIllII[10]) && !o.llllIllIIllllI(nPC.getId(), llIIIllIllII[7]) || !o.llllIllIIlllII(var7.isDead() ? 1 : 0) || !o.llllIllIIlllll(var7.getInteracting(), Players.getLocal()))) {
                n2 = llIIIllIllII[1];

                if (2 < 0) {
                    return ((0xC5 ^ 0xAF ^ (0x36 ^ 0x17)) & (0x40 ^ 0x3C ^ (0x86 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        });
        if (o.llllIllIIlIlll(var5) && o.llllIllIIllIII(var6)) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[0]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var6.interact(llIIIllIlIlI[llIIIllIllII[1]]);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIlIlll(var5) && o.llllIllIIlIlll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[2]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
            var4.interact(llIIIllIlIlI[llIIIllIllII[3]]);
            return llIIIllIllII[0];
        }
        List var8 = var4.getWorldArea().toWorldPointList();
        if (o.llllIllIIllIlI(n.c(var8) ? 1 : 0) && o.llllIllIIllIII(var3 = (WorldPoint)(var2 = Players.getLocal().getWorldLocation().createWorldArea(llIIIllIllII[4]).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (o.llllIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && o.llllIllIIlllII(var8.contains(worldPoint) ? 1 : 0) && o.llllIllIIlllII(n.a(worldPoint) ? 1 : 0)) {
                n2 = llIIIllIllII[1];

                if (3 == -1) {
                    return false;
                }
            } else {
                n2 = llIIIllIllII[0];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
            Movement.setDestination((WorldPoint)var3);
            return llIIIllIllII[0];
        }
        if (o.llllIllIIllIII(var5) && (!o.llllIllIIllIlI(var5.isMoving() ? 1 : 0) || o.llllIllIIllIll(var5.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIllII[4]))) {
            o var9;
            SquireFightCavesPlugin.h = llIIIllIlIlI[llIIIllIllII[5]];
            if (o.llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && o.llllIllIIlllII(var9.av.avoidDefXp() ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
            }
            var5.interact(llIIIllIlIlI[llIIIllIllII[6]]);
            return llIIIllIllII[0];
        }
        return llIIIllIllII[0];
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(NPC nPC, NPC nPC2) {
        int n2;
        NPC var10;
        void var11;
        if ((!o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[7]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[8]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[9]) || !o.llllIllIIlllIl(nPC2.getId(), llIIIllIllII[10]) || o.llllIllIIllllI(nPC2.getId(), llIIIllIllII[7])) && o.llllIllIIllIll(var11.getWorldLocation().distanceTo(var10.getWorldLocation()), llIIIllIllII[11]) && o.llllIllIIlllII(var11.isDead() ? 1 : 0) && o.llllIllIIllIIl(var11.getInteracting(), Players.getLocal())) {
            n2 = llIIIllIllII[1];

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

    private static void llllIllIIIlIll() {
        llIIIllIlIlI = new String[llIIIllIllII[4]];
        o.llIIIllIlIlI[o.llIIIllIllII[0]] = "Killing healers";
        o.llIIIllIlIlI[o.llIIIllIllII[1]] = "Attack";
        o.llIIIllIlIlI[o.llIIIllIllII[2]] = "Attacking jad";
        o.llIIIllIlIlI[o.llIIIllIllII[3]] = "Attack";
        o.llIIIllIlIlI[o.llIIIllIllII[5]] = "Luring healer";
        o.llIIIllIlIlI[o.llIIIllIllII[6]] = "Attack";
    }

}

