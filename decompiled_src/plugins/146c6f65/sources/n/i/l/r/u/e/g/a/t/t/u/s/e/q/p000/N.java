package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Walking home", priority = 1)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.N  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/N.class */
public class N extends AbstractC0013n {
    private static /* synthetic */ String[] llIIlIllIlII;
    private static /* synthetic */ int[] llIIlIllIlIl;

    private static String lllllIlllIIIll(String lllllllllllllllIlIIllIIllIlIllIl, String lllllllllllllllIlIIllIIllIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIllIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIllIlIllll.init(llIIlIllIlIl[2], secretKeySpec);
            return new String(lllllllllllllllIlIIllIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIllIlIlllI) {
            lllllllllllllllIlIIllIIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlllIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (lllllIlllIIllI(local)) {
            return llIIlIllIlIl[1];
        }
        if (!lllllIlllIIlll(this.ba.N() ? 1 : 0) || (!lllllIlllIIlll(this.ba.a(enumC0008i -> {
            if (!lllllIlllIlIIl(enumC0008i, EnumC0008i.CRYSTAL_SHARD) || lllllIlllIlIlI(enumC0008i, EnumC0008i.FISH)) {
                ?? r0 = llIIlIllIlIl[0];
                "".length();
                return (((201 ^ 149) ^ (100 ^ 119)) & (((((195 + 216) - 366) + 187) ^ (((120 + 53) - 12) + 6)) ^ (-" ".length()))) != 0 ? ((115 ^ 47) ^ (193 ^ 135)) & (((59 ^ 26) ^ (158 ^ 165)) ^ (-" ".length())) : r0;
            }
            return llIIlIllIlIl[1];
        }) ? 1 : 0) && !lllllIlllIIlll(this.ba.O() ? 1 : 0))) {
            Item first = Inventory.getFirst(item -> {
                return C0004e.ab.contains(Integer.valueOf(item.getId()));
            });
            if (lllllIlllIlIII(first)) {
                first.interact(llIIlIllIlII[llIIlIllIlIl[1]]);
                return llIIlIllIlIl[0];
            }
            return this.ba.a(this.ba.V().av(), local.getWorldLocation());
        }
        return llIIlIllIlIl[1];
    }

    private static boolean lllllIlllIIlll(int i) {
        return i == 0;
    }

    private static boolean lllllIlllIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIllIlIl[0]];
        enumC0003dArr[llIIlIllIlIl[1]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
    }

    private static void lllllIlllIIlIl() {
        llIIlIllIlIl = new int[3];
        llIIlIllIlIl[0] = " ".length();
        llIIlIllIlIl[1] = ((((43 + 126) - 90) + 73) ^ (((56 + 36) - 82) + 154)) & (((((246 + 159) - 387) + 236) ^ (((82 + 159) - 102) + 55)) ^ (-" ".length()));
        llIIlIllIlIl[2] = "  ".length();
    }

    private static boolean lllllIlllIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lllllIlllIIlIl();
        lllllIlllIIlII();
    }

    private static boolean lllllIlllIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lllllIlllIIlII() {
        llIIlIllIlII = new String[llIIlIllIlIl[0]];
        llIIlIllIlII[llIIlIllIlIl[1]] = lllllIlllIIIll("ddxurITiifcsCyWi+pMyJA==", "aAGfn");
    }
}
