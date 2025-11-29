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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.X;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

public abstract class W
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
        Iterator<Prayer> llllllllllllllllIIllIllllllIIlIl = list.iterator();
        while (W.lIlIIlIIllIlII(llllllllllllllllIIllIllllllIIlIl.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIllIllllllIIlll;
            void llllllllllllllllIIllIllllllIlIII;
            Prayer llllllllllllllllIIllIllllllIIlII = llllllllllllllllIIllIllllllIIlIl.next();
            if (W.lIlIIlIIlllIlI(llllllllllllllllIIllIllllllIIlII, Prayer.PROTECT_ITEM)) {
                0;
                if (1 > -1) continue;
                return ((0x6C ^ 0x7C) & ~(0x47 ^ 0x57)) != 0;
            }
            if (W.lIlIIlIIllIllI((int)llllllllllllllllIIllIllllllIlIII) && W.lIlIIlIIllIlII(llllllllllllllllIIllIllllllIIlll.containsKey(llllllllllllllllIIllIllllllIIlII) ? 1 : 0)) {
                0;
                if (1 > 0) continue;
                return ((0x88 ^ 0xA8 ^ (0x70 ^ 0x41)) & (0x84 ^ 0xC1 ^ (0x6F ^ 0x3B) ^ -1)) != 0;
            }
            if (!W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)llllllllllllllllIIllIllllllIIlII) ? 1 : 0) || W.lIlIIlIIllIlII((int)llllllllllllllllIIllIllllllIlIII)) {
                W llllllllllllllllIIllIllllllIlIlI;
                llllllllllllllllIIllIllllllIlIlI.a(llllllllllllllllIIllIllllllIIlII);
                0;
                if (2 <= 0) {
                    return ((0xB9 ^ 0x8B ^ (0xA3 ^ 0x88)) & (0x2E ^ 0x1C ^ (0x36 ^ 0x1D) ^ -1)) != 0;
                }
            } else if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)llllllllllllllllIIllIllllllIIlII) ? 1 : 0)) {
                int llllllllllllllllIIllIllllllIIllI = llIlIIIlIII[1];
            }
            0;
            if (null == null) continue;
            return ((0x59 ^ 0x1B ^ (0xDE ^ 0x9A)) & (56 + 95 - 49 + 39 ^ 82 + 26 - -15 + 16 ^ -1)) != 0;
        }
        return bl3;
    }

    public abstract v aT();

    private static boolean lIlIIlIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIlIllII(String llllllllllllllllIIllIlllllIIlIIl, String llllllllllllllllIIllIlllllIIlIII) {
        llllllllllllllllIIllIlllllIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlllllIIIlll = new StringBuilder();
        char[] llllllllllllllllIIllIlllllIIIllI = llllllllllllllllIIllIlllllIIlIII.toCharArray();
        int llllllllllllllllIIllIlllllIIIlIl = llIlIIIlIII[0];
        char[] llllllllllllllllIIllIllllIllllll = llllllllllllllllIIllIlllllIIlIIl.toCharArray();
        int llllllllllllllllIIllIllllIlllllI = llllllllllllllllIIllIllllIllllll.length;
        int llllllllllllllllIIllIllllIllllIl = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(llllllllllllllllIIllIllllIllllIl, llllllllllllllllIIllIllllIlllllI)) {
            char llllllllllllllllIIllIlllllIIlIlI = llllllllllllllllIIllIllllIllllll[llllllllllllllllIIllIllllIllllIl];
            llllllllllllllllIIllIlllllIIIlll.append((char)(llllllllllllllllIIllIlllllIIlIlI ^ llllllllllllllllIIllIlllllIIIllI[llllllllllllllllIIllIlllllIIIlIl % llllllllllllllllIIllIlllllIIIllI.length]));
            0;
            ++llllllllllllllllIIllIlllllIIIlIl;
            ++llllllllllllllllIIllIllllIllllIl;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlllllIIIlll);
    }

    /*
     * WARNING - void declaration
     */
    private boolean aP() {
        void llllllllllllllllIIlllIIIIIlIIlII;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n2 = nArray.length;
        int llllllllllllllllIIlllIIIIIlIIIll = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(llllllllllllllllIIlllIIIIIlIIIll, (int)llllllllllllllllIIlllIIIIIlIIlII)) {
            W llllllllllllllllIIlllIIIIIlIIlll;
            void llllllllllllllllIIlllIIIIIlIIlIl;
            void llllllllllllllllIIlllIIIIIlIIIlI = llllllllllllllllIIlllIIIIIlIIlIl[llllllllllllllllIIlllIIIIIlIIIll];
            if (W.lIlIIlIIllIIIl((int)llllllllllllllllIIlllIIIIIlIIIlI, llllllllllllllllIIlllIIIIIlIIlll.aO())) {
                return llIlIIIlIII[1];
            }
            ++llllllllllllllllIIlllIIIIIlIIIll;
            0;
            if (-(0x64 ^ 0x61) < 0) continue;
            return ((0x44 ^ 0x6A) & ~(9 ^ 0x27)) != 0;
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
        Iterator<Prayer> llllllllllllllllIIllIlllllIlIllI = list.iterator();
        while (W.lIlIIlIIllIlII(llllllllllllllllIIllIlllllIlIllI.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIllIlllllIllIII;
            Prayer llllllllllllllllIIllIlllllIlIlIl = llllllllllllllllIIllIlllllIlIllI.next();
            if (!W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)llllllllllllllllIIllIlllllIlIlIl) ? 1 : 0) || W.lIlIIlIIllIlII((int)llllllllllllllllIIllIlllllIllIII)) {
                Widget llllllllllllllllIIllIlllllIlIlII = Widgets.get((WidgetInfo)llllllllllllllllIIllIlllllIlIlIl.getWidgetInfo());
                if (W.lIlIIlIIllIIlI(llllllllllllllllIIllIlllllIlIlII)) {
                    0;
                    if (1 > 0) continue;
                    return ((0x58 ^ 0x79) & ~(0x53 ^ 0x72)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllllIIllIlllllIlIlII);
                0;
                if (-1 >= (0xAC ^ 0xA8)) {
                    return ((0x17 ^ 0x5C) & ~(0x4A ^ 1)) != 0;
                }
            } else if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)llllllllllllllllIIllIlllllIlIlIl) ? 1 : 0)) {
                int llllllllllllllllIIllIlllllIlIlll = llIlIIIlIII[1];
            }
            0;
            if (3 <= (0x51 ^ 0x55)) continue;
            return ((8 ^ 0x4E) & ~(0x10 ^ 0x56)) != 0;
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray, int n2) {
        void llllllllllllllllIIlllIIIIIIIlIlI;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int llllllllllllllllIIlllIIIIIIIlIIl = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(llllllllllllllllIIlllIIIIIIIlIIl, (int)llllllllllllllllIIlllIIIIIIIlIlI)) {
            void llllllllllllllllIIlllIIIIIIIllII;
            void llllllllllllllllIIlllIIIIIIIlIll;
            void llllllllllllllllIIlllIIIIIIIlIII = llllllllllllllllIIlllIIIIIIIlIll[llllllllllllllllIIlllIIIIIIIlIIl];
            if (W.lIlIIlIIllIIIl((int)llllllllllllllllIIlllIIIIIIIlIII, (int)llllllllllllllllIIlllIIIIIIIllII)) {
                return llIlIIIlIII[1];
            }
            ++llllllllllllllllIIlllIIIIIIIlIIl;
            0;
            if (((0xE ^ 0x41) & ~(0xCA ^ 0x85)) == 0) continue;
            return ((0xFB ^ 0xA4) & ~(0xEA ^ 0xB5)) != 0;
        }
        return llIlIIIlIII[0];
    }

    private static boolean lIlIIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIlIllIl(String llllllllllllllllIIllIllllIllIIlI, String llllllllllllllllIIllIllllIllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIllllIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllllIllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllllIllIllI.init(llIlIIIlIII[4], llllllllllllllllIIllIllllIllIlll);
            return new String(llllllllllllllllIIllIllllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllllIllIlIl) {
            llllllllllllllllIIllIllllIllIlIl.printStackTrace();
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
        void llllllllllllllllIIllIlllllllIllI;
        W llllllllllllllllIIllIllllllllIII;
        void llllllllllllllllIIllIlllllllIlll;
        void llllllllllllllllIIllIlllllllIlII;
        HashMap<Prayer, Prayer> hashMap = new HashMap<Prayer, Prayer>();
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int llllllllllllllllIIllIlllllllIIll = llIlIIIlIII[0];
        while (W.lIlIIlIIllIIII(llllllllllllllllIIllIlllllllIIll, (int)llllllllllllllllIIllIlllllllIlII)) {
            void llllllllllllllllIIllIlllllllIlIl;
            void llllllllllllllllIIllIlllllllIIlI = llllllllllllllllIIllIlllllllIlIl[llllllllllllllllIIllIlllllllIIll];
            if (W.lIlIIlIIllIllI(llllllllllllllllIIllIlllllllIlll.contains(llllllllllllllllIIllIlllllllIIlI) ? 1 : 0) && W.lIlIIlIIllIlII(Prayers.isEnabled((Prayer)llllllllllllllllIIllIlllllllIIlI) ? 1 : 0)) {
                llllllllllllllllIIllIllllllllIII.a((Prayer)llllllllllllllllIIllIlllllllIIlI);
                switch (X.cp[llllllllllllllllIIllIlllllllIIlI.ordinal()]) {
                    case 1: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MAGIC, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MISSILES, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        0;
                        if (1 == 1) break;
                        return ((0x70 ^ 0x10) & ~(2 ^ 0x62)) != 0;
                    }
                    case 2: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MELEE, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MAGIC, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        0;
                        if ((0x16 ^ 0x12 ^ (0xFE ^ 0xB3) & ~(0x2D ^ 0x60)) > 2) break;
                        return ((29 + 37 - -82 + 39 ^ 96 + 108 - 72 + 4) & (0xA ^ 0x7B ^ (0xDF ^ 0x9D) ^ -1)) != 0;
                    }
                    case 3: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MELEE, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PROTECT_FROM_MISSILES, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        0;
                        if (-2 < 0) break;
                        return ((47 + 165 - -5 + 10 ^ 173 + 122 - 181 + 77) & (0xDF ^ 0xC4 ^ (0xE9 ^ 0xAE) ^ -1)) != 0;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.RIGOUR, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.EAGLE_EYE, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.AUGURY, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        0;
                        if (3 >= 3) break;
                        return ((119 + 24 - 140 + 145 ^ 145 + 182 - 239 + 98) & (49 + 10 - -105 + 13 ^ 101 + 27 - 3 + 34 ^ -1)) != 0;
                    }
                    case 7: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PIETY, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.AUGURY, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        0;
                        if (-1 <= 0) break;
                        return ((167 + 29 - 165 + 167 ^ 144 + 73 - 158 + 133) & (0xB5 ^ 0xAC ^ (0x77 ^ 0x68) ^ -1)) != 0;
                    }
                    case 8: {
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.PIETY, llllllllllllllllIIllIlllllllIIlI);
                        0;
                        llllllllllllllllIIllIlllllllIllI.put(Prayer.RIGOUR, llllllllllllllllIIllIlllllllIIlI);
                        0;
                    }
                }
            }
            ++llllllllllllllllIIllIlllllllIIll;
            0;
            if (2 != 0) continue;
            return ((0x1E ^ 0x30) & ~(0x68 ^ 0x46)) != 0;
        }
        if (W.lIlIIlIIllIlII(llllllllllllllllIIllIllllllllIII.a((List<Prayer>)llllllllllllllllIIllIlllllllIlll, llIlIIIlIII[0], (Map<Prayer, Prayer>)llllllllllllllllIIllIlllllllIllI) ? 1 : 0)) {
            llllllllllllllllIIllIllllllllIII.sleep(llIlIIIlIII[1]);
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
        String[] llllllllllllllllIIlllIIIIIIlIllI;
        W llllllllllllllllIIlllIIIIIIllIlI;
        Widget llllllllllllllllIIlllIIIIIIlIlll;
        void llllllllllllllllIIlllIIIIIIllIIl;
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (W.lIlIIlIIllIIlI(itemContainer)) {
            return this.cn.meleePrayer().ag();
        }
        Item llllllllllllllllIIlllIIIIIIllIII = llllllllllllllllIIlllIIIIIIllIIl.getItem(llIlIIIlIII[2]);
        if (W.lIlIIlIIllIIll(llllllllllllllllIIlllIIIIIIllIII)) {
            llllllllllllllllIIlllIIIIIIlIlll = WeaponMap.StyleMap.getOrDefault(llllllllllllllllIIlllIIIIIIllIII.getId(), WeaponStyle.MELEE);
            switch (X.co[llllllllllllllllIIlllIIIIIIlIlll.ordinal()]) {
                case 1: {
                    return llllllllllllllllIIlllIIIIIIllIlI.cn.meleePrayer().ag();
                }
                case 2: {
                    return llllllllllllllllIIlllIIIIIIllIlI.cn.rangePrayer().ag();
                }
                case 3: {
                    return llllllllllllllllIIlllIIIIIIllIlI.cn.magePrayer().ag();
                }
            }
        }
        if (W.lIlIIlIIllIIll(llllllllllllllllIIlllIIIIIIlIlll = Widgets.get((WidgetInfo)Combat.getAttackStyle().getWidgetInfo())) && W.lIlIIlIIllIIll(llllllllllllllllIIlllIIIIIIlIllI = llllllllllllllllIIlllIIIIIIlIlll.getActions()) && W.lIlIIlIIllIIIl(llllllllllllllllIIlllIIIIIIlIllI.length, llIlIIIlIII[1])) {
            String llllllllllllllllIIlllIIIIIIlIlIl = llllllllllllllllIIlllIIIIIIlIllI[llIlIIIlIII[0]];
            int llllllllllllllllIIlllIIIIIIlIlII = llIlIIIlIII[3];
            switch (llllllllllllllllIIlllIIIIIIlIlIl.hashCode()) {
                case 78729436: {
                    if (!W.lIlIIlIIllIlII(llllllllllllllllIIlllIIIIIIlIlIl.equals(llIlIIIIlll[llIlIIIlIII[0]]) ? 1 : 0)) break;
                    llllllllllllllllIIlllIIIIIIlIlII = llIlIIIlIII[0];
                    0;
                    if ((0x3D ^ 0x41 ^ (0xD3 ^ 0xAB)) >= 0) break;
                    return null;
                }
                case -2067063020: {
                    if (!W.lIlIIlIIllIlII(llllllllllllllllIIlllIIIIIIlIlIl.equals(llIlIIIIlll[llIlIIIlIII[1]]) ? 1 : 0)) break;
                    llllllllllllllllIIlllIIIIIIlIlII = llIlIIIlIII[1];
                    0;
                    if ((0x77 ^ 0x73) != ((0x28 ^ 4) & ~(0x24 ^ 8))) break;
                    return null;
                }
                case -2145894367: {
                    if (!W.lIlIIlIIllIlII(llllllllllllllllIIlllIIIIIIlIlIl.equals(llIlIIIIlll[llIlIIIlIII[4]]) ? 1 : 0)) break;
                    llllllllllllllllIIlllIIIIIIlIlII = llIlIIIlIII[4];
                }
            }
            switch (llllllllllllllllIIlllIIIIIIlIlII) {
                case 0: {
                    return llllllllllllllllIIlllIIIIIIllIlI.cn.rangePrayer().ag();
                }
                case 1: 
                case 2: {
                    return llllllllllllllllIIlllIIIIIIllIlI.cn.magePrayer().ag();
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
        W llllllllllllllllIIlllIIIIIIIIIll;
        if (!W.lIlIIlIIllIlII(this.aP() ? 1 : 0) || !W.lIlIIlIIllIlll((Object)this.aT(), (Object)v.NONE) || W.lIlIIlIIllIllI(this.aS() ? 1 : 0)) {
            return llIlIIIlIII[0];
        }
        if (!W.lIlIIlIIlllIII(Players.getLocal().getPoseAnimation(), llIlIIIlIII[8]) || W.lIlIIlIIllIllI(Prayers.getPoints())) {
            W.aM();
            return llIlIIIlIII[0];
        }
        List<Prayer> llllllllllllllllIIlllIIIIIIIIIlI = llllllllllllllllIIlllIIIIIIIIIll.aN();
        if (W.lIlIIlIIllIllI(llllllllllllllllIIlllIIIIIIIIIll.aL() ? 1 : 0)) {
            W.aM();
            return llIlIIIlIII[0];
        }
        if (W.lIlIIlIIlllIIl(Combat.getCurrentHealth(), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            llllllllllllllllIIlllIIIIIIIIIlI = new ArrayList<Prayer>(llllllllllllllllIIlllIIIIIIIIIlI);
            llllllllllllllllIIlllIIIIIIIIIlI.add(Prayer.RAPID_HEAL);
            0;
        }
        if (W.lIlIIlIIlllIlI((Object)llllllllllllllllIIlllIIIIIIIIIll.aT(), (Object)v.FLICK)) {
            Prayers.flick(llllllllllllllllIIlllIIIIIIIIIlI);
            0;
            0;
            if (((0x48 ^ 0x79) & ~(0x8D ^ 0xBC)) == -1) {
                return ((0x3E ^ 0x64) & ~(0xDC ^ 0x86)) != 0;
            }
        } else {
            Iterator<Prayer> llllllllllllllllIIlllIIIIIIIIIIl = llllllllllllllllIIlllIIIIIIIIIlI.iterator();
            while (W.lIlIIlIIllIlII(llllllllllllllllIIlllIIIIIIIIIIl.hasNext() ? 1 : 0)) {
                Prayer llllllllllllllllIIlllIIIIIIIIIII = llllllllllllllllIIlllIIIIIIIIIIl.next();
                if (W.lIlIIlIIllIllI(Prayers.isEnabled((Prayer)llllllllllllllllIIlllIIIIIIIIIII) ? 1 : 0)) {
                    Prayers.toggle((Prayer)llllllllllllllllIIlllIIIIIIIIIII);
                }
                0;
                if (-1 < 0) continue;
                return ((0x69 ^ 0x5C) & ~(0x54 ^ 0x61)) != 0;
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

