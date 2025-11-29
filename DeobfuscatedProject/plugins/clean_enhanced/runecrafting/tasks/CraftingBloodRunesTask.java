/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.tasks.RunecraftingManager;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Crafting Blood Runes")
public class CraftingBloodRunesTask
extends Task {
    
    private final  SquireZeahRunecrafter v;
    private static final  WorldPoint t;
    
    private final  a u;
    private static final  WorldArea s;

    @Inject
    public CraftingBloodRunesTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.u = a2;
        this.v = squireZeahRunecrafter;
    }

    public boolean run() {
        d var3;
        if (!(this.v.a( != 0) ? 1 : 0) || (this.m( == 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var4 = var3.p();
        if var4 != null {
            var3.a(var4);
            0;
            
        } else {
            var3.q();
        }
        return 1;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < llllllllllllllIllIIlIIIIlllIIlll2) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x85 ^ 0x80) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private boolean m() {
        boolean bl;
        if (!(this.n( == 0) ? 1 : 0) || (this.o( != 0) ? 1 : 0)) {
            bl = 1;
            0;
            if (((0x61 ^ 9 ^ (0xDF ^ 0xA1)) & (5 ^ 0x59 ^ (0xEB ^ 0xA1) ^ -1)) < 0) {
                return ((72 + 19 - 69 + 143 ^ 82 + 122 - 160 + 117) & (20 + 10 - -112 + 3 ^ 127 + 18 - 119 + 123 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private void a(TileObject tileObject) {
        tileObject.interact(var1[0]);
    }

    private TileObject p() {
        TileObject tileObject;
        int[] nArray = new int[1];
        nArray[0] = 5;
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        if (tileObject2 != null && (Reachable.isInteractable(LocatabletileObject2) ? 1 : 0)) {
            tileObject = tileObject2;
            0;
            if (((0x78 ^ 0x1A) & ~(0xC3 ^ 0xA1)) > ((0xBB ^ 0x92) & ~(0x94 ^ 0xBD))) {
                return null;
            }
        } else {
            tileObject = null;
        }
        return tileObject;
    }

    private boolean n() {
        int n;
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0) && (this.u.h() == this.u.h()2)) && (Inventory.isFull( != 0) ? 1 : 0)) {
            n = 1;
            0;
            if (2 <= 0) {
                return ((0x10 ^ 0x71) & ~(0xE6 ^ 0x87)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private void q() {
        Movement.walkTo((WorldPoint)t);
        0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean o() {
        int n;
        if ((s.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 3;
            if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[1];
                nArray2[0] = 4;
                if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                    n = 1;
                    0;
                    if (-1 < 2) return n != 0;
                    return ((0xB7 ^ 0x80) & ~(0x23 ^ 0x14)) != 0;
                }
            }
        }
        n = 0;
        return n != 0;
    }

    static {
        d.var15();
        d.var16();
        s = new WorldArea(6, 7, 8, 9, 0);
        t = new WorldPoint(var2[10], var2[11], 0);
    }
}

