package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Tick-eating boss trample", priority = 10)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/z.class */
public class C0025z extends AbstractC0013n {
    private final /* synthetic */ C0001b bI;
    private static /* synthetic */ String[] llIlIIIlllIl;
    private /* synthetic */ int bJ;
    private static /* synthetic */ int[] llIlIIIllllI;

    private static String lIIIIIIlIllIIlI(String lllllllllllllllIlIIIllIIIIIIlIIl, String lllllllllllllllIlIIIllIIIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), llIlIIIllllI[4]), "DES");
            Cipher lllllllllllllllIlIIIllIIIIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIIIIIlIll.init(llIlIIIllllI[5], lllllllllllllllIlIIIllIIIIIIllII);
            return new String(lllllllllllllllIlIIIllIIIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIIIIIlIlI) {
            lllllllllllllllIlIIIllIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIllIllI(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIlIlllIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (lIIIIIIlIllIlIl(local)) {
            return llIlIIIllllI[1];
        }
        Item first = Inventory.getFirst(item -> {
            return C0004e.aH.contains(Integer.valueOf(item.getId()));
        });
        if (lIIIIIIlIllIlIl(first)) {
            return llIlIIIllllI[1];
        }
        NPC aI = this.ba.X().aI();
        if (lIIIIIIlIllIlIl(aI)) {
            return llIlIIIllllI[1];
        }
        if (lIIIIIIlIllIllI(aI.getWorldArea().contains(local.getWorldLocation()) ? 1 : 0)) {
            this.bJ = Static.getClient().getTickCount();
            return llIlIIIllllI[1];
        }
        if (!lIIIIIIlIllIlll(aI.getAnimation(), llIlIIIllllI[2]) && lIIIIIIlIlllIII(Static.getClient().getTickCount() - this.bJ, llIlIIIllllI[3])) {
            first.interact(llIlIIIlllIl[llIlIIIllllI[1]]);
            this.bI.u();
            return llIlIIIllllI[0];
        }
        return llIlIIIllllI[1];
    }

    static {
        lIIIIIIlIllIlII();
        lIIIIIIlIllIIll();
    }

    private static boolean lIIIIIIlIllIlll(int i, int i2) {
        return i != i2;
    }

    private static void lIIIIIIlIllIIll() {
        llIlIIIlllIl = new String[llIlIIIllllI[0]];
        llIlIIIlllIl[llIlIIIllllI[1]] = lIIIIIIlIllIIlI("IHY6m+GadBw=", "oVhDy");
    }

    private static boolean lIIIIIIlIllIlIl(Object obj) {
        return obj == null;
    }

    private static void lIIIIIIlIllIlII() {
        llIlIIIllllI = new int[6];
        llIlIIIllllI[0] = " ".length();
        llIlIIIllllI[1] = (47 ^ 113) & ((221 ^ 131) ^ (-1));
        llIlIIIllllI[2] = (-((-2241) & 20189)) & (-6145) & 32510;
        llIlIIIllllI[3] = 184 ^ 178;
        llIlIIIllllI[4] = (122 ^ 40) ^ (27 ^ 65);
        llIlIIIllllI[5] = "  ".length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0025z(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIllllI[0]];
        enumC0003dArr[llIlIIIllllI[1]] = EnumC0003d.BOSS_FIGHT;
        this.bI = c0001b;
    }
}
