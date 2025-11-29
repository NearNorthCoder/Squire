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
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Cooks Assistant")
public class CompletingCooksAssistantTask
extends Task {
    private final  TaskManager at;
    private final  SquireQuester as;
    
    private final  SquireQuesterConfig ar;
    private final  Client aq;

    private static boolean lIlIIIlIlIlIIll(Object object) {
        return object == null;
    }

    private void R() {
        p var1;
        if (!p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) || p.lIlIIIlIlIlIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            if (p.lIlIIIlIlIlIIIl(Dialog.hasOption((String)lIIIllIlIIlll[lIIIllIlIlIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[3]];
                Dialog.chooseOption((String[])stringArray);

            }
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIlIII[5]];
            dialogOptionArray[p.lIIIllIlIlIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[3]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[9]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (p.lIlIIIlIlIIllll(var1.V() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIlIlIII[3]];
            nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIllIlIlIII[3]];
                nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIlIlIII[3]];
                    stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[1]];
                    TileItem var2 = TileItems.getNearest((String[])stringArray);
                    if (p.lIlIIIlIlIlIIlI(var2)) {
                        var2.interact(lIIIllIlIIlll[lIIIllIlIlIII[2]]);
                    }
                    System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[6]]);
                    return;
                }
            }
            int[] nArray3 = new int[lIIIllIlIlIII[3]];
            nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[13], lIIIllIlIlIII[14], lIIIllIlIlIII[0]));

                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[7]];
                NPCs.getNearest((String[])stringArray).interact(lIIIllIlIIlll[lIIIllIlIlIII[8]]);
                Shop.buyOne((int)lIIIllIlIlIII[12]);
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIlIlIII[3]];
                nArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    var1.U();
                }
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray5 = new int[lIIIllIlIlIII[3]];
                nArray5[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIllIlIlIII[3]];
                    nArray6[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                    if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        var1.T();
                    }
                }
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllIlIlIII[3]];
                nArray7[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIllIlIlIII[3]];
                    nArray8[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                    if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                        int[] nArray9 = new int[lIIIllIlIlIII[3]];
                        nArray9[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            var1.S();
                        }
                    }
                }
            }
        }
        if (p.lIlIIIlIlIlIIIl(var1.V() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[9]];
            NPC var2 = NPCs.getNearest((String[])stringArray);
            if (p.lIlIIIlIlIlIIlI(var2)) {
                var2.interact(lIIIllIlIIlll[lIIIllIlIlIII[5]]);
                var1.sleepWhile(lIIIllIlIlIII[17], () -> {
                    boolean bl;
                    if (p.lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIlIlIII[3];

                        if (-(0x6F ^ 0x6B) >= 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIllIlIlIII[0];
                    }
                    return bl;
                });

                if ((0x1F ^ 0x1B) < 3) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));

            }
        }
        this.sleep(lIIIllIlIlIII[3]);
    }

    private static boolean lIlIIIlIlIlIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var3;
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = n2;
            TileItem tileItem = TileItems.getNearest((int[])nArray2);
            if (p.lIlIIIlIlIlIIlI(tileItem)) {
                if (p.lIlIIIlIlIlIIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    tileItem.interact(lIIIllIlIIlll[lIIIllIlIlIII[49]]);

                } else {
                    Walker.walkTo((WorldPoint)var3);

                    if (((0x13 ^ 1) & ~(0 ^ 0x12)) < 0) {
                        return;
                    }
                }
            } else {
                Walker.walkTo((WorldPoint)var3);

            }
        }
    }

    private void U() {
        p var4;
        this.b(lIIIllIlIlIII[10], new WorldPoint(lIIIllIlIlIII[30], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        if (p.lIlIIIlIlIIllll(this.as.a() ? 1 : 0)) {
            this.a(lIIIllIlIlIII[31], new WorldPoint(lIIIllIlIlIII[32], lIIIllIlIlIII[33], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[34]], lIIIllIlIIlll[lIIIllIlIlIII[35]]);
        }
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[36]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lIIIllIlIlIII[3]];
                    stringArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIllIlIIlll[lIIIllIlIlIII[38]]);

                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[39], lIIIllIlIlIII[40], lIIIllIlIlIII[1]));

                }
            }
        }
        int[] nArray3 = new int[lIIIllIlIlIII[3]];
        nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlIlIII[3]];
            nArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[41]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray)) && p.lIlIIIlIlIIllll(var4.as.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIlIlIII[3]];
                    stringArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[42]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIllIlIIlll[lIIIllIlIlIII[43]]);
                }
            }
        }
        if (p.lIlIIIlIlIlIIIl(var4.as.a() ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIlIlIII[3]];
            nArray5[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[44]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[lIIIllIlIlIII[3]];
                    stringArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[45]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIllIlIIlll[lIIIllIlIlIII[46]]);

                    if (3 > 3) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[47], lIIIllIlIlIII[48], lIIIllIlIlIII[0]));

                }
            }
        }
    }

    private static boolean lIlIIIlIlIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingCooksAssistantTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aq = client;
        this.ar = squireQuesterConfig;
        this.as = squireQuester;
        this.at = taskManager;
    }

    private void M() {
        if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[20]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (p.lIlIIIlIlIlIIlI(nPC)) {
                nPC.interact(lIIIllIlIIlll[lIIIllIlIlIII[17]]);
                this.sleepWhile(lIIIllIlIlIII[17], () -> {
                    boolean bl;
                    if (p.lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIlIlIII[3];

                        if (1 >= (0x82 ^ 0x9F ^ (0x87 ^ 0x9E))) {
                            return ((0x4A ^ 0x39 ^ (0xD ^ 0x60)) & (8 + 70 - 30 + 113 ^ 33 + 141 - 172 + 189 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIlIlIII[0];
                    }
                    return bl;
                });

            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));

            }

            if (1 < 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[21]]);
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIlIII[17]];
            dialogOptionArray[p.lIIIllIlIlIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[3]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[p.lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[9]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[p.lIIIllIlIlIII[5]] = DialogOption.CHAT_OPTION_FOUR;
            dialogOptionArray[p.lIIIllIlIlIII[20]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    private static void lIlIIIlIlIIllIl() {
        lIIIllIlIIlll = new String[lIIIllIlIlIII[52]];
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[0]] = "Actually, I know where to find this stuff.";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[3]] = "Actually, I know where to find this stuff.";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[1]] = "Pot";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[2]] = "Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[6]] = "Collecting pot";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[7]] = "Shop keeper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[8]] = "Trade";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[9]] = "Cook";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[5]] = "Talk-to";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[20]] = "Cook";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[17]] = "Talk-to";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[21]] = "Sending";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[26]] = "Dairy cow";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[27]] = "Milk";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[34]] = "Wheat";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[35]] = "Pick";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[36]] = "Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[37]] = "Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[38]] = "Fill";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[41]] = "Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[42]] = "Hopper controls";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[43]] = "Operate";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[44]] = "Flour bin";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[45]] = "Flour bin";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[46]] = "Empty";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[49]] = "Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[50]] = "Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[51]] = "Walking to location";
    }

        return String.valueOf(var5);
    }

    public boolean V() {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] nArray2 = new int[lIIIllIlIlIII[3]];
        nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] nArray3 = new int[lIIIllIlIlIII[3]];
        nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        return lIIIllIlIlIII[3];
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint, String string, String string2) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = string;
            if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIllIlIlIII[3]];
                stringArray2[p.lIIIllIlIlIII[0]] = string;
                if (p.lIlIIIlIlIlIIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray2)) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIlIlIII[3]];
                    stringArray3[p.lIIIllIlIlIII[0]] = string;
                    TileObjects.getNearest((String[])stringArray3).interact(string2);

                    if (1 > 1) {
                        return;
                    }
                } else {
                    void var6;
                    String[] stringArray4 = new String[lIIIllIlIlIII[3]];
                    stringArray4[p.lIIIllIlIlIII[0]] = var6;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());

                }
            } else {
                void var7;
                System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[51]]);
                Walker.walkTo((WorldPoint)var7);

            }
        }
    }

    public boolean run() {
        p var8;
        if (p.lIlIIIlIlIIllll(this.ar.quest().equals((Object)h.COOKS_ASSISTANT) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int var9 = var8.Q();
        System.out.println("[COOKS ASSISTANT] Current Progress: " + var9);
        if (p.lIlIIIlIlIlIIII(var9, lIIIllIlIlIII[1])) {
            return lIIIllIlIlIII[0];
        }
        switch (var9) {
            case 0: {
                var8.M();

                if (null == null) break;
                return ((0xEC ^ 0x95 ^ (0x75 ^ 0x38)) & (0x78 ^ 0x37 ^ (0x5F ^ 0x24) ^ -1)) != 0;
            }
            case 1: {
                var8.R();
                var8.sleep(lIIIllIlIlIII[2]);

                if ((0x5D ^ 0x6E ^ (0xA6 ^ 0x91)) >= ((52 + 53 - -21 + 51 ^ 88 + 28 - -2 + 44) & (1 + 8 - -175 + 7 ^ 132 + 141 - 228 + 127 ^ -1))) break;
                return false;
            }
            default: {
                return lIIIllIlIlIII[0];
            }
        }
        return lIIIllIlIlIII[3];
    }

    private static boolean lIlIIIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private int Q() {
        return Vars.getVarp((int)lIIIllIlIlIII[4]);
    }

    private static boolean lIlIIIlIlIIllll(int n2) {
        return n2 == 0;
    }

    static {
        p.lIlIIIlIlIIlllI();
        p.lIlIIIlIlIIllIl();
    }

    private void S() {
        this.b(lIIIllIlIlIII[12], new WorldPoint(lIIIllIlIlIII[22], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.a(lIIIllIlIlIII[16], new WorldPoint(lIIIllIlIlIII[24], lIIIllIlIlIII[25], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[26]], lIIIllIlIIlll[lIIIllIlIlIII[27]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void b(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = n2;
            TileObject tileObject = TileObjects.getNearest((int[])nArray2);
            if (p.lIlIIIlIlIlIIll(tileObject)) {
                Walker.walkTo((WorldPoint)worldPoint);

                if (1 > 2) {
                    return;
                }
            } else {
                void var10;
                var10.interact(lIIIllIlIIlll[lIIIllIlIlIII[50]]);
            }
        }
    }

    private static boolean lIlIIIlIlIlIIlI(Object object) {
        return object != null;
    }

    private void T() {
        this.a(lIIIllIlIlIII[15], new WorldPoint(lIIIllIlIlIII[28], lIIIllIlIlIII[29], lIIIllIlIlIII[0]));
    }
}

