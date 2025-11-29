/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Scouting for a raid", priority=20000, blocking=true)
public class ScoutingForARaidTask
extends CoxManager {
    private  int cs;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    protected ScoutingForARaidTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.cs = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        V var15;
        if (this.cs > 0) {
            this.cs -= 1;
            return 1;
        }
        if ((var15.ck( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIIlIIIlII[0]) ? 1 : 0)) {
            String[] stringArray = new String[1];
            stringArray[0] = var1[1];
            Dialog.chooseOption((String[])stringArray);
            0;
            var15.cs = 2;
            return 1;
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[4]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[5];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((0x98 ^ 0xA0) & ~(0x55 ^ 0x6D)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var16 == null {
            return 0;
        }
        var1_1.interact(var1[3]);
        this.cs = 3;
        return 1;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        if ((u.bf( == 0) ? 1 : 0)) {
            bl2 = 1;
            0;
            if (3 <= 1) {
                return ((0xE6 ^ 0x89 ^ (0x6F ^ 0x24)) & (28 + 2 - -85 + 14 ^ 107 + 91 - 109 + 76 ^ -1)) != 0;
            }
        } else {
            bl2 = 0;
        }
        return bl2;
    }
}

