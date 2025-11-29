/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@TaskDesc(name="Setting up Auto Rooms", priority=50000, blocking=true)
public class SettingUpAutoRoomsTask
extends CoxManager {

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        T var3;
        if ((this.bS.getPlane( == 0))) {
            return 0;
        }
        n var4 = null;
        int var5 = 0;
        int var6 = 0;
        while ((var6 < var3.co.D().size())) {
            n var7 = var3.co.D().get(var6);
            if (var7 != null && (var7.a(LocatablelllllllllllllllIllIlIlllIlIIIlll.bS) ? 1 : 0)) {
                var5 = var6;
                System.out.println(var2[0]);
                var4 = var3.co.D().get(var6);
                System.out.println("Found room: " + String.valueOf((Object)var4.bw));
                0;
                if ((0xA4 ^ 0xA0) == (0x90 ^ 0x94)) break;
                return ((0x35 ^ 0x78) & ~(0x4E ^ 3)) != 0;
            }
            ++var6;
            0;
            if null == null continue;
            return ((0x1A ^ 0x14) & ~(0x29 ^ 0x27)) != 0;
        }
        if var4 == null {
            return 1;
        }
        var3.co.a(var4);
        if (((Object)var4.bw != (Object)var4.bw2)N.END) && (var5 + 1 < var3.co.D().size())) {
            var3.co.b(var3.co.D().get(var5 + 1));
        }
        this.co.h((int)var2_2);
        return 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    @Override
    public boolean ch() {
        return 1;
    }

    @Inject
    protected SettingUpAutoRoomsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }
}

