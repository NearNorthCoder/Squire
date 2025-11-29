/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Looting", priority=10, blocking=true)
public class LootingTask
extends GauntletTaskBase {

    private static void llllllllIIllll() {
        llIIlllIIllI = new String[llIIlllIIlll[4]];
        Z.llIIlllIIllI[Z.llIIlllIIlll[1]] = "Drop";
        Z.llIIlllIIllI[Z.llIIlllIIlll[0]] = "Open";
        Z.llIIlllIIllI[Z.llIIlllIIlll[10]] = ",";
        Z.llIIlllIIllI[Z.llIIlllIIlll[3]] = ",";
    }

    private static boolean llllllllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llllllllIlIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public LootingTask(c c2) {
        d[] dArray = new d[llIIlllIIlll[0]];
        dArray[Z.llIIlllIIlll[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    private static boolean llllllllIlIIll(Object object) {
        return object != null;
    }

    static {
        Z.llllllllIlIIII();
        Z.llllllllIIllll();
    }

    private static boolean llllllllIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllllIlIIIl(Object object) {
        return object == null;
    }

    private static boolean llllllllIlIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        TileObject var2;
        Z var3;
        Item var4;
        Player player = Players.getLocal();
        if (Z.llllllllIlIIIl(player)) {
            return llIIlllIIlll[1];
        }
        if (Z.llllllllIlIIlI(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (Z.llllllllIlIIll(var4 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().dropping().split(llIIlllIIllI[llIIlllIIlll[3]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId())))))) {
            var4.interact(llIIlllIIllI[llIIlllIIlll[1]]);
            return llIIlllIIlll[0];
        }
        if (Z.llllllllIlIlII(SpellBook.STANDARD, SpellBook.getCurrent()) && Z.llllllllIlIIlI(SpellBook.Standard.HIGH_LEVEL_ALCHEMY.canCast() ? 1 : 0)) {
            Item var5 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIlllIIllI[llIIlllIIlll[10]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[2];
            var2 = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(var5) && Z.llllllllIlIIll(var2)) {
                if (Z.llllllllIlIlIl(var2.distanceTo((Locatable)var1), llIIlllIIlll[3])) {
                    Movement.setDestination((int)var2.menuPoint().getX(), (int)var2.menuPoint().getY());
                    if (Z.llllllllIlIIlI(var3.ba.h().waitAfterAttempt() ? 1 : 0)) {
                        var3.sleep(Rand.nextInt((int)llIIlllIIlll[4], (int)llIIlllIIlll[5]));
                        return llIIlllIIlll[0];
                    }
                }
                if (Z.llllllllIlIllI(Tabs.isOpen((Tab)Tab.MAGIC) ? 1 : 0)) {
                    Tabs.open((Tab)Tab.MAGIC);
                }
                Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY);
                var5.interact(llIIlllIIlll[1], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var5.getSlot(), WidgetInfo.INVENTORY.getId());
                if (Z.llllllllIlIIlI(var3.ba.h().waitAfterAttempt() ? 1 : 0)) {
                    var3.sleep(Rand.nextInt((int)llIIlllIIlll[6], (int)llIIlllIIlll[7]));
                }
                var3.sleep(llIIlllIIlll[0]);
                return llIIlllIIlll[0];
            }
        }
        if (Z.llllllllIlIlll(Vars.getBit((int)llIIlllIIlll[8]), llIIlllIIlll[0])) {
            if (Z.llllllllIlIIlI(var1.isMoving() ? 1 : 0)) {
                return llIIlllIIlll[0];
            }
            int var5 = Inventory.getFreeSlots();
            if (Z.llllllllIllIII(var5, llIIlllIIlll[4])) {
                return llIIlllIIlll[0];
            }
            if (Z.llllllllIlIIlI(var3.ba.h().hopUntilEmpty() ? 1 : 0) && Z.llllllllIlIlIl(Players.getAll().size(), llIIlllIIlll[0])) {
                return llIIlllIIlll[1];
            }
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[9];
            var2 = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(var2)) {
                var2.interact(llIIlllIIllI[llIIlllIIlll[0]]);
                return llIIlllIIlll[0];
            }
        }
        return llIIlllIIlll[1];
    }
}

