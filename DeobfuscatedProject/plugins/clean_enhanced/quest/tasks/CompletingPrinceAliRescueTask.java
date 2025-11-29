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
import java.util.List;
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
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

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
        w var3;
        if (w.var4(this.d(var2[67]) ? 1 : 0)) {
            return var2[0];
        }
        if (w.var4(var3.a(var2[68], var2[12], var2[0]) ? 1 : 0)) {
            System.out.println(var1[var2[27]]);
            return var2[0];
        }
        if (w.var4(var3.a(var2[63], var2[11], var2[0]) ? 1 : 0)) {
            return var2[0];
        }
        if (w.var4(var3.d(var2[69]) ? 1 : 0)) {
            System.out.println(var1[var2[28]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[70]) ? 1 : 0)) {
            System.out.println(var1[var2[29]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[71]) ? 1 : 0)) {
            System.out.println(var1[var2[30]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[72]) ? 1 : 0)) {
            System.out.println(var1[var2[31]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[38]) ? 1 : 0)) {
            System.out.println(var1[var2[32]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[73]) ? 1 : 0)) {
            System.out.println(var1[var2[33]]);
            return var2[0];
        }
        if (w.var4(var3.a(var2[74], var2[12], var2[0]) ? 1 : 0)) {
            System.out.println(var1[var2[21]]);
            return var2[0];
        }
        if (w.var4(var3.d(var2[35]) ? 1 : 0)) {
            System.out.println(var1[var2[48]]);
            return var2[0];
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[75];
        if (w.var5(Inventory.getCount((boolean)var2[6], (int[])nArray), var2[76])) {
            System.out.println(var1[var2[49]]);
            return var2[0];
        }
        return var2[6];
    }

    private void bW() {
        w var6;
        if (w.var4(this.d(var2[69]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var6.a(var2[63], var2[11], var2[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[134]]);
        if (w.var4(var6.a(var2[63], var2[11], var2[0]) ? 1 : 0)) {
            int[] nArray = new int[var2[6]];
            nArray[w.var2[0]] = var2[135];
            TileObject var8 = TileObjects.getNearest((int[])nArray);
            if (w.var9(var8) && w.var4(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                var8.interact(var1[var2[136]]);
                0;
                if (((0x21 ^ 0x74 ^ (0xCB ^ 0x88)) & (0x82 ^ 0xB5 ^ (0x98 ^ 0xB9) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[137], var2[138], var2[0]));
                0;
                return;
            }
        }
    }

    private void bO() {
        if (w.var4(this.d(var2[73]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[74];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[74];
            if (w.var10(Inventory.getCount((boolean)var2[0], (int[])nArray2), var2[12])) {
                return;
            }
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[77];
        NPC var11 = NPCs.getNearest((int[])nArray3);
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            if (w.var4(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)var2[6]);
            }
            DialogOption[] dialogOptionArray = new DialogOption[var2[13]];
            dialogOptionArray[w.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (w.var9(var11) && w.var4(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
            var11.interact(var1[var2[50]]);
            0;
            if null != null {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[78], var2[79], var2[0]));
            0;
        }
    }

    private void bJ() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[61];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[62];
            if (w.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(var1[var2[23]]);
                int[] nArray3 = new int[var2[6]];
                nArray3[w.var2[0]] = var2[61];
                int[] nArray4 = new int[var2[6]];
                nArray4[w.var2[0]] = var2[62];
                Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
            }
        }
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void ca() {
        if (w.var7(Bank.isOpen() ? 1 : 0)) {
            void var12;
            String[] stringArray = new String[var2[6]];
            stringArray[w.var2[0]] = var1[var2[166]];
            List list = TileObjects.getAt((WorldPoint)new WorldPoint(var2[165], var2[106], var2[11]), (String[])stringArray);
            if (w.var4(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[165], var2[167], var2[11]));
                0;
                return;
            }
            if (w.var13(var12.size(), var2[6])) {
                if (w.var7(Reachable.isInteractable((Locatable)((Locatable)var12.get(var2[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[165], var2[167], var2[11]));
                    0;
                    return;
                }
                ((TileObject)var12.get(var2[0])).interact(var1[var2[168]]);
            }
            return;
        }
    }

    private void R() {
        if (w.var4(this.bA() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[10]];
        dialogOptionArray[w.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.var2[14]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[7], new WorldPoint(var2[8], var2[9], var2[0]), dialogOptionArray);
    }

    private void bF() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[38];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[39];
        if (w.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(var1[var2[11]]);
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
        dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
        this.a(var2[40], new WorldPoint(var2[41], var2[42], var2[0]), dialogOptionArray);
    }

    private void bC() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[18];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.var4(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[16];
        TileObject var14 = TileObjects.getNearest((int[])nArray2);
        if (w.var9(var14) && w.var4(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            int[] nArray3 = new int[var2[6]];
            nArray3[w.var2[0]] = var2[17];
            Inventory.getFirst((int[])nArray3).useOn(var14);
            0;
            if (1 < 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var14.getWorldLocation());
            0;
        }
    }

    private void bY() {
        w var15;
        if (w.var4(this.a(var2[68], var2[12], var2[0]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var15.d(var2[69]) ? 1 : 0)) {
            return;
        }
        if (w.var4(var15.d(var2[69]) ? 1 : 0)) {
            System.out.println(var1[var2[152]]);
            int[] nArray = new int[var2[6]];
            nArray[w.var2[0]] = var2[153];
            TileObject var16 = TileObjects.getNearest((int[])nArray);
            if (w.var9(var16) && w.var4(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
                var16.interact(var1[var2[154]]);
                0;
                if (-3 >= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[155], var2[156], var2[0]));
                0;
            }
        }
    }

    private void bS() {
        w var17;
        if (w.var4(this.d(var2[70]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[75];
        if (w.var5(Inventory.getCount((boolean)var2[6], (int[])nArray), var2[76]) && w.var4(var17.d(var2[70]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var17.d(var2[71]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[102]]);
        if (w.var4(var17.d(var2[103]) ? 1 : 0) && w.var4(var17.d(var2[71]) ? 1 : 0)) {
            if (w.var7(Bank.isOpen() ? 1 : 0)) {
                var17.ca();
                return;
            }
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[103];
            if (w.var4(Bank.contains((int[])nArray2) ? 1 : 0)) {
                Bank.withdraw((int)var2[103], (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(var1[var2[104]]);
        }
        if (w.var4(var17.d(var2[71]) ? 1 : 0) && w.var7(var17.d(var2[103]) ? 1 : 0)) {
            int[] nArray3 = new int[var2[6]];
            nArray3[w.var2[0]] = var2[105];
            TileObject var18 = TileObjects.getNearest((int[])nArray3);
            if (w.var9(var18) && w.var4(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
                int[] nArray4 = new int[var2[6]];
                nArray4[w.var2[0]] = var2[103];
                Inventory.getFirst((int[])nArray4).useOn(var18);
                0;
                if ((71 + 35 - 56 + 92 ^ 27 + 118 - 27 + 20) <= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[106], var2[107], var2[0]));
                0;
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
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[18];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.var7(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
        dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
        this.a(var2[18], new WorldPoint(var2[19], var2[20], var2[0]), dialogOptionArray);
    }

    @Inject
    public CompletingPrinceAliRescueTask(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester) {
        this.aS = squireQuesterConfig;
        this.aT = squireQuester;
    }

    private void bX() {
        NPC var19;
        w var20;
        if (w.var4(this.d(var2[67]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var20.a(var2[68], var2[12], var2[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[139]]);
        if (w.var4(var20.d(var2[140]) ? 1 : 0)) {
            if (w.var7(Bank.isOpen() ? 1 : 0)) {
                var20.ca();
                return;
            }
            int[] nArray = new int[var2[6]];
            nArray[w.var2[0]] = var2[140];
            if (w.var4(Bank.contains((int[])nArray) ? 1 : 0)) {
                Bank.withdraw((int)var2[140], (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(var1[var2[141]]);
        }
        if (w.var7(var20.d(var2[140]) ? 1 : 0) && w.var5(var20.cb(), var2[12])) {
            var19 = NPCs.getNearest(nPC -> {
                int n2;
                if (w.var4(nPC.getName().equals(var1[var2[173]]) ? 1 : 0)) {
                    String[] stringArray = new String[var2[6]];
                    stringArray[w.var2[0]] = var1[var2[174]];
                    if (w.var4(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[6];
                        0;
                        if (((0xCF ^ 0x80) & ~(0x7C ^ 0x33)) > -1) return n2 != 0;
                        return ((0x6A ^ 0x47) & ~(0x6D ^ 0x40)) != 0;
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            if (w.var9(var19) && w.var4(Reachable.isInteractable((Locatable)var19) ? 1 : 0) && w.var21(var19.getId(), var2[142])) {
                var19.interact(var1[var2[143]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var2[144], var2[145], var2[0]));
            0;
        }
        if (w.var13(var20.cb(), var2[12])) {
            int[] nArray = new int[var2[6]];
            nArray[w.var2[0]] = var2[146];
            if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (w.var4(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                if (w.var21(Players.getLocal().getAnimation(), var2[147])) {
                    return;
                }
                String[] stringArray = new String[var2[6]];
                stringArray[w.var2[0]] = var1[var2[148]];
                var19 = TileObjects.getNearest((String[])stringArray);
                if (w.var9(var19) && w.var4(Reachable.isInteractable((Locatable)var19) ? 1 : 0)) {
                    if (w.var7(Production.isOpen() ? 1 : 0)) {
                        var19.interact(var1[var2[149]]);
                    }
                    Production.chooseOption((String)var1[var2[150]]);
                    return;
                }
                Walker.walkTo((WorldPoint)new WorldPoint(var2[151], var2[85], var2[6]));
                0;
                return;
            }
        }
    }

    private void bR() {
        w var22;
        if (w.var7(this.aT.a() ? 1 : 0)) {
            this.a(var2[86], new WorldPoint(var2[87], var2[88], var2[0]), var1[var2[56]], var1[var2[47]]);
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[83];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[86];
            if (w.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                String[] stringArray = new String[var2[6]];
                stringArray[w.var2[0]] = var1[var2[89]];
                if (w.var9(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[var2[6]];
                    stringArray2[w.var2[0]] = var1[var2[90]];
                    TileObjects.getNearest((String[])stringArray2).interact(var1[var2[91]]);
                    0;
                    if (3 < 2) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[92], var2[93], var2[11]));
                    0;
                    return;
                }
            }
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[83];
        if (w.var4(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[var2[6]];
            nArray4[w.var2[0]] = var2[86];
            if (w.var7(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[var2[6]];
                stringArray[w.var2[0]] = var1[var2[94]];
                if (w.var9(TileObjects.getNearest((String[])stringArray)) && w.var7(var22.aT.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[var2[6]];
                    stringArray3[w.var2[0]] = var1[var2[95]];
                    TileObjects.getNearest((String[])stringArray3).interact(var1[var2[96]]);
                }
            }
        }
        if (w.var4(var22.aT.a() ? 1 : 0)) {
            int[] nArray5 = new int[var2[6]];
            nArray5[w.var2[0]] = var2[72];
            if (w.var7(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[var2[6]];
                stringArray[w.var2[0]] = var1[var2[97]];
                if (w.var9(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[var2[6]];
                    stringArray4[w.var2[0]] = var1[var2[98]];
                    TileObjects.getNearest((String[])stringArray4).interact(var1[var2[99]]);
                    0;
                    
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[100], var2[101], var2[0]));
                    0;
                    return;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void bM() {
        void var23;
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[43];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
            dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[13]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[14]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[10]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[23]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[24]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[26]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        if (w.var9(var23) && w.var4(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
            var23.interact(var1[var2[25]]);
            0;
            if ((0x13 ^ 0x17) <= 3) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[44], var2[45], var2[0]));
            0;
        }
    }

    private void bZ() {
        w var24;
        if (w.var7(this.d(var2[67]) ? 1 : 0)) {
            return;
        }
        if (w.var4(var24.d(var2[67]) ? 1 : 0)) {
            if (w.var4(Inventory.contains(item -> item.getName().contains(var1[var2[172]])) ? 1 : 0)) {
                if (w.var4(var24.d(var2[157]) ? 1 : 0)) {
                    int[] nArray = new int[var2[6]];
                    nArray[w.var2[0]] = var2[158];
                    TileObject var25 = TileObjects.getNearest((int[])nArray);
                    if (w.var9(var25) && w.var4(Reachable.isInteractable((Locatable)var25) ? 1 : 0)) {
                        if (w.var13(Players.getLocal().getAnimation(), var2[2])) {
                            return;
                        }
                        var25.interact(var1[var2[159]]);
                        var24.sleep(var2[12]);
                        0;
                        if (-1 > 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(var2[160], var2[161], var2[0]));
                        0;
                    }
                    return;
                }
                if (w.var7(var24.d(var2[157]) ? 1 : 0)) {
                    if (w.var4(var24.d(var2[103]) ? 1 : 0) && w.var4(var24.d(var2[71]) ? 1 : 0)) {
                        if (w.var7(Bank.isOpen() ? 1 : 0)) {
                            var24.ca();
                            return;
                        }
                        int[] nArray = new int[var2[6]];
                        nArray[w.var2[0]] = var2[103];
                        if (w.var4(Bank.contains((int[])nArray) ? 1 : 0)) {
                            Bank.withdraw((int)var2[103], (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            return;
                        }
                        System.out.println(var1[var2[162]]);
                    }
                    if (w.var4(var24.d(var2[71]) ? 1 : 0) && w.var7(var24.d(var2[103]) ? 1 : 0)) {
                        int[] nArray = new int[var2[6]];
                        nArray[w.var2[0]] = var2[105];
                        TileObject var25 = TileObjects.getNearest((int[])nArray);
                        if (w.var9(var25) && w.var4(Reachable.isInteractable((Locatable)var25) ? 1 : 0)) {
                            int[] nArray2 = new int[var2[6]];
                            nArray2[w.var2[0]] = var2[103];
                            Inventory.getFirst((int[])nArray2).useOn(var25);
                            0;
                            if (3 < 3) {
                                return;
                            }
                        } else {
                            Walker.walkTo((WorldPoint)new WorldPoint(var2[106], var2[107], var2[0]));
                            0;
                        }
                        return;
                    }
                }
            } else {
                if (w.var7(Bank.isOpen() ? 1 : 0)) {
                    var24.ca();
                    return;
                }
                if (w.var4(Bank.contains(item -> item.getName().contains(var1[var2[171]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(var1[var2[170]]), (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(var1[var2[163]]);
            }
            if (w.var7(var24.d(var2[71]) ? 1 : 0) && w.var4(var24.d(var2[103]) ? 1 : 0)) {
                System.out.println(var1[var2[164]]);
                int[] nArray = new int[var2[6]];
                nArray[w.var2[0]] = var2[71];
                int[] nArray3 = new int[var2[6]];
                nArray3[w.var2[0]] = var2[157];
                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
                var24.sleepWhile(var2[14], () -> {
                    int[] nArray = new int[var2[6]];
                    nArray[w.var2[0]] = var2[157];
                    return Inventory.contains((int[])nArray);
                });
            }
            return;
        }
    }

    private void bE() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[17];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
            dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[11]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.var2[12]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[10]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[23]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[24]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[25]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[26]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
            this.a(var2[15], new WorldPoint(var2[36], var2[37], var2[0]), dialogOptionArray);
        }
    }

    private boolean bA() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[15];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.var9(nPC) && w.var7(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[16];
            TileObject tileObject = TileObjects.getNearest((int[])nArray2);
            if (w.var9(tileObject) && w.var4(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                int[] nArray3 = new int[var2[6]];
                nArray3[w.var2[0]] = var2[17];
                Inventory.getFirst((int[])nArray3).useOn(tileObject);
            }
            System.out.println(var1[var2[0]]);
            return var2[6];
        }
        System.out.println(var1[var2[6]]);
        return var2[0];
    }

    private void bP() {
        if (w.var4(this.d(var2[72]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[35];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[64];
        NPC var26 = NPCs.getNearest((int[])nArray2);
        if (w.var4(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)var2[35]);
        }
        if (w.var9(var26) && w.var4(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
            var26.interact(var1[var2[51]]);
            0;
            if ((72 + 14 - -87 + 11 ^ 36 + 152 - 88 + 88) < 1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[65], var2[66], var2[0]));
            0;
        }
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (w.var5(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if ((0xB3 ^ 0xB6) != 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }

    private void U() {
        w var43;
        if (w.var4(this.d(var2[70]) ? 1 : 0)) {
            return;
        }
        if (w.var4(var43.d(var2[71]) ? 1 : 0) && w.var7(var43.d(var2[67]) ? 1 : 0)) {
            return;
        }
        if (w.var4(var43.d(var2[67]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var43.d(var2[72]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[53]]);
        if (w.var4(var43.d(var2[83]) ? 1 : 0)) {
            String[] stringArray = new String[var2[6]];
            stringArray[w.var2[0]] = var1[var2[54]];
            TileItem var44 = TileItems.getNearest((String[])stringArray);
            if (w.var9(var44) && w.var4(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
                var44.interact(var1[var2[55]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var2[84], var2[85], var2[0]));
            0;
            return;
        }
        this.bR();
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.var45();
        w.var46();
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint, String string, String string2) {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = n2;
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[var2[6]];
            stringArray[w.var2[0]] = string;
            if (w.var9(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var2[6]];
                stringArray2[w.var2[0]] = string;
                if (w.var4(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray2)) ? 1 : 0)) {
                    String[] stringArray3 = new String[var2[6]];
                    stringArray3[w.var2[0]] = string;
                    TileObjects.getNearest((String[])stringArray3).interact(string2);
                    0;
                    if (((9 + 10 - -170 + 28 ^ 126 + 101 - 198 + 104) & (1 ^ 0x6E ^ (0xBC ^ 0x8F) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    void var47;
                    String[] stringArray4 = new String[var2[6]];
                    stringArray4[w.var2[0]] = var47;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());
                    0;
                    0;
                    if ((88 + 37 - 54 + 85 ^ 47 + 119 - 63 + 49) <= 2) {
                        return;
                    }
                }
            } else {
                void var48;
                System.out.println(var1[var2[169]]);
                Walker.walkTo((WorldPoint)var48);
                0;
            }
        }
    }

    public boolean run() {
        w var49;
        if (w.var7(this.aS.quest().equals((Object)h.PRINCE_ALI_RESCUE) ? 1 : 0)) {
            return var2[0];
        }
        int var50 = var49.Q();
        if (!w.var21(Players.getLocal().getAnimation(), var2[1]) || !w.var21(Players.getLocal().getAnimation(), var2[2]) || !w.var21(Players.getLocal().getAnimation(), var2[3]) || w.var13(Players.getLocal().getAnimation(), var2[4])) {
            return var2[0];
        }
        if (w.var10(var50, var2[5])) {
            return var2[0];
        }
        System.out.println("[PRINCE_ALI_RESCUE] - Progress: " + var50);
        switch (var50) {
            case 0: {
                var49.N();
                var49.sleep(var2[6]);
                var49.M();
                0;
                if (2 <= 3) break;
                return ((0xC ^ 0x22 ^ (0x7D ^ 0x30)) & (0xCB ^ 0xA8 ^ (8 ^ 0x5F) & ~(0xF3 ^ 0xA4) ^ -1)) != 0;
            }
            case 10: {
                var49.bM();
                0;
                if (-(0x26 ^ 0x38 ^ (0x35 ^ 0x2F)) < 0) break;
                return ((59 + 56 - -54 + 18 ^ 80 + 56 - 54 + 92) & (0x47 ^ 0x3C ^ (0xAF ^ 0xC1) ^ -1)) != 0;
            }
            case 20: {
                var49.bL();
                var49.bK();
                var49.bJ();
                var49.bI();
                var49.bH();
                var49.bG();
                var49.bF();
                0;
                if (-(0x30 ^ 0x35) < 0) break;
                return ((0x56 ^ 0x5B) & ~(0x76 ^ 0x7B)) != 0;
            }
            case 30: {
                var49.bE();
                0;
                if null == null break;
                return ((0xC9 ^ 0xB4 ^ (0x5E ^ 0x1A)) & (0x77 ^ 0x10 ^ (0x4B ^ 0x15) ^ -1)) != 0;
            }
            case 31: {
                var49.bE();
                0;
                if (3 != 0) break;
                return ((0x4F ^ 0x2C ^ (0x40 ^ 0x16)) & (101 + 23 - 42 + 49 ^ 14 + 54 - -62 + 52 ^ -1)) != 0;
            }
            case 40: {
                var49.bD();
                0;
                if ((0xB6 ^ 0xB3) > 0) break;
                return ((0x88 ^ 0xB7) & ~(0x45 ^ 0x7A)) != 0;
            }
            case 50: {
                var49.bC();
                var49.bB();
                0;
                if (1 == 1) break;
                return ((16 + 110 - 73 + 89 ^ 171 + 190 - 321 + 151) & (46 + 166 - 52 + 30 ^ 0 + 31 - -36 + 76 ^ -1)) != 0;
            }
            case 100: {
                var49.R();
                0;
                if ((140 + 132 - 142 + 55 ^ 178 + 127 - 188 + 71) > 0) break;
                return ((86 + 52 - 99 + 139 ^ 131 + 11 - 92 + 108) & (29 + 67 - -33 + 4 ^ 137 + 73 - 180 + 139 ^ -1)) != 0;
            }
            default: {
                return var2[0];
            }
        }
        return var2[6];
    }

    private void bL() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[57];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[62];
        if (w.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
        dialogOptionArray[w.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[w.var2[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[22]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[25]] = DialogOption.QUEST;
        dialogOptionArray[w.var2[26]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[28]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
        this.a(var2[64], new WorldPoint(var2[65], var2[66], var2[0]), dialogOptionArray);
    }

    private int cb() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[146];
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[68];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    private boolean d(int n2) {
        boolean bl;
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = n2;
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            bl = var2[6];
            0;
            if null != null {
                return ((0x17 ^ 0x28) & ~(0xB4 ^ 0x8B)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private void bG() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[39];
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[21]];
        dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[33]] = DialogOption.NPC_CONTINUE;
        this.a(var2[43], new WorldPoint(var2[44], var2[45], var2[0]), dialogOptionArray);
    }

        catch (Exception var56) {
            var56.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PRINCE_ALI_RESCUE.c());
    }

    private void bV() {
        w var57;
        if (w.var4(this.a(var2[63], var2[11], var2[0]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var57.d(var2[38]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[121]]);
        if (w.var4(var57.d(var2[38]) ? 1 : 0)) {
            if (w.var4(Inventory.contains(item -> item.getName().contains(var1[var2[177]])) ? 1 : 0)) {
                if (w.var4(var57.d(var2[122]) ? 1 : 0)) {
                    int[] nArray = new int[var2[6]];
                    nArray[w.var2[0]] = var2[123];
                    TileObject var58 = TileObjects.getNearest((int[])nArray);
                    if (w.var9(var58) && w.var4(Reachable.isInteractable((Locatable)var58) ? 1 : 0)) {
                        if (w.var13(Players.getLocal().getAnimation(), var2[2])) {
                            return;
                        }
                        var58.interact(var1[var2[124]]);
                        var57.sleep(var2[12]);
                        0;
                        if null != null {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(var2[125], var2[126], var2[0]));
                        0;
                        return;
                    }
                    return;
                }
                if (w.var4(var57.d(var2[127]) ? 1 : 0)) {
                    int[] nArray = new int[var2[6]];
                    nArray[w.var2[0]] = var2[128];
                    TileObject var58 = TileObjects.getNearest((int[])nArray);
                    if (w.var9(var58) && w.var4(Reachable.isInteractable((Locatable)var58) ? 1 : 0)) {
                        var58.interact(var1[var2[129]]);
                        var57.sleep(var2[12]);
                        0;
                        if (-1 >= (0x84 ^ 0x80)) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(var2[125], var2[126], var2[0]));
                        0;
                        return;
                    }
                    return;
                }
                if (w.var7(var57.d(var2[127]) ? 1 : 0) && w.var7(var57.d(var2[122]) ? 1 : 0)) {
                    int[] nArray = new int[var2[6]];
                    nArray[w.var2[0]] = var2[130];
                    TileObject var58 = TileObjects.getNearest((int[])nArray);
                    if (w.var9(var58) && w.var4(Reachable.isInteractable((Locatable)var58) ? 1 : 0)) {
                        int[] nArray2 = new int[var2[6]];
                        nArray2[w.var2[0]] = var2[103];
                        Inventory.getFirst((int[])nArray2).useOn(var58);
                        0;
                        if (1 != 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(var2[131], var2[132], var2[0]));
                        0;
                        return;
                    }
                    int[] nArray3 = new int[var2[6]];
                    nArray3[w.var2[0]] = var2[122];
                    Inventory.getFirst((int[])nArray3).useOn(var58);
                    0;
                    if null != null {
                        return;
                    }
                }
            } else {
                if (w.var7(Bank.isOpen() ? 1 : 0)) {
                    var57.ca();
                    return;
                }
                if (w.var4(Bank.contains(item -> item.getName().contains(var1[var2[176]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(var1[var2[175]]), (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(var1[var2[133]]);
            }
            return;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private void bD() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[34];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (w.var9(nPC) && w.var4(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[35];
            Inventory.getFirst((int[])nArray2).useOn((Actor)nPC);
            0;
            if (((0x7B ^ 0x43) & ~(0xF8 ^ 0xC0)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[36], var2[37], var2[0]));
            0;
        }
    }

    private static boolean var59(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, boolean bl) {
        void var60;
        void var61;
        void var62;
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = n2;
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var2[6];
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var62;
        if (w.var10(Inventory.getCount((boolean)var61, (int[])nArray2), (int)var60)) {
            return var2[0];
        }
        return var2[6];
    }

    private void M() {
        if (w.var7(this.bN() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[7];
        NPC var63 = NPCs.getNearest((int[])nArray);
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            if (w.var4(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)var2[6]);
            }
            DialogOption[] dialogOptionArray = new DialogOption[var2[10]];
            dialogOptionArray[w.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[13]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[w.var2[14]] = DialogOption.CHAT_OPTION_ONE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        if (w.var9(var63) && w.var4(Reachable.isInteractable((Locatable)var63) ? 1 : 0)) {
            var63.interact(var1[var2[26]]);
            0;
            if ((0x3A ^ 0x3E) == 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[8], var2[9], var2[0]));
            0;
        }
    }

    private void bK() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[57];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[61];
        if (w.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[62];
        if (w.var7(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var2[11]];
            dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        System.out.println(var1[var2[24]]);
        int[] nArray4 = new int[var2[6]];
        nArray4[w.var2[0]] = var2[58];
        NPC var64 = NPCs.getNearest((int[])nArray4);
        if (w.var9(var64) && w.var4(Reachable.isInteractable((Locatable)var64) ? 1 : 0)) {
            int[] nArray5 = new int[var2[6]];
            nArray5[w.var2[0]] = var2[63];
            if (w.var4(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[var2[6]];
                nArray6[w.var2[0]] = var2[63];
                Inventory.getFirst((int[])nArray6).useOn((Actor)var64);
                0;
                if (1 != 1) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[59], var2[60], var2[0]));
            0;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private void bH() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[38];
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[46];
        if (w.var7(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[39];
        if (w.var4(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[47]];
        dialogOptionArray[w.var2[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[11]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[14]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[26]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[w.var2[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[30]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[33]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[48]] = DialogOption.QUEST;
        dialogOptionArray[w.var2[49]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.var2[50]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[w.var2[51]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[52]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[w.var2[53]] = DialogOption.QUEST;
        dialogOptionArray[w.var2[54]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[w.var2[55]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[w.var2[56]] = DialogOption.NPC_CONTINUE;
        this.a(var2[34], new WorldPoint(var2[36], var2[37], var2[0]), dialogOptionArray);
    }

    private void bU() {
        w var65;
        if (w.var4(this.d(var2[38]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var65.d(var2[70]) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[111]]);
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[70];
        TileItem var66 = TileItems.getNearest((int[])nArray);
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[112];
        TileItem var67 = TileItems.getNearest((int[])nArray2);
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[113];
        TileObject var68 = TileObjects.getNearest((int[])nArray3);
        if (w.var9(var66)) {
            var66.interact(var1[var2[114]]);
            return;
        }
        if (w.var9(var68)) {
            System.out.println(var1[var2[115]]);
            var65.sleep(var2[14]);
        }
        int[] nArray4 = new int[var2[6]];
        nArray4[w.var2[0]] = var2[116];
        if (w.var4(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            if (w.var9(var67) && w.var4(Reachable.isInteractable((Locatable)var67) ? 1 : 0) && w.var59(var68)) {
                var67.interact(var1[var2[117]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var2[118], var2[119], var2[11]));
            0;
            return;
        }
        if (w.var7(Bank.isOpen() ? 1 : 0)) {
            var65.ca();
            return;
        }
        int[] nArray5 = new int[var2[6]];
        nArray5[w.var2[0]] = var2[116];
        if (w.var4(Bank.contains((int[])nArray5) ? 1 : 0)) {
            Bank.withdraw((int)var2[116], (int)var2[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return;
        }
        System.out.println(var1[var2[120]]);
    }

    private static void var45() {
        var2 = new int[178];
        w.var2[0] = (136 + 20 - 44 + 65 ^ 107 + 83 - 159 + 114) & (7 ^ 0x3D ^ (0xBF ^ 0xA5) ^ -1);
        w.var2[1] = 0xFFFFBAF1 & 0x477F;
        w.var2[2] = 0xFFFF8A7D & 0x77F2;
        w.var2[3] = 0xFFFFEFE3 & 0x139F;
        w.var2[4] = -(0xFFFFE813 & 0x5FEF) & (0xFFFFEEFF & 0x5BDF);
        w.var2[5] = 6 ^ 0x42 ^ (0x65 ^ 0x4F);
        w.var2[6] = 1;
        w.var2[7] = -(0xFFFFB767 & 0x6AD9) & (0xFFFFFAFD & 0x37FF);
        w.var2[8] = -(0x89 ^ 0x80) & (0xFFFFFCFF & 0xFEB);
        w.var2[9] = -(0xFFFFFFA7 & 0x72FD) & (0xFFFFFEFF & Short.MAX_VALUE);
        w.var2[10] = 0x49 ^ 0x77 ^ (0xFB ^ 0xC3);
        w.var2[11] = 2;
        w.var2[12] = 3;
        w.var2[13] = 0x57 ^ 0x53;
        w.var2[14] = 0x94 ^ 0x91;
        w.var2[15] = 0xFFFFBFFB & 0x6D3D;
        w.var2[16] = 239 + 17 - 35 + 24 ^ 13 + 10 - -28 + 133;
        w.var2[17] = -(0xFFFFDD0F & 0x72FE) & (0xFFFFDB7F & 0x7DFF);
        w.var2[18] = -(0xFFFFF3C1 & 0x4EFF) & (0xFFFFFFFB & 0x6FFF);
        w.var2[19] = 0xFFFFBDFB & 0x4E37;
        w.var2[20] = 0xFFFFCDE9 & 0x3EBF;
        w.var2[21] = 0xA4 ^ 0xB7;
        w.var2[22] = 0xE ^ 9;
        w.var2[23] = 0x44 ^ 0x4C;
        w.var2[24] = 146 + 127 - 186 + 60 ^ 52 + 94 - 3 + 11;
        w.var2[25] = 0x1C ^ 0x16;
        w.var2[26] = 0x47 ^ 0x39 ^ (0x77 ^ 2);
        w.var2[27] = 0x43 ^ 0x4F;
        w.var2[28] = 0x6A ^ 0x51 ^ (0x93 ^ 0xA5);
        w.var2[29] = 0x3C ^ 0x32;
        w.var2[30] = 0xB2 ^ 0xBD;
        w.var2[31] = 0x2B ^ 0x3B;
        w.var2[32] = 98 + 102 - 57 + 37 ^ 93 + 22 - 6 + 56;
        w.var2[33] = 0x3E ^ 0x2C;
        w.var2[34] = -(0xFFFFDD5D & 0x32E7) & (0xFFFFFF7E & 0x3DFF);
        w.var2[35] = -(0xFFFFFFB7 & 0x6C4D) & (0xFFFFEFBE & Short.MAX_VALUE);
        w.var2[36] = -(0xFFFFB1DB & 0x5FEE) & (0xFFFFFDFF & 0x1FFF);
        w.var2[37] = -(0xFFFFF6F5 & 0x5B4B) & (0xFFFFFFFD & 0x5EEE);
        w.var2[38] = 0xFFFFAFAF & 0x597D;
        w.var2[39] = 0xFFFFEDF7 & 0x1B7F;
        w.var2[40] = 0xFFFF90BB & 0x7FF6;
        w.var2[41] = -(0xFFFFBB5D & 0x77F3) & (0xFFFFBF7F & 0x7FF6);
        w.var2[42] = -(0xFFFFDBA7 & 0x255B) & (0xFFFF8FBF & 0x7DFF);
        w.var2[43] = 0xFFFFDEBE & 0x31FF;
        w.var2[44] = -(0xFFFFFE17 & 0x31EC) & (0xFFFFBCDF & 0x7FFB);
        w.var2[45] = 0xFFFFBEFE & 0x4D6D;
        w.var2[46] = -(0xFFFFFF83 & 0x507F) & (0xFFFFFFFB & 0x597E);
        w.var2[47] = 0xA9 ^ 0x9D ^ (0x31 ^ 0x18);
        w.var2[48] = 0x3B ^ 0x7E ^ (0x31 ^ 0x60);
        w.var2[49] = 0x47 ^ 0x52;
        w.var2[50] = 0x50 ^ 0x46;
        w.var2[51] = 0x93 ^ 0x84;
        w.var2[52] = 29 + 79 - 22 + 94 ^ 70 + 170 - 230 + 162;
        w.var2[53] = 0x90 ^ 0x89;
        w.var2[54] = 0x60 ^ 0x7A;
        w.var2[55] = 0xB7 ^ 0x92 ^ (0x86 ^ 0xB8);
        w.var2[56] = 0x12 ^ 0xE;
        w.var2[57] = -(0xFFFFB5E7 & 0x6A99) & (0xFFFFEBFF & 0x3DF3);
        w.var2[58] = -(0xFFFFAAA7 & 0x755C) & (0xFFFFB7FF & 0x78BF);
        w.var2[59] = -(0xFFFFF177 & 0x5FF9) & (0xFFFFFDFE & 0x5F7F);
        w.var2[60] = -(0xFFFFF629 & 0x6BD7) & (0xFFFFFFBB & 0x6EFF);
        w.var2[61] = -(0xFFFFDF8B & 0x3975) & (0xFFFFFFFF & 0x1FE5);
        w.var2[62] = -(0xFFFFE5DD & 0x5EAB) & (0xFFFFFFFF & 0x4DFD);
        w.var2[63] = -(0xFFFFAE5B & 0x79AF) & (0xFFFFFFAF & 0x2FFF);
        w.var2[64] = -(0xFFFFF765 & 0xFDF) & (0xFFFFB7FF & 0x5FFC);
        w.var2[65] = 0xFFFFDF9E & 0x2C7B;
        w.var2[66] = 0xFFFFBCBE & 0x4FFB;
        w.var2[67] = 0xFFFFB7F3 & 0x4EED;
        w.var2[68] = -(0xFFFFA3AB & 0x5D55) & (0xFFFFC7FF & 0x3FDF);
        w.var2[69] = 0xFFFFA7BF & 0x5FDF;
        w.var2[70] = -(0xFFFFCFA3 & 0x3CFF) & (0xFFFFAEFA & 0x5FF7);
        w.var2[71] = -(0xFFFFD8F3 & 0x7F7F) & (0xFFFFFFFF & 0x5FFB);
        w.var2[72] = 0xFFFF97EF & 0x6F9D;
        w.var2[73] = -1 & (0xFFFFE3FF & 0x1FF5);
        w.var2[74] = -(0xFFFFFCB3 & 0x7BCD) & (0xFFFFFFFD & Short.MAX_VALUE);
        w.var2[75] = 0xFFFF8FF3 & 0x73EF;
        w.var2[76] = 0xAF ^ 0xC1 ^ (0x3E ^ 0x34);
        w.var2[77] = 0xFFFFEF23 & 0x15FC;
        w.var2[78] = 0xFFFFBCFE & 0x4F99;
        w.var2[79] = -(0xFFFFFA2B & 0x57FE) & (0xFFFFDF6F & Short.MAX_VALUE);
        w.var2[80] = -(0xFFFFDFAF & 0x6653) & (0xFFFFFEEF & 0x6FFF);
        w.var2[81] = 0xFFFFAD87 & 0x5EFE;
        w.var2[82] = -(0xFFFFFEB3 & 0x63ED) & (0xFFFFFFF7 & 0x6FFF);
        w.var2[83] = 0xFFFFAFDF & 0x57AB;
        w.var2[84] = 0xFFFFADC7 & 0x5EBF;
        w.var2[85] = 0xFFFF9D9E & 0x6EEF;
        w.var2[86] = -(0xFFFFF669 & 0x7997) & (0xFFFFF7DF & 0x7FBB);
        w.var2[87] = -(0xFFFFC3FF & 0x7C23) & (0xFFFFFFFB & 0x4C7F);
        w.var2[88] = -(0xFFFF97FF & 0x7A24) & (0xFFFFBFFF & 0x5EFF);
        w.var2[89] = 40 + 66 - 4 + 61 ^ 124 + 179 - 288 + 174;
        w.var2[90] = 0xC1 ^ 0x8C ^ (0x62 ^ 0x30);
        w.var2[91] = 0xB1 ^ 0x91;
        w.var2[92] = -(0xFFFFFDFF & 0x2282) & (0xFFFFBCDF & 0x6FFD);
        w.var2[93] = 0xFFFF8EFF & 0x7DEA;
        w.var2[94] = 0x38 ^ 0x5E ^ (0x2C ^ 0x6B);
        w.var2[95] = 0x6A ^ 0x5E ^ (0x48 ^ 0x5E);
        w.var2[96] = 0xE5 ^ 0xC6;
        w.var2[97] = 2 ^ 0x26;
        w.var2[98] = 0x6D ^ 0x19 ^ (0x18 ^ 0x49);
        w.var2[99] = 0x66 ^ 0x2F ^ (0xF0 ^ 0x9F);
        w.var2[100] = -(0xFFFFEAFB & 0x1726) & (0xFFFF9F7F & 0x6EFF);
        w.var2[101] = 0xFFFFDDE9 & 0x2EFF;
        w.var2[102] = 0xEB ^ 0x8A ^ (0x29 ^ 0x6F);
        w.var2[103] = 0xFFFF8FA5 & 0x77DF;
        w.var2[104] = 33 + 78 - 32 + 159 ^ 80 + 135 - 140 + 123;
        w.var2[105] = -(0xFFFFFD2B & 0x5ED5) & (0xFFFFDFEF & 0x7F7F);
        w.var2[106] = -(0xFFFFF7B7 & 0x6B6B) & (0xFFFFFFFF & 0x6FB7);
        w.var2[107] = -(0xFFFFF1F3 & 0x5F5F) & (0xFFFFFFDF & 0x5DFF);
        w.var2[108] = 0xFFFFBFBF & 0x53C8;
        w.var2[109] = 0x42 ^ 0x6B;
        w.var2[110] = 94 + 112 - 176 + 153 ^ 117 + 34 - 116 + 122;
        w.var2[111] = 4 ^ 0x2F;
        w.var2[112] = 0xFFFFC5EF & 0x3FF7;
        w.var2[113] = -(0xFFFF8F9F & 0x79E7) & (0xFFFFEFDF & 0x7FEF);
        w.var2[114] = 0xB8 ^ 0x94;
        w.var2[115] = 0x57 ^ 0x7A;
        w.var2[116] = 0xFFFFCA7F & 0x37CE;
        w.var2[117] = 0x25 ^ 0x76 ^ (7 ^ 0x7A);
        w.var2[118] = -(0xFFFFF27B & 0x3DEF) & (0xFFFFFEEF & 0x3DFF);
        w.var2[119] = -(0xFFFFE77D & 0x5AE7) & (0xFFFFDFFF & 0x6EFD);
        w.var2[120] = 0x7C ^ 0x53;
        w.var2[121] = 0x5E ^ 0x6E;
        w.var2[122] = 0xFFFFC3BC & 0x3DF7;
        w.var2[123] = 0xFFFFFF9F & 0x2BF9;
        w.var2[124] = 0x9E ^ 0xAF;
        w.var2[125] = 0xFFFF8F9B & 0x7CFF;
        w.var2[126] = 0xFFFF9E5B & 0x6DEF;
        w.var2[127] = 0xFFFFF9BE & 0x7F7;
        w.var2[128] = 0xFFFFEE69 & 0x3DF6;
        w.var2[129] = 158 + 104 - 259 + 182 ^ 95 + 21 - 65 + 88;
        w.var2[130] = 0xFFFFFDDF & 0x5FE9;
        w.var2[131] = -(0xFFFFBB76 & 0x66EB) & (0xFFFFAFFF & 0x7EFB);
        w.var2[132] = 0xFFFFAFFE & 0x5CB7;
        w.var2[133] = 135 + 41 - 117 + 99 ^ 45 + 40 - -9 + 79;
        w.var2[134] = 0x1B ^ 0x2F;
        w.var2[135] = -(0x71 ^ 0x2B) & (0xFFFF8FFF & 0x7D7F);
        w.var2[136] = 90 + 183 - 197 + 113 ^ 126 + 124 - 201 + 87;
        w.var2[137] = -(0xFFFFE4B7 & 0x5BCB) & (0xFFFFDDFF & 0x6EF7);
        w.var2[138] = -(0xFFFFB795 & 0x697B) & (0xFFFFFDFF & 0x2FD3);
        w.var2[139] = 64 + 50 - 44 + 95 ^ 27 + 144 - 61 + 37;
        w.var2[140] = 0xFFFF8FFF & 0x76C7;
        w.var2[141] = 0x27 ^ 0x16 ^ (0xA5 ^ 0xA3);
        w.var2[142] = -(0xFFFFFFC9 & 0x7837) & (0xFFFFFADB & Short.MAX_VALUE);
        w.var2[143] = 0xAC ^ 0x94;
        w.var2[144] = 0xFFFFBFEB & 0x4C94;
        w.var2[145] = 0xFFFF9FF5 & 0x6CCA;
        w.var2[146] = 0xFFFFE6FF & 0x1FC9;
        w.var2[147] = -1;
        w.var2[148] = 0x2C ^ 0x15;
        w.var2[149] = 0x6F ^ 0x55;
        w.var2[150] = 0x69 ^ 0x52;
        w.var2[151] = 0xFFFFDCAA & 0x2FDF;
        w.var2[152] = 150 + 83 - 217 + 140 ^ 118 + 46 - 19 + 15;
        w.var2[153] = 0xFFFFFFFF & 0x5C4C;
        w.var2[154] = 0x61 ^ 0x5C;
        w.var2[155] = 0xFFFF9FFF & 0x6CCC;
        w.var2[156] = -(0xFFFFFEF7 & 0x134B) & (0xFFFFFF6E & 0x1FFF);
        w.var2[157] = -(0xFFFFDF7F & 0x328D) & (0xFFFFB3BF & 0x5FFE);
        w.var2[158] = 0xFFFFEEFB & 0x3D66;
        w.var2[159] = 6 + 25 - -105 + 7 ^ 139 + 77 - 126 + 87;
        w.var2[160] = -(0xFFFFF53D & 0x4AD7) & (0xFFFFCC7F & Short.MAX_VALUE);
        w.var2[161] = -(0xFFFFE384 & 0x5E7F) & (0xFFFFFFAF & 0x4F7B);
        w.var2[162] = 85 + 5 - 18 + 68 ^ 57 + 108 - 54 + 68;
        w.var2[163] = 0xF ^ 0x46 ^ (0x19 ^ 0x10);
        w.var2[164] = 0x66 ^ 0x27;
        w.var2[165] = -(0xFFFFEFFD & 0x7323) & (0xFFFFEFFE & 0x7FA9);
        w.var2[166] = 63 + 170 - 57 + 71 ^ 151 + 30 - 169 + 169;
        w.var2[167] = 0xFFFFCED7 & 0x3DBA;
        w.var2[168] = 122 + 90 - 39 + 53 ^ 136 + 158 - 162 + 29;
        w.var2[169] = 0x57 ^ 0x13;
        w.var2[170] = 0x3D ^ 0x16 ^ (0x59 ^ 0x37);
        w.var2[171] = 0x5B ^ 0x1D;
        w.var2[172] = 0x8B ^ 0xC4 ^ (0xB2 ^ 0xBA);
        w.var2[173] = 220 + 215 - 374 + 172 ^ 124 + 42 - 35 + 30;
        w.var2[174] = 0x6A ^ 0x23;
        w.var2[175] = 0xE4 ^ 0xAE;
        w.var2[176] = 0xF0 ^ 0xBB;
        w.var2[177] = 0xCE ^ 0x82;
    }

    private static void var46() {
        var1 = new String[var2[16]];
        w.var1[w.var2[0]] = "Leaving cell";
        w.var1[w.var2[6]] = "Out of cell";
        w.var1[w.var2[11]] = "Returning false";
        w.var1[w.var2[12]] = "Talk-to";
        w.var1[w.var2[13]] = "Walking to NPC";
        w.var1[w.var2[14]] = "making paste";
        w.var1[w.var2[10]] = "Talk-to";
        w.var1[w.var2[22]] = "Talking to aggie2";
        w.var1[w.var2[23]] = "Making wig";
        w.var1[w.var2[24]] = "Talking to aggie";
        w.var1[w.var2[25]] = "Talk-to";
        w.var1[w.var2[26]] = "Talk-to";
        w.var1[w.var2[27]] = "We are missing BALL_OF_WOOL";
        w.var1[w.var2[28]] = "We are missing REDBERRIES";
        w.var1[w.var2[29]] = "We are missing ASHES";
        w.var1[w.var2[30]] = "We are missing BUCKET_OF_WATER";
        w.var1[w.var2[31]] = "We are missing POT_OF_FLOUR";
        w.var1[w.var2[32]] = "We are missing BRONZE_BAR";
        w.var1[w.var2[33]] = "We are missing PINK_SKIRT";
        w.var1[w.var2[21]] = "We are missing BEERs";
        w.var1[w.var2[48]] = "We are missing ROPE";
        w.var1[w.var2[49]] = "We are missing COINS";
        w.var1[w.var2[50]] = "Talk-to";
        w.var1[w.var2[51]] = "Trade";
        w.var1[w.var2[52]] = "Trade";
        w.var1[w.var2[53]] = "Collecting POT OF FLOUR.";
        w.var1[w.var2[54]] = "Pot";
        w.var1[w.var2[55]] = "Take";
        w.var1[w.var2[56]] = "Wheat";
        w.var1[w.var2[47]] = "Pick";
        w.var1[w.var2[89]] = "Hopper";
        w.var1[w.var2[90]] = "Hopper";
        w.var1[w.var2[91]] = "Fill";
        w.var1[w.var2[94]] = "Hopper";
        w.var1[w.var2[95]] = "Hopper controls";
        w.var1[w.var2[96]] = "Operate";
        w.var1[w.var2[97]] = "Flour bin";
        w.var1[w.var2[98]] = "Flour bin";
        w.var1[w.var2[99]] = "Empty";
        w.var1[w.var2[102]] = "Collecting BUCKET OF WATER.";
        w.var1[w.var2[104]] = "You are going to need a bucket for this quest.";
        w.var1[w.var2[109]] = "Collecting COINS.";
        w.var1[w.var2[110]] = "You are going to need at least 5,000 coins for this quest.";
        w.var1[w.var2[111]] = "Collecting ASHES.";
        w.var1[w.var2[114]] = "Take";
        w.var1[w.var2[115]] = "Waiting for fire to burn";
        w.var1[w.var2[117]] = "Light";
        w.var1[w.var2[120]] = "You are going to need a tinderbox for this quest.";
        w.var1[w.var2[121]] = "Collecting BRONZE_BARs.";
        w.var1[w.var2[124]] = "Mine";
        w.var1[w.var2[129]] = "Mine";
        w.var1[w.var2[133]] = "You are going to need a pickaxe for this quest.";
        w.var1[w.var2[134]] = "Collecting ONIONs.";
        w.var1[w.var2[136]] = "Pick";
        w.var1[w.var2[139]] = "Collecting BALL_OF_WOOL";
        w.var1[w.var2[141]] = "You are going to need a shears for this quest.";
        w.var1[w.var2[143]] = "Shear";
        w.var1[w.var2[148]] = "Spinning wheel";
        w.var1[w.var2[149]] = "Spin";
        w.var1[w.var2[150]] = "Ball of Wool";
        w.var1[w.var2[152]] = "Collecting REDBERRIES";
        w.var1[w.var2[154]] = "Pick-from";
        w.var1[w.var2[159]] = "Mine";
        w.var1[w.var2[162]] = "You are going to need a bucket for this quest.";
        w.var1[w.var2[163]] = "You are going to need a pickaxe for this quest.";
        w.var1[w.var2[164]] = "MAKING SOFT CLAY";
        w.var1[w.var2[166]] = "Bank booth";
        w.var1[w.var2[168]] = "Bank";
        w.var1[w.var2[169]] = "Walking to location";
        w.var1[w.var2[170]] = "pickaxe";
        w.var1[w.var2[171]] = "pickaxe";
        w.var1[w.var2[172]] = "pickaxe";
        w.var1[w.var2[173]] = "Sheep";
        w.var1[w.var2[174]] = "Shear";
        w.var1[w.var2[175]] = "pickaxe";
        w.var1[w.var2[176]] = "pickaxe";
        w.var1[w.var2[177]] = "pickaxe";
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var69;
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var69;
        NPC var70 = NPCs.getNearest((int[])nArray);
        if (w.var9(var70) && w.var4(Reachable.isInteractable((Locatable)var70) ? 1 : 0)) {
            var70.interact(var1[var2[12]]);
            0;
            if (-2 > 0) {
                return;
            }
        } else {
            void var71;
            System.out.println(var1[var2[13]]);
            Walker.walkTo((WorldPoint)var71);
            0;
        }
    }

    private void bI() {
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[46];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[57];
        if (w.var7(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        System.out.println(var1[var2[14]]);
        if (w.var4(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var2[26]];
            dialogOptionArray[w.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[6]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[w.var2[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[13]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[w.var2[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[w.var2[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[22]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArray[w.var2[23]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[w.var2[24]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[w.var2[25]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[w.var2[0]] = var2[58];
        NPC var72 = NPCs.getNearest((int[])nArray3);
        if (w.var9(var72) && w.var4(Reachable.isInteractable((Locatable)var72) ? 1 : 0)) {
            var72.interact(var1[var2[10]]);
            0;
            if (-(161 + 82 - 189 + 115 ^ 36 + 94 - 51 + 94) >= 0) {
                return;
            }
        } else {
            System.out.println(var1[var2[22]]);
            Walker.walkTo((WorldPoint)new WorldPoint(var2[59], var2[60], var2[0]));
            0;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    private void bT() {
        w var73;
        if (w.var4(this.d(var2[38]) ? 1 : 0)) {
            return;
        }
        if (w.var7(var73.d(var2[75]) ? 1 : 0)) {
            int[] nArray = new int[var2[6]];
            nArray[w.var2[0]] = var2[75];
            if (w.var10(Inventory.getCount((boolean)var2[6], (int[])nArray), var2[108])) {
                return;
            }
        }
        if (w.var7(Bank.isOpen() ? 1 : 0)) {
            var73.ca();
            return;
        }
        System.out.println(var1[var2[109]]);
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[75];
        if (w.var4(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[6]];
            nArray2[w.var2[0]] = var2[75];
            if (w.var10(Bank.getCount((boolean)var2[6], (int[])nArray2), var2[108])) {
                Bank.withdraw((int)var2[75], (int)var2[108], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return;
            }
        }
        System.out.println(var1[var2[110]]);
    }

    private void bQ() {
        if (w.var4(this.d(var2[35]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var2[6]];
        nArray[w.var2[0]] = var2[73];
        if (w.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[6]];
        nArray2[w.var2[0]] = var2[80];
        NPC var74 = NPCs.getNearest((int[])nArray2);
        if (w.var4(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)var2[73]);
        }
        if (w.var9(var74) && w.var4(Reachable.isInteractable((Locatable)var74) ? 1 : 0)) {
            var74.interact(var1[var2[52]]);
            0;
            if (-1 >= 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[81], var2[82], var2[0]));
            0;
            return;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }
}

