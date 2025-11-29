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
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.util.List;
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
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Restless Ghost")
public class CompletingRestlessGhostTask
extends Task {
    private final  Client bo;
    private final  SquireQuester bq;
    
    private final  TaskManager br;
    private final  SquireQuesterConfig bp;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    @Inject
    public CompletingRestlessGhostTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bo = client;
        this.bp = squireQuesterConfig;
        this.bq = squireQuester;
        this.br = taskManager;
    }

    private void ch() {
        if (x.var10(Dialog.canContinue() ? 1 : 0) && x.var10(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var1[2]];
            stringArray[x.var1[0]] = var2[var1[21]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.var11(nPC) && x.var12(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(var2[var1[19]]);
                this.sleepWhile(var1[15], () -> {
                    boolean bl;
                    if (x.var10(Dialog.isOpen() ? 1 : 0)) {
                        bl = var1[2];
                        0;
                        if (-1 > 0) {
                            return ((0xAF ^ 0xAB) & ~(0x84 ^ 0x80)) != 0;
                        }
                    } else {
                        bl = var1[0];
                    }
                    return bl;
                });
                0;
                if (-1 < -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[23], var1[24], var1[0]));
                0;
            }
            return;
        }
        System.out.println(var2[var1[25]]);
        DialogOption[] dialogOptionArray = new DialogOption[var1[19]];
        dialogOptionArray[x.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.var1[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.var1[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.var1[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static void var13() {
        var2 = new String[var1[31]];
        x.var2[x.var1[0]] = "Coffin";
        x.var2[x.var1[2]] = "Open";
        x.var2[x.var1[3]] = "Open";
        x.var2[x.var1[4]] = "Search";
        x.var2[x.var1[5]] = "Ghost's skull";
        x.var2[x.var1[1]] = "Altar";
        x.var2[x.var1[11]] = "Search";
        x.var2[x.var1[12]] = "Coffin";
        x.var2[x.var1[13]] = "Restless ghost";
        x.var2[x.var1[14]] = "Open";
        x.var2[x.var1[15]] = "Open";
        x.var2[x.var1[16]] = "Search";
        x.var2[x.var1[17]] = "Search";
        x.var2[x.var1[18]] = "Talk-to";
        x.var2[x.var1[20]] = "Wear";
        x.var2[x.var1[21]] = "Father Urhney";
        x.var2[x.var1[19]] = "Talk-to";
        x.var2[x.var1[25]] = "Invoking";
        x.var2[x.var1[26]] = "Father Aereck";
        x.var2[x.var1[27]] = "Talk-to";
        x.var2[x.var1[30]] = "Invoking";
    }

    private void cg() {
        int[] nArray = new int[var1[2]];
        nArray[x.var1[0]] = var1[22];
        if (x.var12(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[x.var1[0]] = var1[22];
        if (x.var12(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[2]];
            nArray3[x.var1[0]] = var1[22];
            Inventory.getFirst((int[])nArray3).interact(var2[var1[20]]);
        }
    }

    private static void var14() {
        var1 = new int[32];
        x.var1[0] = (0x44 ^ 0x7E) & ~(0x81 ^ 0xBB);
        x.var1[1] = 26 + 42 - -37 + 89 ^ 116 + 197 - 145 + 31;
        x.var1[2] = 1;
        x.var1[3] = 2;
        x.var1[4] = 3;
        x.var1[5] = 0x3C ^ 0x72 ^ (0xC9 ^ 0x83);
        x.var1[6] = 0xFFFF8DF9 & 0x7EB7;
        x.var1[7] = -(0xFFFFFB37 & 0x77CD) & (0xFFFFFF7F & 0x7FFD);
        x.var1[8] = -(0xFFFFAFAB & 0x72DD) & (0xFFFFFEFD & 0x2FBA);
        x.var1[9] = -(0xFFFFD6C3 & 0x79BE) & (0xFFFFFFDF & 0x75FF);
        x.var1[10] = 0xFFFFBF2F & 0x4CFF;
        x.var1[11] = 0x63 ^ 0x4C ^ (0x6B ^ 0x42);
        x.var1[12] = 0x7C ^ 0x75 ^ (0xA2 ^ 0xAC);
        x.var1[13] = 0x26 ^ 0x68 ^ (0x2B ^ 0x6D);
        x.var1[14] = 0x1D ^ 0x14;
        x.var1[15] = 0xFE ^ 0x8E ^ (0xD0 ^ 0xAA);
        x.var1[16] = 55 + 69 - 41 + 84 ^ 2 + 141 - 63 + 92;
        x.var1[17] = 0xBA ^ 0xB6;
        x.var1[18] = 0x7A ^ 0x77;
        x.var1[19] = 0x52 ^ 0x47 ^ (0xC0 ^ 0xC5);
        x.var1[20] = 89 + 107 - 115 + 69 ^ 112 + 146 - 192 + 86;
        x.var1[21] = 0x79 ^ 0x76;
        x.var1[22] = -(0xFFFFDDF9 & 0x67C7) & (0xFFFFC7EC & 0x7FFB);
        x.var1[23] = -(0xFFFF96AB & 0x7B55) & (0xFFFFDFCF & 0x3E7B);
        x.var1[24] = -(0xFFFFBBD9 & 0x66B7) & (0xFFFFBEFF & 0x6FF7);
        x.var1[25] = 0x71 ^ 0x60;
        x.var1[26] = 0x5C ^ 0x4E;
        x.var1[27] = 0x4A ^ 0x59;
        x.var1[28] = -(0xFFFFFBD7 & 0x357B) & (0xFFFFFFFE & 0x3DFF);
        x.var1[29] = -(0xFFFFF4EF & 0x3B51) & (0xFFFFFFCE & 0x3CF7);
        x.var1[30] = 0x42 ^ 0x56;
        x.var1[31] = 0x93 ^ 0x86;
    }

    private static boolean var15(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        if (x.var10(Dialog.canContinue() ? 1 : 0) && x.var10(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var1[2]];
            stringArray[x.var1[0]] = var2[var1[26]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.var11(nPC) && x.var12(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(var2[var1[27]]);
                this.sleepWhile(var1[15], () -> {
                    boolean bl;
                    if (x.var10(Dialog.isOpen() ? 1 : 0)) {
                        bl = var1[2];
                        0;
                        if ((0x37 ^ 0x22 ^ (0x18 ^ 9)) == 0) {
                            return ((0x87 ^ 0x93 ^ (0xE ^ 0x27)) & (0x49 ^ 0x28 ^ (0xFE ^ 0xA2) ^ -1)) != 0;
                        }
                    } else {
                        bl = var1[0];
                    }
                    return bl;
                });
                0;
                if (-1 > 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[28], var1[29], var1[0]));
                0;
            }
            return;
        }
        System.out.println(var2[var1[30]]);
        DialogOption[] dialogOptionArray = new DialogOption[var1[21]];
        dialogOptionArray[x.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[x.var1[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[5]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[x.var1[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[20]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    static {
        x.var14();
        x.var13();
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var1[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var1[0];
        while (x.var16(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (-(0xB3 ^ 0xB9 ^ (0x57 ^ 0x59)) <= 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    /*
     * WARNING - void declaration
     */
    private void cd() {
        String[] stringArray = new String[var1[2]];
        stringArray[x.var1[0]] = var2[var1[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (x.var11(tileObject) && x.var12(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            void var33;
            if (x.var10(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)tileObject.getWorldLocation());
                0;
                return;
            }
            String[] stringArray2 = new String[var1[2]];
            stringArray2[x.var1[0]] = var2[var1[2]];
            if (x.var12(var33.hasAction(stringArray2) ? 1 : 0)) {
                var33.interact(var2[var1[3]]);
            }
            String[] stringArray3 = new String[var1[2]];
            stringArray3[x.var1[0]] = var2[var1[4]];
            if (x.var12(var33.hasAction(stringArray3) ? 1 : 0)) {
                String[] stringArray4 = new String[var1[2]];
                stringArray4[x.var1[0]] = var2[var1[5]];
                Inventory.getFirst((String[])stringArray4).useOn((TileObject)var33);
                0;
                if (-3 >= 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[6], var1[7], var1[0]));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void cf() {
        String[] stringArray = new String[var1[2]];
        stringArray[x.var1[0]] = var2[var1[12]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[var1[2]];
        stringArray2[x.var1[0]] = var2[var1[13]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (x.var10(Dialog.canContinue() ? 1 : 0) && x.var10(Dialog.isViewingOptions() ? 1 : 0)) {
            void var34;
            if (x.var11(tileObject) && x.var9(nPC) && x.var12(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                void var35;
                String[] stringArray3 = new String[var1[2]];
                stringArray3[x.var1[0]] = var2[var1[14]];
                if (x.var12(tileObject.hasAction(stringArray3) ? 1 : 0)) {
                    tileObject.interact(var2[var1[15]]);
                    return;
                }
                String[] stringArray4 = new String[var1[2]];
                stringArray4[x.var1[0]] = var2[var1[16]];
                if (x.var12(var35.hasAction(stringArray4) ? 1 : 0)) {
                    var35.interact(var2[var1[17]]);
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[6], var1[7], var1[0]));
                0;
            }
            if (x.var11(var34)) {
                if (x.var12(Reachable.isInteractable((Locatable)var34) ? 1 : 0)) {
                    var34.interact(var2[var1[18]]);
                    0;
                    if null != null {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)var34.getWorldLocation());
                    0;
                }
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[19]];
        dialogOptionArray[x.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.var1[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.var1[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.var1[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.var1[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    public boolean run() {
        x var36;
        if (x.var10(this.bp.quest().equals((Object)h.RESTLESS_GHOST) ? 1 : 0)) {
            return var1[0];
        }
        int var37 = var36.Q();
        if (x.var15(var37, var1[1])) {
            return var1[0];
        }
        System.out.println("[RESTLESS GHOST] - Current Progress: " + var37);
        switch (var37) {
            case 0: {
                var36.M();
                0;
                if (2 > 1) break;
                return ((0x81 ^ 0x9E) & ~(0x49 ^ 0x56)) != 0;
            }
            case 1: {
                var36.ch();
                0;
                if null == null break;
                return ((0xD2 ^ 0x9A) & ~(0xD6 ^ 0x9E) & ~((0x7C ^ 0x68) & ~(0x88 ^ 0x9C))) != 0;
            }
            case 2: {
                var36.cg();
                var36.cf();
                0;
                if (2 != 0) break;
                return ((153 + 218 - 349 + 221 ^ 63 + 15 - 35 + 144) & (0x26 ^ 0x6C ^ 2 ^ -1)) != 0;
            }
            case 3: {
                var36.ce();
                0;
                if (2 >= 0) break;
                return ((0x11 ^ 0x29) & ~(0xFA ^ 0xC2)) != 0;
            }
            case 4: {
                var36.cd();
                0;
                if (3 >= 1) break;
                return ((0x56 ^ 0x6D ^ (0x75 ^ 0x66)) & (0xA1 ^ 0xBB ^ (0x79 ^ 0x4B) ^ -1)) != 0;
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    /*
     * WARNING - void declaration
     */
    private void ce() {
        void var38;
        String[] stringArray = new String[var1[2]];
        stringArray[x.var1[0]] = var2[var1[1]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(var1[8], var1[9], var1[0]), (String[])stringArray);
        if (x.var12(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[10], var1[9], var1[0]));
            0;
            0;
            if (1 <= 0) {
                return;
            }
        } else if (x.var12(Reachable.isInteractable((Locatable)((Locatable)var38.get(var1[0]))) ? 1 : 0)) {
            ((TileObject)var38.get(var1[0])).interact(var2[var1[11]]);
            0;
            if ((0xB0 ^ 0xB4) == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)((TileObject)var38.get(var1[0])).getWorldLocation());
            0;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_THE_RESTLESS_GHOST.c());
    }
}

