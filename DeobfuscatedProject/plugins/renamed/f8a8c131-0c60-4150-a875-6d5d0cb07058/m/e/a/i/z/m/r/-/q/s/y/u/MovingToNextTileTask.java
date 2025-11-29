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
package m.e.a.i.z.m.r.-.q.s.y.u;

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
import m.e.a.i.z.m.r.-.q.s.y.u.c_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
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
/* TASK: Moving to next tile -> MoveToNextTileTask */
@TaskDesc(name="Moving to next tile", priority=9, register=true)
public class MovingToNextTileTask
extends Task {
    private /* synthetic */ boolean am;
    private /* synthetic */ boolean ak;
    private static /* synthetic */ String[] lIllIIlIIIllI;
    private /* synthetic */ boolean al;
    private /* synthetic */ int aj;
    private final /* synthetic */ c ai;
    private static /* synthetic */ int[] lIllIIlIIlIIl;
    private final /* synthetic */ l ah;

    private static boolean llIIIlIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIlllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIlIlllIlIlI() {
        lIllIIlIIIllI = new String[lIllIIlIIlIIl[3]];
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[2]] = u."K'ril Tsutsaroth";
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[1]] = u."heals";
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[6]] = u."K'ril Tsutsaroth";
    }

    private static boolean llIIIlIllllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIlllIllIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIlIlllIIlIl(String var1, String var16) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIllIIlIIlIIl[6], var17);
            return new String(var18.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        u.llIIIlIlllIlIll();
        u.llIIIlIlllIlIlI();
    }

    public boolean O() {
        return this.al;
    }

    private static void llIIIlIlllIlIll() {
        lIllIIlIIlIIl = new int[8];
        u.lIllIIlIIlIIl[0] = -1;
        u.lIllIIlIIlIIl[1] = 1;
        u.lIllIIlIIlIIl[2] = (0x1C ^ 0x3A) & ~(0x22 ^ 4);
        u.lIllIIlIIlIIl[3] = 3;
        u.lIllIIlIIlIIl[4] = 0x6F ^ 0x68;
        u.lIllIIlIIlIIl[5] = 0xFFFFCBFE & 0x35AB;
        u.lIllIIlIIlIIl[6] = 2;
        u.lIllIIlIIlIIl[7] = 0xB4 ^ 0x9A ^ (0x73 ^ 0x55);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var15;
        if (u.llIIIlIlllIllII(this.ah.B() ? 1 : 0)) {
            this.am = lIllIIlIIlIIl[1];
            this.ak = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(var15.ah.G() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(var15.ah.A() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint var2 = var15.ai.i();
        if (u.llIIIlIlllIllIl(var15.am ? 1 : 0) && u.llIIIlIlllIllII(var2.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var15.ak = lIllIIlIIlIIl[1];
            Movement.walkTo((WorldPoint)var2);
            0;
            return lIllIIlIIlIIl[1];
        }
        RegionPoint var19 = var15.ai.d();
        if (u.llIIIlIlllIlllI(var19)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIlllI(Players.getLocal().getInteracting())) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint var14 = c.a(var19);
        if (u.llIIIlIlllIlllI(var14)) {
            return lIllIIlIIlIIl[2];
        }
        int var10 = Static.getClient().getTickCount();
        NPC var5 = var15.ah.I().m();
        if (u.llIIIlIlllIllll(var10 - var15.aj, lIllIIlIIlIIl[1]) && u.llIIIlIllllIIII(var15.aj, lIllIIlIIlIIl[0]) && u.llIIIlIlllIllll(var5.distanceTo((Locatable)Players.getLocal()), lIllIIlIIlIIl[3])) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllIl(c.c() ? 1 : 0) && u.llIIIlIlllIllII(var15.ak ? 1 : 0)) {
            var15.ak = lIllIIlIIlIIl[1];
            var15.sleep(lIllIIlIIlIIl[1]);
            return lIllIIlIIlIIl[1];
        }
        if (u.llIIIlIlllIllIl(var15.ak ? 1 : 0) && u.llIIIlIlllIllIl(var15.am ? 1 : 0)) {
            var15.am = lIllIIlIIlIIl[2];
        }
        var15.sleep(lIllIIlIIlIIl[1]);
        if (u.llIIIlIlllIllIl(var15.ai.f() ? 1 : 0)) {
            int[] nArray = new int[lIllIIlIIlIIl[1]];
            nArray[u.lIllIIlIIlIIl[2]] = lIllIIlIIlIIl[4];
            TileObject var6 = TileObjects.getNearest((int[])nArray);
            var6.interact(lIllIIlIIlIIl[2]);
            var15.al = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[1];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        this.al = lIllIIlIIlIIl[2];
        return lIllIIlIIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var12;
        if (u.llIIIlIllllIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (u.llIIIlIllllIIlI(var12.getActor().getAnimation(), lIllIIlIIlIIl[5])) {
            llllllllllllllIllIIlIlIIlIllIlll.aj = Static.getClient().getTickCount();
        }
    }

    private static boolean llIIIlIlllIlllI(Object object) {
        return object == null;
    }

    @Inject
    public u(l l2, c c2) {
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
        void var8;
        if (u.llIIIlIlllIllIl(chatMessage.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[1]]) ? 1 : 0)) {
            this.aj = Static.getClient().getTickCount() + lIllIIlIIlIIl[3];
        }
        if (u.llIIIlIlllIllIl(var8.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[6]]) ? 1 : 0)) {
            llllllllllllllIllIIlIlIIlIlIllll.ak = lIllIIlIIlIIl[2];
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (u.llIIIlIlllIllII(npcSpawned.getNpc().getName().equals(lIllIIlIIIllI[lIllIIlIIlIIl[2]]) ? 1 : 0)) {
            return;
        }
        this.ak = lIllIIlIIlIIl[2];
    }

    private static String llIIIlIlllIIlII(String var13, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIIl[7]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIIlIIlIIl[6], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllllIIIl(Object object, Object object2) {
        return object != object2;
    }
}

