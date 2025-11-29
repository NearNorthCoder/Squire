/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.AEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing Romeo And Juliet -> CompletingromeoandjulietTask */
@TaskDesc(name="Completing Romeo And Juliet")
public class CompletingRomeoAndJulietTask
extends Task {
    private static /* synthetic */ int[] lIIIllIlIllll;
    private static /* synthetic */ String[] lIIIllIlIlllI;
    private final /* synthetic */ SquireQuesterConfig bs;

    private void bx() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (y.lIlIIIlIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIllll[2]];
        nArray2[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        TileItem var18 = TileItems.getNearest((int[])nArray2);
        if (y.lIlIIIlIlllIllI(var18)) {
            var18.interact(lIIIllIlIlllI[lIIIllIlIllll[10]]);
            0;
            if (2 > (0x46 ^ 0x42)) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[42], lIIIllIlIllll[43], lIIIllIlIllll[2]));
            0;
        }
    }

    private void cp() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (y.lIlIIIlIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[15]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[44], new WorldPoint(lIIIllIlIllll[45], lIIIllIlIllll[46], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private void P() {
        if (y.lIlIIIlIlllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void ck() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlIllll[23], new WorldPoint(lIIIllIlIllll[24], lIIIllIlIllll[25], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private static String lIlIIIlIllIlllI(String var17, String var14) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var5 = var14.toCharArray();
        int var11 = lIIIllIlIllll[0];
        char[] var2 = var17.toCharArray();
        int var13 = var2.length;
        int var12 = lIIIllIlIllll[0];
        while (y.lIlIIIlIllllIII(var12, var13)) {
            char var6 = var2[var12];
            var21.append((char)(var6 ^ var5[var11 % var5.length]));
            0;
            ++var11;
            ++var12;
            0;
            if (3 < (0x7B ^ 8 ^ (0xF0 ^ 0x87))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private void cj() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.QUEST;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[20], new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]), dialogOptionArray);
    }

    private static boolean lIlIIIlIlllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlllIlll(int n2) {
        return n2 > 0;
    }

    private void cm() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_FOUR;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (y.lIlIIIlIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    static {
        y.lIlIIIlIlllIIIl();
        y.lIlIIIlIlllIIII();
    }

    private static void lIlIIIlIlllIIIl() {
        lIIIllIlIllll = new int[47];
        y.lIIIllIlIllll[0] = (0x1B ^ 4) & ~(0x6D ^ 0x72);
        y.lIIIllIlIllll[1] = 0x66 ^ 0x1E;
        y.lIIIllIlIllll[2] = 1;
        y.lIIIllIlIllll[3] = 0xFFFFB3AF & 0x5FFD;
        y.lIIIllIlIllll[4] = -(0xFFFFBA7B & 0x7797) & (0xFFFFBEFF & 0x7F9F);
        y.lIIIllIlIllll[5] = -(140 + 26 - 47 + 42) & (0xFFFFFDFF & 0xFFF);
        y.lIIIllIlIllll[6] = 0x1A ^ 0x40 ^ (5 ^ 0x50);
        y.lIIIllIlIllll[7] = 2;
        y.lIIIllIlIllll[8] = 3;
        y.lIIIllIlIllll[9] = 0x7A ^ 0x7E;
        y.lIIIllIlIllll[10] = 0x1C ^ 0x19;
        y.lIIIllIlIllll[11] = 0x6A ^ 0x4C ^ (0xA5 ^ 0x85);
        y.lIIIllIlIllll[12] = 0x6B ^ 0x5A ^ (0xA7 ^ 0x91);
        y.lIIIllIlIllll[13] = 27 + 124 - 40 + 27 ^ 36 + 77 - 82 + 99;
        y.lIIIllIlIllll[14] = 0xB2 ^ 0x8A ^ (0x3C ^ 0xD);
        y.lIIIllIlIllll[15] = 0x85 ^ 0x8F;
        y.lIIIllIlIllll[16] = 0x9A ^ 0x91;
        y.lIIIllIlIllll[17] = 107 + 45 - 70 + 93 ^ 123 + 155 - 131 + 16;
        y.lIIIllIlIllll[18] = 3 ^ 0xE;
        y.lIIIllIlIllll[19] = 120 + 103 - 117 + 59 ^ 119 + 167 - 196 + 81;
        y.lIIIllIlIllll[20] = -(0xFFFF9E97 & 0x697D) & (0xFFFFDFFF & 0x3BBF);
        y.lIIIllIlIllll[21] = 0xFFFFDED5 & 0x2D7F;
        y.lIIIllIlIllll[22] = 0xFFFFCFF3 & 0x3D6D;
        y.lIIIllIlIllll[23] = -(0xFFFFBCFF & 0x6753) & (0xFFFFB7FE & Short.MAX_VALUE);
        y.lIIIllIlIllll[24] = -(0xFFFFF381 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x7FFB);
        y.lIIIllIlIllll[25] = -(0xFFFFE72B & 0x7AD7) & (0xFFFFFF6F & 0x6FDE);
        y.lIIIllIlIllll[26] = 0xFFFFFBBF & 0x17EE;
        y.lIIIllIlIllll[27] = -(0xFFFFF79B & 0x7B65) & (0xFFFFFFBF & 0x7FF6);
        y.lIIIllIlIllll[28] = -(0xFFFF93ED & 0x7C7B) & (0xFFFF9DFF & Short.MAX_VALUE);
        y.lIIIllIlIllll[29] = 0xFFFFABF3 & 0x56FD;
        y.lIIIllIlIllll[30] = -(0xFFFFF7F3 & 0x2BBF) & (0xFFFFFFFB & Short.MAX_VALUE);
        y.lIIIllIlIllll[31] = 0xFFFF8FEF & 0x7CDC;
        y.lIIIllIlIllll[32] = -(23 + 82 - 11 + 35) & (0xFFFFEDBF & 0x1FEC);
        y.lIIIllIlIllll[33] = -(0xFFFFECEA & 0x53BF) & (0xFFFFCDEF & 0x7EBF);
        y.lIIIllIlIllll[34] = -(0xFFFFF28F & 0x6F71) & (0xFFFFFFBB & 0x6EFF);
        y.lIIIllIlIllll[35] = 0xFFFFCFBE & 0x33F9;
        y.lIIIllIlIllll[36] = -(0xFFFFFBBF & 0x66D9) & (0xFFFFFFFF & 0x6EBD);
        y.lIIIllIlIllll[37] = 0xFFFF8DCF & 0x7EF0;
        y.lIIIllIlIllll[38] = -(0xFFFFB33F & 0x7FD5) & (0xFFFFFFFF & 0x3F97);
        y.lIIIllIlIllll[39] = 0xFFFF8CEC & 0x7F9F;
        y.lIIIllIlIllll[40] = 0xFFFFBD9E & 0x4EFF;
        y.lIIIllIlIllll[41] = -(0xFFFFC7F7 & 0x7B6D) & (0xFFFFDFED & 0x6FFF);
        y.lIIIllIlIllll[42] = -(0xFFFFF3EF & 0x5C7F) & (0xFFFFDFFE & 0x7CFF);
        y.lIIIllIlIllll[43] = -(0xFFFFDEED & 0x733B) & (0xFFFFDF7B & Short.MAX_VALUE);
        y.lIIIllIlIllll[44] = -(0xFFFFFEFB & 0x1F5F) & (0xFFFFBFFF & 0x7F7E);
        y.lIIIllIlIllll[45] = -(0xFFFFFFB1 & 0x524F) & (0xFFFFDFDD & 0x7EBF);
        y.lIIIllIlIllll[46] = -(0xFFFFFB5F & 0x77E5) & (0xFFFFFFFF & 0x7FED);
    }

    private static String lIlIIIlIllIllll(String var19, String var3) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIIllIlIllll[13]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIIllIlIllll[7], var20);
            return new String(var15.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_ROMEO_AND_JULIET.c());
    }

    private void bv() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0]));
            0;
            0;
            if ((0xB5 ^ 0xB1) <= 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[8]]);
        }
    }

    public boolean run() {
        y var7;
        if (y.lIlIIIlIlllIIlI(this.bs.quest().equals((Object)h.ROMEO_AND_JULIET) ? 1 : 0)) {
            return lIIIllIlIllll[0];
        }
        int var8 = var7.Q();
        if (y.lIlIIIlIlllIIll(var8, lIIIllIlIllll[1])) {
            return lIIIllIlIllll[0];
        }
        System.out.println("[ROMEO_AND_JULIET] - Current Progress: " + var8);
        switch (var8) {
            case 0: {
                var7.co();
                var7.M();
                0;
                if (1 != 0) break;
                return false;
            }
            case 10: {
                var7.cn();
                0;
                if (null == null) break;
                return false;
            }
            case 20: {
                var7.P();
                var7.cm();
                0;
                if (-(0xB ^ 0xE) < 0) break;
                return false;
            }
            case 30: {
                var7.cl();
                0;
                if (2 == 2) break;
                return false;
            }
            case 40: {
                var7.ck();
                0;
                if (-(0x83 ^ 0x86) < 0) break;
                return false;
            }
            case 50: {
                var7.cj();
                0;
                if (-3 <= 0) break;
                return ((0xB ^ 0x4D ^ (0xE5 ^ 0xB4)) & (0x10 ^ 0x1A ^ (0x8E ^ 0x93) ^ -1)) != 0;
            }
            case 60: {
                var7.Y();
                0;
                if (((0xB0 ^ 0x87) & ~(0xAE ^ 0x99)) < (0x63 ^ 0x67)) break;
                return false;
            }
            case 7: {
                var7.P();
                0;
                if (1 <= 3) break;
                return false;
            }
            default: {
                return lIIIllIlIllll[0];
            }
        }
        return lIIIllIlIllll[2];
    }

    private void Y() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    @Inject
    public y(SquireQuesterConfig squireQuesterConfig) {
        this.bs = squireQuesterConfig;
    }

    private void bw() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0]));
            0;
            0;
            
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[9]]);
        }
    }

    private void bu() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0]));
            0;
            0;
            if (-3 > 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[7]]);
        }
    }

    private static boolean lIlIIIlIlllIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var9;
        if (y.lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = var9;
        NPC var16 = NPCs.getNearest((int[])nArray);
        if (y.lIlIIIlIlllIllI(var16) && y.lIlIIIlIlllIlII(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
            var16.interact(lIIIllIlIlllI[lIIIllIlIllll[11]]);
            0;
            if (2 < 0) {
                return;
            }
        } else {
            void var1;
            System.out.println(lIIIllIlIlllI[lIIIllIlIllll[12]]);
            Walker.walkTo((WorldPoint)var1);
            0;
        }
    }

    private void co() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (y.lIlIIIlIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIllll[2]];
        nArray2[y.lIIIllIlIllll[0]] = lIIIllIlIllll[30];
        TileObject var4 = TileObjects.getNearest((int[])nArray2);
        if (y.lIlIIIlIlllIllI(var4) && y.lIlIIIlIlllIlII(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            var4.interact(lIIIllIlIlllI[lIIIllIlIllll[0]]);
            0;
            if (((6 ^ 0x35 ^ (0x9F ^ 0xB4)) & (73 + 131 - 114 + 56 ^ 56 + 5 - -77 + 0 ^ -1)) > 2) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[31], lIIIllIlIllll[32], lIIIllIlIllll[0]));
            0;
        }
    }

    private static boolean lIlIIIlIlllIlIl(Object object) {
        return object == null;
    }

    private static void lIlIIIlIlllIIII() {
        lIIIllIlIlllI = new String[lIIIllIlIllll[13]];
        y.lIIIllIlIlllI[y.lIIIllIlIllll[0]] = y."Pick-from";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[2]] = y."Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[7]] = y."Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[8]] = y."Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[9]] = y."Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[10]] = y."Take";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[11]] = y."Talk-to";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[12]] = y."Walking to NPC";
    }

    private void cn() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[20];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (y.lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && y.lIlIIIlIlllIlIl(nPC)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]));
            0;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[20], new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]), dialogOptionArray);
    }

    private static boolean lIlIIIlIlllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIlllIllI(Object object) {
        return object != null;
    }

    private void cl() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlIllll[26], new WorldPoint(lIIIllIlIllll[27], lIIIllIlIllll[28], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private void bt() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0]));
            0;
            0;
            if (-(20 + 74 - 46 + 130 ^ 1 + 78 - 62 + 166) >= 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[2]]);
        }
    }
}

