package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Applying compost to patch", priority = 2)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aU  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aU.class */
public class aU extends aX {
    private static /* synthetic */ String[] llIIIllIIIlI;
    private static /* synthetic */ int[] llIIIllIIIll;

    private static boolean llllIlIlllIlll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean bv() {
        if (!llllIlIlllIIIl(Players.getLocal().isMoving() ? 1 : 0) || llllIlIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            ?? r0 = llIIIllIIIll[0];
            "".length();
            return ((((59 + 86) - 136) + 171) ^ (((38 + 133) - 140) + 145)) < 0 ? ((((5 + 93) - 56) + 176) ^ (((20 + 85) - 57) + 80)) & (((232 ^ 188) ^ (136 ^ 134)) ^ (-" ".length())) : r0;
        }
        return llIIIllIIIll[1];
    }

    static {
        llllIlIlllIIII();
        llllIlIllIllll();
    }

    private static void llllIlIllIllll() {
        llIIIllIIIlI = new String[llIIIllIIIll[3]];
        llIIIllIIIlI[llIIIllIIIll[1]] = llllIlIllIlllI("FRr9bxWX/GQ=", "FGOrA");
        llIIIllIIIlI[llIIIllIIIll[0]] = llllIlIllIlllI("dELVahm7bAg=", "HAxTg");
    }

    private static boolean llllIlIlllIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        H compostType;
        if (llllIlIlllIIlI(this.bR.f(n) ? 1 : 0)) {
            return llIIIllIIIll[1];
        }
        if (llllIlIlllIIll(n.aL(), P.FLOWER)) {
            compostType = this.bS.compostTypeFlowers();
            "".length();
            if (((240 ^ 129) ^ (201 ^ 188)) < 0) {
                return ((((96 + 148) - 56) + 27) ^ (((86 + 17) - 4) + 37)) & (((102 ^ 42) ^ (106 ^ 121)) ^ (-" ".length())) & ((((((102 + 11) - 80) + 124) ^ (((127 + 113) - 100) + 6)) & (((((43 + 58) - 34) + 124) ^ (((104 + 124) - 98) + 46)) ^ (-" ".length()))) ^ (-" ".length()));
            }
        } else {
            compostType = this.bS.compostType();
        }
        if (llllIlIlllIIll(compostType, H.LUNAR_SPELL) && llllIlIlllIlII(n.aL(), P.GRAPES)) {
            return K(n);
        }
        Item g = this.bR.g(n);
        if (llllIlIlllIlIl(g)) {
            return llIIIllIIIll[1];
        }
        int[] iArr = new int[llIIIllIIIll[0]];
        iArr[llIIIllIIIll[1]] = llIIIllIIIll[2];
        Item first = Inventory.getFirst(iArr);
        if (llllIlIlllIllI(first)) {
            first.interact(llIIIllIIIlI[llIIIllIIIll[1]]);
        }
        Objects.requireNonNull(g);
        "".length();
        if (llllIlIlllIIlI(a(n, this::useOn) ? 1 : 0)) {
            sleep(llIIIllIIIll[3]);
            return llIIIllIIIll[0];
        }
        return llIIIllIIIll[1];
    }

    @Inject
    public aU(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client, c0014an -> {
            if (llllIlIlllIIIl(c0014an.be() ? 1 : 0) && llllIlIlllIIll(c0014an.aZ(), EnumC0039n.GROWING)) {
                ?? r0 = llIIIllIIIll[0];
                "".length();
                return "   ".length() <= 0 ? ((((117 + 113) - 111) + 23) ^ (((16 + 82) - 54) + 144)) & (((14 ^ 79) ^ (65 ^ 50)) ^ (-" ".length())) : r0;
            }
            return llIIIllIIIll[1];
        });
    }

    private static boolean llllIlIlllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llllIlIllIlllI(String lllllllllllllllIlIlIIlIIIlllllll, String lllllllllllllllIlIlIIlIIIllllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIIlIIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIlIIIIIIl.init(llIIIllIIIll[3], secretKeySpec);
            return new String(lllllllllllllllIlIlIIlIIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIIlIIIIIII) {
            lllllllllllllllIlIlIIlIIlIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void llllIlIlllIIII() {
        llIIIllIIIll = new int[6];
        llIIIllIIIll[0] = " ".length();
        llIIIllIIIll[1] = ((181 ^ 128) ^ (181 ^ 163)) & (((49 ^ 0) ^ (106 ^ 120)) ^ (-" ".length()));
        llIIIllIIIll[2] = (-11) & 1935;
        llIIIllIIIll[3] = "  ".length();
        llIIIllIIIll[4] = (-9217) & 15778;
        llIIIllIIIll[5] = (-1549) & 8111;
    }

    private static boolean llllIlIlllIIlI(int i) {
        return i != 0;
    }

    private static boolean llllIlIlllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIlIlllIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    private boolean K(N n) {
        int regionID = Players.getLocal().getWorldLocation().getRegionID();
        int[] iArr = new int[llIIIllIIIll[3]];
        iArr[llIIIllIIIll[1]] = llIIIllIIIll[4];
        iArr[llIIIllIIIll[0]] = llIIIllIIIll[5];
        Item first = Inventory.getFirst(iArr);
        if (llllIlIlllIllI(first) && llllIlIlllIlll(regionID, EnumC0041p.FOSSIL_ISLAND_UNDERWATER.X())) {
            first.interact(llIIIllIIIlI[llIIIllIIIll[0]]);
            return llIIIllIIIll[0];
        }
        if (!llllIlIlllIIIl(SpellBook.Lunar.FERTILE_SOIL.canCast() ? 1 : 0) && llllIlIlllIIlI(a(n, tileObject -> {
            Magic.cast(SpellBook.Lunar.FERTILE_SOIL, tileObject);
        }) ? 1 : 0)) {
            sleep(llIIIllIIIll[3]);
            return llIIIllIIIll[0];
        }
        return llIIIllIIIll[1];
    }

    private static boolean llllIlIlllIlIl(Object obj) {
        return obj == null;
    }
}
