/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prayer pot", priority=110)
public class PrayerPotTask
extends VorkathManager {

    @Inject
    protected PrayerPotTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if ((this.cf.getBoostedSkillLevel(Skill.PRAYER) > 0)) {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 3;
        if ((Projectiles.getNearest((int[] != nunArray))) {
            return 1;
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).toLowerCase().contains(var2[2]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[4]) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x2B ^ 8) & ~(0x77 ^ 0x54)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var3 == null {
            return 1;
        }
        var1_1.interact(var2[1]);
        this.cg.a(this.cf.getTickCount());
        return 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

}

