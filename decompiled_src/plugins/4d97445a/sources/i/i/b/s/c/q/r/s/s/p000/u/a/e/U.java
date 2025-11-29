package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Throwing fishing explosive", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.U  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/U.class */
public class U extends Task {
    public static final /* synthetic */ int cm;
    private static /* synthetic */ String[] lIIIlIIl;
    public static final /* synthetic */ int cl;
    public static final /* synthetic */ int ck;
    public static final /* synthetic */ int cj;
    private static /* synthetic */ int[] lIIIlIlI;

    private static void lIIIIlIIIl() {
        lIIIlIlI = new int[10];
        lIIIlIlI[0] = ((((192 + 126) - 209) + 96) ^ (((80 + 65) - 92) + 76)) & (((((192 + 93) - 237) + 160) ^ (((41 + 154) - 133) + 94)) ^ (-" ".length()));
        lIIIlIlI[1] = (((17 + 57) - 51) + 123) ^ (((70 + 76) - 116) + 147);
        lIIIlIlI[2] = " ".length();
        lIIIlIlI[3] = (-((-22833) & 31547)) & (-7173) & 16382;
        lIIIlIlI[4] = (((72 + 65) - (-23)) + 42) ^ (((45 + 67) - 16) + 96);
        lIIIlIlI[5] = 123 ^ 74;
        lIIIlIlI[6] = (-((-10565) & 27095)) & (-8226) & 31419;
        lIIIlIlI[7] = (133 ^ 141) ^ (30 ^ 2);
        lIIIlIlI[8] = (-29570) & 65455;
        lIIIlIlI[9] = "  ".length();
    }

    private static boolean lIIIIlIIll(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIIIIIllll() {
        lIIIlIIl = new String[lIIIlIlI[9]];
        lIIIlIIl[lIIIlIlI[0]] = lIIIIIlllI("CQQ4", "LeLvu");
        lIIIlIIl[lIIIlIlI[2]] = lIIIIIlllI("Bi8y", "CNFsg");
    }

    private static boolean lIIIIlIlIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIIIIlIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIIIIlllI(String lllIIIlllIlIIIl, String lllIIIlllIlIIII) {
        String str = new String(Base64.getDecoder().decode(lllIIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIIlllIIlllI = lllIIIlllIlIIII.toCharArray();
        int lllIIIlllIIllIl = lIIIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlIlI[0];
        while (lIIIIlIllI(i2, length)) {
            char lllIIIlllIlIIlI = charArray[i2];
            sb.append((char) (lllIIIlllIlIIlI ^ lllIIIlllIIlllI[lllIIIlllIIllIl % lllIIIlllIIlllI.length]));
            "".length();
            lllIIIlllIIllIl++;
            i2++;
            "".length();
            if ((-(47 ^ 42)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIlIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            String str = lIIIlIIl[lIIIlIlI[2]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        });
        if (lIIIIlIIlI(first)) {
            return lIIIlIlI[0];
        }
        if (lIIIIlIIll(Combat.getMissingHealth(), lIIIlIlI[1])) {
            first.interact(lIIIlIIl[lIIIlIlI[0]]);
            return lIIIlIlI[2];
        }
        int[] iArr = new int[lIIIlIlI[2]];
        iArr[lIIIlIlI[0]] = lIIIlIlI[3];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIIIIlIlII(nearest) || lIIIIlIlIl(nearest.distanceTo(Players.getLocal()), lIIIlIlI[4])) {
            return lIIIlIlI[0];
        }
        int[] iArr2 = new int[lIIIlIlI[2]];
        iArr2[lIIIlIlI[0]] = lIIIlIlI[5];
        if (lIIIIlIlII(Projectiles.getNearest(iArr2))) {
            return lIIIlIlI[0];
        }
        int[] iArr3 = new int[lIIIlIlI[2]];
        iArr3[lIIIlIlI[0]] = lIIIlIlI[6];
        Item first2 = Inventory.getFirst(iArr3);
        if (lIIIIlIIlI(first2)) {
            return lIIIlIlI[0];
        }
        first2.useOn(nearest);
        sleep(lIIIlIlI[7]);
        return lIIIlIlI[2];
    }

    private static boolean lIIIIlIlII(Object obj) {
        return obj != null;
    }

    static {
        lIIIIlIIIl();
        lIIIIIllll();
        cl = lIIIlIlI[6];
        ck = lIIIlIlI[5];
        cm = lIIIlIlI[3];
        cj = lIIIlIlI[8];
    }
}
