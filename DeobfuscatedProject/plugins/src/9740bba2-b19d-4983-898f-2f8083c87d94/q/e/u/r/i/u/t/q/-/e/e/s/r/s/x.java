/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Restless Ghost")
public class x
extends Task {
    private final /* synthetic */ Client bo;
    private final /* synthetic */ SquireQuester bq;
    private static /* synthetic */ int[] lIIIllIllIIIl;
    private final /* synthetic */ TaskManager br;
    private final /* synthetic */ SquireQuesterConfig bp;
    private static /* synthetic */ String[] lIIIllIllIIII;

    private static String lIlIIIlIllllIIl(String lllllllllllllllIIIIlIIIlIIIIIlll, String lllllllllllllllIIIIlIIIlIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIllIIIl[13]), "DES");
            Cipher lllllllllllllllIIIIlIIIlIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIlIIIIlIIl.init(lIIIllIllIIIl[3], lllllllllllllllIIIIlIIIlIIIIlIlI);
            return new String(lllllllllllllllIIIIlIIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIlIIIIlIII) {
            lllllllllllllllIIIIlIIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIIIIIlI(Object object) {
        return object == null;
    }

    @Inject
    public x(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bo = client;
        this.bp = squireQuesterConfig;
        this.bq = squireQuester;
        this.br = taskManager;
    }

    private void ch() {
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[21]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[19]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];
                        "".length();
                        if (-" ".length() > 0) {
                            return ((0xAF ^ 0xAB) & ~(0x84 ^ 0x80)) != 0;
                        }
                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[23], lIIIllIllIIIl[24], lIIIllIllIIIl[0]));
                "".length();
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[25]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static void lIlIIIlIlllllII() {
        lIIIllIllIIII = new String[lIIIllIllIIIl[31]];
        x.lIIIllIllIIII[x.lIIIllIllIIIl[0]] = x.lIlIIIlIllllIIl("PbiXXMIWyFw=", "hTfXz");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[2]] = x.lIlIIIlIllllIIl("Og2PsIIQj8M=", "GWNXh");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[3]] = x.lIlIIIlIllllIIl("i/Apud1zzY4=", "jlULI");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[4]] = x.lIlIIIlIllllIlI("HAc1FSYn", "ObTgE");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[5]] = x.lIlIIIlIllllIll("e/WsClsW2v1b6U0+3nZ0QQ==", "AUQIz");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[1]] = x.lIlIIIlIllllIll("Cw31qpdAPBE=", "XXwjt");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[11]] = x.lIlIIIlIllllIIl("kWTvjUPdwCY=", "XmRjb");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[12]] = x.lIlIIIlIllllIlI("JQ4BFyQI", "fagqM");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[13]] = x.lIlIIIlIllllIll("V4EYv8EdCW+qvnilHS03EA==", "qHxdA");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[14]] = x.lIlIIIlIllllIIl("YZnM/930364=", "naXIQ");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[15]] = x.lIlIIIlIllllIlI("KyERDw==", "dQtaj");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[16]] = x.lIlIIIlIllllIlI("IDQsNg0b", "sQMDn");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[17]] = x.lIlIIIlIllllIll("Ez8CDHdKk0g=", "yjByA");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[18]] = x.lIlIIIlIllllIlI("JTUbA2AFOw==", "qTwhM");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[20]] = x.lIlIIIlIllllIlI("BDYXBg==", "SSvtk");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[21]] = x.lIlIIIlIllllIIl("GxKN31z7DNjIErk7p2MIwA==", "fjcwK");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[19]] = x.lIlIIIlIllllIlI("IjMlGn8CPQ==", "vRIqR");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[25]] = x.lIlIIIlIllllIll("se9eeSowwx0926HfTiJyPA==", "ztdxO");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[26]] = x.lIlIIIlIllllIll("/qZT37qhe7MR9UQ2rU2/3g==", "CUlVZ");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[27]] = x.lIlIIIlIllllIll("cyOwetYCkq4=", "HdbyM");
        x.lIIIllIllIIII[x.lIIIllIllIIIl[30]] = x.lIlIIIlIllllIll("3SB2fFFFqjeFW/XHza25Cw==", "WvGnt");
    }

    private void cg() {
        int[] nArray = new int[lIIIllIllIIIl[2]];
        nArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIllIIIl[2]];
        nArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIllIIIl[2]];
            nArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
            Inventory.getFirst((int[])nArray3).interact(lIIIllIllIIII[lIIIllIllIIIl[20]]);
        }
    }

    private static void lIlIIIlIlllllIl() {
        lIIIllIllIIIl = new int[32];
        x.lIIIllIllIIIl[0] = (0x44 ^ 0x7E) & ~(0x81 ^ 0xBB);
        x.lIIIllIllIIIl[1] = 26 + 42 - -37 + 89 ^ 116 + 197 - 145 + 31;
        x.lIIIllIllIIIl[2] = " ".length();
        x.lIIIllIllIIIl[3] = "  ".length();
        x.lIIIllIllIIIl[4] = "   ".length();
        x.lIIIllIllIIIl[5] = 0x3C ^ 0x72 ^ (0xC9 ^ 0x83);
        x.lIIIllIllIIIl[6] = 0xFFFF8DF9 & 0x7EB7;
        x.lIIIllIllIIIl[7] = -(0xFFFFFB37 & 0x77CD) & (0xFFFFFF7F & 0x7FFD);
        x.lIIIllIllIIIl[8] = -(0xFFFFAFAB & 0x72DD) & (0xFFFFFEFD & 0x2FBA);
        x.lIIIllIllIIIl[9] = -(0xFFFFD6C3 & 0x79BE) & (0xFFFFFFDF & 0x75FF);
        x.lIIIllIllIIIl[10] = 0xFFFFBF2F & 0x4CFF;
        x.lIIIllIllIIIl[11] = 0x63 ^ 0x4C ^ (0x6B ^ 0x42);
        x.lIIIllIllIIIl[12] = 0x7C ^ 0x75 ^ (0xA2 ^ 0xAC);
        x.lIIIllIllIIIl[13] = 0x26 ^ 0x68 ^ (0x2B ^ 0x6D);
        x.lIIIllIllIIIl[14] = 0x1D ^ 0x14;
        x.lIIIllIllIIIl[15] = 0xFE ^ 0x8E ^ (0xD0 ^ 0xAA);
        x.lIIIllIllIIIl[16] = 55 + 69 - 41 + 84 ^ 2 + 141 - 63 + 92;
        x.lIIIllIllIIIl[17] = 0xBA ^ 0xB6;
        x.lIIIllIllIIIl[18] = 0x7A ^ 0x77;
        x.lIIIllIllIIIl[19] = 0x52 ^ 0x47 ^ (0xC0 ^ 0xC5);
        x.lIIIllIllIIIl[20] = 89 + 107 - 115 + 69 ^ 112 + 146 - 192 + 86;
        x.lIIIllIllIIIl[21] = 0x79 ^ 0x76;
        x.lIIIllIllIIIl[22] = -(0xFFFFDDF9 & 0x67C7) & (0xFFFFC7EC & 0x7FFB);
        x.lIIIllIllIIIl[23] = -(0xFFFF96AB & 0x7B55) & (0xFFFFDFCF & 0x3E7B);
        x.lIIIllIllIIIl[24] = -(0xFFFFBBD9 & 0x66B7) & (0xFFFFBEFF & 0x6FF7);
        x.lIIIllIllIIIl[25] = 0x71 ^ 0x60;
        x.lIIIllIllIIIl[26] = 0x5C ^ 0x4E;
        x.lIIIllIllIIIl[27] = 0x4A ^ 0x59;
        x.lIIIllIllIIIl[28] = -(0xFFFFFBD7 & 0x357B) & (0xFFFFFFFE & 0x3DFF);
        x.lIIIllIllIIIl[29] = -(0xFFFFF4EF & 0x3B51) & (0xFFFFFFCE & 0x3CF7);
        x.lIIIllIllIIIl[30] = 0x42 ^ 0x56;
        x.lIIIllIllIIIl[31] = 0x93 ^ 0x86;
    }

    private static boolean lIlIIIlIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[26]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[27]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];
                        "".length();
                        if ((0x37 ^ 0x22 ^ (0x18 ^ 9)) == 0) {
                            return ((0x87 ^ 0x93 ^ (0xE ^ 0x27)) & (0x49 ^ 0x28 ^ (0xFE ^ 0xA2) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[28], lIIIllIllIIIl[29], lIIIllIllIIIl[0]));
                "".length();
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[30]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[21]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static String lIlIIIlIllllIll(String lllllllllllllllIIIIlIIIIlllllIlI, String lllllllllllllllIIIIlIIIIllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIIIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIIIllllllII.init(lIIIllIllIIIl[3], lllllllllllllllIIIIlIIIIllllllIl);
            return new String(lllllllllllllllIIIIlIIIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIIlllllIll) {
            lllllllllllllllIIIIlIIIIlllllIll.printStackTrace();
            return null;
        }
    }

    static {
        x.lIlIIIlIlllllIl();
        x.lIlIIIlIlllllII();
    }

    private static boolean lIlIIIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIllllllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlIllllIlI(String lllllllllllllllIIIIlIIIlIIIlllII, String lllllllllllllllIIIIlIIIlIIIllIll) {
        lllllllllllllllIIIIlIIIlIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIlIIIllIlI = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIlIIIllIIl = lllllllllllllllIIIIlIIIlIIIllIll.toCharArray();
        int lllllllllllllllIIIIlIIIlIIIllIII = lIIIllIllIIIl[0];
        char[] lllllllllllllllIIIIlIIIlIIIlIIlI = lllllllllllllllIIIIlIIIlIIIlllII.toCharArray();
        int lllllllllllllllIIIIlIIIlIIIlIIIl = lllllllllllllllIIIIlIIIlIIIlIIlI.length;
        int lllllllllllllllIIIIlIIIlIIIlIIII = lIIIllIllIIIl[0];
        while (x.lIlIIIllIIIIIll(lllllllllllllllIIIIlIIIlIIIlIIII, lllllllllllllllIIIIlIIIlIIIlIIIl)) {
            char lllllllllllllllIIIIlIIIlIIIlllIl = lllllllllllllllIIIIlIIIlIIIlIIlI[lllllllllllllllIIIIlIIIlIIIlIIII];
            lllllllllllllllIIIIlIIIlIIIllIlI.append((char)(lllllllllllllllIIIIlIIIlIIIlllIl ^ lllllllllllllllIIIIlIIIlIIIllIIl[lllllllllllllllIIIIlIIIlIIIllIII % lllllllllllllllIIIIlIIIlIIIllIIl.length]));
            "".length();
            ++lllllllllllllllIIIIlIIIlIIIllIII;
            ++lllllllllllllllIIIIlIIIlIIIlIIII;
            "".length();
            if (-(0xB3 ^ 0xB9 ^ (0x57 ^ 0x59)) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIIlIIIllIlI);
    }

    /*
     * WARNING - void declaration
     */
    private void cd() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            void lllllllllllllllIIIIlIIIlIIllIlIl;
            if (x.lIlIIIlIllllllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)tileObject.getWorldLocation());
                "".length();
                return;
            }
            String[] stringArray2 = new String[lIIIllIllIIIl[2]];
            stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[2]];
            if (x.lIlIIIllIIIIIIl(lllllllllllllllIIIIlIIIlIIllIlIl.hasAction(stringArray2) ? 1 : 0)) {
                lllllllllllllllIIIIlIIIlIIllIlIl.interact(lIIIllIllIIII[lIIIllIllIIIl[3]]);
            }
            String[] stringArray3 = new String[lIIIllIllIIIl[2]];
            stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[4]];
            if (x.lIlIIIllIIIIIIl(lllllllllllllllIIIIlIIIlIIllIlIl.hasAction(stringArray3) ? 1 : 0)) {
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[5]];
                Inventory.getFirst((String[])stringArray4).useOn((TileObject)lllllllllllllllIIIIlIIIlIIllIlIl);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void cf() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[12]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIllIIIl[2]];
        stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[13]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            void lllllllllllllllIIIIlIIIlIIlIllll;
            if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIlI(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                void lllllllllllllllIIIIlIIIlIIllIIII;
                String[] stringArray3 = new String[lIIIllIllIIIl[2]];
                stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[14]];
                if (x.lIlIIIllIIIIIIl(tileObject.hasAction(stringArray3) ? 1 : 0)) {
                    tileObject.interact(lIIIllIllIIII[lIIIllIllIIIl[15]]);
                    return;
                }
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[16]];
                if (x.lIlIIIllIIIIIIl(lllllllllllllllIIIIlIIIlIIllIIII.hasAction(stringArray4) ? 1 : 0)) {
                    lllllllllllllllIIIIlIIIlIIllIIII.interact(lIIIllIllIIII[lIIIllIllIIIl[17]]);
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
                "".length();
            }
            if (x.lIlIIIllIIIIIII(lllllllllllllllIIIIlIIIlIIlIllll)) {
                if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIIlIIlIllll) ? 1 : 0)) {
                    lllllllllllllllIIIIlIIIlIIlIllll.interact(lIIIllIllIIII[lIIIllIllIIIl[18]]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIIlIIlIllll.getWorldLocation());
                    "".length();
                }
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    public boolean run() {
        x lllllllllllllllIIIIlIIIlIIlllIII;
        if (x.lIlIIIlIllllllI(this.bp.quest().equals((Object)h.RESTLESS_GHOST) ? 1 : 0)) {
            return lIIIllIllIIIl[0];
        }
        int lllllllllllllllIIIIlIIIlIIllIlll = lllllllllllllllIIIIlIIIlIIlllIII.Q();
        if (x.lIlIIIlIlllllll(lllllllllllllllIIIIlIIIlIIllIlll, lIIIllIllIIIl[1])) {
            return lIIIllIllIIIl[0];
        }
        System.out.println("[RESTLESS GHOST] - Current Progress: " + lllllllllllllllIIIIlIIIlIIllIlll);
        switch (lllllllllllllllIIIIlIIIlIIllIlll) {
            case 0: {
                lllllllllllllllIIIIlIIIlIIlllIII.M();
                "".length();
                if ("  ".length() > " ".length()) break;
                return ((0x81 ^ 0x9E) & ~(0x49 ^ 0x56)) != 0;
            }
            case 1: {
                lllllllllllllllIIIIlIIIlIIlllIII.ch();
                "".length();
                if (null == null) break;
                return ((0xD2 ^ 0x9A) & ~(0xD6 ^ 0x9E) & ~((0x7C ^ 0x68) & ~(0x88 ^ 0x9C))) != 0;
            }
            case 2: {
                lllllllllllllllIIIIlIIIlIIlllIII.cg();
                lllllllllllllllIIIIlIIIlIIlllIII.cf();
                "".length();
                if ("  ".length() != 0) break;
                return ((153 + 218 - 349 + 221 ^ 63 + 15 - 35 + 144) & (0x26 ^ 0x6C ^ "  ".length() ^ -" ".length())) != 0;
            }
            case 3: {
                lllllllllllllllIIIIlIIIlIIlllIII.ce();
                "".length();
                if ("  ".length() >= 0) break;
                return ((0x11 ^ 0x29) & ~(0xFA ^ 0xC2)) != 0;
            }
            case 4: {
                lllllllllllllllIIIIlIIIlIIlllIII.cd();
                "".length();
                if ("   ".length() >= " ".length()) break;
                return ((0x56 ^ 0x6D ^ (0x75 ^ 0x66)) & (0xA1 ^ 0xBB ^ (0x79 ^ 0x4B) ^ -" ".length())) != 0;
            }
            default: {
                return lIIIllIllIIIl[0];
            }
        }
        return lIIIllIllIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    private void ce() {
        void lllllllllllllllIIIIlIIIlIIllIIll;
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[1]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIllIIIl[8], lIIIllIllIIIl[9], lIIIllIllIIIl[0]), (String[])stringArray);
        if (x.lIlIIIllIIIIIIl(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[10], lIIIllIllIIIl[9], lIIIllIllIIIl[0]));
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        } else if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIIIlIIllIIll.get(lIIIllIllIIIl[0]))) ? 1 : 0)) {
            ((TileObject)lllllllllllllllIIIIlIIIlIIllIIll.get(lIIIllIllIIIl[0])).interact(lIIIllIllIIII[lIIIllIllIIIl[11]]);
            "".length();
            if ((0xB0 ^ 0xB4) == -" ".length()) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)((TileObject)lllllllllllllllIIIIlIIIlIIllIIll.get(lIIIllIllIIIl[0])).getWorldLocation());
            "".length();
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_THE_RESTLESS_GHOST.c());
    }
}

