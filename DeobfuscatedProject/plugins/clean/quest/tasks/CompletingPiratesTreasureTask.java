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
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
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
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Pirates Treasure", register=true)
public class CompletingPiratesTreasureTask
extends Task {
    private  boolean aN;
    private  boolean aQ;
    private  boolean aP;
    
    private  boolean aO;
    
    private  boolean aR;
    private final  SquireQuesterConfig aM;

    private void bj() {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (v.lIlIIIlllIIlIll(nPC.getId(), lIIIlllIIIIlI[87]) && v.lIlIIIlllIIllII(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIIlllIIIIlI[2];

                if ((0x7C ^ 0x2B ^ (0xC9 ^ 0x9A)) == ((0x42 ^ 0x1E ^ (0xF8 ^ 0x9C)) & (0x9B ^ 0x93 ^ (0x8C ^ 0xBC) ^ -1))) {
                    return ((3 + 49 - -115 + 41 ^ 28 + 79 - -40 + 5) & (0xF9 ^ 0xBD ^ (0x4E ^ 0x42) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        });
        if (v.lIlIIIlllIIIlII(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[3], lIIIlllIIIIlI[4], lIIIlllIIIIlI[0]));

            return;
        }
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0]));

            if (3 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[0]]);
        }
    }

    private static void lIlIIIlllIIIIlI() {
        lIIIlllIIIIIl = new String[lIIIlllIIIIlI[88]];
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[0]] = "Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[2]] = "Read";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[18]] = "Taking";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[19]] = "Take";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[1]] = "We are wearing our apron";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[20]] = "Search";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[21]] = "Wear";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[22]] = "Collecting payment";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[23]] = "You stash the rum in the crate.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[24]] = "Setting stashed rum to true";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[17]] = "You pack all your bananas into the crate.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[40]] = "Setting stashed to true";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[42]] = "Filling with rum";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[44]] = "Filling with banana";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[45]] = "Fill";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[47]] = "Have you completed your task yet?";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[48]] = "Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[49]] = "Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[51]] = "Trade";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[60]] = "Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[63]] = "Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[66]] = "Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[69]] = "Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[70]] = "Take";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[78]] = "Talk-to";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[79]] = "Walking to NPC";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[80]] = "crate is already full.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[81]] = "crate is full";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[82]] = "hands you 30";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[83]] = "Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[84]] = "Banana Tree";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[85]] = "Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[86]] = "Banana Tree";
    }

    private void bq() {
        v var1;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var1.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray2), lIIIlllIIIIlI[17])) {
            return;
        }
        System.out.println(var1.aN);
        if (v.lIlIIIlllIIIlll(var1.aN ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        var1.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
        if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[46], (int)lIIIlllIIIIlI[21]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[47]]) ? 1 : 0)) {
            var1.aN = lIIIlllIIIIlI[2];
        }
    }

    private void bo() {
        v var2;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var2.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var2.aQ ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[22]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[18]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private void bz() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void P() {
        if (v.lIlIIIlllIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void bk() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        Inventory.getFirst((int[])nArray2).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[2]]);
    }

    private void bx() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        TileItem var3 = TileItems.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIlIII(var3)) {
            var3.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[70]]);

            if (2 <= -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[71], lIIIlllIIIIlI[72], lIIIlllIIIIlI[2]));

        }
    }

    private void bs() {
        v var4;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var4.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var4.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[50];
        NPC var5 = NPCs.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIIlll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIlllIIIIlI[13]);
        }
        if (v.lIlIIIlllIIlIII(var5)) {
            var5.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[51]]);

            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[52], lIIIlllIIIIlI[53], lIIIlllIIIIlI[0]));

        }
    }

        return String.valueOf(var6);
    }

    public boolean run() {
        v var7;
        if (v.lIlIIIlllIIIlII(this.aM.quest().equals((Object)h.PIRATES_TREASURE) ? 1 : 0)) {
            return lIIIlllIIIIlI[0];
        }
        int var8 = var7.Q();
        if (v.lIlIIIlllIIIlIl(var8, lIIIlllIIIIlI[1])) {
            return lIIIlllIIIIlI[0];
        }
        System.out.println("[PIRATES TREASURE] - Current Progress: " + var8);
        switch (var8) {
            case 0: {
                var7.bx();
                var7.bz();

                if (-1 <= 0) break;
                return false;
            }
            case 1: {
                var7.by();
                var7.bs();
                var7.br();
                var7.bq();
                var7.bp();
                var7.bo();
                var7.bn();
                var7.bm();

                if (1 != 0) break;
                return false;
            }
            case 2: {
                var7.bl();
                var7.bk();

                if (-1 <= ((0x81 ^ 0x8C) & ~(0xAB ^ 0xA6))) break;
                return false;
            }
            case 3: {
                var7.bj();

                if (1 != ((0x6C ^ 0x71 ^ (0x9E ^ 0xA2)) & (0xE0 ^ 0xA4 ^ (0x16 ^ 0x73) ^ -1))) break;
                return ((121 + 68 - 150 + 145 ^ 51 + 88 - 48 + 48) & (0x58 ^ 0x16 ^ (0x2B ^ 0x56) ^ -1)) != 0;
            }
            default: {
                return lIIIlllIIIIlI[0];
            }
        }
        return lIIIlllIIIIlI[2];
    }

    private void br() {
        TileObject var9;
        v var10;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var10.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var10.aO ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var10.aN ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray3), lIIIlllIIIIlI[17]) && v.lIlIIIlllIIlIII(var9 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIIlllIIIIlI[2]];
                stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[85]];
                if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[86]]) ? 1 : 0)) {
                    n2 = lIIIlllIIIIlI[2];

                    if (((0xA2 ^ 0xA5) & ~(0x5A ^ 0x5D)) > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllIIIIlI[0];
                }
                return n2 != 0;
            })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                var9.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[48]]);
            }
        }
        int[] nArray4 = new int[lIIIlllIIIIlI[2]];
        nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIlIII(var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIIlllIIIIlI[2]];
            stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[83]];
            if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[84]]) ? 1 : 0)) {
                n2 = lIIIlllIIIIlI[2];

                if (((4 ^ 0x66) & ~(0xC7 ^ 0xA5)) <= -1) {
                    return false;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            var9.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[49]]);
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PIRATES_TREASURE.c());
    }

    private void bt() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0]));

            if (((0x77 ^ 0x28) & ~(9 ^ 0x56)) != ((0xED ^ 0xBF) & ~(0x24 ^ 0x76))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[60]]);
        }
    }

    private void Y() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[54];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[55], new WorldPoint(lIIIlllIIIIlI[56], lIIIlllIIIIlI[57], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var11;
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = var11;
        NPC var12 = NPCs.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(var12) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            var12.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[78]]);

            if (((0x5D ^ 0x6F) & ~(0x1D ^ 0x2F)) != 0) {
                return;
            }
        } else {
            void var13;
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[79]]);
            Walker.walkTo((WorldPoint)var13);

        }
    }

    private void by() {
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (!v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[73]) || v.lIlIIIlllIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[74])) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[1]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIlllIIIIlI[75], new WorldPoint(lIIIlllIIIIlI[76], lIIIlllIIIIlI[77], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        v.lIlIIIlllIIIIll();
        v.lIlIIIlllIIIIlI();
    }

    private void bl() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[lIIIlllIIIIlI[2]];
        nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[10];
        TileObject var14 = TileObjects.getNearest((int[])nArray3);
        if (v.lIlIIIlllIIlIII(var14) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
            Inventory.getFirst((int[])nArray4).useOn(var14);

            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[11], lIIIlllIIIIlI[12], lIIIlllIIIIlI[2]));

        }
    }

    private static boolean lIlIIIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlllIIlIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlllIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlllIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingPiratesTreasureTask(SquireQuesterConfig squireQuesterConfig) {
        this.aN = lIIIlllIIIIlI[0];
        this.aO = lIIIlllIIIIlI[0];
        this.aP = lIIIlllIIIIlI[0];
        this.aQ = lIIIlllIIIIlI[0];
        this.aR = lIIIlllIIIIlI[0];
        this.aM = squireQuesterConfig;
    }

    private static boolean lIlIIIlllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private void bv() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0]));

            if (((0x9F ^ 0xA8) & ~(0x75 ^ 0x42)) < ((0xAD ^ 0xA3) & ~(0x75 ^ 0x7B))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[66]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        String string = chatMessage.getMessage();
        if (v.lIlIIIlllIIIlll(string.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[80]]) ? 1 : 0)) {
            this.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(var15.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[81]]) ? 1 : 0)) {
            var16.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(var15.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[82]]) ? 1 : 0)) {
            var16.aR = lIIIlllIIIIlI[2];
        }
    }

    private void bn() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            if (v.lIlIIIlllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIIIlllIIIIlI[2]);

                return;
            }
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[25])) {
            v var17;
            DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[24]];
            dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.PLAYER_CONTINUE;
            var17.a(lIIIlllIIIIlI[26], new WorldPoint(lIIIlllIIIIlI[27], lIIIlllIIIIlI[28], lIIIlllIIIIlI[0]), dialogOptionArray);
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            if (v.lIlIIIlllIIIlII(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIlllIIIIlI[2]];
                nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[30];
                TileItem var18 = TileItems.getNearest((int[])nArray4);
                if (v.lIlIIIlllIIlIII(var18) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
                    System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[18]]);
                    var18.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[19]]);

                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[31], lIIIlllIIIIlI[32], lIIIlllIIIIlI[0]));

                }
                return;
            }
        }
        int[] nArray5 = new int[lIIIlllIIIIlI[2]];
        nArray5[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[lIIIlllIIIIlI[2]];
            nArray6[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            System.out.println(Equipment.contains((int[])nArray6));
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[1]]);
            int[] nArray7 = new int[lIIIlllIIIIlI[2]];
            nArray7[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[33];
            TileObject var18 = TileObjects.getNearest((int[])nArray7);
            if (v.lIlIIIlllIIlIII(var18) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
                var18.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[20]]);

                if (((0x91 ^ 0x95) & ~(0x33 ^ 0x37)) <= -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[34], lIIIlllIIIIlI[35], lIIIlllIIIIlI[0]));

            }
        }
        int[] nArray8 = new int[lIIIlllIIIIlI[2]];
        nArray8[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIIlllIIIIlI[2]];
            nArray9[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            Inventory.getFirst((int[])nArray9).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[21]]);
            return;
        }
    }

    private static boolean lIlIIIlllIIIllI(int n2) {
        return n2 > 0;
    }

    private void bm() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void bp() {
        v var19;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var19.aN ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIII(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]))) {
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[23]]) ? 1 : 0)) {
                var19.aP = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[24]]);
            }
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[17]]) ? 1 : 0)) {
                var19.aQ = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[40]]);
            }
        }
        if (v.lIlIIIlllIIIlll(var19.aQ ? 1 : 0) && v.lIlIIIlllIIIlll(var19.aP ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[41];
        TileObject var20 = TileObjects.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(var20) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlllIIIIlI[2]];
            nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIlllIIIIlI[2]];
                nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
                Inventory.getFirst((int[])nArray3).useOn(var20);
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[42]]);
                return;
            }
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIIlll(var19.aP ? 1 : 0)) {
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[44]]);
                var20.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[45]]);
            }
        }
    }

    private void bu() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0]));

            if ((0xC1 ^ 0xB2 ^ (0x55 ^ 0x22)) > (0x99 ^ 0x81 ^ (0xAE ^ 0xB2))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[63]]);
        }
    }

    private void bw() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0]));

            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[69]]);
        }
    }
}

