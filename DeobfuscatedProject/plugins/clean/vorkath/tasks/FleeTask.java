/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Flee", priority=108, register=true)
public class FleeTask
extends VorkathTaskBase {
    public static final  int ci;

    public static final  int cj;
    private  int ck;

    private boolean Y() {
        int n2 = this.cf.getBoostedSkillLevel(Skill.PRAYER);
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(n2, lIlIllIIIIlIl[6])) {
            return lIlIllIIIIlIl[0];
        }
        return Inventory.contains(item -> item.getName().startsWith(lIlIllIIIIlII[lIlIllIIIIlIl[9]]));
    }

    static {
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIlI();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIIl();
        cj = lIlIllIIIIlIl[5];
        ci = lIlIllIIIIlIl[7];
    }

    private boolean Z() {
        int n2;
        x var1;
        int n3;
        int n4 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n3 = lIlIllIIIIlIl[6];

            if (((0x73 ^ 0x54) & ~(0x37 ^ 0x10)) != 0) {
                return false;
            }
        } else {
            n3 = lIlIllIIIIlIl[1];
        }
        int var2 = n4 + n3;
        String var3 = lIlIllIIIIlII[lIlIllIIIIlIl[8]];
        if (!i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(var1.X() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlll(Combat.getCurrentHealth(), var2) || i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Inventory.contains(item -> item.getName().startsWith(var3)) ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];

            if (1 > 2) {
                return ((123 + 17 - 85 + 72 ^ (0xC ^ 0x74)) & (0xA2 ^ 0xC3 ^ (0x63 ^ 5) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIIIIllIII(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var4);
    }

    private boolean X() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(Combat.getCurrentHealth(), this.ce.eatAtHP())) {
            return lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIllI(Inventory.getCount((boolean)lIlIllIIIIlIl[0], item -> {
            String[] stringArray = new String[lIlIllIIIIlIl[0]];
            stringArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlII[lIlIllIIIIlIl[10]];
            return item.hasAction(stringArray);
        }))) {
            bl = lIlIllIIIIlIl[0];

            if (-1 > (0xD4 ^ 0xA9 ^ (0x3A ^ 0x43))) {
                return ((0x1F ^ 0x3B ^ (0xC5 ^ 0xB3)) & (0x46 ^ 8 ^ (0x42 ^ 0x5E) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private boolean aa() {
        int n2;
        int var5;
        int n3;
        int var6;
        int n4;
        x var7;
        int n5;
        int n6 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n5 = lIlIllIIIIlIl[6];

        } else {
            n5 = lIlIllIIIIlIl[1];
        }
        int var8 = n6 + n5;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlll(var7.cf.getBoostedSkillLevel(Skill.HITPOINTS), lIlIllIIIIlIl[7])) {
            n4 = lIlIllIIIIlIl[0];

            if ((7 ^ 2 ^ (0x2F ^ 0x24) & ~(0x6F ^ 0x64)) == 0) {
                return ((0xC7 ^ 0xA5 ^ (0xF1 ^ 0xC7)) & (56 + 148 - 4 + 7 ^ 93 + 153 - 234 + 143 ^ -1)) != 0;
            }
        } else {
            n4 = var6 = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(var7.cf.getTickCount() - var7.cg.F(), lIlIllIIIIlIl[5])) {
            n3 = lIlIllIIIIlIl[0];

            if (2 < 1) {
                return false;
            }
        } else {
            n3 = var5 = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(var6) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(var5) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(var7.ab() ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];

            if (-1 >= 1) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    @Inject
    protected FleeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIIlIIll(int n2) {
        return n2 != 0;
    }

    private boolean ab() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(this.cf.getTickCount() - this.ck, lIlIllIIIIlIl[8])) {
            bl = lIlIllIIIIlIl[0];

            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private static void W() {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();

            if (3 != 3) {
                return;
            }
        } else {
            int[] nArray = new int[lIlIllIIIIlIl[0]];
            nArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
            if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIllIIIIlIl[0]];
                nArray2[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIllIIIIlII[lIlIllIIIIlIl[1]]);
            }
        }
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIllIII(hitsplatApplied.getActor(), Players.getLocal())) {
            this.ck = this.cf.getTickCount();
        }
    }

    private static void llIIIIIIIIlIIIl() {
        lIlIllIIIIlII = new String[lIlIllIIIIlIl[11]];
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Teleport";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[0]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Fleeing since we don't have food that we need";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[3]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Fleeing since we need prayer and don't have any";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[4]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Fleeing since we need a venom cure";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[5]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Fleeing since we can be killed currently";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[8]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."anti";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[9]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Prayer pot";
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[10]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h."Eat";
    }

    private static boolean llIIIIIIIIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean Q() {
        x var9;
        int var10;
        int n2 = lIlIllIIIIlIl[1];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(this.X() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[0]]);
            var10 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(var9.Y() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[3]]);
            var10 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(var9.Z() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[4]]);
            var10 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(var9.aa() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[5]]);
            var10 = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(var10)) {
            return lIlIllIIIIlIl[1];
        }
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.W();
        this.x.a(lIlIllIIIIlIl[0]);
        return lIlIllIIIIlIl[0];
    }

    private static boolean llIIIIIIIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

