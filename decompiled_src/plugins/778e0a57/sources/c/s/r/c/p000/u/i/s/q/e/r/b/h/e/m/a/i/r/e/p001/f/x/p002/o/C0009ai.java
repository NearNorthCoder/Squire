package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
@TaskDesc(name = "Manage Overloads", priority = 30000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ai  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ai.class */
public class C0009ai extends Task {
    private final /* synthetic */ SquireChambersConfig cO;
    private static /* synthetic */ String[] lIlIIlIIlllI;
    private final /* synthetic */ SquireChambersPlugin cN;
    private static /* synthetic */ int[] lIlIIlIlIlIl;

    protected int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[2]]);
        });
    }

    private static boolean llIllIIlIlIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIlIIllll(int i) {
        return i == 0;
    }

    private static boolean llIllIIlIlIIII(int i) {
        return i != 0;
    }

    @Inject
    public C0009ai(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cN = squireChambersPlugin;
        this.cO = squireChambersConfig;
    }

    private static boolean llIllIIlIIlllI(int i, int i2) {
        return i <= i2;
    }

    private static String llIllIIIllllII(String lllllllllllllllIllIllIlIIlIIlIlI, String lllllllllllllllIllIllIlIIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIlIlIl[4], lllllllllllllllIllIllIlIIlIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlIIlIIlIll) {
            lllllllllllllllIllIllIlIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlIIlIll(String lllllllllllllllIllIllIlIIlIlllll, String lllllllllllllllIllIllIlIIlIllllI) {
        String lllllllllllllllIllIllIlIIlIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIlIIlIllllI.toCharArray();
        int lllllllllllllllIllIllIlIIlIllIll = lIlIIlIlIlIl[1];
        char[] charArray2 = lllllllllllllllIllIllIlIIlIlllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIlIlIl[1];
        while (llIllIIlIlIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIlIIlIllIll % charArray.length]));
            "".length();
            lllllllllllllllIllIllIlIIlIllIll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIllIIlIIllIl() {
        lIlIIlIlIlIl = new int[6];
        lIlIIlIlIlIl[0] = (46 ^ 8) ^ (1 ^ 35);
        lIlIIlIlIlIl[1] = ((((211 + 127) - 312) + 226) ^ (((44 + 130) - (-6)) + 9)) & (("  ".length() ^ (23 ^ 84)) ^ (-" ".length()));
        lIlIIlIlIlIl[2] = " ".length();
        lIlIIlIlIlIl[3] = (-11491) & 32486;
        lIlIIlIlIlIl[4] = "  ".length();
        lIlIIlIlIlIl[5] = "   ".length();
    }

    protected int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[4]]);
        });
    }

    static {
        llIllIIlIIllIl();
        llIllIIlIIllII();
    }

    private static void llIllIIlIIllII() {
        lIlIIlIIlllI = new String[lIlIIlIlIlIl[0]];
        lIlIIlIIlllI[lIlIIlIlIlIl[1]] = llIllIIIllllII("ucxM1sKwrt4=", "haZds");
        lIlIIlIIlllI[lIlIIlIlIlIl[2]] = llIllIIIllllII("sGj0Z4lARimGN6/fDbX90w==", "ThyPT");
        lIlIIlIIlllI[lIlIIlIlIlIl[4]] = llIllIIIllllII("Q9IZkipMf/1OpMqi0xaG+Q==", "tXscU");
        lIlIIlIIlllI[lIlIIlIlIlIl[5]] = llIllIIlIIlIll("Eg44MSg4", "SzLPK");
    }

    private static boolean llIllIIlIlIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean run() {
        if (!llIllIIlIIlllI(C0046u.bg(), lIlIIlIlIlIl[0]) || llIllIIlIIllll(Players.getLocal().getPlane())) {
            return lIlIIlIlIlIl[1];
        }
        int[] iArr = new int[lIlIIlIlIlIl[2]];
        iArr[lIlIIlIlIlIl[1]] = lIlIIlIlIlIl[3];
        if (!llIllIIlIlIIII(Inventory.contains(iArr) ? 1 : 0) && !llIllIIlIlIIIl(NPCs.getNearest(npc -> {
            String[] strArr = new String[lIlIIlIlIlIl[2]];
            strArr[lIlIIlIlIlIl[1]] = lIlIIlIIlllI[lIlIIlIlIlIl[5]];
            if (llIllIIlIlIIII(npc.hasAction(strArr) ? 1 : 0) && llIllIIlIlIIII(this.cN.L().a((Locatable) npc) ? 1 : 0)) {
                ?? r0 = lIlIIlIlIlIl[2];
                "".length();
                return "  ".length() >= ((168 ^ 181) ^ (95 ^ 70)) ? ((((12 + 71) - (-28)) + 55) ^ (((66 + 66) - 40) + 43)) & (((((96 + 163) - 58) + 30) ^ (((26 + 186) - 62) + 48)) ^ (-" ".length())) : r0;
            }
            return lIlIIlIlIlIl[1];
        }))) {
            TileItem nearest = TileItems.getNearest(tileItem -> {
                if (llIllIIlIlIIll(tileItem.getId(), lIlIIlIlIlIl[3]) && llIllIIlIlIIII(Reachable.isInteractable(tileItem) ? 1 : 0) && llIllIIlIlIIII(this.cN.L().a((Locatable) tileItem) ? 1 : 0)) {
                    ?? r0 = lIlIIlIlIlIl[2];
                    "".length();
                    return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIlIlIlIl[1];
            });
            if (llIllIIlIlIIlI(nearest)) {
                return lIlIIlIlIlIl[1];
            }
            if (!llIllIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
                nearest.interact(lIlIIlIIlllI[lIlIIlIlIlIl[1]]);
                return lIlIIlIlIlIl[2];
            }
            this.cN.x();
            "".length();
            return lIlIIlIlIlIl[2];
        }
        return lIlIIlIlIlIl[1];
    }

    private static boolean llIllIIlIlIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIllIIlIlIIlI(Object obj) {
        return obj == null;
    }
}
