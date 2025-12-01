package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling Warden Prayers", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.G  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/G.class */
public class G extends z {
    private static /* synthetic */ String[] lIIllllllllIl;
    private /* synthetic */ Prayer ba;
    private static /* synthetic */ int[] lIIlllllllllI;

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIIlllllllllI[1]];
        iArr[lIIlllllllllI[2]] = lIIlllllllllI[3];
        iArr[lIIlllllllllI[4]] = lIIlllllllllI[5];
        iArr[lIIlllllllllI[6]] = lIIlllllllllI[7];
        iArr[lIIlllllllllI[8]] = lIIlllllllllI[9];
        iArr[lIIlllllllllI[10]] = lIIlllllllllI[11];
        iArr[lIIlllllllllI[12]] = lIIlllllllllI[13];
        return squireTOA.a(iArr);
    }

    private static void lIllIlIllIIllII() {
        lIIlllllllllI = new int[17];
        lIIlllllllllI[0] = (-143) & 15326;
        lIIlllllllllI[1] = 80 ^ 86;
        lIIlllllllllI[2] = (10 ^ 6) & ((145 ^ 157) ^ (-1));
        lIIlllllllllI[3] = (-((-25761) & 30385)) & (-5) & 16381;
        lIIlllllllllI[4] = " ".length();
        lIIlllllllllI[5] = (-((-18474) & 23103)) & (-1) & 16383;
        lIIlllllllllI[6] = "  ".length();
        lIIlllllllllI[7] = (-(39 ^ 50)) & (-1) & 11775;
        lIIlllllllllI[8] = "   ".length();
        lIIlllllllllI[9] = (-((-10277) & 31287)) & (-2) & 32767;
        lIIlllllllllI[10] = 53 ^ 49;
        lIIlllllllllI[11] = (-((-25733) & 30359)) & (-1) & 16383;
        lIIlllllllllI[12] = 103 ^ 98;
        lIIlllllllllI[13] = (-"  ".length()) & (-20481) & 32239;
        lIIlllllllllI[14] = (-6145) & 15804;
        lIIlllllllllI[15] = (-20995) & 30655;
        lIIlllllllllI[16] = (116 ^ 43) ^ (79 ^ 24);
    }

    private static String lIllIlIllIIlIlI(String llllllllllllllIlllIIlllIIllllIlI, String llllllllllllllIlllIIlllIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIlllllllllI[16]), "DES");
            Cipher llllllllllllllIlllIIlllIIlllllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIlllIIlllllII.init(lIIlllllllllI[6], llllllllllllllIlllIIlllIIlllllIl);
            return new String(llllllllllllllIlllIIlllIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllIIllllIll) {
            llllllllllllllIlllIIlllIIllllIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        return lIllIlIllIIllIl(this.ba) ? List.of(H()) : List.of(H(), this.ba);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return C();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayFlickWarden();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (lIllIlIllIIlllI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (!lIllIlIllIIllll(actor.getAnimation(), lIIlllllllllI[14])) {
            if (lIllIlIllIIllll(actor.getAnimation(), lIIlllllllllI[15])) {
                this.ba = Prayer.PROTECT_FROM_MAGIC;
                return;
            }
            return;
        }
        this.ba = Prayer.PROTECT_FROM_MISSILES;
        "".length();
        if (0 != 0) {
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIlIllIlIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllIlllIIlllIlIIIIIlI = chatMessage.getMessage();
        if (lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[2]]) ? 1 : 0)) {
            this.ba = Prayer.PROTECT_FROM_MELEE;
            "".length();
            if (" ".length() < 0) {
            }
        } else if (!lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[4]]) ? 1 : 0)) {
            if (lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[6]]) ? 1 : 0)) {
                this.ba = Prayer.PROTECT_FROM_MISSILES;
            }
        } else {
            this.ba = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ("  ".length() < ((91 ^ 107) & ((47 ^ 31) ^ (-1)))) {
            }
        }
    }

    private static boolean lIllIlIllIIllll(int i, int i2) {
        return i == i2;
    }

    private static void lIllIlIllIIlIll() {
        lIIllllllllIl = new String[lIIlllllllllI[8]];
        lIIllllllllIl[lIIlllllllllI[2]] = lIllIlIllIIlIlI("epR5NeKeWfcuiwiDOeVIYQ==", "CkuaX");
        lIIllllllllIl[lIIlllllllllI[4]] = lIllIlIllIIlIlI("wQ6+jX6R2YU=", "DVTwi");
        lIIllllllllIl[lIIlllllllllI[6]] = lIllIlIllIIlIlI("Db2eVs+OfK0=", "JtIuW");
    }

    private static boolean lIllIlIllIlIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIlIllIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIllIIlllI(int i) {
        return i != 0;
    }

    static {
        lIllIlIllIIllII();
        lIllIlIllIIlIll();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIIlllllllllI[0];
    }

    @Inject
    public G(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }
}
