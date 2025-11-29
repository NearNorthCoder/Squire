/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum6;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Handling prayers", priority=0x7FFFFFFF, register=true)
public class HandlingPrayersTask
extends ad {
    
    public static final  int aw;
    
    public static final  int av;
    private  Prayer ax;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ProjectileSpawned projectileSpawned) {
        void var3;
        ab var4;
        if ((this.aB.isInInstancedRegion( == 0) ? 1 : 0)) {
            return;
        }
        k var5 = var4.C();
        if ((Object == nullllllllllllllllIllIIIllllIllIllll)) {
            return;
        }
        if ((var5.x( == 0) ? 1 : 0)) {
            return;
        }
        Projectile var6 = var3.getProjectile();
        if ((var6.getId() == 2)) {
            var4.ax = Prayer.PROTECT_FROM_MAGIC;
            0;
            
        } else if ((var6.getId() == 3)) {
            var4.ax = Prayer.PROTECT_FROM_MISSILES;
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    protected HandlingPrayersTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = 0;
        Iterator<Prayer> var13 = list.iterator();
        while ((var13.hasNext( != 0) ? 1 : 0)) {
            void var14;
            Prayer var15 = var13.next();
            if (var15 == llllllllllllllIllIIIllllIllIIIll2) {
                0;
                
                return ((0x4E ^ 0x18 ^ (0x37 ^ 0x45)) & (44 + 73 - 107 + 133 ^ 8 + 60 - -3 + 100 ^ -1)) != 0;
            }
            if (!(Prayers.isEnabled((Prayer == 0)var15) ? 1 : 0) || (intllllllllllllllIllIIIllllIllIIllI)) {
                Widget var16 = Widgets.get((WidgetInfo)var15.getWidgetInfo());
                if var16 == null {
                    0;
                    
                    return ((0xB5 ^ 0xBC) & ~(0xAB ^ 0xA2)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var16);
                0;
                
            } else if ((Prayers.isEnabled((Prayer == 0)var15) ? 1 : 0)) {
                int var17 = 1;
            }
            0;
            if (((0x1E ^ 0x69 ^ (0x3C ^ 0x70)) & (2 ^ (0x57 ^ 0x6E) ^ -1)) == 0) continue;
            return ((0x27 ^ 0x2B ^ (0x9C ^ 0xB3)) & (110 + 7 - 114 + 139 ^ 119 + 102 - 122 + 74 ^ -1)) != 0;
        }
        return bl2;
    }

    static {
        ab.var18();
        ab.var19();
        aw = 3;
        av = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var5_5;
        Prayer var20;
        ArrayList<Prayer> var21;
        Prayer prayer;
        Item var22;
        Prayer var23;
        ab var24;
        int n2 = this.C().x() ? 1 : 0;
        if (n2 == 0) {
            this.ax = null;
            Prayer prayer2 = this.C().w().N();
            0;
            if (((0x95 ^ 0xC7 ^ (0x4B ^ 0x2F)) & (0x6D ^ 0x3C ^ (0xF7 ^ 0x90) ^ -1)) != 0) {
                return ((61 + 88 - 119 + 115 ^ 34 + 50 - -28 + 65) & (0x88 ^ 0x8D ^ (0xE6 ^ 0xC3) ^ -1)) != 0;
            }
        } else if (var24.ax == null) {
            var23 = var24.C().w().N();
            0;
            if (-2 >= 0) {
                return ((0x3B ^ 0x18) & ~(0x89 ^ 0xAA)) != 0;
            }
        } else {
            var23 = var24.ax;
        }
        if (!(var22 = Equipment.fromSlot(EquipmentInventorySlot != nullEquipmentInventorySlot.WEAPON)) || !(var22.getName( == 0).toLowerCase().contains(var2[0]) ? 1 : 0) || (var22.getName( != 0).toLowerCase().contains(var2[1]) ? 1 : 0)) {
            prayer = var24.aA.rangePrayer().r();
            0;
            if (((0xF1 ^ 0xC7) & ~(0x58 ^ 0x6E)) >= 1) {
                return ((0x2A ^ 0x6E) & ~(0x7E ^ 0x3A)) != 0;
            }
        } else {
            prayer = var24.aA.magePrayer().r();
        }
        if ((var24.a(var21 = new ArrayList<Prayer>(List.of(var23, var20 = prayer != 0)), 0) ? 1 : 0)) {
            var24.sleep(1);
        }
        this.a((List<Prayer>)var5_5, 1);
        0;
        return 1;
    }

}

