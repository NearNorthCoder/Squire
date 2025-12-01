package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.util.Text;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Completing Natural History Quiz", register = true)
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.t  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/t.class */
public class t extends Task {
    private final /* synthetic */ TaskManager aJ;
    private /* synthetic */ int aK;
    private static /* synthetic */ int[] lIIIllIIIllII;
    private static /* synthetic */ String[] lIIIllIIIlIll;
    private final /* synthetic */ SquireQuester aI;
    private final /* synthetic */ SquireQuesterConfig aH;
    private final /* synthetic */ Client aG;
    private /* synthetic */ boolean aL;

    private void a(WorldPoint worldPoint, int i) {
        int[] iArr = new int[lIIIllIIIllII[1]];
        iArr[lIIIllIIIllII[0]] = i;
        TileObject tileObject = (TileObject) TileObjects.getAt(worldPoint, iArr).get(lIIIllIIIllII[0]);
        if (!lIlIIIIllIlllII(tileObject)) {
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        System.out.println(lIIIllIIIlIll[lIIIllIIIllII[9]]);
        tileObject.interact(lIIIllIIIlIll[lIIIllIIIllII[10]]);
        c(lIIIllIIIllII[10]);
        "".length();
        if ("   ".length() == "  ".length()) {
        }
    }

    private static boolean lIlIIIIllIllIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    private void bd() {
        b(lIIIllIIIllII[0]);
        int i = lIIIllIIIllII[0];
        if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[14]), lIIIllIIIllII[7])) {
            a(new WorldPoint(lIIIllIIIllII[15], lIIIllIIIllII[16], lIIIllIIIllII[0]), lIIIllIIIllII[17]);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[18]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint = new WorldPoint(lIIIllIIIllII[19], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl = lIIIllIIIllII[20];
            a(worldPoint, lllllllllllllllIIIIlIllIIlllIlIl);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[21]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint2 = new WorldPoint(lIIIllIIIllII[22], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl2 = lIIIllIIIllII[23];
            a(worldPoint2, lllllllllllllllIIIIlIllIIlllIlIl2);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[24]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint3 = new WorldPoint(lIIIllIIIllII[25], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl3 = lIIIllIIIllII[26];
            a(worldPoint3, lllllllllllllllIIIIlIllIIlllIlIl3);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[27]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint4 = new WorldPoint(lIIIllIIIllII[28], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl4 = lIIIllIIIllII[30];
            a(worldPoint4, lllllllllllllllIIIIlIllIIlllIlIl4);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[31]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint5 = new WorldPoint(lIIIllIIIllII[32], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl5 = lIIIllIIIllII[33];
            a(worldPoint5, lllllllllllllllIIIIlIllIIlllIlIl5);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[34]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint6 = new WorldPoint(lIIIllIIIllII[35], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl6 = lIIIllIIIllII[37];
            a(worldPoint6, lllllllllllllllIIIIlIllIIlllIlIl6);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[38]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint7 = new WorldPoint(lIIIllIIIllII[39], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl7 = lIIIllIIIllII[40];
            a(worldPoint7, lllllllllllllllIIIIlIllIIlllIlIl7);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[41]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint8 = new WorldPoint(lIIIllIIIllII[42], lIIIllIIIllII[43], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl8 = lIIIllIIIllII[44];
            a(worldPoint8, lllllllllllllllIIIIlIllIIlllIlIl8);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[45]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint9 = new WorldPoint(lIIIllIIIllII[46], lIIIllIIIllII[47], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl9 = lIIIllIIIllII[48];
            a(worldPoint9, lllllllllllllllIIIIlIllIIlllIlIl9);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[49]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint10 = new WorldPoint(lIIIllIIIllII[50], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl10 = lIIIllIIIllII[51];
            a(worldPoint10, lllllllllllllllIIIIlIllIIlllIlIl10);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[52]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint11 = new WorldPoint(lIIIllIIIllII[53], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl11 = lIIIllIIIllII[54];
            a(worldPoint11, lllllllllllllllIIIIlIllIIlllIlIl11);
        } else if (lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[55]), lIIIllIIIllII[7])) {
            WorldPoint worldPoint12 = new WorldPoint(lIIIllIIIllII[56], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl12 = lIIIllIIIllII[57];
            a(worldPoint12, lllllllllllllllIIIIlIllIIlllIlIl12);
        } else if (!lIlIIIIllIlllIl(Vars.getBit(lIIIllIIIllII[58]), lIIIllIIIllII[7])) {
            b(lIIIllIIIllII[1]);
        } else {
            WorldPoint worldPoint13 = new WorldPoint(lIIIllIIIllII[59], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            int lllllllllllllllIIIIlIllIIlllIlIl13 = lIIIllIIIllII[60];
            a(worldPoint13, lllllllllllllllIIIIlIllIIlllIlIl13);
        }
    }

    private static void lIlIIIIllIlIlll() {
        lIIIllIIIlIll = new String[lIIIllIIIllII[13]];
        lIIIllIIIlIll[lIIIllIIIllII[0]] = lIlIIIIllIlIlII("Mxc/JQcJBW0iAEcTOC4dEw==", "gbMKn");
        lIIIllIIIlIll[lIIIllIIIllII[1]] = lIlIIIIllIlIlIl("1pQPLlaDAqA=", "gsBNp");
        lIIIllIIIlIll[lIIIllIIIllII[4]] = lIlIIIIllIlIlII("GzgnOCohPmsnLG82OT8iIT0k", "OYKSC");
        lIIIllIIIlIll[lIIIllIIIllII[7]] = lIlIIIIllIlIlIl("sWNkXijK9ochz97moHx4+SqOsTlQK7cE", "dHQTo");
        lIIIllIIIlIll[lIIIllIIIllII[9]] = lIlIIIIllIlIlIl("d6dEFFxzp/HdBlyTCrMmYQ==", "JqGDV");
        lIIIllIIIlIll[lIIIllIIIllII[10]] = lIlIIIIllIlIlIl("kzYG/ZAitJg=", "olftA");
        lIIIllIIIlIll[lIIIllIIIllII[11]] = lIlIIIIllIlIlIl("CgcY1nX/gc8=", "gsSKz");
        lIIIllIIIlIll[lIIIllIIIllII[12]] = lIlIIIIllIlIllI("3jTXVO6qnC0=", "yZCdA");
    }

    @Inject
    public t(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aG = client;
        this.aH = squireQuesterConfig;
        this.aI = squireQuester;
        this.aJ = taskManager;
    }

    private static boolean lIlIIIIllIlllll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIIllIlIlII(String lllllllllllllllIIIIlIllIIIlllIlI, String lllllllllllllllIIIIlIllIIIlllIIl) {
        String lllllllllllllllIIIIlIllIIIlllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllIIIlllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIllIIIlllIIl.toCharArray();
        int lllllllllllllllIIIIlIllIIIllIllI = lIIIllIIIllII[0];
        char[] charArray2 = lllllllllllllllIIIIlIllIIIlllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIIllII[0];
        while (lIlIIIIllIlllll(i, length)) {
            char lllllllllllllllIIIIlIllIIIlllIll = charArray2[i];
            lllllllllllllllIIIIlIllIIIlllIII.append((char) (lllllllllllllllIIIIlIllIIIlllIll ^ charArray[lllllllllllllllIIIIlIllIIIllIllI % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIllIIIllIllI++;
            i++;
            "".length();
            if ((33 ^ 37) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIllIIIlllIII);
    }

    private static boolean lIlIIIIllIlllIl(int i, int i2) {
        return i != i2;
    }

    public void c(int i) {
        this.aK = i;
    }

    private static boolean lIlIIIIllIllIlI(int i, int i2) {
        return i >= i2;
    }

    public void b(boolean z) {
        this.aL = z;
    }

    private void Y() {
        System.out.println(lIIIllIIIlIll[lIIIllIIIllII[0]]);
        if (!lIlIIIIllIllIIl(Dialog.canContinue() ? 1 : 0) || !lIlIIIIllIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            System.out.println(lIIIllIIIlIll[lIIIllIIIllII[7]]);
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIllII[8]];
            dialogOptionArr[lIIIllIIIllII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIIllII[13]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIIIllII[1]];
        iArr[lIIIllIIIllII[0]] = lIIIllIIIllII[3];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIIllIlllII(nearest)) {
            nearest.interact(lIIIllIIIlIll[lIIIllIIIllII[1]]);
            System.out.println(lIIIllIIIlIll[lIIIllIIIllII[4]]);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));
            "".length();
        }
        "".length();
        if ((-"   ".length()) >= 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (!lIlIIIIllIllIIl(this.aH.quest().equals(h.NATURAL_HISTORY_QUIZ) ? 1 : 0) && !lIlIIIIllIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            if (lIlIIIIllIllIlI(be(), lIIIllIIIllII[1])) {
                this.aK -= lIIIllIIIllII[1];
                return lIIIllIIIllII[0];
            } else if (lIlIIIIllIllIIl(Vars.getBit(lIIIllIIIllII[2]))) {
                M();
                return lIIIllIIIllII[1];
            } else {
                if (lIlIIIIllIllIll(this.aL ? 1 : 0)) {
                    Y();
                }
                bd();
                return lIIIllIIIllII[1];
            }
        }
        return lIIIllIIIllII[0];
    }

    public boolean bf() {
        return this.aL;
    }

    private void M() {
        if (lIlIIIIllIllIIl(Dialog.canContinue() ? 1 : 0) && lIlIIIIllIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            int[] iArr = new int[lIIIllIIIllII[1]];
            iArr[lIIIllIIIllII[0]] = lIIIllIIIllII[3];
            NPC nearest = NPCs.getNearest(iArr);
            if (lIlIIIIllIlllII(nearest)) {
                nearest.interact(lIIIllIIIlIll[lIIIllIIIllII[11]]);
                sleepWhile(lIIIllIIIllII[61], () -> {
                    if (lIlIIIIllIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        ?? r0 = lIIIllIIIllII[1];
                        "".length();
                        return (((94 ^ 82) ^ (132 ^ 159)) & (((38 ^ 75) ^ (248 ^ 130)) ^ (-" ".length()))) != 0 ? (" ".length() ^ (2 ^ 33)) & (((((150 + 100) - 109) + 30) ^ (((125 + 124) - 179) + 67)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIIllII[0];
                });
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                Walker.walkTo(new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));
                "".length();
            }
            "".length();
            if ((135 ^ 131) <= 0) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIllII[62]];
        dialogOptionArr[lIIIllIIIllII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[61]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIllII[63]] = DialogOption.CHAT_OPTION_ONE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    static {
        lIlIIIIllIllIII();
        lIlIIIIllIlIlll();
    }

    private static void lIlIIIIllIllIII() {
        lIIIllIIIllII = new int[65];
        lIIIllIIIllII[0] = (19 ^ 8) & ((76 ^ 87) ^ (-1));
        lIIIllIIIllII[1] = " ".length();
        lIIIllIIIllII[2] = (-((-3917) & 16333)) & (-297) & 16383;
        lIIIllIIIllII[3] = (-((-1617) & 28377)) & (-3) & 32763;
        lIIIllIIIllII[4] = "  ".length();
        lIIIllIIIllII[5] = (-20769) & 22527;
        lIIIllIIIllII[6] = (-18469) & 23423;
        lIIIllIIIllII[7] = "   ".length();
        lIIIllIIIllII[8] = (22 ^ 125) ^ (59 ^ 89);
        lIIIllIIIllII[9] = 115 ^ 119;
        lIIIllIIIllII[10] = 175 ^ 170;
        lIIIllIIIllII[11] = 102 ^ 96;
        lIIIllIIIllII[12] = 25 ^ 30;
        lIIIllIIIllII[13] = (((124 + 104) - 207) + 122) ^ (((23 + 3) - (-43)) + 66);
        lIIIllIIIllII[14] = (-20613) & 24287;
        lIIIllIIIllII[15] = (-10513) & 12255;
        lIIIllIIIllII[16] = (-((-677) & 26285)) & (-134) & 30719;
        lIIIllIIIllII[17] = (-((-20511) & 23679)) & (-4737) & 32509;
        lIIIllIIIllII[18] = (-((-1569) & 30399)) & (-258) & 32767;
        lIIIllIIIllII[19] = (-((-2393) & 22911)) & (-10497) & 32767;
        lIIIllIIIllII[20] = (-((-8789) & 12885)) & (-3778) & 32479;
        lIIIllIIIllII[21] = (-((-690) & 29369)) & (-385) & 32735;
        lIIIllIIIllII[22] = (-((-1507) & 26102)) & (-4101) & 30463;
        lIIIllIIIllII[23] = (-((-12437) & 14037)) & (-417) & 26623;
        lIIIllIIIllII[24] = (-((-1027) & 29723)) & (-389) & 32765;
        lIIIllIIIllII[25] = (-((-12401) & 30845)) & (-8193) & 28414;
        lIIIllIIIllII[26] = (-((-4641) & 8061)) & (-4225) & 32252;
        lIIIllIIIllII[27] = (-((-11331) & 15843)) & (-24582) & 32767;
        lIIIllIIIllII[28] = (-((-19969) & 28431)) & (-20481) & 30718;
        lIIIllIIIllII[29] = (-9373) & 14335;
        lIIIllIIIllII[30] = (-3201) & 27813;
        lIIIllIIIllII[31] = (-((-21077) & 29397)) & (-35) & 12031;
        lIIIllIIIllII[32] = (-6145) & 7927;
        lIIIllIIIllII[33] = (-((-10085) & 12285)) & (-770) & 27583;
        lIIIllIIIllII[34] = (-386) & 4061;
        lIIIllIIIllII[35] = (-((-8269) & 14685)) & (-24577) & 32766;
        lIIIllIIIllII[36] = (-25731) & 30687;
        lIIIllIIIllII[37] = (-5529) & 30143;
        lIIIllIIIllII[38] = (-4254) & 7935;
        lIIIllIIIllII[39] = (-((-1139) & 3187)) & (-16651) & 20479;
        lIIIllIIIllII[40] = (-1238) & 25853;
        lIIIllIIIllII[41] = (-16668) & 20351;
        lIIIllIIIllII[42] = (-16653) & 18414;
        lIIIllIIIllII[43] = (-(((15 + 85) - (-15)) + 14)) & (-3094) & 8159;
        lIIIllIIIllII[44] = (-((-29229) & 31614)) & (-4741) & 31743;
        lIIIllIIIllII[45] = (-((-3395) & 23899)) & (-389) & 24575;
        lIIIllIIIllII[46] = (-((-10953) & 31725)) & (-8193) & 30719;
        lIIIllIIIllII[47] = (-9394) & 14333;
        lIIIllIIIllII[48] = (-((-12291) & 14019)) & (-2049) & 28393;
        lIIIllIIIllII[49] = (-((-8273) & 24951)) & (-1) & 20351;
        lIIIllIIIllII[50] = (-((-3399) & 27991)) & (-6401) & 32734;
        lIIIllIIIllII[51] = (-2257) & 26868;
        lIIIllIIIllII[52] = (-((-3930) & 8155)) & (-16417) & 24319;
        lIIIllIIIllII[53] = (-((-1031) & 25911)) & (-4105) & 30719;
        lIIIllIIIllII[54] = (-1733) & 26343;
        lIIIllIIIllII[55] = (-12289) & 15967;
        lIIIllIIIllII[56] = (-35) & 1771;
        lIIIllIIIllII[57] = (-7765) & 32373;
        lIIIllIIIllII[58] = (-((-11109) & 31743)) & (-257) & 24575;
        lIIIllIIIllII[59] = (-16389) & 18132;
        lIIIllIIIllII[60] = (-((-14577) & 15353)) & (-4161) & 29546;
        lIIIllIIIllII[61] = 57 ^ 51;
        lIIIllIIIllII[62] = (((99 + 28) - 11) + 26) ^ (((65 + 47) - 21) + 39);
        lIIIllIIIllII[63] = 11 ^ 0;
        lIIIllIIIllII[64] = (-((-16405) & 25981)) & (-20611) & 30719;
    }

    private static boolean lIlIIIIllIlllII(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (lIlIIIIllIlllIl(widgetLoaded.getGroupId(), lIIIllIIIllII[64])) {
            return;
        }
        Widget widget = this.aG.getWidget(WidgetInfo.VARROCK_MUSEUM_QUESTION);
        if (lIlIIIIllIllllI(widget)) {
            return;
        }
        Client client = this.aG;
        String text = widget.getText();
        int[] iArr = new int[lIIIllIIIllII[7]];
        iArr[lIIIllIIIllII[0]] = WidgetInfo.VARROCK_MUSEUM_FIRST_ANSWER.getId();
        iArr[lIIIllIIIllII[1]] = WidgetInfo.VARROCK_MUSEUM_SECOND_ANSWER.getId();
        iArr[lIIIllIIIllII[4]] = WidgetInfo.VARROCK_MUSEUM_THIRD_ANSWER.getId();
        Widget a = u.a(client, text, iArr);
        if (lIlIIIIllIllllI(a)) {
            return;
        }
        String text2 = a.getText();
        if (lIlIIIIllIllIll(text2.equals(Text.removeTags(text2)) ? 1 : 0)) {
            WidgetPackets.widgetAction(a, lIIIllIIIlIll[lIIIllIIIllII[12]]);
        }
    }

    private static boolean lIlIIIIllIllllI(Object obj) {
        return obj == null;
    }

    public int be() {
        return this.aK;
    }

    private static String lIlIIIIllIlIlIl(String lllllllllllllllIIIIlIllIIlIlIlll, String lllllllllllllllIIIIlIllIIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIIIllII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIIllII[4], lllllllllllllllIIIIlIllIIlIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIIlIllIII) {
            lllllllllllllllIIIIlIllIIlIllIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIllIlIllI(String lllllllllllllllIIIIlIllIIlIIlIlI, String lllllllllllllllIIIIlIllIIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIIllII[4], lllllllllllllllIIIIlIllIIlIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIIlIIlIll) {
            lllllllllllllllIIIIlIllIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllIllIll(int i) {
        return i != 0;
    }
}
