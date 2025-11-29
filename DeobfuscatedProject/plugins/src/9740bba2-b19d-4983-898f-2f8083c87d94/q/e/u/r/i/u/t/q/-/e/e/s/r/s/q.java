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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Dwarf Cannon")
public class q
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
            void lllllllllllllllIIIIIllllIIIIIllI;
            if (q.lIlIIIllIlIllIl(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]));
                "".length();
                return;
            }
            ((TileObject)lllllllllllllllIIIIIllllIIIIIllI.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[21]]);
        }
    }

    public boolean run() {
        q lllllllllllllllIIIIIllllIIIlIIll;
        if (q.lIlIIIllIlIlIlI(this.au.quest().equals((Object)h.DWARF_CANNON) ? 1 : 0)) {
            return lIIIllIlllIIl[0];
        }
        int lllllllllllllllIIIIIllllIIIlIIlI = lllllllllllllllIIIIIllllIIIlIIll.Q();
        if (q.lIlIIIllIlIlIll(lllllllllllllllIIIIIllllIIIlIIlI, lIIIllIlllIIl[1])) {
            return lIIIllIlllIIl[0];
        }
        System.out.println("[DWARF_CANNON] - Current Progress: " + lllllllllllllllIIIIIllllIIIlIIlI);
        switch (lllllllllllllllIIIIIllllIIIlIIlI) {
            case 0: {
                lllllllllllllllIIIIIllllIIIlIIll.M();
                "".length();
                if ((0x47 ^ 0x57 ^ (0xE ^ 0x1A)) > ((0x71 ^ 0x31 ^ (0x47 ^ 0x43)) & (130 + 55 - 110 + 170 ^ 164 + 5 - 8 + 16 ^ -" ".length()))) break;
                return ((157 + 41 - 179 + 178 ^ 56 + 72 - -13 + 24) & (39 + 102 - 45 + 102 ^ 132 + 117 - 137 + 54 ^ -" ".length())) != 0;
            }
            case 1: {
                lllllllllllllllIIIIIllllIIIlIIll.ak();
                lllllllllllllllIIIIIllllIIIlIIll.aj();
                lllllllllllllllIIIIIllllIIIlIIll.ai();
                "".length();
                if (" ".length() < "  ".length()) break;
                return ((0x2E ^ 0x36) & ~(0x46 ^ 0x5E)) != 0;
            }
            case 2: {
                lllllllllllllllIIIIIllllIIIlIIll.ah();
                "".length();
                if (null == null) break;
                return ((0x3D ^ 0x40 ^ (0xEE ^ 0x87)) & (0x7A ^ 0x3B ^ (0x56 ^ 3) ^ -" ".length())) != 0;
            }
            case 3: {
                lllllllllllllllIIIIIllllIIIlIIll.ah();
                lllllllllllllllIIIIIllllIIIlIIll.ag();
                "".length();
                if (-"  ".length() <= 0) break;
                return ((0xC8 ^ 0x88) & ~(0x4C ^ 0xC)) != 0;
            }
            case 4: {
                lllllllllllllllIIIIIllllIIIlIIll.af();
                "".length();
                if (-(0x5B ^ 0x5F) < 0) break;
                return ((0x24 ^ 5) & ~(0x3E ^ 0x1F)) != 0;
            }
            case 5: {
                lllllllllllllllIIIIIllllIIIlIIll.af();
                "".length();
                if (" ".length() > 0) break;
                return ((0x94 ^ 0x87) & ~(0x80 ^ 0x93)) != 0;
            }
            case 6: {
                lllllllllllllllIIIIIllllIIIlIIll.P();
                lllllllllllllllIIIIIllllIIIlIIll.ae();
                "".length();
                if (-(0x52 ^ 0x71 ^ (0xA4 ^ 0x83)) <= 0) break;
                return ((0x81 ^ 0x84 ^ (0x5F ^ 0x38)) & (0x70 ^ 0x65 ^ (0xD1 ^ 0xA6) ^ -" ".length())) != 0;
            }
            case 7: {
                lllllllllllllllIIIIIllllIIIlIIll.ad();
                lllllllllllllllIIIIIllllIIIlIIll.ac();
                "".length();
                if (null == null) break;
                return ((0x61 ^ 0x38) & ~(0xF9 ^ 0xA0)) != 0;
            }
            case 8: {
                lllllllllllllllIIIIIllllIIIlIIll.ai();
                "".length();
                if (-" ".length() <= "  ".length()) break;
                return ((180 + 81 - 251 + 232 ^ 46 + 45 - 47 + 103) & (0x6C ^ 0x2D ^ (0x13 ^ 0x33) ^ -" ".length())) != 0;
            }
            case 9: {
                lllllllllllllllIIIIIllllIIIlIIll.ab();
                "".length();
                if (null == null) break;
                return ((0xF8 ^ 0x9B) & ~(0x41 ^ 0x22)) != 0;
            }
            case 10: {
                lllllllllllllllIIIIIllllIIIlIIll.Z();
                lllllllllllllllIIIIIllllIIIlIIll.aa();
                lllllllllllllllIIIIIllllIIIlIIll.Y();
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
        TileObject lllllllllllllllIIIIIllllIIIIIIlI = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIllllIIIIIIlI) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIllllIIIIIIlI) ? 1 : 0)) {
            lllllllllllllllIIIIIllllIIIIIIlI.interact(lIIIllIllIlll[lIIIllIlllIIl[18]]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[37]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[39], lIIIllIlllIIl[7]));
            "".length();
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
        q lllllllllllllllIIIIIllllIIIIIIII;
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIlIlllI(lllllllllllllllIIIIIllllIIIIIIII.Q(), lIIIllIlllIIl[2])) {
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
            lllllllllllllllIIIIIllllIIIIIIII.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(lllllllllllllllIIIIIllllIIIIIIII.Q(), lIIIllIlllIIl[37])) {
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
            lllllllllllllllIIIIIllllIIIIIIII.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(lllllllllllllllIIIIIllllIIIIIIII.Q(), lIIIllIlllIIl[14])) {
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
            lllllllllllllllIIIIIllllIIIIIIII.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
    }

    private static void lIlIIIllIlIlIIl() {
        lIIIllIlllIIl = new int[54];
        q.lIIIllIlllIIl[0] = (0xCB ^ 0x80 ^ (0x20 ^ 0x35)) & (0x3E ^ 0x51 ^ (0x8F ^ 0xBE) ^ -" ".length());
        q.lIIIllIlllIIl[1] = 63 + 37 - 68 + 107 ^ 142 + 103 - 208 + 112;
        q.lIIIllIlllIIl[2] = " ".length();
        q.lIIIllIlllIIl[3] = 0xFFFFFFFA & 0x2D37;
        q.lIIIllIlllIIl[4] = -(0xFFFFFF3D & 0x2CDB) & (0xFFFFEFFB & 0x3FFF);
        q.lIIIllIlllIIl[5] = 0xFFFFBBCD & 0x4FF7;
        q.lIIIllIlllIIl[6] = -(0xFFFFD7DE & 0x78E7) & (0xFFFFFDFF & 0x5FDF);
        q.lIIIllIlllIIl[7] = "  ".length();
        q.lIIIllIlllIIl[8] = "   ".length();
        q.lIIIllIlllIIl[9] = -(0xFFFF9FDD & 0x6C67) & (0xFFFFBFFF & 0x6E7F);
        q.lIIIllIlllIIl[10] = -(0xFFFFF4EF & 0x7F99) & (0xFFFFFFFF & 0x7FEB);
        q.lIIIllIlllIIl[11] = -(0xFFFFF7BD & 0x7B67) & (0xFFFFFFBF & Short.MAX_VALUE);
        q.lIIIllIlllIIl[12] = -(0xBA ^ 0xB0) & (0xFFFFFF3F & 0x2DFF);
        q.lIIIllIlllIIl[13] = -" ".length();
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
            List lllllllllllllllIIIIIllllIIIIlllI = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]), (String[])stringArray);
            if (q.lIlIIIllIlIllIl(lllllllllllllllIIIIIllllIIIIlllI.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
                "".length();
                return;
            }
            if (q.lIlIIIllIlIlllI(lllllllllllllllIIIIIllllIIIIlllI.size(), lIIIllIlllIIl[2])) {
                if (q.lIlIIIllIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIIllllIIIIlllI.get(lIIIllIlllIIl[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));
                    "".length();
                    return;
                }
                ((TileObject)lllllllllllllllIIIIIllllIIIIlllI.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[7]]);
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
        void lllllllllllllllIIIIIlllIlllIllIl;
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lllllllllllllllIIIIIlllIlllIllIl;
        NPC lllllllllllllllIIIIIlllIlllIlIlI = NPCs.getNearest((int[])nArray);
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIlllIlllIlIlI) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIlllIlIlI) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIlllIlIlI.interact(lIIIllIllIlll[lIIIllIlllIIl[40]]);
            "".length();
            if (-(0x5D ^ 0x17 ^ (0xD4 ^ 0x9B)) >= 0) {
                return;
            }
        } else {
            q lllllllllllllllIIIIIlllIlllIlllI;
            void lllllllllllllllIIIIIlllIlllIllII;
            System.out.println("Walking to NPC: " + (int)lllllllllllllllIIIIIlllIlllIllIl + " at " + String.valueOf(lllllllllllllllIIIIIlllIlllIllII));
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIIlllIlllIllII);
            "".length();
            lllllllllllllllIIIIIlllIlllIlllI.sleep(lIIIllIlllIIl[7]);
        }
    }

    private static String lIlIIIllIIllIll(String lllllllllllllllIIIIIlllIlllIIIII, String lllllllllllllllIIIIIlllIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIllIlllll.getBytes(StandardCharsets.UTF_8)), lIIIllIlllIIl[37]), "DES");
            Cipher lllllllllllllllIIIIIlllIlllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlllIlllIIlII.init(lIIIllIlllIIl[7], lllllllllllllllIIIIIlllIlllIIlIl);
            return new String(lllllllllllllllIIIIIlllIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlllIlllIIIll) {
            lllllllllllllllIIIIIlllIlllIIIll.printStackTrace();
            return null;
        }
    }

    private void aj() {
        if (q.lIlIIIllIllIIlI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
            return;
        }
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            q lllllllllllllllIIIIIlllIllllllIl;
            Dialog.continueSpace();
            lllllllllllllllIIIIIlllIllllllIl.sleep(lIIIllIlllIIl[14]);
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
        TileObject lllllllllllllllIIIIIlllIllllllII = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIlllIllllllII) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIllllllII) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIllllllII.interact(lIIIllIllIlll[lIIIllIlllIIl[36]]);
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

    private static String lIlIIIllIIlllII(String lllllllllllllllIIIIIlllIllIlIIll, String lllllllllllllllIIIIIlllIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlllIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlllIllIlIlll.init(lIIIllIlllIIl[7], lllllllllllllllIIIIIlllIllIllIII);
            return new String(lllllllllllllllIIIIIlllIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlllIllIlIllI) {
            lllllllllllllllIIIIIlllIllIlIllI.printStackTrace();
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
        q.lIIIllIllIlll[q.lIIIllIlllIIl[0]] = q.lIlIIIllIIllIll("wNtUoesm1JuUwjMwSKCbKPQA2UZ8qgug", "rvMWX");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[2]] = q.lIlIIIllIIllIll("MIgYJK/saPefPS3II5OmYg==", "KXmKK");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[7]] = q.lIlIIIllIIlllII("LKN69Yt9QMY=", "xrBXM");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[8]] = q.lIlIIIllIIllIll("2vcgOFhEcUwTYPDSCJLxmg==", "iMjii");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[19]] = q.lIlIIIllIIllIll("GLtPSUfB2rxEuAqlbiOuFdU3cJC8b9Uy", "Xzdkn");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[20]] = q.lIlIIIllIIlllII("NKw0uwz8Xoc=", "MCCQT");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[21]] = q.lIlIIIllIIlllII("6jxLDc1UHJ0=", "mtKau");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[18]] = q.lIlIIIllIIllIll("Ykdo3Uaf6aw=", "maNFx");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[37]] = q.lIlIIIllIIlllIl("OyslGh0CLWkFG0w4LBwVBSQ6", "lJIqt");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[36]] = q.lIlIIIllIIlllIl("LgMgGhMEGQ==", "gmSjv");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[14]] = q.lIlIIIllIIllIll("sAa9Hg/4Ofk=", "ducOx");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[41]] = q.lIlIIIllIIlllII("/XDN5x65keI=", "THYEV");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[50]] = q.lIlIIIllIIlllII("OHBMYi7fzB8=", "JXghp");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[51]] = q.lIlIIIllIIlllIl("LzcGCy4F", "nCrjM");
        q.lIIIllIllIlll[q.lIIIllIlllIIl[40]] = q.lIlIIIllIIlllII("nCUECmB6ozw=", "EyEUi");
    }

    private static String lIlIIIllIIlllIl(String lllllllllllllllIIIIIlllIllIIIlIl, String lllllllllllllllIIIIIlllIllIIIlII) {
        lllllllllllllllIIIIIlllIllIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlllIllIIIIll = new StringBuilder();
        char[] lllllllllllllllIIIIIlllIllIIIIlI = lllllllllllllllIIIIIlllIllIIIlII.toCharArray();
        int lllllllllllllllIIIIIlllIllIIIIIl = lIIIllIlllIIl[0];
        char[] lllllllllllllllIIIIIlllIlIlllIll = lllllllllllllllIIIIIlllIllIIIlIl.toCharArray();
        int lllllllllllllllIIIIIlllIlIlllIlI = lllllllllllllllIIIIIlllIlIlllIll.length;
        int lllllllllllllllIIIIIlllIlIlllIIl = lIIIllIlllIIl[0];
        while (q.lIlIIIllIlIllII(lllllllllllllllIIIIIlllIlIlllIIl, lllllllllllllllIIIIIlllIlIlllIlI)) {
            char lllllllllllllllIIIIIlllIllIIIllI = lllllllllllllllIIIIIlllIlIlllIll[lllllllllllllllIIIIIlllIlIlllIIl];
            lllllllllllllllIIIIIlllIllIIIIll.append((char)(lllllllllllllllIIIIIlllIllIIIllI ^ lllllllllllllllIIIIIlllIllIIIIlI[lllllllllllllllIIIIIlllIllIIIIIl % lllllllllllllllIIIIIlllIllIIIIlI.length]));
            "".length();
            ++lllllllllllllllIIIIIlllIllIIIIIl;
            ++lllllllllllllllIIIIIlllIlIlllIIl;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIlllIllIIIIll);
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
        NPC lllllllllllllllIIIIIlllIllllIlll = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        TileItem lllllllllllllllIIIIIlllIllllIllI = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIlllIllllIllI) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIllllIllI) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIllllIllI.interact(lIIIllIllIlll[lIIIllIlllIIl[50]]);
            return;
        }
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIlllIllllIlll) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIllllIlll) ? 1 : 0) && q.lIlIIIllIllIIII(Players.getLocal().getInteracting())) {
            lllllllllllllllIIIIIlllIllllIlll.interact(lIIIllIllIlll[lIIIllIlllIIl[51]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[52], lIIIllIlllIIl[53], lIIIllIlllIIl[0]));
        "".length();
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
        TileItem lllllllllllllllIIIIIlllIlllllIlI = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(lllllllllllllllIIIIIlllIlllllIlI) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIlllllIlI) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIlllllIlI.interact(lIIIllIllIlll[lIIIllIlllIIl[14]]);
            "".length();
            if (" ".length() >= (0xAB ^ 0xBF ^ (0x72 ^ 0x62))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIIlllIlllllIlI.getWorldLocation());
            "".length();
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

