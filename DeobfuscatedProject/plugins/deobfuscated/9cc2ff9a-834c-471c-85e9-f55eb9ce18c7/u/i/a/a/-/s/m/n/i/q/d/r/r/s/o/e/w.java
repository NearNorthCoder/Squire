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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Moving to next tile", priority=9, register=true)
@Singleton
public class w
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

    private static String lIlIlIlllIIlIII(String llllllllllllllIllllIllllllIIIlII, String llllllllllllllIllllIllllllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIllllllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllllIIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIIllIll[7]), "DES");
            Cipher llllllllllllllIllllIllllllIIlIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllllllIIlIII.init(lIIlIlIIllIll[6], llllllllllllllIllllIllllllIIlIIl);
            return new String(llllllllllllllIllllIllllllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllllllIIIlll) {
            llllllllllllllIllllIllllllIIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int llllllllllllllIllllIllllllllIIlI;
        int n2;
        w llllllllllllllIllllIlllllllllIII;
        if (w.lIlIlIlllIIllII(this.am.m() ? 1 : 0)) {
            this.aq = lIIlIlIIllIll[1];
            this.ap = lIIlIlIIllIll[1];
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllII(llllllllllllllIllllIlllllllllIII.am.l() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint llllllllllllllIllllIllllllllIlll = llllllllllllllIllllIlllllllllIII.an.N();
        if (w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllllIII.aq ? 1 : 0) && w.lIlIlIlllIIllII(llllllllllllllIllllIllllllllIlll.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllIllllIlllllllllIII.ap = lIIlIlIIllIll[1];
            Movement.walkTo((WorldPoint)llllllllllllllIllllIllllllllIlll);
            0;
            return lIIlIlIIllIll[1];
        }
        RegionPoint llllllllllllllIllllIllllllllIllI = llllllllllllllIllllIlllllllllIII.an.L();
        if (w.lIlIlIlllIIlllI(llllllllllllllIllllIllllllllIllI)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIlllI(Players.getLocal().getInteracting()) && w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllllIII.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        WorldPoint llllllllllllllIllllIllllllllIlIl = l.a(llllllllllllllIllllIllllllllIllI);
        if (w.lIlIlIlllIIlllI(llllllllllllllIllllIllllllllIlIl)) {
            return lIIlIlIIllIll[2];
        }
        int llllllllllllllIllllIllllllllIlII = Static.getClient().getTickCount();
        NPC llllllllllllllIllllIllllllllIIll = llllllllllllllIllllIlllllllllIII.am.t().C();
        if (w.lIlIlIlllIIllll(llllllllllllllIllllIllllllllIIll.distanceTo((Locatable)Players.getLocal()), lIIlIlIIllIll[3])) {
            n2 = lIIlIlIIllIll[1];
            0;
            if ((37 + 125 - 37 + 49 ^ 29 + 23 - -93 + 25) <= -1) {
                return ((1 + 28 - -143 + 25 ^ 88 + 131 - 167 + 84) & (0xD4 ^ 0xAA ^ (0x66 ^ 0x55) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllIllllIllllllllIIlI = lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllll(llllllllllllllIllllIllllllllIlII - llllllllllllllIllllIlllllllllIII.ao, lIIlIlIIllIll[1]) && w.lIlIlIlllIlIIII(llllllllllllllIllllIlllllllllIII.ao, lIIlIlIIllIll[0]) && w.lIlIlIlllIIllIl(llllllllllllllIllllIllllllllIIlI) && w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllllIII.an.P() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        }
        if (w.lIlIlIlllIIllIl(l.H() ? 1 : 0) && w.lIlIlIlllIIllII(llllllllllllllIllllIlllllllllIII.ap ? 1 : 0)) {
            llllllllllllllIllllIlllllllllIII.ap = lIIlIlIIllIll[1];
            llllllllllllllIllllIlllllllllIII.sleep(lIIlIlIIllIll[4]);
            return lIIlIlIIllIll[1];
        }
        if (w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllllIII.ap ? 1 : 0) && w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllllIII.aq ? 1 : 0)) {
            llllllllllllllIllllIlllllllllIII.aq = lIIlIlIIllIll[2];
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

    private static String lIlIlIlllIIIlll(String llllllllllllllIllllIlllllIlllIIl, String llllllllllllllIllllIlllllIlllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIlllllIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllllIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlllllIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlllllIlllIll.init(lIIlIlIIllIll[6], llllllllllllllIllllIlllllIllllII);
            return new String(llllllllllllllIllllIlllllIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlllllIlllIlI) {
            llllllllllllllIllllIlllllIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlllIlIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIlIlllIIlIIl(String llllllllllllllIllllIllllllIllIll, String llllllllllllllIllllIllllllIllIlI) {
        llllllllllllllIllllIllllllIllIll = new String(Base64.getDecoder().decode(llllllllllllllIllllIllllllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllllllIllIIl = new StringBuilder();
        char[] llllllllllllllIllllIllllllIllIII = llllllllllllllIllllIllllllIllIlI.toCharArray();
        int llllllllllllllIllllIllllllIlIlll = lIIlIlIIllIll[2];
        char[] llllllllllllllIllllIllllllIlIIIl = llllllllllllllIllllIllllllIllIll.toCharArray();
        int llllllllllllllIllllIllllllIlIIII = llllllllllllllIllllIllllllIlIIIl.length;
        int llllllllllllllIllllIllllllIIllll = lIIlIlIIllIll[2];
        while (w.lIlIlIlllIlIIll(llllllllllllllIllllIllllllIIllll, llllllllllllllIllllIllllllIlIIII)) {
            char llllllllllllllIllllIllllllIlllII = llllllllllllllIllllIllllllIlIIIl[llllllllllllllIllllIllllllIIllll];
            llllllllllllllIllllIllllllIllIIl.append((char)(llllllllllllllIllllIllllllIlllII ^ llllllllllllllIllllIllllllIllIII[llllllllllllllIllllIllllllIlIlll % llllllllllllllIllllIllllllIllIII.length]));
            0;
            ++llllllllllllllIllllIllllllIlIlll;
            ++llllllllllllllIllllIllllllIIllll;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllllllIllIIl);
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
        void llllllllllllllIllllIlllllllIIllI;
        if (w.lIlIlIlllIIllIl(chatMessage.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[1]]) ? 1 : 0)) {
            this.ao = Static.getClient().getTickCount() + lIIlIlIIllIll[3];
        }
        if (w.lIlIlIlllIIllIl(llllllllllllllIllllIlllllllIIllI.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[6]]) ? 1 : 0)) {
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
        void llllllllllllllIllllIlllllllIlllI;
        if (w.lIlIlIlllIlIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (w.lIlIlIlllIlIIlI(llllllllllllllIllllIlllllllIlllI.getActor().getAnimation(), lIIlIlIIllIll[5])) {
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

