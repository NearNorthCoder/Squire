package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bJ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bJ.class */
public class bJ extends Task {
    private static /* synthetic */ int[] lIIllIlI;
    private final /* synthetic */ SarachnisConfig gC;
    private static /* synthetic */ String[] lIIllIIl;

    private static boolean lIIlIIIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIlIIIIIl() {
        lIIllIlI = new int[8];
        lIIllIlI[0] = " ".length();
        lIIllIlI[1] = (18 ^ 75) & ((33 ^ 120) ^ (-1));
        lIIllIlI[2] = (-19925) & 28637;
        lIIllIlI[3] = (-14538) & 16367;
        lIIllIlI[4] = (-((-10737) & 14839)) & (-1) & 13991;
        lIIllIlI[5] = (222 ^ 189) ^ (194 ^ 185);
        lIIllIlI[6] = 103 ^ 112;
        lIIllIlI[7] = "  ".length();
    }

    private static boolean lIIlIIIIll(Object obj) {
        return obj == null;
    }

    static {
        lIIlIIIIIl();
        lIIlIIIIII();
    }

    private static void lIIlIIIIII() {
        lIIllIIl = new String[lIIllIlI[7]];
        lIIllIIl[lIIllIlI[1]] = lIIIllllll("AzgH", "FYsLc");
        lIIllIIl[lIIllIlI[0]] = lIIIllllll("HyQB", "ZEuMF");
    }

    @Inject
    private bJ(SarachnisConfig sarachnisConfig) {
        this.gC = sarachnisConfig;
    }

    private static String lIIIllllll(String lllIIIIlIlIllll, String lllIIIIlIlIlllI) {
        String lllIIIIlIlIllll2 = new String(Base64.getDecoder().decode(lllIIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIIIIlIlIlllI.toCharArray();
        int lllIIIIlIlIIllI = lIIllIlI[1];
        char[] charArray2 = lllIIIIlIlIllll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIllIlI[1];
        while (lIIlIIIlII(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[lllIIIIlIlIIllI % charArray.length]));
            "".length();
            lllIIIIlIlIIllI++;
            i2++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIIllIlI[0]];
        iArr[lIIllIlI[1]] = lIIllIlI[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIIlIIIIlI(new WorldArea(lIIllIlI[3], lIIllIlI[4], lIIllIlI[5], lIIllIlI[6], lIIllIlI[1]).contains(Players.getLocal()) ? 1 : 0) && !lIIlIIIIll(nearest) && !lIIlIIIlII(Combat.getMissingHealth(), this.gC.eatMissingHealth())) {
            Item first = Inventory.getFirst(item -> {
                String str = lIIllIIl[lIIllIlI[0]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIIlIIIIll(first)) {
                return lIIllIlI[1];
            }
            first.interact(lIIllIIl[lIIllIlI[1]]);
            return lIIllIlI[0];
        }
        return lIIllIlI[1];
    }

    private static boolean lIIlIIIIlI(int i2) {
        return i2 == 0;
    }
}
