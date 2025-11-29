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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    private final  d ad;
    private  boolean ah;
    
    private  int ae;
    private  boolean af;
    private final  e ac;
    
    private  boolean ag;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var1;
        if (r.lIlIlIlllIIIll(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (r.lIlIlIlllIIlII(var1.getActor().getAnimation(), llIlllIlIll[6])) {
            var2.ae = Static.getClient().getTickCount();
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (r.lIlIlIllIlllIl(npcSpawned.getNpc().getName().equals(llIlllIlIIl[llIlllIlIll[2]]) ? 1 : 0)) {
            return;
        }
        this.af = llIlllIlIll[2];
    }

    private static boolean lIlIlIlllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIllIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public MovingToNextTileTask(e e2, d d2) {
        this.ae = llIlllIlIll[0];
        this.af = llIlllIlIll[1];
        this.ac = e2;
        this.ad = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        r var3;
        if (r.lIlIlIllIlllIl(this.ac.t() ? 1 : 0)) {
            this.ah = llIlllIlIll[1];
            this.af = llIlllIlIll[1];
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(var3.ac.y() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(var3.ac.s() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        WorldPoint var4 = var3.ad.p();
        if (r.lIlIlIllIllllI(var3.ah ? 1 : 0) && r.lIlIlIllIlllIl(var4.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var3.af = llIlllIlIll[1];
            Movement.setDestination((WorldPoint)var4);
            return llIlllIlIll[1];
        }
        RegionPoint var5 = var3.ad.k();
        if (r.lIlIlIllIlllll(var5)) {
            if (r.lIlIlIllIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlllIlIll[2];
            }
            WorldPoint var6 = var3.ad.l();
            if (r.lIlIlIlllIIIII(var6)) {
                Movement.setDestination((WorldPoint)var6);
                return llIlllIlIll[1];
            }
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllll(Players.getLocal().getInteracting())) {
            return llIlllIlIll[2];
        }
        WorldPoint var6 = d.a(var5);
        if (r.lIlIlIllIlllll(var6)) {
            return llIlllIlIll[2];
        }
        int var7 = Static.getClient().getTickCount();
        NPC var8 = var3.ac.z().c();
        if (r.lIlIlIlllIIIIl(var7 - var3.ae, llIlllIlIll[1]) && r.lIlIlIlllIIIlI(var3.ae, llIlllIlIll[0]) && r.lIlIlIlllIIIIl(var8.distanceTo((Locatable)Players.getLocal()), llIlllIlIll[3])) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIllllI(d.j() ? 1 : 0) && r.lIlIlIllIlllIl(var3.af ? 1 : 0)) {
            var3.af = llIlllIlIll[1];
            var3.sleep(llIlllIlIll[4]);
            return llIlllIlIll[1];
        }
        if (r.lIlIlIllIllllI(var3.af ? 1 : 0) && r.lIlIlIllIllllI(var3.ah ? 1 : 0)) {
            var3.ah = llIlllIlIll[2];
        }
        var3.sleep(llIlllIlIll[1]);
        if (r.lIlIlIllIllllI(var3.ad.n() ? 1 : 0)) {
            int[] nArray = new int[llIlllIlIll[1]];
            nArray[r.llIlllIlIll[2]] = llIlllIlIll[5];
            TileObject var9 = TileObjects.getNearest((int[])nArray);
            var9.interact(llIlllIlIll[2]);
            var3.ag = llIlllIlIll[1];
            return llIlllIlIll[1];
        }
        Movement.setDestination((WorldPoint)var3_4);
        this.ag = llIlllIlIll[2];
        return llIlllIlIll[1];
    }

    private static boolean lIlIlIlllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var10);
    }

    private static boolean lIlIlIlllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean O() {
        return this.ag;
    }

    static {
        r.lIlIlIllIllIll();
        r.lIlIlIllIllIII();
    }

    private static boolean lIlIlIllIlllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlllIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlllIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIlllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var11;
        if (r.lIlIlIllIllllI(chatMessage.getMessage().contains(llIlllIlIIl[llIlllIlIll[1]]) ? 1 : 0)) {
            this.ae = Static.getClient().getTickCount() + llIlllIlIll[3];
        }
        if (r.lIlIlIllIllllI(var11.getMessage().contains(llIlllIlIIl[llIlllIlIll[7]]) ? 1 : 0)) {
            var12.af = llIlllIlIll[2];
        }
    }

    private static void lIlIlIllIllIII() {
        llIlllIlIIl = new String[llIlllIlIll[3]];
        r.llIlllIlIIl[r.llIlllIlIll[2]] = "General Graardor";
        r.llIlllIlIIl[r.llIlllIlIll[1]] = "heals";
        r.llIlllIlIIl[r.llIlllIlIll[7]] = "General Gra";
    }
}

