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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Prince Ali Rescue", register=true)
public class w
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
        w lllllllllllllllIIIIlIlIlIIllllII;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[27]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[28]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[29]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[30]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[31]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[32]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[73]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[33]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.a(lIIIllIIlIlll[74], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[21]]);
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIllllII.d(lIIIllIIlIlll[35]) ? 1 : 0)) {
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
        w lllllllllllllllIIIIlIlIlIIIlIlIl;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIlIlIl.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[134]]);
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIlIlIl.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[135];
            TileObject lllllllllllllllIIIIlIlIlIIIlIlII = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIlIlII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIlIlII) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIlIIIlIlII.interact(lIIIllIIIllIl[lIIIllIIlIlll[136]]);
                "".length();
                if (((0x21 ^ 0x74 ^ (0xCB ^ 0x88)) & (0x82 ^ 0xB5 ^ (0x98 ^ 0xB9) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[137], lIIIllIIlIlll[138], lIIIllIIlIlll[0]));
                "".length();
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
        NPC lllllllllllllllIIIIlIlIlIIlllIII = NPCs.getNearest((int[])nArray3);
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
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIlllIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIlllIII) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIlllIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[50]]);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[78], lIIIllIIlIlll[79], lIIIllIIlIlll[0]));
            "".length();
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
            void lllllllllllllllIIIIlIlIlIIIIIllI;
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[166]];
            List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[106], lIIIllIIlIlll[11]), (String[])stringArray);
            if (w.lIlIIIIlllllllI(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                "".length();
                return;
            }
            if (w.lIlIIIIllllllII(lllllllllllllllIIIIlIlIlIIIIIllI.size(), lIIIllIIlIlll[6])) {
                if (w.lIlIIIIlllllIlI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIlIlIIIIIllI.get(lIIIllIIlIlll[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                    "".length();
                    return;
                }
                ((TileObject)lllllllllllllllIIIIlIlIlIIIIIllI.get(lIIIllIIlIlll[0])).interact(lIIIllIIIllIl[lIIIllIIlIlll[168]]);
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
        TileObject lllllllllllllllIIIIlIlIlIlIlllII = TileObjects.getNearest((int[])nArray2);
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIlIlllII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIlIlllII) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
            Inventory.getFirst((int[])nArray3).useOn(lllllllllllllllIIIIlIlIlIlIlllII);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIlIlIlIlllII.getWorldLocation());
            "".length();
        }
    }

    private void bY() {
        w lllllllllllllllIIIIlIlIlIIIIllIl;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIIllIl.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIllIl.d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[152]]);
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[153];
            TileObject lllllllllllllllIIIIlIlIlIIIIllII = TileObjects.getNearest((int[])nArray);
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIIllII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIIllII) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIlIIIIllII.interact(lIIIllIIIllIl[lIIIllIIlIlll[154]]);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[155], lIIIllIIlIlll[156], lIIIllIIlIlll[0]));
                "".length();
            }
        }
    }

    private void bS() {
        w lllllllllllllllIIIIlIlIlIIlIIlll;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (w.lIlIIIlIIIIIIII(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[76]) && w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[102]]);
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                lllllllllllllllIIIIlIlIlIIlIIlll.ca();
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
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIIlll.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIIlIlll[6]];
            nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
            TileObject lllllllllllllllIIIIlIlIlIIlIIllI = TileObjects.getNearest((int[])nArray3);
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIlIIllI) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIlIIllI) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIIlIlll[6]];
                nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                Inventory.getFirst((int[])nArray4).useOn(lllllllllllllllIIIIlIlIlIIlIIllI);
                "".length();
                if ((71 + 35 - 56 + 92 ^ 27 + 118 - 27 + 20) <= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
                "".length();
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
        NPC lllllllllllllllIIIIlIlIlIIIlIIII;
        w lllllllllllllllIIIIlIlIlIIIlIIIl;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIlIIIl.a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[139]]);
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIlIIIl.d(lIIIllIIlIlll[140]) ? 1 : 0)) {
            if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                lllllllllllllllIIIIlIlIlIIIlIIIl.ca();
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
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIlIIIl.d(lIIIllIIlIlll[140]) ? 1 : 0) && w.lIlIIIlIIIIIIII(lllllllllllllllIIIIlIlIlIIIlIIIl.cb(), lIIIllIIlIlll[12])) {
            lllllllllllllllIIIIlIlIlIIIlIIII = NPCs.getNearest(nPC -> {
                int n2;
                if (w.lIlIIIIlllllllI(nPC.getName().equals(lIIIllIIIllIl[lIIIllIIlIlll[173]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIlIlll[6]];
                    stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[174]];
                    if (w.lIlIIIIlllllllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIIllIIlIlll[6];
                        "".length();
                        if (((0xCF ^ 0x80) & ~(0x7C ^ 0x33)) > -" ".length()) return n2 != 0;
                        return ((0x6A ^ 0x47) & ~(0x6D ^ 0x40)) != 0;
                    }
                }
                n2 = lIIIllIIlIlll[0];
                return n2 != 0;
            });
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIlIIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIlIIII) ? 1 : 0) && w.lIlIIIIlllllIll(lllllllllllllllIIIIlIlIlIIIlIIII.getId(), lIIIllIIlIlll[142])) {
                lllllllllllllllIIIIlIlIlIIIlIIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[143]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[144], lIIIllIIlIlll[145], lIIIllIIlIlll[0]));
            "".length();
        }
        if (w.lIlIIIIllllllII(lllllllllllllllIIIIlIlIlIIIlIIIl.cb(), lIIIllIIlIlll[12])) {
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
                lllllllllllllllIIIIlIlIlIIIlIIII = TileObjects.getNearest((String[])stringArray);
                if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIlIIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIlIIII) ? 1 : 0)) {
                    if (w.lIlIIIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                        lllllllllllllllIIIIlIlIlIIIlIIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[149]]);
                    }
                    Production.chooseOption((String)lIIIllIIIllIl[lIIIllIIlIlll[150]]);
                    return;
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[151], lIIIllIIlIlll[85], lIIIllIIlIlll[6]));
                "".length();
                return;
            }
        }
    }

    private void bR() {
        w lllllllllllllllIIIIlIlIlIIlIlIlI;
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
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[92], lIIIllIIlIlll[93], lIIIllIIlIlll[11]));
                    "".length();
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
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray)) && w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIlIlI.aT.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIIlIlll[6]];
                    stringArray3[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[95]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIllIIIllIl[lIIIllIIlIlll[96]]);
                }
            }
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIlIlI.aT.a() ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[72];
            if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIlIlll[6]];
                stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[97]];
                if (w.lIlIIIIllllllll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[98]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIllIIIllIl[lIIIllIIlIlll[99]]);
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[100], lIIIllIIlIlll[101], lIIIllIIlIlll[0]));
                    "".length();
                    return;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void bM() {
        void lllllllllllllllIIIIlIlIlIlIIIIlI;
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
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIlIIIIlI) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIlIIIIlI) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIlIIIIlI.interact(lIIIllIIIllIl[lIIIllIIlIlll[25]]);
            "".length();
            if ((0x13 ^ 0x17) <= "   ".length()) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]));
            "".length();
        }
    }

    private void bZ() {
        w lllllllllllllllIIIIlIlIlIIIIlIIl;
        if (w.lIlIIIIlllllIlI(this.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[172]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[158];
                    TileObject lllllllllllllllIIIIlIlIlIIIIlIII = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIIlIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIIlIII) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        lllllllllllllllIIIIlIlIlIIIIlIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[159]]);
                        lllllllllllllllIIIIlIlIlIIIIlIIl.sleep(lIIIllIIlIlll[12]);
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[160], lIIIllIIlIlll[161], lIIIllIIlIlll[0]));
                        "".length();
                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[103]) ? 1 : 0) && w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[71]) ? 1 : 0)) {
                        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                            lllllllllllllllIIIIlIlIlIIIIlIIl.ca();
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
                    if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                        int[] nArray = new int[lIIIllIIlIlll[6]];
                        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
                        TileObject lllllllllllllllIIIIlIlIlIIIIlIII = TileObjects.getNearest((int[])nArray);
                        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIIlIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIIlIII) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIllIIlIlll[6]];
                            nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                            Inventory.getFirst((int[])nArray2).useOn(lllllllllllllllIIIIlIlIlIIIIlIII);
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return;
                            }
                        } else {
                            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
                            "".length();
                        }
                        return;
                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    lllllllllllllllIIIIlIlIlIIIIlIIl.ca();
                    return;
                }
                if (w.lIlIIIIlllllllI(Bank.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[171]])) ? 1 : 0)) {
                    Bank.withdraw(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[170]]), (int)lIIIllIIlIlll[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return;
                }
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[163]]);
            }
            if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIIlIIl.d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[164]]);
                int[] nArray = new int[lIIIllIIlIlll[6]];
                nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[71];
                int[] nArray3 = new int[lIIIllIIlIlll[6]];
                nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
                lllllllllllllllIIIIlIlIlIIIIlIIl.sleepWhile(lIIIllIIlIlll[14], () -> {
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
        NPC lllllllllllllllIIIIlIlIlIIllIlII = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[35]);
        }
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIllIlII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIllIlII) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIllIlII.interact(lIIIllIIIllIl[lIIIllIIlIlll[51]]);
            "".length();
            if ((72 + 14 - -87 + 11 ^ 36 + 152 - 88 + 88) < " ".length()) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]));
            "".length();
        }
    }

    private static String lIlIIIIlllIIIIl(String lllllllllllllllIIIIlIlIIllIlllII, String lllllllllllllllIIIIlIlIIllIllIll) {
        lllllllllllllllIIIIlIlIIllIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIlIIllIllIlI = new StringBuilder();
        char[] lllllllllllllllIIIIlIlIIllIllIIl = lllllllllllllllIIIIlIlIIllIllIll.toCharArray();
        int lllllllllllllllIIIIlIlIIllIllIII = lIIIllIIlIlll[0];
        char[] lllllllllllllllIIIIlIlIIllIlIIlI = lllllllllllllllIIIIlIlIIllIlllII.toCharArray();
        int lllllllllllllllIIIIlIlIIllIlIIIl = lllllllllllllllIIIIlIlIIllIlIIlI.length;
        int lllllllllllllllIIIIlIlIIllIlIIII = lIIIllIIlIlll[0];
        while (w.lIlIIIlIIIIIIII(lllllllllllllllIIIIlIlIIllIlIIII, lllllllllllllllIIIIlIlIIllIlIIIl)) {
            char lllllllllllllllIIIIlIlIIllIlllIl = lllllllllllllllIIIIlIlIIllIlIIlI[lllllllllllllllIIIIlIlIIllIlIIII];
            lllllllllllllllIIIIlIlIIllIllIlI.append((char)(lllllllllllllllIIIIlIlIIllIlllIl ^ lllllllllllllllIIIIlIlIIllIllIIl[lllllllllllllllIIIIlIlIIllIllIII % lllllllllllllllIIIIlIlIIllIllIIl.length]));
            "".length();
            ++lllllllllllllllIIIIlIlIIllIllIII;
            ++lllllllllllllllIIIIlIlIIllIlIIII;
            "".length();
            if ((0xB3 ^ 0xB6) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIlIIllIllIlI);
    }

    private static String lIlIIIIlllIIIlI(String lllllllllllllllIIIIlIlIIllIIIlll, String lllllllllllllllIIIIlIlIIllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIlIIllIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIlIIllIIlIIl.init(lIIIllIIlIlll[11], lllllllllllllllIIIIlIlIIllIIlIlI);
            return new String(lllllllllllllllIIIIlIlIIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlIIllIIlIII) {
            lllllllllllllllIIIIlIlIIllIIlIII.printStackTrace();
            return null;
        }
    }

    private void U() {
        w lllllllllllllllIIIIlIlIlIIlIllIl;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIllIl.d(lIIIllIIlIlll[71]) ? 1 : 0) && w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIllIl.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIllIl.d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIllIl.d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[53]]);
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIlIllIl.d(lIIIllIIlIlll[83]) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIlll[6]];
            stringArray[w.lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[54]];
            TileItem lllllllllllllllIIIIlIlIlIIlIllII = TileItems.getNearest((String[])stringArray);
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIlIllII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIlIllII) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIlIIlIllII.interact(lIIIllIIIllIl[lIIIllIIlIlll[55]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[84], lIIIllIIlIlll[85], lIIIllIIlIlll[0]));
            "".length();
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
                    "".length();
                    if (((9 + 10 - -170 + 28 ^ 126 + 101 - 198 + 104) & (1 ^ 0x6E ^ (0xBC ^ 0x8F) ^ -" ".length())) != 0) {
                        return;
                    }
                } else {
                    void lllllllllllllllIIIIlIlIIllllIlll;
                    String[] stringArray4 = new String[lIIIllIIlIlll[6]];
                    stringArray4[w.lIIIllIIlIlll[0]] = lllllllllllllllIIIIlIlIIllllIlll;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());
                    "".length();
                    "".length();
                    if ((88 + 37 - 54 + 85 ^ 47 + 119 - 63 + 49) <= "  ".length()) {
                        return;
                    }
                }
            } else {
                void lllllllllllllllIIIIlIlIIlllllIII;
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[169]]);
                Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIlIIlllllIII);
                "".length();
            }
        }
    }

    public boolean run() {
        w lllllllllllllllIIIIlIlIlIllIlIll;
        if (w.lIlIIIIlllllIlI(this.aS.quest().equals((Object)h.PRINCE_ALI_RESCUE) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        int lllllllllllllllIIIIlIlIlIllIlIlI = lllllllllllllllIIIIlIlIlIllIlIll.Q();
        if (!w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[1]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[2]) || !w.lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[3]) || w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[4])) {
            return lIIIllIIlIlll[0];
        }
        if (w.lIlIIIIllllllIl(lllllllllllllllIIIIlIlIlIllIlIlI, lIIIllIIlIlll[5])) {
            return lIIIllIIlIlll[0];
        }
        System.out.println("[PRINCE_ALI_RESCUE] - Progress: " + lllllllllllllllIIIIlIlIlIllIlIlI);
        switch (lllllllllllllllIIIIlIlIlIllIlIlI) {
            case 0: {
                lllllllllllllllIIIIlIlIlIllIlIll.N();
                lllllllllllllllIIIIlIlIlIllIlIll.sleep(lIIIllIIlIlll[6]);
                lllllllllllllllIIIIlIlIlIllIlIll.M();
                "".length();
                if ("  ".length() <= "   ".length()) break;
                return ((0xC ^ 0x22 ^ (0x7D ^ 0x30)) & (0xCB ^ 0xA8 ^ (8 ^ 0x5F) & ~(0xF3 ^ 0xA4) ^ -" ".length())) != 0;
            }
            case 10: {
                lllllllllllllllIIIIlIlIlIllIlIll.bM();
                "".length();
                if (-(0x26 ^ 0x38 ^ (0x35 ^ 0x2F)) < 0) break;
                return ((59 + 56 - -54 + 18 ^ 80 + 56 - 54 + 92) & (0x47 ^ 0x3C ^ (0xAF ^ 0xC1) ^ -" ".length())) != 0;
            }
            case 20: {
                lllllllllllllllIIIIlIlIlIllIlIll.bL();
                lllllllllllllllIIIIlIlIlIllIlIll.bK();
                lllllllllllllllIIIIlIlIlIllIlIll.bJ();
                lllllllllllllllIIIIlIlIlIllIlIll.bI();
                lllllllllllllllIIIIlIlIlIllIlIll.bH();
                lllllllllllllllIIIIlIlIlIllIlIll.bG();
                lllllllllllllllIIIIlIlIlIllIlIll.bF();
                "".length();
                if (-(0x30 ^ 0x35) < 0) break;
                return ((0x56 ^ 0x5B) & ~(0x76 ^ 0x7B)) != 0;
            }
            case 30: {
                lllllllllllllllIIIIlIlIlIllIlIll.bE();
                "".length();
                if (null == null) break;
                return ((0xC9 ^ 0xB4 ^ (0x5E ^ 0x1A)) & (0x77 ^ 0x10 ^ (0x4B ^ 0x15) ^ -" ".length())) != 0;
            }
            case 31: {
                lllllllllllllllIIIIlIlIlIllIlIll.bE();
                "".length();
                if ("   ".length() != 0) break;
                return ((0x4F ^ 0x2C ^ (0x40 ^ 0x16)) & (101 + 23 - 42 + 49 ^ 14 + 54 - -62 + 52 ^ -" ".length())) != 0;
            }
            case 40: {
                lllllllllllllllIIIIlIlIlIllIlIll.bD();
                "".length();
                if ((0xB6 ^ 0xB3) > 0) break;
                return ((0x88 ^ 0xB7) & ~(0x45 ^ 0x7A)) != 0;
            }
            case 50: {
                lllllllllllllllIIIIlIlIlIllIlIll.bC();
                lllllllllllllllIIIIlIlIlIllIlIll.bB();
                "".length();
                if (" ".length() == " ".length()) break;
                return ((16 + 110 - 73 + 89 ^ 171 + 190 - 321 + 151) & (46 + 166 - 52 + 30 ^ 0 + 31 - -36 + 76 ^ -" ".length())) != 0;
            }
            case 100: {
                lllllllllllllllIIIIlIlIlIllIlIll.R();
                "".length();
                if ((140 + 132 - 142 + 55 ^ 178 + 127 - 188 + 71) > 0) break;
                return ((86 + 52 - 99 + 139 ^ 131 + 11 - 92 + 108) & (29 + 67 - -33 + 4 ^ 137 + 73 - 180 + 139 ^ -" ".length())) != 0;
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
            "".length();
            if (null != null) {
                return ((0x17 ^ 0x28) & ~(0xB4 ^ 0x8B)) != 0;
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

    private static String lIlIIIIlllIIIII(String lllllllllllllllIIIIlIlIIlllIlIlI, String lllllllllllllllIIIIlIlIIlllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIlll[23]), "DES");
            Cipher lllllllllllllllIIIIlIlIIlllIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIlIIlllIlllI.init(lIIIllIIlIlll[11], lllllllllllllllIIIIlIlIIlllIllll);
            return new String(lllllllllllllllIIIIlIlIIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlIIlllIllIl) {
            lllllllllllllllIIIIlIlIIlllIllIl.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PRINCE_ALI_RESCUE.c());
    }

    private void bV() {
        w lllllllllllllllIIIIlIlIlIIIllIIl;
        if (w.lIlIIIIlllllllI(this.a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[121]]);
        if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            if (w.lIlIIIIlllllllI(Inventory.contains(item -> item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[177]])) ? 1 : 0)) {
                if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[123];
                    TileObject lllllllllllllllIIIIlIlIlIIIllIII = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIllIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIllIII) ? 1 : 0)) {
                        if (w.lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                            return;
                        }
                        lllllllllllllllIIIIlIlIlIIIllIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[124]]);
                        lllllllllllllllIIIIlIlIlIIIllIIl.sleep(lIIIllIIlIlll[12]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                        "".length();
                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllllI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[127]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[128];
                    TileObject lllllllllllllllIIIIlIlIlIIIllIII = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIllIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIllIII) ? 1 : 0)) {
                        lllllllllllllllIIIIlIlIlIIIllIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[129]]);
                        lllllllllllllllIIIIlIlIlIIIllIIl.sleep(lIIIllIIlIlll[12]);
                        "".length();
                        if (-" ".length() >= (0x84 ^ 0x80)) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                        "".length();
                        return;
                    }
                    return;
                }
                if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[127]) ? 1 : 0) && w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIllIIl.d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                    int[] nArray = new int[lIIIllIIlIlll[6]];
                    nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[130];
                    TileObject lllllllllllllllIIIIlIlIlIIIllIII = TileObjects.getNearest((int[])nArray);
                    if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIllIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIllIII) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllIIlIlll[6]];
                        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        Inventory.getFirst((int[])nArray2).useOn(lllllllllllllllIIIIlIlIlIIIllIII);
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    } else {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[131], lIIIllIIlIlll[132], lIIIllIIlIlll[0]));
                        "".length();
                        return;
                    }
                    int[] nArray3 = new int[lIIIllIIlIlll[6]];
                    nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[122];
                    Inventory.getFirst((int[])nArray3).useOn(lllllllllllllllIIIIlIlIlIIIllIII);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            } else {
                if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    lllllllllllllllIIIIlIlIlIIIllIIl.ca();
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
            "".length();
            if (((0x7B ^ 0x43) & ~(0xF8 ^ 0xC0)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]));
            "".length();
        }
    }

    private static boolean lIlIIIlIIIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, boolean bl) {
        void lllllllllllllllIIIIlIlIIllllllll;
        void lllllllllllllllIIIIlIlIIlllllllI;
        void lllllllllllllllIIIIlIlIlIIIIIIII;
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = n2;
        if (w.lIlIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIIIllIIlIlll[6];
        }
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lllllllllllllllIIIIlIlIlIIIIIIII;
        if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)lllllllllllllllIIIIlIlIIlllllllI, (int[])nArray2), (int)lllllllllllllllIIIIlIlIIllllllll)) {
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
        NPC lllllllllllllllIIIIlIlIlIIlllllI = NPCs.getNearest((int[])nArray);
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
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIlllllI) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIlllllI) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIlllllI.interact(lIIIllIIIllIl[lIIIllIIlIlll[26]]);
            "".length();
            if ((0x3A ^ 0x3E) == 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]));
            "".length();
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
        NPC lllllllllllllllIIIIlIlIlIlIIIllI = NPCs.getNearest((int[])nArray4);
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIlIIIllI) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIlIIIllI) ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIIlIlll[6]];
            nArray5[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
            if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIIIllIIlIlll[6]];
                nArray6[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
                Inventory.getFirst((int[])nArray6).useOn((Actor)lllllllllllllllIIIIlIlIlIlIIIllI);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            "".length();
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
        w lllllllllllllllIIIIlIlIlIIIlllll;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIIlllll.d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[111]]);
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[70];
        TileItem lllllllllllllllIIIIlIlIlIIIllllI = TileItems.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIIllIIlIlll[6]];
        nArray2[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[112];
        TileItem lllllllllllllllIIIIlIlIlIIIlllIl = TileItems.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIIIllIIlIlll[6]];
        nArray3[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[113];
        TileObject lllllllllllllllIIIIlIlIlIIIlllII = TileObjects.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIllllI)) {
            lllllllllllllllIIIIlIlIlIIIllllI.interact(lIIIllIIIllIl[lIIIllIIlIlll[114]]);
            return;
        }
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIlllII)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[115]]);
            lllllllllllllllIIIIlIlIlIIIlllll.sleep(lIIIllIIlIlll[14]);
        }
        int[] nArray4 = new int[lIIIllIIlIlll[6]];
        nArray4[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
        if (w.lIlIIIIlllllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIIlllIl) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIIlllIl) ? 1 : 0) && w.lIlIIIlIIIIIIIl(lllllllllllllllIIIIlIlIlIIIlllII)) {
                lllllllllllllllIIIIlIlIlIIIlllIl.interact(lIIIllIIIllIl[lIIIllIIlIlll[117]]);
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[118], lIIIllIIlIlll[119], lIIIllIIlIlll[11]));
            "".length();
            return;
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIIlllll.ca();
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
        w.lIIIllIIlIlll[0] = (136 + 20 - 44 + 65 ^ 107 + 83 - 159 + 114) & (7 ^ 0x3D ^ (0xBF ^ 0xA5) ^ -" ".length());
        w.lIIIllIIlIlll[1] = 0xFFFFBAF1 & 0x477F;
        w.lIIIllIIlIlll[2] = 0xFFFF8A7D & 0x77F2;
        w.lIIIllIIlIlll[3] = 0xFFFFEFE3 & 0x139F;
        w.lIIIllIIlIlll[4] = -(0xFFFFE813 & 0x5FEF) & (0xFFFFEEFF & 0x5BDF);
        w.lIIIllIIlIlll[5] = 6 ^ 0x42 ^ (0x65 ^ 0x4F);
        w.lIIIllIIlIlll[6] = " ".length();
        w.lIIIllIIlIlll[7] = -(0xFFFFB767 & 0x6AD9) & (0xFFFFFAFD & 0x37FF);
        w.lIIIllIIlIlll[8] = -(0x89 ^ 0x80) & (0xFFFFFCFF & 0xFEB);
        w.lIIIllIIlIlll[9] = -(0xFFFFFFA7 & 0x72FD) & (0xFFFFFEFF & Short.MAX_VALUE);
        w.lIIIllIIlIlll[10] = 0x49 ^ 0x77 ^ (0xFB ^ 0xC3);
        w.lIIIllIIlIlll[11] = "  ".length();
        w.lIIIllIIlIlll[12] = "   ".length();
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
        w.lIIIllIIlIlll[73] = -" ".length() & (0xFFFFE3FF & 0x1FF5);
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
        w.lIIIllIIlIlll[147] = -" ".length();
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
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[0]] = w.lIlIIIIlllIIIII("SUjwmfGTG/UUCHfJoU6m0A==", "jBVrB");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[6]] = w.lIlIIIIlllIIIIl("PzgeYwQWbQkmBxw=", "pMjCk");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[11]] = w.lIlIIIIlllIIIlI("8t/mU2LvCXd3jMjeg3t4bA==", "fRdga");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[12]] = w.lIlIIIIlllIIIIl("PCYiDnccKA==", "hGNeZ");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[13]] = w.lIlIIIIlllIIIlI("JM5r0zAkmM5wIQImNMowDA==", "UEILt");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[14]] = w.lIlIIIIlllIIIII("Ju50Y3hK5uBGW6gUYLUeIw==", "LUjEi");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[10]] = w.lIlIIIIlllIIIlI("PRZPmD3EPCI=", "xQcEC");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[22]] = w.lIlIIIIlllIIIII("yjhY210DWrMMZYScikXFS4AsnKiaVJbF", "ctoac");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[23]] = w.lIlIIIIlllIIIlI("JV5DfekcZwPDZE/IIyYuHw==", "fPFnX");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[24]] = w.lIlIIIIlllIIIlI("KEP8p+lsrTrfx198kg0Gdri99KBx/UQj", "bYEcT");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[25]] = w.lIlIIIIlllIIIII("cw+UCAkuZiQ=", "IyvWm");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[26]] = w.lIlIIIIlllIIIlI("fGf0zaEWGmM=", "LueiB");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[27]] = w.lIlIIIIlllIIIIl("JxJNLxQVVwAnFQMeAylGMjYhAjk/MTIZKT87", "pwmNf");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[28]] = w.lIlIIIIlllIIIIl("GAF0ADkqRDkIODwNOgZrHSEQIw4dNh0kGA==", "OdTaK");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[29]] = w.lIlIIIIlllIIIII("Id1NKdF+4RbC6Z7eDqR502bpC3DUEykN", "qAEDn");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[30]] = w.lIlIIIIlllIIIII("9cvrxnBgVh2To0C+65dz5pqrUNzl3dVo1s/kZvDAOzs=", "zOzIS");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[31]] = w.lIlIIIIlllIIIlI("5WajBH10MulgDTCQ4ksMP2200Q63FiGmmcU5dhNg7O0=", "FeeEv");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[32]] = w.lIlIIIIlllIIIlI("ZyuMBhAllGpwUwmCxSBTDtY4pmoDTeHXfGldmE2MU7s=", "pUcof");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[33]] = w.lIlIIIIlllIIIlI("SQLFeQdhm2t/QaReAMaND8U0ffvFzvvmKxwoxBGuMFg=", "FVfqK");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[21]] = w.lIlIIIIlllIIIlI("IGt6f/3z4kdgWKyTVXIJ2xIKKW24uMxb", "lEnrh");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[48]] = w.lIlIIIIlllIIIIl("EiFFAyMgZAgLIjYtCwVxFws1Jw==", "EDebQ");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[49]] = w.lIlIIIIlllIIIIl("PjNODxwMdgMHHRo/AAlOKhknID0=", "iVnnn");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[50]] = w.lIlIIIIlllIIIII("SxA7ve7AfVw=", "CYDGI");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[51]] = w.lIlIIIIlllIIIlI("MammZsQzd2k=", "yfiwh");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[52]] = w.lIlIIIIlllIIIII("XLnH77gMjn8=", "eCaSs");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[53]] = w.lIlIIIIlllIIIIl("EA4ZBwcwFRwFBXMxOj9CHCdVLS4cNCdF", "Saukb");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[54]] = w.lIlIIIIlllIIIIl("Nx8Z", "gpmss");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[55]] = w.lIlIIIIlllIIIII("FmWnoKe/IMQ=", "ATaCm");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[56]] = w.lIlIIIIlllIIIII("sUNT0ZORL2s=", "FPKZV");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[47]] = w.lIlIIIIlllIIIIl("BDEtKQ==", "TXNBA");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[89]] = w.lIlIIIIlllIIIIl("ESoCKAIr", "YErXg");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[90]] = w.lIlIIIIlllIIIIl("LzUhIBAV", "gZQPu");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[91]] = w.lIlIIIIlllIIIlI("MQ1TJ8NbZeY=", "JaKzV");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[94]] = w.lIlIIIIlllIIIII("uKrTYWhSQD0=", "RSsVh");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[95]] = w.lIlIIIIlllIIIIl("GwwVOSkhQwYmIicRCiU/", "SceIL");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[96]] = w.lIlIIIIlllIIIlI("BlMfoyO5kWo=", "LnJXM");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[97]] = w.lIlIIIIlllIIIlI("aSAZE5Q9KaQNzLY4lSGm0Q==", "BQenI");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[98]] = w.lIlIIIIlllIIIIl("ESAFOyB3LgMg", "WLjNR");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[99]] = w.lIlIIIIlllIIIIl("DRQ6BCk=", "HyJpP");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[102]] = w.lIlIIIIlllIIIlI("8thb4CsICSI9m2sIZWcw+UTDmci8lSHWg5ZDpRIwYx0=", "DVJBL");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[104]] = w.lIlIIIIlllIIIlI("jCYa5GP39Gsqt0d4mRuLrVdiM0AOItlpY2IIHTw8Gjs0iYHjOrWn7ZRqJPJmKrba", "mZmOn");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[109]] = w.lIlIIIIlllIIIlI("mg1U4dvouMwXyM4xhKqCGmTDd+Jwv5eS", "BUnMd");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[110]] = w.lIlIIIIlllIIIlI("0bG2zT9wJuOUDvP2xyNf8uCnJCTpWVC0wPjcKEtEPjXu3Ll65/cFJjmKMTatfw6BEzVMt77SecmakrinnKX9Tw==", "FXbnY");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[111]] = w.lIlIIIIlllIIIIl("CwM8Oy8rGDk5LWgtAx8PG0I=", "HlPWJ");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[114]] = w.lIlIIIIlllIIIII("1QEQh+oltGM=", "vnkha");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[115]] = w.lIlIIIIlllIIIlI("SilR/0BvaOwofQSKEtYxmHVTped5M592ZZPwl2xn7gA=", "VeBqL");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[117]] = w.lIlIIIIlllIIIIl("KwQ2DgY=", "gmQfr");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[120]] = w.lIlIIIIlllIIIII("K4fzsD+jxnh/1OgdsZSSIyFcda6rax8QD9+sdhS0j3oWMarW0l47VhOn683K1G9kpDiqi9fw+PE=", "WijNg");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[121]] = w.lIlIIIIlllIIIIl("GgwONBI6Fws2EHkhMBc5AyY9GjYLEEw=", "YcbXw");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[124]] = w.lIlIIIIlllIIIII("fJDramrGEUM=", "wvkLJ");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[129]] = w.lIlIIIIlllIIIII("m4ARVrUwavc=", "aWQys");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[133]] = w.lIlIIIIlllIIIII("eRz1uvTC9+M/DAWah7KiEpUrW07z6djeoNh2zYRzhixmO9B0D35LZYkTTh73cVEu", "TqVrl");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[134]] = w.lIlIIIIlllIIIlI("xCNk2Lx12nilzLinjzCMKrvmBmJEbpwc", "KfDqL");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[136]] = w.lIlIIIIlllIIIIl("KA8WGw==", "xfupA");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[139]] = w.lIlIIIIlllIIIIl("JzY7CgoHLT4ICEQbFiojOxYROTgrFhs=", "dYWfo");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[141]] = w.lIlIIIIlllIIIlI("jHXbSI8j9LS2czBjuefUyC1xY87ZAOfwNcbmzaE5IFjSeMDpcjU3Rwc7d09jQHfC", "wAArA");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[143]] = w.lIlIIIIlllIIIlI("PtJbCHvHwb4=", "ghfVg");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[148]] = w.lIlIIIIlllIIIII("KfdCIMRcNQ5FC4BSUm/fgg==", "ialrd");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[149]] = w.lIlIIIIlllIIIIl("ADgEIw==", "SHmMc");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[150]] = w.lIlIIIIlllIIIIl("MTQGAUQcM0o6Cxw5", "sUjmd");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[152]] = w.lIlIIIIlllIIIlI("a642UuRw1NOfhnN9ELaoj0KvFJQUExTH", "PiNqe");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[154]] = w.lIlIIIIlllIIIIl("CTMXHmE/KBsY", "YZtuL");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[159]] = w.lIlIIIIlllIIIII("k3NbHP9+tcA=", "DIVes");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[162]] = w.lIlIIIIlllIIIlI("3bWP4u2TmqcWor8uQh9DlIXTXYSwGs95FCC9jAabvJq1tolj894oSojM6D/XbMWx", "KfxsA");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[163]] = w.lIlIIIIlllIIIlI("TeNbpfA0O5E9IGXvDsw+1JM7Gr1f6KhIYE+Aqb4wGEA7K3I3XMnT/WxgLd3W9G5U", "kDKNk");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[164]] = w.lIlIIIIlllIIIlI("Xm+h1YN6tV5gvDo1oJod9Lj3GX+5+lSb", "HQftJ");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[166]] = w.lIlIIIIlllIIIIl("OBkPM0YYFw4sDg==", "zxaXf");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[168]] = w.lIlIIIIlllIIIlI("XS9aOI7Hk+o=", "eJchg");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[169]] = w.lIlIIIIlllIIIII("kA3KR3ybi0OV5+EYYgLGaKM5zG6/HlBm", "nGrbl");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[170]] = w.lIlIIIIlllIIIIl("HSoILwYVJg==", "mCkDg");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[171]] = w.lIlIIIIlllIIIII("LaBtiUaeiBM=", "AHNbI");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[172]] = w.lIlIIIIlllIIIIl("NiIVAyk+Lg==", "FKvhH");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[173]] = w.lIlIIIIlllIIIII("i8iQ5e5lnxc=", "oeKcP");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[174]] = w.lIlIIIIlllIIIlI("av2Zpcg/BRQ=", "SlZWS");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[175]] = w.lIlIIIIlllIIIII("HLZjJiJnrJw=", "VTrzz");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[176]] = w.lIlIIIIlllIIIII("7Xr6puK5fdw=", "VsCFB");
        w.lIIIllIIIllIl[w.lIIIllIIlIlll[177]] = w.lIlIIIIlllIIIlI("taB9NWE/meU=", "esYCb");
    }

    private static boolean lIlIIIIlllllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void lllllllllllllllIIIIlIlIlIlIIllIl;
        if (w.lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIllIIlIlll[6]];
        nArray[w.lIIIllIIlIlll[0]] = lllllllllllllllIIIIlIlIlIlIIllIl;
        NPC lllllllllllllllIIIIlIlIlIlIIlIlI = NPCs.getNearest((int[])nArray);
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIlIIlIlI) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIlIIlIlI) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIlIIlIlI.interact(lIIIllIIIllIl[lIIIllIIlIlll[12]]);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            void lllllllllllllllIIIIlIlIlIlIIllII;
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[13]]);
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIlIlIlIIllII);
            "".length();
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
        NPC lllllllllllllllIIIIlIlIlIlIIlIII = NPCs.getNearest((int[])nArray3);
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIlIIlIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIlIIlIII) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIlIIlIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[10]]);
            "".length();
            if (-(161 + 82 - 189 + 115 ^ 36 + 94 - 51 + 94) >= 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[22]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            "".length();
        }
    }

    private static boolean lIlIIIIllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private void bT() {
        w lllllllllllllllIIIIlIlIlIIlIIlII;
        if (w.lIlIIIIlllllllI(this.d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (w.lIlIIIIlllllIlI(lllllllllllllllIIIIlIlIlIIlIIlII.d(lIIIllIIlIlll[75]) ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIlIlll[6]];
            nArray[w.lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (w.lIlIIIIllllllIl(Inventory.getCount((boolean)lIIIllIIlIlll[6], (int[])nArray), lIIIllIIlIlll[108])) {
                return;
            }
        }
        if (w.lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIlIIlII.ca();
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
        NPC lllllllllllllllIIIIlIlIlIIllIIII = NPCs.getNearest((int[])nArray2);
        if (w.lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIIlIlll[73]);
        }
        if (w.lIlIIIIllllllll(lllllllllllllllIIIIlIlIlIIllIIII) && w.lIlIIIIlllllllI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIlIIllIIII) ? 1 : 0)) {
            lllllllllllllllIIIIlIlIlIIllIIII.interact(lIIIllIIIllIl[lIIIllIIlIlll[52]]);
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIlll[81], lIIIllIIlIlll[82], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
    }

    private static boolean lIlIIIIllllllII(int n2, int n3) {
        return n2 == n3;
    }
}

