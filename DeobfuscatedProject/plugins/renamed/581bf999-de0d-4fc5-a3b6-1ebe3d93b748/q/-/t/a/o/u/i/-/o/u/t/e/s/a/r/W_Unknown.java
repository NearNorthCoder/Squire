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
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.Task;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.X_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.VEnum;

public abstract class W_Unknown
extends Task {
    private static /* synthetic */ int[] llIlIIIlIII;
    private static /* synthetic */ String[] llIlIIIIlll;
    protected final /* synthetic */ SquireAutoTOA cm;
    protected final /* synthetic */ TOAConfig cn;
    public static final /* synthetic */ int cl;

    private static boolean lIlIIlIIllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl2, Map<Prayer, Prayer> map) {
        boolean bl3 = llIlIIIlIII[0];
        Iterator<Prayer> var14 = list.iterator();
        while (W.lIlIIlIIllIlII(var14.hasNext() ? 1 : 0)) {
            void var35;
            void var4;
            Prayer var43 = var14.next();
            if (W.lIlIIlIIlllIlI(var43, Prayer.PROTECT_ITEM)) {
                0;
                if (1 > -1) continue;
                return false;
            }
            if (W.lIlIIlIIllIllI((int)var4) && W.lIlIIlIIllIlII(var35.containsKey(var43) ? 1 : 0)) {
                0;
                if (1 > 0) continue;
                return ((0x88 ^ 0xA8 ^ (0x70 ^ 0x41)) & (0x84 ^ 0xC1 ^ (0x6F ^ 0x3B) ^ -1)) != 0;
            }
            if (!W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)var43) ? 1 : 0) || W.lIlIIlIIllIlII((int)var4)) {
                W var31;
                var31.a(var43);
                0;
                if (2 <= 0) {
                    return ((0xB9 ^ 0x8B ^ (0xA3 ^ 0x88)) & (0x2E ^ 0x1C ^ (0x36 ^ 0x1D) ^ -1)) != 0;
                }
            } else if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)var43) ? 1 : 0)) {
                int llllllllllllllllIIllIllllllIIllI = llIlIIIlIII[1];
            }
            0;
            
            return ((0x59 ^ 0x1B ^ (0xDE ^ 0x9A)) & (56 + 95 - 49 + 39 ^ 82 + 26 - -15 + 16 ^ -1)) != 0;
        }
        return bl3;
    }

    public abstract v aT();

    private static boolean lIlIIlIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIlIllII(String var11, String var51) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var34 = var51.toCharArray();
        int var22 = llIlIIIlIII[0];
        char[] var27 = var11.toCharArray();
        int var19 = var27.length;
        int var18 = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(var18, var19)) {
            char var28 = var27[var18];
            var8.append((char)(var28 ^ var34[var22 % var34.length]));
            0;
            ++var22;
            ++var18;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    private boolean aP() {
        void var33;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n2 = nArray.length;
        int var16 = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(var16, (int)var33)) {
            W var36;
            void var38;
            void var2 = var38[var16];
            if (W.lIlIIlIIllIIIl((int)var2, var36.aO())) {
                return llIlIIIlIII[1];
            }
            ++var16;
            0;
            if (-(0x64 ^ 0x61) < 0) continue;
            return false;
        }
        return llIlIIIlIII[0];
    }

    private Prayer aR() {
        Prayer prayer;
        if (!W.lIlIIlIIllIlIl(Skills.getLevel((Skill)Skill.PRAYER), llIlIIIlIII[5]) || W.lIlIIlIIllIllI(Vars.getVarp((int)llIlIIIlIII[6]))) {
            return Prayer.ULTIMATE_STRENGTH;
        }
        if (W.lIlIIlIIllIlIl(Skills.getLevel((Skill)Skill.PRAYER), llIlIIIlIII[7])) {
            prayer = Prayer.PIETY;
            0;
            if ((0x1E ^ 0x74 ^ (0x31 ^ 0x5E)) <= 0) {
                return null;
            }
        } else {
            prayer = Prayer.CHIVALRY;
        }
        return prayer;
    }

    private static boolean lIlIIlIIllIIlI(Object object) {
        return object == null;
    }

    public abstract boolean aL();

    /*
     * WARNING - void declaration
     */
    public boolean a(List<Prayer> list, boolean bl2) {
        boolean bl3 = llIlIIIlIII[0];
        Iterator<Prayer> var48 = list.iterator();
        while (W.lIlIIlIIllIlII(var48.hasNext() ? 1 : 0)) {
            void var9;
            Prayer var29 = var48.next();
            if (!W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)var29) ? 1 : 0) || W.lIlIIlIIllIlII((int)var9)) {
                Widget var46 = Widgets.get((WidgetInfo)var29.getWidgetInfo());
                if (W.lIlIIlIIllIIlI(var46)) {
                    0;
                    if (1 > 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var46);
                0;
                if (-1 >= (0xAC ^ 0xA8)) {
                    return false;
                }
            } else if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)var29) ? 1 : 0)) {
                int llllllllllllllllIIllIlllllIlIlll = llIlIIIlIII[1];
            }
            0;
            if (3 <= (0x51 ^ 0x55)) continue;
            return false;
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray, int n2) {
        void var44;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var50 = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(var50, (int)var44)) {
            void var24;
            void var5;
            void var32 = var5[var50];
            if (W.lIlIIlIIllIIIl((int)var32, (int)var24)) {
                return llIlIIIlIII[1];
            }
            ++var50;
            0;
            if (((0xE ^ 0x41) & ~(0xCA ^ 0x85)) == 0) continue;
            return false;
        }
        return llIlIIIlIII[0];
    }

    private static boolean lIlIIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIlIllIl(String var10, String var26) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var39 = Cipher.getInstance("Blowfish");
            var39.init(llIlIIIlIII[4], var13);
            return new String(var39.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIlIlllI() {
        llIlIIIIlll = new String[llIlIIIlIII[2]];
        W.llIlIIIIlll[W.llIlIIIlIII[0]] = W."Rapid";
        W.llIlIIIIlll[W.llIlIIIlIII[1]] = W."Accurate";
        W.llIlIIIIlll[W.llIlIIIlIII[4]] = W."Longrange";
    }

    private static boolean lIlIIlIIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(List<Prayer> list) {
        void var37;
        W var21;
        void var40;
        void var23;
        HashMap<Prayer, Prayer> hashMap = new HashMap<Prayer, Prayer>();
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int var49 = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(var49, (int)var23)) {
            void var17;
            void var7 = var17[var49];
            if (W.lIlIIlIIllIllI(var40.contains(var7) ? 1 : 0) && W.lIlIIlIIllIlII(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
                var21.a((Prayer)var7);
                switch (X.cp[var7.ordinal()]) {
                    case 1: {
                        var37.put(Prayer.PROTECT_FROM_MAGIC, var7);
                        0;
                        var37.put(Prayer.PROTECT_FROM_MISSILES, var7);
                        0;
                        0;
                        if (1 == 1) break;
                        return false;
                    }
                    case 2: {
                        var37.put(Prayer.PROTECT_FROM_MELEE, var7);
                        0;
                        var37.put(Prayer.PROTECT_FROM_MAGIC, var7);
                        0;
                        0;
                        if ((0x16 ^ 0x12 ^ (0xFE ^ 0xB3) & ~(0x2D ^ 0x60)) > 2) break;
                        return ((29 + 37 - -82 + 39 ^ 96 + 108 - 72 + 4) & (0xA ^ 0x7B ^ (0xDF ^ 0x9D) ^ -1)) != 0;
                    }
                    case 3: {
                        var37.put(Prayer.PROTECT_FROM_MELEE, var7);
                        0;
                        var37.put(Prayer.PROTECT_FROM_MISSILES, var7);
                        0;
                        0;
                        if (-2 < 0) break;
                        return ((47 + 165 - -5 + 10 ^ 173 + 122 - 181 + 77) & (0xDF ^ 0xC4 ^ (0xE9 ^ 0xAE) ^ -1)) != 0;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        var37.put(Prayer.RIGOUR, var7);
                        0;
                        var37.put(Prayer.EAGLE_EYE, var7);
                        0;
                        var37.put(Prayer.AUGURY, var7);
                        0;
                        0;
                        if (3 >= 3) break;
                        return false;
                    }
                    case 7: {
                        var37.put(Prayer.PIETY, var7);
                        0;
                        var37.put(Prayer.AUGURY, var7);
                        0;
                        0;
                        if (-1 <= 0) break;
                        return ((167 + 29 - 165 + 167 ^ 144 + 73 - 158 + 133) & (0xB5 ^ 0xAC ^ (0x77 ^ 0x68) ^ -1)) != 0;
                    }
                    case 8: {
                        var37.put(Prayer.PIETY, var7);
                        0;
                        var37.put(Prayer.RIGOUR, var7);
                        0;
                    }
                }
            }
            ++var49;
            0;
            if (2 != 0) continue;
            return false;
        }
        if (W.lIlIIlIIllIlII(var21.a((List<Prayer>)var40, llIlIIIlIII[0], (Map<Prayer, Prayer>)var37) ? 1 : 0)) {
            var21.sleep(llIlIIIlIII[1]);
        }
        this.a(list, llIlIIIlIII[1], hashMap);
        0;
        return llIlIIIlIII[1];
    }

    private static boolean lIlIIlIIllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public Prayer aQ() {
        String[] var1;
        W var20;
        Widget var12;
        void var42;
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (W.lIlIIlIIllIIlI(itemContainer)) {
            return this.cn.meleePrayer().ag();
        }
        Item var47 = var42.getItem(llIlIIIlIII[2]);
        if (W.lIlIIlIIllIIll(var47)) {
            var12 = WeaponMap.StyleMap.getOrDefault(var47.getId(), WeaponStyle.MELEE);
            switch (X.co[var12.ordinal()]) {
                case 1: {
                    return var20.cn.meleePrayer().ag();
                }
                case 2: {
                    return var20.cn.rangePrayer().ag();
                }
                case 3: {
                    return var20.cn.magePrayer().ag();
                }
            }
        }
        if (W.lIlIIlIIllIIll(var12 = Widgets.get((WidgetInfo)Combat.getAttackStyle().getWidgetInfo())) && W.lIlIIlIIllIIll(var1 = var12.getActions()) && W.lIlIIlIIllIIIl(var1.length, llIlIIIlIII[1])) {
            String var45 = var1[llIlIIIlIII[0]];
            int var15 = llIlIIIlIII[3];
            switch (var45.hashCode()) {
                case 78729436: {
                    if (!W.lIlIIlIIllIlII(var45.equals(llIlIIIIlll[llIlIIIlIII[0]]) ? 1 : 0)) break;
                    var15 = llIlIIIlIII[0];
                    0;
                    if ((0x3D ^ 0x41 ^ (0xD3 ^ 0xAB)) >= 0) break;
                    return null;
                }
                case -2067063020: {
                    if (!W.lIlIIlIIllIlII(var45.equals(llIlIIIIlll[llIlIIIlIII[1]]) ? 1 : 0)) break;
                    var15 = llIlIIIlIII[1];
                    0;
                    if ((0x77 ^ 0x73) != ((0x28 ^ 4) & ~(0x24 ^ 8))) break;
                    return null;
                }
                case -2145894367: {
                    if (!W.lIlIIlIIllIlII(var45.equals(llIlIIIIlll[llIlIIIlIII[4]]) ? 1 : 0)) break;
                    var15 = llIlIIIlIII[4];
                }
            }
            switch (var15) {
                case 0: {
                    return var20.cn.rangePrayer().ag();
                }
                case 1: 
                case 2: {
                    return var20.cn.magePrayer().ag();
                }
            }
        }
        return this.cn.meleePrayer().ag();
    }

    private static boolean lIlIIlIIllIlll(Object object, Object object2) {
        return object != object2;
    }

    public abstract boolean aS();

    private static void aM() {
        Prayers.disableAll();
    }

    private void a(Prayer prayer) {
        Widget widget = Widgets.get((WidgetInfo)prayer.getWidgetInfo());
        if (W.lIlIIlIIllIIlI(widget)) {
            return;
        }
        WidgetPackets.widgetFirstOption((Widget)widget);
    }

    private static boolean lIlIIlIIllIIll(Object object) {
        return object != null;
    }

    public boolean run() {
        W var30;
        if (!W.lIlIIlIIllIlII(this.aP() ? 1 : 0) || !W.lIlIIlIIllIlll((Object)this.aT(), (Object)v.NONE) || W.lIlIIlIIllIllI(this.aS() ? 1 : 0)) {
            return llIlIIIlIII[0];
        }
        if (!W.lIlIIlIIlllIII(Players.getLocal().getPoseAnimation(), llIlIIIlIII[8]) || W.lIlIIlIIllIllI(Prayers.getPoints())) {
            W.aM();
            return llIlIIIlIII[0];
        }
        List<Prayer> var25 = var30.aN();
        if (W.lIlIIlIIllIllI(var30.aL() ? 1 : 0)) {
            W.aM();
            return llIlIIIlIII[0];
        }
        if (W.lIlIIlIIlllIIl(Combat.getCurrentHealth(), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            var25 = new ArrayList<Prayer>(var25);
            var25.add(Prayer.RAPID_HEAL);
            0;
        }
        if (W.lIlIIlIIlllIlI((Object)var30.aT(), (Object)v.FLICK)) {
            Prayers.flick(var25);
            0;
            0;
            if (((0x48 ^ 0x79) & ~(0x8D ^ 0xBC)) == -1) {
                return false;
            }
        } else {
            Iterator<Prayer> var6 = var25.iterator();
            while (W.lIlIIlIIllIlII(var6.hasNext() ? 1 : 0)) {
                Prayer var41 = var6.next();
                if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)var41) ? 1 : 0)) {
                    Prayers.toggle((Prayer)var41);
                }
                0;
                if (-1 < 0) continue;
                return false;
            }
        }
        return llIlIIIlIII[1];
    }

    public abstract List<Prayer> aN();

    private static boolean lIlIIlIIlllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIlIIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public abstract int aO();

    private static void lIlIIlIIlIllll() {
        llIlIIIlIII = new int[9];
        W.llIlIIIlIII[0] = (0x31 ^ 0x22) & ~(0x56 ^ 0x45);
        W.llIlIIIlIII[1] = 1;
        W.llIlIIIlIII[2] = 3;
        W.llIlIIIlIII[3] = -1;
        W.llIlIIIlIII[4] = 2;
        W.llIlIIIlIII[5] = 0xDA ^ 0xAC ^ (0xD ^ 0x47);
        W.llIlIIIlIII[6] = -(0xFFFFF7E7 & 0x5839) & (0xFFFFFFF7 & 0x5F6D);
        W.llIlIIIlIII[7] = 3 ^ (0xD6 ^ 0x93);
        W.llIlIIIlIII[8] = -(0xFFFFB7D9 & 0x6A6F) & (0xFFFFB7FF & 0x7FEA);
    }

    static {
        W.lIlIIlIIlIllll();
        W.lIlIIlIIlIlllI();
        cl = llIlIIIlIII[8];
    }

    public W(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        this.cm = squireAutoTOA;
        this.cn = tOAConfig;
    }
}

