package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Handling Warden Prayers", register = true, priority = Integer.MAX_VALUE)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aE  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aE.class */
public class aE extends W {
    private /* synthetic */ Prayer dE;
    private static /* synthetic */ int[] llIllIIIIll;
    private static /* synthetic */ String[] llIlIllllll;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIlIIIllIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIlIlIIIllIIIl(message.contains(llIlIllllll[llIllIIIIll[2]]) ? 1 : 0)) {
            this.dE = Prayer.PROTECT_FROM_MELEE;
            "".length();
            if (((230 ^ 164) ^ (212 ^ 146)) <= "  ".length()) {
            }
        } else if (!lIlIlIIIllIIIl(message.contains(llIlIllllll[llIllIIIIll[4]]) ? 1 : 0)) {
            if (lIlIlIIIllIIIl(message.contains(llIlIllllll[llIllIIIIll[1]]) ? 1 : 0)) {
                this.dE = Prayer.PROTECT_FROM_MISSILES;
            }
        } else {
            this.dE = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((-" ".length()) > ((140 ^ 182) & ((54 ^ 12) ^ (-1)))) {
            }
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIllIIIIll[0];
    }

    @Inject
    public aE(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static boolean lIlIlIIIllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIIlIllll(Object obj) {
        return obj == null;
    }

    private static String lIlIlIIIlIllII(String llllllllllllllllIIlIlllllIllIlll, String llllllllllllllllIIlIlllllIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIIIIll[1], llllllllllllllllIIlIlllllIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllllIlllIII) {
            llllllllllllllllIIlIlllllIlllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIIIlIlllI() {
        llIllIIIIll = new int[19];
        llIllIIIIll[0] = (-((-6423) & 23999)) & (-1) & 32760;
        llIllIIIIll[1] = "  ".length();
        llIllIIIIll[2] = (85 ^ 27) & ((212 ^ 154) ^ (-1));
        llIllIIIIll[3] = (-5) & 11774;
        llIllIIIIll[4] = " ".length();
        llIllIIIIll[5] = (-((-15401) & 32301)) & (-1) & 28671;
        llIllIIIIll[6] = 173 ^ 171;
        llIllIIIIll[7] = (-((-16971) & 21071)) & (-16401) & 32253;
        llIllIIIIll[8] = (-((-3074) & 7683)) & (-17) & 16379;
        llIllIIIIll[9] = (-((-21947) & 22459)) & (-1) & 12267;
        llIllIIIIll[10] = "   ".length();
        llIllIIIIll[11] = (-" ".length()) & (-16915) & 28670;
        llIllIIIIll[12] = (((107 + 116) - 115) + 71) ^ (((91 + 10) - (-62)) + 20);
        llIllIIIIll[13] = (-((-14657) & 31569)) & (-1) & 28669;
        llIllIIIIll[14] = (130 ^ 174) ^ (156 ^ 181);
        llIllIIIIll[15] = (-4625) & 16382;
        llIllIIIIll[16] = (-513) & 10172;
        llIllIIIIll[17] = (-((-8441) & 31483)) & (-65) & 32767;
        llIllIIIIll[18] = 117 ^ 125;
    }

    private static void lIlIlIIIlIllIl() {
        llIlIllllll = new String[llIllIIIIll[10]];
        llIlIllllll[llIllIIIIll[2]] = lIlIlIIIlIlIll("Fc/kw894I/jutRQtro+7aw==", "FhKsc");
        llIlIllllll[llIllIIIIll[4]] = lIlIlIIIlIlIll("6CAaF9JmNxM=", "ELxim");
        llIlIllllll[llIllIIIIll[1]] = lIlIlIIIlIllII("y9p6fsIN57s=", "OBhdm");
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    private static String lIlIlIIIlIlIll(String llllllllllllllllIIlIllllllIIIlII, String llllllllllllllllIIlIllllllIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllllIIIIll.getBytes(StandardCharsets.UTF_8)), llIllIIIIll[18]), "DES");
            Cipher llllllllllllllllIIlIllllllIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIllllllIIIllI.init(llIllIIIIll[1], secretKeySpec);
            return new String(llllllllllllllllIIlIllllllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllllllIIIlIl) {
            llllllllllllllllIIlIllllllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        int[] iArr = new int[llIllIIIIll[1]];
        iArr[llIllIIIIll[2]] = llIllIIIIll[3];
        iArr[llIllIIIIll[4]] = llIllIIIIll[5];
        if (lIlIlIIIllIIII(NPCs.getNearest(iArr))) {
            return llIllIIIIll[4];
        }
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr2 = new int[llIllIIIIll[6]];
        iArr2[llIllIIIIll[2]] = llIllIIIIll[7];
        iArr2[llIllIIIIll[4]] = llIllIIIIll[8];
        iArr2[llIllIIIIll[1]] = llIllIIIIll[9];
        iArr2[llIllIIIIll[10]] = llIllIIIIll[11];
        iArr2[llIllIIIIll[12]] = llIllIIIIll[13];
        iArr2[llIllIIIIll[14]] = llIllIIIIll[15];
        return squireAutoTOA.a(iArr2);
    }

    private static boolean lIlIlIIIllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return aL();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (lIlIlIIIllIIIl(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (!lIlIlIIIllIIlI(actor.getAnimation(), llIllIIIIll[16])) {
            if (lIlIlIIIllIIlI(actor.getAnimation(), llIllIIIIll[17])) {
                this.dE = Prayer.PROTECT_FROM_MAGIC;
                return;
            }
            return;
        }
        this.dE = Prayer.PROTECT_FROM_MISSILES;
        "".length();
        if (0 != 0) {
        }
    }

    static {
        lIlIlIIIlIlllI();
        lIlIlIIIlIllIl();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        return lIlIlIIIlIllll(this.dE) ? List.of(aQ()) : List.of(aQ(), this.dE);
    }
}
