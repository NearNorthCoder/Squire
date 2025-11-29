package p000.r.u.q.e.s.o.t.a.i;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.client.plugins.fw.Task;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: -.r.u.q.e.s.o.t.a.i.z  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/z.class */
public abstract class z extends Task {
    private static /* synthetic */ int[] lIIllllIlIIll;
    private static /* synthetic */ String[] lIIllllIlIIlI;
    protected final /* synthetic */ TOAConfig aT;
    protected final /* synthetic */ SquireTOA aS;
    public static final /* synthetic */ int aR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    public boolean run() {
        if (lIllIlIIlIllIll(G() ? 1 : 0) && lIllIlIIlIlllll(J(), EnumC0013n.NONE) && !lIllIlIIllIIIII(I() ? 1 : 0)) {
            if (!lIllIlIIllIIIIl(Players.getLocal().getPoseAnimation(), lIIllllIlIIll[5]) || lIllIlIIllIIIII(Prayers.getPoints())) {
                D();
                return lIIllllIlIIll[0];
            }
            List<Prayer> E = E();
            if (lIllIlIIllIIIII(C() ? 1 : 0)) {
                D();
                return lIIllllIlIIll[0];
            }
            Prayer[] values = Prayer.values();
            int length = values.length;
            int i = lIIllllIlIIll[0];
            while (lIllIlIIlIllIlI(i, length)) {
                Prayer prayer = values[i];
                if (lIllIlIIllIIIII(E.contains(prayer) ? 1 : 0) && lIllIlIIlIllIll(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    Widget widget = Widgets.get(prayer.getWidgetInfo());
                    if (lIllIlIIlIlllII(widget)) {
                        "".length();
                        if ("  ".length() > ((54 ^ 42) ^ (191 ^ 167))) {
                            return ((109 ^ 0) ^ (165 ^ 156)) & (((46 ^ 24) ^ (50 ^ 80)) ^ (-" ".length()));
                        }
                    } else {
                        WidgetPackets.widgetFirstOption(widget);
                    }
                }
                i++;
                "".length();
                if (((((91 + 169) - 161) + 72) ^ (((153 + 112) - 264) + 174)) < "  ".length()) {
                    return ((28 ^ 79) ^ (((38 + 57) - 33) + 65)) & (((73 ^ 30) ^ (203 ^ 176)) ^ (-" ".length()));
                }
            }
            if (lIllIlIIllIIIlI(J(), EnumC0013n.FLICK)) {
                if (lIllIlIIlIllIll(a(E, (boolean) lIIllllIlIIll[0]) ? 1 : 0)) {
                    sleep(lIIllllIlIIll[1]);
                }
                a(E, (boolean) lIIllllIlIIll[1]);
                "".length();
                "".length();
                if ("  ".length() < (-" ".length())) {
                    return ("   ".length() ^ (113 ^ 44)) & (((((27 + 158) - 29) + 56) ^ (((80 + 55) - 42) + 45)) ^ (-" ".length()));
                }
            } else {
                for (Prayer prayer2 : E) {
                    if (lIllIlIIllIIIII(Prayers.isEnabled(prayer2) ? 1 : 0)) {
                        Prayers.toggle(prayer2);
                    }
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return ((((168 + 54) - 38) + 47) ^ (((62 + 88) - (-12)) + 4)) & (((((61 + 130) - 65) + 86) ^ (((147 + 10) - 48) + 40)) ^ (-" ".length()));
                    }
                }
            }
            return lIIllllIlIIll[1];
        }
        return lIIllllIlIIll[0];
    }

    public z(SquireTOA squireTOA, TOAConfig tOAConfig) {
        this.aS = squireTOA;
        this.aT = tOAConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(List<Prayer> list, boolean z) {
        int i = lIIllllIlIIll[0];
        for (Prayer prayer : list) {
            if (!lIllIlIIllIIIII(Prayers.isEnabled(prayer) ? 1 : 0) || lIllIlIIlIllIll(z ? 1 : 0)) {
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (lIllIlIIlIlllII(widget)) {
                    "".length();
                    if (" ".length() == (((((2 + 171) - 22) + 47) ^ (((80 + 18) - (-24)) + 21)) & (((((73 + 80) - 41) + 28) ^ (((26 + 70) - 91) + 192)) ^ (-" ".length())))) {
                        return ((196 ^ 180) ^ (5 ^ 56)) & (((170 ^ 187) ^ (88 ^ 4)) ^ (-" ".length()));
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if (" ".length() <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            } else if (lIllIlIIllIIIII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                i = lIIllllIlIIll[1];
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return i;
    }

    private static void lIllIlIIlIllIII() {
        lIIllllIlIIlI = new String[lIIllllIlIIll[2]];
        lIIllllIlIIlI[lIIllllIlIIll[0]] = lIllIlIIlIlIllI("mraJGbcv3QA=", "ZpZNa");
        lIIllllIlIIlI[lIIllllIlIIll[1]] = lIllIlIIlIlIlll("qk43qXSQmf9+mTfv2R4UQQ==", "gbymL");
        lIIllllIlIIlI[lIIllllIlIIll[4]] = lIllIlIIlIlIllI("EEH39Hzv1OXjaY7WYZApsw==", "TUSXY");
    }

    public abstract boolean C();

    public abstract int F();

    private static boolean lIllIlIIlIlllII(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIIllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIlIIllIIIII(int i) {
        return i == 0;
    }

    private static boolean lIllIlIIlIlllIl(int i, int i2) {
        return i == i2;
    }

    public abstract List<Prayer> E();

    public abstract EnumC0013n J();

    private static boolean lIllIlIIlIllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean G() {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i = lIIllllIlIIll[0];
        while (lIllIlIIlIllIlI(i, length)) {
            if (lIllIlIIlIlllIl(mapRegions[i], F())) {
                return lIIllllIlIIll[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return "   ".length() & ("   ".length() ^ (-1));
            }
        }
        return lIIllllIlIIll[0];
    }

    public Prayer H() {
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (lIllIlIIlIlllII(itemContainer)) {
            return this.aT.meleePrayer().z();
        }
        Item item = itemContainer.getItem(lIIllllIlIIll[2]);
        if (lIllIlIIlIllllI(item)) {
            switch (A.aU[((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(item.getId()), WeaponStyle.MELEE)).ordinal()]) {
                case 1:
                    return this.aT.meleePrayer().z();
                case 2:
                    return this.aT.rangePrayer().z();
                case 3:
                    return this.aT.magePrayer().z();
            }
        }
        Widget widget = Widgets.get(Combat.getAttackStyle().getWidgetInfo());
        if (lIllIlIIlIllllI(widget)) {
            String[] actions = widget.getActions();
            if (lIllIlIIlIllllI(actions) && lIllIlIIlIlllIl(actions.length, lIIllllIlIIll[1])) {
                String str = actions[lIIllllIlIIll[0]];
                int i = lIIllllIlIIll[3];
                switch (str.hashCode()) {
                    case -2145894367:
                        if (lIllIlIIlIllIll(str.equals(lIIllllIlIIlI[lIIllllIlIIll[4]]) ? 1 : 0)) {
                            i = lIIllllIlIIll[4];
                            break;
                        }
                        break;
                    case -2067063020:
                        if (lIllIlIIlIllIll(str.equals(lIIllllIlIIlI[lIIllllIlIIll[1]]) ? 1 : 0)) {
                            i = lIIllllIlIIll[1];
                            "".length();
                            if ((63 ^ 59) < "  ".length()) {
                                return null;
                            }
                        }
                        break;
                    case 78729436:
                        if (lIllIlIIlIllIll(str.equals(lIIllllIlIIlI[lIIllllIlIIll[0]]) ? 1 : 0)) {
                            i = lIIllllIlIIll[0];
                            "".length();
                            if (0 != 0) {
                                return null;
                            }
                        }
                        break;
                }
                switch (i) {
                    case 0:
                        return this.aT.rangePrayer().z();
                    case 1:
                    case 2:
                        return this.aT.magePrayer().z();
                }
            }
        }
        return this.aT.meleePrayer().z();
    }

    private static boolean lIllIlIIlIllIll(int i) {
        return i != 0;
    }

    static {
        lIllIlIIlIllIIl();
        lIllIlIIlIllIII();
        aR = lIIllllIlIIll[5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(int[] iArr, int llllllllllllllIlllIlIIIllIlllIII) {
        int length = iArr.length;
        int i = lIIllllIlIIll[0];
        while (lIllIlIIlIllIlI(i, length)) {
            if (lIllIlIIlIlllIl(iArr[i], llllllllllllllIlllIlIIIllIlllIII)) {
                return lIIllllIlIIll[1];
            }
            i++;
            "".length();
            if (" ".length() <= (((((12 + 111) - 42) + 79) ^ (((151 + 142) - 215) + 81)) & (((90 ^ 105) ^ (41 ^ 37)) ^ (-" ".length())))) {
                return ((((145 + 225) - 330) + 192) ^ (((106 + 59) - 130) + 129)) & (((((104 + 157) - 188) + 125) ^ (((125 + 44) - 114) + 83)) ^ (-" ".length()));
            }
        }
        return lIIllllIlIIll[0];
    }

    private static String lIllIlIIlIlIlll(String llllllllllllllIlllIlIIIllIIIIlIl, String llllllllllllllIlllIlIIIllIIIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllIlIIll[4], llllllllllllllIlllIlIIIllIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIllIIIIllI) {
            llllllllllllllIlllIlIIIllIIIIllI.printStackTrace();
            return null;
        }
    }

    public abstract boolean I();

    private static boolean lIllIlIIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIllIIIIl(int i, int i2) {
        return i != i2;
    }

    private static String lIllIlIIlIlIllI(String llllllllllllllIlllIlIIIllIIlIIlI, String llllllllllllllIlllIlIIIllIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIlIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIllIIlIIll) {
            llllllllllllllIlllIlIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void D() {
        Prayer[] values = Prayer.values();
        int length = values.length;
        int i = lIIllllIlIIll[0];
        while (lIllIlIIlIllIlI(i, length)) {
            Prayer prayer = values[i];
            if (lIllIlIIlIllIll(Prayers.isEnabled(prayer) ? 1 : 0)) {
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (lIllIlIIlIlllII(widget)) {
                    "".length();
                    if ((((((4 + 119) - 61) + 114) ^ (((79 + 100) - 61) + 18)) & (((((22 + 79) - (-11)) + 31) ^ (((93 + 33) - 123) + 180)) ^ (-" ".length()))) < 0) {
                        return;
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                }
            }
            i++;
            "".length();
            if (!(true ^ true)) {
                return;
            }
        }
    }

    private static void lIllIlIIlIllIIl() {
        lIIllllIlIIll = new int[7];
        lIIllllIlIIll[0] = (195 ^ 149) & ((98 ^ 52) ^ (-1));
        lIIllllIlIIll[1] = " ".length();
        lIIllllIlIIll[2] = "   ".length();
        lIIllllIlIIll[3] = -" ".length();
        lIIllllIlIIll[4] = "  ".length();
        lIIllllIlIIll[5] = (-27221) & 32758;
        lIIllllIlIIll[6] = 163 ^ 171;
    }
}
