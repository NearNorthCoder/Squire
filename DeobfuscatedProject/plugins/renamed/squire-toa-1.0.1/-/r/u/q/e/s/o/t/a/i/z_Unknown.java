/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.A_Unknown;
import -.r.u.q.e.s.o.t.a.i.NEnum;
import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.client.plugins.fw.Task;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public abstract class z_Unknown
extends Task {
    private static /* synthetic */ int[] lIIllllIlIIll;
    private static /* synthetic */ String[] lIIllllIlIIlI;
    protected final /* synthetic */ TOAConfig aT;
    protected final /* synthetic */ SquireTOA aS;
    public static final /* synthetic */ int aR;

    public boolean run() {
        z var4;
        if (!z.lIllIlIIlIllIll(this.G() ? 1 : 0) || !z.lIllIlIIlIlllll((Object)this.J(), (Object)n.NONE) || z.lIllIlIIllIIIII(this.I() ? 1 : 0)) {
            return lIIllllIlIIll[0];
        }
        if (!z.lIllIlIIllIIIIl(Players.getLocal().getPoseAnimation(), lIIllllIlIIll[5]) || z.lIllIlIIllIIIII(Prayers.getPoints())) {
            z.D();
            return lIIllllIlIIll[0];
        }
        List<Prayer> var18 = var4.E();
        if (z.lIllIlIIllIIIII(var4.C() ? 1 : 0)) {
            z.D();
            return lIIllllIlIIll[0];
        }
        Object var33 = Prayer.values();
        int llllllllllllllIlllIlIIIllIlIlIIl2 = ((Prayer[])var33).length;
        int var35 = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(var35, llllllllllllllIlllIlIIIllIlIlIIl2)) {
            Prayer var7 = var33[var35];
            if (z.lIllIlIIllIIIII(var18.contains(var7) ? 1 : 0) && z.lIllIlIIlIllIll(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
                Widget var32 = Widgets.get((WidgetInfo)var7.getWidgetInfo());
                if (z.lIllIlIIlIlllII(var32)) {
                    0;
                    if (2 > (0x36 ^ 0x2A ^ (0xBF ^ 0xA7))) {
                        return ((0x6D ^ 0 ^ (0xA5 ^ 0x9C)) & (0x2E ^ 0x18 ^ (0x32 ^ 0x50) ^ -1)) != 0;
                    }
                } else {
                    WidgetPackets.widgetFirstOption((Widget)var32);
                }
            }
            ++var35;
            0;
            if ((91 + 169 - 161 + 72 ^ 153 + 112 - 264 + 174) >= 2) continue;
            return ((0x1C ^ 0x4F ^ 38 + 57 - 33 + 65) & (0x49 ^ 0x1E ^ (0xCB ^ 0xB0) ^ -1)) != 0;
        }
        if (z.lIllIlIIllIIIlI((Object)var4.J(), (Object)n.FLICK)) {
            if (z.lIllIlIIlIllIll(var4.a(var18, lIIllllIlIIll[0]) ? 1 : 0)) {
                var4.sleep(lIIllllIlIIll[1]);
            }
            var4.a(var18, lIIllllIlIIll[1]);
            0;
            0;
            if (2 < -1) {
                return ((3 ^ (0x71 ^ 0x2C)) & (27 + 158 - 29 + 56 ^ 80 + 55 - 42 + 45 ^ -1)) != 0;
            }
        } else {
            var33 = var18.iterator();
            while (z.lIllIlIIlIllIll(var33.hasNext() ? 1 : 0)) {
                Prayer llllllllllllllIlllIlIIIllIlIlIIl2 = (Prayer)var33.next();
                if (z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIllIlIlIIl2) ? 1 : 0)) {
                    Prayers.toggle((Prayer)llllllllllllllIlllIlIIIllIlIlIIl2);
                }
                0;
                if (-3 <= 0) continue;
                return false;
            }
        }
        return lIIllllIlIIll[1];
    }

    public z(SquireTOA squireTOA, TOAConfig tOAConfig) {
        this.aS = squireTOA;
        this.aT = tOAConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIllllIlIIll[0];
        Iterator<Prayer> var5 = list.iterator();
        while (z.lIllIlIIlIllIll(var5.hasNext() ? 1 : 0)) {
            void var26;
            Prayer var29 = var5.next();
            if (!z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)var29) ? 1 : 0) || z.lIllIlIIlIllIll((int)var26)) {
                Widget var22 = Widgets.get((WidgetInfo)var29.getWidgetInfo());
                if (z.lIllIlIIlIlllII(var22)) {
                    0;
                    if (1 != ((2 + 171 - 22 + 47 ^ 80 + 18 - -24 + 21) & (73 + 80 - 41 + 28 ^ 26 + 70 - 91 + 192 ^ -1))) continue;
                    return ((0xC4 ^ 0xB4 ^ (5 ^ 0x38)) & (0xAA ^ 0xBB ^ (0x58 ^ 4) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var22);
                0;
                if (1 <= 0) {
                    return false;
                }
            } else if (z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)var29) ? 1 : 0)) {
                int llllllllllllllIlllIlIIIllIIlllIl = lIIllllIlIIll[1];
            }
            0;
            if (((0x6B ^ 0x42) & ~(0x5F ^ 0x76)) == 0) continue;
            return false;
        }
        return bl2;
    }

    private static void lIllIlIIlIllIII() {
        lIIllllIlIIlI = new String[lIIllllIlIIll[2]];
        z.lIIllllIlIIlI[z.lIIllllIlIIll[0]] = z."Rapid";
        z.lIIllllIlIIlI[z.lIIllllIlIIll[1]] = z."Accurate";
        z.lIIllllIlIIlI[z.lIIllllIlIIll[4]] = z."Longrange";
    }

    public abstract boolean C();

    public abstract int F();

    private static boolean lIllIlIIlIlllII(Object object) {
        return object == null;
    }

    private static boolean lIllIlIIllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIIllIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    public abstract List<Prayer> E();

    public abstract n J();

    private static boolean lIllIlIIlIllllI(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlIlllll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean G() {
        void var11;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n2 = nArray.length;
        int var2 = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(var2, (int)var11)) {
            z var40;
            void var19;
            void var41 = var19[var2];
            if (z.lIllIlIIlIlllIl((int)var41, var40.F())) {
                return lIIllllIlIIll[1];
            }
            ++var2;
            0;
            
            return (3 & ~3) != 0;
        }
        return lIIllllIlIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    public Prayer H() {
        String[] var28;
        z var39;
        Widget var30;
        void var20;
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (z.lIllIlIIlIlllII(itemContainer)) {
            return this.aT.meleePrayer().z();
        }
        Item var21 = var20.getItem(lIIllllIlIIll[2]);
        if (z.lIllIlIIlIllllI(var21)) {
            var30 = WeaponMap.StyleMap.getOrDefault(var21.getId(), WeaponStyle.MELEE);
            switch (A.aU[var30.ordinal()]) {
                case 1: {
                    return var39.aT.meleePrayer().z();
                }
                case 2: {
                    return var39.aT.rangePrayer().z();
                }
                case 3: {
                    return var39.aT.magePrayer().z();
                }
            }
        }
        if (z.lIllIlIIlIllllI(var30 = Widgets.get((WidgetInfo)Combat.getAttackStyle().getWidgetInfo())) && z.lIllIlIIlIllllI(var28 = var30.getActions()) && z.lIllIlIIlIlllIl(var28.length, lIIllllIlIIll[1])) {
            String var27 = var28[lIIllllIlIIll[0]];
            int var34 = lIIllllIlIIll[3];
            switch (var27.hashCode()) {
                case 78729436: {
                    if (!z.lIllIlIIlIllIll(var27.equals(lIIllllIlIIlI[lIIllllIlIIll[0]]) ? 1 : 0)) break;
                    var34 = lIIllllIlIIll[0];
                    0;
                    if (null == null) break;
                    return null;
                }
                case -2067063020: {
                    if (!z.lIllIlIIlIllIll(var27.equals(lIIllllIlIIlI[lIIllllIlIIll[1]]) ? 1 : 0)) break;
                    var34 = lIIllllIlIIll[1];
                    0;
                    if ((0x3F ^ 0x3B) >= 2) break;
                    return null;
                }
                case -2145894367: {
                    if (!z.lIllIlIIlIllIll(var27.equals(lIIllllIlIIlI[lIIllllIlIIll[4]]) ? 1 : 0)) break;
                    var34 = lIIllllIlIIll[4];
                }
            }
            switch (var34) {
                case 0: {
                    return var39.aT.rangePrayer().z();
                }
                case 1: 
                case 2: {
                    return var39.aT.magePrayer().z();
                }
            }
        }
        return this.aT.meleePrayer().z();
    }

    private static boolean lIllIlIIlIllIll(int n2) {
        return n2 != 0;
    }

    static {
        z.lIllIlIIlIllIIl();
        z.lIllIlIIlIllIII();
        aR = lIIllllIlIIll[5];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray, int n2) {
        void var13;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var23 = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(var23, (int)var13)) {
            void var6;
            void var25;
            void var31 = var25[var23];
            if (z.lIllIlIIlIlllIl((int)var31, (int)var6)) {
                return lIIllllIlIIll[1];
            }
            ++var23;
            0;
            if (1 > ((12 + 111 - 42 + 79 ^ 151 + 142 - 215 + 81) & (0x5A ^ 0x69 ^ (0x29 ^ 0x25) ^ -1))) continue;
            return false;
        }
        return lIIllllIlIIll[0];
    }

    private static String lIllIlIIlIlIlll(String var1, String var14) {
        try {
            SecretKeySpec var42 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIIllllIlIIll[4], var42);
            return new String(var24.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    public abstract boolean I();

    private static boolean lIllIlIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIllIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIllIlIIlIlIllI(String var37, String var17) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIll[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIllllIlIIll[4], var8);
            return new String(var16.doFinal(Base64.getDecoder().decode(var37.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void D() {
        void var12;
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int var3 = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(var3, (int)var12)) {
            void var9;
            void var15 = var9[var3];
            if (z.lIllIlIIlIllIll(Prayers.isEnabled((Prayer)var15) ? 1 : 0)) {
                Widget var36 = Widgets.get((WidgetInfo)var15.getWidgetInfo());
                if (z.lIllIlIIlIlllII(var36)) {
                    0;
                    if (((4 + 119 - 61 + 114 ^ 79 + 100 - 61 + 18) & (22 + 79 - -11 + 31 ^ 93 + 33 - 123 + 180 ^ -1)) < 0) {
                        return;
                    }
                } else {
                    WidgetPackets.widgetFirstOption((Widget)var36);
                }
            }
            ++var3;
            0;
            if ((0x3B ^ 0x3E) != 0) continue;
            return;
        }
    }

    private static void lIllIlIIlIllIIl() {
        lIIllllIlIIll = new int[7];
        z.lIIllllIlIIll[0] = (0xC3 ^ 0x95) & ~(0x62 ^ 0x34);
        z.lIIllllIlIIll[1] = 1;
        z.lIIllllIlIIll[2] = 3;
        z.lIIllllIlIIll[3] = -1;
        z.lIIllllIlIIll[4] = 2;
        z.lIIllllIlIIll[5] = 0xFFFF95AB & 0x7FF6;
        z.lIIllllIlIIll[6] = 0xA3 ^ 0xAB;
    }
}

