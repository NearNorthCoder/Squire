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
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.AEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing Prince Ali Rescue -> CompletingprincealirescueTask */
@TaskDesc(name="Completing Prince Ali Rescue", register=true)
public class CompletingPrinceAliRescueTask
extends Task {
    /* synthetic */ Item bd;
    /* synthetic */ Item bm;
    private static /* synthetic */ String[] lIIIllIIIllIl;
    /* synthetic */ Item bf;
    /* synthetic */ Item bj;
    /* synthetic */ Item bb;
    /* synthetic */ Item bk;
    /* synthetic */ Item aW;
    private final /* synthetic */ SquireQuesterConfig aS;
    /* synthetic */ Item ba;
    /* synthetic */ Item bg;
    /* synthetic */ Item be;
    /* synthetic */ Item bl;
    /* synthetic */ Item aX;
    /* synthetic */ Item aV;
    private final /* synthetic */ SquireQuester aT;
    private static /* synthetic */ int[] lIIIllIIlIlll;
    /* synthetic */ Item aU;
    /* synthetic */ Item bh;
    /* synthetic */ Item bi;
    /* synthetic */ Item aZ;
    /* synthetic */ Item bc;
    /* synthetic */ Item bn;
    /* synthetic */ Item aY;

    private boolean bN() {
        w var16;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[27]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[28]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[29]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[30]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[31]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[32]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[73]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[33]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.a(lIIIllIIlIlll[74], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[21]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(var16.d(lIIIllIIlIlll[35]) ? 1 : 0)) {
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
        w var29;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var29.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[134]]);
        if (w.lIlIIIIlllllllI(var29.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[135];
            TileObject var3 = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(var3) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                var3.interact(lIIIllIIIllIl[lIIIllIIlIlll[136]]);
                0;
                if (((0x21 ^ 0x74 ^ (0xCB ^ 0x88)) & (0x82 ^ 0xB5 ^ (0x98 ^ 0xB9) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[137], lIIIllIIlIlll[138], lIIIllIIlIlll[0]));
                0;
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
        NPC var15 = NPCs.getNearest((int[])nArray3);
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
        if (w.lIlIIIIllllllll(var15) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
            var15.interact(lIIIllIIIllIl[lIIIllIIlIlll[50]]);
            0;
            
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[78], lIIIllIIlIlll[79], lIIIllIIlIlll[0]));
            0;
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
            void var43;
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[166]];
            List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[106], lIIIllIIlIlll[11]), (String[])stringArray);
            if (w.lIlIIIIlllllllI(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                0;
                return;
            }
            if (w.lIlIIIIllllllII(var43.size(), lIIIllIIlIlll[6])) {
                if (w.lIlIIIIlllllIlI(Reachable.isInteractable((Locatable)((Locatable)var43.get(lIIIllIIlIlll[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                    0;
                    return;
                }
                ((TileObject)var43.get(lIIIllIIlIlll[0])).interact(lIIIllIIIllIl[lIIIllIIlIlll[168]]);
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
        TileObject var59 = TileObjects.getNearest((int[])nArray2);
        if (w.lIlIIIIllllllll(var59) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var59) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
            Inventory.getFirst((int[])nArray3).useOn(var59);
            0;
            if (1 < 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var59.getWorldLocation());
            0;
        }
    }

    private void bY() {
        w var30;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var30.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var30.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[152]]);
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[153];
            TileObject var19 = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(var19) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var19) ? 1 : 0)) {
                var19.interact(lIIIllIIIllIl[lIIIllIIlIlll[154]]);
                0;
                if (-3 >= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[155], lIIIllIIlIlll[156], lIIIllIIlIlll[0]));
                0;
            }
        }
    }

    private void bS() {
        w var47;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (w.lIlIIIlIIIIIIII(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[76]) && w.lIlIIIIlllllllI(var47.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var47.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[102]]);
        if (w.lIlIIIIlllllllI(var47.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(var47.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                var47.ca();
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
        if (w.lIlIIIIlllllllI(var47.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var47.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
            TileObject var24 = TileObjects.getNearest((int[])nArray3);
            if (w.lIlIIIIllllllll(var24) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var24) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIIlIlll[6]];
                nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                Inventory.getFirst((int[])nArray4).useOn(var24);
                0;
                if ((71 + 35 - 56 + 92 ^ 27 + 118 - 27 + 20) <= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
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
    public w(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester) {
        this.aS = squireQuesterConfig;
        this.aT = squireQuester;
    }

    private void bX() {
        NPC var25;
        w var14;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var14.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[139]]);
        if (w.lIlIIIIlllllllI(var14.d(lIIIllIIlIlll[140]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                var14.ca();
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
        if (w.lIlIIIIlllllIlI(var14.d(lIIIllIIlIlll[140]) ? 1 : 0) && w.lIlIIIlIIIIIIII(var14.cb(), lIIIllIIlIlll[12])) {
            var25 = NPCs.getNearest(nPC -> {
                int n2;
                if (w.lIlIIIIlllllllI(nPC.getName().equals(lIIIllIIIllIl[lIIIllIIlIlll[173]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIlIlll[6]];
                    stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[174]];
                    if (w.lIlIIIIlllllllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIIllIIlIlll[6];
                        0;
                        if (((0xCF ^ 0x80) & ~(0x7C ^ 0x33)) > -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIIllIIlIlll[0];
                return n2 != 0;
            });
            if (w.lIlIIIIllllllll(var25) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var25) ? 1 : 0) && w.lIlIIIIlllllIll(var25.getId(), lIIIllIIlIlll[142])) {
                var25.interact(lIIIllIIIllIl[lIIIllIIlIlll[143]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[144], lIIIllIIlIlll[145], lIIIllIIlIlll[0]));
            0;
        }
        if (w.lIlIIIIllllllII(var14.cb(), lIIIllIIlIlll[12])) {
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
                var25 = TileObjects.getNearest((String[])stringArray);
                if (w.lIlIIIIllllllll(var25) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var25) ? 1 : 0)) {
                    if (w.lIlIIIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                        var25.interact(lIIIllIIIllIl[lIIIllIIlIlll[149]]);
                    }
                    Production.chooseOption((String)lIIIllIIIllIl[lIIIllIIlIlll[150]]);
                    return;
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[151], lIIIllIIlIlll[85], lIIIllIIlIlll[6]));
                0;
                return;
            }
        }
    }

    private void bR() {
        w var55;
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
                    0;
                    if (3 < 2) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[92], lIIIllIIlIlll[93], lIIIllIIlIlll[11]));
                    0;
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
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray)) && w.lIlIIIIlllllIlI(var55.aT.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIIlIlll[6]];
                    stringArray3[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[95]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIllIIIllIl[lIIIllIIlIlll[96]]);
                }
            }
        }
        if (w.lIlIIIIlllllllI(var55.aT.a() ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[72];
            if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[97]];
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[98]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIllIIIllIl[lIIIllIIlIlll[99]]);
                    0;
                    if (2 == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[100], lIIIllIIlIlll[101], lIIIllIIlIlll[0]));
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
        void var58;
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
        if (w.lIlIIIIllllllll(var58) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var58) ? 1 : 0)) {
            var58.interact(lIIIllIIIllIl[lIIIllIIlIlll[25]]);
            0;
            if ((0x13 ^ 0x17) <= 3) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]));
            0;
        }
    }

    private void bZ() {
        w var4;
        if (w.lIlIIIIlllllIlI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[172]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[158];
                    TileObject var32 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var32) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        var32.interact(lIIIllIIIllIl[lIIIllIIlIlll[159]]);
                        var4.sleep(lIIIllIIlIlll[12]);
                        0;
                        if (-1 > 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[160], lIIIllIIlIlll[161], lIIIllIIlIlll[0]));
                        0;
                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(var4.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    if (w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
                        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                            var4.ca();
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
                    if (w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var4.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                        int[] nArray = new int[lIIIllIIlIlll[6]];
                        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
                        TileObject var32 = TileObjects.getNearest((int[])nArray);
                        if (w.lIlIIIIllllllll(var32) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIllIIlIlll[6]];
                            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                            Inventory.getFirst((int[])nArray2).useOn(var32);
                            0;
                            if (3 < 3) {
                                return;
                            }
                        } else {
                            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
                            0;
                        }
                        return;
                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    var4.ca();
                    return;
                }
                if (w.lIlIIIIlllllllI(Bank.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[171]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[170]]), (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[163]]);
            }
            if (w.lIlIIIIlllllIlI(var4.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllllI(var4.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[164]]);
                int[] nArray = new int[lIIIllIIlIlll[6]];
                nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[71];
                int[] nArray3 = new int[lIIIllIIlIlll[6]];
                nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
                var4.sleepWhile(lIIIllIIlIlll[14], () -> {
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
        NPC var53 = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[35]);
        }
        if (w.lIlIIIIllllllll(var53) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var53) ? 1 : 0)) {
            var53.interact(lIIIllIIIllIl[lIIIllIIlIlll[51]]);
            0;
            if ((72 + 14 - -87 + 11 ^ 36 + 152 - 88 + 88) < 1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]));
            0;
        }
    }

    private static String lIlIIIIlllIIIIl(String var21, String var17) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var34 = var17.toCharArray();
        int var39 = lIIIllIIlIlll[0];
        char[] var49 = var21.toCharArray();
        int var36 = var49.length;
        int var52 = lIIIllIIlIlll[0];
        while (w.lIlIIIlIIIIIIII(var52, var36)) {
            char var20 = var49[var52];
            var13.append((char)(var20 ^ var34[var39 % var34.length]));
            0;
            ++var39;
            ++var52;
            0;
            if ((0xB3 ^ 0xB6) != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIlIIIIlllIIIlI(String var28, String var40) {
        try {
            SecretKeySpec var50 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var40.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIIllIIlIlll[11], var50);
            return new String(var1.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private void U() {
        w var38;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var38.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(var38.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(var38.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var38.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[53]]);
        if (w.lIlIIIIlllllllI(var38.d(lIIIllIIlIlll[83]) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[54]];
            TileItem var18 = TileItems.getNearest((String[])stringArray);
            if (w.lIlIIIIllllllll(var18) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
                var18.interact(lIIIllIIIllIl[lIIIllIIlIlll[55]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[84], lIIIllIIlIlll[85], lIIIllIIlIlll[0]));
            0;
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
                    0;
                    if (((9 + 10 - -170 + 28 ^ 126 + 101 - 198 + 104) & (1 ^ 0x6E ^ (0xBC ^ 0x8F) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    void var8;
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = var8;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());
                    0;
                    0;
                    if ((88 + 37 - 54 + 85 ^ 47 + 119 - 63 + 49) <= 2) {
                        return;
                    }
                }
            } else {
                void var9;
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[169]]);
                Walker.walkTo((WorldPoint)var9);
                0;
            }
        }
    }

    public boolean run() {
        w var22;
        if (w.lIlIIIIlllllIlI(this.aS.quest().equals((Object)h.PRINCE_ALI_RESCUE) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        int var57 = var22.Q();
        if (!w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[1]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[2]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[3]) || w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[4])) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIllllllIl(var57, lIIIllIIlIlll[5])) {
            return lIIIllIIlIlll[0];
        }
        System.out.println("[PRINCE_ALI_RESCUE] - Progress: " + var57);
        switch (var57) {
            case 0: {
                var22.N();
                var22.sleep(lIIIllIIlIlll[6]);
                var22.M();
                0;
                if (2 <= 3) break;
                return ((0xC ^ 0x22 ^ (0x7D ^ 0x30)) & (0xCB ^ 0xA8 ^ (8 ^ 0x5F) & ~(0xF3 ^ 0xA4) ^ -1)) != 0;
            }
            case 10: {
                var22.bM();
                0;
                if (-(0x26 ^ 0x38 ^ (0x35 ^ 0x2F)) < 0) break;
                return ((59 + 56 - -54 + 18 ^ 80 + 56 - 54 + 92) & (0x47 ^ 0x3C ^ (0xAF ^ 0xC1) ^ -1)) != 0;
            }
            case 20: {
                var22.bL();
                var22.bK();
                var22.bJ();
                var22.bI();
                var22.bH();
                var22.bG();
                var22.bF();
                0;
                if (-(0x30 ^ 0x35) < 0) break;
                return false;
            }
            case 30: {
                var22.bE();
                0;
                if (null == null) break;
                return ((0xC9 ^ 0xB4 ^ (0x5E ^ 0x1A)) & (0x77 ^ 0x10 ^ (0x4B ^ 0x15) ^ -1)) != 0;
            }
            case 31: {
                var22.bE();
                0;
                if (3 != 0) break;
                return ((0x4F ^ 0x2C ^ (0x40 ^ 0x16)) & (101 + 23 - 42 + 49 ^ 14 + 54 - -62 + 52 ^ -1)) != 0;
            }
            case 40: {
                var22.bD();
                0;
                if ((0xB6 ^ 0xB3) > 0) break;
                return false;
            }
            case 50: {
                var22.bC();
                var22.bB();
                0;
                if (1 == 1) break;
                return false;
            }
            case 100: {
                var22.R();
                0;
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
            0;
            
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

    private static String lIlIIIIlllIIIII(String var10, String var42) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var42.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIlll[23]), "DES");
            Cipher var54 = Cipher.getInstance("DES");
            var54.init(lIIIllIIlIlll[11], var23);
            return new String(var54.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PRINCE_ALI_RESCUE.c());
    }

    private void bV() {
        w var7;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var7.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[121]]);
        if (w.lIlIIIIlllllllI(var7.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[177]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(var7.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[123];
                    TileObject var11 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var11) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        var11.interact(lIIIllIIIllIl[lIIIllIIlIlll[124]]);
                        var7.sleep(lIIIllIIlIlll[12]);
                        0;
                        
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                        0;
                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllllI(var7.d(lIIIllIIlIlll[127]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[128];
                    TileObject var11 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var11) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
                        var11.interact(lIIIllIIIllIl[lIIIllIIlIlll[129]]);
                        var7.sleep(lIIIllIIlIlll[12]);
                        0;
                        if (-1 >= (0x84 ^ 0x80)) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                        0;
                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(var7.d(lIIIllIIlIlll[127]) ? 1 : 0) && w.lIlIIIIlllllIlI(var7.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[130];
                    TileObject var11 = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(var11) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllIIlIlll[6]];
                        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        Inventory.getFirst((int[])nArray2).useOn(var11);
                        0;
                        if (1 != 1) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[131], lIIIllIIlIlll[132], lIIIllIIlIlll[0]));
                        0;
                        return;
                    }
                    int[] nArray3 = new int[lIIIllIIlIlll[6]];
                    nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[122];
                    Inventory.getFirst((int[])nArray3).useOn(var11);
                    0;
                    
                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    var7.ca();
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
            0;
            if (((0x7B ^ 0x43) & ~(0xF8 ^ 0xC0)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]));
            0;
        }
    }

    private static boolean lIlIIIlIIIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, boolean bl) {
        void var31;
        void var26;
        void var33;
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = n2;
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIIIllIIlIlll[6];
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = var33;
        if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)var26, (int[])nArray2), (int)var31)) {
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
        NPC var51 = NPCs.getNearest((int[])nArray);
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
        if (w.lIlIIIIllllllll(var51) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var51) ? 1 : 0)) {
            var51.interact(lIIIllIIIllIl[lIIIllIIlIlll[26]]);
            0;
            if ((0x3A ^ 0x3E) == 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]));
            0;
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
        NPC var44 = NPCs.getNearest((int[])nArray4);
        if (w.lIlIIIIllllllll(var44) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIIIllIIlIlll[6]];
                nArray6[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
                Inventory.getFirst((int[])nArray6).useOn((Actor)var44);
                0;
                if (1 != 1) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            0;
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
        w var41;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var41.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[111]]);
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[70];
        TileItem var6 = TileItems.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[112];
        TileItem var48 = TileItems.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[113];
        TileObject var27 = TileObjects.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(var6)) {
            var6.interact(lIIIllIIIllIl[lIIIllIIlIlll[114]]);
            return;
        }
        if (w.lIlIIIIllllllll(var27)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[115]]);
            var41.sleep(lIIIllIIlIlll[14]);
        }
        int[] nArray4 = new int[lIIIllIIlIlll[6]];
        nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            if (w.lIlIIIIllllllll(var48) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var48) ? 1 : 0) && w.lIlIIIlIIIIIIIl(var27)) {
                var48.interact(lIIIllIIIllIl[lIIIllIIlIlll[117]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[118], lIIIllIIlIlll[119], lIIIllIIlIlll[11]));
            0;
            return;
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            var41.ca();
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

    private static void lIlIIIIlllllIIl() {
        lIIIllIIlIlll = new int[178];
        w.lIIIllIIlIlll[0] = (136 + 20 - 44 + 65 ^ 107 + 83 - 159 + 114) & (7 ^ 0x3D ^ (0xBF ^ 0xA5) ^ -1);
        w.lIIIllIIlIlll[1] = 0xFFFFBAF1 & 0x477F;
        w.lIIIllIIlIlll[2] = 0xFFFF8A7D & 0x77F2;
        w.lIIIllIIlIlll[3] = 0xFFFFEFE3 & 0x139F;
        w.lIIIllIIlIlll[4] = -(0xFFFFE813 & 0x5FEF) & (0xFFFFEEFF & 0x5BDF);
        w.lIIIllIIlIlll[5] = 6 ^ 0x42 ^ (0x65 ^ 0x4F);
        w.lIIIllIIlIlll[6] = 1;
        w.lIIIllIIlIlll[7] = -(0xFFFFB767 & 0x6AD9) & (0xFFFFFAFD & 0x37FF);
        w.lIIIllIIlIlll[8] = -(0x89 ^ 0x80) & (0xFFFFFCFF & 0xFEB);
        w.lIIIllIIlIlll[9] = -(0xFFFFFFA7 & 0x72FD) & (0xFFFFFEFF & Short.MAX_VALUE);
        w.lIIIllIIlIlll[10] = 0x49 ^ 0x77 ^ (0xFB ^ 0xC3);
        w.lIIIllIIlIlll[11] = 2;
        w.lIIIllIIlIlll[12] = 3;
        w.lIIIllIIlIlll[13] = 0x57 ^ 0x53;
        w.lIIIllIIlIlll[14] = 0x94 ^ 0x91;
        w.lIIIllIIlIlll[15] = 0xFFFFBFFB & 0x6D3D;
        w.lIIIllIIlIlll[16] = 239 + 17 - 35 + 24 ^ 13 + 10 - -28 + 133;
        w.lIIIllIIlIlll[17] = -(0xFFFFDD0F & 0x72FE) & (0xFFFFDB7F & 0x7DFF);
        w.lIIIllIIlIlll[18] = -(0xFFFFF3C1 & 0x4EFF) & (0xFFFFFFFB & 0x6FFF);
        w.lIIIllIIlIlll[19] = 0xFFFFBDFB & 0x4E37;
        w.lIIIllIIlIlll[20] = 0xFFFFCDE9 & 0x3EBF;
        w.lIIIllIIlIlll[21] = 0xA4 ^ 0xB7;
        w.lIIIllIIlIlll[22] = 0xE ^ 9;
        w.lIIIllIIlIlll[23] = 0x44 ^ 0x4C;
        w.lIIIllIIlIlll[24] = 146 + 127 - 186 + 60 ^ 52 + 94 - 3 + 11;
        w.lIIIllIIlIlll[25] = 0x1C ^ 0x16;
        w.lIIIllIIlIlll[26] = 0x47 ^ 0x39 ^ (0x77 ^ 2);
        w.lIIIllIIlIlll[27] = 0x43 ^ 0x4F;
        w.lIIIllIIlIlll[28] = 0x6A ^ 0x51 ^ (0x93 ^ 0xA5);
        w.lIIIllIIlIlll[29] = 0x3C ^ 0x32;
        w.lIIIllIIlIlll[30] = 0xB2 ^ 0xBD;
        w.lIIIllIIlIlll[31] = 0x2B ^ 0x3B;
        w.lIIIllIIlIlll[32] = 98 + 102 - 57 + 37 ^ 93 + 22 - 6 + 56;
        w.lIIIllIIlIlll[33] = 0x3E ^ 0x2C;
        w.lIIIllIIlIlll[34] = -(0xFFFFDD5D & 0x32E7) & (0xFFFFFF7E & 0x3DFF);
        w.lIIIllIIlIlll[35] = -(0xFFFFFFB7 & 0x6C4D) & (0xFFFFEFBE & Short.MAX_VALUE);
        w.lIIIllIIlIlll[36] = -(0xFFFFB1DB & 0x5FEE) & (0xFFFFFDFF & 0x1FFF);
        w.lIIIllIIlIlll[37] = -(0xFFFFF6F5 & 0x5B4B) & (0xFFFFFFFD & 0x5EEE);
        w.lIIIllIIlIlll[38] = 0xFFFFAFAF & 0x597D;
        w.lIIIllIIlIlll[39] = 0xFFFFEDF7 & 0x1B7F;
        w.lIIIllIIlIlll[40] = 0xFFFF90BB & 0x7FF6;
        w.lIIIllIIlIlll[41] = -(0xFFFFBB5D & 0x77F3) & (0xFFFFBF7F & 0x7FF6);
        w.lIIIllIIlIlll[42] = -(0xFFFFDBA7 & 0x255B) & (0xFFFF8FBF & 0x7DFF);
        w.lIIIllIIlIlll[43] = 0xFFFFDEBE & 0x31FF;
        w.lIIIllIIlIlll[44] = -(0xFFFFFE17 & 0x31EC) & (0xFFFFBCDF & 0x7FFB);
        w.lIIIllIIlIlll[45] = 0xFFFFBEFE & 0x4D6D;
        w.lIIIllIIlIlll[46] = -(0xFFFFFF83 & 0x507F) & (0xFFFFFFFB & 0x597E);
        w.lIIIllIIlIlll[47] = 0xA9 ^ 0x9D ^ (0x31 ^ 0x18);
        w.lIIIllIIlIlll[48] = 0x3B ^ 0x7E ^ (0x31 ^ 0x60);
        w.lIIIllIIlIlll[49] = 0x47 ^ 0x52;
        w.lIIIllIIlIlll[50] = 0x50 ^ 0x46;
        w.lIIIllIIlIlll[51] = 0x93 ^ 0x84;
        w.lIIIllIIlIlll[52] = 29 + 79 - 22 + 94 ^ 70 + 170 - 230 + 162;
        w.lIIIllIIlIlll[53] = 0x90 ^ 0x89;
        w.lIIIllIIlIlll[54] = 0x60 ^ 0x7A;
        w.lIIIllIIlIlll[55] = 0xB7 ^ 0x92 ^ (0x86 ^ 0xB8);
        w.lIIIllIIlIlll[56] = 0x12 ^ 0xE;
        w.lIIIllIIlIlll[57] = -(0xFFFFB5E7 & 0x6A99) & (0xFFFFEBFF & 0x3DF3);
        w.lIIIllIIlIlll[58] = -(0xFFFFAAA7 & 0x755C) & (0xFFFFB7FF & 0x78BF);
        w.lIIIllIIlIlll[59] = -(0xFFFFF177 & 0x5FF9) & (0xFFFFFDFE & 0x5F7F);
        w.lIIIllIIlIlll[60] = -(0xFFFFF629 & 0x6BD7) & (0xFFFFFFBB & 0x6EFF);
        w.lIIIllIIlIlll[61] = -(0xFFFFDF8B & 0x3975) & (0xFFFFFFFF & 0x1FE5);
        w.lIIIllIIlIlll[62] = -(0xFFFFE5DD & 0x5EAB) & (0xFFFFFFFF & 0x4DFD);
        w.lIIIllIIlIlll[63] = -(0xFFFFAE5B & 0x79AF) & (0xFFFFFFAF & 0x2FFF);
        w.lIIIllIIlIlll[64] = -(0xFFFFF765 & 0xFDF) & (0xFFFFB7FF & 0x5FFC);
        w.lIIIllIIlIlll[65] = 0xFFFFDF9E & 0x2C7B;
        w.lIIIllIIlIlll[66] = 0xFFFFBCBE & 0x4FFB;
        w.lIIIllIIlIlll[67] = 0xFFFFB7F3 & 0x4EED;
        w.lIIIllIIlIlll[68] = -(0xFFFFA3AB & 0x5D55) & (0xFFFFC7FF & 0x3FDF);
        w.lIIIllIIlIlll[69] = 0xFFFFA7BF & 0x5FDF;
        w.lIIIllIIlIlll[70] = -(0xFFFFCFA3 & 0x3CFF) & (0xFFFFAEFA & 0x5FF7);
        w.lIIIllIIlIlll[71] = -(0xFFFFD8F3 & 0x7F7F) & (0xFFFFFFFF & 0x5FFB);
        w.lIIIllIIlIlll[72] = 0xFFFF97EF & 0x6F9D;
        w.lIIIllIIlIlll[73] = -1 & (0xFFFFE3FF & 0x1FF5);
        w.lIIIllIIlIlll[74] = -(0xFFFFFCB3 & 0x7BCD) & (0xFFFFFFFD & Short.MAX_VALUE);
        w.lIIIllIIlIlll[75] = 0xFFFF8FF3 & 0x73EF;
        w.lIIIllIIlIlll[76] = 0xAF ^ 0xC1 ^ (0x3E ^ 0x34);
        w.lIIIllIIlIlll[77] = 0xFFFFEF23 & 0x15FC;
        w.lIIIllIIlIlll[78] = 0xFFFFBCFE & 0x4F99;
        w.lIIIllIIlIlll[79] = -(0xFFFFFA2B & 0x57FE) & (0xFFFFDF6F & Short.MAX_VALUE);
        w.lIIIllIIlIlll[80] = -(0xFFFFDFAF & 0x6653) & (0xFFFFFEEF & 0x6FFF);
        w.lIIIllIIlIlll[81] = 0xFFFFAD87 & 0x5EFE;
        w.lIIIllIIlIlll[82] = -(0xFFFFFEB3 & 0x63ED) & (0xFFFFFFF7 & 0x6FFF);
        w.lIIIllIIlIlll[83] = 0xFFFFAFDF & 0x57AB;
        w.lIIIllIIlIlll[84] = 0xFFFFADC7 & 0x5EBF;
        w.lIIIllIIlIlll[85] = 0xFFFF9D9E & 0x6EEF;
        w.lIIIllIIlIlll[86] = -(0xFFFFF669 & 0x7997) & (0xFFFFF7DF & 0x7FBB);
        w.lIIIllIIlIlll[87] = -(0xFFFFC3FF & 0x7C23) & (0xFFFFFFFB & 0x4C7F);
        w.lIIIllIIlIlll[88] = -(0xFFFF97FF & 0x7A24) & (0xFFFFBFFF & 0x5EFF);
        w.lIIIllIIlIlll[89] = 40 + 66 - 4 + 61 ^ 124 + 179 - 288 + 174;
        w.lIIIllIIlIlll[90] = 0xC1 ^ 0x8C ^ (0x62 ^ 0x30);
        w.lIIIllIIlIlll[91] = 0xB1 ^ 0x91;
        w.lIIIllIIlIlll[92] = -(0xFFFFFDFF & 0x2282) & (0xFFFFBCDF & 0x6FFD);
        w.lIIIllIIlIlll[93] = 0xFFFF8EFF & 0x7DEA;
        w.lIIIllIIlIlll[94] = 0x38 ^ 0x5E ^ (0x2C ^ 0x6B);
        w.lIIIllIIlIlll[95] = 0x6A ^ 0x5E ^ (0x48 ^ 0x5E);
        w.lIIIllIIlIlll[96] = 0xE5 ^ 0xC6;
        w.lIIIllIIlIlll[97] = 2 ^ 0x26;
        w.lIIIllIIlIlll[98] = 0x6D ^ 0x19 ^ (0x18 ^ 0x49);
        w.lIIIllIIlIlll[99] = 0x66 ^ 0x2F ^ (0xF0 ^ 0x9F);
        w.lIIIllIIlIlll[100] = -(0xFFFFEAFB & 0x1726) & (0xFFFF9F7F & 0x6EFF);
        w.lIIIllIIlIlll[101] = 0xFFFFDDE9 & 0x2EFF;
        w.lIIIllIIlIlll[102] = 0xEB ^ 0x8A ^ (0x29 ^ 0x6F);
        w.lIIIllIIlIlll[103] = 0xFFFF8FA5 & 0x77DF;
        w.lIIIllIIlIlll[104] = 33 + 78 - 32 + 159 ^ 80 + 135 - 140 + 123;
        w.lIIIllIIlIlll[105] = -(0xFFFFFD2B & 0x5ED5) & (0xFFFFDFEF & 0x7F7F);
        w.lIIIllIIlIlll[106] = -(0xFFFFF7B7 & 0x6B6B) & (0xFFFFFFFF & 0x6FB7);
        w.lIIIllIIlIlll[107] = -(0xFFFFF1F3 & 0x5F5F) & (0xFFFFFFDF & 0x5DFF);
        w.lIIIllIIlIlll[108] = 0xFFFFBFBF & 0x53C8;
        w.lIIIllIIlIlll[109] = 0x42 ^ 0x6B;
        w.lIIIllIIlIlll[110] = 94 + 112 - 176 + 153 ^ 117 + 34 - 116 + 122;
        w.lIIIllIIlIlll[111] = 4 ^ 0x2F;
        w.lIIIllIIlIlll[112] = 0xFFFFC5EF & 0x3FF7;
        w.lIIIllIIlIlll[113] = -(0xFFFF8F9F & 0x79E7) & (0xFFFFEFDF & 0x7FEF);
        w.lIIIllIIlIlll[114] = 0xB8 ^ 0x94;
        w.lIIIllIIlIlll[115] = 0x57 ^ 0x7A;
        w.lIIIllIIlIlll[116] = 0xFFFFCA7F & 0x37CE;
        w.lIIIllIIlIlll[117] = 0x25 ^ 0x76 ^ (7 ^ 0x7A);
        w.lIIIllIIlIlll[118] = -(0xFFFFF27B & 0x3DEF) & (0xFFFFFEEF & 0x3DFF);
        w.lIIIllIIlIlll[119] = -(0xFFFFE77D & 0x5AE7) & (0xFFFFDFFF & 0x6EFD);
        w.lIIIllIIlIlll[120] = 0x7C ^ 0x53;
        w.lIIIllIIlIlll[121] = 0x5E ^ 0x6E;
        w.lIIIllIIlIlll[122] = 0xFFFFC3BC & 0x3DF7;
        w.lIIIllIIlIlll[123] = 0xFFFFFF9F & 0x2BF9;
        w.lIIIllIIlIlll[124] = 0x9E ^ 0xAF;
        w.lIIIllIIlIlll[125] = 0xFFFF8F9B & 0x7CFF;
        w.lIIIllIIlIlll[126] = 0xFFFF9E5B & 0x6DEF;
        w.lIIIllIIlIlll[127] = 0xFFFFF9BE & 0x7F7;
        w.lIIIllIIlIlll[128] = 0xFFFFEE69 & 0x3DF6;
        w.lIIIllIIlIlll[129] = 158 + 104 - 259 + 182 ^ 95 + 21 - 65 + 88;
        w.lIIIllIIlIlll[130] = 0xFFFFFDDF & 0x5FE9;
        w.lIIIllIIlIlll[131] = -(0xFFFFBB76 & 0x66EB) & (0xFFFFAFFF & 0x7EFB);
        w.lIIIllIIlIlll[132] = 0xFFFFAFFE & 0x5CB7;
        w.lIIIllIIlIlll[133] = 135 + 41 - 117 + 99 ^ 45 + 40 - -9 + 79;
        w.lIIIllIIlIlll[134] = 0x1B ^ 0x2F;
        w.lIIIllIIlIlll[135] = -(0x71 ^ 0x2B) & (0xFFFF8FFF & 0x7D7F);
        w.lIIIllIIlIlll[136] = 90 + 183 - 197 + 113 ^ 126 + 124 - 201 + 87;
        w.lIIIllIIlIlll[137] = -(0xFFFFE4B7 & 0x5BCB) & (0xFFFFDDFF & 0x6EF7);
        w.lIIIllIIlIlll[138] = -(0xFFFFB795 & 0x697B) & (0xFFFFFDFF & 0x2FD3);
        w.lIIIllIIlIlll[139] = 64 + 50 - 44 + 95 ^ 27 + 144 - 61 + 37;
        w.lIIIllIIlIlll[140] = 0xFFFF8FFF & 0x76C7;
        w.lIIIllIIlIlll[141] = 0x27 ^ 0x16 ^ (0xA5 ^ 0xA3);
        w.lIIIllIIlIlll[142] = -(0xFFFFFFC9 & 0x7837) & (0xFFFFFADB & Short.MAX_VALUE);
        w.lIIIllIIlIlll[143] = 0xAC ^ 0x94;
        w.lIIIllIIlIlll[144] = 0xFFFFBFEB & 0x4C94;
        w.lIIIllIIlIlll[145] = 0xFFFF9FF5 & 0x6CCA;
        w.lIIIllIIlIlll[146] = 0xFFFFE6FF & 0x1FC9;
        w.lIIIllIIlIlll[147] = -1;
        w.lIIIllIIlIlll[148] = 0x2C ^ 0x15;
        w.lIIIllIIlIlll[149] = 0x6F ^ 0x55;
        w.lIIIllIIlIlll[150] = 0x69 ^ 0x52;
        w.lIIIllIIlIlll[151] = 0xFFFFDCAA & 0x2FDF;
        w.lIIIllIIlIlll[152] = 150 + 83 - 217 + 140 ^ 118 + 46 - 19 + 15;
        w.lIIIllIIlIlll[153] = 0xFFFFFFFF & 0x5C4C;
        w.lIIIllIIlIlll[154] = 0x61 ^ 0x5C;
        w.lIIIllIIlIlll[155] = 0xFFFF9FFF & 0x6CCC;
        w.lIIIllIIlIlll[156] = -(0xFFFFFEF7 & 0x134B) & (0xFFFFFF6E & 0x1FFF);
        w.lIIIllIIlIlll[157] = -(0xFFFFDF7F & 0x328D) & (0xFFFFB3BF & 0x5FFE);
        w.lIIIllIIlIlll[158] = 0xFFFFEEFB & 0x3D66;
        w.lIIIllIIlIlll[159] = 6 + 25 - -105 + 7 ^ 139 + 77 - 126 + 87;
        w.lIIIllIIlIlll[160] = -(0xFFFFF53D & 0x4AD7) & (0xFFFFCC7F & Short.MAX_VALUE);
        w.lIIIllIIlIlll[161] = -(0xFFFFE384 & 0x5E7F) & (0xFFFFFFAF & 0x4F7B);
        w.lIIIllIIlIlll[162] = 85 + 5 - 18 + 68 ^ 57 + 108 - 54 + 68;
        w.lIIIllIIlIlll[163] = 0xF ^ 0x46 ^ (0x19 ^ 0x10);
        w.lIIIllIIlIlll[164] = 0x66 ^ 0x27;
        w.lIIIllIIlIlll[165] = -(0xFFFFEFFD & 0x7323) & (0xFFFFEFFE & 0x7FA9);
        w.lIIIllIIlIlll[166] = 63 + 170 - 57 + 71 ^ 151 + 30 - 169 + 169;
        w.lIIIllIIlIlll[167] = 0xFFFFCED7 & 0x3DBA;
        w.lIIIllIIlIlll[168] = 122 + 90 - 39 + 53 ^ 136 + 158 - 162 + 29;
        w.lIIIllIIlIlll[169] = 0x57 ^ 0x13;
        w.lIIIllIIlIlll[170] = 0x3D ^ 0x16 ^ (0x59 ^ 0x37);
        w.lIIIllIIlIlll[171] = 0x5B ^ 0x1D;
        w.lIIIllIIlIlll[172] = 0x8B ^ 0xC4 ^ (0xB2 ^ 0xBA);
        w.lIIIllIIlIlll[173] = 220 + 215 - 374 + 172 ^ 124 + 42 - 35 + 30;
        w.lIIIllIIlIlll[174] = 0x6A ^ 0x23;
        w.lIIIllIIlIlll[175] = 0xE4 ^ 0xAE;
        w.lIIIllIIlIlll[176] = 0xF0 ^ 0xBB;
        w.lIIIllIIlIlll[177] = 0xCE ^ 0x82;
    }

    private static void lIlIIIIlllllIII() {
        lIIIllIIIllIl = new String[lIIIllIIlIlll[16]];
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[0]] = w."Leaving cell";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[6]] = w."Out of cell";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[11]] = w."Returning false";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[12]] = w."Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[13]] = w."Walking to NPC";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[14]] = w."making paste";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[10]] = w."Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[22]] = w."Talking to aggie2";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[23]] = w."Making wig";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[24]] = w."Talking to aggie";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[25]] = w."Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[26]] = w."Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[27]] = w."We are missing BALL_OF_WOOL";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[28]] = w."We are missing REDBERRIES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[29]] = w."We are missing ASHES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[30]] = w."We are missing BUCKET_OF_WATER";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[31]] = w."We are missing POT_OF_FLOUR";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[32]] = w."We are missing BRONZE_BAR";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[33]] = w."We are missing PINK_SKIRT";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[21]] = w."We are missing BEERs";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[48]] = w."We are missing ROPE";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[49]] = w."We are missing COINS";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[50]] = w."Talk-to";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[51]] = w."Trade";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[52]] = w."Trade";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[53]] = w."Collecting POT OF FLOUR.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[54]] = w."Pot";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[55]] = w."Take";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[56]] = w."Wheat";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[47]] = w."Pick";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[89]] = w."Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[90]] = w."Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[91]] = w."Fill";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[94]] = w."Hopper";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[95]] = w."Hopper controls";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[96]] = w."Operate";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[97]] = w."Flour bin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[98]] = w."Flour bin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[99]] = w."Empty";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[102]] = w."Collecting BUCKET OF WATER.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[104]] = w."You are going to need a bucket for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[109]] = w."Collecting COINS.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[110]] = w."You are going to need at least 5,000 coins for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[111]] = w."Collecting ASHES.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[114]] = w."Take";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[115]] = w."Waiting for fire to burn";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[117]] = w."Light";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[120]] = w."You are going to need a tinderbox for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[121]] = w."Collecting BRONZE_BARs.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[124]] = w."Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[129]] = w."Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[133]] = w."You are going to need a pickaxe for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[134]] = w."Collecting ONIONs.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[136]] = w."Pick";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[139]] = w."Collecting BALL_OF_WOOL";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[141]] = w."You are going to need a shears for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[143]] = w."Shear";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[148]] = w."Spinning wheel";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[149]] = w."Spin";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[150]] = w."Ball of Wool";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[152]] = w."Collecting REDBERRIES";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[154]] = w."Pick-from";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[159]] = w."Mine";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[162]] = w."You are going to need a bucket for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[163]] = w."You are going to need a pickaxe for this quest.";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[164]] = w."MAKING SOFT CLAY";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[166]] = w."Bank booth";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[168]] = w."Bank";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[169]] = w."Walking to location";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[170]] = w."pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[171]] = w."pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[172]] = w."pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[173]] = w."Sheep";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[174]] = w."Shear";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[175]] = w."pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[176]] = w."pickaxe";
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[177]] = w."pickaxe";
    }

    private static boolean lIlIIIIlllllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var46;
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = var46;
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIllllllll(var2) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(lIIIllIIIllIl[lIIIllIIlIlll[12]]);
            0;
            if (-2 > 0) {
                return;
            }
        } else {
            void var12;
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[13]]);
            Walker.walkTo((WorldPoint)var12);
            0;
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
        NPC var45 = NPCs.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(var45) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var45) ? 1 : 0)) {
            var45.interact(lIIIllIIIllIl[lIIIllIIlIlll[10]]);
            0;
            if (-(161 + 82 - 189 + 115 ^ 36 + 94 - 51 + 94) >= 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[22]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            0;
        }
    }

    private static boolean lIlIIIIllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private void bT() {
        w var35;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(var35.d(lIIIllIIlIlll[75]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[108])) {
                return;
            }
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            var35.ca();
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
        NPC var56 = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[73]);
        }
        if (w.lIlIIIIllllllll(var56) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)var56) ? 1 : 0)) {
            var56.interact(lIIIllIIIllIl[lIIIllIIlIlll[52]]);
            0;
            if (-1 >= 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[81], lIIIllIIlIlll[82], lIIIllIIlIlll[0]));
            0;
            return;
        }
    }

    private static boolean lIlIIIIllllllII(int n2, int n3) {
        return n2 == n3;
    }
}

