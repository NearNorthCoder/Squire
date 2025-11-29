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
import q.s.r.i.e.s.o.u.a.d.n.-.b.d;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class r
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
        void llllllllllllllllIIlIlIlIllIIIlll;
        if (r.lIlIlIlllIIIll(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (r.lIlIlIlllIIlII(llllllllllllllllIIlIlIlIllIIIlll.getActor().getAnimation(), llIlllIlIll[6])) {
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
        r llllllllllllllllIIlIlIlIllIlIIIl;
        if (r.lIlIlIllIlllIl(this.ac.t() ? 1 : 0)) {
            this.ah = llIlllIlIll[1];
            this.af = llIlllIlIll[1];
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(llllllllllllllllIIlIlIlIllIlIIIl.ac.y() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllIl(llllllllllllllllIIlIlIlIllIlIIIl.ac.s() ? 1 : 0)) {
            return llIlllIlIll[2];
        }
        WorldPoint llllllllllllllllIIlIlIlIllIlIIII = llllllllllllllllIIlIlIlIllIlIIIl.ad.p();
        if (r.lIlIlIllIllllI(llllllllllllllllIIlIlIlIllIlIIIl.ah ? 1 : 0) && r.lIlIlIllIlllIl(llllllllllllllllIIlIlIlIllIlIIII.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllllIIlIlIlIllIlIIIl.af = llIlllIlIll[1];
            Movement.setDestination((WorldPoint)llllllllllllllllIIlIlIlIllIlIIII);
            return llIlllIlIll[1];
        }
        RegionPoint llllllllllllllllIIlIlIlIllIIllll = llllllllllllllllIIlIlIlIllIlIIIl.ad.k();
        if (r.lIlIlIllIlllll(llllllllllllllllIIlIlIlIllIIllll)) {
            if (r.lIlIlIllIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlllIlIll[2];
            }
            WorldPoint llllllllllllllllIIlIlIlIllIIlllI = llllllllllllllllIIlIlIlIllIlIIIl.ad.l();
            if (r.lIlIlIlllIIIII(llllllllllllllllIIlIlIlIllIIlllI)) {
                Movement.setDestination((WorldPoint)llllllllllllllllIIlIlIlIllIIlllI);
                return llIlllIlIll[1];
            }
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIlllll(Players.getLocal().getInteracting())) {
            return llIlllIlIll[2];
        }
        WorldPoint llllllllllllllllIIlIlIlIllIIlllI = d.a(llllllllllllllllIIlIlIlIllIIllll);
        if (r.lIlIlIllIlllll(llllllllllllllllIIlIlIlIllIIlllI)) {
            return llIlllIlIll[2];
        }
        int llllllllllllllllIIlIlIlIllIIllIl = Static.getClient().getTickCount();
        NPC llllllllllllllllIIlIlIlIllIIllII = llllllllllllllllIIlIlIlIllIlIIIl.ac.z().c();
        if (r.lIlIlIlllIIIIl(llllllllllllllllIIlIlIlIllIIllIl - llllllllllllllllIIlIlIlIllIlIIIl.ae, llIlllIlIll[1]) && r.lIlIlIlllIIIlI(llllllllllllllllIIlIlIlIllIlIIIl.ae, llIlllIlIll[0]) && r.lIlIlIlllIIIIl(llllllllllllllllIIlIlIlIllIIllII.distanceTo((Locatable)Players.getLocal()), llIlllIlIll[3])) {
            return llIlllIlIll[2];
        }
        if (r.lIlIlIllIllllI(d.j() ? 1 : 0) && r.lIlIlIllIlllIl(llllllllllllllllIIlIlIlIllIlIIIl.af ? 1 : 0)) {
            llllllllllllllllIIlIlIlIllIlIIIl.af = llIlllIlIll[1];
            llllllllllllllllIIlIlIlIllIlIIIl.sleep(llIlllIlIll[4]);
            return llIlllIlIll[1];
        }
        if (r.lIlIlIllIllllI(llllllllllllllllIIlIlIlIllIlIIIl.af ? 1 : 0) && r.lIlIlIllIllllI(llllllllllllllllIIlIlIlIllIlIIIl.ah ? 1 : 0)) {
            llllllllllllllllIIlIlIlIllIlIIIl.ah = llIlllIlIll[2];
        }
        llllllllllllllllIIlIlIlIllIlIIIl.sleep(llIlllIlIll[1]);
        if (r.lIlIlIllIllllI(llllllllllllllllIIlIlIlIllIlIIIl.ad.n() ? 1 : 0)) {
            int[] nArray = new int[llIlllIlIll[1]];
            nArray[r.llIlllIlIll[2]] = llIlllIlIll[5];
            TileObject llllllllllllllllIIlIlIlIllIIlIll = TileObjects.getNearest((int[])nArray);
            llllllllllllllllIIlIlIlIllIIlIll.interact(llIlllIlIll[2]);
            llllllllllllllllIIlIlIlIllIlIIIl.ag = llIlllIlIll[1];
            return llIlllIlIll[1];
        }
        Movement.setDestination((WorldPoint)var3_4);
        this.ag = llIlllIlIll[2];
        return llIlllIlIll[1];
    }

    private static boolean lIlIlIlllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIlIllIlIlll(String llllllllllllllllIIlIlIlIlIlIllll, String llllllllllllllllIIlIlIlIlIlIlllI) {
        llllllllllllllllIIlIlIlIlIlIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIlIllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIlIllIIIl = llllllllllllllllIIlIlIlIlIlIlllI.toCharArray();
        int llllllllllllllllIIlIlIlIlIllIIII = llIlllIlIll[2];
        char[] llllllllllllllllIIlIlIlIlIlIlIlI = llllllllllllllllIIlIlIlIlIlIllll.toCharArray();
        int llllllllllllllllIIlIlIlIlIlIlIIl = llllllllllllllllIIlIlIlIlIlIlIlI.length;
        int llllllllllllllllIIlIlIlIlIlIlIII = llIlllIlIll[2];
        while (r.lIlIlIlllIIlIl(llllllllllllllllIIlIlIlIlIlIlIII, llllllllllllllllIIlIlIlIlIlIlIIl)) {
            char llllllllllllllllIIlIlIlIlIllIlIl = llllllllllllllllIIlIlIlIlIlIlIlI[llllllllllllllllIIlIlIlIlIlIlIII];
            llllllllllllllllIIlIlIlIlIllIIlI.append((char)(llllllllllllllllIIlIlIlIlIllIlIl ^ llllllllllllllllIIlIlIlIlIllIIIl[llllllllllllllllIIlIlIlIlIllIIII % llllllllllllllllIIlIlIlIlIllIIIl.length]));
            0;
            ++llllllllllllllllIIlIlIlIlIllIIII;
            ++llllllllllllllllIIlIlIlIlIlIlIII;
            0;
            if (2 >= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIlIlIllIIlI);
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

    private static String lIlIlIllIlIllI(String llllllllllllllllIIlIlIlIlIIlllIl, String llllllllllllllllIIlIlIlIlIIlllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIlIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIlIlIIIIl.init(llIlllIlIll[7], llllllllllllllllIIlIlIlIlIlIIIlI);
            return new String(llllllllllllllllIIlIlIlIlIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIlIlIIIII) {
            llllllllllllllllIIlIlIlIlIlIIIII.printStackTrace();
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
        void llllllllllllllllIIlIlIlIlIllllll;
        if (r.lIlIlIllIllllI(chatMessage.getMessage().contains(llIlllIlIIl[llIlllIlIll[1]]) ? 1 : 0)) {
            this.ae = Static.getClient().getTickCount() + llIlllIlIll[3];
        }
        if (r.lIlIlIllIllllI(llllllllllllllllIIlIlIlIlIllllll.getMessage().contains(llIlllIlIIl[llIlllIlIll[7]]) ? 1 : 0)) {
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

