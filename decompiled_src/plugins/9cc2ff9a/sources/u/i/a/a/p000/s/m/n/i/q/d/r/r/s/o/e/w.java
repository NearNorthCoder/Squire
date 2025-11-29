package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@Singleton
@TaskDesc(name = "Moving to next tile", priority = 9, register = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.w  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/w.class */
public class w extends Task {
    private static /* synthetic */ int[] lIIlIlIIllIll;
    private /* synthetic */ boolean aq;
    private final /* synthetic */ C0006g am;
    private final /* synthetic */ l an;
    private /* synthetic */ int ao = lIIlIlIIllIll[0];
    private /* synthetic */ boolean ap = lIIlIlIIllIll[1];
    private static /* synthetic */ String[] lIIlIlIIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIlIlIlllIIllII(npcSpawned.getNpc().getName().equals(lIIlIlIIllIlI[lIIlIlIIllIll[2]]) ? 1 : 0)) {
            return;
        }
        this.ap = lIIlIlIIllIll[2];
    }

    private static String lIlIlIlllIIlIII(String llllllllllllllIllllIllllllIIIllI, String llllllllllllllIllllIllllllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIllIll[7]), "DES");
            Cipher llllllllllllllIllllIllllllIIlIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllllllIIlIII.init(lIIlIlIIllIll[6], secretKeySpec);
            return new String(llllllllllllllIllllIllllllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllllllIIIlll) {
            llllllllllllllIllllIllllllIIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v51, types: [boolean] */
    public boolean run() {
        int i;
        if (lIlIlIlllIIllII(this.am.m() ? 1 : 0)) {
            this.aq = lIIlIlIIllIll[1];
            this.ap = lIIlIlIIllIll[1];
            return lIIlIlIIllIll[2];
        } else if (lIlIlIlllIIllII(this.am.l() ? 1 : 0)) {
            return lIIlIlIIllIll[2];
        } else {
            WorldPoint N = this.an.N();
            if (lIlIlIlllIIllIl(this.aq ? 1 : 0) && lIlIlIlllIIllII(N.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                this.ap = lIIlIlIIllIll[1];
                Movement.walkTo(N);
                "".length();
                return lIIlIlIIllIll[1];
            }
            RegionPoint L = this.an.L();
            if (lIlIlIlllIIlllI(L)) {
                return lIIlIlIIllIll[2];
            }
            if (lIlIlIlllIIlllI(Players.getLocal().getInteracting()) && lIlIlIlllIIllIl(this.an.P() ? 1 : 0)) {
                return lIIlIlIIllIll[2];
            }
            WorldPoint a = l.a(L);
            if (lIlIlIlllIIlllI(a)) {
                return lIIlIlIIllIll[2];
            }
            int tickCount = Static.getClient().getTickCount();
            if (lIlIlIlllIIllll(this.am.t().C().distanceTo(Players.getLocal()), lIIlIlIIllIll[3])) {
                i = lIIlIlIIllIll[1];
                "".length();
                if (((((37 + 125) - 37) + 49) ^ (((29 + 23) - (-93)) + 25)) <= (-" ".length())) {
                    return ((((1 + 28) - (-143)) + 25) ^ (((88 + 131) - 167) + 84)) & (((212 ^ 170) ^ (102 ^ 85)) ^ (-" ".length()));
                }
            } else {
                i = lIIlIlIIllIll[2];
            }
            int llllllllllllllIllllIllllllllIIlI = i;
            if (lIlIlIlllIIllll(tickCount - this.ao, lIIlIlIIllIll[1]) && lIlIlIlllIlIIII(this.ao, lIIlIlIIllIll[0]) && lIlIlIlllIIllIl(llllllllllllllIllllIllllllllIIlI) && lIlIlIlllIIllIl(this.an.P() ? 1 : 0)) {
                return lIIlIlIIllIll[2];
            }
            if (lIlIlIlllIIllIl(l.H() ? 1 : 0) && lIlIlIlllIIllII(this.ap ? 1 : 0)) {
                this.ap = lIIlIlIIllIll[1];
                sleep(lIIlIlIIllIll[4]);
                return lIIlIlIIllIll[1];
            }
            if (lIlIlIlllIIllIl(this.ap ? 1 : 0) && lIlIlIlllIIllIl(this.aq ? 1 : 0)) {
                this.aq = lIIlIlIIllIll[2];
            }
            Movement.walkTo(a);
            "".length();
            sleep(lIIlIlIIllIll[1]);
            return lIIlIlIIllIll[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public w(C0006g c0006g, l lVar) {
        this.am = c0006g;
        this.an = lVar;
    }

    static {
        lIlIlIlllIIlIll();
        lIlIlIlllIIlIlI();
    }

    private static String lIlIlIlllIIIlll(String llllllllllllllIllllIlllllIlllIIl, String llllllllllllllIllllIlllllIlllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIlllllIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllllIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIllIll[6], llllllllllllllIllllIlllllIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlllllIlllIlI) {
            llllllllllllllIllllIlllllIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIlIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlIlllIlIIII(int i, int i2) {
        return i != i2;
    }

    private static String lIlIlIlllIIlIIl(String llllllllllllllIllllIllllllIllIll, String llllllllllllllIllllIllllllIllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIllllllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllllllIllIIl = new StringBuilder();
        char[] llllllllllllllIllllIllllllIllIII = llllllllllllllIllllIllllllIllIlI.toCharArray();
        int llllllllllllllIllllIllllllIlIlll = lIIlIlIIllIll[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIIllIll[2];
        while (lIlIlIlllIlIIll(i, length)) {
            llllllllllllllIllllIllllllIllIIl.append((char) (charArray[i] ^ llllllllllllllIllllIllllllIllIII[llllllllllllllIllllIllllllIlIlll % llllllllllllllIllllIllllllIllIII.length]));
            "".length();
            llllllllllllllIllllIllllllIlIlll++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIllllllIllIIl);
    }

    private static void lIlIlIlllIIlIlI() {
        lIIlIlIIllIlI = new String[lIIlIlIIllIll[3]];
        lIIlIlIIllIlI[lIIlIlIIllIll[2]] = lIlIlIlllIIIlll("/W58Iy8Rt6I3Gf3QTqszsDFTSUw5EdfQ", "ADeCU");
        lIIlIlIIllIlI[lIIlIlIIllIll[1]] = lIlIlIlllIIlIII("/19Oz7bsGzk=", "Gylii");
        lIIlIlIIllIlI[lIIlIlIIllIll[6]] = lIlIlIlllIIlIIl("MjYMCicfPQQVZiswDR4nHzg=", "qYagF");
    }

    private static boolean lIlIlIlllIIlllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlllIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIlllIlIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIlIlllIIllIl(chatMessage.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[1]]) ? 1 : 0)) {
            this.ao = Static.getClient().getTickCount() + lIIlIlIIllIll[3];
        }
        if (lIlIlIlllIIllIl(chatMessage.getMessage().contains(lIIlIlIIllIlI[lIIlIlIIllIll[6]]) ? 1 : 0)) {
            this.ap = lIIlIlIIllIll[2];
        }
    }

    private static boolean lIlIlIlllIlIIlI(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (!lIlIlIlllIlIIIl(animationChanged.getActor(), Players.getLocal()) && lIlIlIlllIlIIlI(animationChanged.getActor().getAnimation(), lIIlIlIIllIll[5])) {
            this.ao = Static.getClient().getTickCount();
        }
    }

    private static boolean lIlIlIlllIIllIl(int i) {
        return i != 0;
    }

    private static void lIlIlIlllIIlIll() {
        lIIlIlIIllIll = new int[8];
        lIIlIlIIllIll[0] = -" ".length();
        lIIlIlIIllIll[1] = " ".length();
        lIIlIlIIllIll[2] = (82 ^ 28) & ((79 ^ 1) ^ (-1));
        lIIlIlIIllIll[3] = "   ".length();
        lIIlIlIIllIll[4] = (((41 + 23) - 56) + 162) ^ (((46 + 82) - 94) + 140);
        lIIlIlIIllIll[5] = (-3158) & 3583;
        lIIlIlIIllIll[6] = "  ".length();
        lIIlIlIIllIll[7] = 15 ^ 7;
    }

    private static boolean lIlIlIlllIIllII(int i) {
        return i == 0;
    }
}
