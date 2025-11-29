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
package gg.squire.quest.tasks;

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
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Imp Catcher")
public class CompletingImpCatcherTask
extends Task {
    private final  SquireQuesterConfig av;

    /*
     * WARNING - void declaration
     */
    private void al() {
        void var1;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[54]]));
        if (r.lIlIIIlIIIIllII(tileItem2)) {
            return;
        }
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[3];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var1.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[0]]) ? 1 : 0)) {
            var1.interact(lIIIllIIllIII[lIIIllIIllIIl[2]]);
            return;
        }
        int[] nArray2 = new int[lIIIllIIllIIl[2]];
        nArray2[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var1.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[1]]) ? 1 : 0)) {
            var1.interact(lIIIllIIllIII[lIIIllIIllIIl[18]]);
            return;
        }
        int[] nArray3 = new int[lIIIllIIllIIl[2]];
        nArray3[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var1.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[19]]) ? 1 : 0)) {
            var1.interact(lIIIllIIllIII[lIIIllIIllIIl[20]]);
            return;
        }
        int[] nArray4 = new int[lIIIllIIllIIl[2]];
        nArray4[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0) && r.lIlIIIlIIIIlIIl(var1.getName().contains(lIIIllIIllIII[lIIIllIIllIIl[21]]) ? 1 : 0)) {
            var1.interact(lIIIllIIllIII[lIIIllIIllIIl[22]]);
            return;
        }
    }

    @Inject
    public CompletingImpCatcherTask(SquireQuesterConfig squireQuesterConfig) {
        this.av = squireQuesterConfig;
    }

    private static void lIlIIIlIIIIIlIl() {
        lIIIllIIllIII = new String[lIIIllIIllIIl[55]];
        r.lIIIllIIllIII[r.lIIIllIIllIIl[0]] = "Red";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[2]] = "Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[1]] = "Yellow";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[18]] = "Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[19]] = "Black";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[20]] = "Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[21]] = "White";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[22]] = "Take";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[23]] = "Wind Strike";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[24]] = "Choose spell";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[14]] = "Attack";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[34]] = "Open";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[40]] = "Bank booth";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[42]] = "Bank";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[43]] = "Wield";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[45]] = "Trade";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[49]] = "Trade";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[52]] = "Talk-to";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[53]] = "Imp";
        r.lIIIllIIllIII[r.lIIIllIIllIIl[54]] = "bead";
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

        return String.valueOf(var2);
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
                r var3;
                Magic.cast((Spell)SpellBook.Standard.HOME_TELEPORT);
                var3.sleep(lIIIllIIllIIl[14]);
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
        void var4;
        if (r.lIlIIIlIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIllIIllIIl[2]];
        nArray[r.lIIIllIIllIIl[0]] = var4;
        NPC var5 = NPCs.getNearest((int[])nArray);
        if (r.lIlIIIlIIIIllIl(var5) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            var5.interact(lIIIllIIllIII[lIIIllIIllIIl[52]]);

            }
        } else {
            void var6;
            Walker.walkTo((WorldPoint)var6);

        }
    }

    private static boolean lIlIIIlIIIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIIIIlllI(int n2, int n3) {
        return n2 > n3;
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
        TileItem var7;
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
            var7 = TileItems.getNearest((int[])nArray7);
            if (r.lIlIIIlIIIIllIl(var7)) {
                return;
            }
        }
        int[] nArray8 = new int[lIIIllIIllIIl[2]];
        nArray8[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIIllIIllIIl[2]];
            nArray9[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[4];
            var7 = TileItems.getNearest((int[])nArray9);
            if (r.lIlIIIlIIIIllIl(var7)) {
                return;
            }
        }
        int[] nArray10 = new int[lIIIllIIllIIl[2]];
        nArray10[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIIllIIllIIl[2]];
            nArray11[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[5];
            var7 = TileItems.getNearest((int[])nArray11);
            if (r.lIlIIIlIIIIllIl(var7)) {
                return;
            }
        }
        int[] nArray12 = new int[lIIIllIIllIIl[2]];
        nArray12[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
        if (r.lIlIIIlIIIIIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIIllIIllIIl[2]];
            nArray13[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[6];
            var7 = TileItems.getNearest((int[])nArray13);
            if (r.lIlIIIlIIIIllIl(var7)) {
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
        if (r.lIlIIIlIIIIllIl(var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lIlIIIlIIIIlIIl(nPC.getName().equals(lIIIllIIllIII[lIIIllIIllIIl[53]]) ? 1 : 0) && r.lIlIIIlIIIIIlll(nPC.isDead() ? 1 : 0)) {
                n2 = lIIIllIIllIIl[2];

                if ((0x28 ^ 0x1C ^ (0xAB ^ 0x9B)) != (0xF6 ^ 0xC3 ^ (0x29 ^ 0x18))) {
                    return ((106 + 162 - 252 + 158 ^ 6 + 0 - -115 + 34) & (0xBB ^ 0xB6 ^ (0x58 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIllIIllIIl[0];
            }
            return n2 != 0;
        })) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            if (!r.lIlIIIlIIIIlIlI(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[29]) || r.lIlIIIlIIIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIIllIIl[30])) {
                var7.interact(lIIIllIIllIII[lIIIllIIllIIl[14]]);

                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));

            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[31], lIIIllIIllIIl[32], lIIIllIIllIIl[0]));

        }
    }

    private void an() {
        r var8;
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
                List var9 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIllIIl[38], lIIIllIIllIIl[39], lIIIllIIllIIl[0]), (String[])stringArray);
                if (r.lIlIIIlIIIIlIIl(var9.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));

                    return;
                }
                if (r.lIlIIIlIIIIlIll(var9.size(), lIIIllIIllIIl[2])) {
                    if (r.lIlIIIlIIIIIlll(Reachable.isInteractable((Locatable)((Locatable)var9.get(lIIIllIIllIIl[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[41], lIIIllIIllIIl[39], lIIIllIIllIIl[0]));

                        return;
                    }
                    ((TileObject)var9.get(lIIIllIIllIIl[0])).interact(lIIIllIIllIII[lIIIllIIllIIl[42]]);
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
                    var8.sleep(lIIIllIIllIIl[20]);
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

                if (1 <= -1) {
                    return;
                }
            } else if (r.lIlIIIlIIIIlIIl(Shop.isOpen() ? 1 : 0)) {
                Shop.buyOne((int)lIIIllIIllIIl[37]);

                if (((0xEA ^ 0xC5) & ~(0x22 ^ 0xD)) > 0) {
                    return;
                }
            } else {
                int[] nArray10 = new int[lIIIllIIllIIl[2]];
                nArray10[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[44];
                NPC var9 = NPCs.getNearest((int[])nArray10);
                if (r.lIlIIIlIIIIllIl(var9) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                    var9.interact(lIIIllIIllIII[lIIIllIIllIIl[45]]);

                    if ((0x24 ^ 0x21) == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[46], lIIIllIIllIIl[47], lIIIllIIllIIl[0]));

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

                }
            } else {
                int[] nArray12 = new int[lIIIllIIllIIl[2]];
                nArray12[r.lIIIllIIllIIl[0]] = lIIIllIIllIIl[48];
                NPC var9 = NPCs.getNearest((int[])nArray12);
                if (r.lIlIIIlIIIIllIl(var9) && r.lIlIIIlIIIIlIIl(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                    var9.interact(lIIIllIIllIII[lIIIllIIllIIl[49]]);

                    if (1 < 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIIl[50], lIIIllIIllIIl[51], lIIIllIIllIIl[0]));

                    var8.sleep(lIIIllIIllIIl[1]);
                    return;
                }
            }
        }
    }

    private static boolean lIlIIIlIIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        r var10;
        if (r.lIlIIIlIIIIIlll(this.av.quest().equals((Object)h.IMP_CATCHER) ? 1 : 0)) {
            return lIIIllIIllIIl[0];
        }
        int var11 = var10.Q();
        if (r.lIlIIIlIIIIlIII(var11, lIIIllIIllIIl[1])) {
            return lIIIllIIllIIl[0];
        }
        System.out.println("[IMP_CATCHER] - Current Progress: " + var11);
        switch (var11) {
            case 0: {
                var10.an();
                var10.al();
                var10.am();
                var10.M();

                if (-1 <= 0) break;
                return ((101 + 18 - -40 + 6 ^ 131 + 59 - 36 + 42) & (0x33 ^ 0x2A ^ (0xFD ^ 0x85) ^ -1)) != 0;
            }
            case 1: {
                var10.Y();
            }
            default: {
                return lIIIllIIllIIl[0];
            }
        }
        return lIIIllIIllIIl[2];
    }
}

