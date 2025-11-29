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
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public LootingTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.OUTSIDE;
        super(c2, dArray);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var15;
        TileObject var16;
        Z var17;
        Item var18;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        if ((Prayers.anyActive( != 0) ? 1 : 0)) {
            Prayers.disableAll();
        }
        if ((var18 = Inventory.getFirst(item -> Arrays.stream(this.ba.h( != null).dropping().split(var2[3])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId())))))) {
            var18.interact(var2[1]);
            return 0;
        }
        if (SpellBook.STANDARD == SpellBook.STANDARD2) && (SpellBook.Standard.HIGH_LEVEL_ALCHEMY.canCast( != 0) ? 1 : 0)) {
            Item var19 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(var2[var1[10]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
            int[] nArray = new int[0];
            nArray[1] = 2;
            var16 = TileObjects.getNearest((int[])nArray);
            if (var19 != null && var16 != null) {
                if ((var16.distanceTo((Locatable)var15) > 3)) {
                    Movement.setDestination((int)var16.menuPoint().getX(), (int)var16.menuPoint().getY());
                    if ((var17.ba.h( != 0).waitAfterAttempt() ? 1 : 0)) {
                        var17.sleep(Rand.nextInt((int)4, (int)5));
                        return 0;
                    }
                }
                if ((Tabs.isOpen((Tab == 0)Tab.MAGIC) ? 1 : 0)) {
                    Tabs.open((Tab)Tab.MAGIC);
                }
                Magic.cast((SpeSpellBook.Standard.HIGH_LEVEL_ALCHEMY);
                var19.interact(1, MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var19.getSlot(), WidgetInfo.INVENTORY.getId());
                if ((var17.ba.h( != 0).waitAfterAttempt() ? 1 : 0)) {
                    var17.sleep(Rand.nextInt((int)6, (int)7));
                }
                var17.sleep(0);
                return 0;
            }
        }
        if ((Vars.getBit((int)8) == 0)) {
            if ((var15.isMoving( != 0) ? 1 : 0)) {
                return 0;
            }
            int var19 = Inventory.getFreeSlots();
            if (var19 < 4) {
                return 0;
            }
            if ((var17.ba.h( != 0).hopUntilEmpty() ? 1 : 0) && (Players.getAll().size() > 0)) {
                return 1;
            }
            int[] nArray = new int[0];
            nArray[1] = 9;
            var16 = TileObjects.getNearest((int[])nArray);
            if var16 != null {
                var16.interact(var2[0]);
                return 0;
            }
        }
        return 1;
    }
}

