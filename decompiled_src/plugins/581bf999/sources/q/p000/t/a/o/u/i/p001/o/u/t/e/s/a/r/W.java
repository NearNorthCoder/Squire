package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/W.class */
public abstract class W extends Task {
    private static /* synthetic */ int[] llIlIIIlIII;
    private static /* synthetic */ String[] llIlIIIIlll;
    protected final /* synthetic */ SquireAutoTOA cm;
    protected final /* synthetic */ TOAConfig cn;
    public static final /* synthetic */ int cl;

    private static boolean lIlIIlIIllIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z, Map<Prayer, Prayer> map) {
        int i = llIlIIIlIII[0];
        for (Prayer prayer : list) {
            if (lIlIIlIIlllIlI(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIlIIlIIllIllI(z ? 1 : 0) && lIlIIlIIllIlII(map.containsKey(prayer) ? 1 : 0)) {
                "".length();
                if (" ".length() <= 0) {
                    return ((136 ^ 168) ^ (112 ^ 65)) & (((132 ^ 193) ^ (111 ^ 59)) ^ (-" ".length()));
                }
            } else {
                if (!lIlIIlIIllIllI(Prayers.isEnabled(prayer) ? 1 : 0) || lIlIIlIIllIlII(z ? 1 : 0)) {
                    a(prayer);
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((185 ^ 139) ^ (163 ^ 136)) & (((46 ^ 28) ^ (54 ^ 29)) ^ (-" ".length()));
                    }
                } else if (lIlIIlIIllIllI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    i = llIlIIIlIII[1];
                }
                "".length();
                if (0 != 0) {
                    return ((89 ^ 27) ^ (222 ^ 154)) & (((((56 + 95) - 49) + 39) ^ (((82 + 26) - (-15)) + 16)) ^ (-" ".length()));
                }
            }
        }
        return i;
    }

    public abstract EnumC0073v aT();

    private static boolean lIlIIlIIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIlIIlIllII(String llllllllllllllllIIllIlllllIIlIIl, String llllllllllllllllIIllIlllllIIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIlllllIIlIII.toCharArray();
        int llllllllllllllllIIllIlllllIIIlIl = llIlIIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIlIII[0];
        while (lIlIIlIIllIIII(i, length)) {
            char llllllllllllllllIIllIllllIllllII = charArray2[i];
            sb.append((char) (llllllllllllllllIIllIllllIllllII ^ charArray[llllllllllllllllIIllIlllllIIIlIl % charArray.length]));
            "".length();
            llllllllllllllllIIllIlllllIIIlIl++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean aP() {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i = llIlIIIlIII[0];
        while (lIlIIlIIllIIII(i, length)) {
            if (lIlIIlIIllIIIl(mapRegions[i], aO())) {
                return llIlIIIlIII[1];
            }
            i++;
            "".length();
            if ((-(100 ^ 97)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlIIIlIII[0];
    }

    private Prayer aR() {
        if (!lIlIIlIIllIlIl(Skills.getLevel(Skill.PRAYER), llIlIIIlIII[5]) || lIlIIlIIllIllI(Vars.getVarp(llIlIIIlIII[6]))) {
            return Prayer.ULTIMATE_STRENGTH;
        }
        if (lIlIIlIIllIlIl(Skills.getLevel(Skill.PRAYER), llIlIIIlIII[7])) {
            Prayer prayer = Prayer.PIETY;
            "".length();
            if (((30 ^ 116) ^ (49 ^ 94)) <= 0) {
                return null;
            }
            return prayer;
        }
        return Prayer.CHIVALRY;
    }

    private static boolean lIlIIlIIllIIlI(Object obj) {
        return obj == null;
    }

    public abstract boolean aL();

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(List<Prayer> list, boolean z) {
        int llllllllllllllllIIllIlllllIlIlll = llIlIIIlIII[0];
        for (Prayer prayer : list) {
            if (!lIlIIlIIllIllI(Prayers.isEnabled(prayer) ? 1 : 0) || lIlIIlIIllIlII(z ? 1 : 0)) {
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (lIlIIlIIllIIlI(widget)) {
                    "".length();
                    if (" ".length() <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if ((-" ".length()) >= (172 ^ 168)) {
                        return (true ^ true) & ((!true) ^ true);
                    }
                }
            } else if (lIlIIlIIllIllI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                llllllllllllllllIIllIlllllIlIlll = llIlIIIlIII[1];
            }
            "".length();
            if ("   ".length() > (81 ^ 85)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllllllllllllllIIllIlllllIlIlll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = llIlIIIlIII[0];
        while (lIlIIlIIllIIII(i2, length)) {
            if (lIlIIlIIllIIIl(iArr[i2], i)) {
                return llIlIIIlIII[1];
            }
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlIIIlIII[0];
    }

    private static boolean lIlIIlIIllIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIlIIlIllIl(String llllllllllllllllIIllIllllIllIlII, String llllllllllllllllIIllIllllIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIlIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllllIllIlIl) {
            llllllllllllllllIIllIllllIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIlIlllI() {
        llIlIIIIlll = new String[llIlIIIlIII[2]];
        llIlIIIIlll[llIlIIIlIII[0]] = lIlIIlIIlIllII("ByQkCCk=", "UETaM");
        llIlIIIIlll[llIlIIIlIII[1]] = lIlIIlIIlIllIl("sfDBDbxgcq2NINFtfCpeWQ==", "ONrYG");
        llIlIIIIlll[llIlIIIlIII[4]] = lIlIIlIIlIllII("NhwnPxEbHS49", "zsIXc");
    }

    private static boolean lIlIIlIIlllIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIlIIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public boolean c(List<Prayer> list) {
        HashMap hashMap = new HashMap();
        Prayer[] values = Prayer.values();
        int length = values.length;
        int i = llIlIIIlIII[0];
        while (lIlIIlIIllIIII(i, length)) {
            Prayer prayer = values[i];
            if (lIlIIlIIllIllI(list.contains(prayer) ? 1 : 0) && lIlIIlIIllIlII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                a(prayer);
                switch (X.cp[prayer.ordinal()]) {
                    case 1:
                        hashMap.put(Prayer.PROTECT_FROM_MAGIC, prayer);
                        "".length();
                        hashMap.put(Prayer.PROTECT_FROM_MISSILES, prayer);
                        "".length();
                        "".length();
                        if (" ".length() != " ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        break;
                    case 2:
                        hashMap.put(Prayer.PROTECT_FROM_MELEE, prayer);
                        "".length();
                        hashMap.put(Prayer.PROTECT_FROM_MAGIC, prayer);
                        "".length();
                        "".length();
                        if (((22 ^ 18) ^ ((254 ^ 179) & ((45 ^ 96) ^ (-1)))) <= "  ".length()) {
                            return ((((29 + 37) - (-82)) + 39) ^ (((96 + 108) - 72) + 4)) & (((10 ^ 123) ^ (223 ^ 157)) ^ (-" ".length()));
                        }
                        break;
                    case 3:
                        hashMap.put(Prayer.PROTECT_FROM_MELEE, prayer);
                        "".length();
                        hashMap.put(Prayer.PROTECT_FROM_MISSILES, prayer);
                        "".length();
                        "".length();
                        if ((-"  ".length()) >= 0) {
                            return ((((47 + 165) - (-5)) + 10) ^ (((173 + 122) - 181) + 77)) & (((223 ^ 196) ^ (233 ^ 174)) ^ (-" ".length()));
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        hashMap.put(Prayer.RIGOUR, prayer);
                        "".length();
                        hashMap.put(Prayer.EAGLE_EYE, prayer);
                        "".length();
                        hashMap.put(Prayer.AUGURY, prayer);
                        "".length();
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return ((((119 + 24) - 140) + 145) ^ (((145 + 182) - 239) + 98)) & (((((49 + 10) - (-105)) + 13) ^ (((101 + 27) - 3) + 34)) ^ (-" ".length()));
                        }
                        break;
                    case 7:
                        hashMap.put(Prayer.PIETY, prayer);
                        "".length();
                        hashMap.put(Prayer.AUGURY, prayer);
                        "".length();
                        "".length();
                        if ((-" ".length()) > 0) {
                            return ((((167 + 29) - 165) + 167) ^ (((144 + 73) - 158) + 133)) & (((181 ^ 172) ^ (119 ^ 104)) ^ (-" ".length()));
                        }
                        break;
                    case 8:
                        hashMap.put(Prayer.PIETY, prayer);
                        "".length();
                        hashMap.put(Prayer.RIGOUR, prayer);
                        "".length();
                        break;
                }
            }
            i++;
            "".length();
            if ("  ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIlIIlIIllIlII(a(list, llIlIIIlIII[0], hashMap) ? 1 : 0)) {
            sleep(llIlIIIlIII[1]);
        }
        a(list, llIlIIIlIII[1], hashMap);
        "".length();
        return llIlIIIlIII[1];
    }

    private static boolean lIlIIlIIllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Prayer aQ() {
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (lIlIIlIIllIIlI(itemContainer)) {
            return this.cn.meleePrayer().ag();
        }
        Item item = itemContainer.getItem(llIlIIIlIII[2]);
        if (lIlIIlIIllIIll(item)) {
            switch (X.co[((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(item.getId()), WeaponStyle.MELEE)).ordinal()]) {
                case 1:
                    return this.cn.meleePrayer().ag();
                case 2:
                    return this.cn.rangePrayer().ag();
                case 3:
                    return this.cn.magePrayer().ag();
            }
        }
        Widget widget = Widgets.get(Combat.getAttackStyle().getWidgetInfo());
        if (lIlIIlIIllIIll(widget)) {
            String[] actions = widget.getActions();
            if (lIlIIlIIllIIll(actions) && lIlIIlIIllIIIl(actions.length, llIlIIIlIII[1])) {
                String str = actions[llIlIIIlIII[0]];
                int i = llIlIIIlIII[3];
                switch (str.hashCode()) {
                    case -2145894367:
                        if (lIlIIlIIllIlII(str.equals(llIlIIIIlll[llIlIIIlIII[4]]) ? 1 : 0)) {
                            i = llIlIIIlIII[4];
                            break;
                        }
                        break;
                    case -2067063020:
                        if (lIlIIlIIllIlII(str.equals(llIlIIIIlll[llIlIIIlIII[1]]) ? 1 : 0)) {
                            i = llIlIIIlIII[1];
                            "".length();
                            if ((true ^ true) == ((true ^ true) & ((true ^ true) ^ true))) {
                                return null;
                            }
                        }
                        break;
                    case 78729436:
                        if (lIlIIlIIllIlII(str.equals(llIlIIIIlll[llIlIIIlIII[0]]) ? 1 : 0)) {
                            i = llIlIIIlIII[0];
                            "".length();
                            if (((61 ^ 65) ^ (211 ^ 171)) < 0) {
                                return null;
                            }
                        }
                        break;
                }
                switch (i) {
                    case 0:
                        return this.cn.rangePrayer().ag();
                    case 1:
                    case 2:
                        return this.cn.magePrayer().ag();
                }
            }
        }
        return this.cn.meleePrayer().ag();
    }

    private static boolean lIlIIlIIllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public abstract boolean aS();

    private static void aM() {
        Prayers.disableAll();
    }

    private void a(Prayer prayer) {
        Widget widget = Widgets.get(prayer.getWidgetInfo());
        if (lIlIIlIIllIIlI(widget)) {
            return;
        }
        WidgetPackets.widgetFirstOption(widget);
    }

    private static boolean lIlIIlIIllIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    public boolean run() {
        if (lIlIIlIIllIlII(aP() ? 1 : 0) && lIlIIlIIllIlll(aT(), EnumC0073v.NONE) && !lIlIIlIIllIllI(aS() ? 1 : 0)) {
            if (!lIlIIlIIlllIII(Players.getLocal().getPoseAnimation(), llIlIIIlIII[8]) || lIlIIlIIllIllI(Prayers.getPoints())) {
                aM();
                return llIlIIIlIII[0];
            }
            List<Prayer> aN = aN();
            if (lIlIIlIIllIllI(aL() ? 1 : 0)) {
                aM();
                return llIlIIIlIII[0];
            }
            ArrayList arrayList = aN;
            if (lIlIIlIIlllIIl(Combat.getCurrentHealth(), Skills.getLevel(Skill.HITPOINTS))) {
                ArrayList arrayList2 = new ArrayList(aN);
                arrayList2.add(Prayer.RAPID_HEAL);
                "".length();
                arrayList = arrayList2;
            }
            if (lIlIIlIIlllIlI(aT(), EnumC0073v.FLICK)) {
                Prayers.flick(arrayList);
                "".length();
                "".length();
                if (((72 ^ 121) & ((141 ^ 188) ^ (-1))) == (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                for (Prayer prayer : arrayList) {
                    if (lIlIIlIIllIllI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                        Prayers.toggle(prayer);
                    }
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            return llIlIIIlIII[1];
        }
        return llIlIIIlIII[0];
    }

    public abstract List<Prayer> aN();

    private static boolean lIlIIlIIlllIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIIlIIllIlIl(int i, int i2) {
        return i >= i2;
    }

    public abstract int aO();

    private static void lIlIIlIIlIllll() {
        llIlIIIlIII = new int[9];
        llIlIIIlIII[0] = (49 ^ 34) & ((86 ^ 69) ^ (-1));
        llIlIIIlIII[1] = " ".length();
        llIlIIIlIII[2] = "   ".length();
        llIlIIIlIII[3] = -" ".length();
        llIlIIIlIII[4] = "  ".length();
        llIlIIIlIII[5] = (218 ^ 172) ^ (13 ^ 71);
        llIlIIIlIII[6] = (-((-2073) & 22585)) & (-9) & 24429;
        llIlIIIlIII[7] = "   ".length() ^ (214 ^ 147);
        llIlIIIlIII[8] = (-((-18471) & 27247)) & (-18433) & 32746;
    }

    static {
        lIlIIlIIlIllll();
        lIlIIlIIlIlllI();
        cl = llIlIIIlIII[8];
    }

    public W(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        this.cm = squireAutoTOA;
        this.cn = tOAConfig;
    }
}
