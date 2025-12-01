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
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Completing Imp Catcher")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.r  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/r.class */
public class r extends Task {
    private final /* synthetic */ SquireQuesterConfig av;
    private static /* synthetic */ int[] lIIIllIIllIIl;
    private static /* synthetic */ String[] lIIIllIIllIII;

    private void al() {
        TileItem nearest = TileItems.getNearest(tileItem -> {
            return tileItem.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[54]]);
        });
        if (lIlIIIlIIIIllII(nearest)) {
            return;
        }
        int[] iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr) ? 1 : 0) && lIlIIIlIIIIlIIl(nearest.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[0]]) ? 1 : 0)) {
            nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[2]]);
            return;
        }
        int[] iArr2 = new int[lIIIllIIllIIl[2]];
        iArr2[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr2) ? 1 : 0) && lIlIIIlIIIIlIIl(nearest.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[1]]) ? 1 : 0)) {
            nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[18]]);
            return;
        }
        int[] iArr3 = new int[lIIIllIIllIIl[2]];
        iArr3[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr3) ? 1 : 0) && lIlIIIlIIIIlIIl(nearest.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[19]]) ? 1 : 0)) {
            nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[20]]);
            return;
        }
        int[] iArr4 = new int[lIIIllIIllIIl[2]];
        iArr4[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr4) ? 1 : 0) && lIlIIIlIIIIlIIl(nearest.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[21]]) ? 1 : 0)) {
            nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[22]]);
        }
    }

    private static void lIlIIIlIIIIIllI() {
        lIIIllIIllIIl = new int[56];
        lIIIllIIllIIl[0] = ((((164 + 18) - (-20)) + 11) ^ (((31 + 103) - 0) + 59)) & (((23 ^ 107) ^ (4 ^ 108)) ^ (-" ".length()));
        lIIIllIIllIIl[1] = "  ".length();
        lIIIllIIllIIl[2] = " ".length();
        lIIIllIIllIIl[3] = (-((-8734) & 25183)) & (-14337) & 32255;
        lIIIllIIllIIl[4] = (-12348) & 13819;
        lIIIllIIllIIl[5] = (-23090) & 24563;
        lIIIllIIllIIl[6] = (-((-1857) & 32595)) & (-513) & 32726;
        lIIIllIIllIIl[7] = (-17550) & 30399;
        lIIIllIIllIIl[8] = (-((-563) & 20403)) & (-13) & 32701;
        lIIIllIIllIIl[9] = (-((-22707) & 23223)) & (-3081) & 16189;
        lIIIllIIllIIl[10] = (-2114) & 14707;
        lIIIllIIllIIl[11] = (-16770) & 29107;
        lIIIllIIllIIl[12] = (-((-5669) & 22511)) & (-3589) & 32767;
        lIIIllIIllIIl[13] = -" ".length();
        lIIIllIIllIIl[14] = 142 ^ 132;
        lIIIllIIllIIl[15] = (-24594) & 32339;
        lIIIllIIllIIl[16] = (-8325) & 11428;
        lIIIllIIllIIl[17] = (-((-1289) & 30509)) & (-129) & 32511;
        lIIIllIIllIIl[18] = "   ".length();
        lIIIllIIllIIl[19] = 1 ^ 5;
        lIIIllIIllIIl[20] = (176 ^ 164) ^ (58 ^ 43);
        lIIIllIIllIIl[21] = (134 ^ 181) ^ (65 ^ 116);
        lIIIllIIllIIl[22] = 98 ^ 101;
        lIIIllIIllIIl[23] = 108 ^ 100;
        lIIIllIIllIIl[24] = (74 ^ 82) ^ (63 ^ 46);
        lIIIllIIllIIl[25] = (-12561) & 13118;
        lIIIllIIllIIl[26] = (((166 ^ 188) + (((102 + 175) - 118) + 25)) - (46 ^ 22)) + (24 ^ 55);
        lIIIllIIllIIl[27] = (-3361) & 3953;
        lIIIllIIllIIl[28] = 174 ^ 180;
        lIIIllIIllIIl[29] = (-((-8241) & 30002)) & (-577) & 32627;
        lIIIllIIllIIl[30] = (-((-24678) & 26351)) & (-20545) & 32763;
        lIIIllIIllIIl[31] = (-((-337) & 25085)) & (-5377) & 32751;
        lIIIllIIllIIl[32] = (-28963) & 32178;
        lIIIllIIllIIl[33] = (-1571) & 14306;
        lIIIllIIllIIl[34] = 111 ^ 100;
        lIIIllIIllIIl[35] = (-18433) & 19427;
        lIIIllIIllIIl[36] = (-((-939) & 2030)) & (-2081) & 8171;
        lIIIllIIllIIl[37] = (-23195) & 24575;
        lIIIllIIllIIl[38] = (-8842) & 12027;
        lIIIllIIllIIl[39] = (-4244) & 7679;
        lIIIllIIllIIl[40] = 61 ^ 49;
        lIIIllIIllIIl[41] = (-909) & 4093;
        lIIIllIIllIIl[42] = 78 ^ 67;
        lIIIllIIllIIl[43] = 143 ^ 129;
        lIIIllIIllIIl[44] = (-((-2241) & 31995)) & (-1) & 32634;
        lIIIllIIllIIl[45] = (((101 + 53) - 111) + 99) ^ (((73 + 75) - 29) + 10);
        lIIIllIIllIIl[46] = (-16649) & 19850;
        lIIIllIIllIIl[47] = (-((-129) & 12433)) & (-7) & 15743;
        lIIIllIIllIIl[48] = (-577) & 12011;
        lIIIllIIllIIl[49] = (51 ^ 20) ^ (243 ^ 196);
        lIIIllIIllIIl[50] = (-13066) & 16319;
        lIIIllIIllIIl[51] = (-((-10501) & 11191)) & (-16385) & 20475;
        lIIIllIIllIIl[52] = (126 ^ 6) ^ (23 ^ 126);
        lIIIllIIllIIl[53] = 46 ^ 60;
        lIIIllIIllIIl[54] = 167 ^ 180;
        lIIIllIIllIIl[55] = (19 ^ 87) ^ (242 ^ 162);
    }

    @Inject
    public r(SquireQuesterConfig squireQuesterConfig) {
        this.av = squireQuesterConfig;
    }

    private static void lIlIIIlIIIIIlIl() {
        lIIIllIIllIII = new String[lIIIllIIllIIl[55]];
        lIIIllIIllIII[lIIIllIIllIIl[0]] = lIlIIIlIIIIIIlI("1D9jGpLq3bY=", "rTVJb");
        lIIIllIIllIII[lIIIllIIllIIl[2]] = lIlIIIlIIIIIIll("NxIxBg==", "csZcp");
        lIIIllIIllIII[lIIIllIIllIIl[1]] = lIlIIIlIIIIIIll("DQg8Lg4j", "TmPBa");
        lIIIllIIllIII[lIIIllIIllIIl[18]] = lIlIIIlIIIIIIlI("a/OEaJNGFk0=", "BUpky");
        lIIIllIIllIII[lIIIllIIllIIl[19]] = lIlIIIlIIIIIlII("tk/txOfb9KQ=", "MHTWt");
        lIIIllIIllIII[lIIIllIIllIIl[20]] = lIlIIIlIIIIIIll("GDQDFg==", "LUhsK");
        lIIIllIIllIII[lIIIllIIllIIl[21]] = lIlIIIlIIIIIlII("ORumr1Kt0nk=", "KRgHX");
        lIIIllIIllIII[lIIIllIIllIIl[22]] = lIlIIIlIIIIIIlI("YfzXAYqu1Ig=", "wxKvG");
        lIIIllIIllIII[lIIIllIIllIIl[23]] = lIlIIIlIIIIIIll("Gh09CUIeACEECSg=", "MtSmb");
        lIIIllIIllIII[lIIIllIIllIIl[24]] = lIlIIIlIIIIIIlI("AFZ0Y48SAReT7ilbUNG02g==", "Vlzrg");
        lIIIllIIllIII[lIIIllIIllIIl[14]] = lIlIIIlIIIIIIlI("BWrNXs/D33w=", "hIEXs");
        lIIIllIIllIII[lIIIllIIllIIl[34]] = lIlIIIlIIIIIlII("px6pWtmFg10=", "cxXoA");
        lIIIllIIllIII[lIIIllIIllIIl[40]] = lIlIIIlIIIIIIll("CwIPAXYrDA4ePg==", "IcajV");
        lIIIllIIllIII[lIIIllIIllIIl[42]] = lIlIIIlIIIIIIlI("4/4hMe/39UA=", "qwpkB");
        lIIIllIIllIII[lIIIllIIllIIl[43]] = lIlIIIlIIIIIlII("bxBn2mehjqA=", "UNFlt");
        lIIIllIIllIII[lIIIllIIllIIl[45]] = lIlIIIlIIIIIIll("HQEWEio=", "IswvO");
        lIIIllIIllIII[lIIIllIIllIIl[49]] = lIlIIIlIIIIIIlI("gjvuwlD9jyA=", "iKnML");
        lIIIllIIllIII[lIIIllIIllIIl[52]] = lIlIIIlIIIIIIlI("vZ8aKSNgsR0=", "Hhpib");
        lIIIllIIllIII[lIIIllIIllIIl[53]] = lIlIIIlIIIIIIlI("4l1/gP246mk=", "PHoAT");
        lIIIllIIllIII[lIIIllIIllIIl[54]] = lIlIIIlIIIIIIll("CiAuIQ==", "hEOEG");
    }

    private void Y() {
        int[] iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (lIlIIIlIIIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIIllIIl[2]];
            iArr2[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            if (lIlIIIlIIIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllIIllIIl[2]];
                iArr3[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (lIlIIIlIIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIllIIllIIl[2]];
                    iArr4[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                    if (lIlIIIlIIIIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    int i = lIIIllIIllIIl[15];
                    WorldPoint worldPoint = new WorldPoint(lIIIllIIllIIl[16], lIIIllIIllIIl[17], lIIIllIIllIIl[1]);
                    DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIllIIl[14]];
                    dialogOptionArr[lIIIllIIllIIl[0]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[2]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[1]] = DialogOption.CHAT_OPTION_ONE;
                    dialogOptionArr[lIIIllIIllIIl[18]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[19]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[20]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[21]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[22]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[23]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[24]] = DialogOption.CHAT_OPTION_ONE;
                    a(i, worldPoint, dialogOptionArr);
                }
            }
        }
    }

    private static String lIlIIIlIIIIIIll(String lllllllllllllllIIIIlIlIIIllIlIll, String lllllllllllllllIIIIlIlIIIllIlIlI) {
        String lllllllllllllllIIIIlIlIIIllIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIlIIIllIlIIl = new StringBuilder();
        char[] lllllllllllllllIIIIlIlIIIllIlIII = lllllllllllllllIIIIlIlIIIllIlIlI.toCharArray();
        int lllllllllllllllIIIIlIlIIIllIIlll = lIIIllIIllIIl[0];
        char[] charArray = lllllllllllllllIIIIlIlIIIllIlIll2.toCharArray();
        int length = charArray.length;
        int i = lIIIllIIllIIl[0];
        while (lIlIIIlIIIIllll(i, length)) {
            lllllllllllllllIIIIlIlIIIllIlIIl.append((char) (charArray[i] ^ lllllllllllllllIIIIlIlIIIllIlIII[lllllllllllllllIIIIlIlIIIllIIlll % lllllllllllllllIIIIlIlIIIllIlIII.length]));
            "".length();
            lllllllllllllllIIIIlIlIIIllIIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIlIIIllIlIIl);
    }

    private void M() {
        int[] iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (lIlIIIlIIIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIIllIIl[2]];
            iArr2[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            if (lIlIIIlIIIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllIIllIIl[2]];
                iArr3[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (lIlIIIlIIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIllIIllIIl[2]];
                    iArr4[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                    if (lIlIIIlIIIIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    if (lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[7]) && lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[8]) && lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[9]) && lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[10]) && lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[11]) && lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[12])) {
                        if (lIlIIIlIIIIIlll(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && lIlIIIlIIIIlIll(Players.getLocal().getAnimation(), lIIIllIIllIIl[13])) {
                            Magic.cast(SpellBook.Standard.HOME_TELEPORT);
                            sleep(lIIIllIIllIIl[14]);
                            return;
                        }
                        return;
                    }
                    int i = lIIIllIIllIIl[15];
                    WorldPoint worldPoint = new WorldPoint(lIIIllIIllIIl[16], lIIIllIIllIIl[17], lIIIllIIllIIl[1]);
                    DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIllIIl[14]];
                    dialogOptionArr[lIIIllIIllIIl[0]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[2]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[1]] = DialogOption.CHAT_OPTION_ONE;
                    dialogOptionArr[lIIIllIIllIIl[18]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[19]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[20]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[21]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[22]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[23]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIIl[24]] = DialogOption.CHAT_OPTION_ONE;
                    a(i, worldPoint, dialogOptionArr);
                }
            }
        }
    }

    private static boolean lIlIIIlIIIIlIlI(int i, int i2) {
        return i != i2;
    }

    private static String lIlIIIlIIIIIIlI(String lllllllllllllllIIIIlIlIIlIIIlIII, String lllllllllllllllIIIIlIlIIlIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIllIIl[1], lllllllllllllllIIIIlIlIIlIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIlIIIlIIl) {
            lllllllllllllllIIIIlIlIIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIlIIIIIllI();
        lIlIIIlIIIIIlIl();
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_IMP_CATCHER.c());
    }

    private static boolean lIlIIIlIIIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIIIIllII(Object obj) {
        return obj == null;
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIlIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
        }
        int[] iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIlIIIIllIl(nearest) || !lIlIIIlIIIIlIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[52]]);
        "".length();
        if (0 != 0) {
        }
    }

    private static boolean lIlIIIlIIIIIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIIIlIIIIlllI(int i, int i2) {
        return i > i2;
    }

    private static String lIlIIIlIIIIIlII(String lllllllllllllllIIIIlIlIIIllllIll, String lllllllllllllllIIIIlIlIIIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIIllllIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIIllIIl[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIllIIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIIlllllII) {
            lllllllllllllllIIIIlIlIIIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIIIlIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIIlIIIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIlIIIIlIll(int i, int i2) {
        return i == i2;
    }

    private void am() {
        int[] iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIllIIl[2]];
        iArr2[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (lIlIIIlIIIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIIllIIl[2]];
            iArr3[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            if (lIlIIIlIIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIllIIllIIl[2]];
                iArr4[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (lIlIIIlIIIIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIIllIIllIIl[2]];
                    iArr5[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                    if (lIlIIIlIIIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        return;
                    }
                }
            }
        }
        int[] iArr6 = new int[lIIIllIIllIIl[2]];
        iArr6[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIIllIIllIIl[2]];
            iArr7[lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
            if (lIlIIIlIIIIllIl(TileItems.getNearest(iArr7))) {
                return;
            }
        }
        int[] iArr8 = new int[lIIIllIIllIIl[2]];
        iArr8[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIllIIllIIl[2]];
            iArr9[lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            if (lIlIIIlIIIIllIl(TileItems.getNearest(iArr9))) {
                return;
            }
        }
        int[] iArr10 = new int[lIIIllIIllIIl[2]];
        iArr10[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIIIllIIllIIl[2]];
            iArr11[lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
            if (lIlIIIlIIIIllIl(TileItems.getNearest(iArr11))) {
                return;
            }
        }
        int[] iArr12 = new int[lIIIllIIllIIl[2]];
        iArr12[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (lIlIIIlIIIIIlll(Inventory.contains(iArr12) ? 1 : 0)) {
            int[] iArr13 = new int[lIIIllIIllIIl[2]];
            iArr13[lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
            if (lIlIIIlIIIIllIl(TileItems.getNearest(iArr13))) {
                return;
            }
        }
        if (lIlIIIlIIIIllIl(Players.getLocal().getInteracting())) {
            return;
        }
        if (lIlIIIlIIIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (lIlIIIlIIIIIlll(Magic.isAutoCasting() ? 1 : 0)) {
            int[] iArr14 = new int[lIIIllIIllIIl[2]];
            iArr14[lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
            if (lIlIIIlIIIIlIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                if (lIlIIIlIIIIllIl(Widgets.get(lIIIllIIllIIl[26], lIIIllIIllIIl[2], lIIIllIIllIIl[2]))) {
                    Widgets.get(lIIIllIIllIIl[26], lIIIllIIllIIl[2], lIIIllIIllIIl[2]).interact(lIIIllIIllIII[lIIIllIIllIIl[23]]);
                }
                if (lIlIIIlIIIIllIl(Widgets.get(lIIIllIIllIIl[27], lIIIllIIllIIl[28]))) {
                    Widgets.get(lIIIllIIllIIl[27], lIIIllIIllIIl[28]).interact(lIIIllIIllIII[lIIIllIIllIIl[24]]);
                    return;
                }
                return;
            }
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIlIIIlIIIIlIIl(npc.getName().equals(lIIIllIIllIII[lIIIllIIllIIl[53]]) ? 1 : 0) && lIlIIIlIIIIIlll(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIIIllIIllIIl[2];
                "".length();
                return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((106 + 162) - 252) + 158) ^ (((6 + 0) - (-115)) + 34)) & (((187 ^ 182) ^ (88 ^ 96)) ^ (-" ".length())) : r0;
            }
            return lIIIllIIllIIl[0];
        });
        if (!lIlIIIlIIIIllIl(nearest) || !lIlIIIlIIIIlIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));
            "".length();
        } else if (!lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[29]) || lIlIIIlIIIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[30])) {
            nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[14]]);
            "".length();
            if ("  ".length() != "  ".length()) {
            }
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));
            "".length();
            "".length();
            if ((-"  ".length()) > 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
        if (lIlIIIlIIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0339  */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void an() {
        int[] iArr;
        int[] iArr2 = new int[lIIIllIIllIIl[2]];
        iArr2[lIIIllIIllIIl[0]] = lIIIllIIllIIl[33];
        if (lIlIIIlIIIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIIllIIl[2]];
            iArr3[lIIIllIIllIIl[0]] = lIIIllIIllIIl[33];
            Inventory.getFirst(iArr3).interact(lIIIllIIllIII[lIIIllIIllIIl[34]]);
            return;
        }
        int[] iArr4 = new int[lIIIllIIllIIl[2]];
        iArr4[lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
        if (lIlIIIlIIIIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
            ?? r0 = lIIIllIIllIIl[2];
            int[] iArr5 = new int[lIIIllIIllIIl[2]];
            iArr5[lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
            if (lIlIIIlIIIIlllI(Inventory.getCount((boolean) r0, iArr5), lIIIllIIllIIl[14])) {
                return;
            }
        }
        if (lIlIIIlIIIIlllI(Inventory.getFreeSlots(), lIIIllIIllIIl[1])) {
            ?? r02 = lIIIllIIllIIl[2];
            int[] iArr6 = new int[lIIIllIIllIIl[2]];
            iArr6[lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
            if (lIlIIIlIIIIllll(Inventory.getCount((boolean) r02, iArr6), lIIIllIIllIIl[36])) {
                int[] iArr7 = new int[lIIIllIIllIIl[2]];
                iArr7[lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
            }
            if (lIlIIIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                ?? r03 = lIIIllIIllIIl[2];
                int[] iArr8 = new int[lIIIllIIllIIl[2]];
                iArr8[lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
                if (lIlIIIlIIIlIIII(Inventory.getCount((boolean) r03, iArr8), lIIIllIIllIIl[36])) {
                    ?? r04 = lIIIllIIllIIl[2];
                    int[] iArr9 = new int[lIIIllIIllIIl[2]];
                    iArr9[lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
                    if (lIlIIIlIIIIlIII(Bank.getCount((boolean) r04, iArr9), lIIIllIIllIIl[36])) {
                        Bank.withdraw(lIIIllIIllIIl[35], lIIIllIIllIIl[36], Bank.WithdrawMode.ITEM);
                        sleep(lIIIllIIllIIl[20]);
                    }
                }
            }
            iArr = new int[lIIIllIIllIIl[2]];
            iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
            if (lIlIIIlIIIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIllIIllIIl[2]];
                iArr10[lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
                if (lIlIIIlIIIIIlll(Inventory.contains(iArr10) ? 1 : 0)) {
                    if (lIlIIIlIIIIlIIl(Shop.isOpen() ? 1 : 0)) {
                        Shop.buyFifty(lIIIllIIllIIl[33]);
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                        return;
                    }
                    int[] iArr11 = new int[lIIIllIIllIIl[2]];
                    iArr11[lIIIllIIllIIl[0]] = lIIIllIIllIIl[48];
                    NPC nearest = NPCs.getNearest(iArr11);
                    if (!lIlIIIlIIIIllIl(nearest) || !lIlIIIlIIIIlIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                        Walker.walkTo(new WorldPoint(lIIIllIIllIIl[50], lIIIllIIllIIl[51], lIIIllIIllIIl[0]));
                        "".length();
                        sleep(lIIIllIIllIIl[1]);
                        return;
                    }
                    nearest.interact(lIIIllIIllIII[lIIIllIIllIIl[49]]);
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                    return;
                }
                return;
            }
            int[] iArr12 = new int[lIIIllIIllIIl[2]];
            iArr12[lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
            if (lIlIIIlIIIIlIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIllIIllIIl[2]];
                iArr13[lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
                Inventory.getFirst(iArr13).interact(lIIIllIIllIII[lIIIllIIllIIl[43]]);
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return;
                }
                return;
            } else if (lIlIIIlIIIIlIIl(Shop.isOpen() ? 1 : 0)) {
                Shop.buyOne(lIIIllIIllIIl[37]);
                "".length();
                if (((234 ^ 197) & ((34 ^ 13) ^ (-1))) > 0) {
                    return;
                }
                return;
            } else {
                int[] iArr14 = new int[lIIIllIIllIIl[2]];
                iArr14[lIIIllIIllIIl[0]] = lIIIllIIllIIl[44];
                NPC nearest2 = NPCs.getNearest(iArr14);
                if (!lIlIIIlIIIIllIl(nearest2) || !lIlIIIlIIIIlIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIIllIIl[46], lIIIllIIllIIl[47], lIIIllIIllIIl[0]));
                    "".length();
                    return;
                }
                nearest2.interact(lIIIllIIllIII[lIIIllIIllIIl[45]]);
                "".length();
                if (true ^ true) {
                    return;
                }
                return;
            }
        }
        if (lIlIIIlIIIIIlll(Bank.isOpen() ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIIIllIIllIIl[38], lIIIllIIllIIl[39], lIIIllIIllIIl[0]);
            String[] strArr = new String[lIIIllIIllIIl[2]];
            strArr[lIIIllIIllIIl[0]] = lIIIllIIllIII[lIIIllIIllIIl[40]];
            List at = TileObjects.getAt(worldPoint, strArr);
            if (lIlIIIlIIIIlIIl(at.isEmpty() ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));
                "".length();
                return;
            } else if (lIlIIIlIIIIlIll(at.size(), lIIIllIIllIIl[2])) {
                if (!lIlIIIlIIIIIlll(Reachable.isInteractable((Locatable) at.get(lIIIllIIllIIl[0])) ? 1 : 0)) {
                    ((TileObject) at.get(lIIIllIIllIIl[0])).interact(lIIIllIIllIII[lIIIllIIllIIl[42]]);
                    return;
                }
                Walker.walkTo(new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));
                "".length();
                return;
            } else {
                return;
            }
        }
        if (lIlIIIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
            Bank.depositInventory();
        }
        if (lIlIIIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
        }
        iArr = new int[lIIIllIIllIIl[2]];
        iArr[lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
        if (lIlIIIlIIIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIIlIIIIlIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (lIlIIIlIIIIIlll(this.av.quest().equals(h.IMP_CATCHER) ? 1 : 0)) {
            return lIIIllIIllIIl[0];
        }
        int Q = Q();
        if (lIlIIIlIIIIlIII(Q, lIIIllIIllIIl[1])) {
            return lIIIllIIllIIl[0];
        }
        System.out.println("[IMP_CATCHER] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                an();
                al();
                am();
                M();
                "".length();
                return (-" ".length()) > 0 ? ((((101 + 18) - (-40)) + 6) ^ (((131 + 59) - 36) + 42)) & (((51 ^ 42) ^ (253 ^ 133)) ^ (-" ".length())) : lIIIllIIllIIl[2];
            case 1:
                Y();
                break;
        }
        return lIIIllIIllIIl[0];
    }
}
