package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Completing Dwarf Cannon")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.q  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/q.class */
public class q extends Task {
    private static /* synthetic */ int[] lIIIllIlllIIl;
    private static /* synthetic */ String[] lIIIllIllIlll;
    private final /* synthetic */ SquireQuesterConfig au;

    private void ab() {
        if (lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[12])) {
            if (lIlIIIllIlIlIlI(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && lIlIIIllIlIlllI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
                Magic.cast(SpellBook.Standard.HOME_TELEPORT);
                sleep(lIIIllIlllIIl[14]);
                return;
            }
            return;
        }
        int i = lIIIllIlllIIl[15];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[16], lIIIllIlllIIl[17], lIIIllIlllIIl[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void ad() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        if (lIlIIIllIlIlIlI(Inventory.contains(iArr) ? 1 : 0) || lIlIIIllIllIIIl(Widgets.get(lIIIllIlllIIl[22], lIIIllIlllIIl[21]))) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIIl[2]];
        iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        Item first = Inventory.getFirst(iArr2);
        String[] strArr = new String[lIIIllIlllIIl[2]];
        strArr[lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[19]];
        first.useOn(TileObjects.getNearest(strArr));
    }

    private void af() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[33];
        NPC nearest = NPCs.getNearest(iArr);
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]);
        String[] strArr = new String[lIIIllIlllIIl[2]];
        strArr[lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[20]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIllIIII(nearest)) {
            if (!lIlIIIllIlIllIl(at.isEmpty() ? 1 : 0)) {
                ((TileObject) at.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[21]]);
                return;
            }
            Walker.walkTo(new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    public boolean run() {
        if (lIlIIIllIlIlIlI(this.au.quest().equals(h.DWARF_CANNON) ? 1 : 0)) {
            return lIIIllIlllIIl[0];
        }
        int Q = Q();
        if (lIlIIIllIlIlIll(Q, lIIIllIlllIIl[1])) {
            return lIIIllIlllIIl[0];
        }
        System.out.println("[DWARF_CANNON] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                M();
                "".length();
                if (((71 ^ 87) ^ (14 ^ 26)) <= (((113 ^ 49) ^ (71 ^ 67)) & (((((130 + 55) - 110) + 170) ^ (((164 + 5) - 8) + 16)) ^ (-" ".length())))) {
                    return ((((157 + 41) - 179) + 178) ^ (((56 + 72) - (-13)) + 24)) & (((((39 + 102) - 45) + 102) ^ (((132 + 117) - 137) + 54)) ^ (-" ".length()));
                }
                return lIIIllIlllIIl[2];
            case 1:
                ak();
                aj();
                ai();
                "".length();
                if (" ".length() >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 2:
                ah();
                "".length();
                if (0 != 0) {
                    return ((61 ^ 64) ^ (238 ^ 135)) & (((122 ^ 59) ^ (86 ^ 3)) ^ (-" ".length()));
                }
                return lIIIllIlllIIl[2];
            case 3:
                ah();
                ag();
                "".length();
                if ((-"  ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 4:
                af();
                "".length();
                if ((-(91 ^ 95)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 5:
                af();
                "".length();
                if (" ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 6:
                P();
                ae();
                "".length();
                if ((-((82 ^ 113) ^ (164 ^ 131))) > 0) {
                    return ((129 ^ 132) ^ (95 ^ 56)) & (((112 ^ 101) ^ (209 ^ 166)) ^ (-" ".length()));
                }
                return lIIIllIlllIIl[2];
            case 7:
                ad();
                ac();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 8:
                ai();
                "".length();
                if ((-" ".length()) > "  ".length()) {
                    return ((((180 + 81) - 251) + 232) ^ (((46 + 45) - 47) + 103)) & (((108 ^ 45) ^ (19 ^ 51)) ^ (-" ".length()));
                }
                return lIIIllIlllIIl[2];
            case 9:
                ab();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIlllIIl[2];
            case 10:
                Z();
                aa();
                Y();
                return lIIIllIlllIIl[0];
            default:
                return lIIIllIlllIIl[0];
        }
    }

    private void ah() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIIl[2]];
        iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[38];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIllIIIl(nearest) || !lIlIIIllIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[37]]);
            Walker.walkTo(new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[39], lIIIllIlllIIl[7]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIllIlll[lIIIllIlllIIl[18]]);
        "".length();
        if ("   ".length() < 0) {
        }
    }

    private void M() {
        int i = lIIIllIlllIIl[30];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[21]];
        dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[20]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void ai() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (lIlIIIllIlIlllI(Q(), lIIIllIlllIIl[2])) {
            int i = lIIIllIlllIIl[30];
            WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[36]];
            dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            a(i, worldPoint, dialogOptionArr);
        }
        if (lIlIIIllIlIlllI(Q(), lIIIllIlllIIl[37])) {
            int i2 = lIIIllIlllIIl[30];
            WorldPoint worldPoint2 = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
            DialogOption[] dialogOptionArr2 = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArr2[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[36]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            a(i2, worldPoint2, dialogOptionArr2);
        }
        if (lIlIIIllIlIlllI(Q(), lIIIllIlllIIl[14])) {
            int i3 = lIIIllIlllIIl[30];
            WorldPoint worldPoint3 = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
            DialogOption[] dialogOptionArr3 = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArr3[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[36]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr3[lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            a(i3, worldPoint3, dialogOptionArr3);
        }
    }

    private static void lIlIIIllIlIlIIl() {
        lIIIllIlllIIl = new int[54];
        lIIIllIlllIIl[0] = ((203 ^ 128) ^ (32 ^ 53)) & (((62 ^ 81) ^ (143 ^ 190)) ^ (-" ".length()));
        lIIIllIlllIIl[1] = (((63 + 37) - 68) + 107) ^ (((142 + 103) - 208) + 112);
        lIIIllIlllIIl[2] = " ".length();
        lIIIllIlllIIl[3] = (-6) & 11575;
        lIIIllIlllIIl[4] = (-((-195) & 11483)) & (-4101) & 16383;
        lIIIllIlllIIl[5] = (-17459) & 20471;
        lIIIllIlllIIl[6] = (-((-10274) & 30951)) & (-513) & 24543;
        lIIIllIlllIIl[7] = "  ".length();
        lIIIllIlllIIl[8] = "   ".length();
        lIIIllIlllIIl[9] = (-((-24611) & 27751)) & (-16385) & 28287;
        lIIIllIlllIIl[10] = (-((-2833) & 32665)) & (-1) & 32747;
        lIIIllIlllIIl[11] = (-((-2115) & 31591)) & (-65) & 32767;
        lIIIllIlllIIl[12] = (-(186 ^ 176)) & (-193) & 11775;
        lIIIllIlllIIl[13] = -" ".length();
        lIIIllIlllIIl[14] = (((78 + 70) - (-26)) + 33) ^ (((68 + 97) - 67) + 99);
        lIIIllIlllIIl[15] = (-((-1292) & 30607)) & (-2053) & 32767;
        lIIIllIlllIIl[16] = (-17430) & 20439;
        lIIIllIlllIIl[17] = (-4099) & 7551;
        lIIIllIlllIIl[18] = (92 ^ 48) ^ (28 ^ 119);
        lIIIllIlllIIl[19] = 18 ^ 22;
        lIIIllIlllIIl[20] = (((94 + 130) - 106) + 24) ^ (((18 + 23) - (-5)) + 93);
        lIIIllIlllIIl[21] = (((37 + 131) - 63) + 92) ^ (((122 + 188) - 293) + 178);
        lIIIllIlllIIl[22] = (-((-10385) & 28403)) & (-6149) & 24575;
        lIIIllIlllIIl[23] = (-((-6145) & 31449)) & (-37) & 26829567;
        lIIIllIlllIIl[24] = (67 ^ 91) ^ (107 ^ 111);
        lIIIllIlllIIl[25] = (-((-17425) & 28563)) & (-20513) & 26835882;
        lIIIllIlllIIl[26] = (-((-25265) & 32693)) & (-66) & 26811719;
        lIIIllIlllIIl[27] = (-6689) & 26810919;
        lIIIllIlllIIl[28] = (-((-24585) & 28381)) & (-291) & 26808311;
        lIIIllIlllIIl[29] = (-24593) & 26828825;
        lIIIllIlllIIl[30] = (-((-5441) & 32737)) & (-1) & 32487;
        lIIIllIlllIIl[31] = (-1273) & 3839;
        lIIIllIlllIIl[32] = (-((-1123) & 26235)) & (-66) & 28635;
        lIIIllIlllIIl[33] = (-16513) & 21702;
        lIIIllIlllIIl[34] = (-17893) & 20463;
        lIIIllIlllIIl[35] = (-((-4673) & 6854)) & (-16385) & 28415;
        lIIIllIlllIIl[36] = (4 ^ 121) ^ (202 ^ 190);
        lIIIllIlllIIl[37] = 19 ^ 27;
        lIIIllIlllIIl[38] = (-((-14497) & 31667)) & (-2) & 32767;
        lIIIllIlllIIl[39] = (-21125) & 24567;
        lIIIllIlllIIl[40] = 169 ^ 167;
        lIIIllIlllIIl[41] = (((120 + 73) - 153) + 118) ^ (((39 + 138) - 173) + 145);
        lIIIllIlllIIl[42] = (-((-2627) & 32339)) & (-513) & 32571;
        lIIIllIlllIIl[43] = 72 ^ 71;
        lIIIllIlllIIl[44] = (79 ^ 114) ^ (64 ^ 109);
        lIIIllIlllIIl[45] = 131 ^ 146;
        lIIIllIlllIIl[46] = 13 ^ 31;
        lIIIllIlllIIl[47] = (26 ^ 0) ^ (43 ^ 34);
        lIIIllIlllIIl[48] = 98 ^ 118;
        lIIIllIlllIIl[49] = (-((-2877) & 11134)) & (-19457) & 28027;
        lIIIllIlllIIl[50] = (((120 + 86) - 173) + 137) ^ (((38 + 42) - 6) + 92);
        lIIIllIlllIIl[51] = 200 ^ 197;
        lIIIllIlllIIl[52] = (-((-3235) & 28651)) & (-18) & 28665;
        lIIIllIlllIIl[53] = (-((-17505) & 22394)) & (-16389) & 24573;
    }

    private static boolean lIlIIIllIllIIlI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    private void Z() {
        if (lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            ?? r0 = lIIIllIlllIIl[2];
            int[] iArr2 = new int[lIIIllIlllIIl[2]];
            iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (lIlIIIllIlIlIll(Inventory.getCount((boolean) r0, iArr2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        if (!lIlIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlllIIl[2]];
            iArr3[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (lIlIIIllIlIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                ?? r02 = lIIIllIlllIIl[2];
                int[] iArr4 = new int[lIIIllIlllIIl[2]];
                iArr4[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
                if (lIlIIIllIlIlIll(Bank.getCount((boolean) r02, iArr4), lIIIllIlllIIl[1])) {
                    Bank.withdraw(lIIIllIlllIIl[4], lIIIllIlllIIl[1], Bank.WithdrawMode.ITEM);
                    return;
                }
                return;
            }
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]);
        String[] strArr = new String[lIIIllIlllIIl[2]];
        strArr[lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[2]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIlIllIl(at.isEmpty() ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
            "".length();
        } else if (lIlIIIllIlIlllI(at.size(), lIIIllIlllIIl[2])) {
            if (!lIlIIIllIlIlIlI(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIIl[0])) ? 1 : 0)) {
                ((TileObject) at.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[7]]);
                return;
            }
            Walker.walkTo(new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
            "".length();
        }
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIllIllIIIl(nearest) && lIlIIIllIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlll[lIIIllIlllIIl[40]]);
            "".length();
            if ((-((93 ^ 23) ^ (212 ^ 155))) >= 0) {
                return;
            }
            return;
        }
        System.out.println("Walking to NPC: " + i + " at " + String.valueOf(worldPoint));
        Walker.walkTo(worldPoint);
        "".length();
        sleep(lIIIllIlllIIl[7]);
    }

    private static String lIlIIIllIIllIll(String lllllllllllllllIIIIIlllIlllIIIlI, String lllllllllllllllIIIIIlllIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIllIlllIIl[37]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIlllIIl[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlllIlllIIIll) {
            lllllllllllllllIIIIIlllIlllIIIll.printStackTrace();
            return null;
        }
    }

    private void aj() {
        if (lIlIIIllIllIIlI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
            return;
        }
        if (lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            sleep(lIIIllIlllIIl[14]);
            return;
        }
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (lIlIIIllIlIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIIl[18]];
        iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        iArr2[lIIIllIlllIIl[2]] = lIIIllIlllIIl[43];
        iArr2[lIIIllIlllIIl[7]] = lIIIllIlllIIl[44];
        iArr2[lIIIllIlllIIl[8]] = lIIIllIlllIIl[45];
        iArr2[lIIIllIlllIIl[19]] = lIIIllIlllIIl[46];
        iArr2[lIIIllIlllIIl[20]] = lIIIllIlllIIl[47];
        iArr2[lIIIllIlllIIl[21]] = lIIIllIlllIIl[48];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (lIlIIIllIllIIIl(nearest) && lIlIIIllIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlll[lIIIllIlllIIl[36]]);
        }
    }

    private static boolean lIlIIIllIlIllll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    private void aa() {
        if (lIlIIIllIlIllll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[8]]);
            return;
        }
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            ?? r0 = lIIIllIlllIIl[2];
            int[] iArr2 = new int[lIIIllIlllIIl[2]];
            iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (lIlIIIllIlIllII(Inventory.getCount((boolean) r0, iArr2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        int i = lIIIllIlllIIl[9];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[10], lIIIllIlllIIl[11], lIIIllIlllIIl[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[8]];
        dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIllIllIIIl(Object obj) {
        return obj != null;
    }

    private void ag() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (lIlIIIllIlIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIlllIIl[30];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[36]];
        dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[8]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIlllIIl[19]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static String lIlIIIllIIlllII(String lllllllllllllllIIIIIlllIllIlIlIl, String lllllllllllllllIIIIIlllIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlllIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlllIllIlIlll.init(lIIIllIlllIIl[7], lllllllllllllllIIIIIlllIllIllIII);
            return new String(lllllllllllllllIIIIIlllIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlllIllIlIllI) {
            lllllllllllllllIIIIIlllIllIlIllI.printStackTrace();
            return null;
        }
    }

    private void P() {
        if (lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            sleep(lIIIllIlllIIl[7]);
        }
    }

    private void ac() {
        if (lIlIIIllIllIIII(Widgets.get(lIIIllIlllIIl[22], lIIIllIlllIIl[21]))) {
            return;
        }
        Widgets.fromId(lIIIllIlllIIl[23]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[23]);
        Widgets.fromId(lIIIllIlllIIl[25]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[25]);
        Widgets.fromId(lIIIllIlllIIl[26]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[26]);
        Widgets.fromId(lIIIllIlllIIl[27]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[27]);
        Widgets.fromId(lIIIllIlllIIl[28]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[28]);
        Widgets.fromId(lIIIllIlllIIl[29]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[29]);
    }

    private static void lIlIIIllIlIIIlI() {
        lIIIllIllIlll = new String[lIIIllIlllIIl[43]];
        lIIIllIllIlll[lIIIllIlllIIl[0]] = lIlIIIllIIllIll("wNtUoesm1JuUwjMwSKCbKPQA2UZ8qgug", "rvMWX");
        lIIIllIllIlll[lIIIllIlllIIl[2]] = lIlIIIllIIllIll("MIgYJK/saPefPS3II5OmYg==", "KXmKK");
        lIIIllIllIlll[lIIIllIlllIIl[7]] = lIlIIIllIIlllII("LKN69Yt9QMY=", "xrBXM");
        lIIIllIllIlll[lIIIllIlllIIl[8]] = lIlIIIllIIllIll("2vcgOFhEcUwTYPDSCJLxmg==", "iMjii");
        lIIIllIllIlll[lIIIllIlllIIl[19]] = lIlIIIllIIllIll("GLtPSUfB2rxEuAqlbiOuFdU3cJC8b9Uy", "Xzdkn");
        lIIIllIllIlll[lIIIllIlllIIl[20]] = lIlIIIllIIlllII("NKw0uwz8Xoc=", "MCCQT");
        lIIIllIllIlll[lIIIllIlllIIl[21]] = lIlIIIllIIlllII("6jxLDc1UHJ0=", "mtKau");
        lIIIllIllIlll[lIIIllIlllIIl[18]] = lIlIIIllIIllIll("Ykdo3Uaf6aw=", "maNFx");
        lIIIllIllIlll[lIIIllIlllIIl[37]] = lIlIIIllIIlllIl("OyslGh0CLWkFG0w4LBwVBSQ6", "lJIqt");
        lIIIllIllIlll[lIIIllIlllIIl[36]] = lIlIIIllIIlllIl("LgMgGhMEGQ==", "gmSjv");
        lIIIllIllIlll[lIIIllIlllIIl[14]] = lIlIIIllIIllIll("sAa9Hg/4Ofk=", "ducOx");
        lIIIllIllIlll[lIIIllIlllIIl[41]] = lIlIIIllIIlllII("/XDN5x65keI=", "THYEV");
        lIIIllIllIlll[lIIIllIlllIIl[50]] = lIlIIIllIIlllII("OHBMYi7fzB8=", "JXghp");
        lIIIllIllIlll[lIIIllIlllIIl[51]] = lIlIIIllIIlllIl("LzcGCy4F", "nCrjM");
        lIIIllIllIlll[lIIIllIlllIIl[40]] = lIlIIIllIIlllII("nCUECmB6ozw=", "EyEUi");
    }

    private static String lIlIIIllIIlllIl(String lllllllllllllllIIIIIlllIllIIIlIl, String lllllllllllllllIIIIIlllIllIIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlllIllIIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIlllIllIIIlII.toCharArray();
        int lllllllllllllllIIIIIlllIllIIIIIl = lIIIllIlllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIlllIIl[0];
        while (lIlIIIllIlIllII(i, length)) {
            lllllllllllllllIIIIIlllIllIIIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIIlllIllIIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIIlllIllIIIIIl++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIlllIllIIIIll);
    }

    private static boolean lIlIIIllIlIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIllIlIlIll(int i, int i2) {
        return i >= i2;
    }

    private void ae() {
        int i = lIIIllIlllIIl[30];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArr[lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    @Inject
    public q(SquireQuesterConfig squireQuesterConfig) {
        this.au = squireQuesterConfig;
    }

    private static boolean lIlIIIllIlIllII(int i, int i2) {
        return i < i2;
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_DWARF_CANNON.c());
    }

    static {
        lIlIIIllIlIlIIl();
        lIlIIIllIlIIIlI();
    }

    private void O() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0) || lIlIIIllIllIIIl(Players.getLocal().getInteracting())) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIIl[2]];
        strArr[lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[41]];
        NPC nearest = NPCs.getNearest(strArr);
        int[] iArr2 = new int[lIIIllIlllIIl[2]];
        iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        TileItem nearest2 = TileItems.getNearest(iArr2);
        if (lIlIIIllIllIIIl(nearest2) && lIlIIIllIlIllIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
            nearest2.interact(lIIIllIllIlll[lIIIllIlllIIl[50]]);
        } else if (lIlIIIllIllIIIl(nearest) && lIlIIIllIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0) && lIlIIIllIllIIII(Players.getLocal().getInteracting())) {
            nearest.interact(lIIIllIllIlll[lIIIllIlllIIl[51]]);
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIlllIIl[52], lIIIllIlllIIl[53], lIIIllIlllIIl[0]));
            "".length();
        }
    }

    private void Y() {
        System.out.println(Players.getLocal().getWorldLocation().getRegionID());
        if (lIlIIIllIlIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[0]]);
        } else {
            ai();
        }
    }

    private void N() {
        O();
    }

    private void ak() {
        int[] iArr = new int[lIIIllIlllIIl[2]];
        iArr[lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (lIlIIIllIlIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIIl[2]];
        iArr2[lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        TileItem nearest = TileItems.getNearest(iArr2);
        if (!lIlIIIllIllIIIl(nearest) || !lIlIIIllIlIllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
            return;
        }
        nearest.interact(lIIIllIllIlll[lIIIllIlllIIl[14]]);
        "".length();
        if (" ".length() >= ((171 ^ 191) ^ (114 ^ 98))) {
        }
    }

    private static boolean lIlIIIllIllIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIllIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIIIllIlIllIl(int i) {
        return i != 0;
    }
}
