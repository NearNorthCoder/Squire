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
 *  net.unethicalite.api.items.Inventory
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.AEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing Dwarf Cannon -> CompletingdwarfcannonTask */
@TaskDesc(name="Completing Dwarf Cannon")
public class CompletingDwarfCannonTask
extends Task {
    private static /* synthetic */ int[] lIIIllIlllIIl;
    private static /* synthetic */ String[] lIIIllIllIlll;
    private final /* synthetic */ SquireQuesterConfig au;

    private void ab() {
        if (q.lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[12])) {
            if (q.lIlIIIllIlIlIlI(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && q.lIlIIIllIlIlllI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
                Magic.cast((Spell)SpellBook.Standard.HOME_TELEPORT);
                this.sleep(lIIIllIlllIIl[14]);
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[15], new WorldPoint(lIIIllIlllIIl[16], lIIIllIlllIIl[17], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private void ad() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIllIIIl(Widgets.get((int)lIIIllIlllIIl[22], (int)lIIIllIlllIIl[21]))) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[19]];
        Inventory.getFirst((int[])nArray2).useOn(TileObjects.getNearest((String[])stringArray));
    }

    /*
     * WARNING - void declaration
     */
    private void af() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[33];
        NPC nPC = NPCs.getNearest((int[])nArray);
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[20]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]), (String[])stringArray);
        if (q.lIlIIIllIllIIII(nPC)) {
            void var7;
            if (q.lIlIIIllIlIllIl(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]));
                0;
                return;
            }
            ((TileObject)var7.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[21]]);
        }
    }

    public boolean run() {
        q var34;
        if (q.lIlIIIllIlIlIlI(this.au.quest().equals((Object)h.DWARF_CANNON) ? 1 : 0)) {
            return lIIIllIlllIIl[0];
        }
        int var27 = var34.Q();
        if (q.lIlIIIllIlIlIll(var27, lIIIllIlllIIl[1])) {
            return lIIIllIlllIIl[0];
        }
        System.out.println("[DWARF_CANNON] - Current Progress: " + var27);
        switch (var27) {
            case 0: {
                var34.M();
                0;
                if ((0x47 ^ 0x57 ^ (0xE ^ 0x1A)) > ((0x71 ^ 0x31 ^ (0x47 ^ 0x43)) & (130 + 55 - 110 + 170 ^ 164 + 5 - 8 + 16 ^ -1))) break;
                return false;
            }
            case 1: {
                var34.ak();
                var34.aj();
                var34.ai();
                0;
                if (1 < 2) break;
                return false;
            }
            case 2: {
                var34.ah();
                0;
                if (null == null) break;
                return ((0x3D ^ 0x40 ^ (0xEE ^ 0x87)) & (0x7A ^ 0x3B ^ (0x56 ^ 3) ^ -1)) != 0;
            }
            case 3: {
                var34.ah();
                var34.ag();
                0;
                if (-2 <= 0) break;
                return false;
            }
            case 4: {
                var34.af();
                0;
                if (-(0x5B ^ 0x5F) < 0) break;
                return false;
            }
            case 5: {
                var34.af();
                0;
                if (1 > 0) break;
                return false;
            }
            case 6: {
                var34.P();
                var34.ae();
                0;
                if (-(0x52 ^ 0x71 ^ (0xA4 ^ 0x83)) <= 0) break;
                return ((0x81 ^ 0x84 ^ (0x5F ^ 0x38)) & (0x70 ^ 0x65 ^ (0xD1 ^ 0xA6) ^ -1)) != 0;
            }
            case 7: {
                var34.ad();
                var34.ac();
                0;
                if (null == null) break;
                return false;
            }
            case 8: {
                var34.ai();
                0;
                if (-1 <= 2) break;
                return ((180 + 81 - 251 + 232 ^ 46 + 45 - 47 + 103) & (0x6C ^ 0x2D ^ (0x13 ^ 0x33) ^ -1)) != 0;
            }
            case 9: {
                var34.ab();
                0;
                if (null == null) break;
                return false;
            }
            case 10: {
                var34.Z();
                var34.aa();
                var34.Y();
            }
            default: {
                return lIIIllIlllIIl[0];
            }
        }
        return lIIIllIlllIIl[2];
    }

    private void ah() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[38];
        TileObject var10 = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var10) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
            var10.interact(lIIIllIllIlll[lIIIllIlllIIl[18]]);
            0;
            if (3 < 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[37]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[39], lIIIllIlllIIl[7]));
            0;
        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[21]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private void ai() {
        q var29;
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIlIlllI(var29.Q(), lIIIllIlllIIl[2])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[36]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            var29.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(var29.Q(), lIIIllIlllIIl[37])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[36]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            var29.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(var29.Q(), lIIIllIlllIIl[14])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[36]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            var29.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
    }

    private static void lIlIIIllIlIlIIl() {
        lIIIllIlllIIl = new int[54];
        q.lIIIllIlllIIl[0] = (0xCB ^ 0x80 ^ (0x20 ^ 0x35)) & (0x3E ^ 0x51 ^ (0x8F ^ 0xBE) ^ -1);
        q.lIIIllIlllIIl[1] = 63 + 37 - 68 + 107 ^ 142 + 103 - 208 + 112;
        q.lIIIllIlllIIl[2] = 1;
        q.lIIIllIlllIIl[3] = 0xFFFFFFFA & 0x2D37;
        q.lIIIllIlllIIl[4] = -(0xFFFFFF3D & 0x2CDB) & (0xFFFFEFFB & 0x3FFF);
        q.lIIIllIlllIIl[5] = 0xFFFFBBCD & 0x4FF7;
        q.lIIIllIlllIIl[6] = -(0xFFFFD7DE & 0x78E7) & (0xFFFFFDFF & 0x5FDF);
        q.lIIIllIlllIIl[7] = 2;
        q.lIIIllIlllIIl[8] = 3;
        q.lIIIllIlllIIl[9] = -(0xFFFF9FDD & 0x6C67) & (0xFFFFBFFF & 0x6E7F);
        q.lIIIllIlllIIl[10] = -(0xFFFFF4EF & 0x7F99) & (0xFFFFFFFF & 0x7FEB);
        q.lIIIllIlllIIl[11] = -(0xFFFFF7BD & 0x7B67) & (0xFFFFFFBF & Short.MAX_VALUE);
        q.lIIIllIlllIIl[12] = -(0xBA ^ 0xB0) & (0xFFFFFF3F & 0x2DFF);
        q.lIIIllIlllIIl[13] = -1;
        q.lIIIllIlllIIl[14] = 78 + 70 - -26 + 33 ^ 68 + 97 - 67 + 99;
        q.lIIIllIlllIIl[15] = -(0xFFFFFAF4 & 0x778F) & (0xFFFFF7FB & Short.MAX_VALUE);
        q.lIIIllIlllIIl[16] = 0xFFFFBBEA & 0x4FD7;
        q.lIIIllIlllIIl[17] = 0xFFFFEFFD & 0x1D7F;
        q.lIIIllIlllIIl[18] = 0x5C ^ 0x30 ^ (0x1C ^ 0x77);
        q.lIIIllIlllIIl[19] = 0x12 ^ 0x16;
        q.lIIIllIlllIIl[20] = 94 + 130 - 106 + 24 ^ 18 + 23 - -5 + 93;
        q.lIIIllIlllIIl[21] = 37 + 131 - 63 + 92 ^ 122 + 188 - 293 + 178;
        q.lIIIllIlllIIl[22] = -(0xFFFFD76F & 0x6EF3) & (0xFFFFE7FB & 0x5FFF);
        q.lIIIllIlllIIl[23] = -(0xFFFFE7FF & 0x7AD9) & (0xFFFFFFDB & 0x19962FF);
        q.lIIIllIlllIIl[24] = 0x43 ^ 0x5B ^ (0x6B ^ 0x6F);
        q.lIIIllIlllIIl[25] = -(0xFFFFBBEF & 0x6F93) & (0xFFFFAFDF & 0x1997BAA);
        q.lIIIllIlllIIl[26] = -(0xFFFF9D4F & 0x7FB5) & (0xFFFFFFBE & 0x1991D47);
        q.lIIIllIlllIIl[27] = 0xFFFFE5DF & 0x1991A27;
        q.lIIIllIlllIIl[28] = -(0xFFFF9FF7 & 0x6EDD) & (0xFFFFFEDD & 0x1990FF7);
        q.lIIIllIlllIIl[29] = 0xFFFF9FEF & 0x1996019;
        q.lIIIllIlllIIl[30] = -(0xFFFFEABF & 0x7FE1) & (0xFFFFFFFF & 0x7EE7);
        q.lIIIllIlllIIl[31] = 0xFFFFFB07 & 0xEFF;
        q.lIIIllIlllIIl[32] = -(0xFFFFFB9D & 0x667B) & (0xFFFFFFBE & 0x6FDB);
        q.lIIIllIlllIIl[33] = 0xFFFFBF7F & 0x54C6;
        q.lIIIllIlllIIl[34] = 0xFFFFBA1B & 0x4FEF;
        q.lIIIllIlllIIl[35] = -(0xFFFFEDBF & 0x1AC6) & (0xFFFFBFFF & 0x6EFF);
        q.lIIIllIlllIIl[36] = 4 ^ 0x79 ^ (0xCA ^ 0xBE);
        q.lIIIllIlllIIl[37] = 0x13 ^ 0x1B;
        q.lIIIllIlllIIl[38] = -(0xFFFFC75F & 0x7BB3) & (0xFFFFFFFE & Short.MAX_VALUE);
        q.lIIIllIlllIIl[39] = 0xFFFFAD7B & 0x5FF7;
        q.lIIIllIlllIIl[40] = 0xA9 ^ 0xA7;
        q.lIIIllIlllIIl[41] = 120 + 73 - 153 + 118 ^ 39 + 138 - 173 + 145;
        q.lIIIllIlllIIl[42] = -(0xFFFFF5BD & 0x7E53) & (0xFFFFFDFF & 0x7F3B);
        q.lIIIllIlllIIl[43] = 0x48 ^ 0x47;
        q.lIIIllIlllIIl[44] = 0x4F ^ 0x72 ^ (0x40 ^ 0x6D);
        q.lIIIllIlllIIl[45] = 0x83 ^ 0x92;
        q.lIIIllIlllIIl[46] = 0xD ^ 0x1F;
        q.lIIIllIlllIIl[47] = 0x1A ^ 0 ^ (0x2B ^ 0x22);
        q.lIIIllIlllIIl[48] = 0x62 ^ 0x76;
        q.lIIIllIlllIIl[49] = -(0xFFFFF4C3 & 0x2B7E) & (0xFFFFB3FF & 0x6D7B);
        q.lIIIllIlllIIl[50] = 120 + 86 - 173 + 137 ^ 38 + 42 - 6 + 92;
        q.lIIIllIlllIIl[51] = 0xC8 ^ 0xC5;
        q.lIIIllIlllIIl[52] = -(0xFFFFF35D & 0x6FEB) & (0xFFFFFFEE & 0x6FF9);
        q.lIIIllIlllIIl[53] = -(0xFFFFBB9F & 0x577A) & (0xFFFFBFFB & 0x5FFD);
    }

    private static boolean lIlIIIllIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private void Z() {
        if (q.lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlllIIl[2]];
            nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIlIll(Inventory.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        if (q.lIlIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlllIIl[2]];
            stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[2]];
            List var30 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]), (String[])stringArray);
            if (q.lIlIIIllIlIllIl(var30.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
                0;
                return;
            }
            if (q.lIlIIIllIlIlllI(var30.size(), lIIIllIlllIIl[2])) {
                if (q.lIlIIIllIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)var30.get(lIIIllIlllIIl[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
                    0;
                    return;
                }
                ((TileObject)var30.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[7]]);
            }
            return;
        }
        int[] nArray3 = new int[lIIIllIlllIIl[2]];
        nArray3[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlllIIl[2]];
            nArray4[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIlIll(Bank.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray4), lIIIllIlllIIl[1])) {
                Bank.withdraw((int)lIIIllIlllIIl[4], (int)lIIIllIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var3;
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = var3;
        NPC var20 = NPCs.getNearest((int[])nArray);
        if (q.lIlIIIllIllIIIl(var20) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            var20.interact(lIIIllIllIlll[lIIIllIlllIIl[40]]);
            0;
            if (-(0x5D ^ 0x17 ^ (0xD4 ^ 0x9B)) >= 0) {
                return;
            }
        } else {
            q var32;
            void var6;
            System.out.println("Walking to NPC: " + (int)var3 + " at " + String.valueOf(var6));
            Walker.walkTo((WorldPoint)var6);
            0;
            var32.sleep(lIIIllIlllIIl[7]);
        }
    }

    private static String lIlIIIllIIllIll(String var26, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIIllIlllIIl[37]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lIIIllIlllIIl[7], var11);
            return new String(var24.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private void aj() {
        if (q.lIlIIIllIllIIlI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
            return;
        }
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            q var8;
            Dialog.continueSpace();
            var8.sleep(lIIIllIlllIIl[14]);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[18]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        nArray2[q.lIIIllIlllIIl[2]] = lIIIllIlllIIl[43];
        nArray2[q.lIIIllIlllIIl[7]] = lIIIllIlllIIl[44];
        nArray2[q.lIIIllIlllIIl[8]] = lIIIllIlllIIl[45];
        nArray2[q.lIIIllIlllIIl[19]] = lIIIllIlllIIl[46];
        nArray2[q.lIIIllIlllIIl[20]] = lIIIllIlllIIl[47];
        nArray2[q.lIIIllIlllIIl[21]] = lIIIllIlllIIl[48];
        TileObject var28 = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var28) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var28) ? 1 : 0)) {
            var28.interact(lIIIllIllIlll[lIIIllIlllIIl[36]]);
        }
    }

    private static boolean lIlIIIllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private void aa() {
        if (q.lIlIIIllIlIllll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[8]]);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlllIIl[2]];
            nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIllII(Inventory.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[8]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlllIIl[9], new WorldPoint(lIIIllIlllIIl[10], lIIIllIlllIIl[11], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private static boolean lIlIIIllIllIIIl(Object object) {
        return object != null;
    }

    private void ag() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[36]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.QUEST;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private static String lIlIIIllIIlllII(String var5, String var33) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var33.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIIIllIlllIIl[7], var4);
            return new String(var18.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private void P() {
        if (q.lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.sleep(lIIIllIlllIIl[7]);
            return;
        }
    }

    private void ac() {
        if (q.lIlIIIllIllIIII(Widgets.get((int)lIIIllIlllIIl[22], (int)lIIIllIlllIIl[21]))) {
            return;
        }
        Widgets.fromId((int)lIIIllIlllIIl[23]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[23]);
        Widgets.fromId((int)lIIIllIlllIIl[25]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[25]);
        Widgets.fromId((int)lIIIllIlllIIl[26]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[26]);
        Widgets.fromId((int)lIIIllIlllIIl[27]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[27]);
        Widgets.fromId((int)lIIIllIlllIIl[28]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[28]);
        Widgets.fromId((int)lIIIllIlllIIl[29]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[29]);
    }

    private static void lIlIIIllIlIIIlI() {
        lIIIllIllIlll = new String[lIIIllIlllIIl[43]];
        q.lIIIllIllIlll[q.lIIIllIlllIIl[0]] = q."cant turn in quest";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[2]] = q."Bank booth";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[7]] = q."Bank";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[8]] = q."cant charter";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[19]] = q."Broken multicannon";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[20]] = q."Crate";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[21]] = q."Search";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[18]] = q."Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[37]] = q."Walking to remains";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[36]] = q."Inspect";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[14]] = q."Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[41]] = q."Chicken";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[50]] = q."Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[51]] = q."Attack";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[40]] = q."Talk-to";
    }

    private static String lIlIIIllIIlllIl(String var9, String var1) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var19 = lIIIllIlllIIl[0];
        char[] var14 = var9.toCharArray();
        int var17 = var14.length;
        int var31 = lIIIllIlllIIl[0];
        while (q.lIlIIIllIlIllII(var31, var17)) {
            char var23 = var14[var31];
            var21.append((char)(var23 ^ var13[var19 % var13.length]));
            0;
            ++var19;
            ++var31;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean lIlIIIllIlIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private void ae() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    @Inject
    public q(SquireQuesterConfig squireQuesterConfig) {
        this.au = squireQuesterConfig;
    }

    private static boolean lIlIIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_DWARF_CANNON.c());
    }

    static {
        q.lIlIIIllIlIlIIl();
        q.lIlIIIllIlIIIlI();
    }

    private void O() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIllIIIl(Players.getLocal().getInteracting())) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[41]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        TileItem var22 = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var22) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var22) ? 1 : 0)) {
            var22.interact(lIIIllIllIlll[lIIIllIlllIIl[50]]);
            return;
        }
        if (q.lIlIIIllIllIIIl(var2) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var2) ? 1 : 0) && q.lIlIIIllIllIIII(Players.getLocal().getInteracting())) {
            var2.interact(lIIIllIllIlll[lIIIllIlllIIl[51]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[52], lIIIllIlllIIl[53], lIIIllIlllIIl[0]));
        0;
    }

    private void Y() {
        System.out.println(Players.getLocal().getWorldLocation().getRegionID());
        if (q.lIlIIIllIlIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[0]]);
            return;
        }
        this.ai();
    }

    private void N() {
        this.O();
    }

    private void ak() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        TileItem var16 = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var16) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
            var16.interact(lIIIllIllIlll[lIIIllIlllIIl[14]]);
            0;
            if (1 >= (0xAB ^ 0xBF ^ (0x72 ^ 0x62))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var16.getWorldLocation());
            0;
        }
    }

    private static boolean lIlIIIllIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIlIllIl(int n2) {
        return n2 != 0;
    }
}

