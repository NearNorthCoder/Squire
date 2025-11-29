package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Traversing to Zul-andra")
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ap  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ap.class */
public class ap extends Task {
    private final /* synthetic */ SquireZulrah aS;
    private static final /* synthetic */ WorldPoint aQ;
    private static /* synthetic */ int[] lIllIllllllIl;
    private final /* synthetic */ C0021v aT;
    private static final /* synthetic */ int aP;
    private static /* synthetic */ String[] lIllIllllllII;
    private static final /* synthetic */ int aO;
    private final /* synthetic */ SquireZulrahConfig aR;
    private final /* synthetic */ Client aU;

    private static boolean llIIlIlIIIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlIlIIIIlIlI(int i, int i2) {
        return i != i2;
    }

    private static void llIIlIlIIIIIIII() {
        lIllIllllllII = new String[lIllIllllllIl[11]];
        lIllIllllllII[lIllIllllllIl[0]] = llIIlIIlllllllI("DGfg6vXfv4w=", "VBnCo");
        lIllIllllllII[lIllIllllllIl[2]] = llIIlIIllllllll("kwbbqI+zSss=", "HydYP");
    }

    private static boolean llIIlIlIIIIIIll(int i) {
        return i != 0;
    }

    private static boolean llIIlIlIIIIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean ak() {
        if (llIIlIlIIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(aQ);
            "".length();
        }
        return lIllIllllllIl[2];
    }

    static {
        llIIlIlIIIIIIIl();
        llIIlIlIIIIIIII();
        aP = lIllIllllllIl[7];
        aO = lIllIllllllIl[8];
        aQ = new WorldPoint(lIllIllllllIl[9], lIllIllllllIl[10], lIllIllllllIl[0]);
    }

    private static boolean llIIlIlIIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIlIIIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static String llIIlIIllllllll(String llllllllllllllIllIIIIllllIlIlIlI, String llllllllllllllIllIIIIllllIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIIllllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIllllllIl[12]), "DES");
            Cipher llllllllllllllIllIIIIllllIlIllII = Cipher.getInstance("DES");
            llllllllllllllIllIIIIllllIlIllII.init(lIllIllllllIl[11], llllllllllllllIllIIIIllllIlIllIl);
            return new String(llllllllllllllIllIIIIllllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIllllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIllllIlIlIll) {
            llllllllllllllIllIIIIllllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIIIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlIlIIIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIlIIlllllllI(String llllllllllllllIllIIIIllllIIlllIl, String llllllllllllllIllIIIIllllIIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIIIIllllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIllllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllllllIl[11], llllllllllllllIllIIIIllllIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIllllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIllllIIllllI) {
            llllllllllllllIllIIIIllllIIllllI.printStackTrace();
            return null;
        }
    }

    private static void llIIlIlIIIIIIIl() {
        lIllIllllllIl = new int[13];
        lIllIllllllIl[0] = (84 ^ 16) & ((107 ^ 47) ^ (-1));
        lIllIllllllIl[1] = (-((-8454) & 32213)) & (-1) & 32767;
        lIllIllllllIl[2] = " ".length();
        lIllIllllllIl[3] = 85 ^ 69;
        lIllIllllllIl[4] = (-5121) & 31765;
        lIllIllllllIl[5] = (-((-20513) & 23587)) & (-17029) & 32446;
        lIllIllllllIl[6] = (150 ^ 174) ^ (75 ^ 119);
        lIllIllllllIl[7] = (-2449) & 11199;
        lIllIllllllIl[8] = (-20524) & 30591;
        lIllIllllllIl[9] = (-5666) & 7865;
        lIllIllllllIl[10] = (-9225) & 12280;
        lIllIllllllIl[11] = "  ".length();
        lIllIllllllIl[12] = (65 ^ 1) ^ (127 ^ 55);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    public boolean run() {
        int i;
        if (!llIIlIlIIIIIIlI(this.aS.a(), EnumC0002c.DONE) || llIIlIlIIIIIIll(this.aS.d() ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (llIIlIlIIIIIIlI(this.aR.transport(), EnumC0016q.ZUL_ANDRA_TELEPORT)) {
            return lIllIllllllIl[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (llIIlIlIIIIIIll(this.aU.isInInstancedRegion() ? 1 : 0)) {
            int[] mapRegions = this.aU.getMapRegions();
            int llllllllllllllIllIIIIllllIllIlII = mapRegions.length;
            int i2 = lIllIllllllIl[0];
            while (llIIlIlIIIIIlII(i2, llllllllllllllIllIIIIllllIllIlII)) {
                if (llIIlIlIIIIIlIl(mapRegions[i2], lIllIllllllIl[1])) {
                    return lIllIllllllIl[0];
                }
                i2++;
                "".length();
                if ((((((75 + 198) - 144) + 121) ^ (((155 + 98) - 95) + 22)) & (((((197 + 2) - 24) + 38) ^ (((53 + 75) - 2) + 29)) ^ (-" ".length()))) > 0) {
                    return ((220 ^ 147) ^ (123 ^ 27)) & (((224 ^ 192) ^ (50 ^ 61)) ^ (-" ".length()));
                }
            }
        }
        int count = Inventory.getCount(item -> {
            String[] strArr = new String[lIllIllllllIl[2]];
            strArr[lIllIllllllIl[0]] = lIllIllllllII[lIllIllllllIl[2]];
            return item.hasAction(strArr);
        });
        if (!llIIlIlIIIIIllI(Inventory.contains(item2 -> {
            return item2.getName().startsWith(this.aR.cure().k());
        }) ? 1 : 0) || llIIlIlIIIIIIlI(this.aR.cure(), EnumC0014o.IGNORE)) {
            i = lIllIllllllIl[2];
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return ((254 ^ 180) ^ (51 ^ 44)) & (((91 ^ 100) ^ (40 ^ 66)) ^ (-" ".length()));
            }
        } else {
            i = lIllIllllllIl[0];
        }
        int llllllllllllllIllIIIIllllIllIlII2 = i;
        if (!llIIlIlIIIIIlll(count, this.aR.multiple()) || llIIlIlIIIIIllI(llllllllllllllIllIIIIllllIllIlII2)) {
            return lIllIllllllIl[0];
        }
        if (llIIlIlIIIIIIll(this.aR.bankLocation().g().contains(Integer.valueOf(worldLocation.getRegionID())) ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (llIIlIlIIIIlIII(aQ.distanceTo(worldLocation), lIllIllllllIl[3]) && llIIlIlIIIIIlll(worldLocation.getX(), aQ.getX())) {
            return lIllIllllllIl[0];
        }
        int[] iArr = new int[lIllIllllllIl[2]];
        iArr[lIllIllllllIl[0]] = lIllIllllllIl[4];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (llIIlIlIIIIlIIl(nearest)) {
            return llIIlIlIIIIlIlI(worldLocation.getRegionID(), lIllIllllllIl[5]) ? ak() : lIllIllllllIl[0];
        }
        nearest.interact(lIllIllllllII[lIllIllllllIl[0]]);
        sleep(lIllIllllllIl[6]);
        return lIllIllllllIl[2];
    }

    private static boolean llIIlIlIIIIIllI(int i) {
        return i == 0;
    }

    @Inject
    protected ap(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, C0021v c0021v, Client client, C0019t c0019t) {
        this.aR = squireZulrahConfig;
        this.aS = squireZulrah;
        this.aT = c0021v;
        this.aU = client;
    }
}
