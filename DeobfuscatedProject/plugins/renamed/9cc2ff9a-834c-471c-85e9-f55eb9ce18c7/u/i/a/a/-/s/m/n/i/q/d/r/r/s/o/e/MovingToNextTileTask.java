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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g_Unknown;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l_Unknown;

/* TASK: Moving to next tile -> MoveToNextTileTask */
@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class MovingToNextTileTask
extends Task {
    private static /* synthetic */ int[] lIIlIlIIllIll;
    private /* synthetic */ boolean aq;
    private final /* synthetic */ g am;
    private final /* synthetic */ l an;
    private /* synthetic */ int ao;
    private /* synthetic */ boolean ap;
    private static /* synthetic */ String[] lIIlIlIIllIlI;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (w.lIlIlIlllIIllII(npcSpawned.getNpc().getName().equals(lIIlIlIIllIlI[lIIlIlIIllIll[2]]) ? 1 : 0)) {
            return;
        }
        this.ap = lIIlIlIIllIll[2];
    }

    private static String lIlIlIlllIIlIII(String var1, String var7) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlIlIIllIll[7]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIlIlIIllIll[6], var5);
            return new String(var16.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int var28;
        int n2;
        w var20;
        if (w.lIlIlIlllIIllII(this.am.m() ? 1 : 0)) {
            this.aq = lIIlIlIIllIll[1];
            this.ap = lIIlIlIIllIll[1];
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllII(var20.am.l() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint var23 = var20.an.N();
        if (w.lIlIlIlllIIllIl(var20.aq ? 1 : 0) && w.lIlIlIlllIIllII(var23.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var20.ap = lIIlIlIIllIll[1];
            Movement.walkTo((WorldPoint)var23);
            0;
            return lIIlIlIIllIll[1];
        }
        RegionPoint var22 = var20.an.L();
        if (w.lIlIlIlllIIlllI(var22)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIlllI(Players.getLocal().getInteracting()) && w.lIlIlIlllIIllIl(var20.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint var25 = l.a(var22);
        if (w.lIlIlIlllIIlllI(var25)) {
            return lIIlIlIIllIll[2];
        }
        int var10 = Static.getClient().getTickCount();
        NPC var27 = var20.am.t().C();
        if (w.lIlIlIlllIIllll(var27.distanceTo((Locatable)Players.getLocal()), lIIlIlIIllIll[3])) {
            n2 = lIIlIlIIllIll[1];
            0;
            if ((37 + 125 - 37 + 49 ^ 29 + 23 - -93 + 25) <= -1) {
                return ((1 + 28 - -143 + 25 ^ 88 + 131 - 167 + 84) & (0xD4 ^ 0xAA ^ (0x66 ^ 0x55) ^ -1)) != 0;
            }
        } else {
            n2 = var28 = lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllll(var10 - var20.ao, lIIlIlIIllIll[1]) && w.lIlIlIlllIlIIII(var20.ao, lIIlIlIIllIll[0]) && w.lIlIlIlllIIllIl(var28) && w.lIlIlIlllIIllIl(var20.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllIl(l.H() ? 1 : 0) && w.lIlIlIlllIIllII(var20.ap ? 1 : 0)) {
            var20.ap = lIIlIlIIllIll[1];
            var20.sleep(lIIlIlIIllIll[4]);
            return lIIlIlIIllIll[1];
        }
        if (w.lIlIlIlllIIllIl(var20.ap ? 1 : 0) && w.lIlIlIlllIIllIl(var20.aq ? 1 : 0)) {
            var20.aq = lIIlIlIIllIll[2];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        this.sleep(lIIlIlIIllIll[1]);
        return lIIlIlIIllIll[1];
    }

    @Inject
    public w(g g2, l l2) {
        this.ao = lIIlIlIIllIll[0];
        this.ap = lIIlIlIIllIll[1];
        this.am = g2;
        this.an = l2;
    }

    static {
        w.lIlIlIlllIIlIll();
        w.lIlIlIlllIIlIlI();
    }

    private static String lIlIlIlllIIIlll(String var18, String var24) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlIlIIllIll[6], var6);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlllIlIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIlIlllIIlIIl(String var9, String var17) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var2 = var17.toCharArray();
        int var13 = lIIlIlIIllIll[2];
        char[] var19 = var9.toCharArray();
        int var11 = var19.length;
        int var21 = lIIlIlIIllIll[2];
        while (w.lIlIlIlllIlIIll(var21, var11)) {
            char var15 = var19[var21];
            var26.append((char)(var15 ^ var2[var13 % var2.length]));
            0;
            ++var13;
            ++var21;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static void lIlIlIlllIIlIlI() {
        lIIlIlIIllIlI = new String[lIIlIlIIllIll[3]];
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[2]] = w."Commander Zilyana";
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[1]] = w."heals";
        w.lIIlIlIIllIlI[w.lIIlIlIIllIll[6]] = w."Commander Zilyana";
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
        void var4;
        if (w.lIlIlIlllIIllIl(chatMessage.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[1]]) ? 1 : 0)) {
            this.ao = Static.getClient().getTickCount() + lIIlIlIIllIll[3];
        }
        if (w.lIlIlIlllIIllIl(var4.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[6]]) ? 1 : 0)) {
            llllllllllllllIllllIlllllllIIlll.ap = lIIlIlIIllIll[2];
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
        void var14;
        if (w.lIlIlIlllIlIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (w.lIlIlIlllIlIIlI(var14.getActor().getAnimation(), lIIlIlIIllIll[5])) {
            llllllllllllllIllllIlllllllIllll.ao = Static.getClient().getTickCount();
        }
    }

    private static boolean lIlIlIlllIIllIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlllIIlIll() {
        lIIlIlIIllIll = new int[8];
        w.lIIlIlIIllIll[0] = -1;
        w.lIIlIlIIllIll[1] = 1;
        w.lIIlIlIIllIll[2] = (0x52 ^ 0x1C) & ~(0x4F ^ 1);
        w.lIIlIlIIllIll[3] = 3;
        w.lIIlIlIIllIll[4] = 41 + 23 - 56 + 162 ^ 46 + 82 - 94 + 140;
        w.lIIlIlIIllIll[5] = 0xFFFFF3AA & 0xDFF;
        w.lIIlIlIIllIll[6] = 2;
        w.lIIlIlIIllIll[7] = 0xF ^ 7;
    }

    private static boolean lIlIlIlllIIllII(int n2) {
        return n2 == 0;
    }
}

