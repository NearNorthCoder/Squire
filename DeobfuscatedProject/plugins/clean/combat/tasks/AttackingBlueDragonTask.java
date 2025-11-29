/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.combat.tasks.AHelper;
import gg.squire.combat.tasks.GameEnum5;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Attacking Blue Dragon", priority=5, register=true)
public class AttackingBlueDragonTask
extends Task {

    private final  a B;
    private final  SquireBlueDragonKillerConfig A;
    private final  SquireBlueDragonKiller z;

    private static boolean llIlIIIlllIlIl(Object object) {
        return object != null;
    }

    private boolean t() {
        int n;
        List list = NPCs.getAll(nPC -> {
            boolean bl;
            if (g.llIlIIIlllIlll(nPC.getInteracting(), Players.getLocal())) {
                bl = lIIllllIIllI[1];

                if ((2 & (2 ^ -1)) >= (0xDB ^ 0xC6 ^ (0xDE ^ 0xC7))) {
                    return ((0x40 ^ 0x70 ^ (0xFC ^ 0x80)) & (17 + 176 - 34 + 44 ^ 48 + 38 - 70 + 119 ^ -1)) != 0;
                }
            } else {
                bl = lIIllllIIllI[0];
            }
            return bl;
        });
        if (g.llIlIIIlllIIll(this.v() ? 1 : 0) && g.llIlIIIlllIlII(this.x() ? 1 : 0) && g.llIlIIIlllIlII(list.isEmpty() ? 1 : 0) && g.llIlIIIlllIlII(((NPC)list.get(lIIllllIIllI[0])).distanceTo((Locatable)Players.getLocal()))) {
            n = lIIllllIIllI[1];

            if (3 > 3) {
                return false;
            }
        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    private static boolean llIlIIIlllIlll(Object object, Object object2) {
        return object == object2;
    }

    private boolean u() {
        int n;
        g var1;
        if (g.llIlIIIlllIlIl(Players.getLocal().getInteracting()) && (g.llIlIIIlllIIll(this.v() ? 1 : 0) && !g.llIlIIIlllIlII(this.x() ? 1 : 0) || g.llIlIIIlllIlII(var1.v() ? 1 : 0))) {
            n = lIIllllIIllI[1];

            if (1 < 0) {
                return ((132 + 110 - 118 + 23 ^ 146 + 117 - 122 + 16) & (0x3A ^ 0x74 ^ (0x55 ^ 0x15) ^ -1)) != 0;
            }
        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    @Inject
    public AttackingBlueDragonTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2) {
        this.z = squireBlueDragonKiller;
        this.A = squireBlueDragonKillerConfig;
        this.B = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        void var2;
        if (g.llIlIIIlllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (g.llIlIIIlllIIll(var2.getMessage().contains(lIIllllIIlIl[lIIllllIIllI[0]]) ? 1 : 0)) {
            g var3;
            Log.info((String)lIIllllIIlIl[lIIllllIIllI[1]]);
            var3.z.a(lIIllllIIllI[1]);
        }
    }

    private boolean v() {
        boolean bl;
        if (g.llIlIIIlllIllI((Object)this.A.attackStyle(), (Object)c.MELEE)) {
            bl = lIIllllIIllI[1];

            if (1 >= (0x6C ^ 0x7A ^ (0x84 ^ 0x96))) {
                return ((0x31 ^ 0x39 ^ (0x7A ^ 0x28)) & (21 + 58 - -53 + 76 ^ 136 + 77 - 197 + 122 ^ -1) & ((3 ^ 0x3C ^ (0x27 ^ 0x3D)) & (38 + 105 - 55 + 68 ^ 19 + 146 - 162 + 182 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIIllllIIllI[0];
        }
        return bl;
    }

    static {
        g.llIlIIIlllIIlI();
        g.llIlIIIlllIIIl();
    }

    private static void llIlIIIlllIIIl() {
        lIIllllIIlIl = new String[lIIllllIIllI[2]];
        g.lIIllllIIlIl[g.lIIllllIIllI[0]] = "is no ammo left in your";
        g.lIIllllIIlIl[g.lIIllllIIllI[1]] = "We're out of bolts, banking.";
    }

    private void w() {
        if (g.llIlIIIlllIIll(this.v() ? 1 : 0) && g.llIlIIIlllIIll(this.B.m() ? 1 : 0) && g.llIlIIIlllIlII(this.x() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)this.A.dragonLocation().q());

        }
        if (g.llIlIIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        this.B.k();
    }

    private boolean x() {
        boolean bl;
        if (g.llIlIIIlllIlll(Players.getLocal().getWorldLocation(), this.A.dragonLocation().q())) {
            bl = lIIllllIIllI[1];

        } else {
            bl = lIIllllIIllI[0];
        }
        return bl;
    }

    public boolean run() {
        g var4;
        if (g.llIlIIIlllIIll(this.z.h() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        if (g.llIlIIIlllIIll(var4.z.b() ? 1 : 0)) {
            var4.z.a(lIIllllIIllI[1]);
            return lIIllllIIllI[0];
        }
        if (g.llIlIIIlllIIll(var4.s() ? 1 : 0)) {
            return lIIllllIIllI[0];
        }
        this.w();
        return lIIllllIIllI[1];
    }

    private boolean s() {
        int n;
        if (!(g.llIlIIIlllIlII(this.t() ? 1 : 0) && g.llIlIIIlllIIll(this.z.c().isEmpty() ? 1 : 0) && g.llIlIIIlllIIll(this.B.n() ? 1 : 0) && g.llIlIIIlllIlIl(this.B.j()) && !g.llIlIIIlllIIll(this.u() ? 1 : 0))) {
            n = lIIllllIIllI[1];

        } else {
            n = lIIllllIIllI[0];
        }
        return n != 0;
    }

    private static boolean llIlIIIlllIlII(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlllIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIlllIllI(Object object, Object object2) {
        return object != object2;
    }
}

