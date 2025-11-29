/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.wilderness.altar.ChaosAltar;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Altaring")
public class bX
extends Task {
    private final /* synthetic */ Client hg;
    private static /* synthetic */ int[] lIIlIIlll;
    private static /* synthetic */ String[] lIIlIIllI;
    private final /* synthetic */ ChaosAltar hf;

    private boolean cX() {
        String[] stringArray = new String[lIIlIIlll[1]];
        stringArray[bX.lIIlIIlll[0]] = lIIlIIllI[lIIlIIlll[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bX.lIIIIIIIIII(tileObject)) {
            return lIIlIIlll[0];
        }
        tileObject.interact(lIIlIIllI[lIIlIIlll[3]]);
        this.sleep(lIIlIIlll[5]);
        return lIIlIIlll[1];
    }

    private static boolean llllllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllllll(Object object) {
        return object != null;
    }

    private static void lllllllIlI() {
        lIIlIIlll = new int[8];
        bX.lIIlIIlll[0] = (0x91 ^ 0x9F) & ~(0x19 ^ 0x17);
        bX.lIIlIIlll[1] = 1;
        bX.lIIlIIlll[2] = 0x31 ^ 0x28;
        bX.lIIlIIlll[3] = 2;
        bX.lIIlIIlll[4] = 0xFFFFFFFB & 0x1F3F;
        bX.lIIlIIlll[5] = 3;
        bX.lIIlIIlll[6] = 0xAF ^ 0xAB;
        bX.lIIlIIlll[7] = 133 + 128 - 139 + 29 ^ 124 + 35 - 35 + 22;
    }

    private static boolean lIIIIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bX.lllllllIlI();
        bX.lllllllIIl();
    }

    private static boolean lllllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllllIII(String llIIlIIIllllllI, String llIIlIIlIIIIIlI) {
        llIIlIIIllllllI = new String(Base64.getDecoder().decode(llIIlIIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIIlIIIIIIl = new StringBuilder();
        char[] llIIlIIlIIIIIII = llIIlIIlIIIIIlI.toCharArray();
        int llIIlIIIlllllll = lIIlIIlll[0];
        char[] llIIlIIIllllIIl = llIIlIIIllllllI.toCharArray();
        int llIIlIIIllllIII = llIIlIIIllllIIl.length;
        int llIIlIIIlllIlll = lIIlIIlll[0];
        while (bX.lIIIIIIIIIl(llIIlIIIlllIlll, llIIlIIIllllIII)) {
            char llIIlIIlIIIIlII = llIIlIIIllllIIl[llIIlIIIlllIlll];
            llIIlIIlIIIIIIl.append((char)(llIIlIIlIIIIlII ^ llIIlIIlIIIIIII[llIIlIIIlllllll % llIIlIIlIIIIIII.length]));
            0;
            ++llIIlIIIlllllll;
            ++llIIlIIIlllIlll;
            0;
            if (((0x29 ^ 0x6E) & ~(0xF8 ^ 0xBF)) == 0) continue;
            return null;
        }
        return String.valueOf(llIIlIIlIIIIIIl);
    }

    private static boolean llllllllIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        bX llIIlIIlIIllIlI;
        if (bX.lllllllIll(this.hg.getGameState(), GameState.LOGGED_IN)) {
            return lIIlIIlll[0];
        }
        if (bX.llllllllII(llIIlIIlIIllIlI.hf.cY() ? 1 : 0)) {
            Game.logout();
            return lIIlIIlll[1];
        }
        if (bX.llllllllIl(Movement.isRunEnabled() ? 1 : 0) && bX.lllllllllI(Movement.getRunEnergy(), lIIlIIlll[2])) {
            Movement.toggleRun();
        }
        if (bX.llllllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIIlll[0];
        }
        if (bX.llllllllII(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIlIIlll[3]];
            dialogOptionArray[bX.lIIlIIlll[0]] = DialogOption.CHAT_OPTION_THREE;
            dialogOptionArray[bX.lIIlIIlll[1]] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        String[] stringArray = new String[lIIlIIlll[1]];
        stringArray[bX.lIIlIIlll[0]] = lIIlIIllI[lIIlIIlll[0]];
        TileObject llIIlIIlIIllIIl = TileObjects.getNearest((String[])stringArray);
        Item llIIlIIlIIllIII = Inventory.getFirst(item -> {
            int n2;
            if (bX.llllllllII(item.getName().contains(lIIlIIllI[lIIlIIlll[6]]) ? 1 : 0) && bX.llllllllIl(item.isNoted() ? 1 : 0)) {
                n2 = lIIlIIlll[1];
                0;
                if ((0xB3 ^ 0xB7) == 0) {
                    return ((0x6E ^ 0x59) & ~(0x77 ^ 0x40)) != 0;
                }
            } else {
                n2 = lIIlIIlll[0];
            }
            return n2 != 0;
        });
        if (bX.llllllllll(llIIlIIlIIllIIl) && bX.llllllllll(llIIlIIlIIllIII)) {
            if (bX.llllllllIl(Reachable.isInteractable((Locatable)llIIlIIlIIllIIl) ? 1 : 0)) {
                return llIIlIIlIIllIlI.cX();
            }
            llIIlIIlIIllIII.useOn(llIIlIIlIIllIIl);
            return lIIlIIlll[1];
        }
        if (bX.lIIIIIIIIII(llIIlIIlIIllIII)) {
            int[] nArray = new int[lIIlIIlll[1]];
            nArray[bX.lIIlIIlll[0]] = lIIlIIlll[4];
            NPC llIIlIIlIIlIlll = NPCs.getNearest((int[])nArray);
            Item llIIlIIlIIlIllI = Inventory.getFirst(item -> {
                int n2;
                if (bX.llllllllII(item.getName().contains(lIIlIIllI[lIIlIIlll[5]]) ? 1 : 0) && bX.llllllllII(item.isNoted() ? 1 : 0)) {
                    n2 = lIIlIIlll[1];
                    0;
                    if (2 != 2) {
                        return ((0xEF ^ 0xAE) & ~(0x1C ^ 0x5D)) != 0;
                    }
                } else {
                    n2 = lIIlIIlll[0];
                }
                return n2 != 0;
            });
            if (!bX.llllllllll(llIIlIIlIIlIlll) || bX.lIIIIIIIIII(llIIlIIlIIlIllI)) {
                return lIIlIIlll[0];
            }
            if (bX.llllllllIl(Reachable.isInteractable((Locatable)llIIlIIlIIlIlll) ? 1 : 0)) {
                return llIIlIIlIIllIlI.cX();
            }
            llIIlIIlIIlIllI.useOn((Actor)llIIlIIlIIlIlll);
        }
        return lIIlIIlll[0];
    }

    @Inject
    public bX(ChaosAltar chaosAltar, Client client) {
        this.hf = chaosAltar;
        this.hg = client;
    }

    private static boolean lIIIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllllllIll(Object object, Object object2) {
        return object != object2;
    }

    private static void lllllllIIl() {
        lIIlIIllI = new String[lIIlIIlll[7]];
        bX.lIIlIIllI[bX.lIIlIIlll[0]] = bX."Chaos altar";
        bX.lIIlIIllI[bX.lIIlIIlll[1]] = bX."Large door";
        bX.lIIlIIllI[bX.lIIlIIlll[3]] = bX."Open";
        bX.lIIlIIllI[bX.lIIlIIlll[5]] = bX."bones";
        bX.lIIlIIllI[bX.lIIlIIlll[6]] = bX."bones";
    }
}

