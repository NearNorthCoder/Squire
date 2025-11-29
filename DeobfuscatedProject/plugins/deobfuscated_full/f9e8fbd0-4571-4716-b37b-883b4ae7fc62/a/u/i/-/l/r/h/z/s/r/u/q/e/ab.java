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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.k;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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

/* TASK: Handling prayers -> PrayerFlickingTask */
@TaskDesc(name="Handling prayers", priority=0x7FFFFFFF, register=true)
public class ab
extends ad {
    private static /* synthetic */ int[] lIllIlIIIllIl;
    public static final /* synthetic */ int aw;
    private static /* synthetic */ String[] lIllIlIIIllII;
    public static final /* synthetic */ int av;
    private /* synthetic */ Prayer ax;

    private static void llIIIllllIIIIII() {
        lIllIlIIIllIl = new int[6];
        ab.lIllIlIIIllIl[0] = (0x43 ^ 0x1E ^ (0x6D ^ 0xE)) & (0x80 ^ 0xAC ^ (0x15 ^ 7) ^ -1);
        ab.lIllIlIIIllIl[1] = 1;
        ab.lIllIlIIIllIl[2] = -(0xFFFFFE6F & 0x6BFC) & (0xFFFFFF7F & 0x6EFF);
        ab.lIllIlIIIllIl[3] = 0xFFFFEFBF & 0x1456;
        ab.lIllIlIIIllIl[4] = 2;
        ab.lIllIlIIIllIl[5] = 0x97 ^ 0x9F;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ProjectileSpawned projectileSpawned) {
        void var11;
        ab var8;
        if (ab.llIIIllllIIIIIl(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        k var13 = var8.C();
        if (ab.llIIIllllIIIIlI((Object)var13)) {
            return;
        }
        if (ab.llIIIllllIIIIIl(var13.x() ? 1 : 0)) {
            return;
        }
        Projectile var10 = var11.getProjectile();
        if (ab.llIIIllllIIIlIl(var10.getId(), lIllIlIIIllIl[2])) {
            var8.ax = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (2 == 0) {
                return;
            }
        } else if (ab.llIIIllllIIIlIl(var10.getId(), lIllIlIIIllIl[3])) {
            var8.ax = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void llIIIlllIllllll() {
        lIllIlIIIllII = new String[lIllIlIIIllIl[4]];
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[0]] = ab."bow";
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[1]] = ab."blowpipe";
    }

    private static String llIIIlllIlllllI(String var7, String var5) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIllIlIIIllIl[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIlIIIllIl[4], var15);
            return new String(var9.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllllIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected ab(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIllIlIIIllIl[0];
        Iterator<Prayer> var16 = list.iterator();
        while (ab.llIIIllllIIIlII(var16.hasNext() ? 1 : 0)) {
            void var4;
            Prayer var12 = var16.next();
            if (ab.llIIIllllIIIllI(var12, Prayer.PROTECT_ITEM)) {
                0;
                if (2 >= -1) continue;
                return ((0x4E ^ 0x18 ^ (0x37 ^ 0x45)) & (44 + 73 - 107 + 133 ^ 8 + 60 - -3 + 100 ^ -1)) != 0;
            }
            if (!ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)var12) ? 1 : 0) || ab.llIIIllllIIIlII((int)var4)) {
                Widget var3 = Widgets.get((WidgetInfo)var12.getWidgetInfo());
                if (ab.llIIIllllIIIIlI(var3)) {
                    0;
                    if (((0x3A ^ 0x69) & ~(0x33 ^ 0x60)) >= 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var3);
                0;
                if (2 == 0) {
                    return false;
                }
            } else if (ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)var12) ? 1 : 0)) {
                int llllllllllllllIllIIIllllIllIIlIl = lIllIlIIIllIl[1];
            }
            0;
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
        Prayer var17;
        ArrayList<Prayer> var14;
        Prayer prayer;
        Item var1;
        Prayer var2;
        ab var6;
        int n2 = this.C().x() ? 1 : 0;
        if (ab.llIIIllllIIIIIl(n2)) {
            this.ax = null;
            Prayer prayer2 = this.C().w().N();
            0;
            if (((0x95 ^ 0xC7 ^ (0x4B ^ 0x2F)) & (0x6D ^ 0x3C ^ (0xF7 ^ 0x90) ^ -1)) != 0) {
                return ((61 + 88 - 119 + 115 ^ 34 + 50 - -28 + 65) & (0x88 ^ 0x8D ^ (0xE6 ^ 0xC3) ^ -1)) != 0;
            }
        } else if (ab.llIIIllllIIIIlI(var6.ax)) {
            var2 = var6.C().w().N();
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            var2 = var6.ax;
        }
        if (!ab.llIIIllllIIIIll(var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) || !ab.llIIIllllIIIIIl(var1.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[0]]) ? 1 : 0) || ab.llIIIllllIIIlII(var1.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[1]]) ? 1 : 0)) {
            prayer = var6.aA.rangePrayer().r();
            0;
            if (((0xF1 ^ 0xC7) & ~(0x58 ^ 0x6E)) >= 1) {
                return false;
            }
        } else {
            prayer = var6.aA.magePrayer().r();
        }
        if (ab.llIIIllllIIIlII(var6.a(var14 = new ArrayList<Prayer>(List.of(var2, var17 = prayer)), lIllIlIIIllIl[0]) ? 1 : 0)) {
            var6.sleep(lIllIlIIIllIl[1]);
        }
        this.a((List<Prayer>)var5_5, lIllIlIIIllIl[1]);
        0;
        return lIllIlIIIllIl[1];
    }

    private static boolean llIIIllllIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIllllIIIIll(Object object) {
        return object != null;
    }
}

