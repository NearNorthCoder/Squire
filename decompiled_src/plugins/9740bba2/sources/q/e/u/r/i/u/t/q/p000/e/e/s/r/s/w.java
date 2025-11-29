package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

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
@TaskDesc(name = "Completing Prince Ali Rescue", register = true)
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.w  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/w.class */
public class w extends Task {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    private boolean bN() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        if (lIlIIIIlllllllI(a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[27]]);
            return lIIIllIIlIlll[0];
        } else if (lIlIIIIlllllllI(a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        } else {
            if (lIlIIIIlllllllI(d(lIIIllIIlIlll[69]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[28]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[70]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[29]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[30]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[72]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[31]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[38]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[32]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[73]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[33]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(a(lIIIllIIlIlll[74], lIIIllIIlIlll[12], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[21]]);
                return lIIIllIIlIlll[0];
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[35]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[48]]);
                return lIIIllIIlIlll[0];
            } else {
                ?? r0 = lIIIllIIlIlll[6];
                int[] iArr = new int[lIIIllIIlIlll[6]];
                iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
                if (lIlIIIlIIIIIIII(Inventory.getCount((boolean) r0, iArr), lIIIllIIlIlll[76])) {
                    System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[49]]);
                    return lIIIllIIlIlll[0];
                }
                return lIIIllIIlIlll[6];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    private void bW() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[69]) ? 1 : 0) || lIlIIIIlllllIlI(a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[134]]);
        if (lIlIIIIlllllllI(a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
            int[] iArr = new int[lIIIllIIlIlll[6]];
            iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[135];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[137], lIIIllIIlIlll[138], lIIIllIIlIlll[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[136]]);
            "".length();
            if ((((33 ^ 116) ^ (203 ^ 136)) & (((130 ^ 181) ^ (152 ^ 185)) ^ (-" ".length()))) != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    private void bO() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[73]) ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[74];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            ?? r0 = lIIIllIIlIlll[0];
            int[] iArr2 = new int[lIIIllIIlIlll[6]];
            iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[74];
            if (lIlIIIIllllllIl(Inventory.getCount((boolean) r0, iArr2), lIIIllIIlIlll[12])) {
                return;
            }
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[77];
        NPC nearest = NPCs.getNearest(iArr3);
        if (lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            if (lIlIIIIlllllllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIIIllIIlIlll[6]);
            }
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[13]];
            dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
        }
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[78], lIIIllIIlIlll[79], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[50]]);
        "".length();
        if (0 != 0) {
        }
    }

    private void bJ() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIIlIlll[6]];
            iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
            if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[23]]);
                int[] iArr3 = new int[lIIIllIIlIlll[6]];
                iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
                Item first = Inventory.getFirst(iArr3);
                int[] iArr4 = new int[lIIIllIIlIlll[6]];
                iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
                first.useOn(Inventory.getFirst(iArr4));
            }
        }
    }

    private static boolean lIlIIIIlllllllI(int i) {
        return i != 0;
    }

    private void ca() {
        if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[106], lIIIllIIlIlll[11]);
            String[] strArr = new String[lIIIllIIlIlll[6]];
            strArr[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[166]];
            List at = TileObjects.getAt(worldPoint, strArr);
            if (lIlIIIIlllllllI(at.isEmpty() ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                "".length();
            } else if (lIlIIIIllllllII(at.size(), lIIIllIIlIlll[6])) {
                if (!lIlIIIIlllllIlI(Reachable.isInteractable((Locatable) at.get(lIIIllIIlIlll[0])) ? 1 : 0)) {
                    ((TileObject) at.get(lIIIllIIlIlll[0])).interact(lIIIllIIIllIl[lIIIllIIlIlll[168]]);
                    return;
                }
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[165], lIIIllIIlIlll[167], lIIIllIIlIlll[11]));
                "".length();
            }
        }
    }

    private void R() {
        if (lIlIIIIlllllllI(bA() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIlIlll[7];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[10]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void bF() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[38];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[11]]);
            return;
        }
        int i = lIIIllIIlIlll[40];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[41], lIIIllIIlIlll[42], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void bC() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[18];
        if (lIlIIIIlllllllI(Reachable.isInteractable(NPCs.getNearest(iArr)) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[16];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
            return;
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
        Inventory.getFirst(iArr3).useOn(nearest);
        "".length();
        if (" ".length() < 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    private void bY() {
        if (lIlIIIIlllllllI(a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], (boolean) lIIIllIIlIlll[0]) ? 1 : 0) || lIlIIIIlllllIlI(d(lIIIllIIlIlll[69]) ? 1 : 0) || !lIlIIIIlllllllI(d(lIIIllIIlIlll[69]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[152]]);
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[153];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[155], lIIIllIIlIlll[156], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[154]]);
        "".length();
        if ((-"   ".length()) >= 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private void bS() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        ?? r0 = lIIIllIIlIlll[6];
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if ((lIlIIIlIIIIIIII(Inventory.getCount((boolean) r0, iArr), lIIIllIIlIlll[76]) && lIlIIIIlllllllI(d(lIIIllIIlIlll[70]) ? 1 : 0)) || lIlIIIIlllllIlI(d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[102]]);
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[103]) ? 1 : 0) && lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0)) {
            if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                ca();
                return;
            }
            int[] iArr2 = new int[lIIIllIIlIlll[6]];
            iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
            if (lIlIIIIlllllllI(Bank.contains(iArr2) ? 1 : 0)) {
                Bank.withdraw(lIIIllIIlIlll[103], lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[104]]);
        }
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0) && lIlIIIIlllllIlI(d(lIIIllIIlIlll[103]) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIIlIlll[6]];
            iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
            TileObject nearest = TileObjects.getNearest(iArr3);
            if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
                "".length();
                return;
            }
            int[] iArr4 = new int[lIIIllIIlIlll[6]];
            iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
            Inventory.getFirst(iArr4).useOn(nearest);
            "".length();
            if (((((71 + 35) - 56) + 92) ^ (((27 + 118) - 27) + 20)) <= 0) {
            }
        }
    }

    private void N() {
        bZ();
        bX();
        bY();
        bW();
        bV();
        bU();
        bT();
        bS();
        U();
        bP();
        bQ();
        bO();
    }

    private void bB() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[18];
        if (lIlIIIIlllllIlI(Reachable.isInteractable(NPCs.getNearest(iArr)) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIlIlll[18];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[19], lIIIllIIlIlll[20], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    @Inject
    public w(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester) {
        this.aS = squireQuesterConfig;
        this.aT = squireQuester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    private void bX() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[67]) ? 1 : 0) || lIlIIIIlllllIlI(a(lIIIllIIlIlll[68], lIIIllIIlIlll[12], (boolean) lIIIllIIlIlll[0]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[139]]);
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[140]) ? 1 : 0)) {
            if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                ca();
                return;
            }
            int[] iArr = new int[lIIIllIIlIlll[6]];
            iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[140];
            if (lIlIIIIlllllllI(Bank.contains(iArr) ? 1 : 0)) {
                Bank.withdraw(lIIIllIIlIlll[140], lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
                return;
            }
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[141]]);
        }
        if (lIlIIIIlllllIlI(d(lIIIllIIlIlll[140]) ? 1 : 0) && lIlIIIlIIIIIIII(cb(), lIIIllIIlIlll[12])) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIIIIlllllllI(npc.getName().equals(lIIIllIIIllIl[lIIIllIIlIlll[173]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIIllIIlIlll[6]];
                    strArr[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[174]];
                    if (lIlIIIIlllllllI(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIIllIIlIlll[6];
                        "".length();
                        return ((207 ^ 128) & ((124 ^ 51) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIIllIIlIlll[0];
            });
            if (lIlIIIIllllllll(nearest) && lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0) && lIlIIIIlllllIll(nearest.getId(), lIIIllIIlIlll[142])) {
                nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[143]]);
                return;
            } else {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[144], lIIIllIIlIlll[145], lIIIllIIlIlll[0]));
                "".length();
            }
        }
        if (lIlIIIIllllllII(cb(), lIIIllIIlIlll[12])) {
            int[] iArr2 = new int[lIIIllIIlIlll[6]];
            iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[146];
            if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                if (lIlIIIIlllllllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                if (lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[147])) {
                    return;
                }
                String[] strArr = new String[lIIIllIIlIlll[6]];
                strArr[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[148]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (!lIlIIIIllllllll(nearest2) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[151], lIIIllIIlIlll[85], lIIIllIIlIlll[6]));
                    "".length();
                    return;
                }
                if (lIlIIIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                    nearest2.interact(lIIIllIIIllIl[lIIIllIIlIlll[149]]);
                }
                Production.chooseOption(lIIIllIIIllIl[lIIIllIIlIlll[150]]);
            }
        }
    }

    private void bR() {
        if (lIlIIIIlllllIlI(this.aT.a() ? 1 : 0)) {
            a(lIIIllIIlIlll[86], new WorldPoint(lIIIllIIlIlll[87], lIIIllIIlIlll[88], lIIIllIIlIlll[0]), lIIIllIIIllIl[lIIIllIIlIlll[56]], lIIIllIIIllIl[lIIIllIIlIlll[47]]);
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[83];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIIlIlll[6]];
            iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[86];
            if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                String[] strArr = new String[lIIIllIIlIlll[6]];
                strArr[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[89]];
                if (!lIlIIIIllllllll(TileObjects.getNearest(strArr))) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[92], lIIIllIIlIlll[93], lIIIllIIlIlll[11]));
                    "".length();
                    return;
                }
                String[] strArr2 = new String[lIIIllIIlIlll[6]];
                strArr2[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[90]];
                TileObjects.getNearest(strArr2).interact(lIIIllIIIllIl[lIIIllIIlIlll[91]]);
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[83];
        if (lIlIIIIlllllllI(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIIIllIIlIlll[6]];
            iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[86];
            if (lIlIIIIlllllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllIIlIlll[6]];
                strArr3[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[94]];
                if (lIlIIIIllllllll(TileObjects.getNearest(strArr3)) && lIlIIIIlllllIlI(this.aT.a() ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIllIIlIlll[6]];
                    strArr4[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[95]];
                    TileObjects.getNearest(strArr4).interact(lIIIllIIIllIl[lIIIllIIlIlll[96]]);
                }
            }
        }
        if (lIlIIIIlllllllI(this.aT.a() ? 1 : 0)) {
            int[] iArr5 = new int[lIIIllIIlIlll[6]];
            iArr5[lIIIllIIlIlll[0]] = lIIIllIIlIlll[72];
            if (lIlIIIIlllllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                String[] strArr5 = new String[lIIIllIIlIlll[6]];
                strArr5[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[97]];
                if (!lIlIIIIllllllll(TileObjects.getNearest(strArr5))) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[100], lIIIllIIlIlll[101], lIIIllIIlIlll[0]));
                    "".length();
                    return;
                }
                String[] strArr6 = new String[lIIIllIIlIlll[6]];
                strArr6[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[98]];
                TileObjects.getNearest(strArr6).interact(lIIIllIIIllIl[lIIIllIIlIlll[99]]);
                "".length();
                if ("  ".length() == 0) {
                }
            }
        }
    }

    private void bM() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[43];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[25]]);
            "".length();
            if ((19 ^ 23) <= "   ".length()) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private void bZ() {
        if (!lIlIIIIlllllIlI(d(lIIIllIIlIlll[67]) ? 1 : 0) && lIlIIIIlllllllI(d(lIIIllIIlIlll[67]) ? 1 : 0)) {
            if (lIlIIIIlllllllI(Inventory.contains(item -> {
                return item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[172]]);
            }) ? 1 : 0)) {
                if (lIlIIIIlllllllI(d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    int[] iArr = new int[lIIIllIIlIlll[6]];
                    iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[158];
                    TileObject nearest = TileObjects.getNearest(iArr);
                    if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                        Walker.walkTo(new WorldPoint(lIIIllIIlIlll[160], lIIIllIIlIlll[161], lIIIllIIlIlll[0]));
                        "".length();
                        return;
                    } else if (lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                        return;
                    } else {
                        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[159]]);
                        sleep(lIIIllIIlIlll[12]);
                        "".length();
                        if ((-" ".length()) > " ".length()) {
                            return;
                        }
                        return;
                    }
                } else if (lIlIIIIlllllIlI(d(lIIIllIIlIlll[157]) ? 1 : 0)) {
                    if (lIlIIIIlllllllI(d(lIIIllIIlIlll[103]) ? 1 : 0) && lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0)) {
                        if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                            ca();
                            return;
                        }
                        int[] iArr2 = new int[lIIIllIIlIlll[6]];
                        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        if (lIlIIIIlllllllI(Bank.contains(iArr2) ? 1 : 0)) {
                            Bank.withdraw(lIIIllIIlIlll[103], lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
                            return;
                        }
                        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[162]]);
                    }
                    if (lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0) && lIlIIIIlllllIlI(d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIllIIlIlll[6]];
                        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[105];
                        TileObject nearest2 = TileObjects.getNearest(iArr3);
                        if (!lIlIIIIllllllll(nearest2) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[106], lIIIllIIlIlll[107], lIIIllIIlIlll[0]));
                            "".length();
                            return;
                        }
                        int[] iArr4 = new int[lIIIllIIlIlll[6]];
                        iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                        Inventory.getFirst(iArr4).useOn(nearest2);
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                        return;
                    }
                }
            } else if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                ca();
                return;
            } else if (lIlIIIIlllllllI(Bank.contains(item2 -> {
                return item2.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[171]]);
            }) ? 1 : 0)) {
                Bank.withdraw(item3 -> {
                    return item3.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[170]]);
                }, lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
                return;
            } else {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[163]]);
            }
            if (lIlIIIIlllllIlI(d(lIIIllIIlIlll[71]) ? 1 : 0) && lIlIIIIlllllllI(d(lIIIllIIlIlll[103]) ? 1 : 0)) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[164]]);
                int[] iArr5 = new int[lIIIllIIlIlll[6]];
                iArr5[lIIIllIIlIlll[0]] = lIIIllIIlIlll[71];
                Item first = Inventory.getFirst(iArr5);
                int[] iArr6 = new int[lIIIllIIlIlll[6]];
                iArr6[lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                first.useOn(Inventory.getFirst(iArr6));
                sleepWhile(lIIIllIIlIlll[14], () -> {
                    int[] iArr7 = new int[lIIIllIIlIlll[6]];
                    iArr7[lIIIllIIlIlll[0]] = lIIIllIIlIlll[157];
                    return Inventory.contains(iArr7);
                });
            }
        }
    }

    private void bE() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int i = lIIIllIIlIlll[15];
            WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]);
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
            dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
            a(i, worldPoint, dialogOptionArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean bA() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[15];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[6]]);
            return lIIIllIIlIlll[0];
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[16];
        TileObject nearest2 = TileObjects.getNearest(iArr2);
        if (lIlIIIIllllllll(nearest2) && lIlIIIIlllllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIIlIlll[6]];
            iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[17];
            Inventory.getFirst(iArr3).useOn(nearest2);
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[0]]);
        return lIIIllIIlIlll[6];
    }

    private void bP() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[35];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[64];
        NPC nearest = NPCs.getNearest(iArr2);
        if (lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne(lIIIllIIlIlll[35]);
        }
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[51]]);
        "".length();
        if (((((72 + 14) - (-87)) + 11) ^ (((36 + 152) - 88) + 88)) < " ".length()) {
        }
    }

    private static String lIlIIIIlllIIIIl(String lllllllllllllllIIIIlIlIIllIlllII, String lllllllllllllllIIIIlIlIIllIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIlIIllIlIllI.toCharArray();
        int lllllllllllllllIIIIlIlIIllIllIII = lIIIllIIlIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIlIlll[0];
        while (lIlIIIlIIIIIIII(i, length)) {
            char lllllllllllllllIIIIlIlIIllIlllIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIIIlIlIIllIlllIl ^ charArray[lllllllllllllllIIIIlIlIIllIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIlIIllIllIII++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIIIlllIIIlI(String lllllllllllllllIIIIlIlIIllIIIlll, String lllllllllllllllIIIIlIlIIllIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIlIIllIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIlIIllIIlIIl.init(lIIIllIIlIlll[11], secretKeySpec);
            return new String(lllllllllllllllIIIIlIlIIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIllIIlIII) {
            lllllllllllllllIIIIlIlIIllIIlIII.printStackTrace();
            return null;
        }
    }

    private void U() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        if ((lIlIIIIlllllllI(d(lIIIllIIlIlll[71]) ? 1 : 0) && lIlIIIIlllllIlI(d(lIIIllIIlIlll[67]) ? 1 : 0)) || lIlIIIIlllllllI(d(lIIIllIIlIlll[67]) ? 1 : 0) || lIlIIIIlllllIlI(d(lIIIllIIlIlll[72]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[53]]);
        if (!lIlIIIIlllllllI(d(lIIIllIIlIlll[83]) ? 1 : 0)) {
            bR();
            return;
        }
        String[] strArr = new String[lIIIllIIlIlll[6]];
        strArr[lIIIllIIlIlll[0]] = lIIIllIIIllIl[lIIIllIIlIlll[54]];
        TileItem nearest = TileItems.getNearest(strArr);
        if (lIlIIIIllllllll(nearest) && lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[55]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIIlIlll[84], lIIIllIIlIlll[85], lIIIllIIlIlll[0]));
        "".length();
    }

    private static boolean lIlIIIlIIIIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIIIIlllllIIl();
        lIlIIIIlllllIII();
    }

    public void a(int i, WorldPoint worldPoint, String str, String str2) {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = i;
        if (lIlIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIlIlll[6]];
            strArr[lIIIllIIlIlll[0]] = str;
            if (!lIlIIIIllllllll(TileObjects.getNearest(strArr))) {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[169]]);
                Walker.walkTo(worldPoint);
                "".length();
                return;
            }
            String[] strArr2 = new String[lIIIllIIlIlll[6]];
            strArr2[lIIIllIIlIlll[0]] = str;
            if (lIlIIIIlllllllI(Reachable.isInteractable(TileObjects.getNearest(strArr2)) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllIIlIlll[6]];
                strArr3[lIIIllIIlIlll[0]] = str;
                TileObjects.getNearest(strArr3).interact(str2);
                "".length();
                if ((((((9 + 10) - (-170)) + 28) ^ (((126 + 101) - 198) + 104)) & (((1 ^ 110) ^ (188 ^ 143)) ^ (-" ".length()))) != 0) {
                    return;
                }
                return;
            }
            String[] strArr4 = new String[lIIIllIIlIlll[6]];
            strArr4[lIIIllIIlIlll[0]] = str;
            Movement.walkTo(TileObjects.getNearest(strArr4).getWorldLocation());
            "".length();
            "".length();
            if (((((88 + 37) - 54) + 85) ^ (((47 + 119) - 63) + 49)) <= "  ".length()) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (lIlIIIIlllllIlI(this.aS.quest().equals(h.PRINCE_ALI_RESCUE) ? 1 : 0)) {
            return lIIIllIIlIlll[0];
        }
        int Q = Q();
        if (lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[1]) && lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[2]) && lIlIIIIlllllIll(Players.getLocal().getAnimation(), lIIIllIIlIlll[3]) && !lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[4])) {
            if (lIlIIIIllllllIl(Q, lIIIllIIlIlll[5])) {
                return lIIIllIIlIlll[0];
            }
            System.out.println("[PRINCE_ALI_RESCUE] - Progress: " + Q);
            switch (Q) {
                case 0:
                    N();
                    sleep(lIIIllIIlIlll[6]);
                    M();
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return ((12 ^ 34) ^ (125 ^ 48)) & (((203 ^ 168) ^ ((8 ^ 95) & ((243 ^ 164) ^ (-1)))) ^ (-" ".length()));
                    }
                    break;
                case 10:
                    bM();
                    "".length();
                    if ((-((38 ^ 56) ^ (53 ^ 47))) >= 0) {
                        return ((((59 + 56) - (-54)) + 18) ^ (((80 + 56) - 54) + 92)) & (((71 ^ 60) ^ (175 ^ 193)) ^ (-" ".length()));
                    }
                    break;
                case 20:
                    bL();
                    bK();
                    bJ();
                    bI();
                    bH();
                    bG();
                    bF();
                    "".length();
                    if ((-(48 ^ 53)) >= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    break;
                case 30:
                    bE();
                    "".length();
                    if (0 != 0) {
                        return ((201 ^ 180) ^ (94 ^ 26)) & (((119 ^ 16) ^ (75 ^ 21)) ^ (-" ".length()));
                    }
                    break;
                case 31:
                    bE();
                    "".length();
                    if ("   ".length() == 0) {
                        return ((79 ^ 44) ^ (64 ^ 22)) & (((((101 + 23) - 42) + 49) ^ (((14 + 54) - (-62)) + 52)) ^ (-" ".length()));
                    }
                    break;
                case 40:
                    bD();
                    "".length();
                    if ((182 ^ 179) <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    break;
                case 50:
                    bC();
                    bB();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return ((((16 + 110) - 73) + 89) ^ (((171 + 190) - 321) + 151)) & (((((46 + 166) - 52) + 30) ^ (((0 + 31) - (-36)) + 76)) ^ (-" ".length()));
                    }
                    break;
                case 100:
                    R();
                    "".length();
                    if (((((140 + 132) - 142) + 55) ^ (((178 + 127) - 188) + 71)) <= 0) {
                        return ((((86 + 52) - 99) + 139) ^ (((131 + 11) - 92) + 108)) & (((((29 + 67) - (-33)) + 4) ^ (((137 + 73) - 180) + 139)) ^ (-" ".length()));
                    }
                    break;
                default:
                    return lIIIllIIlIlll[0];
            }
            return lIIIllIIlIlll[6];
        }
        return lIIIllIIlIlll[0];
    }

    private void bL() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
        if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIlIlll[64];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[65], lIIIllIIlIlll[66], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private int cb() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[146];
        int count = Inventory.getCount(iArr);
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[68];
        return count + Inventory.getCount(iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean d(int i) {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = i;
        if (lIlIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            ?? r0 = lIIIllIIlIlll[6];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllIIlIlll[0];
    }

    private void bG() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (lIlIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIlIlll[43];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[44], lIIIllIIlIlll[45], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[21]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static String lIlIIIIlllIIIII(String lllllllllllllllIIIIlIlIIlllIllII, String lllllllllllllllIIIIlIlIIlllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIlll[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIlIlll[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIlllIllIl) {
            lllllllllllllllIIIIlIlIIlllIllIl.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_PRINCE_ALI_RESCUE.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    private void bV() {
        if (lIlIIIIlllllllI(a(lIIIllIIlIlll[63], lIIIllIIlIlll[11], (boolean) lIIIllIIlIlll[0]) ? 1 : 0) || lIlIIIIlllllIlI(d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[121]]);
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            if (!lIlIIIIlllllllI(Inventory.contains(item -> {
                return item.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[177]]);
            }) ? 1 : 0)) {
                if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                    ca();
                } else if (lIlIIIIlllllllI(Bank.contains(item2 -> {
                    return item2.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[176]]);
                }) ? 1 : 0)) {
                    Bank.withdraw(item3 -> {
                        return item3.getName().contains(lIIIllIIIllIl[lIIIllIIlIlll[175]]);
                    }, lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
                } else {
                    System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[133]]);
                }
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                int[] iArr = new int[lIIIllIIlIlll[6]];
                iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[123];
                TileObject nearest = TileObjects.getNearest(iArr);
                if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                    "".length();
                } else if (lIlIIIIllllllII(Players.getLocal().getAnimation(), lIIIllIIlIlll[2])) {
                } else {
                    nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[124]]);
                    sleep(lIIIllIIlIlll[12]);
                    "".length();
                    if (0 != 0) {
                    }
                }
            } else if (lIlIIIIlllllllI(d(lIIIllIIlIlll[127]) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllIIlIlll[6]];
                iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[128];
                TileObject nearest2 = TileObjects.getNearest(iArr2);
                if (!lIlIIIIllllllll(nearest2) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[125], lIIIllIIlIlll[126], lIIIllIIlIlll[0]));
                    "".length();
                    return;
                }
                nearest2.interact(lIIIllIIIllIl[lIIIllIIlIlll[129]]);
                sleep(lIIIllIIlIlll[12]);
                "".length();
                if ((-" ".length()) >= (132 ^ 128)) {
                }
            } else if (lIlIIIIlllllIlI(d(lIIIllIIlIlll[127]) ? 1 : 0) && lIlIIIIlllllIlI(d(lIIIllIIlIlll[122]) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllIIlIlll[6]];
                iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[130];
                TileObject nearest3 = TileObjects.getNearest(iArr3);
                if (!lIlIIIIllllllll(nearest3) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIIlIlll[131], lIIIllIIlIlll[132], lIIIllIIlIlll[0]));
                    "".length();
                    return;
                }
                int[] iArr4 = new int[lIIIllIIlIlll[6]];
                iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[103];
                Inventory.getFirst(iArr4).useOn(nearest3);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                int[] iArr5 = new int[lIIIllIIlIlll[6]];
                iArr5[lIIIllIIlIlll[0]] = lIIIllIIlIlll[122];
                Inventory.getFirst(iArr5).useOn(nearest3);
                "".length();
                if (0 != 0) {
                }
            }
        }
    }

    private static boolean lIlIIIIllllllll(Object obj) {
        return obj != null;
    }

    private void bD() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[34];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[35];
        Inventory.getFirst(iArr2).useOn(nearest);
        "".length();
        if ((true ^ true) && ((true ^ true) ^ true)) {
        }
    }

    private static boolean lIlIIIlIIIIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(int i, int lllllllllllllllIIIIlIlIIllllllll, boolean z) {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = i;
        if (lIlIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return lIIIllIIlIlll[6];
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = i;
        return lIlIIIIllllllIl(Inventory.getCount(z, iArr2), lllllllllllllllIIIIlIlIIllllllll) ? lIIIllIIlIlll[0] : lIIIllIIlIlll[6];
    }

    private void M() {
        if (lIlIIIIlllllIlI(bN() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[7];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIlll[8], lIIIllIIlIlll[9], lIIIllIIlIlll[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[26]]);
            "".length();
            if (true ^ true) {
                return;
            }
            return;
        }
        if (lIlIIIIlllllllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lIIIllIIlIlll[6]);
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[10]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private void bK() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[61];
        if (lIlIIIIlllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
            return;
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[62];
        if (lIlIIIIlllllIlI(Inventory.contains(iArr3) ? 1 : 0)) {
            return;
        }
        if (lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[11]];
            dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[24]]);
        int[] iArr4 = new int[lIIIllIIlIlll[6]];
        iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[58];
        NPC nearest = NPCs.getNearest(iArr4);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        int[] iArr5 = new int[lIIIllIIlIlll[6]];
        iArr5[lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
        if (lIlIIIIlllllllI(Inventory.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIllIIlIlll[6]];
            iArr6[lIIIllIIlIlll[0]] = lIIIllIIlIlll[63];
            Inventory.getFirst(iArr6).useOn(nearest);
            "".length();
            if (" ".length() != " ".length()) {
            }
        }
    }

    private static boolean lIlIIIIlllllIll(int i, int i2) {
        return i != i2;
    }

    private void bH() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[38];
        if (lIlIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[46];
        if (lIlIIIIlllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            return;
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[39];
        if (lIlIIIIlllllllI(Inventory.contains(iArr3) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIlIlll[34];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIlIlll[36], lIIIllIIlIlll[37], lIIIllIIlIlll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[47]];
        dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[26]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIIlIlll[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[30]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[33]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[48]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIlll[49]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[50]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIlll[51]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[52]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[53]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIlll[54]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[55]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIlll[56]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void bU() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[38]) ? 1 : 0) || lIlIIIIlllllIlI(d(lIIIllIIlIlll[70]) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[111]]);
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[70];
        TileItem nearest = TileItems.getNearest(iArr);
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[112];
        TileItem nearest2 = TileItems.getNearest(iArr2);
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[113];
        TileObject nearest3 = TileObjects.getNearest(iArr3);
        if (lIlIIIIllllllll(nearest)) {
            nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[114]]);
            return;
        }
        if (lIlIIIIllllllll(nearest3)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[115]]);
            sleep(lIIIllIIlIlll[14]);
        }
        int[] iArr4 = new int[lIIIllIIlIlll[6]];
        iArr4[lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
        if (lIlIIIIlllllllI(Inventory.contains(iArr4) ? 1 : 0)) {
            if (lIlIIIIllllllll(nearest2) && lIlIIIIlllllllI(Reachable.isInteractable(nearest2) ? 1 : 0) && lIlIIIlIIIIIIIl(nearest3)) {
                nearest2.interact(lIIIllIIIllIl[lIIIllIIlIlll[117]]);
                return;
            }
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[118], lIIIllIIlIlll[119], lIIIllIIlIlll[11]));
            "".length();
        } else if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            ca();
        } else {
            int[] iArr5 = new int[lIIIllIIlIlll[6]];
            iArr5[lIIIllIIlIlll[0]] = lIIIllIIlIlll[116];
            if (lIlIIIIlllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                Bank.withdraw(lIIIllIIlIlll[116], lIIIllIIlIlll[6], Bank.WithdrawMode.ITEM);
            } else {
                System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[120]]);
            }
        }
    }

    private static void lIlIIIIlllllIIl() {
        lIIIllIIlIlll = new int[178];
        lIIIllIIlIlll[0] = ((((136 + 20) - 44) + 65) ^ (((107 + 83) - 159) + 114)) & (((7 ^ 61) ^ (191 ^ 165)) ^ (-" ".length()));
        lIIIllIIlIlll[1] = (-17679) & 18303;
        lIIIllIIlIlll[2] = (-30083) & 30706;
        lIIIllIIlIlll[3] = (-4125) & 5023;
        lIIIllIIlIlll[4] = (-((-6125) & 24559)) & (-4353) & 23519;
        lIIIllIIlIlll[5] = (6 ^ 66) ^ (101 ^ 79);
        lIIIllIIlIlll[6] = " ".length();
        lIIIllIIlIlll[7] = (-((-18585) & 27353)) & (-1283) & 14335;
        lIIIllIIlIlll[8] = (-(137 ^ 128)) & (-769) & 4075;
        lIIIllIIlIlll[9] = (-((-89) & 29437)) & (-257) & 32767;
        lIIIllIIlIlll[10] = (73 ^ 119) ^ (251 ^ 195);
        lIIIllIIlIlll[11] = "  ".length();
        lIIIllIIlIlll[12] = "   ".length();
        lIIIllIIlIlll[13] = 87 ^ 83;
        lIIIllIIlIlll[14] = 148 ^ 145;
        lIIIllIIlIlll[15] = (-16389) & 27965;
        lIIIllIIlIlll[16] = (((239 + 17) - 35) + 24) ^ (((13 + 10) - (-28)) + 133);
        lIIIllIIlIlll[17] = (-((-8945) & 29438)) & (-9345) & 32255;
        lIIIllIIlIlll[18] = (-((-3135) & 20223)) & (-5) & 28671;
        lIIIllIIlIlll[19] = (-16901) & 20023;
        lIIIllIIlIlll[20] = (-12823) & 16063;
        lIIIllIIlIlll[21] = 164 ^ 183;
        lIIIllIIlIlll[22] = 14 ^ 9;
        lIIIllIIlIlll[23] = 68 ^ 76;
        lIIIllIIlIlll[24] = (((146 + 127) - 186) + 60) ^ (((52 + 94) - 3) + 11);
        lIIIllIIlIlll[25] = 28 ^ 22;
        lIIIllIIlIlll[26] = (71 ^ 57) ^ (119 ^ 2);
        lIIIllIIlIlll[27] = 67 ^ 79;
        lIIIllIIlIlll[28] = (106 ^ 81) ^ (147 ^ 165);
        lIIIllIIlIlll[29] = 60 ^ 50;
        lIIIllIIlIlll[30] = 178 ^ 189;
        lIIIllIIlIlll[31] = 43 ^ 59;
        lIIIllIIlIlll[32] = (((98 + 102) - 57) + 37) ^ (((93 + 22) - 6) + 56);
        lIIIllIIlIlll[33] = 62 ^ 44;
        lIIIllIIlIlll[34] = (-((-8867) & 13031)) & (-130) & 15871;
        lIIIllIIlIlll[35] = (-((-73) & 27725)) & (-4162) & 32767;
        lIIIllIIlIlll[36] = (-((-20005) & 24558)) & (-513) & 8191;
        lIIIllIIlIlll[37] = (-((-2315) & 23371)) & (-3) & 24302;
        lIIIllIIlIlll[38] = (-20561) & 22909;
        lIIIllIIlIlll[39] = (-4617) & 7039;
        lIIIllIIlIlll[40] = (-28485) & 32758;
        lIIIllIIlIlll[41] = (-((-17571) & 30707)) & (-16513) & 32758;
        lIIIllIIlIlll[42] = (-((-9305) & 9563)) & (-28737) & 32255;
        lIIIllIIlIlll[43] = (-8514) & 12799;
        lIIIllIIlIlll[44] = (-((-489) & 12780)) & (-17185) & 32763;
        lIIIllIIlIlll[45] = (-16642) & 19821;
        lIIIllIIlIlll[46] = (-((-125) & 20607)) & (-5) & 22910;
        lIIIllIIlIlll[47] = (169 ^ 157) ^ (49 ^ 24);
        lIIIllIIlIlll[48] = (59 ^ 126) ^ (49 ^ 96);
        lIIIllIIlIlll[49] = 71 ^ 82;
        lIIIllIIlIlll[50] = 80 ^ 70;
        lIIIllIIlIlll[51] = 147 ^ 132;
        lIIIllIIlIlll[52] = (((29 + 79) - 22) + 94) ^ (((70 + 170) - 230) + 162);
        lIIIllIIlIlll[53] = 144 ^ 137;
        lIIIllIIlIlll[54] = 96 ^ 122;
        lIIIllIIlIlll[55] = (183 ^ 146) ^ (134 ^ 184);
        lIIIllIIlIlll[56] = 18 ^ 14;
        lIIIllIIlIlll[57] = (-((-18969) & 27289)) & (-5121) & 15859;
        lIIIllIIlIlll[58] = (-((-21849) & 30044)) & (-18433) & 30911;
        lIIIllIIlIlll[59] = (-((-3721) & 24569)) & (-514) & 24447;
        lIIIllIIlIlll[60] = (-((-2519) & 27607)) & (-69) & 28415;
        lIIIllIIlIlll[61] = (-((-8309) & 14709)) & (-1) & 8165;
        lIIIllIIlIlll[62] = (-((-6691) & 24235)) & (-1) & 19965;
        lIIIllIIlIlll[63] = (-((-20901) & 31151)) & (-81) & 12287;
        lIIIllIIlIlll[64] = (-((-2203) & 4063)) & (-18433) & 24572;
        lIIIllIIlIlll[65] = (-8290) & 11387;
        lIIIllIIlIlll[66] = (-17218) & 20475;
        lIIIllIIlIlll[67] = (-18445) & 20205;
        lIIIllIIlIlll[68] = (-((-23637) & 23893)) & (-14337) & 16351;
        lIIIllIIlIlll[69] = (-22593) & 24543;
        lIIIllIIlIlll[70] = (-((-12381) & 15615)) & (-20742) & 24567;
        lIIIllIIlIlll[71] = (-((-9997) & 32639)) & (-1) & 24571;
        lIIIllIIlIlll[72] = (-26641) & 28573;
        lIIIllIIlIlll[73] = (-" ".length()) & (-7169) & 8181;
        lIIIllIIlIlll[74] = (-((-845) & 31693)) & (-3) & 32767;
        lIIIllIIlIlll[75] = (-28685) & 29679;
        lIIIllIIlIlll[76] = (175 ^ 193) ^ (62 ^ 52);
        lIIIllIIlIlll[77] = (-4317) & 5628;
        lIIIllIIlIlll[78] = (-17154) & 20377;
        lIIIllIIlIlll[79] = (-((-1493) & 22526)) & (-8337) & 32767;
        lIIIllIIlIlll[80] = (-((-8273) & 26195)) & (-273) & 28671;
        lIIIllIIlIlll[81] = (-21113) & 24318;
        lIIIllIIlIlll[82] = (-((-333) & 25581)) & (-9) & 28671;
        lIIIllIIlIlll[83] = (-20513) & 22443;
        lIIIllIIlIlll[84] = (-21049) & 24255;
        lIIIllIIlIlll[85] = (-25186) & 28399;
        lIIIllIIlIlll[86] = (-((-2455) & 31127)) & (-2081) & 32699;
        lIIIllIIlIlll[87] = (-((-15361) & 31779)) & (-5) & 19583;
        lIIIllIIlIlll[88] = (-((-26625) & 31268)) & (-16385) & 24319;
        lIIIllIIlIlll[89] = (((40 + 66) - 4) + 61) ^ (((124 + 179) - 288) + 174);
        lIIIllIIlIlll[90] = (193 ^ 140) ^ (98 ^ 48);
        lIIIllIIlIlll[91] = 177 ^ 145;
        lIIIllIIlIlll[92] = (-((-513) & 8834)) & (-17185) & 28669;
        lIIIllIIlIlll[93] = (-28929) & 32234;
        lIIIllIIlIlll[94] = (56 ^ 94) ^ (44 ^ 107);
        lIIIllIIlIlll[95] = (106 ^ 94) ^ (72 ^ 94);
        lIIIllIIlIlll[96] = 229 ^ 198;
        lIIIllIIlIlll[97] = 2 ^ 38;
        lIIIllIIlIlll[98] = (109 ^ 25) ^ (24 ^ 73);
        lIIIllIIlIlll[99] = (102 ^ 47) ^ (240 ^ 159);
        lIIIllIIlIlll[100] = (-((-5381) & 5926)) & (-24705) & 28415;
        lIIIllIIlIlll[101] = (-8727) & 12031;
        lIIIllIIlIlll[102] = (235 ^ 138) ^ (41 ^ 111);
        lIIIllIIlIlll[103] = (-28763) & 30687;
        lIIIllIIlIlll[104] = (((33 + 78) - 32) + 159) ^ (((80 + 135) - 140) + 123);
        lIIIllIIlIlll[105] = (-((-725) & 24277)) & (-8209) & 32639;
        lIIIllIIlIlll[106] = (-((-2121) & 27499)) & (-1) & 28599;
        lIIIllIIlIlll[107] = (-((-3597) & 24415)) & (-33) & 24063;
        lIIIllIIlIlll[108] = (-16449) & 21448;
        lIIIllIIlIlll[109] = 66 ^ 107;
        lIIIllIIlIlll[110] = (((94 + 112) - 176) + 153) ^ (((117 + 34) - 116) + 122);
        lIIIllIIlIlll[111] = 4 ^ 47;
        lIIIllIIlIlll[112] = (-14865) & 16375;
        lIIIllIIlIlll[113] = (-((-28769) & 31207)) & (-4129) & 32751;
        lIIIllIIlIlll[114] = 184 ^ 148;
        lIIIllIIlIlll[115] = 87 ^ 122;
        lIIIllIIlIlll[116] = (-13697) & 14286;
        lIIIllIIlIlll[117] = (37 ^ 118) ^ (7 ^ 122);
        lIIIllIIlIlll[118] = (-((-3461) & 15855)) & (-273) & 15871;
        lIIIllIIlIlll[119] = (-((-6275) & 23271)) & (-8193) & 28413;
        lIIIllIIlIlll[120] = 124 ^ 83;
        lIIIllIIlIlll[121] = 94 ^ 110;
        lIIIllIIlIlll[122] = (-15428) & 15863;
        lIIIllIIlIlll[123] = (-97) & 11257;
        lIIIllIIlIlll[124] = 158 ^ 175;
        lIIIllIIlIlll[125] = (-28773) & 31999;
        lIIIllIIlIlll[126] = (-24997) & 28143;
        lIIIllIIlIlll[127] = (-1602) & 2039;
        lIIIllIIlIlll[128] = (-4503) & 15862;
        lIIIllIIlIlll[129] = (((158 + 104) - 259) + 182) ^ (((95 + 21) - 65) + 88);
        lIIIllIIlIlll[130] = (-545) & 24553;
        lIIIllIIlIlll[131] = (-((-17546) & 26347)) & (-20481) & 32507;
        lIIIllIIlIlll[132] = (-20482) & 23735;
        lIIIllIIlIlll[133] = (((135 + 41) - 117) + 99) ^ (((45 + 40) - (-9)) + 79);
        lIIIllIIlIlll[134] = 27 ^ 47;
        lIIIllIIlIlll[135] = (-(113 ^ 43)) & (-28673) & 32127;
        lIIIllIIlIlll[136] = (((90 + 183) - 197) + 113) ^ (((126 + 124) - 201) + 87);
        lIIIllIIlIlll[137] = (-((-6985) & 23499)) & (-8705) & 28407;
        lIIIllIIlIlll[138] = (-((-18539) & 27003)) & (-513) & 12243;
        lIIIllIIlIlll[139] = (((64 + 50) - 44) + 95) ^ (((27 + 144) - 61) + 37);
        lIIIllIIlIlll[140] = (-28673) & 30407;
        lIIIllIIlIlll[141] = (39 ^ 22) ^ (165 ^ 163);
        lIIIllIIlIlll[142] = (-((-55) & 30775)) & (-1317) & 32767;
        lIIIllIIlIlll[143] = 172 ^ 148;
        lIIIllIIlIlll[144] = (-16405) & 19604;
        lIIIllIIlIlll[145] = (-24587) & 27850;
        lIIIllIIlIlll[146] = (-6401) & 8137;
        lIIIllIIlIlll[147] = -" ".length();
        lIIIllIIlIlll[148] = 44 ^ 21;
        lIIIllIIlIlll[149] = 111 ^ 85;
        lIIIllIIlIlll[150] = 105 ^ 82;
        lIIIllIIlIlll[151] = (-9046) & 12255;
        lIIIllIIlIlll[152] = (((150 + 83) - 217) + 140) ^ (((118 + 46) - 19) + 15);
        lIIIllIIlIlll[153] = (-1) & 23628;
        lIIIllIIlIlll[154] = 97 ^ 92;
        lIIIllIIlIlll[155] = (-24577) & 27852;
        lIIIllIIlIlll[156] = (-((-265) & 4939)) & (-146) & 8191;
        lIIIllIIlIlll[157] = (-((-8321) & 12941)) & (-19521) & 24574;
        lIIIllIIlIlll[158] = (-4357) & 15718;
        lIIIllIIlIlll[159] = (((6 + 25) - (-105)) + 7) ^ (((139 + 77) - 126) + 87);
        lIIIllIIlIlll[160] = (-((-2755) & 19159)) & (-13185) & 32767;
        lIIIllIIlIlll[161] = (-((-7292) & 24191)) & (-81) & 20347;
        lIIIllIIlIlll[162] = (((85 + 5) - 18) + 68) ^ (((57 + 108) - 54) + 68);
        lIIIllIIlIlll[163] = (15 ^ 70) ^ (25 ^ 16);
        lIIIllIIlIlll[164] = 102 ^ 39;
        lIIIllIIlIlll[165] = (-((-4099) & 29475)) & (-4098) & 32681;
        lIIIllIIlIlll[166] = (((63 + 170) - 57) + 71) ^ (((151 + 30) - 169) + 169);
        lIIIllIIlIlll[167] = (-12585) & 15802;
        lIIIllIIlIlll[168] = (((122 + 90) - 39) + 53) ^ (((136 + 158) - 162) + 29);
        lIIIllIIlIlll[169] = 87 ^ 19;
        lIIIllIIlIlll[170] = (61 ^ 22) ^ (89 ^ 55);
        lIIIllIIlIlll[171] = 91 ^ 29;
        lIIIllIIlIlll[172] = (139 ^ 196) ^ (178 ^ 186);
        lIIIllIIlIlll[173] = (((220 + 215) - 374) + 172) ^ (((124 + 42) - 35) + 30);
        lIIIllIIlIlll[174] = 106 ^ 35;
        lIIIllIIlIlll[175] = 228 ^ 174;
        lIIIllIIlIlll[176] = 240 ^ 187;
        lIIIllIIlIlll[177] = 206 ^ 130;
    }

    private static void lIlIIIIlllllIII() {
        lIIIllIIIllIl = new String[lIIIllIIlIlll[16]];
        lIIIllIIIllIl[lIIIllIIlIlll[0]] = lIlIIIIlllIIIII("SUjwmfGTG/UUCHfJoU6m0A==", "jBVrB");
        lIIIllIIIllIl[lIIIllIIlIlll[6]] = lIlIIIIlllIIIIl("PzgeYwQWbQkmBxw=", "pMjCk");
        lIIIllIIIllIl[lIIIllIIlIlll[11]] = lIlIIIIlllIIIlI("8t/mU2LvCXd3jMjeg3t4bA==", "fRdga");
        lIIIllIIIllIl[lIIIllIIlIlll[12]] = lIlIIIIlllIIIIl("PCYiDnccKA==", "hGNeZ");
        lIIIllIIIllIl[lIIIllIIlIlll[13]] = lIlIIIIlllIIIlI("JM5r0zAkmM5wIQImNMowDA==", "UEILt");
        lIIIllIIIllIl[lIIIllIIlIlll[14]] = lIlIIIIlllIIIII("Ju50Y3hK5uBGW6gUYLUeIw==", "LUjEi");
        lIIIllIIIllIl[lIIIllIIlIlll[10]] = lIlIIIIlllIIIlI("PRZPmD3EPCI=", "xQcEC");
        lIIIllIIIllIl[lIIIllIIlIlll[22]] = lIlIIIIlllIIIII("yjhY210DWrMMZYScikXFS4AsnKiaVJbF", "ctoac");
        lIIIllIIIllIl[lIIIllIIlIlll[23]] = lIlIIIIlllIIIlI("JV5DfekcZwPDZE/IIyYuHw==", "fPFnX");
        lIIIllIIIllIl[lIIIllIIlIlll[24]] = lIlIIIIlllIIIlI("KEP8p+lsrTrfx198kg0Gdri99KBx/UQj", "bYEcT");
        lIIIllIIIllIl[lIIIllIIlIlll[25]] = lIlIIIIlllIIIII("cw+UCAkuZiQ=", "IyvWm");
        lIIIllIIIllIl[lIIIllIIlIlll[26]] = lIlIIIIlllIIIlI("fGf0zaEWGmM=", "LueiB");
        lIIIllIIIllIl[lIIIllIIlIlll[27]] = lIlIIIIlllIIIIl("JxJNLxQVVwAnFQMeAylGMjYhAjk/MTIZKT87", "pwmNf");
        lIIIllIIIllIl[lIIIllIIlIlll[28]] = lIlIIIIlllIIIIl("GAF0ADkqRDkIODwNOgZrHSEQIw4dNh0kGA==", "OdTaK");
        lIIIllIIIllIl[lIIIllIIlIlll[29]] = lIlIIIIlllIIIII("Id1NKdF+4RbC6Z7eDqR502bpC3DUEykN", "qAEDn");
        lIIIllIIIllIl[lIIIllIIlIlll[30]] = lIlIIIIlllIIIII("9cvrxnBgVh2To0C+65dz5pqrUNzl3dVo1s/kZvDAOzs=", "zOzIS");
        lIIIllIIIllIl[lIIIllIIlIlll[31]] = lIlIIIIlllIIIlI("5WajBH10MulgDTCQ4ksMP2200Q63FiGmmcU5dhNg7O0=", "FeeEv");
        lIIIllIIIllIl[lIIIllIIlIlll[32]] = lIlIIIIlllIIIlI("ZyuMBhAllGpwUwmCxSBTDtY4pmoDTeHXfGldmE2MU7s=", "pUcof");
        lIIIllIIIllIl[lIIIllIIlIlll[33]] = lIlIIIIlllIIIlI("SQLFeQdhm2t/QaReAMaND8U0ffvFzvvmKxwoxBGuMFg=", "FVfqK");
        lIIIllIIIllIl[lIIIllIIlIlll[21]] = lIlIIIIlllIIIlI("IGt6f/3z4kdgWKyTVXIJ2xIKKW24uMxb", "lEnrh");
        lIIIllIIIllIl[lIIIllIIlIlll[48]] = lIlIIIIlllIIIIl("EiFFAyMgZAgLIjYtCwVxFws1Jw==", "EDebQ");
        lIIIllIIIllIl[lIIIllIIlIlll[49]] = lIlIIIIlllIIIIl("PjNODxwMdgMHHRo/AAlOKhknID0=", "iVnnn");
        lIIIllIIIllIl[lIIIllIIlIlll[50]] = lIlIIIIlllIIIII("SxA7ve7AfVw=", "CYDGI");
        lIIIllIIIllIl[lIIIllIIlIlll[51]] = lIlIIIIlllIIIlI("MammZsQzd2k=", "yfiwh");
        lIIIllIIIllIl[lIIIllIIlIlll[52]] = lIlIIIIlllIIIII("XLnH77gMjn8=", "eCaSs");
        lIIIllIIIllIl[lIIIllIIlIlll[53]] = lIlIIIIlllIIIIl("EA4ZBwcwFRwFBXMxOj9CHCdVLS4cNCdF", "Saukb");
        lIIIllIIIllIl[lIIIllIIlIlll[54]] = lIlIIIIlllIIIIl("Nx8Z", "gpmss");
        lIIIllIIIllIl[lIIIllIIlIlll[55]] = lIlIIIIlllIIIII("FmWnoKe/IMQ=", "ATaCm");
        lIIIllIIIllIl[lIIIllIIlIlll[56]] = lIlIIIIlllIIIII("sUNT0ZORL2s=", "FPKZV");
        lIIIllIIIllIl[lIIIllIIlIlll[47]] = lIlIIIIlllIIIIl("BDEtKQ==", "TXNBA");
        lIIIllIIIllIl[lIIIllIIlIlll[89]] = lIlIIIIlllIIIIl("ESoCKAIr", "YErXg");
        lIIIllIIIllIl[lIIIllIIlIlll[90]] = lIlIIIIlllIIIIl("LzUhIBAV", "gZQPu");
        lIIIllIIIllIl[lIIIllIIlIlll[91]] = lIlIIIIlllIIIlI("MQ1TJ8NbZeY=", "JaKzV");
        lIIIllIIIllIl[lIIIllIIlIlll[94]] = lIlIIIIlllIIIII("uKrTYWhSQD0=", "RSsVh");
        lIIIllIIIllIl[lIIIllIIlIlll[95]] = lIlIIIIlllIIIIl("GwwVOSkhQwYmIicRCiU/", "SceIL");
        lIIIllIIIllIl[lIIIllIIlIlll[96]] = lIlIIIIlllIIIlI("BlMfoyO5kWo=", "LnJXM");
        lIIIllIIIllIl[lIIIllIIlIlll[97]] = lIlIIIIlllIIIlI("aSAZE5Q9KaQNzLY4lSGm0Q==", "BQenI");
        lIIIllIIIllIl[lIIIllIIlIlll[98]] = lIlIIIIlllIIIIl("ESAFOyB3LgMg", "WLjNR");
        lIIIllIIIllIl[lIIIllIIlIlll[99]] = lIlIIIIlllIIIIl("DRQ6BCk=", "HyJpP");
        lIIIllIIIllIl[lIIIllIIlIlll[102]] = lIlIIIIlllIIIlI("8thb4CsICSI9m2sIZWcw+UTDmci8lSHWg5ZDpRIwYx0=", "DVJBL");
        lIIIllIIIllIl[lIIIllIIlIlll[104]] = lIlIIIIlllIIIlI("jCYa5GP39Gsqt0d4mRuLrVdiM0AOItlpY2IIHTw8Gjs0iYHjOrWn7ZRqJPJmKrba", "mZmOn");
        lIIIllIIIllIl[lIIIllIIlIlll[109]] = lIlIIIIlllIIIlI("mg1U4dvouMwXyM4xhKqCGmTDd+Jwv5eS", "BUnMd");
        lIIIllIIIllIl[lIIIllIIlIlll[110]] = lIlIIIIlllIIIlI("0bG2zT9wJuOUDvP2xyNf8uCnJCTpWVC0wPjcKEtEPjXu3Ll65/cFJjmKMTatfw6BEzVMt77SecmakrinnKX9Tw==", "FXbnY");
        lIIIllIIIllIl[lIIIllIIlIlll[111]] = lIlIIIIlllIIIIl("CwM8Oy8rGDk5LWgtAx8PG0I=", "HlPWJ");
        lIIIllIIIllIl[lIIIllIIlIlll[114]] = lIlIIIIlllIIIII("1QEQh+oltGM=", "vnkha");
        lIIIllIIIllIl[lIIIllIIlIlll[115]] = lIlIIIIlllIIIlI("SilR/0BvaOwofQSKEtYxmHVTped5M592ZZPwl2xn7gA=", "VeBqL");
        lIIIllIIIllIl[lIIIllIIlIlll[117]] = lIlIIIIlllIIIIl("KwQ2DgY=", "gmQfr");
        lIIIllIIIllIl[lIIIllIIlIlll[120]] = lIlIIIIlllIIIII("K4fzsD+jxnh/1OgdsZSSIyFcda6rax8QD9+sdhS0j3oWMarW0l47VhOn683K1G9kpDiqi9fw+PE=", "WijNg");
        lIIIllIIIllIl[lIIIllIIlIlll[121]] = lIlIIIIlllIIIIl("GgwONBI6Fws2EHkhMBc5AyY9GjYLEEw=", "YcbXw");
        lIIIllIIIllIl[lIIIllIIlIlll[124]] = lIlIIIIlllIIIII("fJDramrGEUM=", "wvkLJ");
        lIIIllIIIllIl[lIIIllIIlIlll[129]] = lIlIIIIlllIIIII("m4ARVrUwavc=", "aWQys");
        lIIIllIIIllIl[lIIIllIIlIlll[133]] = lIlIIIIlllIIIII("eRz1uvTC9+M/DAWah7KiEpUrW07z6djeoNh2zYRzhixmO9B0D35LZYkTTh73cVEu", "TqVrl");
        lIIIllIIIllIl[lIIIllIIlIlll[134]] = lIlIIIIlllIIIlI("xCNk2Lx12nilzLinjzCMKrvmBmJEbpwc", "KfDqL");
        lIIIllIIIllIl[lIIIllIIlIlll[136]] = lIlIIIIlllIIIIl("KA8WGw==", "xfupA");
        lIIIllIIIllIl[lIIIllIIlIlll[139]] = lIlIIIIlllIIIIl("JzY7CgoHLT4ICEQbFiojOxYROTgrFhs=", "dYWfo");
        lIIIllIIIllIl[lIIIllIIlIlll[141]] = lIlIIIIlllIIIlI("jHXbSI8j9LS2czBjuefUyC1xY87ZAOfwNcbmzaE5IFjSeMDpcjU3Rwc7d09jQHfC", "wAArA");
        lIIIllIIIllIl[lIIIllIIlIlll[143]] = lIlIIIIlllIIIlI("PtJbCHvHwb4=", "ghfVg");
        lIIIllIIIllIl[lIIIllIIlIlll[148]] = lIlIIIIlllIIIII("KfdCIMRcNQ5FC4BSUm/fgg==", "ialrd");
        lIIIllIIIllIl[lIIIllIIlIlll[149]] = lIlIIIIlllIIIIl("ADgEIw==", "SHmMc");
        lIIIllIIIllIl[lIIIllIIlIlll[150]] = lIlIIIIlllIIIIl("MTQGAUQcM0o6Cxw5", "sUjmd");
        lIIIllIIIllIl[lIIIllIIlIlll[152]] = lIlIIIIlllIIIlI("a642UuRw1NOfhnN9ELaoj0KvFJQUExTH", "PiNqe");
        lIIIllIIIllIl[lIIIllIIlIlll[154]] = lIlIIIIlllIIIIl("CTMXHmE/KBsY", "YZtuL");
        lIIIllIIIllIl[lIIIllIIlIlll[159]] = lIlIIIIlllIIIII("k3NbHP9+tcA=", "DIVes");
        lIIIllIIIllIl[lIIIllIIlIlll[162]] = lIlIIIIlllIIIlI("3bWP4u2TmqcWor8uQh9DlIXTXYSwGs95FCC9jAabvJq1tolj894oSojM6D/XbMWx", "KfxsA");
        lIIIllIIIllIl[lIIIllIIlIlll[163]] = lIlIIIIlllIIIlI("TeNbpfA0O5E9IGXvDsw+1JM7Gr1f6KhIYE+Aqb4wGEA7K3I3XMnT/WxgLd3W9G5U", "kDKNk");
        lIIIllIIIllIl[lIIIllIIlIlll[164]] = lIlIIIIlllIIIlI("Xm+h1YN6tV5gvDo1oJod9Lj3GX+5+lSb", "HQftJ");
        lIIIllIIIllIl[lIIIllIIlIlll[166]] = lIlIIIIlllIIIIl("OBkPM0YYFw4sDg==", "zxaXf");
        lIIIllIIIllIl[lIIIllIIlIlll[168]] = lIlIIIIlllIIIlI("XS9aOI7Hk+o=", "eJchg");
        lIIIllIIIllIl[lIIIllIIlIlll[169]] = lIlIIIIlllIIIII("kA3KR3ybi0OV5+EYYgLGaKM5zG6/HlBm", "nGrbl");
        lIIIllIIIllIl[lIIIllIIlIlll[170]] = lIlIIIIlllIIIIl("HSoILwYVJg==", "mCkDg");
        lIIIllIIIllIl[lIIIllIIlIlll[171]] = lIlIIIIlllIIIII("LaBtiUaeiBM=", "AHNbI");
        lIIIllIIIllIl[lIIIllIIlIlll[172]] = lIlIIIIlllIIIIl("NiIVAyk+Lg==", "FKvhH");
        lIIIllIIIllIl[lIIIllIIlIlll[173]] = lIlIIIIlllIIIII("i8iQ5e5lnxc=", "oeKcP");
        lIIIllIIIllIl[lIIIllIIlIlll[174]] = lIlIIIIlllIIIlI("av2Zpcg/BRQ=", "SlZWS");
        lIIIllIIIllIl[lIIIllIIlIlll[175]] = lIlIIIIlllIIIII("HLZjJiJnrJw=", "VTrzz");
        lIIIllIIIllIl[lIIIllIIlIlll[176]] = lIlIIIIlllIIIII("7Xr6puK5fdw=", "VsCFB");
        lIIIllIIIllIl[lIIIllIIlIlll[177]] = lIlIIIIlllIIIlI("taB9NWE/meU=", "esYCb");
    }

    private static boolean lIlIIIIlllllIlI(int i) {
        return i == 0;
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[13]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[12]]);
        "".length();
        if ((-"  ".length()) > 0) {
        }
    }

    private void bI() {
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[46];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[57];
        if (lIlIIIIlllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[14]]);
        if (lIlIIIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIlll[26]];
            dialogOptionArr[lIIIllIIlIlll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[6]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArr[lIIIllIIlIlll[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[13]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIIlIlll[14]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[22]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArr[lIIIllIIlIlll[23]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[24]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArr[lIIIllIIlIlll[25]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr3 = new int[lIIIllIIlIlll[6]];
        iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[58];
        NPC nearest = NPCs.getNearest(iArr3);
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[22]]);
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[59], lIIIllIIlIlll[60], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[10]]);
        "".length();
        if ((-((((161 + 82) - 189) + 115) ^ (((36 + 94) - 51) + 94))) >= 0) {
        }
    }

    private static boolean lIlIIIIllllllIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    private void bT() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[38]) ? 1 : 0)) {
            return;
        }
        if (lIlIIIIlllllIlI(d(lIIIllIIlIlll[75]) ? 1 : 0)) {
            ?? r0 = lIIIllIIlIlll[6];
            int[] iArr = new int[lIIIllIIlIlll[6]];
            iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (lIlIIIIllllllIl(Inventory.getCount((boolean) r0, iArr), lIIIllIIlIlll[108])) {
                return;
            }
        }
        if (lIlIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
            ca();
            return;
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[109]]);
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
        if (lIlIIIIlllllllI(Bank.contains(iArr2) ? 1 : 0)) {
            ?? r02 = lIIIllIIlIlll[6];
            int[] iArr3 = new int[lIIIllIIlIlll[6]];
            iArr3[lIIIllIIlIlll[0]] = lIIIllIIlIlll[75];
            if (lIlIIIIllllllIl(Bank.getCount((boolean) r02, iArr3), lIIIllIIlIlll[108])) {
                Bank.withdraw(lIIIllIIlIlll[75], lIIIllIIlIlll[108], Bank.WithdrawMode.ITEM);
                return;
            }
        }
        System.out.println(lIIIllIIIllIl[lIIIllIIlIlll[110]]);
    }

    private void bQ() {
        if (lIlIIIIlllllllI(d(lIIIllIIlIlll[35]) ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIIlIlll[6]];
        iArr[lIIIllIIlIlll[0]] = lIIIllIIlIlll[73];
        if (lIlIIIIlllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIlIlll[6]];
        iArr2[lIIIllIIlIlll[0]] = lIIIllIIlIlll[80];
        NPC nearest = NPCs.getNearest(iArr2);
        if (lIlIIIIlllllllI(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne(lIIIllIIlIlll[73]);
        }
        if (!lIlIIIIllllllll(nearest) || !lIlIIIIlllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIIlIlll[81], lIIIllIIlIlll[82], lIIIllIIlIlll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIllIl[lIIIllIIlIlll[52]]);
        "".length();
        if ((-" ".length()) >= 0) {
        }
    }

    private static boolean lIlIIIIllllllII(int i, int i2) {
        return i == i2;
    }
}
