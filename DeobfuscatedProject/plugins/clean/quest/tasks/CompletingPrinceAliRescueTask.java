/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Item
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
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
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
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Prince Ali Rescue", register=true)
public class CompletingPrinceAliRescueTask
extends Task {
     Item bd;
     Item bm;
    
     Item bf;
     Item bj;
     Item bb;
     Item bk;
     Item aW;
    private final  SquireQuesterConfig aS;
     Item ba;
     Item bg;
     Item be;
     Item bl;
     Item aX;
     Item aV;
    private final  SquireQuester aT;
    
     Item aU;
     Item bh;
     Item bi;
     Item aZ;
     Item bc;
     Item bn;
     Item aY;

    private boolean bN() {
        w var1;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[27]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[28]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[29]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[30]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[31]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[32]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[73]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[33]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.a(lIIIllIIlIlll[74], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[21]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var1.d(lIIIllIIlIlll[35]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[48]]);
            return lIIIllIIlIlll[0];
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (w.lIlIIIlIIIIIIII(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[76])) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[49]]);
            return lIIIllIIlIlll[0];
        }
        return lIIIllIIlIlll[6];
    }

    private void bW() {
        w var2;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var2.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[134]]);
        if (w.lIlIIIIlllllllI(var2.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[135];
            TileObject var3 = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(var3) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                var3.interact(lIIIllIIIllIl[lIIIllIIlIlll[136]]);

                if (((0x21 ^ 0x74 ^ (0xCB ^ 0x88)) & (0x82 ^ 0xB5 ^ (0x98 ^ 0xB9) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[137], lIIIllIIlIlll[138], lIIIllIIlIlll[0]));

                return;
            }
        }
    }

    private void bO() {
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[73]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[74];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[74];
            if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)lIIIllIIlIlll[0], (int[])nArray2), lIIIllIIlIlll[12])) {
                return;
            }
        }
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[77];
        NPC var4 = NPCs.getNearest((int[])nArray3);
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIIIllIIlIlll[6]);
            }
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[13]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (w.lIlIIIIllllllll(var4) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            var4.interact(lIIIllIIIllIl[lIIIllIIlIlll[50]]);

            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[78], lIIIllIIlIlll[79], lIIIllIIlIlll[0]));

        }
    }

    private void bJ() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[23]]);
                int[] nArray3 = new int[lIIIllIIlIlll[6]];
                nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
                int[] nArray4 = new int[lIIIllIIlIlll[6]];
                nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
                Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
            }
        }
    }

    private static boolean lIlIIIIlllllllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void ca() {
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            void var5;
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[166]];
            List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[106], lIIIllIIlIlll[11]), (String[])stringArray);
            if (w.lIlIIIIlllllllI(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));

                return;
            }
            if (w.lIlIIIIllllllII(var5.size(), lIIIllIIlIlll[6])) {
                if (w.lIlIIIIlllllIlI(Reachable.isInteractable((Locatable)((Locatable)var5.get(lIIIllIIlIlll[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));

                    return;
                }
                ((TileObject)var5.get(lIIIllIIlIlll[0])).interact(lIIIllIIIllIl[lIIIllIIlIlll[168]]);
            }
            return;
        }
    }

    private void R() {
        if (w.lIlIIIIlllllllI(this.bA() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[10]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIlIlll[7], new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    private void bF() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[38];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[11]]);
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIllIIlIlll[40], new WorldPoint(lIIIllIIlIlll[41], lIIIllIIlIlll[42], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    private void bC() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[18];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[16];
        TileObject var6 = TileObjects.getNearest((int[])nArray2);
        if (w.lIlIIIIllllllll(var6) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
            Inventory.getFirst((int[])nArray3).useOn(var6);

            if (1 < 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var6.getWorldLocation());

        }
    }

    private void bY() {
        w var7;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var7.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var7.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[152]]);
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[153];
            TileObject var8 = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(var8) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                var8.interact(lIIIllIIIllIl[lIIIllIIlIlll[154]]);

            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[155], lIIIllIIlIlll[156], lIIIllIIlIlll[0]));

            }
        }
    }

    private void bS() {
        w var9;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (w.lIlIIIlIIIIIIII(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[76]) && w.lIlIIIIlllllllI(var9.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var9.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[102]]);
        if (w.lIlIIIIlllllllI(var9.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(var9.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                var9.ca();
                return;
            }
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
            if (w.lIlIIIIlllllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                Bank.withdraw((int)lIIIllIIlIlll[103], (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[104]]);
        }
        if (w.lIlIIIIlllllllI(var9.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var9.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
            TileObject var10 = TileObjects.getNearest((int[])nArray3);
            if (w.lIlIIIIllllllll(var10) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIIlIlll[6]];
                nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                Inventory.getFirst((int[])nArray4).useOn(var10);

                if ((71 + 35 - 56 + 92 ^ 27 + 118 - 27 + 20) <= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));

                return;
            }
            return;
        }
    }

    private void N() {
        this.bZ();
        this.bX();
        this.bY();
        this.bW();
        this.bV();
        this.bU();
        this.bT();
        this.bS();
        this.U();
        this.bP();
        this.bQ();
        this.bO();
    }

    private void bB() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[18];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIlllllIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIllIIlIlll[18], new WorldPoint(lIIIllIIlIlll[19], lIIIllIIlIlll[20], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    @Inject
    public CompletingPrinceAliRescueTask(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester) {
        this.aS = squireQuesterConfig;
        this.aT = squireQuester;
    }

    private void bX() {
        NPC var11;
        w var12;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var12.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[139]]);
        if (w.lIlIIIIlllllllI(var12.d(lIIIllIIlIlll[140]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                var12.ca();
                return;
            }
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[140];
            if (w.lIlIIIIlllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIIIllIIlIlll[140], (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[141]]);
        }
        if (w.lIlIIIIlllllIlI(var12.d(lIIIllIIlIlll[140]) ? 1 : 0) && w.lIlIIIlIIIIIIII(var12.cb(), lIIIllIIlIlll[12])) {
            var11 = NPCs.getNearest(nPC -> {
                int n2;
                if (w.lIlIIIIlllllllI(nPC.getName().equals(lIIIllIIIllIl[lIIIllIIlIlll[173]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIlIlll[6]];
                    stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[174]];
                    if (w.lIlIIIIlllllllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIIllIIlIlll[6];

                        if (((0xCF ^ 0x80) & ~(0x7C ^ 0x33)) > -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIIllIIlIlll[0];
                return n2 != 0;
            });
            if (w.lIlIIIIllllllll(var11) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0) && w.lIlIIIIlllllIll(var11.getId(), lIIIllIIlIlll[142])) {
                var11.interact(lIIIllIIIllIl[lIIIllIIlIlll[143]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[144], lIIIllIIlIlll[145], lIIIllIIlIlll[0]));

        }
        if (w.lIlIIIIllllllII(var12.cb(), lIIIllIIlIlll[12])) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[146];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                if (w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[147])) {
                    return;
                }
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[148]];
                var11 = TileObjects.getNearest((String[])stringArray);
                if (w.lIlIIIIllllllll(var11) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
                    if (w.lIlIIIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                        var11.interact(lIIIllIIIllIl[lIIIllIIlIlll[149]]);
                    }
                    Production.chooseOption((String)lIIIllIIIllIl[lIIIllIIlIlll[150]]);
                    return;
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[151], lIIIllIIlIlll[85], lIIIllIIlIlll[6]));

                return;
            }
        }
    }

    private void bR() {
        w var13;
        if (w.lIlIIIIlllllIlI(this.aT.a() ? 1 : 0)) {
            this.a(lIIIllIIlIlll[86], new WorldPoint(lIIIllIIlIlll[87], lIIIllIIlIlll[88], lIIIllIIlIlll[0]), lIIIllIIIllIl[lIIIllIIlIlll[56]], lIIIllIIIllIl[lIIIllIIlIlll[47]]);
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[83];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[86];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[89]];
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lIIIllIIlIlll[6]];
                    stringArray2[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[90]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIllIIIllIl[lIIIllIIlIlll[91]]);

                    if (3 < 2) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[92], lIIIllIIlIlll[93], lIIIllIIlIlll[11]));

                    return;
                }
            }
        }
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[83];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIIlIlll[6]];
            nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[86];
            if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[94]];
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray)) && w.lIlIIIIlllllIlI(var13.aT.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIIlIlll[6]];
                    stringArray3[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[95]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIllIIIllIl[lIIIllIIlIlll[96]]);
                }
            }
        }
        if (w.lIlIIIIlllllllI(var13.aT.a() ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[72];
            if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[97]];
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[98]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIllIIIllIl[lIIIllIIlIlll[99]]);

                    if (2 == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[100], lIIIllIIlIlll[101], lIIIllIIlIlll[0]));

                    return;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void bM() {
        void var14;
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[43];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        if (w.lIlIIIIllllllll(var14) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            var14.interact(lIIIllIIIllIl[lIIIllIIlIlll[25]]);

            if ((0x13 ^ 0x17) <= 3) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]));

        }
    }

    private void bZ() {
        w var15;
        if (w.lIlIIIIlllllIlI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[172]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[158];
                    TileObject var16 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var16) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        var16.interact(lIIIllIIIllIl[lIIIllIIlIlll[159]]);
                        var15.sleep(lIIIllIIlIlll[12]);

                        if (-1 > 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[160], lIIIllIIlIlll[161], lIIIllIIlIlll[0]));

                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(var15.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    if (w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
                        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                            var15.ca();
                            return;
                        }
                        int[] nArray = new int[lIIIllIIlIlll[6]];
                        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        if (w.lIlIIIIlllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            Bank.withdraw((int)lIIIllIIlIlll[103], (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            return;
                        }
                        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[162]]);
                    }
                    if (w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var15.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                        int[] nArray = new int[lIIIllIIlIlll[6]];
                        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
                        TileObject var16 = TileObjects.getNearest((int[])nArray);
                        if (w.lIlIIIIllllllll(var16) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIllIIlIlll[6]];
                            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                            Inventory.getFirst((int[])nArray2).useOn(var16);

                            if (3 < 3) {
                                return;
                            }
                        } else {
                            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));

                        }
                        return;
                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    var15.ca();
                    return;
                }
                if (w.lIlIIIIlllllllI(Bank.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[171]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[170]]), (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[163]]);
            }
            if (w.lIlIIIIlllllIlI(var15.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllllI(var15.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[164]]);
                int[] nArray = new int[lIIIllIIlIlll[6]];
                nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[71];
                int[] nArray3 = new int[lIIIllIIlIlll[6]];
                nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
                var15.sleepWhile(lIIIllIIlIlll[14], () -> {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                    return Inventory.contains((int[])nArray);
                });
            }
            return;
        }
    }

    private void bE() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
            this.a(lIIIllIIlIlll[15], new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]), dialogOptionArray);
        }
    }

    private boolean bA() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[15];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIllllllll(nPC) && w.lIlIIIIlllllIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[16];
            TileObject tileObject = TileObjects.getNearest((int[])nArray2);
            if (w.lIlIIIIllllllll(tileObject) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllIIlIlll[6]];
                nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
                Inventory.getFirst((int[])nArray3).useOn(tileObject);
            }
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[0]]);
            return lIIIllIIlIlll[6];
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[6]]);
        return lIIIllIIlIlll[0];
    }

    private void bP() {
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[35];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[64];
        NPC var17 = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[35]);
        }
        if (w.lIlIIIIllllllll(var17) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var17) ? 1 : 0)) {
            var17.interact(lIIIllIIIllIl[lIIIllIIlIlll[51]]);

            if ((72 + 14 - -87 + 11 ^ 36 + 152 - 88 + 88) < 1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]));

        }
    }

        return String.valueOf(var18);
    }

    private void U() {
        w var19;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var19.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var19.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var19.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var19.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[53]]);
        if (w.lIlIIIIlllllllI(var19.d(lIIIllIIlIlll[83]) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[54]];
            TileItem var20 = TileItems.getNearest((String[])stringArray);
            if (w.lIlIIIIllllllll(var20) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
                var20.interact(lIIIllIIIllIl[lIIIllIIlIlll[55]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[84], lIIIllIIlIlll[85], lIIIllIIlIlll[0]));

            return;
        }
        this.bR();
    }

    private static boolean lIlIIIlIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.lIlIIIIlllllIIl();
        w.lIlIIIIlllllIII();
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint, String string, String string2) {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = n2;
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = string;
            if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIllIIlIlll[6]];
                stringArray2[w.lIIIllIIlIlll[0]] = string;
                if (w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray2)) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIIlIlll[6]];
                    stringArray3[w.lIIIllIIlIlll[0]] = string;
                    TileObjects.getNearest((String[])stringArray3).interact(string2);

                    if (((9 + 10 - -170 + 28 ^ 126 + 101 - 198 + 104) & (1 ^ 0x6E ^ (0xBC ^ 0x8F) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    void var21;
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = var21;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());

                    if ((88 + 37 - 54 + 85 ^ 47 + 119 - 63 + 49) <= 2) {
                        return;
                    }
                }
            } else {
                void var22;
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[169]]);
                Walker.walkTo((WorldPoint)var22);

            }
        }
    }

    public boolean run() {
        w var23;
        if (w.lIlIIIIlllllIlI(this.aS.quest().equals((Object)h.PRINCE_ALI_RESCUE) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        int var24 = var23.Q();
        if (!w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[1]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[2]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[3]) || w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[4])) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIllllllIl(var24, lIIIllIIlIlll[5])) {
            return lIIIllIIlIlll[0];
        }
        System.out.println("[PRINCE_ALI_RESCUE] - Progress: " + var24);
        switch (var24) {
            case 0: {
                var23.N();
                var23.sleep(lIIIllIIlIlll[6]);
                var23.M();

                if (2 <= 3) break;
                return ((0xC ^ 0x22 ^ (0x7D ^ 0x30)) & (0xCB ^ 0xA8 ^ (8 ^ 0x5F) & ~(0xF3 ^ 0xA4) ^ -1)) != 0;
            }
            case 10: {
                var23.bM();

                if (-(0x26 ^ 0x38 ^ (0x35 ^ 0x2F)) < 0) break;
                return ((59 + 56 - -54 + 18 ^ 80 + 56 - 54 + 92) & (0x47 ^ 0x3C ^ (0xAF ^ 0xC1) ^ -1)) != 0;
            }
            case 20: {
                var23.bL();
                var23.bK();
                var23.bJ();
                var23.bI();
                var23.bH();
                var23.bG();
                var23.bF();

                if (-(0x30 ^ 0x35) < 0) break;
                return false;
            }
            case 30: {
                var23.bE();

                if (null == null) break;
                return ((0xC9 ^ 0xB4 ^ (0x5E ^ 0x1A)) & (0x77 ^ 0x10 ^ (0x4B ^ 0x15) ^ -1)) != 0;
            }
            case 31: {
                var23.bE();

                if (3 != 0) break;
                return ((0x4F ^ 0x2C ^ (0x40 ^ 0x16)) & (101 + 23 - 42 + 49 ^ 14 + 54 - -62 + 52 ^ -1)) != 0;
            }
            case 40: {
                var23.bD();

                if ((0xB6 ^ 0xB3) > 0) break;
                return false;
            }
            case 50: {
                var23.bC();
                var23.bB();

                if (1 == 1) break;
                return false;
            }
            case 100: {
                var23.R();

                if ((140 + 132 - 142 + 55 ^ 178 + 127 - 188 + 71) > 0) break;
                return false;
            }
            default: {
                return lIIIllIIlIlll[0];
            }
        }
        return lIIIllIIlIlll[6];
    }

    private void bL() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.QUEST;
        dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIllIIlIlll[64], new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    private int cb() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[146];
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[68];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    private boolean d(int n2) {
        boolean bl;
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = n2;
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            bl = lIIIllIIlIlll[6];

            }
        } else {
            bl = lIIIllIIlIlll[0];
        }
        return bl;
    }

    private void bG() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIllIIlIlll[43], new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PRINCE_ALI_RESCUE.c());
    }

    private void bV() {
        w var25;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var25.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[121]]);
        if (w.lIlIIIIlllllllI(var25.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[177]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(var25.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[123];
                    TileObject var26 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var26) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        var26.interact(lIIIllIIIllIl[lIIIllIIlIlll[124]]);
                        var25.sleep(lIIIllIIlIlll[12]);

                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));

                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllllI(var25.d(lIIIllIIlIlll[127]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[128];
                    TileObject var26 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var26) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
                        var26.interact(lIIIllIIIllIl[lIIIllIIlIlll[129]]);
                        var25.sleep(lIIIllIIlIlll[12]);

                        if (-1 >= (0x84 ^ 0x80)) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));

                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(var25.d(lIIIllIIlIlll[127]) ? 1 : 0) && w.lIlIIIIlllllIlI(var25.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[130];
                    TileObject var26 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var26) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllIIlIlll[6]];
                        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        Inventory.getFirst((int[])nArray2).useOn(var26);

                        if (1 != 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[131], lIIIllIIlIlll[132], lIIIllIIlIlll[0]));

                        return;
                    }
                    int[] nArray3 = new int[lIIIllIIlIlll[6]];
                    nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[122];
                    Inventory.getFirst((int[])nArray3).useOn(var26);

                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    var25.ca();
                    return;
                }
                if (w.lIlIIIIlllllllI(Bank.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[176]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[175]]), (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[133]]);
            }
            return;
        }
    }

    private static boolean lIlIIIIllllllll(Object object) {
        return object != null;
    }

    private void bD() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[34];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIllllllll(nPC) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[35];
            Inventory.getFirst((int[])nArray2).useOn((Actor)nPC);

            if (((0x7B ^ 0x43) & ~(0xF8 ^ 0xC0)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]));

        }
    }

    private static boolean lIlIIIlIIIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, boolean bl) {
        void var27;
        void var28;
        void var29;
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = n2;
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIIIllIIlIlll[6];
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = var29;
        if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)var28, (int[])nArray2), (int)var27)) {
            return lIIIllIIlIlll[0];
        }
        return lIIIllIIlIlll[6];
    }

    private void M() {
        if (w.lIlIIIIlllllIlI(this.bN() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[7];
        NPC var30 = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIIIllIIlIlll[6]);
            }
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[10]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        if (w.lIlIIIIllllllll(var30) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
            var30.interact(lIIIllIIIllIl[lIIIllIIlIlll[26]]);

            if ((0x3A ^ 0x3E) == 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]));

        }
    }

    private void bK() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[11]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[24]]);
        int[] nArray4 = new int[lIIIllIIlIlll[6]];
        nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[58];
        NPC var31 = NPCs.getNearest((int[])nArray4);
        if (w.lIlIIIIllllllll(var31) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var31) ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIIIllIIlIlll[6]];
                nArray6[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
                Inventory.getFirst((int[])nArray6).useOn((Actor)var31);

                if (1 != 1) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));

        }
    }

    private static boolean lIlIIIIlllllIll(int n2, int n3) {
        return n2 != n3;
    }

    private void bH() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[38];
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[46];
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[47]];
        dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[26]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[w.lIIIllIIlIlll[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[30]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[33]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[48]] = DialogOption.QUEST;
        dialogOptionArray[w.lIIIllIIlIlll[49]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[50]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.lIIIllIIlIlll[51]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[52]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[53]] = DialogOption.QUEST;
        dialogOptionArray[w.lIIIllIIlIlll[54]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[55]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.lIIIllIIlIlll[56]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIllIIlIlll[34], new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]), dialogOptionArray);
    }

    private void bU() {
        w var32;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var32.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[111]]);
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[70];
        TileItem var33 = TileItems.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[112];
        TileItem var34 = TileItems.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[113];
        TileObject var35 = TileObjects.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(var33)) {
            var33.interact(lIIIllIIIllIl[lIIIllIIlIlll[114]]);
            return;
        }
        if (w.lIlIIIIllllllll(var35)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[115]]);
            var32.sleep(lIIIllIIlIlll[14]);
        }
        int[] nArray4 = new int[lIIIllIIlIlll[6]];
        nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            if (w.lIlIIIIllllllll(var34) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var34) ? 1 : 0) && w.lIlIIIlIIIIIIIl(var35)) {
                var34.interact(lIIIllIIIllIl[lIIIllIIlIlll[117]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[118], lIIIllIIlIlll[119], lIIIllIIlIlll[11]));

            return;
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            var32.ca();
            return;
        }
        int[] nArray5 = new int[lIIIllIIlIlll[6]];
        nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
        if (w.lIlIIIIlllllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            Bank.withdraw((int)lIIIllIIlIlll[116], (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[120]]);
    }

    private static void lIlIIIIlllllIII() {
        lIIIllIIIllIl = new String[lIIIllIIlIlll[16]];
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[0]] = "Leaving cell";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[6]] = "Out of cell";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[11]] = "Returning false";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[12]] = "Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[13]] = "Walking to NPC";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[14]] = "making paste";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[10]] = "Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[22]] = "Talking to aggie2";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[23]] = "Making wig";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[24]] = "Talking to aggie";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[25]] = "Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[26]] = "Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[27]] = "We are missing BALL_OF_WOOL";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[28]] = "We are missing REDBERRIES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[29]] = "We are missing ASHES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[30]] = "We are missing BUCKET_OF_WATER";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[31]] = "We are missing POT_OF_FLOUR";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[32]] = "We are missing BRONZE_BAR";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[33]] = "We are missing PINK_SKIRT";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[21]] = "We are missing BEERs";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[48]] = "We are missing ROPE";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[49]] = "We are missing COINS";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[50]] = "Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[51]] = "Trade";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[52]] = "Trade";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[53]] = "Collecting POT OF FLOUR.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[54]] = "Pot";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[55]] = "Take";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[56]] = "Wheat";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[47]] = "Pick";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[89]] = "Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[90]] = "Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[91]] = "Fill";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[94]] = "Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[95]] = "Hopper controls";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[96]] = "Operate";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[97]] = "Flour bin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[98]] = "Flour bin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[99]] = "Empty";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[102]] = "Collecting BUCKET OF WATER.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[104]] = "You are going to need a bucket for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[109]] = "Collecting COINS.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[110]] = "You are going to need at least 5,000 coins for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[111]] = "Collecting ASHES.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[114]] = "Take";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[115]] = "Waiting for fire to burn";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[117]] = "Light";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[120]] = "You are going to need a tinderbox for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[121]] = "Collecting BRONZE_BARs.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[124]] = "Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[129]] = "Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[133]] = "You are going to need a pickaxe for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[134]] = "Collecting ONIONs.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[136]] = "Pick";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[139]] = "Collecting BALL_OF_WOOL";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[141]] = "You are going to need a shears for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[143]] = "Shear";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[148]] = "Spinning wheel";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[149]] = "Spin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[150]] = "Ball of Wool";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[152]] = "Collecting REDBERRIES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[154]] = "Pick-from";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[159]] = "Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[162]] = "You are going to need a bucket for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[163]] = "You are going to need a pickaxe for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[164]] = "MAKING SOFT CLAY";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[166]] = "Bank booth";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[168]] = "Bank";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[169]] = "Walking to location";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[170]] = "pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[171]] = "pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[172]] = "pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[173]] = "Sheep";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[174]] = "Shear";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[175]] = "pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[176]] = "pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[177]] = "pickaxe";
    }

    private static boolean lIlIIIIlllllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var36;
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = var36;
        NPC var37 = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIllllllll(var37) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var37) ? 1 : 0)) {
            var37.interact(lIIIllIIIllIl[lIIIllIIlIlll[12]]);

        } else {
            void var38;
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[13]]);
            Walker.walkTo((WorldPoint)var38);

        }
    }

    private void bI() {
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[46];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[14]]);
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIlll[26]];
            dialogOptionArray[w.lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[w.lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[13]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[22]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[24]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[w.lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[58];
        NPC var39 = NPCs.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(var39) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var39) ? 1 : 0)) {
            var39.interact(lIIIllIIIllIl[lIIIllIIlIlll[10]]);

            if (-(161 + 82 - 189 + 115 ^ 36 + 94 - 51 + 94) >= 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[22]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));

        }
    }

    private static boolean lIlIIIIllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private void bT() {
        w var40;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var40.d(lIIIllIIlIlll[75]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[108])) {
                return;
            }
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            var40.ca();
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[109]]);
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (w.lIlIIIIlllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIlIlll[6]];
            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (w.lIlIIIIllllllIl(Bank.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray2), lIIIllIIlIlll[108])) {
                Bank.withdraw((int)lIIIllIIlIlll[75], (int)lIIIllIIlIlll[108], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[110]]);
    }

    private void bQ() {
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[35]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[73];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[80];
        NPC var41 = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[73]);
        }
        if (w.lIlIIIIllllllll(var41) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
            var41.interact(lIIIllIIIllIl[lIIIllIIlIlll[52]]);

        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[81], lIIIllIIlIlll[82], lIIIllIIlIlll[0]));

            return;
        }
    }

    private static boolean lIlIIIIllllllII(int n2, int n3) {
        return n2 == n3;
    }
}

