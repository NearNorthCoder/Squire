package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Filling Vials", priority = 3, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.E  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/E.class */
public class E extends AbstractC0013n {
    private final /* synthetic */ C0001b bS;
    private static /* synthetic */ int[] llIIllllllll;
    private static /* synthetic */ String[] llIIlllllllI;

    private static boolean lIIIIIIIlIIIlll(Object obj) {
        return obj == null;
    }

    private static void lIIIIIIIlIIIIlI() {
        llIIlllllllI = new String[llIIllllllll[2]];
        llIIlllllllI[llIIllllllll[1]] = lIIIIIIIlIIIIIl("X9M5znlcDRs/tmsyFfASwQ==", "sVEpD");
    }

    static {
        lIIIIIIIlIIIIll();
        lIIIIIIIlIIIIlI();
    }

    private static boolean lIIIIIIIlIIIlII(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIlIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllllllll[0]];
        enumC0003dArr[llIIllllllll[1]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIIllllllll[2]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        enumC0003dArr[llIIllllllll[3]] = EnumC0003d.CREATING_T3_STAFF;
        this.bS = c0001b;
    }

    private static void lIIIIIIIlIIIIll() {
        llIIllllllll = new int[4];
        llIIllllllll[0] = "   ".length();
        llIIllllllll[1] = ((((138 + 60) - 90) + 34) ^ (((170 + 49) - 142) + 101)) & (((104 ^ 26) ^ (56 ^ 118)) ^ (-" ".length()));
        llIIllllllll[2] = " ".length();
        llIIllllllll[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (!lIIIIIIIlIIIlII(this.bS.p() ? 1 : 0) && !lIIIIIIIlIIIlIl(this.ba.I().isEmpty() ? 1 : 0)) {
            Item first = Inventory.getFirst(EnumC0005f.VIAL.ad());
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIIIIIIlIIIlII(C0004e.X.contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) && lIIIIIIIlIIIlII(tileObject.getName().equals(llIIlllllllI[llIIllllllll[1]]) ? 1 : 0)) {
                    ?? r0 = llIIllllllll[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllllllll[1];
            });
            if (!lIIIIIIIlIIIllI(nearest) || lIIIIIIIlIIIlll(first)) {
                return llIIllllllll[1];
            }
            first.useOn(nearest);
            this.bS.e(llIIllllllll[0]);
            return llIIllllllll[2];
        }
        return llIIllllllll[1];
    }

    private static String lIIIIIIIlIIIIIl(String lllllllllllllllIlIIIlllIllIllIIl, String lllllllllllllllIlIIIlllIllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllIllIllIlI) {
            lllllllllllllllIlIIIlllIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlIIIlIl(int i) {
        return i == 0;
    }
}
