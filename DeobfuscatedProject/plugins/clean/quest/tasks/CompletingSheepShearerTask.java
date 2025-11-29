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
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Sheep Shearer")
public class CompletingSheepShearerTask
extends Task {

    private final  SquireQuesterConfig bx;

    public boolean run() {
        NPC lllllllllllllllIIIIlIlIIIIlllIlI2;
        A var1;
        block27: {
            block26: {
                block25: {
                    if (A.lIlIIIlIIIlIllI(this.bx.quest().equals((Object)h.SHEEP_SHEARER) ? 1 : 0)) {
                        return lIIIllIIllIll[0];
                    }
                    if (A.lIlIIIlIIIlIlll(var1.Q(), lIIIllIIllIll[1])) {
                        return lIIIllIIllIll[0];
                    }
                    System.out.println(var1.Q());
                    if (!A.lIlIIIlIIIllIII(Inventory.getFreeSlots(), lIIIllIIllIll[2])) break block25;
                    int[] nArray = new int[lIIIllIIllIll[3]];
                    nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
                    if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                    int[] nArray2 = new int[lIIIllIIllIll[3]];
                    nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[5];
                    if (!A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block26;
                }
                int[] nArray = new int[lIIIllIIllIll[3]];
                nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
                if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                int[] nArray3 = new int[lIIIllIIllIll[3]];
                nArray3[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
                if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
            }
            if (A.lIlIIIlIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[0]];
                List lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[9], lIIIllIIllIll[10]), (String[])stringArray);
                if (A.lIlIIIlIIIllIIl(lllllllllllllllIIIIlIlIIIIlllIlI2.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[11], lIIIllIIllIll[10]));

                    return lIIIllIIllIll[0];
                }
                if (A.lIlIIIlIIIllIlI(lllllllllllllllIIIIlIlIIIIlllIlI2.size(), lIIIllIIllIll[3])) {
                    if (A.lIlIIIlIIIlIllI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2.get(lIIIllIIllIll[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[11], lIIIllIIllIll[10]));

                        return lIIIllIIllIll[0];
                    }
                    ((TileObject)lllllllllllllllIIIIlIlIIIIlllIlI2.get(lIIIllIIllIll[0])).interact(lIIIllIIllIlI[lIIIllIIllIll[3]]);
                }
                return lIIIllIIllIll[0];
            }
            if (A.lIlIIIlIIIllIII(Inventory.getFreeSlots(), lIIIllIIllIll[2])) {
                Bank.depositInventory();
            }
            if (A.lIlIIIlIIIllIIl(Bank.isOpen() ? 1 : 0) && A.lIlIIIlIIIllIIl(var1.cx() ? 1 : 0)) {
                Bank.withdraw((int)lIIIllIIllIll[6], (int)lIIIllIIllIll[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                var1.sleep(lIIIllIIllIll[3]);
            }
        }
        if (A.lIlIIIlIIIllIIl(Bank.isOpen() ? 1 : 0) && A.lIlIIIlIIIllIIl(var1.cx() ? 1 : 0)) {
            Bank.withdraw((int)lIIIllIIllIll[6], (int)lIIIllIIllIll[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
        if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIIllIll[3]];
            nArray4[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
            if (A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                if (A.lIlIIIlIIIllIIl(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)lIIIllIIllIll[7]);
                    return lIIIllIIllIll[0];
                }
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[10]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((String[])stringArray);
                if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2)) {
                    lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[12]]);
                    return lIIIllIIllIll[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[13], lIIIllIIllIll[14], lIIIllIIllIll[0]));

            }
        }
        int[] nArray5 = new int[lIIIllIIllIll[3]];
        nArray5[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
        if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && A.lIlIIIlIIIllIII(var1.cb(), lIIIllIIllIll[2])) {
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest(nPC -> {
                int n2;
                if (A.lIlIIIlIIIllIIl(nPC.getName().equals(lIIIllIIllIlI[lIIIllIIllIll[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIllIll[3]];
                    stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[28]];
                    if (A.lIlIIIlIIIllIIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIIllIIllIll[3];

                        if (-(0x29 ^ 0x53 ^ (0x74 ^ 0xA)) < 0) return n2 != 0;
                        return ((0x1E ^ 0x28 ^ (0x26 ^ 0xB)) & (0x53 ^ 0x66 ^ (0x63 ^ 0x4D) ^ -1)) != 0;
                    }
                }
                n2 = lIIIllIIllIll[0];
                return n2 != 0;
            });
            if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0) && A.lIlIIIlIIIlllII(lllllllllllllllIIIIlIlIIIIlllIlI2.getId(), lIIIllIIllIll[15])) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[16]]);
                return lIIIllIIllIll[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[17], lIIIllIIllIll[18], lIIIllIIllIll[0]));

        }
        if (A.lIlIIIlIIIllIlI(var1.cb(), lIIIllIIllIll[2])) {
            int[] nArray6 = new int[lIIIllIIllIll[3]];
            nArray6[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
            if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                if (A.lIlIIIlIIIlllII(Players.getLocal().getAnimation(), lIIIllIIllIll[19])) {
                    return lIIIllIIllIll[0];
                }
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[20]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getNearest((String[])stringArray);
                if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                    if (A.lIlIIIlIIIlIllI(Production.isOpen() ? 1 : 0)) {
                        lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[21]]);
                    }
                    Production.chooseOption((String)lIIIllIIllIlI[lIIIllIIllIll[22]]);
                    return lIIIllIIllIll[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[23], lIIIllIIllIll[24], lIIIllIIllIll[3]));

                return lIIIllIIllIll[0];
            }
            if (A.lIlIIIlIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIllIll[1]];
                dialogOptionArray[A.lIIIllIIllIll[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[3]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.lIIIllIIllIll[10]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[12]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[16]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[20]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[21]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[22]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[25]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[26]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[27]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.lIIIllIIllIll[28]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[29]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[30]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[31]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[32]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[33]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[34]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[35]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[36]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[2]] = DialogOption.NPC_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return lIIIllIIllIll[0];
            }
            int[] nArray7 = new int[lIIIllIIllIll[3]];
            nArray7[A.lIIIllIIllIll[0]] = lIIIllIIllIll[37];
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((int[])nArray7);
            if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[25]]);
                return lIIIllIIllIll[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[38], lIIIllIIllIll[39], lIIIllIIllIll[0]));

        }
        return lIIIllIIllIll[3];
    }

    public boolean cx() {
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
        if (A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIllIll[3]];
            nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
            if (A.lIlIIIlIIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIIIllIIllIlI[lIIIllIIllIll[26]]);
            }
            return lIIIllIIllIll[3];
        }
        return lIIIllIIllIll[0];
    }

    private int cb() {
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
        int[] nArray2 = new int[lIIIllIIllIll[3]];
        nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[5];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    @Inject
    public CompletingSheepShearerTask(SquireQuesterConfig squireQuesterConfig) {
        this.bx = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIIllIll(Object object) {
        return object != null;
    }

    private static void lIlIIIlIIIlIlII() {
        lIIIllIIllIlI = new String[lIIIllIIllIll[29]];
        A.lIIIllIIllIlI[A.lIIIllIIllIll[0]] = "Bank booth";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[3]] = "Bank";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[10]] = "Shop keeper";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[12]] = "Trade";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[16]] = "Shear";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[20]] = "Spinning wheel";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[21]] = "Spin";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[22]] = "Ball of Wool";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[25]] = "Talk-to";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[26]] = "We need coins";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[27]] = "Sheep";
        A.lIIIllIIllIlI[A.lIIIllIIllIll[28]] = "Shear";
    }

    private static boolean lIlIIIlIIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIIIllIIl(int n2) {
        return n2 != 0;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_SHEEP_SHEARER.c());
    }

    static {
        A.lIlIIIlIIIlIlIl();
        A.lIlIIIlIIIlIlII();
    }

    private static boolean lIlIIIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIIIlIIIlllII(int n2, int n3) {
        return n2 != n3;
    }

}

