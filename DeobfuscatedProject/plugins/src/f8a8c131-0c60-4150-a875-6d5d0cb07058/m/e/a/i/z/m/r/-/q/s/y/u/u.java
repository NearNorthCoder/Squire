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
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
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
public class u
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
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[2]] = u.llIIIlIlllIIlII("x94Zzd9u7QZrJUpbfJeScNwxzdCYWK3q", "EFyal");
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[1]] = u.llIIIlIlllIIlIl("5529ot7q1zw=", "ubixk");
        u.lIllIIlIIIllI[u.lIllIIlIIlIIl[6]] = u.llIIIlIlllIIlII("hX6NJ62NoEzFGY36SLTgTVBVO4lXGouZ", "cEwYi");
    }

    private static boolean llIIIlIllllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIlllIllIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIlIlllIIlIl(String llllllllllllllIllIIlIlIIlIIllIIl, String llllllllllllllIllIIlIlIIlIIllIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIIlIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIIlIIllIll.init(lIllIIlIIlIIl[6], llllllllllllllIllIIlIlIIlIIlllII);
            return new String(llllllllllllllIllIIlIlIIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIIlIIllIlI) {
            llllllllllllllIllIIlIlIIlIIllIlI.printStackTrace();
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
        u.lIllIIlIIlIIl[0] = -" ".length();
        u.lIllIIlIIlIIl[1] = " ".length();
        u.lIllIIlIIlIIl[2] = (0x1C ^ 0x3A) & ~(0x22 ^ 4);
        u.lIllIIlIIlIIl[3] = "   ".length();
        u.lIllIIlIIlIIl[4] = 0x6F ^ 0x68;
        u.lIllIIlIIlIIl[5] = 0xFFFFCBFE & 0x35AB;
        u.lIllIIlIIlIIl[6] = "  ".length();
        u.lIllIIlIIlIIl[7] = 0xB4 ^ 0x9A ^ (0x73 ^ 0x55);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u llllllllllllllIllIIlIlIIllIIIIII;
        if (u.llIIIlIlllIllII(this.ah.B() ? 1 : 0)) {
            this.am = lIllIIlIIlIIl[1];
            this.ak = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(llllllllllllllIllIIlIlIIllIIIIII.ah.G() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllII(llllllllllllllIllIIlIlIIllIIIIII.ah.A() ? 1 : 0)) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint llllllllllllllIllIIlIlIIlIllllll = llllllllllllllIllIIlIlIIllIIIIII.ai.i();
        if (u.llIIIlIlllIllIl(llllllllllllllIllIIlIlIIllIIIIII.am ? 1 : 0) && u.llIIIlIlllIllII(llllllllllllllIllIIlIlIIlIllllll.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllIllIIlIlIIllIIIIII.ak = lIllIIlIIlIIl[1];
            Movement.walkTo((WorldPoint)llllllllllllllIllIIlIlIIlIllllll);
            "".length();
            return lIllIIlIIlIIl[1];
        }
        RegionPoint llllllllllllllIllIIlIlIIlIlllllI = llllllllllllllIllIIlIlIIllIIIIII.ai.d();
        if (u.llIIIlIlllIlllI(llllllllllllllIllIIlIlIIlIlllllI)) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIlllI(Players.getLocal().getInteracting())) {
            return lIllIIlIIlIIl[2];
        }
        WorldPoint llllllllllllllIllIIlIlIIlIllllIl = c.a(llllllllllllllIllIIlIlIIlIlllllI);
        if (u.llIIIlIlllIlllI(llllllllllllllIllIIlIlIIlIllllIl)) {
            return lIllIIlIIlIIl[2];
        }
        int llllllllllllllIllIIlIlIIlIllllII = Static.getClient().getTickCount();
        NPC llllllllllllllIllIIlIlIIlIlllIll = llllllllllllllIllIIlIlIIllIIIIII.ah.I().m();
        if (u.llIIIlIlllIllll(llllllllllllllIllIIlIlIIlIllllII - llllllllllllllIllIIlIlIIllIIIIII.aj, lIllIIlIIlIIl[1]) && u.llIIIlIllllIIII(llllllllllllllIllIIlIlIIllIIIIII.aj, lIllIIlIIlIIl[0]) && u.llIIIlIlllIllll(llllllllllllllIllIIlIlIIlIlllIll.distanceTo((Locatable)Players.getLocal()), lIllIIlIIlIIl[3])) {
            return lIllIIlIIlIIl[2];
        }
        if (u.llIIIlIlllIllIl(c.c() ? 1 : 0) && u.llIIIlIlllIllII(llllllllllllllIllIIlIlIIllIIIIII.ak ? 1 : 0)) {
            llllllllllllllIllIIlIlIIllIIIIII.ak = lIllIIlIIlIIl[1];
            llllllllllllllIllIIlIlIIllIIIIII.sleep(lIllIIlIIlIIl[1]);
            return lIllIIlIIlIIl[1];
        }
        if (u.llIIIlIlllIllIl(llllllllllllllIllIIlIlIIllIIIIII.ak ? 1 : 0) && u.llIIIlIlllIllIl(llllllllllllllIllIIlIlIIllIIIIII.am ? 1 : 0)) {
            llllllllllllllIllIIlIlIIllIIIIII.am = lIllIIlIIlIIl[2];
        }
        llllllllllllllIllIIlIlIIllIIIIII.sleep(lIllIIlIIlIIl[1]);
        if (u.llIIIlIlllIllIl(llllllllllllllIllIIlIlIIllIIIIII.ai.f() ? 1 : 0)) {
            int[] nArray = new int[lIllIIlIIlIIl[1]];
            nArray[u.lIllIIlIIlIIl[2]] = lIllIIlIIlIIl[4];
            TileObject llllllllllllllIllIIlIlIIlIlllIlI = TileObjects.getNearest((int[])nArray);
            llllllllllllllIllIIlIlIIlIlllIlI.interact(lIllIIlIIlIIl[2]);
            llllllllllllllIllIIlIlIIllIIIIII.al = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[1];
        }
        Movement.walkTo((WorldPoint)var3_3);
        "".length();
        this.al = lIllIIlIIlIIl[2];
        return lIllIIlIIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllIllIIlIlIIlIllIllI;
        if (u.llIIIlIllllIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (u.llIIIlIllllIIlI(llllllllllllllIllIIlIlIIlIllIllI.getActor().getAnimation(), lIllIIlIIlIIl[5])) {
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
        void llllllllllllllIllIIlIlIIlIlIlllI;
        if (u.llIIIlIlllIllIl(chatMessage.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[1]]) ? 1 : 0)) {
            this.aj = Static.getClient().getTickCount() + lIllIIlIIlIIl[3];
        }
        if (u.llIIIlIlllIllIl(llllllllllllllIllIIlIlIIlIlIlllI.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[6]]) ? 1 : 0)) {
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

    private static String llIIIlIlllIIlII(String llllllllllllllIllIIlIlIIlIlIIllI, String llllllllllllllIllIIlIlIIlIlIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIIl[7]), "DES");
            Cipher llllllllllllllIllIIlIlIIlIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIIlIlIlIII.init(lIllIIlIIlIIl[6], llllllllllllllIllIIlIlIIlIlIlIIl);
            return new String(llllllllllllllIllIIlIlIIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIIlIlIIlll) {
            llllllllllllllIllIIlIlIIlIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllllIIIl(Object object, Object object2) {
        return object != object2;
    }
}

