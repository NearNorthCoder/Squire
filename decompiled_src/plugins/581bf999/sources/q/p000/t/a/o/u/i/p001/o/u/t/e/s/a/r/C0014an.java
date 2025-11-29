package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using sun keris special", priority = 1500)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.an  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/an.class */
public class C0014an extends Z {
    @Inject
    protected /* synthetic */ TOAConfig d;
    private final /* synthetic */ C cT;
    private static /* synthetic */ String[] llIIIIIIlIl;
    private static /* synthetic */ int[] llIIIIIlIII;
    private final /* synthetic */ SquireAutoTOA cS;

    private static void lIIlllIIIlllll() {
        llIIIIIIlIl = new String[llIIIIIlIII[7]];
        llIIIIIIlIl[llIIIIIlIII[0]] = lIIlllIIIllllI("TAELuZ4f34M=", "ratle");
    }

    private static boolean lIIlllIIlIlIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlllIIlIIlII();
        lIIlllIIIlllll();
    }

    private static boolean lIIlllIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllIIlIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllIIlIIlll(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIlIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlllIIlIllII(int i, int i2) {
        return i != i2;
    }

    @Inject
    protected C0014an(Client client, SquireAutoTOA squireAutoTOA, C c) {
        super(client);
        this.cS = squireAutoTOA;
        this.cT = c;
    }

    private static boolean lIIlllIIlIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlllIIlIlIll(int i, int i2) {
        return i == i2;
    }

    private static void lIIlllIIlIIlII() {
        llIIIIIlIII = new int[9];
        llIIIIIlIII[0] = (161 ^ 148) & ((101 ^ 80) ^ (-1));
        llIIIIIlIII[1] = (-((-14763) & 31663)) & (-4113) & 32765;
        llIIIIIlIII[2] = 109 ^ 9;
        llIIIIIlIII[3] = 227 ^ 192;
        llIIIIIlIII[4] = (-((-25219) & 29383)) & (-17) & 15870;
        llIIIIIlIII[5] = 30 ^ 48;
        llIIIIIlIII[6] = 85 ^ 78;
        llIIIIIlIII[7] = " ".length();
        llIIIIIlIII[8] = "  ".length();
    }

    private static String lIIlllIIIllllI(String llllllllllllllllIlIIIllllIlIIIll, String llllllllllllllllIlIIIllllIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIlIII[8], llllllllllllllllIlIIIllllIlIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIllllIIlllll) {
            llllllllllllllllIlIIIllllIIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    public boolean run() {
        NPC b = this.cS.b();
        if (lIIlllIIlIIlIl(b) && lIIlllIIlIIllI(b.getName().contains(llIIIIIIlIl[llIIIIIlIII[0]]) ? 1 : 0) && lIIlllIIlIIllI(this.d.dehydration() ? 1 : 0)) {
            return llIIIIIlIII[0];
        }
        if (lIIlllIIlIIllI(aq() ? 1 : 0) && lIIlllIIlIIlll(be() ? 1 : 0)) {
            if ((!lIIlllIIlIlIII(aX(), llIIIIIlIII[1]) || !lIIlllIIlIlIIl(Combat.getSpecEnergy(), llIIIIIlIII[2]) || !lIIlllIIlIlIlI(Combat.getCurrentHealth(), llIIIIIlIII[3])) && !lIIlllIIlIlIll(aX(), llIIIIIlIII[4])) {
                if (lIIlllIIlIllII(aX(), llIIIIIlIII[4]) && lIIlllIIlIIllI(Inventory.contains(item -> {
                    return EnumC0056e.AMBROSIA.d(item.getId());
                }) ? 1 : 0)) {
                    return llIIIIIlIII[0];
                }
                this.cS.a(llIIIIIlIII[5]);
            }
            return llIIIIIlIII[0];
        }
        if (lIIlllIIlIIllI(be() ? 1 : 0)) {
            this.cS.a(llIIIIIlIII[6]);
        }
        if (lIIlllIIlIlIlI(Combat.getCurrentHealth(), this.cS.f())) {
            this.cS.c();
            return llIIIIIlIII[0];
        }
        return ba();
    }
}
