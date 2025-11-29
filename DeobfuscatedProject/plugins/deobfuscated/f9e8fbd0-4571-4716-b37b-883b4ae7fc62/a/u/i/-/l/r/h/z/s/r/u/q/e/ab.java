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
        void llllllllllllllIllIIIllllIlllIIII;
        ab llllllllllllllIllIIIllllIlllIIIl;
        if (ab.llIIIllllIIIIIl(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        k llllllllllllllIllIIIllllIllIllll = llllllllllllllIllIIIllllIlllIIIl.C();
        if (ab.llIIIllllIIIIlI((Object)llllllllllllllIllIIIllllIllIllll)) {
            return;
        }
        if (ab.llIIIllllIIIIIl(llllllllllllllIllIIIllllIllIllll.x() ? 1 : 0)) {
            return;
        }
        Projectile llllllllllllllIllIIIllllIllIlllI = llllllllllllllIllIIIllllIlllIIII.getProjectile();
        if (ab.llIIIllllIIIlIl(llllllllllllllIllIIIllllIllIlllI.getId(), lIllIlIIIllIl[2])) {
            llllllllllllllIllIIIllllIlllIIIl.ax = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (2 == 0) {
                return;
            }
        } else if (ab.llIIIllllIIIlIl(llllllllllllllIllIIIllllIllIlllI.getId(), lIllIlIIIllIl[3])) {
            llllllllllllllIllIIIllllIlllIIIl.ax = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void llIIIlllIllllll() {
        lIllIlIIIllII = new String[lIllIlIIIllIl[4]];
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[0]] = ab."bow";
        ab.lIllIlIIIllII[ab.lIllIlIIIllIl[1]] = ab."blowpipe";
    }

    private static String llIIIlllIlllllI(String llllllllllllllIllIIIllllIlIllIlI, String llllllllllllllIllIIIllllIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIIIllIl[5]), "DES");
            Cipher llllllllllllllIllIIIllllIlIlllII = Cipher.getInstance("DES");
            llllllllllllllIllIIIllllIlIlllII.init(lIllIlIIIllIl[4], llllllllllllllIllIIIllllIlIlllIl);
            return new String(llllllllllllllIllIIIllllIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllllIlIllIll) {
            llllllllllllllIllIIIllllIlIllIll.printStackTrace();
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
        Iterator<Prayer> llllllllllllllIllIIIllllIllIIlII = list.iterator();
        while (ab.llIIIllllIIIlII(llllllllllllllIllIIIllllIllIIlII.hasNext() ? 1 : 0)) {
            void llllllllllllllIllIIIllllIllIIllI;
            Prayer llllllllllllllIllIIIllllIllIIIll = llllllllllllllIllIIIllllIllIIlII.next();
            if (ab.llIIIllllIIIllI(llllllllllllllIllIIIllllIllIIIll, Prayer.PROTECT_ITEM)) {
                0;
                if (2 >= -1) continue;
                return ((0x4E ^ 0x18 ^ (0x37 ^ 0x45)) & (44 + 73 - 107 + 133 ^ 8 + 60 - -3 + 100 ^ -1)) != 0;
            }
            if (!ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)llllllllllllllIllIIIllllIllIIIll) ? 1 : 0) || ab.llIIIllllIIIlII((int)llllllllllllllIllIIIllllIllIIllI)) {
                Widget llllllllllllllIllIIIllllIllIIIlI = Widgets.get((WidgetInfo)llllllllllllllIllIIIllllIllIIIll.getWidgetInfo());
                if (ab.llIIIllllIIIIlI(llllllllllllllIllIIIllllIllIIIlI)) {
                    0;
                    if (((0x3A ^ 0x69) & ~(0x33 ^ 0x60)) >= 0) continue;
                    return ((0xB5 ^ 0xBC) & ~(0xAB ^ 0xA2)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllIIIllllIllIIIlI);
                0;
                if (2 == 0) {
                    return ((0x15 ^ 3) & ~(0x8B ^ 0x9D)) != 0;
                }
            } else if (ab.llIIIllllIIIIIl(Prayers.isEnabled((Prayer)llllllllllllllIllIIIllllIllIIIll) ? 1 : 0)) {
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
        Prayer llllllllllllllIllIIIllllIlllIlll;
        ArrayList<Prayer> llllllllllllllIllIIIllllIlllIllI;
        Prayer prayer;
        Item llllllllllllllIllIIIllllIllllIII;
        Prayer llllllllllllllIllIIIllllIllllIIl;
        ab llllllllllllllIllIIIllllIllllIll;
        int n2 = this.C().x() ? 1 : 0;
        if (ab.llIIIllllIIIIIl(n2)) {
            this.ax = null;
            Prayer prayer2 = this.C().w().N();
            0;
            if (((0x95 ^ 0xC7 ^ (0x4B ^ 0x2F)) & (0x6D ^ 0x3C ^ (0xF7 ^ 0x90) ^ -1)) != 0) {
                return ((61 + 88 - 119 + 115 ^ 34 + 50 - -28 + 65) & (0x88 ^ 0x8D ^ (0xE6 ^ 0xC3) ^ -1)) != 0;
            }
        } else if (ab.llIIIllllIIIIlI(llllllllllllllIllIIIllllIllllIll.ax)) {
            llllllllllllllIllIIIllllIllllIIl = llllllllllllllIllIIIllllIllllIll.C().w().N();
            0;
            if (-2 >= 0) {
                return ((0x3B ^ 0x18) & ~(0x89 ^ 0xAA)) != 0;
            }
        } else {
            llllllllllllllIllIIIllllIllllIIl = llllllllllllllIllIIIllllIllllIll.ax;
        }
        if (!ab.llIIIllllIIIIll(llllllllllllllIllIIIllllIllllIII = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) || !ab.llIIIllllIIIIIl(llllllllllllllIllIIIllllIllllIII.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[0]]) ? 1 : 0) || ab.llIIIllllIIIlII(llllllllllllllIllIIIllllIllllIII.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[1]]) ? 1 : 0)) {
            prayer = llllllllllllllIllIIIllllIllllIll.aA.rangePrayer().r();
            0;
            if (((0xF1 ^ 0xC7) & ~(0x58 ^ 0x6E)) >= 1) {
                return ((0x2A ^ 0x6E) & ~(0x7E ^ 0x3A)) != 0;
            }
        } else {
            prayer = llllllllllllllIllIIIllllIllllIll.aA.magePrayer().r();
        }
        if (ab.llIIIllllIIIlII(llllllllllllllIllIIIllllIllllIll.a(llllllllllllllIllIIIllllIlllIllI = new ArrayList<Prayer>(List.of(llllllllllllllIllIIIllllIllllIIl, llllllllllllllIllIIIllllIlllIlll = prayer)), lIllIlIIIllIl[0]) ? 1 : 0)) {
            llllllllllllllIllIIIllllIllllIll.sleep(lIllIlIIIllIl[1]);
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

