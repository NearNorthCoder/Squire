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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

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
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@Singleton
@TaskDesc(name="Moving to next tile", priority=9, register=true)
public class MovingToNextTileTask
extends Task {
    private  boolean am;
    private  boolean ak;
    
    private  boolean al;
    private  int aj;
    private final  c ai;
    
    private final  l ah;

    private static boolean llIIIlIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIlllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIlIlllIlIlI() {
        lIllIIlIIIllI = new String[lIllIIlIIlIIl[3]];
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[2]] = "K'ril Tsutsaroth";
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[1]] = "heals";
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[6]] = "K'ril Tsutsaroth";
    }

    private static boolean llIIIlIllllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIlllIllIl(int n2) {
        return n2 != 0;
    }

    static {
        u.llIIIlIlllIlIll();
        u.llIIIlIlllIlIlI();
    }

    public boolean O() {
        return this.al;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var1;
        if (u.llIIIlIlllIllII(this.ah.B() ? 1 : 0)) {
            this.am = lIllIIlIIlIIl[1];
            this.ak = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(var1.ah.G() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(var1.ah.A() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint var2 = var1.ai.i();
        if (u.llIIIlIlllIllIl(var1.am ? 1 : 0) && u.llIIIlIlllIllII(var2.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var1.ak = lIllIIlIIlIIl[1];
            Movement.walkTo((WorldPoint)var2);

            return lIllIIlIIlIIl[1];
        }
        RegionPoint var3 = var1.ai.d();
        if (u.llIIIlIlllIlllI(var3)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIlllI(Players.getLocal().getInteracting())) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint var4 = c.a(var3);
        if (u.llIIIlIlllIlllI(var4)) {
            return lIllIIlIIlIIl[2];
        }
        int var5 = Static.getClient().getTickCount();
        NPC var6 = var1.ah.I().m();
        if (u.llIIIlIlllIllll(var5 - var1.aj, lIllIIlIIlIIl[1]) && u.llIIIlIllllIIII(var1.aj, lIllIIlIIlIIl[0]) && u.llIIIlIlllIllll(var6.distanceTo((Locatable)Players.getLocal()), lIllIIlIIlIIl[3])) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllIl(c.c() ? 1 : 0) && u.llIIIlIlllIllII(var1.ak ? 1 : 0)) {
            var1.ak = lIllIIlIIlIIl[1];
            var1.sleep(lIllIIlIIlIIl[1]);
            return lIllIIlIIlIIl[1];
        }
        if (u.llIIIlIlllIllIl(var1.ak ? 1 : 0) && u.llIIIlIlllIllIl(var1.am ? 1 : 0)) {
            var1.am = lIllIIlIIlIIl[2];
        }
        var1.sleep(lIllIIlIIlIIl[1]);
        if (u.llIIIlIlllIllIl(var1.ai.f() ? 1 : 0)) {
            int[] nArray = new int[lIllIIlIIlIIl[1]];
            nArray[u.lIllIIlIIlIIl[2]] = lIllIIlIIlIIl[4];
            TileObject var7 = TileObjects.getNearest((int[])nArray);
            var7.interact(lIllIIlIIlIIl[2]);
            var1.al = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[1];
        }
        Movement.walkTo((WorldPoint)var3_3);

        this.al = lIllIIlIIlIIl[2];
        return lIllIIlIIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var8;
        if (u.llIIIlIllllIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (u.llIIIlIllllIIlI(var8.getActor().getAnimation(), lIllIIlIIlIIl[5])) {
            var9.aj = Static.getClient().getTickCount();
        }
    }

    private static boolean llIIIlIlllIlllI(Object object) {
        return object == null;
    }

    @Inject
    public MovingToNextTileTask(l l2, c c2) {
        this.aj = lIllIIlIIlIIl[0];
        this.ak = lIllIIlIIlIIl[1];
        this.ah = l2;
        this.ai = c2;
    }

    private static boolean llIIIlIlllIllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var10;
        if (u.llIIIlIlllIllIl(chatMessage.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[1]]) ? 1 : 0)) {
            this.aj = Static.getClient().getTickCount() + lIllIIlIIlIIl[3];
        }
        if (u.llIIIlIlllIllIl(var10.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[6]]) ? 1 : 0)) {
            var11.ak = lIllIIlIIlIIl[2];
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (u.llIIIlIlllIllII(npcSpawned.getNpc().getName().equals(lIllIIlIIIllI[lIllIIlIIlIIl[2]]) ? 1 : 0)) {
            return;
        }
        this.ak = lIllIIlIIlIIl[2];
    }

    private static boolean llIIIlIllllIIIl(Object object, Object object2) {
        return object != object2;
    }
}

