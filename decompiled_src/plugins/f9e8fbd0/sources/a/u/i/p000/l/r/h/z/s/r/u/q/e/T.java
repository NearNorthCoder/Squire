package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking zulrah", priority = 35, register = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.T  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/T.class */
public class T extends ad {
    private static /* synthetic */ int[] lIllIlIIlllIl;
    private static /* synthetic */ String[] lIllIlIIlllII;
    private /* synthetic */ int ar;
    private final /* synthetic */ SquireZulrah aq;

    private static void llIIIlllllIIIlI() {
        lIllIlIIlllIl = new int[5];
        lIllIlIIlllIl[0] = " ".length();
        lIllIlIIlllIl[1] = (126 ^ 32) & ((5 ^ 91) ^ (-1));
        lIllIlIIlllIl[2] = (-8195) & 13266;
        lIllIlIIlllIl[3] = (((76 + 111) - 175) + 123) ^ (((10 + 68) - (-22)) + 43);
        lIllIlIIlllIl[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        if (llIIIlllllIIIll(this.aB.getTickCount() - this.az.Z(), lIllIlIIlllIl[0])) {
            return lIllIlIIlllIl[1];
        }
        String[] strArr = new String[lIllIlIIlllIl[0]];
        strArr[lIllIlIIlllIl[1]] = lIllIlIIlllII[lIllIlIIlllIl[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (llIIIlllllIIlII(nearest) && llIIIlllllIIlIl(nearest.getAnimation(), lIllIlIIlllIl[2]) && !llIIIlllllIIllI(nearest.isDead() ? 1 : 0)) {
            Player local = Players.getLocal();
            local.getWorldLocation();
            EnumC0010k C = this.az.V().C();
            if (llIIIlllllIIllI(local.isMoving() ? 1 : 0) && llIIIlllllIIlll(C, EnumC0010k.INITIAL)) {
                return lIllIlIIlllIl[1];
            }
            if (llIIIlllllIIlll(C, EnumC0010k.JAD_PHASE_W) && llIIIlllllIlIII(this.az.aa(), lIllIlIIlllIl[3])) {
                return lIllIlIIlllIl[1];
            }
            if (!llIIIlllllIlIIl(local.getInteracting()) || llIIIlllllIIIll(this.aB.getTickCount() - this.ar, lIllIlIIlllIl[0])) {
                return lIllIlIIlllIl[1];
            }
            if (llIIIlllllIIllI(local.isMoving() ? 1 : 0) && llIIIlllllIIlll(C, EnumC0010k.MAGMA_CENTER_NW)) {
                return lIllIlIIlllIl[1];
            }
            nearest.interact(lIllIlIIlllIl[0]);
            sleep(lIllIlIIlllIl[0]);
            return lIllIlIIlllIl[0];
        }
        return lIllIlIIlllIl[1];
    }

    private static boolean llIIIlllllIIlII(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlllllIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIlllllIlIIl(Object obj) {
        return obj == null;
    }

    private static String llIIIlllllIIIII(String llllllllllllllIllIIIlllIlIlIIIIl, String llllllllllllllIllIIIlllIlIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIlIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIIlllIl[3]), "DES");
            Cipher llllllllllllllIllIIIlllIlIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlllIlIlIIlIl.init(lIllIlIIlllIl[4], llllllllllllllIllIIIlllIlIlIIllI);
            return new String(llllllllllllllIllIIIlllIlIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllIlIlIIlII) {
            llllllllllllllIllIIIlllIlIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlllllIIIlI();
        llIIIlllllIIIIl();
    }

    private static boolean llIIIlllllIIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlllllIIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIlllllIIllI(int i) {
        return i != 0;
    }

    @Inject
    protected T(SquireZulrah squireZulrah, C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
        this.aq = squireZulrah;
    }

    private static void llIIIlllllIIIIl() {
        lIllIlIIlllII = new String[lIllIlIIlllIl[4]];
        lIllIlIIlllII[lIllIlIIlllIl[1]] = llIIIlllllIIIII("BvddqXSSRTc=", "WVMIB");
        lIllIlIIlllII[lIllIlIIlllIl[0]] = llIIIlllllIIIII("4L35MM3otnc=", "XYVUg");
    }

    private static boolean llIIIlllllIlIII(int i, int i2) {
        return i >= i2;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIlllllIIllI(chatMessage.getMessage().contains(lIllIlIIlllII[lIllIlIIlllIl[0]]) ? 1 : 0)) {
            this.ar = this.aB.getTickCount();
        }
    }
}
