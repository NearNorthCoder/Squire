/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.saradomin.tasks.SaradominManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    
    private  boolean aq;
    private final  g am;
    private final  l an;
    private  int ao;
    private  boolean ap;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (w.lIlIlIlllIIllII(npcSpawned.getNpc().getName().equals(lIIlIlIIllIlI[lIIlIlIIllIll[2]]) ? 1 : 0)) {
            return;
        }
        this.ap = lIIlIlIIllIll[2];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int var1;
        int n2;
        w var2;
        if (w.lIlIlIlllIIllII(this.am.m() ? 1 : 0)) {
            this.aq = lIIlIlIIllIll[1];
            this.ap = lIIlIlIIllIll[1];
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllII(var2.am.l() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint var3 = var2.an.N();
        if (w.lIlIlIlllIIllIl(var2.aq ? 1 : 0) && w.lIlIlIlllIIllII(var3.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var2.ap = lIIlIlIIllIll[1];
            Movement.walkTo((WorldPoint)var3);

            return lIIlIlIIllIll[1];
        }
        RegionPoint var4 = var2.an.L();
        if (w.lIlIlIlllIIlllI(var4)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIlllI(Players.getLocal().getInteracting()) && w.lIlIlIlllIIllIl(var2.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint var5 = l.a(var4);
        if (w.lIlIlIlllIIlllI(var5)) {
            return lIIlIlIIllIll[2];
        }
        int var6 = Static.getClient().getTickCount();
        NPC var7 = var2.am.t().C();
        if (w.lIlIlIlllIIllll(var7.distanceTo((Locatable)Players.getLocal()), lIIlIlIIllIll[3])) {
            n2 = lIIlIlIIllIll[1];

            if ((37 + 125 - 37 + 49 ^ 29 + 23 - -93 + 25) <= -1) {
                return ((1 + 28 - -143 + 25 ^ 88 + 131 - 167 + 84) & (0xD4 ^ 0xAA ^ (0x66 ^ 0x55) ^ -1)) != 0;
            }
        } else {
            n2 = var1 = lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllll(var6 - var2.ao, lIIlIlIIllIll[1]) && w.lIlIlIlllIlIIII(var2.ao, lIIlIlIIllIll[0]) && w.lIlIlIlllIIllIl(var1) && w.lIlIlIlllIIllIl(var2.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllIl(l.H() ? 1 : 0) && w.lIlIlIlllIIllII(var2.ap ? 1 : 0)) {
            var2.ap = lIIlIlIIllIll[1];
            var2.sleep(lIIlIlIIllIll[4]);
            return lIIlIlIIllIll[1];
        }
        if (w.lIlIlIlllIIllIl(var2.ap ? 1 : 0) && w.lIlIlIlllIIllIl(var2.aq ? 1 : 0)) {
            var2.aq = lIIlIlIIllIll[2];
        }
        Movement.walkTo((WorldPoint)var3_3);

        this.sleep(lIIlIlIIllIll[1]);
        return lIIlIlIIllIll[1];
    }

    @Inject
    public MovingToNextTileTask(g g2, l l2) {
        this.ao = lIIlIlIIllIll[0];
        this.ap = lIIlIlIIllIll[1];
        this.am = g2;
        this.an = l2;
    }

    static {
        w.lIlIlIlllIIlIll();
        w.lIlIlIlllIIlIlI();
    }

    private static boolean lIlIlIlllIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlllIlIIII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var8);
    }

    private static void lIlIlIlllIIlIlI() {
        lIIlIlIIllIlI = new String[lIIlIlIIllIll[3]];
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[2]] = "Commander Zilyana";
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[1]] = "heals";
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[6]] = "Commander Zilyana";
    }

    private static boolean lIlIlIlllIIlllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlllIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIlllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var9;
        if (w.lIlIlIlllIIllIl(chatMessage.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[1]]) ? 1 : 0)) {
            this.ao = Static.getClient().getTickCount() + lIIlIlIIllIll[3];
        }
        if (w.lIlIlIlllIIllIl(var9.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[6]]) ? 1 : 0)) {
            var10.ap = lIIlIlIIllIll[2];
        }
    }

    private static boolean lIlIlIlllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var11;
        if (w.lIlIlIlllIlIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (w.lIlIlIlllIlIIlI(var11.getActor().getAnimation(), lIIlIlIIllIll[5])) {
            var12.ao = Static.getClient().getTickCount();
        }
    }

    private static boolean lIlIlIlllIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlllIIllII(int n2) {
        return n2 == 0;
    }
}

