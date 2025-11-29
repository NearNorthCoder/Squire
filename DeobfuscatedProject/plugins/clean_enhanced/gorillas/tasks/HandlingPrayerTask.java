/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.gorillas.tasks.CHelper;
import gg.squire.gorillas.tasks.GameEnum3;
import gg.squire.gorillas.tasks.THelper;

@TaskDesc(name="Handling Prayer", priority=100)
public class HandlingPrayerTask
extends Task {
    private final  SquireGorillaConfig ae;
    private  Prayer af;
    private final  SquireGorillaPlugin ad;

    private static  boolean b(Player player, NPC nPC) {
        boolean bl;
        if ((nPC.getInteracting() == nPC.getInteracting()2)) {
            bl = 0;
            0;
            if (-3 > 0) {
                return ((71 + 108 - 44 + 8 ^ 6 + 57 - -44 + 61) & (0xE ^ 0x3E ^ (0x95 ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    @Inject
    public HandlingPrayerTask(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.af = Prayer.PROTECT_FROM_MAGIC;
        this.ad = squireGorillaPlugin;
        this.ae = squireGorillaConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        NPC var3;
        NPC nPC2;
        void var4;
        Player player = Players.getLocal();
        NPC nPC3 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[1]) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2)) {
                n2 = 0;
                0;
                if (1 >= (6 ^ 2)) {
                    return ((0x7D ^ 0x34) & ~(0x27 ^ 0x6E)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if nPC3 != null {
            Prayers.flick(List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.STEEL_SKIN));
            0;
            return 0;
        }
        ArrayList var5 = new ArrayList();
        if ((var4.getInteracting( == null))) {
            nPC2 = NPCs.getNearest(arg_0 -> s.b((Player)var4, arg_0));
            0;
            if null != null {
                return ((0x20 ^ 0x31) & ~(0xD1 ^ 0xC0)) != 0;
            }
        } else {
            nPC2 = (NPC)var4.getInteracting();
        }
        if (var3 = nPC2 != null) {
            s var6;
            c var7 = var6.ad.a(var3);
            if var7 != null {
                ArrayList<d> var8 = new ArrayList<d>(var7.n());
                var8.remove((Object)d.BOULDER);
                0;
                if ((var8.size() == 0)) {
                    switch (t.ag[((d)((Object)var8.get(1))).ordinal()]) {
                        case 1: {
                            var6.af = Prayer.PROTECT_FROM_MELEE;
                            0;
                            if (3 >= 1) break;
                            return ((0x62 ^ 0x7E ^ (0x15 ^ 0x11)) & (135 + 57 - 149 + 121 ^ 178 + 92 - 92 + 10 ^ -1)) != 0;
                        }
                        case 2: {
                            var6.af = Prayer.PROTECT_FROM_MAGIC;
                            0;
                            if null == null break;
                            return ((0x24 ^ 0x13) & ~(0x86 ^ 0xB1)) != 0;
                        }
                        case 3: {
                            var6.af = Prayer.PROTECT_FROM_MISSILES;
                        }
                    }
                    0;
                    if (2 <= 0) {
                        return ((0x81 ^ 0xBE ^ (0xC ^ 0x7C)) & (0x41 ^ 0x5F ^ (0x5D ^ 0xC) ^ -1)) != 0;
                    }
                } else {
                    var6.af = Prayer.PROTECT_FROM_MAGIC;
                }
                0;
                
            } else {
                if ((Prayers.anyActive( != 0) ? 1 : 0)) {
                    Prayers.disableAll();
                }
                return 0;
            }
            0;
            if (-(0x4F ^ 0x28 ^ (0xA1 ^ 0xC2)) > 0) {
                return ((53 + 89 - 103 + 104 ^ 122 + 40 - 157 + 149) & (3 ^ (0x1E ^ 8) ^ -1)) != 0;
            }
        } else {
            if ((Prayers.anyActive( != 0) ? 1 : 0)) {
                Prayers.disableAll();
            }
            return 0;
        }
        var3_3.add(this.O());
        0;
        var3_3.add(this.af);
        0;
        Prayers.flick((List)var3_3);
        0;
        return 0;
    }

    private Prayer O() {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)this.ae.ranged().selected(EquipmentSetup.class);
        if equipmentSetup != null {
            nArray = equipmentSetup.getIds();
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            nArray = new int[1];
        }
        int[] var9 = nArray;
        Item var10 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if ((IntStream.oflllllllllllllllIlIIlllIlllIlllIl.anyMatch(n2 -> {
            boolean bl;
            if ((n2 == var10.getId())) {
                bl = 0;
                0;
                if (-3 >= 0) {
                    return ((0x36 ^ 0x6B) & ~(0x33 ^ 0x6E)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }) ? 1 : 0)) {
            s var11;
            return var11.ae.rangePrayer().C();
        }
        return this.ae.meleePrayer().C();
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

}

