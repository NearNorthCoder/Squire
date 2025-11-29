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
@TaskDesc(name = "Pick Seeds", priority = 30000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aj  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aj.class */
public class C0010aj extends Task {
    private final /* synthetic */ SquireChambersConfig cQ;
    private final /* synthetic */ SquireChambersPlugin cP;
    private static /* synthetic */ int[] lIlIIIllIlIl;
    private static /* synthetic */ String[] lIlIIIllIlII;

    private static void llIlIllIlIllll() {
        lIlIIIllIlIl = new int[8];
        lIlIIIllIlIl[0] = " ".length();
        lIlIIIllIlIl[1] = (35 ^ 10) & ((172 ^ 133) ^ (-1));
        lIlIIIllIlIl[2] = (-10819) & 31727;
        lIlIIIllIlIl[3] = 106 ^ 111;
        lIlIIIllIlIl[4] = "   ".length();
        lIlIIIllIlIl[5] = "  ".length();
        lIlIIIllIlIl[6] = (((152 + 44) - 152) + 132) ^ (((64 + 105) - 13) + 24);
        lIlIIIllIlIl[7] = 61 ^ 53;
    }

    private static boolean llIlIllIllIlII(int i) {
        return i == 0;
    }

    protected int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[0]]);
        });
    }

    private static String llIlIllIlIllII(String lllllllllllllllIllIlllllIllllIII, String lllllllllllllllIllIlllllIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllllIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllllIllllIlI.init(lIlIIIllIlIl[5], lllllllllllllllIllIlllllIllllIll);
            return new String(lllllllllllllllIllIlllllIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllllIllllIIl) {
            lllllllllllllllIllIlllllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIllIllIllI(int i) {
        return i != 0;
    }

    @Inject
    public C0010aj(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cP = squireChambersPlugin;
        this.cQ = squireChambersConfig;
    }

    private static String llIlIllIlIllIl(String lllllllllllllllIllIllllllIIIllIl, String lllllllllllllllIllIllllllIIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllllllIIIllII.toCharArray();
        int lllllllllllllllIllIllllllIIIlIIl = lIlIIIllIlIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIllIlIl[1];
        while (llIlIllIlllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllllllIIIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIllIllllllIIIlIIl++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIllIllIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIllIllIIlI(int i, int i2) {
        return i >= i2;
    }

    protected int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[5]]);
        });
    }

    private static boolean llIlIllIllIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIllIllIlIl(Object obj) {
        return obj == null;
    }

    private static String llIlIllIlIlIll(String lllllllllllllllIllIllllllIIlllIl, String lllllllllllllllIllIllllllIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIllIllllllIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllllIIlllII.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlIl[7]), "DES");
            Cipher lllllllllllllllIllIllllllIIlllll = Cipher.getInstance("DES");
            lllllllllllllllIllIllllllIIlllll.init(lIlIIIllIlIl[5], lllllllllllllllIllIllllllIlIIIII);
            return new String(lllllllllllllllIllIllllllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllllllIIllllI) {
            lllllllllllllllIllIllllllIIllllI.printStackTrace();
            return null;
        }
    }

    private static void llIlIllIlIlllI() {
        lIlIIIllIlII = new String[lIlIIIllIlIl[6]];
        lIlIIIllIlII[lIlIIIllIlIl[1]] = llIlIllIlIlIll("JEdTIiePP5M=", "yTGLo");
        lIlIIIllIlII[lIlIIIllIlIl[0]] = llIlIllIlIllII("HKESJu97otg63FnSyNuiNw==", "GAKTF");
        lIlIIIllIlII[lIlIIIllIlIl[5]] = llIlIllIlIllIl("OhYzEQZFAGEZDAY=", "bsAxe");
        lIlIIIllIlII[lIlIIIllIlIl[4]] = llIlIllIlIllII("ssg+WXUQ+wQ=", "ipLTC");
    }

    static {
        llIlIllIlIllll();
        llIlIllIlIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    public boolean run() {
        ?? r0 = lIlIIIllIlIl[0];
        int[] iArr = new int[lIlIIIllIlIl[0]];
        iArr[lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
        if (!llIlIllIllIIII(Inventory.getCount((boolean) r0, iArr), lIlIIIllIlIl[3]) && !llIlIllIllIIIl(C0046u.bh(), EnumC0048w.REACHED_BOTTOM) && !llIlIllIllIIlI(cq(), lIlIIIllIlIl[4])) {
            if (!llIlIllIllIIll(this.cP.L()) || llIlIllIllIlII(this.cP.L().a((Locatable) Players.getLocal()) ? 1 : 0)) {
                return lIlIIIllIlIl[1];
            }
            if (llIlIllIllIIll(NPCs.getNearest(npc -> {
                String[] strArr = new String[lIlIIIllIlIl[0]];
                strArr[lIlIIIllIlIl[1]] = lIlIIIllIlII[lIlIIIllIlIl[4]];
                if (llIlIllIllIllI(npc.hasAction(strArr) ? 1 : 0) && llIlIllIllIllI(this.cP.L().a((Locatable) npc) ? 1 : 0)) {
                    ?? r02 = lIlIIIllIlIl[0];
                    "".length();
                    return " ".length() < 0 ? ((237 ^ 139) ^ (115 ^ 7)) & (((((33 + 28) - (-82)) + 4) ^ (((97 + 66) - 129) + 95)) ^ (-" ".length())) : r02;
                }
                return lIlIIIllIlIl[1];
            }))) {
                return lIlIIIllIlIl[1];
            }
            TileItem nearest = TileItems.getNearest(tileItem -> {
                if (llIlIllIllIlll(tileItem.getId(), lIlIIIllIlIl[2]) && llIlIllIllIllI(Reachable.isInteractable(tileItem) ? 1 : 0) && llIlIllIllIllI(this.cP.L().a((Locatable) tileItem) ? 1 : 0)) {
                    ?? r02 = lIlIIIllIlIl[0];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return lIlIIIllIlIl[1];
            });
            if (llIlIllIllIlIl(nearest)) {
                return lIlIIIllIlIl[1];
            }
            if (llIlIllIllIllI(Inventory.isFull() ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIllIlIl[0]];
                iArr2[lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
                if (llIlIllIllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    this.cP.x();
                    "".length();
                    return lIlIIIllIlIl[0];
                }
            }
            nearest.interact(lIlIIIllIlII[lIlIIIllIlIl[1]]);
            return lIlIIIllIlIl[0];
        }
        return lIlIIIllIlIl[1];
    }

    private static boolean llIlIllIllIIll(Object obj) {
        return obj != null;
    }

    private static boolean llIlIllIlllIII(int i, int i2) {
        return i < i2;
    }
}
