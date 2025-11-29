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
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
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
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.AEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing Imp Catcher -> CompletingimpcatcherTask */
@TaskDesc(name="Completing Imp Catcher")
public class CompletingImpCatcherTask
extends Task {
    private final /* synthetic */ SquireQuesterConfig av;
    private static /* synthetic */ int[] lIIIllIIllIIl;
    private static /* synthetic */ String[] lIIIllIIllIII;

    /*
     * WARNING - void declaration
     */
    private void al() {
        void var21;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[54]]));
        if (r.lIlIIIlIIIIllII(tileItem2)) {
            return;
        }
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var21.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[0]]) ? 1 : 0)) {
            var21.interact(lIIIllIIllIII[lIIIllIIllIIl[2]]);
            return;
        }
        int[] nArray2 = new int[lIIIllIIllIIl[2]];
        nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var21.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[1]]) ? 1 : 0)) {
            var21.interact(lIIIllIIllIII[lIIIllIIllIIl[18]]);
            return;
        }
        int[] nArray3 = new int[lIIIllIIllIIl[2]];
        nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var21.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[19]]) ? 1 : 0)) {
            var21.interact(lIIIllIIllIII[lIIIllIIllIIl[20]]);
            return;
        }
        int[] nArray4 = new int[lIIIllIIllIIl[2]];
        nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var21.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[21]]) ? 1 : 0)) {
            var21.interact(lIIIllIIllIII[lIIIllIIllIIl[22]]);
            return;
        }
    }

    private static void lIlIIIlIIIIIllI() {
        lIIIllIIllIIl = new int[56];
        r.lIIIllIIllIIl[0] = (164 + 18 - -20 + 11 ^ 31 + 103 - 0 + 59) & (0x17 ^ 0x6B ^ (4 ^ 0x6C) ^ -1);
        r.lIIIllIIllIIl[1] = 2;
        r.lIIIllIIllIIl[2] = 1;
        r.lIIIllIIllIIl[3] = -(0xFFFFDDE2 & 0x625F) & (0xFFFFC7FF & 0x7DFF);
        r.lIIIllIIllIIl[4] = 0xFFFFCFC4 & 0x35FB;
        r.lIIIllIIllIIl[5] = 0xFFFFA5CE & 0x5FF3;
        r.lIIIllIIllIIl[6] = -(0xFFFFF8BF & 0x7F53) & (0xFFFFFDFF & 0x7FD6);
        r.lIIIllIIllIIl[7] = 0xFFFFBB72 & 0x76BF;
        r.lIIIllIIllIIl[8] = -(0xFFFFFDCD & 0x4FB3) & (0xFFFFFFF3 & 0x7FBD);
        r.lIIIllIIllIIl[9] = -(0xFFFFA74D & 0x5AB7) & (0xFFFFF3F7 & 0x3F3D);
        r.lIIIllIIllIIl[10] = 0xFFFFF7BE & 0x3973;
        r.lIIIllIIllIIl[11] = 0xFFFFBE7E & 0x71B3;
        r.lIIIllIIllIIl[12] = -(0xFFFFE9DB & 0x57EF) & (0xFFFFF1FB & Short.MAX_VALUE);
        r.lIIIllIIllIIl[13] = -1;
        r.lIIIllIIllIIl[14] = 0x8E ^ 0x84;
        r.lIIIllIIllIIl[15] = 0xFFFF9FEE & 0x7E53;
        r.lIIIllIIllIIl[16] = 0xFFFFDF7B & 0x2CA4;
        r.lIIIllIIllIIl[17] = -(0xFFFFFAF7 & 0x772D) & (0xFFFFFF7F & 0x7EFF);
        r.lIIIllIIllIIl[18] = 3;
        r.lIIIllIIllIIl[19] = 1 ^ 5;
        r.lIIIllIIllIIl[20] = 0xB0 ^ 0xA4 ^ (0x3A ^ 0x2B);
        r.lIIIllIIllIIl[21] = 0x86 ^ 0xB5 ^ (0x41 ^ 0x74);
        r.lIIIllIIllIIl[22] = 0x62 ^ 0x65;
        r.lIIIllIIllIIl[23] = 0x6C ^ 0x64;
        r.lIIIllIIllIIl[24] = 0x4A ^ 0x52 ^ (0x3F ^ 0x2E);
        r.lIIIllIIllIIl[25] = 0xFFFFCEEF & 0x333E;
        r.lIIIllIIllIIl[26] = (0xA6 ^ 0xBC) + (102 + 175 - 118 + 25) - (0x2E ^ 0x16) + (0x18 ^ 0x37);
        r.lIIIllIIllIIl[27] = 0xFFFFF2DF & 0xF71;
        r.lIIIllIIllIIl[28] = 0xAE ^ 0xB4;
        r.lIIIllIIllIIl[29] = -(0xFFFFDFCF & 0x7532) & (0xFFFFFDBF & 0x7F73);
        r.lIIIllIIllIIl[30] = -(0xFFFF9F9A & 0x66EF) & (0xFFFFAFBF & 0x7FFB);
        r.lIIIllIIllIIl[31] = -(0xFFFFFEAF & 0x61FD) & (0xFFFFEAFF & 0x7FEF);
        r.lIIIllIIllIIl[32] = 0xFFFF8EDD & 0x7DB2;
        r.lIIIllIIllIIl[33] = 0xFFFFF9DD & 0x37E2;
        r.lIIIllIIllIIl[34] = 0x6F ^ 0x64;
        r.lIIIllIIllIIl[35] = 0xFFFFB7FF & 0x4BE3;
        r.lIIIllIIllIIl[36] = -(0xFFFFFC55 & 0x7EE) & (0xFFFFF7DF & 0x1FEB);
        r.lIIIllIIllIIl[37] = 0xFFFFA565 & 0x5FFF;
        r.lIIIllIIllIIl[38] = 0xFFFFDD76 & 0x2EFB;
        r.lIIIllIIllIIl[39] = 0xFFFFEF6C & 0x1DFF;
        r.lIIIllIIllIIl[40] = 0x3D ^ 0x31;
        r.lIIIllIIllIIl[41] = 0xFFFFFC73 & 0xFFD;
        r.lIIIllIIllIIl[42] = 0x4E ^ 0x43;
        r.lIIIllIIllIIl[43] = 0x8F ^ 0x81;
        r.lIIIllIIllIIl[44] = -(0xFFFFF73F & 0x7CFB) & (0xFFFFFFFF & 0x7F7A);
        r.lIIIllIIllIIl[45] = 101 + 53 - 111 + 99 ^ 73 + 75 - 29 + 10;
        r.lIIIllIIllIIl[46] = 0xFFFFBEF7 & 0x4D8A;
        r.lIIIllIIllIIl[47] = -(0xFFFFFF7F & 0x3091) & (0xFFFFFFF9 & 0x3D7F);
        r.lIIIllIIllIIl[48] = 0xFFFFFDBF & 0x2EEB;
        r.lIIIllIIllIIl[49] = 0x33 ^ 0x14 ^ (0xF3 ^ 0xC4);
        r.lIIIllIIllIIl[50] = 0xFFFFCCF6 & 0x3FBF;
        r.lIIIllIIllIIl[51] = -(0xFFFFD6FB & 0x2BB7) & (0xFFFFBFFF & 0x4FFB);
        r.lIIIllIIllIIl[52] = 0x7E ^ 6 ^ (0x17 ^ 0x7E);
        r.lIIIllIIllIIl[53] = 0x2E ^ 0x3C;
        r.lIIIllIIllIIl[54] = 0xA7 ^ 0xB4;
        r.lIIIllIIllIIl[55] = 0x13 ^ 0x57 ^ (0xF2 ^ 0xA2);
    }

    @Inject
    public r(SquireQuesterConfig squireQuesterConfig) {
        this.av = squireQuesterConfig;
    }

    private static void lIlIIIlIIIIIlIl() {
        lIIIllIIllIII = new String[lIIIllIIllIIl[55]];
        r.lIIIllIIllIII[r.lIIIllIIllIIl[0]] = r."Red";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[2]] = r."Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[1]] = r."Yellow";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[18]] = r."Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[19]] = r."Black";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[20]] = r."Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[21]] = r."White";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[22]] = r."Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[23]] = r."Wind Strike";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[24]] = r."Choose spell";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[14]] = r."Attack";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[34]] = r."Open";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[40]] = r."Bank booth";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[42]] = r."Bank";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[43]] = r."Wield";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[45]] = r."Trade";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[49]] = r."Trade";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[52]] = r."Talk-to";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[53]] = r."Imp";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[54]] = r."bead";
    }

    private void Y() {
        block3: {
            block2: {
                int[] nArray = new int[lIIIllIIllIIl[2]];
                nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIllIIllIIl[2]];
                nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIllIIllIIl[2]];
                nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[lIIIllIIllIIl[2]];
                nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                if (!r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block3;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIllIIl[14]];
        dialogOptionArray[r.lIIIllIIllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[r.lIIIllIIllIIl[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIllIIl[15], new WorldPoint(lIIIllIIllIIl[16], lIIIllIIllIIl[17], lIIIllIIllIIl[1]), dialogOptionArray);
    }

    private static String lIlIIIlIIIIIIll(String var11, String var6) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var15 = var6.toCharArray();
        int var29 = lIIIllIIllIIl[0];
        char[] var9 = var11.toCharArray();
        int var17 = var9.length;
        int var4 = lIIIllIIllIIl[0];
        while (r.lIlIIIlIIIIllll(var4, var17)) {
            char var2 = var9[var4];
            var7.append((char)(var2 ^ var15[var29 % var15.length]));
            0;
            ++var29;
            ++var4;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    private void M() {
        block6: {
            block5: {
                int[] nArray = new int[lIIIllIIllIIl[2]];
                nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[lIIIllIIllIIl[2]];
                nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                int[] nArray3 = new int[lIIIllIIllIIl[2]];
                nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (!r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block5;
                int[] nArray4 = new int[lIIIllIIllIIl[2]];
                nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                if (!r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block6;
            }
            return;
        }
        if (r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[7]) && r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[8]) && r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[9]) && r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[10]) && r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[11]) && r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[12])) {
            if (r.lIlIIIlIIIIIlll(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && r.lIlIIIlIIIIlIll(Players.getLocal().getAnimation(), lIIIllIIllIIl[13])) {
                r var13;
                Magic.cast((Spell)SpellBook.Standard.HOME_TELEPORT);
                var13.sleep(lIIIllIIllIIl[14]);
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIllIIl[14]];
        dialogOptionArray[r.lIIIllIIllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[r.lIIIllIIllIIl[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.lIIIllIIllIIl[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIllIIl[15], new WorldPoint(lIIIllIIllIIl[16], lIIIllIIllIIl[17], lIIIllIIllIIl[1]), dialogOptionArray);
    }

    private static boolean lIlIIIlIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIlIIIIIIlI(String var10, String var18) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIIIllIIllIIl[1], var12);
            return new String(var27.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    static {
        r.lIlIIIlIIIIIllI();
        r.lIlIIIlIIIIIlIl();
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_IMP_CATCHER.c());
    }

    private static boolean lIlIIIlIIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIIIIllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var1;
        if (r.lIlIIIlIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = var1;
        NPC var20 = NPCs.getNearest((int[])nArray);
        if (r.lIlIIIlIIIIllIl(var20) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            var20.interact(lIIIllIIllIII[lIIIllIIllIIl[52]]);
            0;
            
            }
        } else {
            void var14;
            Walker.walkTo((WorldPoint)var14);
            0;
        }
    }

    private static boolean lIlIIIlIIIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIIlIIIIIlII(String var28, String var8) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIIllIIllIIl[23]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIIllIIllIIl[1], var25);
            return new String(var16.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIlIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private void am() {
        TileItem var3;
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIllIIl[2]];
        nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIllIIl[2]];
            nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIIllIIl[2]];
                nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
                if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIllIIllIIl[2]];
                    nArray5[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
                    if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        return;
                    }
                }
            }
        }
        int[] nArray6 = new int[lIIIllIIllIIl[2]];
        nArray6[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[lIIIllIIllIIl[2]];
            nArray7[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
            var3 = TileItems.getNearest((int[])nArray7);
            if (r.lIlIIIlIIIIllIl(var3)) {
                return;
            }
        }
        int[] nArray8 = new int[lIIIllIIllIIl[2]];
        nArray8[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIIllIIllIIl[2]];
            nArray9[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            var3 = TileItems.getNearest((int[])nArray9);
            if (r.lIlIIIlIIIIllIl(var3)) {
                return;
            }
        }
        int[] nArray10 = new int[lIIIllIIllIIl[2]];
        nArray10[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIIllIIllIIl[2]];
            nArray11[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
            var3 = TileItems.getNearest((int[])nArray11);
            if (r.lIlIIIlIIIIllIl(var3)) {
                return;
            }
        }
        int[] nArray12 = new int[lIIIllIIllIIl[2]];
        nArray12[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIIllIIllIIl[2]];
            nArray13[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
            var3 = TileItems.getNearest((int[])nArray13);
            if (r.lIlIIIlIIIIllIl(var3)) {
                return;
            }
        }
        if (r.lIlIIIlIIIIllIl(Players.getLocal().getInteracting())) {
            return;
        }
        if (r.lIlIIIlIIIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (r.lIlIIIlIIIIIlll(Magic.isAutoCasting() ? 1 : 0)) {
            int[] nArray14 = new int[lIIIllIIllIIl[2]];
            nArray14[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
            if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                if (r.lIlIIIlIIIIllIl(Widgets.get((int)lIIIllIIllIIl[26], (int)lIIIllIIllIIl[2], (int)lIIIllIIllIIl[2]))) {
                    Widgets.get((int)lIIIllIIllIIl[26], (int)lIIIllIIllIIl[2], (int)lIIIllIIllIIl[2]).interact(lIIIllIIllIII[lIIIllIIllIIl[23]]);
                }
                if (r.lIlIIIlIIIIllIl(Widgets.get((int)lIIIllIIllIIl[27], (int)lIIIllIIllIIl[28]))) {
                    Widgets.get((int)lIIIllIIllIIl[27], (int)lIIIllIIllIIl[28]).interact(lIIIllIIllIII[lIIIllIIllIIl[24]]);
                }
                return;
            }
        }
        if (r.lIlIIIlIIIIllIl(var3 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lIlIIIlIIIIlIIl(nPC.getName().equals(lIIIllIIllIII[lIIIllIIllIIl[53]]) ? 1 : 0) && r.lIlIIIlIIIIIlll(nPC.isDead() ? 1 : 0)) {
                n2 = lIIIllIIllIIl[2];
                0;
                if ((0x28 ^ 0x1C ^ (0xAB ^ 0x9B)) != (0xF6 ^ 0xC3 ^ (0x29 ^ 0x18))) {
                    return ((106 + 162 - 252 + 158 ^ 6 + 0 - -115 + 34) & (0xBB ^ 0xB6 ^ (0x58 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIllIIllIIl[0];
            }
            return n2 != 0;
        })) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            if (!r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[29]) || r.lIlIIIlIIIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[30])) {
                var3.interact(lIIIllIIllIII[lIIIllIIllIIl[14]]);
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));
                0;
                0;
                if (-2 > 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));
            0;
        }
    }

    private void an() {
        r var22;
        block33: {
            block32: {
                int[] nArray = new int[lIIIllIIllIIl[2]];
                nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[33];
                if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllIIllIIl[2]];
                    nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[33];
                    Inventory.getFirst((int[])nArray2).interact(lIIIllIIllIII[lIIIllIIllIIl[34]]);
                    return;
                }
                int[] nArray3 = new int[lIIIllIIllIIl[2]];
                nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
                if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIllIIllIIl[2]];
                    nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
                    if (r.lIlIIIlIIIIlllI(Inventory.getCount((boolean)lIIIllIIllIIl[2], (int[])nArray4), lIIIllIIllIIl[14])) {
                        return;
                    }
                }
                if (!r.lIlIIIlIIIIlllI(Inventory.getFreeSlots(), lIIIllIIllIIl[1])) break block32;
                int[] nArray5 = new int[lIIIllIIllIIl[2]];
                nArray5[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
                if (!r.lIlIIIlIIIIllll(Inventory.getCount((boolean)lIIIllIIllIIl[2], (int[])nArray5), lIIIllIIllIIl[36])) break block33;
                int[] nArray6 = new int[lIIIllIIllIIl[2]];
                nArray6[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
                if (!r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block33;
            }
            if (r.lIlIIIlIIIIIlll(Bank.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIllIIl[2]];
                stringArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIII[lIIIllIIllIIl[40]];
                List var24 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIllIIl[38], lIIIllIIllIIl[39], lIIIllIIllIIl[0]), (String[])stringArray);
                if (r.lIlIIIlIIIIlIIl(var24.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));
                    0;
                    return;
                }
                if (r.lIlIIIlIIIIlIll(var24.size(), lIIIllIIllIIl[2])) {
                    if (r.lIlIIIlIIIIIlll(Reachable.isInteractable((Locatable)((Locatable)var24.get(lIIIllIIllIIl[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));
                        0;
                        return;
                    }
                    ((TileObject)var24.get(lIIIllIIllIIl[0])).interact(lIIIllIIllIII[lIIIllIIllIIl[42]]);
                }
                return;
            }
            if (r.lIlIIIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
        }
        if (r.lIlIIIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIllIIl[2]];
            nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
            if (r.lIlIIIlIIIlIIII(Inventory.getCount((boolean)lIIIllIIllIIl[2], (int[])nArray), lIIIllIIllIIl[36])) {
                int[] nArray7 = new int[lIIIllIIllIIl[2]];
                nArray7[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[35];
                if (r.lIlIIIlIIIIlIII(Bank.getCount((boolean)lIIIllIIllIIl[2], (int[])nArray7), lIIIllIIllIIl[36])) {
                    Bank.withdraw((int)lIIIllIIllIIl[35], (int)lIIIllIIllIIl[36], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var22.sleep(lIIIllIIllIIl[20]);
                }
            }
        }
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
        if (r.lIlIIIlIIIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray8 = new int[lIIIllIIllIIl[2]];
            nArray8[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
            if (r.lIlIIIlIIIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                int[] nArray9 = new int[lIIIllIIllIIl[2]];
                nArray9[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[37];
                Inventory.getFirst((int[])nArray9).interact(lIIIllIIllIII[lIIIllIIllIIl[43]]);
                0;
                if (1 <= -1) {
                    return;
                }
            } else if (r.lIlIIIlIIIIlIIl(Shop.isOpen() ? 1 : 0)) {
                Shop.buyOne((int)lIIIllIIllIIl[37]);
                0;
                if (((0xEA ^ 0xC5) & ~(0x22 ^ 0xD)) > 0) {
                    return;
                }
            } else {
                int[] nArray10 = new int[lIIIllIIllIIl[2]];
                nArray10[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[44];
                NPC var24 = NPCs.getNearest((int[])nArray10);
                if (r.lIlIIIlIIIIllIl(var24) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var24) ? 1 : 0)) {
                    var24.interact(lIIIllIIllIII[lIIIllIIllIIl[45]]);
                    0;
                    if ((0x24 ^ 0x21) == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[46], lIIIllIIllIIl[47], lIIIllIIllIIl[0]));
                    0;
                    return;
                }
            }
            return;
        }
        int[] nArray11 = new int[lIIIllIIllIIl[2]];
        nArray11[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[25];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            if (r.lIlIIIlIIIIlIIl(Shop.isOpen() ? 1 : 0)) {
                Shop.buyFifty((int)lIIIllIIllIIl[33]);
                0;
                
                }
            } else {
                int[] nArray12 = new int[lIIIllIIllIIl[2]];
                nArray12[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[48];
                NPC var24 = NPCs.getNearest((int[])nArray12);
                if (r.lIlIIIlIIIIllIl(var24) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var24) ? 1 : 0)) {
                    var24.interact(lIIIllIIllIII[lIIIllIIllIIl[49]]);
                    0;
                    if (1 < 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[50], lIIIllIIllIIl[51], lIIIllIIllIIl[0]));
                    0;
                    var22.sleep(lIIIllIIllIIl[1]);
                    return;
                }
            }
        }
    }

    private static boolean lIlIIIlIIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        r var26;
        if (r.lIlIIIlIIIIIlll(this.av.quest().equals((Object)h.IMP_CATCHER) ? 1 : 0)) {
            return lIIIllIIllIIl[0];
        }
        int var23 = var26.Q();
        if (r.lIlIIIlIIIIlIII(var23, lIIIllIIllIIl[1])) {
            return lIIIllIIllIIl[0];
        }
        System.out.println("[IMP_CATCHER] - Current Progress: " + var23);
        switch (var23) {
            case 0: {
                var26.an();
                var26.al();
                var26.am();
                var26.M();
                0;
                if (-1 <= 0) break;
                return ((101 + 18 - -40 + 6 ^ 131 + 59 - 36 + 42) & (0x33 ^ 0x2A ^ (0xFD ^ 0x85) ^ -1)) != 0;
            }
            case 1: {
                var26.Y();
            }
            default: {
                return lIIIllIIllIIl[0];
            }
        }
        return lIIIllIIllIIl[2];
    }
}

