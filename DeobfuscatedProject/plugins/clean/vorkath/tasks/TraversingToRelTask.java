/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.WorldLocation
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Traversing to Rel", priority=100)
public class TraversingToRelTask
extends Task {
    private final  Client cC;
    
    private static final  WorldPoint cy;
    private static final  int cz;
    private final  SquireVorkathPlugin cB;
    
    private final  SquireVorkathConfig cA;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        O var1;
        if (O.llIIIIIIIlllIlI(Arrays.stream(this.cC.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (O.llIIIIIIlIIIIll(n2, lIlIllIIlIIIl[15])) {
                bl = lIlIllIIlIIIl[0];

                if (-(117 + 39 - -25 + 1 ^ 123 + 99 - 91 + 48) >= 0) {
                    return ((87 + 165 - 76 + 37 ^ 99 + 129 - 220 + 173) & (0xDA ^ 0xA8 ^ (0xD3 ^ 0xC1) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIIlIIIl[1];
            }
            return bl;
        }) ? 1 : 0)) {
            this.ah();

            return lIlIllIIlIIIl[0];
        }
        if (!O.llIIIIIIIlllIll(var1.cC.isInInstancedRegion() ? 1 : 0) || O.llIIIIIIIlllIlI(Arrays.stream(var1.cC.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (O.llIIIIIIlIIIIll(n2, lIlIllIIlIIIl[14])) {
                bl = lIlIllIIlIIIl[0];

                if (((0x13 ^ 0x42) & ~(0xCE ^ 0x9F)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIllIIlIIIl[1];
            }
            return bl;
        }) ? 1 : 0)) {
            return lIlIllIIlIIIl[1];
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        if (O.llIIIIIIIllllII(cy.distanceTo(var2), lIlIllIIlIIIl[2]) && O.llIIIIIIIllllIl(var2.getX(), cy.getX())) {
            return lIlIllIIlIIIl[1];
        }
        if (O.llIIIIIIIlllIll(((BankLoadout)var1.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0) && O.llIIIIIIIlllllI(Combat.getMissingHealth()) && O.llIIIIIIIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            var1.cB.a(lIlIllIIlIIIl[1]);
            var1.ah();

            return lIlIllIIlIIIl[0];
        }
        if (O.llIIIIIIIlllIlI(((BankLoadout)var1.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            return lIlIllIIlIIIl[1];
        }
        int[] nArray = new int[lIlIllIIlIIIl[0]];
        nArray[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[3];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (O.llIIIIIIIllllll(var3)) {
            if (O.llIIIIIIlIIIIII(var2.getRegionID(), lIlIllIIlIIIl[4]) && O.llIIIIIIlIIIIII(var2.getRegionID(), lIlIllIIlIIIl[5])) {
                return var1.ah();
            }
            if (O.llIIIIIIIlllIll(var1.cB.c() ? 1 : 0)) {
                return var1.ah();
            }
            return lIlIllIIlIIIl[1];
        }
        var2_2.interact(lIlIllIIlIIII[lIlIllIIlIIIl[1]]);
        this.sleep(lIlIllIIlIIIl[6]);
        return lIlIllIIlIIIl[0];
    }

    private static boolean llIIIIIIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIlIIIIIl(Object object) {
        return object != null;
    }

    static {
        O.llIIIIIIIlllIIl();
        O.llIIIIIIIlllIII();
        cz = lIlIllIIlIIIl[4];
        cy = new WorldPoint(lIlIllIIlIIIl[16], lIlIllIIlIIIl[17], lIlIllIIlIIIl[1]);
    }

    private boolean ah() {
        if (O.llIIIIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIllIIlIIIl[0];
        }
        int[] nArray = new int[lIlIllIIlIIIl[0]];
        nArray[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (O.llIIIIIIlIIIIIl(var4)) {
            int[] nArray2 = new int[lIlIllIIlIIIl[0]];
            nArray2[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
            Inventory.getFirst((int[])nArray2).interact(lIlIllIIlIIII[lIlIllIIlIIIl[0]]);
            return lIlIllIIlIIIl[0];
        }
        int[] nArray3 = new int[lIlIllIIlIIIl[8]];
        nArray3[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[9];
        nArray3[O.lIlIllIIlIIIl[0]] = lIlIllIIlIIIl[10];
        Item var5 = Inventory.getFirst((int[])nArray3);
        if (O.llIIIIIIlIIIIIl(var5)) {
            var5.interact(lIlIllIIlIIII[lIlIllIIlIIIl[8]]);
            Keyboard.type((int)lIlIllIIlIIIl[11]);
            return lIlIllIIlIIIl[0];
        }
        if (O.llIIIIIIlIIIIlI(House.getHouseLocation(), WorldLocation.RELLEKKA_POH_PORTAL)) {
            int[] nArray4 = new int[lIlIllIIlIIIl[0]];
            nArray4[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[12];
            Item var6 = Inventory.getFirst((int[])nArray4);
            if (O.llIIIIIIlIIIIIl(var6)) {
                var6.interact(lIlIllIIlIIII[lIlIllIIlIIIl[13]]);
                return lIlIllIIlIIIl[0];
            }
            SpellBook.Standard var7 = SpellBook.Standard.TELEPORT_TO_HOUSE;
            Widget var8 = Widgets.get((WidgetInfo)var7.getWidget());
            if (O.llIIIIIIlIIIIIl(var8)) {
                var8.interact(lIlIllIIlIIII[lIlIllIIlIIIl[6]]);
                return lIlIllIIlIIIl[0];
            }
        }
        Movement.walkTo((WorldPoint)cy);

        return lIlIllIIlIIIl[0];
    }

    @Inject
    protected TraversingToRelTask(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin, Client client) {
        this.cA = squireVorkathConfig;
        this.cC = client;
        this.cB = squireVorkathPlugin;
    }

    private static boolean llIIIIIIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIIlIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIIIIIllllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIlIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIIIIlllllI(int n2) {
        return n2 <= 0;
    }

    private static boolean llIIIIIIIllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIIIIIlllIII() {
        lIlIllIIlIIII = new String[lIlIllIIlIIIl[18]];
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[1]] = "Enter";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[0]] = "Teleport";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[8]] = "Teleport";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[13]] = "Outside";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[6]] = "Outside";
    }

    private static boolean llIIIIIIIlllIlI(int n2) {
        return n2 != 0;
    }
}

