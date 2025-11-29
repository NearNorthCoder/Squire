/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting", priority=5)
public class TeleportingTask
extends Task {
    private final  SquirePlankerConfig o;

    @Inject
    public TeleportingTask(SquirePlankerConfig squirePlankerConfig) {
        this.o = squirePlankerConfig;
    }

    public boolean run() {
        e var1;
        if (e.lIIlIIllllllIII(this.o.spell() ? 1 : 0)) {
            return llllllIIIlII[0];
        }
        String[] stringArray = new String[llllllIIIlII[1]];
        stringArray[e.llllllIIIlII[0]] = llllllIIIIll[llllllIIIlII[0]];
        stringArray[e.llllllIIIlII[2]] = llllllIIIIll[llllllIIIlII[2]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        int[] nArray = new int[llllllIIIlII[2]];
        nArray[e.llllllIIIlII[0]] = var1.o.plank().d();
        if (e.lIIlIIllllllIII(Inventory.contains((int[])nArray) ? 1 : 0) && e.lIIlIIllllllIIl(var2)) {
            Widget var3 = Widgets.get((WidgetInfo)SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (e.lIIlIIllllllIIl(var3)) {
                if (e.lIIlIIllllllIII(var3.hasAction(llllllIIIIll[llllllIIIlII[1]]::equals) ? 1 : 0)) {
                    var3.interact(llllllIIIIll[llllllIIIlII[3]]);

                } else {
                    var3.interact(llllllIIIIll[llllllIIIlII[4]]);
                }
                var1.sleep(llllllIIIlII[5]);
                return llllllIIIlII[2];
            }

            }
        } else {
            int[] nArray2 = new int[llllllIIIlII[2]];
            nArray2[e.llllllIIIlII[0]] = var1.o.plank().d();
            if (e.lIIlIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && e.lIIlIIllllllIll(var2)) {
                int n;
                if (e.lIIlIIllllllIII(var1.o.ironMode() ? 1 : 0)) {
                    TileObject var3 = TileObjects.getNearest(tileObject -> {
                        boolean bl;
                        if (!e.lIIlIIllllllIlI(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[8]]) ? 1 : 0) || e.lIIlIIllllllIII(tileObject.getName().contains(llllllIIIIll[llllllIIIlII[9]]) ? 1 : 0)) {
                            bl = llllllIIIlII[2];

                            if (-1 == 1) {
                                return false;
                            }
                        } else {
                            bl = llllllIIIlII[0];
                        }
                        return bl;
                    });
                    World var4 = Worlds.getCurrentWorld();
                    if (e.lIIlIIllllllIII(var4.isAllPkWorld() ? 1 : 0)) {
                        Log.info((String)llllllIIIIll[llllllIIIlII[5]]);
                        return llllllIIIlII[0];
                    }
                    if (e.lIIlIIllllllIIl(var3)) {
                        var3.interact(string -> string.contains(llllllIIIIll[llllllIIIlII[7]]));
                        return llllllIIIlII[2];
                    }
                }
                Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                if (e.lIIlIIllllllIII(var1.o.slowmode() ? 1 : 0)) {
                    n = llllllIIIlII[6];

                    if ((0xC4 ^ 0xC0) <= 2) {
                        return false;
                    }
                } else {
                    n = llllllIIIlII[5];
                }
                var1.sleep(n);
            }
        }
        return llllllIIIlII[2];
    }

    private static boolean lIIlIIllllllIll(Object object) {
        return object == null;
    }

    private static void lIIlIIlllllIlIl() {
        llllllIIIIll = new String[llllllIIIlII[10]];
        e.llllllIIIIll[e.llllllIIIlII[0]] = "Bank chest";
        e.llllllIIIIll[e.llllllIIIlII[2]] = "Bank booth";
        e.llllllIIIIll[e.llllllIIIlII[1]] = "Inside";
        e.llllllIIIIll[e.llllllIIIlII[3]] = "Inside";
        e.llllllIIIIll[e.llllllIIIlII[4]] = "Cast";
        e.llllllIIIIll[e.llllllIIIlII[5]] = "Please do not use this feature on a PvP world.";
        e.llllllIIIIll[e.llllllIIIlII[7]] = "Seers";
        e.llllllIIIIll[e.llllllIIIlII[8]] = "Seers";
        e.llllllIIIIll[e.llllllIIIlII[9]] = "Camelot";
    }

    private static boolean lIIlIIllllllIlI(int n) {
        return n == 0;
    }

    private static boolean lIIlIIllllllIII(int n) {
        return n != 0;
    }

    private static boolean lIIlIIlllllllII(int n, int n2) {
        return n < n2;
    }

    static {
        e.lIIlIIlllllIllI();
        e.lIIlIIlllllIlIl();
    }

    private static boolean lIIlIIllllllIIl(Object object) {
        return object != null;
    }

        return String.valueOf(var5);
    }
}

