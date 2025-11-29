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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Moving to next tile -> MoveToNextTileTask */
@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    private final /* synthetic */ d ad;
    private /* synthetic */ boolean ah;
    private static /* synthetic */ String[] llIlllIlIIl;
    private /* synthetic */ int ae;
    private /* synthetic */ boolean af;
    private final /* synthetic */ e ac;
    private static /* synthetic */ int[] llIlllIlIll;
    private /* synthetic */ boolean ag;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var13;
        if (r.lIlIlIlllIIIll(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (r.lIlIlIlllIIlII(var13.getActor().getAnimation(), llIlllIlIll[6])) {
            llllllllllllllllIIlIlIlIllIIlIII.ae = Static.getClient().getTickCount();
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

    private static void lIlIlIllIllIll() {
        llIlllIlIll = new int[8];
        r.llIlllIlIll[0] = -1;
        r.llIlllIlIll[1] = 1;
        r.llIlllIlIll[2] = (106 + 47 - 122 + 162 ^ 73 + 8 - -35 + 38) & (89 + 161 - 90 + 58 ^ 11 + 48 - 43 + 113 ^ -1);
        r.llIlllIlIll[3] = 3;
        r.llIlllIlIll[4] = 0x93 ^ 0x99 ^ (0x69 ^ 0x67);
        r.llIlllIlIll[5] = 0x52 ^ 0x55;
        r.llIlllIlIll[6] = -(0xFFFFAFEB & 0x7E56) & (0xFFFFEFFB & 0x3FEF);
        r.llIlllIlIll[7] = 2;
    }

    private static boolean lIlIlIllIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public r(e e2, d d2) {
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
        r var20;
        if (r.lIlIlIllIlllIl(this.ac.t() ? 1 : 0)) {
            this.ah = llIlllIlIll[1];
            this.af = llIlllIlIll[1];
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(var20.ac.y() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(var20.ac.s() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        WorldPoint var9 = var20.ad.p();
        if (r.lIlIlIllIllllI(var20.ah ? 1 : 0) && r.lIlIlIllIlllIl(var9.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var20.af = llIlllIlIll[1];
            Movement.setDestination((WorldPoint)var9);
            return llIlllIlIll[1];
        }
        RegionPoint var7 = var20.ad.k();
        if (r.lIlIlIllIlllll(var7)) {
            if (r.lIlIlIllIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlllIlIll[2];
            }
            WorldPoint var17 = var20.ad.l();
            if (r.lIlIlIlllIIIII(var17)) {
                Movement.setDestination((WorldPoint)var17);
                return llIlllIlIll[1];
            }
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllll(Players.getLocal().getInteracting())) {
            return llIlllIlIll[2];
        }
        WorldPoint var17 = d.a(var7);
        if (r.lIlIlIllIlllll(var17)) {
            return llIlllIlIll[2];
        }
        int var22 = Static.getClient().getTickCount();
        NPC var23 = var20.ac.z().c();
        if (r.lIlIlIlllIIIIl(var22 - var20.ae, llIlllIlIll[1]) && r.lIlIlIlllIIIlI(var20.ae, llIlllIlIll[0]) && r.lIlIlIlllIIIIl(var23.distanceTo((Locatable)Players.getLocal()), llIlllIlIll[3])) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIllllI(d.j() ? 1 : 0) && r.lIlIlIllIlllIl(var20.af ? 1 : 0)) {
            var20.af = llIlllIlIll[1];
            var20.sleep(llIlllIlIll[4]);
            return llIlllIlIll[1];
        }
        if (r.lIlIlIllIllllI(var20.af ? 1 : 0) && r.lIlIlIllIllllI(var20.ah ? 1 : 0)) {
            var20.ah = llIlllIlIll[2];
        }
        var20.sleep(llIlllIlIll[1]);
        if (r.lIlIlIllIllllI(var20.ad.n() ? 1 : 0)) {
            int[] nArray = new int[llIlllIlIll[1]];
            nArray[r.llIlllIlIll[2]] = llIlllIlIll[5];
            TileObject var8 = TileObjects.getNearest((int[])nArray);
            var8.interact(llIlllIlIll[2]);
            var20.ag = llIlllIlIll[1];
            return llIlllIlIll[1];
        }
        Movement.setDestination((WorldPoint)var3_4);
        this.ag = llIlllIlIll[2];
        return llIlllIlIll[1];
    }

    private static boolean lIlIlIlllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIlIllIlIlll(String var10, String var18) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var3 = var18.toCharArray();
        int var5 = llIlllIlIll[2];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var6 = llIlllIlIll[2];
        while (r.lIlIlIlllIIlIl(var6, var16)) {
            char var21 = var15[var6];
            var1.append((char)(var21 ^ var3[var5 % var3.length]));
            0;
            ++var5;
            ++var6;
            0;
            if (2 >= 1) continue;
            return null;
        }
        return String.valueOf(var1);
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

    private static String lIlIlIllIlIllI(String var14, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIlllIlIll[7], var11);
            return new String(var4.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
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
        void var19;
        if (r.lIlIlIllIllllI(chatMessage.getMessage().contains(llIlllIlIIl[llIlllIlIll[1]]) ? 1 : 0)) {
            this.ae = Static.getClient().getTickCount() + llIlllIlIll[3];
        }
        if (r.lIlIlIllIllllI(var19.getMessage().contains(llIlllIlIIl[llIlllIlIll[7]]) ? 1 : 0)) {
            llllllllllllllllIIlIlIlIllIIIIII.af = llIlllIlIll[2];
        }
    }

    private static void lIlIlIllIllIII() {
        llIlllIlIIl = new String[llIlllIlIll[3]];
        r.llIlllIlIIl[r.llIlllIlIll[2]] = r."General Graardor";
        r.llIlllIlIIl[r.llIlllIlIll[1]] = r."heals";
        r.llIlllIlIIl[r.llIlllIlIll[7]] = r."General Gra";
    }
}

