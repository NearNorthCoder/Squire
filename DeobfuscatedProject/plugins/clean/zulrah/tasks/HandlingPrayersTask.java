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

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum24;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
extends ZulrahTaskBase {
    
    public static final  int aw;
    
    public static final  int av;
    private  Prayer ax;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ProjectileSpawned projectileSpawned) {
        void var1;
        ab var2;
        if (ab.llIIIllllIIIIIl(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        k var3 = var2.C();
        if (ab.llIIIllllIIIIlI((Object)var3)) {
            return;
        }
        if (ab.llIIIllllIIIIIl(var3.x() ? 1 : 0)) {
            return;
        }
        Projectile var4 = var1.getProjectile();
        if (ab.llIIIllllIIIlIl(var4.getId(), lIllIlIIIllIl[2])) {
            var2.ax = Prayer.PROTECT_FROM_MAGIC;

            if (2 == 0) {
                return;
            }
        } else if (ab.llIIIllllIIIlIl(var4.getId(), lIllIlIIIllIl[3])) {
            var2.ax = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void llIIIlllIllllll() {
        lIllIlIIIllII = new String[lIllIlIIIllIl[4]];
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[0]] = "bow";
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[1]] = "blowpipe";
    }

    private static boolean llIIIllllIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected HandlingPrayersTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIllIlIIIllIl[0];
        Iterator<Prayer> var5 = list.iterator();
        while (ab.llIIIllllIIIlII(var5.hasNext() ? 1 : 0)) {
            void var6;
            Prayer var7 = var5.next();
            if (ab.llIIIllllIIIllI(var7, Prayer.PROTECT_ITEM)) {

                if (2 >= -1) continue;
                return ((0x4E ^ 0x18 ^ (0x37 ^ 0x45)) & (44 + 73 - 107 + 133 ^ 8 + 60 - -3 + 100 ^ -1)) != 0;
            }
            if (!ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)var7) ? 1 : 0) || ab.llIIIllllIIIlII((int)var6)) {
                Widget var8 = Widgets.get((WidgetInfo)var7.getWidgetInfo());
                if (ab.llIIIllllIIIIlI(var8)) {

                    if (((0x3A ^ 0x69) & ~(0x33 ^ 0x60)) >= 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var8);

                if (2 == 0) {
                    return false;
                }
            } else if (ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
                int var9 = lIllIlIIIllIl[1];
            }

            if (((0x1E ^ 0x69 ^ (0x3C ^ 0x70)) & (2 ^ (0x57 ^ 0x6E) ^ -1)) == 0) continue;
            return ((0x27 ^ 0x2B ^ (0x9C ^ 0xB3)) & (110 + 7 - 114 + 139 ^ 119 + 102 - 122 + 74 ^ -1)) != 0;
        }
        return bl2;
    }

    static {
        ab.llIIIllllIIIIII();
        ab.llIIIlllIllllll();
        aw = lIllIlIIIllIl[3];
        av = lIllIlIIIllIl[2];
    }

    private static boolean llIIIllllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllllIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIllllIIIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var5_5;
        Prayer var10;
        ArrayList<Prayer> var11;
        Prayer prayer;
        Item var12;
        Prayer var13;
        ab var14;
        int n2 = this.C().x() ? 1 : 0;
        if (ab.llIIIllllIIIIIl(n2)) {
            this.ax = null;
            Prayer prayer2 = this.C().w().N();

            if (((0x95 ^ 0xC7 ^ (0x4B ^ 0x2F)) & (0x6D ^ 0x3C ^ (0xF7 ^ 0x90) ^ -1)) != 0) {
                return ((61 + 88 - 119 + 115 ^ 34 + 50 - -28 + 65) & (0x88 ^ 0x8D ^ (0xE6 ^ 0xC3) ^ -1)) != 0;
            }
        } else if (ab.llIIIllllIIIIlI(var14.ax)) {
            var13 = var14.C().w().N();

        } else {
            var13 = var14.ax;
        }
        if (!ab.llIIIllllIIIIll(var12 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) || !ab.llIIIllllIIIIIl(var12.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[0]]) ? 1 : 0) || ab.llIIIllllIIIlII(var12.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[1]]) ? 1 : 0)) {
            prayer = var14.aA.rangePrayer().r();

            if (((0xF1 ^ 0xC7) & ~(0x58 ^ 0x6E)) >= 1) {
                return false;
            }
        } else {
            prayer = var14.aA.magePrayer().r();
        }
        if (ab.llIIIllllIIIlII(var14.a(var11 = new ArrayList<Prayer>(List.of(var13, var10 = prayer)), lIllIlIIIllIl[0]) ? 1 : 0)) {
            var14.sleep(lIllIlIIIllIl[1]);
        }
        this.a((List<Prayer>)var5_5, lIllIlIIIllIl[1]);

        return lIllIlIIIllIl[1];
    }

    private static boolean llIIIllllIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIllllIIIIll(Object object) {
        return object != null;
    }
}

