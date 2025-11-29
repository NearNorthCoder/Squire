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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.util.List;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Sheep Shearer")
public class CompletingSheepShearerTask
extends Task {

    private final  SquireQuesterConfig bx;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        NPC lllllllllllllllIIIIlIlIIIIlllIlI2;
        A var9;
        block27: {
            block26: {
                block25: {
                    if (A.var10(this.bx.quest().equals((Object)h.SHEEP_SHEARER) ? 1 : 0)) {
                        return var1[0];
                    }
                    if (A.var11(var9.Q(), var1[1])) {
                        return var1[0];
                    }
                    System.out.println(var9.Q());
                    if (!A.var12(Inventory.getFreeSlots(), var1[2])) break block25;
                    int[] nArray = new int[var1[3]];
                    nArray[A.var1[0]] = var1[4];
                    if (!A.var10(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                    int[] nArray2 = new int[var1[3]];
                    nArray2[A.var1[0]] = var1[5];
                    if (!A.var13(Inventory.contains((int[])nArray2) ? 1 : 0)) break block26;
                }
                int[] nArray = new int[var1[3]];
                nArray[A.var1[0]] = var1[6];
                if (!A.var10(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                int[] nArray3 = new int[var1[3]];
                nArray3[A.var1[0]] = var1[7];
                if (!A.var10(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
            }
            if (A.var10(Bank.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[A.var1[0]] = var2[var1[0]];
                List lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[8], var1[9], var1[10]), (String[])stringArray);
                if (A.var13(lllllllllllllllIIIIlIlIIIIlllIlI2.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[8], var1[11], var1[10]));
                    0;
                    return var1[0];
                }
                if (A.var14(lllllllllllllllIIIIlIlIIIIlllIlI2.size(), var1[3])) {
                    if (A.var10(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2.get(var1[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(var1[8], var1[11], var1[10]));
                        0;
                        return var1[0];
                    }
                    ((TileObject)lllllllllllllllIIIIlIlIIIIlllIlI2.get(var1[0])).interact(var2[var1[3]]);
                }
                return var1[0];
            }
            if (A.var12(Inventory.getFreeSlots(), var1[2])) {
                Bank.depositInventory();
            }
            if (A.var13(Bank.isOpen() ? 1 : 0) && A.var13(var9.cx() ? 1 : 0)) {
                Bank.withdraw((int)var1[6], (int)var1[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                var9.sleep(var1[3]);
            }
        }
        if (A.var13(Bank.isOpen() ? 1 : 0) && A.var13(var9.cx() ? 1 : 0)) {
            Bank.withdraw((int)var1[6], (int)var1[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[6];
        if (A.var13(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[var1[3]];
            nArray4[A.var1[0]] = var1[7];
            if (A.var10(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                if (A.var13(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)var1[7]);
                    return var1[0];
                }
                String[] stringArray = new String[var1[3]];
                stringArray[A.var1[0]] = var2[var1[10]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((String[])stringArray);
                if (A.var15(lllllllllllllllIIIIlIlIIIIlllIlI2)) {
                    lllllllllllllllIIIIlIlIIIIlllIlI2.interact(var2[var1[12]]);
                    return var1[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(var1[13], var1[14], var1[0]));
                0;
            }
        }
        int[] nArray5 = new int[var1[3]];
        nArray5[A.var1[0]] = var1[7];
        if (A.var13(Inventory.contains((int[])nArray5) ? 1 : 0) && A.var12(var9.cb(), var1[2])) {
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest(nPC -> {
                int n2;
                if (A.var13(nPC.getName().equals(var2[var1[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[3]];
                    stringArray[A.var1[0]] = var2[var1[28]];
                    if (A.var13(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[3];
                        0;
                        if (-(0x29 ^ 0x53 ^ (0x74 ^ 0xA)) < 0) return n2 != 0;
                        return ((0x1E ^ 0x28 ^ (0x26 ^ 0xB)) & (0x53 ^ 0x66 ^ (0x63 ^ 0x4D) ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (A.var15(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.var13(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0) && A.var16(lllllllllllllllIIIIlIlIIIIlllIlI2.getId(), var1[15])) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(var2[var1[16]]);
                return var1[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var1[17], var1[18], var1[0]));
            0;
        }
        if (A.var14(var9.cb(), var1[2])) {
            int[] nArray6 = new int[var1[3]];
            nArray6[A.var1[0]] = var1[4];
            if (A.var13(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                if (A.var16(Players.getLocal().getAnimation(), var1[19])) {
                    return var1[0];
                }
                String[] stringArray = new String[var1[3]];
                stringArray[A.var1[0]] = var2[var1[20]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getNearest((String[])stringArray);
                if (A.var15(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.var13(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                    if (A.var10(Production.isOpen() ? 1 : 0)) {
                        lllllllllllllllIIIIlIlIIIIlllIlI2.interact(var2[var1[21]]);
                    }
                    Production.chooseOption((String)var2[var1[22]]);
                    return var1[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(var1[23], var1[24], var1[3]));
                0;
                return var1[0];
            }
            if (A.var13(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[var1[1]];
                dialogOptionArray[A.var1[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[3]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.var1[10]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[12]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[16]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[20]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[21]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[22]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[25]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[26]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[27]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.var1[28]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[29]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[30]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[31]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[32]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[33]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[34]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.var1[35]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[A.var1[36]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.var1[2]] = DialogOption.NPC_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return var1[0];
            }
            int[] nArray7 = new int[var1[3]];
            nArray7[A.var1[0]] = var1[37];
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((int[])nArray7);
            if (A.var15(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.var13(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(var2[var1[25]]);
                return var1[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var1[38], var1[39], var1[0]));
            0;
        }
        return var1[3];
    }

    public boolean cx() {
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[6];
        if (A.var10(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[3]];
            nArray2[A.var1[0]] = var1[6];
            if (A.var10(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(var2[var1[26]]);
            }
            return var1[3];
        }
        return var1[0];
    }

    private int cb() {
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[4];
        int[] nArray2 = new int[var1[3]];
        nArray2[A.var1[0]] = var1[5];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    @Inject
    public CompletingSheepShearerTask(SquireQuesterConfig squireQuesterConfig) {
        this.bx = squireQuesterConfig;
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static void var17() {
        var2 = new String[var1[29]];
        A.var2[A.var1[0]] = "Bank booth";
        A.var2[A.var1[3]] = "Bank";
        A.var2[A.var1[10]] = "Shop keeper";
        A.var2[A.var1[12]] = "Trade";
        A.var2[A.var1[16]] = "Shear";
        A.var2[A.var1[20]] = "Spinning wheel";
        A.var2[A.var1[21]] = "Spin";
        A.var2[A.var1[22]] = "Ball of Wool";
        A.var2[A.var1[25]] = "Talk-to";
        A.var2[A.var1[26]] = "We need coins";
        A.var2[A.var1[27]] = "Sheep";
        A.var2[A.var1[28]] = "Shear";
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var18() {
        var1 = new int[40];
        A.var1[0] = (0x28 ^ 0x19) & ~(1 ^ 0x30);
        A.var1[1] = 0x43 ^ 0x56;
        A.var1[2] = 0xB7 ^ 0xA3;
        A.var1[3] = 1;
        A.var1[4] = 0xFFFFFECF & 0x7F9;
        A.var1[5] = 0xFFFFDFFF & 0x26DF;
        A.var1[6] = 0xFFFF97F3 & 0x6BEF;
        A.var1[7] = 0xFFFF8EF7 & 0x77CF;
        A.var1[8] = 0xFFFF9FAF & 0x6CD8;
        A.var1[9] = 0xFFFFFCDF & 0xFB5;
        A.var1[10] = 2;
        A.var1[11] = -(0xFFFFBF0D & 0x52FF) & (0xFFFF9EBF & 0x7FDE);
        A.var1[12] = 3;
        A.var1[13] = 0xFFFF8C8B & Short.MAX_VALUE;
        A.var1[14] = 0xFFFFBDAD & 0x4EFF;
        A.var1[15] = -(0xFFFFD9B9 & 0x3F67) & (0xFFFF9FFB & 0x7BFF);
        A.var1[16] = 0xBA ^ 0xB7 ^ (0x53 ^ 0x5A);
        A.var1[17] = -(0xFFFFF17F & 0x5FEF) & (0xFFFFDFFE & 0x7DEF);
        A.var1[18] = 0xFFFFECC2 & 0x1FFD;
        A.var1[19] = -1;
        A.var1[20] = 41 + 2 - -33 + 72 ^ 16 + 52 - -65 + 12;
        A.var1[21] = 0xFF ^ 0x91 ^ (0xDA ^ 0xB2);
        A.var1[22] = 0x23 ^ 0x24;
        A.var1[23] = -(0xFFFFEBBE & 0x3747) & (0xFFFFFFDF & 0x2FAF);
        A.var1[24] = 0xFFFFCC8E & 0x3FFF;
        A.var1[25] = 0xCB ^ 0xA3 ^ (0x24 ^ 0x44);
        A.var1[26] = 0x75 ^ 0x7C;
        A.var1[27] = 112 + 189 - 144 + 50 ^ 18 + 170 - 31 + 40;
        A.var1[28] = 7 ^ 0x4F ^ (0xA ^ 0x49);
        A.var1[29] = 0x34 ^ 0x38;
        A.var1[30] = 0xAB ^ 0xA6;
        A.var1[31] = 0xA ^ 4;
        A.var1[32] = 0x67 ^ 0x70 ^ (0x82 ^ 0x9A);
        A.var1[33] = 126 + 7 - 30 + 85 ^ 0 + 9 - -51 + 112;
        A.var1[34] = 0x4C ^ 0x38 ^ (0xD9 ^ 0xBC);
        A.var1[35] = 0x53 ^ 0 ^ (0xFE ^ 0xBF);
        A.var1[36] = 0x16 ^ 5;
        A.var1[37] = 0xFFFFD6DC & 0x2BFF;
        A.var1[38] = 0xFFFFBFFE & 0x4C77;
        A.var1[39] = 0xFFFFECDF & 0x1FE9;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_SHEEP_SHEARER.c());
    }

    static {
        A.var18();
        A.var17();
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[0];
        while (A.var12(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }
}

