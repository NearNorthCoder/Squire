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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Completing Cooks Assistant")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.p  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/p.class */
public class p extends Task {
    private final /* synthetic */ TaskManager at;
    private final /* synthetic */ SquireQuester as;
    private static /* synthetic */ String[] lIIIllIlIIlll;
    private final /* synthetic */ SquireQuesterConfig ar;
    private final /* synthetic */ Client aq;
    private static /* synthetic */ int[] lIIIllIlIlIII;

    private static boolean lIlIIIlIlIlIIll(Object obj) {
        return obj == null;
    }

    private void R() {
        if (!lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) || lIlIIIlIlIlIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            if (lIlIIIlIlIlIIIl(Dialog.hasOption(lIIIllIlIIlll[lIIIllIlIlIII[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIIIllIlIlIII[3]];
                strArr[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[3]];
                Dialog.chooseOption(strArr);
                "".length();
            }
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIlIII[5]];
            dialogOptionArr[lIIIllIlIlIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[3]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[9]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
        }
        if (lIlIIIlIlIIllll(V() ? 1 : 0)) {
            int[] iArr = new int[lIIIllIlIlIII[3]];
            iArr[lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
            if (lIlIIIlIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllIlIlIII[3]];
                iArr2[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (lIlIIIlIlIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIllIlIlIII[3]];
                    strArr2[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[1]];
                    TileItem nearest = TileItems.getNearest(strArr2);
                    if (lIlIIIlIlIlIIlI(nearest)) {
                        nearest.interact(lIIIllIlIIlll[lIIIllIlIlIII[2]]);
                    }
                    System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[6]]);
                    return;
                }
            }
            int[] iArr3 = new int[lIIIllIlIlIII[3]];
            iArr3[lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
            if (lIlIIIlIlIIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIlIlIII[13], lIIIllIlIlIII[14], lIIIllIlIlIII[0]));
                "".length();
                String[] strArr3 = new String[lIIIllIlIlIII[3]];
                strArr3[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[7]];
                NPCs.getNearest(strArr3).interact(lIIIllIlIIlll[lIIIllIlIlIII[8]]);
                Shop.buyOne(lIIIllIlIlIII[12]);
            }
            if (lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] iArr4 = new int[lIIIllIlIlIII[3]];
                iArr4[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (lIlIIIlIlIIllll(Inventory.contains(iArr4) ? 1 : 0)) {
                    U();
                }
            }
            if (lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] iArr5 = new int[lIIIllIlIlIII[3]];
                iArr5[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (lIlIIIlIlIlIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIllIlIlIII[3]];
                    iArr6[lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                    if (lIlIIIlIlIIllll(Inventory.contains(iArr6) ? 1 : 0)) {
                        T();
                    }
                }
            }
            if (lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] iArr7 = new int[lIIIllIlIlIII[3]];
                iArr7[lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
                if (lIlIIIlIlIIllll(Inventory.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIIllIlIlIII[3]];
                    iArr8[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                    if (lIlIIIlIlIlIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIllIlIlIII[3]];
                        iArr9[lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                        if (lIlIIIlIlIlIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                            S();
                        }
                    }
                }
            }
        }
        if (lIlIIIlIlIlIIIl(V() ? 1 : 0)) {
            String[] strArr4 = new String[lIIIllIlIlIII[3]];
            strArr4[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[9]];
            NPC nearest2 = NPCs.getNearest(strArr4);
            if (lIlIIIlIlIlIIlI(nearest2)) {
                nearest2.interact(lIIIllIlIIlll[lIIIllIlIlIII[5]]);
                sleepWhile(lIIIllIlIlIII[17], () -> {
                    if (lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                        ?? r0 = lIIIllIlIlIII[3];
                        "".length();
                        return (-(111 ^ 107)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIlIlIII[0];
                });
                "".length();
                if ((31 ^ 27) < "   ".length()) {
                    return;
                }
            } else {
                Walker.walkTo(new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));
                "".length();
            }
        }
        sleep(lIIIllIlIlIII[3]);
    }

    private static boolean lIlIIIlIlIlIIIl(int i) {
        return i != 0;
    }

    private static void lIlIIIlIlIIlllI() {
        lIIIllIlIlIII = new int[53];
        lIIIllIlIlIII[0] = " ".length() & (" ".length() ^ (-1));
        lIIIllIlIlIII[1] = "  ".length();
        lIIIllIlIlIII[2] = "   ".length();
        lIIIllIlIlIII[3] = " ".length();
        lIIIllIlIlIII[4] = (((135 + 111) - 209) + 107) ^ (((20 + 31) - 12) + 102);
        lIIIllIlIlIII[5] = 174 ^ 166;
        lIIIllIlIlIII[6] = 190 ^ 186;
        lIIIllIlIlIII[7] = (52 ^ 96) ^ (243 ^ 162);
        lIIIllIlIlIII[8] = 95 ^ 89;
        lIIIllIlIlIII[9] = (((123 + 55) - 30) + 26) ^ (((105 + 69) - 81) + 76);
        lIIIllIlIlIII[10] = (-((-16771) & 23015)) & (-24577) & 32751;
        lIIIllIlIlIII[11] = (-((-20011) & 24187)) & (-8227) & 14335;
        lIIIllIlIlIII[12] = (-((-4621) & 31327)) & (-4137) & 32767;
        lIIIllIlIlIII[13] = (-25460) & 28671;
        lIIIllIlIlIII[14] = (-((-3585) & 32531)) & (-577) & 32767;
        lIIIllIlIlIII[15] = (-6180) & 8123;
        lIIIllIlIlIII[16] = (-((-1031) & 27751)) & (-4121) & 32767;
        lIIIllIlIlIII[17] = (((43 + 79) - (-21)) + 31) ^ (((86 + 136) - 172) + 114);
        lIIIllIlIlIII[18] = (-((-2118) & 2423)) & (-8769) & 12279;
        lIIIllIlIlIII[19] = (-((-4237) & 12701)) & (-16961) & 28639;
        lIIIllIlIlIII[20] = (41 ^ 117) ^ (105 ^ 60);
        lIIIllIlIlIII[21] = (((50 + 96) - 46) + 36) ^ (((11 + 37) - (-38)) + 45);
        lIIIllIlIlIII[22] = (-17217) & 20423;
        lIIIllIlIlIII[23] = (-((-175) & 13039)) & (-1) & 16077;
        lIIIllIlIlIII[24] = (-388) & 3563;
        lIIIllIlIlIII[25] = (-((-9689) & 26585)) & (-4360) & 24567;
        lIIIllIlIlIII[26] = (116 ^ 99) ^ (138 ^ 145);
        lIIIllIlIlIII[27] = (5 ^ 10) ^ "  ".length();
        lIIIllIlIlIII[28] = (-((-4306) & 13277)) & (-16513) & 28671;
        lIIIllIlIlIII[29] = (-((-20613) & 21143)) & (-8449) & 12255;
        lIIIllIlIlIII[30] = (-(25 ^ 62)) & (-16913) & 20159;
        lIIIllIlIlIII[31] = (-((-9145) & 27645)) & (-33) & 20479;
        lIIIllIlIlIII[32] = (-((-247) & 21495)) & (-3) & 24411;
        lIIIllIlIlIII[33] = (-16417) & 19708;
        lIIIllIlIlIII[34] = 129 ^ 143;
        lIIIllIlIlIII[35] = 27 ^ 20;
        lIIIllIlIlIII[36] = 120 ^ 104;
        lIIIllIlIlIII[37] = (112 ^ 84) ^ (35 ^ 22);
        lIIIllIlIlIII[38] = (80 ^ 96) ^ (103 ^ 69);
        lIIIllIlIlIII[39] = (-24577) & 27740;
        lIIIllIlIlIII[40] = (-17170) & 20475;
        lIIIllIlIlIII[41] = 80 ^ 67;
        lIIIllIlIlIII[42] = 34 ^ 54;
        lIIIllIlIlIII[43] = 161 ^ 180;
        lIIIllIlIlIII[44] = 40 ^ 62;
        lIIIllIlIlIII[45] = (((11 + 100) - 98) + 171) ^ (((78 + 16) - (-59)) + 22);
        lIIIllIlIlIII[46] = 16 ^ 8;
        lIIIllIlIlIII[47] = (-((-221) & 29405)) & (-2) & 32351;
        lIIIllIlIlIII[48] = (-8453) & 11757;
        lIIIllIlIlIII[49] = 3 ^ 26;
        lIIIllIlIlIII[50] = (113 ^ 25) ^ (92 ^ 46);
        lIIIllIlIlIII[51] = 165 ^ 190;
        lIIIllIlIlIII[52] = (((0 + 77) - (-48)) + 58) ^ (((167 + 120) - 270) + 154);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(int i, WorldPoint worldPoint) {
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = i;
        if (lIlIIIlIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIlIlIII[3]];
            iArr2[lIIIllIlIlIII[0]] = i;
            TileItem nearest = TileItems.getNearest(iArr2);
            if (!lIlIIIlIlIlIIlI(nearest)) {
                Walker.walkTo(worldPoint);
                "".length();
            } else if (lIlIIIlIlIlIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(lIIIllIlIIlll[lIIIllIlIlIII[49]]);
                "".length();
                if ((-" ".length()) >= 0) {
                }
            } else {
                Walker.walkTo(worldPoint);
                "".length();
                "".length();
                if (((19 ^ 1) & ((0 ^ 18) ^ (-1))) < 0) {
                }
            }
        }
    }

    private static String lIlIIIlIlIIllII(String lllllllllllllllIIIIlIIlIIIlIIlll, String lllllllllllllllIIIIlIIlIIIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIlIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIlIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIlIIIlIlIIl.init(lIIIllIlIlIII[1], lllllllllllllllIIIIlIIlIIIlIlIlI);
            return new String(lllllllllllllllIIIIlIIlIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIlIIIlIlIII) {
            lllllllllllllllIIIIlIIlIIIlIlIII.printStackTrace();
            return null;
        }
    }

    private void U() {
        b(lIIIllIlIlIII[10], new WorldPoint(lIIIllIlIlIII[30], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        if (lIlIIIlIlIIllll(this.as.a() ? 1 : 0)) {
            a(lIIIllIlIlIII[31], new WorldPoint(lIIIllIlIlIII[32], lIIIllIlIlIII[33], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[34]], lIIIllIlIIlll[lIIIllIlIlIII[35]]);
        }
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (lIlIIIlIlIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIlIlIII[3]];
            iArr2[lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (lIlIIIlIlIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                String[] strArr = new String[lIIIllIlIlIII[3]];
                strArr[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[36]];
                if (lIlIIIlIlIlIIlI(TileObjects.getNearest(strArr))) {
                    String[] strArr2 = new String[lIIIllIlIlIII[3]];
                    strArr2[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[37]];
                    TileObjects.getNearest(strArr2).interact(lIIIllIlIIlll[lIIIllIlIlIII[38]]);
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                } else {
                    Walker.walkTo(new WorldPoint(lIIIllIlIlIII[39], lIIIllIlIlIII[40], lIIIllIlIlIII[1]));
                    "".length();
                }
            }
        }
        int[] iArr3 = new int[lIIIllIlIlIII[3]];
        iArr3[lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (lIlIIIlIlIlIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIIIllIlIlIII[3]];
            iArr4[lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (lIlIIIlIlIIllll(Inventory.contains(iArr4) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllIlIlIII[3]];
                strArr3[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[41]];
                if (lIlIIIlIlIlIIlI(TileObjects.getNearest(strArr3)) && lIlIIIlIlIIllll(this.as.a() ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIllIlIlIII[3]];
                    strArr4[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[42]];
                    TileObjects.getNearest(strArr4).interact(lIIIllIlIIlll[lIIIllIlIlIII[43]]);
                }
            }
        }
        if (lIlIIIlIlIlIIIl(this.as.a() ? 1 : 0)) {
            int[] iArr5 = new int[lIIIllIlIlIII[3]];
            iArr5[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
            if (lIlIIIlIlIIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                String[] strArr5 = new String[lIIIllIlIlIII[3]];
                strArr5[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[44]];
                if (!lIlIIIlIlIlIIlI(TileObjects.getNearest(strArr5))) {
                    Walker.walkTo(new WorldPoint(lIIIllIlIlIII[47], lIIIllIlIlIII[48], lIIIllIlIlIII[0]));
                    "".length();
                    return;
                }
                String[] strArr6 = new String[lIIIllIlIlIII[3]];
                strArr6[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[45]];
                TileObjects.getNearest(strArr6).interact(lIIIllIlIIlll[lIIIllIlIlIII[46]]);
                "".length();
                if ("   ".length() > "   ".length()) {
                }
            }
        }
    }

    private static boolean lIlIIIlIlIlIIII(int i, int i2) {
        return i >= i2;
    }

    @Inject
    public p(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aq = client;
        this.ar = squireQuesterConfig;
        this.as = squireQuester;
        this.at = taskManager;
    }

    private void M() {
        if (!lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) || !lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
            System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[21]]);
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIlIII[17]];
            dialogOptionArr[lIIIllIlIlIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[3]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArr[lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlIlIII[9]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIlIlIII[5]] = DialogOption.CHAT_OPTION_FOUR;
            dialogOptionArr[lIIIllIlIlIII[20]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        String[] strArr = new String[lIIIllIlIlIII[3]];
        strArr[lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[20]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIIIlIlIlIIlI(nearest)) {
            nearest.interact(lIIIllIlIIlll[lIIIllIlIlIII[17]]);
            sleepWhile(lIIIllIlIlIII[17], () -> {
                if (lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIlIlIII[3];
                    "".length();
                    return " ".length() >= ((130 ^ 159) ^ (135 ^ 158)) ? ((74 ^ 57) ^ (13 ^ 96)) & (((((8 + 70) - 30) + 113) ^ (((33 + 141) - 172) + 189)) ^ (-" ".length())) : r0;
                }
                return lIIIllIlIlIII[0];
            });
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));
            "".length();
        }
        "".length();
        if (" ".length() < 0) {
        }
    }

    private static void lIlIIIlIlIIllIl() {
        lIIIllIlIIlll = new String[lIIIllIlIlIII[52]];
        lIIIllIlIIlll[lIIIllIlIlIII[0]] = lIlIIIlIlIIlIlI("5yuncXdPqbXo25fHZl6V5RuHDsmvJ02XS4rkRef3CojGgUairXDLypN8vCYQxAdB", "OYfKq");
        lIIIllIlIIlll[lIIIllIlIlIII[3]] = lIlIIIlIlIIlIll("LCU+NC0BKjNtbCRmIS8jGmY9KSkfI2o1I00gIy8oTTIiKD9NNT40Kgto", "mFJAL");
        lIIIllIlIIlll[lIIIllIlIlIII[1]] = lIlIIIlIlIIllII("oxQSxbMmvcg=", "bgENW");
        lIIIllIlIIlll[lIIIllIlIlIII[2]] = lIlIIIlIlIIllII("cRxKMLy1bMU=", "qxgox");
        lIIIllIlIIlll[lIIIllIlIlIII[6]] = lIlIIIlIlIIllII("RjD2aMMj7IRa29aZzJAyqA==", "xAgAW");
        lIIIllIlIIlll[lIIIllIlIlIII[7]] = lIlIIIlIlIIllII("YdDDc57FtCW1t3GYeWqQ7Q==", "qAbtp");
        lIIIllIlIIlll[lIIIllIlIlIII[8]] = lIlIIIlIlIIlIlI("qJrWjTSf1R4=", "QMnao");
        lIIIllIlIIlll[lIIIllIlIlIII[9]] = lIlIIIlIlIIlIll("LSg6Ag==", "nGUil");
        lIIIllIlIIlll[lIIIllIlIlIII[5]] = lIlIIIlIlIIllII("VEEYpo/MZQM=", "JXRip");
        lIIIllIlIIlll[lIIIllIlIlIII[20]] = lIlIIIlIlIIllII("0CGkwF+qMVg=", "BesXE");
        lIIIllIlIIlll[lIIIllIlIlIII[17]] = lIlIIIlIlIIlIlI("LHTurr/eA68=", "YWstt");
        lIIIllIlIIlll[lIIIllIlIlIII[21]] = lIlIIIlIlIIlIlI("SUgJ9uLQxNg=", "LusEH");
        lIIIllIlIIlll[lIIIllIlIlIII[26]] = lIlIIIlIlIIlIll("FBgZJzJwGh8i", "PypUK");
        lIIIllIlIIlll[lIIIllIlIlIII[27]] = lIlIIIlIlIIlIlI("QxywdB+LwEI=", "aMClF");
        lIIIllIlIIlll[lIIIllIlIlIII[34]] = lIlIIIlIlIIllII("FswXFwLq18o=", "TkKDr");
        lIIIllIlIIlll[lIIIllIlIlIII[35]] = lIlIIIlIlIIlIlI("rZ+7q21nQko=", "ynRgQ");
        lIIIllIlIIlll[lIIIllIlIlIII[36]] = lIlIIIlIlIIlIll("LQ4+Oy4X", "eaNKK");
        lIIIllIlIIlll[lIIIllIlIlIII[37]] = lIlIIIlIlIIlIll("Hyo+PT8l", "WENMZ");
        lIIIllIlIIlll[lIIIllIlIlIII[38]] = lIlIIIlIlIIlIlI("1jRR+Wul0uo=", "clKpl");
        lIIIllIlIIlll[lIIIllIlIlIII[41]] = lIlIIIlIlIIlIlI("DKAs7MBACLs=", "dVfxN");
        lIIIllIlIIlll[lIIIllIlIlIII[42]] = lIlIIIlIlIIlIlI("SJOyMu5ed/XTlZkH55ql6g==", "MpUnR");
        lIIIllIlIIlll[lIIIllIlIlIII[43]] = lIlIIIlIlIIlIlI("N8Ge1IubgqQ=", "CzuXi");
        lIIIllIlIIlll[lIIIllIlIlIII[44]] = lIlIIIlIlIIllII("8MGbm6qxguQTieFcBA/AXQ==", "LfCAY");
        lIIIllIlIIlll[lIIIllIlIlIII[45]] = lIlIIIlIlIIlIll("KhopHTdMFC8G", "lvFhE");
        lIIIllIlIIlll[lIIIllIlIlIII[46]] = lIlIIIlIlIIlIll("IRc7IwE=", "dzKWx");
        lIIIllIlIIlll[lIIIllIlIlIII[49]] = lIlIIIlIlIIlIll("IxYZDQ==", "wwrhC");
        lIIIllIlIIlll[lIIIllIlIlIII[50]] = lIlIIIlIlIIlIll("BAodLw==", "PkvJu");
        lIIIllIlIIlll[lIIIllIlIlIII[51]] = lIlIIIlIlIIlIlI("b2i+9VzgKc2/kfEeJEa/t8A1/A6dIxVe", "cNkge");
    }

    private static String lIlIIIlIlIIlIll(String lllllllllllllllIIIIlIIlIIlIIlIIl, String lllllllllllllllIIIIlIIlIIlIIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIlIIlIIlIIIllI = lllllllllllllllIIIIlIIlIIlIIlIII.toCharArray();
        int lllllllllllllllIIIIlIIlIIlIIIlIl = lIIIllIlIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlIlIII[0];
        while (lIlIIIlIlIlIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIIlIIlIIlIIIllI[lllllllllllllllIIIIlIIlIIlIIIlIl % lllllllllllllllIIIIlIIlIIlIIIllI.length]));
            "".length();
            lllllllllllllllIIIIlIIlIIlIIIlIl++;
            i++;
            "".length();
            if (((66 ^ 121) & ((142 ^ 181) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean V() {
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
        if (lIlIIIlIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] iArr2 = new int[lIIIllIlIlIII[3]];
        iArr2[lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
        if (lIlIIIlIlIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] iArr3 = new int[lIIIllIlIlIII[3]];
        iArr3[lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
        return lIlIIIlIlIIllll(Inventory.contains(iArr3) ? 1 : 0) ? lIIIllIlIlIII[0] : lIIIllIlIlIII[3];
    }

    public void a(int i, WorldPoint worldPoint, String str, String str2) {
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = i;
        if (lIlIIIlIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[lIIIllIlIlIII[3]];
            strArr[lIIIllIlIlIII[0]] = str;
            if (!lIlIIIlIlIlIIlI(TileObjects.getNearest(strArr))) {
                System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[51]]);
                Walker.walkTo(worldPoint);
                "".length();
                return;
            }
            String[] strArr2 = new String[lIIIllIlIlIII[3]];
            strArr2[lIIIllIlIlIII[0]] = str;
            if (lIlIIIlIlIlIIIl(Reachable.isInteractable(TileObjects.getNearest(strArr2)) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllIlIlIII[3]];
                strArr3[lIIIllIlIlIII[0]] = str;
                TileObjects.getNearest(strArr3).interact(str2);
                "".length();
                if (" ".length() > " ".length()) {
                    return;
                }
                return;
            }
            String[] strArr4 = new String[lIIIllIlIlIII[3]];
            strArr4[lIIIllIlIlIII[0]] = str;
            Movement.walkTo(TileObjects.getNearest(strArr4).getWorldLocation());
            "".length();
            "".length();
            if ((-"   ".length()) >= 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (lIlIIIlIlIIllll(this.ar.quest().equals(h.COOKS_ASSISTANT) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int Q = Q();
        System.out.println("[COOKS ASSISTANT] Current Progress: " + Q);
        if (lIlIIIlIlIlIIII(Q, lIIIllIlIlIII[1])) {
            return lIIIllIlIlIII[0];
        }
        switch (Q) {
            case 0:
                M();
                "".length();
                if (0 != 0) {
                    return ((236 ^ 149) ^ (117 ^ 56)) & (((120 ^ 55) ^ (95 ^ 36)) ^ (-" ".length()));
                }
                break;
            case 1:
                R();
                sleep(lIIIllIlIlIII[2]);
                "".length();
                if (((93 ^ 110) ^ (166 ^ 145)) < (((((52 + 53) - (-21)) + 51) ^ (((88 + 28) - (-2)) + 44)) & (((((1 + 8) - (-175)) + 7) ^ (((132 + 141) - 228) + 127)) ^ (-" ".length())))) {
                    return ((((20 + 37) - (-23)) + 67) ^ (((76 + 38) - 63) + 81)) & (((((81 + 124) - 86) + 66) ^ (((23 + 163) - 20) + 8)) ^ (-" ".length()));
                }
                break;
            default:
                return lIIIllIlIlIII[0];
        }
        return lIIIllIlIlIII[3];
    }

    private static boolean lIlIIIlIlIlIlII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIlIlIIlIlI(String lllllllllllllllIIIIlIIlIIIllIlII, String lllllllllllllllIIIIlIIlIIIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIlIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIlIIIllIIll.getBytes(StandardCharsets.UTF_8)), lIIIllIlIlIII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIlIlIII[1], lllllllllllllllIIIIlIIlIIIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIlIIIllIlIl) {
            lllllllllllllllIIIIlIIlIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp(lIIIllIlIlIII[4]);
    }

    private static boolean lIlIIIlIlIIllll(int i) {
        return i == 0;
    }

    static {
        lIlIIIlIlIIlllI();
        lIlIIIlIlIIllIl();
    }

    private void S() {
        b(lIIIllIlIlIII[12], new WorldPoint(lIIIllIlIlIII[22], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
        if (lIlIIIlIlIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            a(lIIIllIlIlIII[16], new WorldPoint(lIIIllIlIlIII[24], lIIIllIlIlIII[25], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[26]], lIIIllIlIIlll[lIIIllIlIlIII[27]]);
        }
    }

    public void b(int i, WorldPoint worldPoint) {
        int[] iArr = new int[lIIIllIlIlIII[3]];
        iArr[lIIIllIlIlIII[0]] = i;
        if (lIlIIIlIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIlIlIII[3]];
            iArr2[lIIIllIlIlIII[0]] = i;
            TileObject nearest = TileObjects.getNearest(iArr2);
            if (!lIlIIIlIlIlIIll(nearest)) {
                nearest.interact(lIIIllIlIIlll[lIIIllIlIlIII[50]]);
                return;
            }
            Walker.walkTo(worldPoint);
            "".length();
            "".length();
            if (" ".length() > "  ".length()) {
            }
        }
    }

    private static boolean lIlIIIlIlIlIIlI(Object obj) {
        return obj != null;
    }

    private void T() {
        a(lIIIllIlIlIII[15], new WorldPoint(lIIIllIlIlIII[28], lIIIllIlIlIII[29], lIIIllIlIlIII[0]));
    }
}
