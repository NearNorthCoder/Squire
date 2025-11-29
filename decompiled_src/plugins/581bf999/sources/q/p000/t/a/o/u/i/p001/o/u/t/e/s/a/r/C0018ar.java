package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ar  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ar.class */
public class C0018ar extends W {
    private static /* synthetic */ String[] llIllIllIlI;
    private /* synthetic */ Prayer df;
    private /* synthetic */ int dg;
    private static /* synthetic */ int[] llIllIllIll;
    private /* synthetic */ Prayer de;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr = new int[llIllIllIll[5]];
        iArr[llIllIllIll[1]] = llIllIllIll[6];
        iArr[llIllIllIll[0]] = llIllIllIll[7];
        iArr[llIllIllIll[8]] = llIllIllIll[9];
        iArr[llIllIllIll[10]] = llIllIllIll[3];
        return squireAutoTOA.a(iArr);
    }

    private static boolean lIlIlIlIIlllll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIlIIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIIlllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIlIlIIlIlll() {
        llIllIllIlI = new String[llIllIllIll[0]];
        llIllIllIlI[llIllIllIll[1]] = lIlIlIlIIlIllI("bC0Gu26Gm04=", "ivQpa");
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIllIllIll[4];
    }

    private static boolean lIlIlIlIIlllIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return llIllIllIll[0];
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC npc = npcChanged.getNpc();
        if (lIlIlIlIIlllIl(npc.getId(), llIllIllIll[6])) {
            this.df = Prayer.PROTECT_FROM_MELEE;
            "".length();
            if ("   ".length() < "  ".length()) {
            }
        } else if (!lIlIlIlIIlllIl(npc.getId(), llIllIllIll[7])) {
            if (lIlIlIlIIlllIl(npc.getId(), llIllIllIll[9])) {
                this.df = Prayer.PROTECT_FROM_MAGIC;
            }
        } else {
            this.df = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
            }
        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (lIlIlIlIIllllI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (lIlIlIlIIlllll(actor.getId(), llIllIllIll[6]) && lIlIlIlIIlllll(actor.getId(), llIllIllIll[7]) && lIlIlIlIIlllll(actor.getId(), llIllIllIll[9])) {
            return;
        }
        if (lIlIlIlIIlllIl(actor.getAnimation(), llIllIllIll[11])) {
            this.de = Prayer.PROTECT_FROM_MELEE;
        }
        if (lIlIlIlIIlllIl(actor.getAnimation(), llIllIllIll[12])) {
            this.de = Prayer.PROTECT_FROM_MISSILES;
        }
        if (lIlIlIlIIlllIl(actor.getAnimation(), llIllIllIll[13])) {
            this.de = Prayer.PROTECT_FROM_MAGIC;
        }
        this.dg = Static.getClient().getTickCount() + llIllIllIll[5];
    }

    private static boolean lIlIlIlIIllIlI(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIlIlIIllIII();
        lIlIlIlIIlIlll();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    private static boolean lIlIlIlIIllllI(int i) {
        return i != 0;
    }

    private static void lIlIlIlIIllIII() {
        llIllIllIll = new int[14];
        llIllIllIll[0] = " ".length();
        llIllIllIll[1] = ((((104 + 159) - 63) + 10) ^ (((151 + 53) - 59) + 53)) & (((156 ^ 143) ^ (162 ^ 165)) ^ (-" ".length()));
        llIllIllIll[2] = (-((-8429) & 14319)) & (-16385) & 24527;
        llIllIllIll[3] = (-20673) & 32467;
        llIllIllIll[4] = (-((-23381) & 24437)) & (-9) & 15740;
        llIllIllIll[5] = 117 ^ 113;
        llIllIllIll[6] = (-((-655) & 21407)) & (-130) & 32671;
        llIllIllIll[7] = (-369) & 12159;
        llIllIllIll[8] = "  ".length();
        llIllIllIll[9] = (-(((3 + 182) - 24) + 33)) & (-20749) & 32733;
        llIllIllIll[10] = "   ".length();
        llIllIllIll[11] = (-((-9289) & 26077)) & (-6145) & 32702;
        llIllIllIll[12] = (-((-9241) & 32219)) & (-1) & 32750;
        llIllIllIll[13] = (-2050) & 11823;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        int i;
        String[] strArr = new String[llIllIllIll[0]];
        strArr[llIllIllIll[1]] = llIllIllIlI[llIllIllIll[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIlIlIIllIIl(nearest)) {
            return List.of(aQ());
        }
        if (lIlIlIlIIllIlI(Static.getClient().getTickCount(), this.dg)) {
            this.de = this.df;
        }
        int[] iArr = new int[llIllIllIll[0]];
        iArr[llIllIllIll[1]] = llIllIllIll[2];
        if (lIlIlIlIIllIll(Projectiles.getAll(iArr).isEmpty() ? 1 : 0)) {
            i = llIllIllIll[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        } else {
            i = llIllIllIll[1];
        }
        if (lIlIlIlIIllIll(i) && lIlIlIlIIlllII(this.df, Prayer.PROTECT_FROM_MELEE) && lIlIlIlIIllIll(nearest.isAnimating() ? 1 : 0)) {
            this.de = this.df;
        }
        if (lIlIlIlIIlllIl(nearest.getId(), llIllIllIll[3])) {
            this.de = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(aQ(), this.de);
    }

    @Inject
    public C0018ar(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.de = Prayer.PROTECT_FROM_MELEE;
        this.df = Prayer.PROTECT_FROM_MAGIC;
    }

    private static boolean lIlIlIlIIllIll(int i) {
        return i == 0;
    }

    private static String lIlIlIlIIlIllI(String llllllllllllllllIIlIllIIIllIllIl, String llllllllllllllllIIlIllIIIllIllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIIIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIIIllIllll.init(llIllIllIll[8], llllllllllllllllIIlIllIIIlllIIII);
            return new String(llllllllllllllllIIlIllIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIIIllIlIIl) {
            llllllllllllllllIIlIllIIIllIlIIl.printStackTrace();
            return null;
        }
    }
}
