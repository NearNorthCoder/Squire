package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Picking up an item")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bp  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bp.class */
public class C0043bp extends Task {
    private static /* synthetic */ int[] lIlIllllI;
    @Inject
    private /* synthetic */ SquireQuestHelper fK;
    private static /* synthetic */ String[] lIlIlllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    public boolean run() {
        if (lIIllIlIIIl(this.fK.cz().equals(lIlIlllIl[lIlIllllI[0]]) ? 1 : 0)) {
            return lIlIllllI[0];
        }
        int cJ = this.fK.cJ();
        if (lIIllIlIIlI(cJ, lIlIllllI[1])) {
            return lIlIllllI[0];
        }
        int[] iArr = new int[lIlIllllI[2]];
        iArr[lIlIllllI[0]] = cJ;
        if (lIIllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIllllI[2]];
            iArr2[lIlIllllI[0]] = cJ;
            if (!lIIllIlIIll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIllllI[2]];
                iArr3[lIlIllllI[0]] = cJ;
                TileItem nearest = TileItems.getNearest(iArr3);
                if (lIIllIlIlII(nearest)) {
                    return lIlIllllI[0];
                }
                if (!lIIllIlIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    nearest.interact(lIlIlllIl[lIlIllllI[2]]);
                    return lIlIllllI[2];
                }
                Movement.walkTo(nearest.getWorldLocation());
                "".length();
                return lIlIllllI[2];
            }
        }
        return lIlIllllI[0];
    }

    private static boolean lIIllIlIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIllIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIllIlIIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIIllIIlllI(String lIlllllIIIllIIl, String lIlllllIIIlIIll) {
        String str = new String(Base64.getDecoder().decode(lIlllllIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllllIIIlIlll = new StringBuilder();
        char[] lIlllllIIIlIllI = lIlllllIIIlIIll.toCharArray();
        int lIlllllIIIlIlIl = lIlIllllI[0];
        char[] charArray = str.toCharArray();
        int lIlllllIIIIlllI = charArray.length;
        int i2 = lIlIllllI[0];
        while (lIIllIlIlIl(i2, lIlllllIIIIlllI)) {
            char lIlllllIIIIllII = charArray[i2];
            lIlllllIIIlIlll.append((char) (lIlllllIIIIllII ^ lIlllllIIIlIllI[lIlllllIIIlIlIl % lIlllllIIIlIllI.length]));
            "".length();
            lIlllllIIIlIlIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIlllllIIIlIlll);
    }

    private static boolean lIIllIlIlII(Object obj) {
        return obj == null;
    }

    private static void lIIllIlIIII() {
        lIlIllllI = new int[4];
        lIlIllllI[0] = (32 ^ 42) & ((71 ^ 77) ^ (-1));
        lIlIllllI[1] = -" ".length();
        lIlIllllI[2] = " ".length();
        lIlIllllI[3] = "  ".length();
    }

    private static void lIIllIIllll() {
        lIlIlllIl = new String[lIlIllllI[3]];
        lIlIlllIl[lIlIllllI[0]] = lIIllIIlllI("FTEcAg09MQwyETQnHDAQNCQ=", "QThcd");
        lIlIlllIl[lIlIllllI[2]] = lIIllIIlllI("EAUvHQ==", "DdDxa");
    }

    private static boolean lIIllIlIIIl(int i2) {
        return i2 == 0;
    }

    static {
        lIIllIlIIII();
        lIIllIIllll();
    }
}
