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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Restless Ghost")
public class CompletingRestlessGhostTask
extends Task {
    private final  Client bo;
    private final  SquireQuester bq;
    
    private final  TaskManager br;
    private final  SquireQuesterConfig bp;

    private static boolean lIlIIIllIIIIIlI(Object object) {
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
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[21]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[19]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];

                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });

                if (-1 < -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[23], lIIIllIllIIIl[24], lIIIllIllIIIl[0]));

            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[25]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static void lIlIIIlIlllllII() {
        lIIIllIllIIII = new String[lIIIllIllIIIl[31]];
        x.lIIIllIllIIII[x.lIIIllIllIIIl[0]] = "Coffin";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[2]] = "Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[3]] = "Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[4]] = "Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[5]] = "Ghost's skull";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[1]] = "Altar";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[11]] = "Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[12]] = "Coffin";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[13]] = "Restless ghost";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[14]] = "Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[15]] = "Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[16]] = "Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[17]] = "Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[18]] = "Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[20]] = "Wear";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[21]] = "Father Urhney";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[19]] = "Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[25]] = "Invoking";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[26]] = "Father Aereck";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[27]] = "Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[30]] = "Invoking";
    }

    private void cg() {
        int[] nArray = new int[lIIIllIllIIIl[2]];
        nArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIllIIIl[2]];
        nArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIllIIIl[2]];
            nArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
            Inventory.getFirst((int[])nArray3).interact(lIIIllIllIIII[lIIIllIllIIIl[20]]);
        }
    }

    private static boolean lIlIIIlIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[26]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[27]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];

                        if ((0x37 ^ 0x22 ^ (0x18 ^ 9)) == 0) {
                            return ((0x87 ^ 0x93 ^ (0xE ^ 0x27)) & (0x49 ^ 0x28 ^ (0xFE ^ 0xA2) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });

            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[28], lIIIllIllIIIl[29], lIIIllIllIIIl[0]));

            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[30]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[21]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    static {
        x.lIlIIIlIlllllIl();
        x.lIlIIIlIlllllII();
    }

    private static boolean lIlIIIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIllllllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private void cd() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            void var2;
            if (x.lIlIIIlIllllllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)tileObject.getWorldLocation());

                return;
            }
            String[] stringArray2 = new String[lIIIllIllIIIl[2]];
            stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[2]];
            if (x.lIlIIIllIIIIIIl(var2.hasAction(stringArray2) ? 1 : 0)) {
                var2.interact(lIIIllIllIIII[lIIIllIllIIIl[3]]);
            }
            String[] stringArray3 = new String[lIIIllIllIIIl[2]];
            stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[4]];
            if (x.lIlIIIllIIIIIIl(var2.hasAction(stringArray3) ? 1 : 0)) {
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[5]];
                Inventory.getFirst((String[])stringArray4).useOn((TileObject)var2);

            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));

        }
    }

    /*
     * WARNING - void declaration
     */
    private void cf() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[12]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIllIIIl[2]];
        stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[13]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            void var3;
            if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIlI(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                void var4;
                String[] stringArray3 = new String[lIIIllIllIIIl[2]];
                stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[14]];
                if (x.lIlIIIllIIIIIIl(tileObject.hasAction(stringArray3) ? 1 : 0)) {
                    tileObject.interact(lIIIllIllIIII[lIIIllIllIIIl[15]]);
                    return;
                }
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[16]];
                if (x.lIlIIIllIIIIIIl(var4.hasAction(stringArray4) ? 1 : 0)) {
                    var4.interact(lIIIllIllIIII[lIIIllIllIIIl[17]]);
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));

            }
            if (x.lIlIIIllIIIIIII(var3)) {
                if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                    var3.interact(lIIIllIllIIII[lIIIllIllIIIl[18]]);

                    }
                } else {
                    Walker.walkTo((WorldPoint)var3.getWorldLocation());

                }
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    public boolean run() {
        x var5;
        if (x.lIlIIIlIllllllI(this.bp.quest().equals((Object)h.RESTLESS_GHOST) ? 1 : 0)) {
            return lIIIllIllIIIl[0];
        }
        int var6 = var5.Q();
        if (x.lIlIIIlIlllllll(var6, lIIIllIllIIIl[1])) {
            return lIIIllIllIIIl[0];
        }
        System.out.println("[RESTLESS GHOST] - Current Progress: " + var6);
        switch (var6) {
            case 0: {
                var5.M();

                if (2 > 1) break;
                return false;
            }
            case 1: {
                var5.ch();

                if (null == null) break;
                return ((0xD2 ^ 0x9A) & ~(0xD6 ^ 0x9E) & ~((0x7C ^ 0x68) & ~(0x88 ^ 0x9C))) != 0;
            }
            case 2: {
                var5.cg();
                var5.cf();

                if (2 != 0) break;
                return false;
            }
            case 3: {
                var5.ce();

                if (2 >= 0) break;
                return false;
            }
            case 4: {
                var5.cd();

                if (3 >= 1) break;
                return ((0x56 ^ 0x6D ^ (0x75 ^ 0x66)) & (0xA1 ^ 0xBB ^ (0x79 ^ 0x4B) ^ -1)) != 0;
            }
            default: {
                return lIIIllIllIIIl[0];
            }
        }
        return lIIIllIllIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    private void ce() {
        void var7;
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[1]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIllIIIl[8], lIIIllIllIIIl[9], lIIIllIllIIIl[0]), (String[])stringArray);
        if (x.lIlIIIllIIIIIIl(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[10], lIIIllIllIIIl[9], lIIIllIllIIIl[0]));

            if (1 <= 0) {
                return;
            }
        } else if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)((Locatable)var7.get(lIIIllIllIIIl[0]))) ? 1 : 0)) {
            ((TileObject)var7.get(lIIIllIllIIIl[0])).interact(lIIIllIllIIII[lIIIllIllIIIl[11]]);

            if ((0xB0 ^ 0xB4) == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)((TileObject)var7.get(lIIIllIllIIIl[0])).getWorldLocation());

        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_THE_RESTLESS_GHOST.c());
    }
}

