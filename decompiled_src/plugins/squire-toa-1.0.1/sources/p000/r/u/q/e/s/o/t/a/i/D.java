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
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling Akkha Prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.D  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/D.class */
public class D extends z {
    private static /* synthetic */ int[] lIlIIIIIllIII;
    private static /* synthetic */ String[] lIlIIIIIlIlll;
    private /* synthetic */ Prayer aY;
    private /* synthetic */ int aZ;
    private /* synthetic */ Prayer aX;

    private static boolean lIllIllIIlIIlIl(int i) {
        return i > 0;
    }

    private static boolean lIllIllIIlIlIIl(int i) {
        return i != 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIlIIIIIllIII[5]];
        iArr[lIlIIIIIllIII[1]] = lIlIIIIIllIII[6];
        iArr[lIlIIIIIllIII[0]] = lIlIIIIIllIII[7];
        iArr[lIlIIIIIllIII[8]] = lIlIIIIIllIII[9];
        iArr[lIlIIIIIllIII[10]] = lIlIIIIIllIII[3];
        return squireTOA.a(iArr);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayerFlickAkkha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return lIlIIIIIllIII[0];
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIlIIIIIllIII[4];
    }

    static {
        lIllIllIIlIIIlI();
        lIllIllIIlIIIIl();
    }

    private static boolean lIllIllIIlIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIllIIlIIlII(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        int i;
        String[] strArr = new String[lIlIIIIIllIII[0]];
        strArr[lIlIIIIIllIII[1]] = lIlIIIIIlIlll[lIlIIIIIllIII[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIllIllIIlIIIll(nearest)) {
            return List.of(H());
        }
        if (lIllIllIIlIIlII(Static.getClient().getTickCount(), this.aZ)) {
            this.aX = this.aY;
        }
        int[] iArr = new int[lIlIIIIIllIII[0]];
        iArr[lIlIIIIIllIII[1]] = lIlIIIIIllIII[2];
        if (lIllIllIIlIIlIl(Projectiles.getAll(iArr).size())) {
            i = lIlIIIIIllIII[0];
            "".length();
            if ((true ^ true) == ((true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true))) {
                return null;
            }
        } else {
            i = lIlIIIIIllIII[1];
        }
        if (lIllIllIIlIIllI(i) && lIllIllIIlIIlll(this.aY, Prayer.PROTECT_FROM_MELEE) && lIllIllIIlIIllI(nearest.isAnimating() ? 1 : 0)) {
            this.aX = this.aY;
        }
        if (lIllIllIIlIlIII(nearest.getId(), lIlIIIIIllIII[3])) {
            this.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(H(), this.aX);
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (lIllIllIIlIlIIl(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (lIllIllIIlIlIlI(actor.getId(), lIlIIIIIllIII[6]) && lIllIllIIlIlIlI(actor.getId(), lIlIIIIIllIII[7]) && lIllIllIIlIlIlI(actor.getId(), lIlIIIIIllIII[9])) {
            return;
        }
        if (lIllIllIIlIlIII(actor.getAnimation(), lIlIIIIIllIII[11])) {
            this.aX = Prayer.PROTECT_FROM_MELEE;
        }
        if (lIllIllIIlIlIII(actor.getAnimation(), lIlIIIIIllIII[12])) {
            this.aX = Prayer.PROTECT_FROM_MISSILES;
        }
        if (lIllIllIIlIlIII(actor.getAnimation(), lIlIIIIIllIII[13])) {
            this.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        this.aZ = Static.getClient().getTickCount() + lIlIIIIIllIII[5];
    }

    private static boolean lIllIllIIlIIllI(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC npc = npcChanged.getNpc();
        if (lIllIllIIlIlIII(npc.getId(), lIlIIIIIllIII[6])) {
            this.aY = Prayer.PROTECT_FROM_MELEE;
            "".length();
            if (((((24 + 134) - 49) + 56) ^ (((127 + 101) - 158) + 91)) == "  ".length()) {
            }
        } else if (!lIllIllIIlIlIII(npc.getId(), lIlIIIIIllIII[7])) {
            if (lIllIllIIlIlIII(npc.getId(), lIlIIIIIllIII[9])) {
                this.aY = Prayer.PROTECT_FROM_MAGIC;
            }
        } else {
            this.aY = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((-" ".length()) == (((((74 + 18) - 42) + 99) ^ (((17 + 47) - (-40)) + 92)) & (((((205 + 187) - 141) + 4) ^ (((119 + 39) - 64) + 80)) ^ (-" ".length())))) {
            }
        }
    }

    private static boolean lIllIllIIlIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIllIIlIlIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIllIllIIlIIIIl() {
        lIlIIIIIlIlll = new String[lIlIIIIIllIII[0]];
        lIlIIIIIlIlll[lIlIIIIIllIII[1]] = lIllIllIIlIIIII("dOosEYOzbeo=", "fSBlb");
    }

    @Inject
    public D(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.aX = Prayer.PROTECT_FROM_MELEE;
        this.aY = Prayer.PROTECT_FROM_MAGIC;
    }

    private static void lIllIllIIlIIIlI() {
        lIlIIIIIllIII = new int[15];
        lIlIIIIIllIII[0] = " ".length();
        lIlIIIIIllIII[1] = (232 ^ 183) & ((13 ^ 82) ^ (-1));
        lIlIIIIIllIII[2] = (-((-6597) & 24567)) & (-257) & 20479;
        lIlIIIIIllIII[3] = (-16385) & 28179;
        lIlIIIIIllIII[4] = (-1545) & 16220;
        lIlIIIIIllIII[5] = 15 ^ 11;
        lIlIIIIIllIII[6] = (-((-11338) & 11643)) & (-20609) & 32703;
        lIlIIIIIllIII[7] = (-16545) & 28335;
        lIlIIIIIllIII[8] = "  ".length();
        lIlIIIIIllIII[9] = (-20579) & 32370;
        lIlIIIIIllIII[10] = "   ".length();
        lIlIIIIIllIII[11] = (-81) & 9850;
        lIlIIIIIllIII[12] = (-276) & 10047;
        lIlIIIIIllIII[13] = (-((-10089) & 32761)) & (-257) & 32702;
        lIlIIIIIllIII[14] = (38 ^ 119) ^ (70 ^ 31);
    }

    private static boolean lIllIllIIlIIIll(Object obj) {
        return obj == null;
    }

    private static String lIllIllIIlIIIII(String llllllllllllllIlllIIlIlllllllIll, String llllllllllllllIlllIIlIlllllllIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllllllIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIII[14]), "DES");
            Cipher llllllllllllllIlllIIlIllllllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllllllllIl.init(lIlIIIIIllIII[8], llllllllllllllIlllIIlIlllllllllI);
            return new String(llllllllllllllIlllIIlIllllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllllllllII) {
            llllllllllllllIlllIIlIllllllllII.printStackTrace();
            return null;
        }
    }
}
