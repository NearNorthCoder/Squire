package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ah  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ah.class */
public class C0008ah extends Task {
    private static /* synthetic */ int[] llIIIlIl;
    private final /* synthetic */ DagannothKingConfig cJ;
    private static /* synthetic */ String[] llIIIIIl;

    private static void lIlIllIIIl() {
        llIIIlIl = new int[8];
        llIIIlIl[0] = " ".length();
        llIIIlIl[1] = (169 ^ 147) & ((96 ^ 90) ^ (-1));
        llIIIlIl[2] = (-(132 ^ 195)) & (-17) & 8799;
        llIIIlIl[3] = (-((-1321) & 19770)) & (-4289) & 24567;
        llIIIlIl[4] = (-6161) & 16049;
        llIIIlIl[5] = (((45 + 107) - 37) + 18) ^ (((91 + 82) - 97) + 81);
        llIIIlIl[6] = "   ".length() ^ (26 ^ 14);
        llIIIlIl[7] = "  ".length();
    }

    private static void lIlIlIlllI() {
        llIIIIIl = new String[llIIIlIl[7]];
        llIIIIIl[llIIIlIl[1]] = lIlIlIlIll("DyAk", "JAPZy");
        llIIIIIl[llIIIlIl[0]] = lIlIlIllII("WItp3DMqA4U=", "Bzycp");
    }

    private static String lIlIlIllII(String llIllIllIlIIllI, String llIllIllIlIIlIl) {
        try {
            SecretKeySpec llIllIllIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIl[7], llIllIllIlIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIllIlIIlll) {
            llIllIllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIll(String llIllIllIlllIll, String llIllIllIlllIlI) {
        String llIllIllIlllIll2 = new String(Base64.getDecoder().decode(llIllIllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIllIllIlllIII = llIllIllIlllIlI.toCharArray();
        int llIllIllIllIlll = llIIIlIl[1];
        char[] charArray = llIllIllIlllIll2.toCharArray();
        int length = charArray.length;
        int i2 = llIIIlIl[1];
        while (lIlIllIlII(i2, length)) {
            sb.append((char) (charArray[i2] ^ llIllIllIlllIII[llIllIllIllIlll % llIllIllIlllIII.length]));
            "".length();
            llIllIllIllIlll++;
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIIlI(int i2) {
        return i2 == 0;
    }

    static {
        lIlIllIIIl();
        lIlIlIlllI();
    }

    @Inject
    private C0008ah(DagannothKingConfig dagannothKingConfig) {
        this.cJ = dagannothKingConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llIIIlIl[0]];
        iArr[llIIIlIl[1]] = llIIIlIl[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIllIIlI(new WorldArea(llIIIlIl[3], llIIIlIl[4], llIIIlIl[5], llIIIlIl[6], llIIIlIl[1]).contains(Players.getLocal()) ? 1 : 0) && !lIlIllIIll(nearest) && !lIlIllIlII(Combat.getMissingHealth(), this.cJ.eatMissingHealth())) {
            Item first = Inventory.getFirst(item -> {
                String str = llIIIIIl[llIIIlIl[0]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIlIllIIll(first)) {
                return llIIIlIl[1];
            }
            first.interact(llIIIIIl[llIIIlIl[1]]);
            return llIIIlIl[0];
        }
        return llIIIlIl[1];
    }

    private static boolean lIlIllIlII(int i2, int i3) {
        return i2 < i3;
    }
}
