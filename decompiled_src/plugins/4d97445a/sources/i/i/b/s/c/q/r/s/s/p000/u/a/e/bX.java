package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.wilderness.altar.ChaosAltar;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Altaring")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bX  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bX.class */
public class bX extends Task {
    private final /* synthetic */ Client hg;
    private static /* synthetic */ int[] lIIlIIlll;
    private static /* synthetic */ String[] lIIlIIllI;
    private final /* synthetic */ ChaosAltar hf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean cX() {
        String[] strArr = new String[lIIlIIlll[1]];
        strArr[lIIlIIlll[0]] = lIIlIIllI[lIIlIIlll[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIIIIIIIII(nearest)) {
            return lIIlIIlll[0];
        }
        nearest.interact(lIIlIIllI[lIIlIIlll[3]]);
        sleep(lIIlIIlll[5]);
        return lIIlIIlll[1];
    }

    private static boolean llllllllII(int i2) {
        return i2 != 0;
    }

    private static boolean llllllllll(Object obj) {
        return obj != null;
    }

    private static void lllllllIlI() {
        lIIlIIlll = new int[8];
        lIIlIIlll[0] = (145 ^ 159) & ((25 ^ 23) ^ (-1));
        lIIlIIlll[1] = " ".length();
        lIIlIIlll[2] = 49 ^ 40;
        lIIlIIlll[3] = "  ".length();
        lIIlIIlll[4] = (-5) & 7999;
        lIIlIIlll[5] = "   ".length();
        lIIlIIlll[6] = 175 ^ 171;
        lIIlIIlll[7] = (((133 + 128) - 139) + 29) ^ (((124 + 35) - 35) + 22);
    }

    private static boolean lIIIIIIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lllllllIlI();
        lllllllIIl();
    }

    private static boolean lllllllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static String lllllllIII(String llIIlIIlIIIIIll, String llIIlIIlIIIIIlI) {
        String llIIlIIlIIIIIll2 = new String(Base64.getDecoder().decode(llIIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIIlIIIIIIl = new StringBuilder();
        char[] llIIlIIlIIIIIII = llIIlIIlIIIIIlI.toCharArray();
        int llIIlIIIlllllll = lIIlIIlll[0];
        char[] charArray = llIIlIIlIIIIIll2.toCharArray();
        int length = charArray.length;
        int i2 = lIIlIIlll[0];
        while (lIIIIIIIIIl(i2, length)) {
            char llIIlIIlIIIIlII = charArray[i2];
            llIIlIIlIIIIIIl.append((char) (llIIlIIlIIIIlII ^ llIIlIIlIIIIIII[llIIlIIIlllllll % llIIlIIlIIIIIII.length]));
            "".length();
            llIIlIIIlllllll++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llIIlIIlIIIIIIl);
    }

    private static boolean llllllllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    public boolean run() {
        if (lllllllIll(this.hg.getGameState(), GameState.LOGGED_IN)) {
            return lIIlIIlll[0];
        }
        if (llllllllII(this.hf.cY() ? 1 : 0)) {
            Game.logout();
            return lIIlIIlll[1];
        }
        if (llllllllIl(Movement.isRunEnabled() ? 1 : 0) && lllllllllI(Movement.getRunEnergy(), lIIlIIlll[2])) {
            Movement.toggleRun();
        }
        if (llllllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIIlll[0];
        }
        if (llllllllII(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIIlIIlll[3]];
            dialogOptionArr[lIIlIIlll[0]] = DialogOption.CHAT_OPTION_THREE;
            dialogOptionArr[lIIlIIlll[1]] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
        }
        String[] strArr = new String[lIIlIIlll[1]];
        strArr[lIIlIIlll[0]] = lIIlIIllI[lIIlIIlll[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        Item first = Inventory.getFirst(item -> {
            if (llllllllII(item.getName().contains(lIIlIIllI[lIIlIIlll[6]]) ? 1 : 0) && llllllllIl(item.isNoted() ? 1 : 0)) {
                ?? r0 = lIIlIIlll[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIlll[0];
        });
        if (llllllllll(nearest) && llllllllll(first)) {
            if (llllllllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                return cX();
            }
            first.useOn(nearest);
            return lIIlIIlll[1];
        }
        if (lIIIIIIIIII(first)) {
            int[] iArr = new int[lIIlIIlll[1]];
            iArr[lIIlIIlll[0]] = lIIlIIlll[4];
            NPC nearest2 = NPCs.getNearest(iArr);
            Item first2 = Inventory.getFirst(item2 -> {
                if (llllllllII(item2.getName().contains(lIIlIIllI[lIIlIIlll[5]]) ? 1 : 0) && llllllllII(item2.isNoted() ? 1 : 0)) {
                    ?? r0 = lIIlIIlll[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIIlll[0];
            });
            if (!llllllllll(nearest2) || lIIIIIIIIII(first2)) {
                return lIIlIIlll[0];
            }
            if (llllllllIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                return cX();
            }
            first2.useOn(nearest2);
        }
        return lIIlIIlll[0];
    }

    @Inject
    public bX(ChaosAltar chaosAltar, Client client) {
        this.hf = chaosAltar;
        this.hg = client;
    }

    private static boolean lIIIIIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lllllllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lllllllIIl() {
        lIIlIIllI = new String[lIIlIIlll[7]];
        lIIlIIllI[lIIlIIlll[0]] = lllllllIII("EyYRPQdwLxwmFSI=", "PNpRt");
        lIIlIIllI[lIIlIIlll[1]] = lllllllIII("Py8BKylTKhwjPg==", "sNsLL");
        lIIlIIllI[lIIlIIlll[3]] = lllllllIII("GxE9Cg==", "TaXdG");
        lIIlIIllI[lIIlIIlll[5]] = lllllllIII("NBovPAs=", "VuAYx");
        lIIlIIllI[lIIlIIlll[6]] = lllllllIII("NDY0KD4=", "VYZMM");
    }
}
