package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Filling compost bin", priority = 30, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aO  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aO.class */
public class aO extends aN {
    private final /* synthetic */ C0033h cx;
    private static /* synthetic */ String[] llIIIIIIllll;
    private /* synthetic */ boolean cy;
    private static /* synthetic */ int[] llIIIIIlIIII;

    private static boolean llllIIIlIllIIl(int i) {
        return i == 0;
    }

    private static boolean llllIIIlIlIllI(int i) {
        return i != 0;
    }

    @Inject
    public aO(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, C0033h c0033h) {
        super(c0031f, squireFarmerConfig, client);
        this.cx = c0033h;
    }

    private static boolean llllIIIlIllIII(Object obj) {
        return obj == null;
    }

    private static void llllIIIlIlIIlI() {
        llIIIIIIllll = new String[llIIIIIlIIII[2]];
        llIIIIIIllll[llIIIIIlIIII[0]] = llllIIIlIlIIIl("VgmEhSy178c=", "wgXtT");
        llIIIIIIllll[llIIIIIlIIII[1]] = llllIIIlIlIIIl("TG1smjibj6k=", "zxOlp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        String[] strArr = new String[llIIIIIlIIII[1]];
        strArr[llIIIIIlIIII[0]] = llIIIIIIllll[llIIIIIlIIII[0]];
        if (llllIIIlIlIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
            tileObject.interact(llIIIIIIllll[llIIIIIlIIII[1]]);
            return llIIIIIlIIII[1];
        }
        Item bu = bu();
        if (llllIIIlIlIllI(Inventory.isFull() ? 1 : 0) && llllIIIlIlIlll(bu)) {
            this.cy = llIIIIIlIIII[1];
            "".length();
            if (0 != 0) {
                return ((128 ^ 195) ^ (231 ^ 140)) & (((186 ^ 151) ^ (182 ^ 179)) ^ (-" ".length()));
            }
        } else if (llllIIIlIllIII(bu)) {
            this.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        if (llllIIIlIllIIl(this.cy ? 1 : 0)) {
            return llIIIIIlIIII[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (llllIIIlIlIllI(L.bq.contains(Integer.valueOf(item.getId())) ? 1 : 0) && llllIIIlIllIlI(item.getId(), bu.getId())) {
                ?? r0 = llIIIIIlIIII[1];
                "".length();
                return (106 ^ 110) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIIlIIII[0];
        });
        if (llllIIIlIlIlll(first)) {
            this.cx.c(first);
            return llIIIIIlIIII[1];
        } else if (!llllIIIlIllIIl(Players.getLocal().isMoving() ? 1 : 0) || llllIIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIIIIlIIII[1];
        } else {
            bu.useOn(tileObject);
            return llIIIIIlIIII[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        if (!llllIIIlIlIlII(n.aI().aZ(), EnumC0039n.GROWING) || llllIIIlIlIlIl(n.aI().aZ(), EnumC0039n.HARVESTABLE)) {
            this.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        return llIIIIIlIIII[1];
    }

    private static boolean llllIIIlIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIIlIlIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIIIlIllIlI(int i, int i2) {
        return i != i2;
    }

    static {
        llllIIIlIlIIll();
        llllIIIlIlIIlI();
    }

    private static void llllIIIlIlIIll() {
        llIIIIIlIIII = new int[4];
        llIIIIIlIIII[0] = (197 ^ 133) & ((102 ^ 38) ^ (-1));
        llIIIIIlIIII[1] = " ".length();
        llIIIIIlIIII[2] = "  ".length();
        llIIIIIlIIII[3] = (((57 + 20) - 31) + 100) ^ (((92 + 110) - 77) + 29);
    }

    private static boolean llllIIIlIlIlll(Object obj) {
        return obj != null;
    }

    private static String llllIIIlIlIIIl(String lllllllllllllllIlIlIllIllIIlIlIl, String lllllllllllllllIlIlIllIllIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIllIIlIlII.getBytes(StandardCharsets.UTF_8)), llIIIIIlIIII[3]), "DES");
            Cipher lllllllllllllllIlIlIllIllIIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIllIIlIlll.init(llIIIIIlIIII[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIllIllIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIllIIlIllI) {
            lllllllllllllllIlIlIllIllIIlIllI.printStackTrace();
            return null;
        }
    }
}
