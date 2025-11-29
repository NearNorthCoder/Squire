/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Setting up raid", priority=20000, blocking=true)
public class SettingUpRaidTask
extends CoxManager {

    @Override
    public List<Prayer> ci() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        if ((u.bf( == 0) ? 1 : 0)) {
            bl2 = 1;
            0;
            if (2 < 2) {
                return ((0x5C ^ 0x56) & ~(0x1E ^ 0x14)) != 0;
            }
        } else {
            bl2 = 0;
        }
        return bl2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        W var25;
        if ((this.ck( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var25.co.G( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIIlIllIlI[0]) ? 1 : 0)) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[1];
            Dialog.chooseOption((String[])stringArray);
            0;
            System.out.println("[StartRaid] Starting raid, layout: " + String.valueOf(aa.e()));
            return 1;
        }
        Widget var26 = Widgets.get((int)2, (int)3);
        if var26 == null {
            System.out.println(var2[4]);
            return 0;
        }
        this.co.b(s.ba());
        this.co.a(s.bc());
        this.co.c(s.bb());
        this.co.d(s.b(s.aZ()));
        var1_1.interact(var2[5]);
        this.sleep(this.cr.nextInt(4) + 1);
        return 1;
    }

    @Inject
    protected SettingUpRaidTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

}

