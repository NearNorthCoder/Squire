package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.r  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/r.class */
public class r extends Task {
    private final /* synthetic */ d ad;
    private /* synthetic */ boolean ah;
    private static /* synthetic */ String[] llIlllIlIIl;
    private /* synthetic */ int ae = llIlllIlIll[0];
    private /* synthetic */ boolean af = llIlllIlIll[1];
    private final /* synthetic */ e ac;
    private static /* synthetic */ int[] llIlllIlIll;
    private /* synthetic */ boolean ag;

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (!lIlIlIlllIIIll(animationChanged.getActor(), Players.getLocal()) && lIlIlIlllIIlII(animationChanged.getActor().getAnimation(), llIlllIlIll[6])) {
            this.ae = Static.getClient().getTickCount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIlIlIllIlllIl(npcSpawned.getNpc().getName().equals(llIlllIlIIl[llIlllIlIll[2]]) ? 1 : 0)) {
            return;
        }
        this.af = llIlllIlIll[2];
    }

    private static boolean lIlIlIlllIIlII(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlIllIllIll() {
        llIlllIlIll = new int[8];
        llIlllIlIll[0] = -" ".length();
        llIlllIlIll[1] = " ".length();
        llIlllIlIll[2] = ((((106 + 47) - 122) + 162) ^ (((73 + 8) - (-35)) + 38)) & (((((89 + 161) - 90) + 58) ^ (((11 + 48) - 43) + 113)) ^ (-" ".length()));
        llIlllIlIll[3] = "   ".length();
        llIlllIlIll[4] = (147 ^ 153) ^ (105 ^ 103);
        llIlllIlIll[5] = 82 ^ 85;
        llIlllIlIll[6] = (-((-20501) & 32342)) & (-4101) & 16367;
        llIlllIlIll[7] = "  ".length();
    }

    private static boolean lIlIlIllIllllI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlllIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public r(e eVar, d dVar) {
        this.ac = eVar;
        this.ad = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public boolean run() {
        if (lIlIlIllIlllIl(this.ac.t() ? 1 : 0)) {
            this.ah = llIlllIlIll[1];
            this.af = llIlllIlIll[1];
            return llIlllIlIll[2];
        }
        if (!lIlIlIllIlllIl(this.ac.y() ? 1 : 0) && !lIlIlIllIlllIl(this.ac.s() ? 1 : 0)) {
            WorldPoint p = this.ad.p();
            if (lIlIlIllIllllI(this.ah ? 1 : 0) && lIlIlIllIlllIl(p.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                this.af = llIlllIlIll[1];
                Movement.setDestination(p);
                return llIlllIlIll[1];
            }
            RegionPoint k = this.ad.k();
            if (lIlIlIllIlllll(k)) {
                if (lIlIlIllIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIlllIlIll[2];
                }
                WorldPoint l = this.ad.l();
                if (lIlIlIlllIIIII(l)) {
                    Movement.setDestination(l);
                    return llIlllIlIll[1];
                }
                return llIlllIlIll[2];
            } else if (lIlIlIllIlllll(Players.getLocal().getInteracting())) {
                return llIlllIlIll[2];
            } else {
                WorldPoint a = d.a(k);
                if (lIlIlIllIlllll(a)) {
                    return llIlllIlIll[2];
                }
                int tickCount = Static.getClient().getTickCount();
                NPC c = this.ac.z().c();
                if (lIlIlIlllIIIIl(tickCount - this.ae, llIlllIlIll[1]) && lIlIlIlllIIIlI(this.ae, llIlllIlIll[0]) && lIlIlIlllIIIIl(c.distanceTo(Players.getLocal()), llIlllIlIll[3])) {
                    return llIlllIlIll[2];
                }
                if (lIlIlIllIllllI(d.j() ? 1 : 0) && lIlIlIllIlllIl(this.af ? 1 : 0)) {
                    this.af = llIlllIlIll[1];
                    sleep(llIlllIlIll[4]);
                    return llIlllIlIll[1];
                }
                if (lIlIlIllIllllI(this.af ? 1 : 0) && lIlIlIllIllllI(this.ah ? 1 : 0)) {
                    this.ah = llIlllIlIll[2];
                }
                sleep(llIlllIlIll[1]);
                if (!lIlIlIllIllllI(this.ad.n() ? 1 : 0)) {
                    Movement.setDestination(a);
                    this.ag = llIlllIlIll[2];
                    return llIlllIlIll[1];
                }
                int[] iArr = new int[llIlllIlIll[1]];
                iArr[llIlllIlIll[2]] = llIlllIlIll[5];
                TileObjects.getNearest(iArr).interact(llIlllIlIll[2]);
                this.ag = llIlllIlIll[1];
                return llIlllIlIll[1];
            }
        }
        return llIlllIlIll[2];
    }

    private static boolean lIlIlIlllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIlIlIllIlIlll(String llllllllllllllllIIlIlIlIlIllIlII, String llllllllllllllllIIlIlIlIlIllIIll) {
        String llllllllllllllllIIlIlIlIlIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIlIllIIIl = llllllllllllllllIIlIlIlIlIllIIll.toCharArray();
        int llllllllllllllllIIlIlIlIlIllIIII = llIlllIlIll[2];
        char[] charArray = llllllllllllllllIIlIlIlIlIllIlII2.toCharArray();
        int length = charArray.length;
        int i = llIlllIlIll[2];
        while (lIlIlIlllIIlIl(i, length)) {
            char llllllllllllllllIIlIlIlIlIllIlIl = charArray[i];
            sb.append((char) (llllllllllllllllIIlIlIlIlIllIlIl ^ llllllllllllllllIIlIlIlIlIllIIIl[llllllllllllllllIIlIlIlIlIllIIII % llllllllllllllllIIlIlIlIlIllIIIl.length]));
            "".length();
            llllllllllllllllIIlIlIlIlIllIIII++;
            i++;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlllIIIlI(int i, int i2) {
        return i != i2;
    }

    public boolean O() {
        return this.ag;
    }

    static {
        lIlIlIllIllIll();
        lIlIlIllIllIII();
    }

    private static boolean lIlIlIllIlllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlllIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIlIlIllIlIllI(String llllllllllllllllIIlIlIlIlIIlllll, String llllllllllllllllIIlIlIlIlIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIlIll[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIlIlIIIII) {
            llllllllllllllllIIlIlIlIlIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIllIlllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIlIllIllllI(chatMessage.getMessage().contains(llIlllIlIIl[llIlllIlIll[1]]) ? 1 : 0)) {
            this.ae = Static.getClient().getTickCount() + llIlllIlIll[3];
        }
        if (lIlIlIllIllllI(chatMessage.getMessage().contains(llIlllIlIIl[llIlllIlIll[7]]) ? 1 : 0)) {
            this.af = llIlllIlIll[2];
        }
    }

    private static void lIlIlIllIllIII() {
        llIlllIlIIl = new String[llIlllIlIll[3]];
        llIlllIlIIl[llIlllIlIll[2]] = lIlIlIllIlIllI("tTCt4x/sjpm+65U+kM6SZWRjnKQrLtH8", "GoIhm");
        llIlllIlIIl[llIlllIlIll[1]] = lIlIlIllIlIllI("VY44RvMvcuA=", "MUkeO");
        llIlllIlIIl[llIlllIlIll[7]] = lIlIlIllIlIlll("Lg0eLTsIBFAPOwg=", "ihpHI");
    }
}
