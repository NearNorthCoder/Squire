package m.e.a.i.z.m.r.p000.q.s.y.u;

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
import net.runelite.api.NPC;
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
@TaskDesc(name = "Moving to next tile", priority = 9, register = true)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.u  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/u.class */
public class u extends Task {
    private /* synthetic */ boolean am;
    private static /* synthetic */ String[] lIllIIlIIIllI;
    private /* synthetic */ boolean al;
    private final /* synthetic */ C0002c ai;
    private static /* synthetic */ int[] lIllIIlIIlIIl;
    private final /* synthetic */ l ah;
    private /* synthetic */ int aj = lIllIIlIIlIIl[0];
    private /* synthetic */ boolean ak = lIllIIlIIlIIl[1];

    private static boolean llIIIlIllllIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlIlllIllll(int i, int i2) {
        return i > i2;
    }

    private static void llIIIlIlllIlIlI() {
        lIllIIlIIIllI = new String[lIllIIlIIlIIl[3]];
        lIllIIlIIIllI[lIllIIlIIlIIl[2]] = llIIIlIlllIIlII("x94Zzd9u7QZrJUpbfJeScNwxzdCYWK3q", "EFyal");
        lIllIIlIIIllI[lIllIIlIIlIIl[1]] = llIIIlIlllIIlIl("5529ot7q1zw=", "ubixk");
        lIllIIlIIIllI[lIllIIlIIlIIl[6]] = llIIIlIlllIIlII("hX6NJ62NoEzFGY36SLTgTVBVO4lXGouZ", "cEwYi");
    }

    private static boolean llIIIlIllllIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlIlllIllIl(int i) {
        return i != 0;
    }

    private static String llIIIlIlllIIlIl(String llllllllllllllIllIIlIlIIlIIllIIl, String llllllllllllllIllIIlIlIIlIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIIlIIl[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIlIIllIlI) {
            llllllllllllllIllIIlIlIIlIIllIlI.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIlllIlIll();
        llIIIlIlllIlIlI();
    }

    public boolean O() {
        return this.al;
    }

    private static void llIIIlIlllIlIll() {
        lIllIIlIIlIIl = new int[8];
        lIllIIlIIlIIl[0] = -" ".length();
        lIllIIlIIlIIl[1] = " ".length();
        lIllIIlIIlIIl[2] = (28 ^ 58) & ((34 ^ 4) ^ (-1));
        lIllIIlIIlIIl[3] = "   ".length();
        lIllIIlIIlIIl[4] = 111 ^ 104;
        lIllIIlIIlIIl[5] = (-13314) & 13739;
        lIllIIlIIlIIl[6] = "  ".length();
        lIllIIlIIlIIl[7] = (180 ^ 154) ^ (115 ^ 85);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (llIIIlIlllIllII(this.ah.B() ? 1 : 0)) {
            this.am = lIllIIlIIlIIl[1];
            this.ak = lIllIIlIIlIIl[1];
            return lIllIIlIIlIIl[2];
        }
        if (!llIIIlIlllIllII(this.ah.G() ? 1 : 0) && !llIIIlIlllIllII(this.ah.A() ? 1 : 0)) {
            WorldPoint i = this.ai.i();
            if (llIIIlIlllIllIl(this.am ? 1 : 0) && llIIIlIlllIllII(i.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                this.ak = lIllIIlIIlIIl[1];
                Movement.walkTo(i);
                "".length();
                return lIllIIlIIlIIl[1];
            }
            RegionPoint d = this.ai.d();
            if (!llIIIlIlllIlllI(d) && !llIIIlIlllIlllI(Players.getLocal().getInteracting())) {
                WorldPoint a = C0002c.a(d);
                if (llIIIlIlllIlllI(a)) {
                    return lIllIIlIIlIIl[2];
                }
                int tickCount = Static.getClient().getTickCount();
                NPC m2 = this.ah.I().m();
                if (llIIIlIlllIllll(tickCount - this.aj, lIllIIlIIlIIl[1]) && llIIIlIllllIIII(this.aj, lIllIIlIIlIIl[0]) && llIIIlIlllIllll(m2.distanceTo(Players.getLocal()), lIllIIlIIlIIl[3])) {
                    return lIllIIlIIlIIl[2];
                }
                if (llIIIlIlllIllIl(C0002c.c() ? 1 : 0) && llIIIlIlllIllII(this.ak ? 1 : 0)) {
                    this.ak = lIllIIlIIlIIl[1];
                    sleep(lIllIIlIIlIIl[1]);
                    return lIllIIlIIlIIl[1];
                }
                if (llIIIlIlllIllIl(this.ak ? 1 : 0) && llIIIlIlllIllIl(this.am ? 1 : 0)) {
                    this.am = lIllIIlIIlIIl[2];
                }
                sleep(lIllIIlIIlIIl[1]);
                if (!llIIIlIlllIllIl(this.ai.f() ? 1 : 0)) {
                    Movement.walkTo(a);
                    "".length();
                    this.al = lIllIIlIIlIIl[2];
                    return lIllIIlIIlIIl[1];
                }
                int[] iArr = new int[lIllIIlIIlIIl[1]];
                iArr[lIllIIlIIlIIl[2]] = lIllIIlIIlIIl[4];
                TileObjects.getNearest(iArr).interact(lIllIIlIIlIIl[2]);
                this.al = lIllIIlIIlIIl[1];
                return lIllIIlIIlIIl[1];
            }
            return lIllIIlIIlIIl[2];
        }
        return lIllIIlIIlIIl[2];
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (!llIIIlIllllIIIl(animationChanged.getActor(), Players.getLocal()) && llIIIlIllllIIlI(animationChanged.getActor().getAnimation(), lIllIIlIIlIIl[5])) {
            this.aj = Static.getClient().getTickCount();
        }
    }

    private static boolean llIIIlIlllIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public u(l lVar, C0002c c0002c) {
        this.ah = lVar;
        this.ai = c0002c;
    }

    private static boolean llIIIlIlllIllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIlIlllIllIl(chatMessage.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[1]]) ? 1 : 0)) {
            this.aj = Static.getClient().getTickCount() + lIllIIlIIlIIl[3];
        }
        if (llIIIlIlllIllIl(chatMessage.getMessage().contains(lIllIIlIIIllI[lIllIIlIIlIIl[6]]) ? 1 : 0)) {
            this.ak = lIllIIlIIlIIl[2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (llIIIlIlllIllII(npcSpawned.getNpc().getName().equals(lIllIIlIIIllI[lIllIIlIIlIIl[2]]) ? 1 : 0)) {
            return;
        }
        this.ak = lIllIIlIIlIIl[2];
    }

    private static String llIIIlIlllIIlII(String llllllllllllllIllIIlIlIIlIlIIllI, String llllllllllllllIllIIlIlIIlIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIIl[7]), "DES");
            Cipher llllllllllllllIllIIlIlIIlIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIIlIlIlIII.init(lIllIIlIIlIIl[6], llllllllllllllIllIIlIlIIlIlIlIIl);
            return new String(llllllllllllllIllIIlIlIIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIlIlIIlll) {
            llllllllllllllIllIIlIlIIlIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllllIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }
}
