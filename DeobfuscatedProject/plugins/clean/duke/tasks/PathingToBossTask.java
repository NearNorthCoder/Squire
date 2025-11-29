/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends DukeTaskBase {
    private  WorldArea av;
    private final  a ar;
    private  WorldArea at;
    private  WorldArea aw;
    private  WorldArea au;
    private  WorldArea ay;
    private final  SquireDukeSucellus aq;
    private  WorldPoint aA;
    private  WorldArea ax;
    private final  SquireDukeSucellusConfig as;
    private  WorldPoint az;
    
    private  WorldPoint aB;
    private static final  int ap;

    private static boolean lllIIlIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void lllIIlIlllIIlI() {
        lIllIIllIIIl = new String[lIllIIllIIlI[45]];
        p.lIllIIllIIIl[p.lIllIIllIIlI[2]] = "Stairs";
        p.lIllIIllIIIl[p.lIllIIllIIlI[29]] = "Descend";
        p.lIllIIllIIIl[p.lIllIIllIIlI[31]] = "Broken fence";
        p.lIllIIllIIIl[p.lIllIIllIIlI[32]] = "Squeeze-through";
        p.lIllIIllIIIl[p.lIllIIllIIlI[35]] = "Open";
        p.lIllIIllIIIl[p.lIllIIllIIlI[36]] = "Consume the awakener's orb";
        p.lIllIIllIIIl[p.lIllIIllIIlI[37]] = "No.";
        p.lIllIIllIIIl[p.lIllIIllIIlI[38]] = "Gate";
        p.lIllIIllIIIl[p.lIllIIllIIlI[39]] = "Open";
        p.lIllIIllIIIl[p.lIllIIllIIlI[41]] = "Ring of shadows";
        p.lIllIIllIIIl[p.lIllIIllIIlI[43]] = "Ring of shadows";
        p.lIllIIllIIIl[p.lIllIIllIIlI[44]] = "Teleport";
    }

    @Override
    public boolean R() {
        p var2;
        if (p.lllIIlIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) && p.lllIIlIlllIlIl(House.isInside() ? 1 : 0)) {
            return lIllIIllIIlI[2];
        }
        if (p.lllIIlIlllIlII(var2.aq.m() ? 1 : 0)) {
            var2.aq.forceStop();
            return lIllIIllIIlI[29];
        }
        var2.ar.t();
        Player var3 = Players.getLocal();
        if (p.lllIIlIlllIllI(var3)) {
            return lIllIIllIIlI[2];
        }
        if (p.lllIIlIlllIlII(var2.av.contains((Locatable)var3) ? 1 : 0)) {
            var2.a(lIllIIllIIIl[lIllIIllIIlI[2]], lIllIIllIIIl[lIllIIllIIlI[29]], lIllIIllIIlI[30], var3);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlII(var2.au.contains((Locatable)var3) ? 1 : 0)) {
            var2.a(lIllIIllIIIl[lIllIIllIIlI[31]], lIllIIllIIIl[lIllIIllIIlI[32]], lIllIIllIIlI[33], var3);
            return lIllIIllIIlI[29];
        }
        int[] nArray = new int[lIllIIllIIlI[29]];
        nArray[p.lIllIIllIIlI[2]] = lIllIIllIIlI[34];
        TileObject var4 = TileObjects.getFirstAt((WorldPoint)var2.aA, (int[])nArray);
        if (p.lllIIlIlllIlll(var4)) {
            var4.interact(lIllIIllIIIl[lIllIIllIIlI[35]]);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlII(var2.ay.contains((Locatable)var3) ? 1 : 0)) {
            if (p.lllIIlIlllIlII(Dialog.getName().contains(lIllIIllIIIl[lIllIIllIIlI[36]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIIlI[29]];
                stringArray[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[37]];
                Dialog.chooseOption((String[])stringArray);

                return lIllIIllIIlI[29];
            }
            var2.a(lIllIIllIIIl[lIllIIllIIlI[38]], lIllIIllIIIl[lIllIIllIIlI[39]], lIllIIllIIlI[40], var3);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlIl(var2.ax.contains((Locatable)var3) ? 1 : 0) && p.lllIIlIlllIlIl(var2.ay.contains((Locatable)var3) ? 1 : 0)) {
            String[] stringArray = new String[lIllIIllIIlI[29]];
            stringArray[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[41]];
            if (p.lllIIlIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0) && p.lllIIlIllllIII(Vars.getBit((int)lIllIIllIIlI[42]), lIllIIllIIlI[29])) {
                if (p.lllIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && p.lllIIlIlllIlII(Dialog.isViewingOptions() ? 1 : 0)) {
                    Dialog.chooseOption((int)lIllIIllIIlI[31]);

                }
                String[] stringArray2 = new String[lIllIIllIIlI[29]];
                stringArray2[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[43]];
                Item var5 = Inventory.getFirst((String[])stringArray2);
                var5.interact(lIllIIllIIIl[lIllIIllIIlI[44]]);
                return lIllIIllIIlI[29];
            }
        }
        Movement.walkTo((WorldPoint)this.aB);

        return lIllIIllIIlI[29];
    }

    @Override
    public boolean run() {
        if (p.lllIIlIlllIlII(this.aq.PathingToBossTask() ? 1 : 0)) {
            return lIllIIllIIlI[2];
        }
        return this.R();
    }

    static {
        p.lllIIlIlllIIll();
        p.lllIIlIlllIIlI();
        ap = lIllIIllIIlI[42];
    }

    private static boolean lllIIlIlllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lllIIlIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public PathingToBossTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.at = new WorldArea(new WorldPoint(lIllIIllIIlI[0], lIllIIllIIlI[1], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[3], lIllIIllIIlI[4], lIllIIllIIlI[2]));
        this.au = new WorldArea(new WorldPoint(lIllIIllIIlI[5], lIllIIllIIlI[6], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[8], lIllIIllIIlI[2]));
        this.av = new WorldArea(new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[9], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[10], lIllIIllIIlI[11], lIllIIllIIlI[2]));
        this.aw = new WorldArea(new WorldPoint(lIllIIllIIlI[12], lIllIIllIIlI[13], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[14], lIllIIllIIlI[15], lIllIIllIIlI[2]));
        this.ax = new WorldArea(new WorldPoint(lIllIIllIIlI[16], lIllIIllIIlI[17], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[18], lIllIIllIIlI[19], lIllIIllIIlI[2]));
        this.ay = new WorldArea(new WorldPoint(lIllIIllIIlI[20], lIllIIllIIlI[21], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[22], lIllIIllIIlI[23], lIllIIllIIlI[2]));
        this.az = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[25], lIllIIllIIlI[2]);
        this.aA = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[26], lIllIIllIIlI[2]);
        this.aB = new WorldPoint(lIllIIllIIlI[27], lIllIIllIIlI[28], lIllIIllIIlI[2]);
        this.aq = squireDukeSucellus;
        this.ar = squireDukeSucellus.s();
        this.as = squireDukeSucellusConfig;
    }

    private static boolean lllIIlIlllIlll(Object object) {
        return object != null;
    }

    private static boolean lllIIlIlllIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var6;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (p.lllIIlIllllIII(tileObject.getId(), n2) && p.lllIIlIlllIlII(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIIlI[29]];
                stringArray[p.lIllIIllIIlI[2]] = string2;
                if (p.lllIIlIlllIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIllIIllIIlI[29];

                    if (null == null) return n3 != 0;
                    return ((0x5A ^ 0x54) & ~(0x9B ^ 0x95) & ~((0x74 ^ 0x54) & ~(0x41 ^ 0x61))) != 0;
                }
            }
            n3 = lIllIIllIIlI[2];
            return n3 != 0;
        });
        if (p.lllIIlIlllIllI(tileObject2)) {
            return;
        }
        if (p.lllIIlIlllIlII(var6.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }
}

