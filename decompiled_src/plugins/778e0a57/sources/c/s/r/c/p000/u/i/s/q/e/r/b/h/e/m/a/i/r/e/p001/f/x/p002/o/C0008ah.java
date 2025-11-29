package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Pickup enhance", priority = 30000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ah  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ah.class */
public class C0008ah extends Task {
    private final /* synthetic */ SquireChambersConfig cM;
    private static /* synthetic */ String[] lIIlllllIIII;
    private final /* synthetic */ SquireChambersPlugin cL;
    private static /* synthetic */ int[] lIIlllllIIIl;

    private static boolean llIlIIlIIlIIll(Object obj) {
        return obj != null;
    }

    static {
        llIlIIlIIlIIlI();
        llIlIIlIIlIIIl();
    }

    protected int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[3]]);
        });
    }

    private static boolean llIlIIlIIllIIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public C0008ah(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cL = squireChambersPlugin;
        this.cM = squireChambersConfig;
    }

    protected int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[2]]);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIlIIlIIlIIll(this.cL.C()) || llIlIIlIIlIlII(this.cL.C().e().contains(N.VESPULA) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        if (!llIlIIlIIlIlIl(C0046u.bg(), lIIlllllIIIl[1]) || llIlIIlIIlIlII(Players.getLocal().getPlane())) {
            return lIIlllllIIIl[0];
        }
        if (!llIlIIlIIlIllI(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlllllIIII[lIIlllllIIIl[1]]);
        }) ? 1 : 0) && !llIlIIlIIlIIll(NPCs.getNearest(npc -> {
            String[] strArr = new String[lIIlllllIIIl[2]];
            strArr[lIIlllllIIIl[0]] = lIIlllllIIII[lIIlllllIIIl[5]];
            if (llIlIIlIIlIllI(npc.hasAction(strArr) ? 1 : 0) && llIlIIlIIlIllI(this.cL.L().a((Locatable) npc) ? 1 : 0)) {
                ?? r0 = lIIlllllIIIl[2];
                "".length();
                return ((80 ^ 125) & ((148 ^ 185) ^ (-1))) < ((133 ^ 193) & ((213 ^ 145) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlllllIIIl[0];
        }))) {
            TileItem nearest = TileItems.getNearest(tileItem -> {
                if (llIlIIlIIllIII(tileItem.getId(), lIIlllllIIIl[4]) && llIlIIlIIlIllI(Reachable.isInteractable(tileItem) ? 1 : 0) && llIlIIlIIlIllI(this.cL.L().a((Locatable) tileItem) ? 1 : 0)) {
                    ?? r0 = lIIlllllIIIl[2];
                    "".length();
                    return 0 != 0 ? ((230 ^ 172) ^ (((29 + 40) - 10) + 68)) & (((((3 + 98) - (-21)) + 15) ^ (((103 + 136) - 105) + 54)) ^ (-" ".length())) : r0;
                }
                return lIIlllllIIIl[0];
            });
            if (llIlIIlIIlIlll(nearest)) {
                return lIIlllllIIIl[0];
            }
            if (!llIlIIlIIlIllI(Inventory.isFull() ? 1 : 0)) {
                nearest.interact(lIIlllllIIII[lIIlllllIIIl[0]]);
                return lIIlllllIIIl[2];
            }
            this.cL.x();
            "".length();
            return lIIlllllIIIl[2];
        }
        return lIIlllllIIIl[0];
    }

    private static void llIlIIlIIlIIlI() {
        lIIlllllIIIl = new int[8];
        lIIlllllIIIl[0] = ((((61 + 199) - 144) + 92) ^ (((12 + 88) - (-8)) + 50)) & (((56 ^ 6) ^ (62 ^ 78)) ^ (-" ".length()));
        lIIlllllIIIl[1] = 15 ^ 11;
        lIIlllllIIIl[2] = " ".length();
        lIIlllllIIIl[3] = "  ".length();
        lIIlllllIIIl[4] = (-((-16623) & 25343)) & (-2051) & 31742;
        lIIlllllIIIl[5] = "   ".length();
        lIIlllllIIIl[6] = (((128 + 138) - 249) + 123) ^ (((132 + 72) - 134) + 67);
        lIIlllllIIIl[7] = (41 ^ 91) ^ (14 ^ 116);
    }

    private static boolean llIlIIlIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlIIlIIlIlll(Object obj) {
        return obj == null;
    }

    private static String llIlIIlIIIllll(String lllllllllllllllIlllIlIIIlllIIIIl, String lllllllllllllllIlllIlIIIlllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIIIl[3], lllllllllllllllIlllIlIIIlllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlllIIIlI) {
            lllllllllllllllIlllIlIIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIlIllI(int i) {
        return i != 0;
    }

    private static boolean llIlIIlIIlIlII(int i) {
        return i == 0;
    }

    private static String llIlIIlIIlIIII(String lllllllllllllllIlllIlIIIllIIIlII, String lllllllllllllllIlllIlIIIllIIIIll) {
        String lllllllllllllllIlllIlIIIllIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIllIIIIIl = lllllllllllllllIlllIlIIIllIIIIll.toCharArray();
        int lllllllllllllllIlllIlIIIllIIIIII = lIIlllllIIIl[0];
        char[] charArray = lllllllllllllllIlllIlIIIllIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIIlllllIIIl[0];
        while (llIlIIlIIllIIl(i, length)) {
            char lllllllllllllllIlllIlIIIlIllIlll = charArray[i];
            sb.append((char) (lllllllllllllllIlllIlIIIlIllIlll ^ lllllllllllllllIlllIlIIIllIIIIIl[lllllllllllllllIlllIlIIIllIIIIII % lllllllllllllllIlllIlIIIllIIIIIl.length]));
            "".length();
            lllllllllllllllIlllIlIIIllIIIIII++;
            i++;
            "".length();
            if ((((((96 + 138) - 116) + 39) ^ (((92 + 166) - 123) + 55)) & (((((146 + 130) - 114) + 8) ^ (((57 + 136) - 119) + 63)) ^ (-" ".length()))) != (((40 ^ 92) ^ (2 ^ 124)) & (((56 ^ 29) ^ (74 ^ 101)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIIlIIIlllI(String lllllllllllllllIlllIlIIIllIlIlII, String lllllllllllllllIlllIlIIIllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIllIlIllI.init(lIIlllllIIIl[3], lllllllllllllllIlllIlIIIllIlIlll);
            return new String(lllllllllllllllIlllIlIIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIllIlIlIl) {
            lllllllllllllllIlllIlIIIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIllIII(int i, int i2) {
        return i == i2;
    }

    private static void llIlIIlIIlIIIl() {
        lIIlllllIIII = new String[lIIlllllIIIl[6]];
        lIIlllllIIII[lIIlllllIIIl[0]] = llIlIIlIIIlllI("bM9aa/F5cPQ=", "FKRgQ");
        lIIlllllIIII[lIIlllllIIIl[2]] = llIlIIlIIIlllI("vjD8lMEZX79ICva+KY+xdA==", "GmHde");
        lIIlllllIIII[lIIlllllIIIl[3]] = llIlIIlIIIllll("+GgyHsI5lXz16MO1LUYeeA==", "eqkmJ");
        lIIlllllIIII[lIIlllllIIIl[5]] = llIlIIlIIIlllI("MNLigedXZvk=", "UDMiM");
        lIIlllllIIII[lIIlllllIIIl[1]] = llIlIIlIIlIIII("JjM5NwQkYT0gCTcvOys=", "VAXNa");
    }
}
