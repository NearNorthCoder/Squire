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

import -.r.u.q.e.s.o.t.a.i.A;
import -.r.u.q.e.s.o.t.a.i.n;
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

public abstract class z
extends Task {
    private static /* synthetic */ int[] lIIllllIlIIll;
    private static /* synthetic */ String[] lIIllllIlIIlI;
    protected final /* synthetic */ TOAConfig aT;
    protected final /* synthetic */ SquireTOA aS;
    public static final /* synthetic */ int aR;

    public boolean run() {
        z llllllllllllllIlllIlIIIllIlIllII;
        if (!z.lIllIlIIlIllIll(this.G() ? 1 : 0) || !z.lIllIlIIlIlllll((Object)this.J(), (Object)n.NONE) || z.lIllIlIIllIIIII(this.I() ? 1 : 0)) {
            return lIIllllIlIIll[0];
        }
        if (!z.lIllIlIIllIIIIl(Players.getLocal().getPoseAnimation(), lIIllllIlIIll[5]) || z.lIllIlIIllIIIII(Prayers.getPoints())) {
            z.D();
            return lIIllllIlIIll[0];
        }
        List<Prayer> llllllllllllllIlllIlIIIllIlIlIll = llllllllllllllIlllIlIIIllIlIllII.E();
        if (z.lIllIlIIllIIIII(llllllllllllllIlllIlIIIllIlIllII.C() ? 1 : 0)) {
            z.D();
            return lIIllllIlIIll[0];
        }
        Object llllllllllllllIlllIlIIIllIlIlIlI = Prayer.values();
        int llllllllllllllIlllIlIIIllIlIlIIl2 = ((Prayer[])llllllllllllllIlllIlIIIllIlIlIlI).length;
        int llllllllllllllIlllIlIIIllIlIlIII = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(llllllllllllllIlllIlIIIllIlIlIII, llllllllllllllIlllIlIIIllIlIlIIl2)) {
            Prayer llllllllllllllIlllIlIIIllIlIIlll = llllllllllllllIlllIlIIIllIlIlIlI[llllllllllllllIlllIlIIIllIlIlIII];
            if (z.lIllIlIIllIIIII(llllllllllllllIlllIlIIIllIlIlIll.contains(llllllllllllllIlllIlIIIllIlIIlll) ? 1 : 0) && z.lIllIlIIlIllIll(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIllIlIIlll) ? 1 : 0)) {
                Widget llllllllllllllIlllIlIIIllIlIIllI = Widgets.get((WidgetInfo)llllllllllllllIlllIlIIIllIlIIlll.getWidgetInfo());
                if (z.lIllIlIIlIlllII(llllllllllllllIlllIlIIIllIlIIllI)) {
                    "".length();
                    if ("  ".length() > (0x36 ^ 0x2A ^ (0xBF ^ 0xA7))) {
                        return ((0x6D ^ 0 ^ (0xA5 ^ 0x9C)) & (0x2E ^ 0x18 ^ (0x32 ^ 0x50) ^ -" ".length())) != 0;
                    }
                } else {
                    WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllIlIIIllIlIIllI);
                }
            }
            ++llllllllllllllIlllIlIIIllIlIlIII;
            "".length();
            if ((91 + 169 - 161 + 72 ^ 153 + 112 - 264 + 174) >= "  ".length()) continue;
            return ((0x1C ^ 0x4F ^ 38 + 57 - 33 + 65) & (0x49 ^ 0x1E ^ (0xCB ^ 0xB0) ^ -" ".length())) != 0;
        }
        if (z.lIllIlIIllIIIlI((Object)llllllllllllllIlllIlIIIllIlIllII.J(), (Object)n.FLICK)) {
            if (z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIllIlIllII.a(llllllllllllllIlllIlIIIllIlIlIll, lIIllllIlIIll[0]) ? 1 : 0)) {
                llllllllllllllIlllIlIIIllIlIllII.sleep(lIIllllIlIIll[1]);
            }
            llllllllllllllIlllIlIIIllIlIllII.a(llllllllllllllIlllIlIIIllIlIlIll, lIIllllIlIIll[1]);
            "".length();
            "".length();
            if ("  ".length() < -" ".length()) {
                return (("   ".length() ^ (0x71 ^ 0x2C)) & (27 + 158 - 29 + 56 ^ 80 + 55 - 42 + 45 ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllIlllIlIIIllIlIlIlI = llllllllllllllIlllIlIIIllIlIlIll.iterator();
            while (z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIllIlIlIlI.hasNext() ? 1 : 0)) {
                Prayer llllllllllllllIlllIlIIIllIlIlIIl2 = (Prayer)llllllllllllllIlllIlIIIllIlIlIlI.next();
                if (z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIllIlIlIIl2) ? 1 : 0)) {
                    Prayers.toggle((Prayer)llllllllllllllIlllIlIIIllIlIlIIl2);
                }
                "".length();
                if (-"   ".length() <= 0) continue;
                return ((168 + 54 - 38 + 47 ^ 62 + 88 - -12 + 4) & (61 + 130 - 65 + 86 ^ 147 + 10 - 48 + 40 ^ -" ".length())) != 0;
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
        Iterator<Prayer> llllllllllllllIlllIlIIIllIIlllII = list.iterator();
        while (z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIllIIlllII.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIlIIIllIIllllI;
            Prayer llllllllllllllIlllIlIIIllIIllIll = llllllllllllllIlllIlIIIllIIlllII.next();
            if (!z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIllIIllIll) ? 1 : 0) || z.lIllIlIIlIllIll((int)llllllllllllllIlllIlIIIllIIllllI)) {
                Widget llllllllllllllIlllIlIIIllIIllIlI = Widgets.get((WidgetInfo)llllllllllllllIlllIlIIIllIIllIll.getWidgetInfo());
                if (z.lIllIlIIlIlllII(llllllllllllllIlllIlIIIllIIllIlI)) {
                    "".length();
                    if (" ".length() != ((2 + 171 - 22 + 47 ^ 80 + 18 - -24 + 21) & (73 + 80 - 41 + 28 ^ 26 + 70 - 91 + 192 ^ -" ".length()))) continue;
                    return ((0xC4 ^ 0xB4 ^ (5 ^ 0x38)) & (0xAA ^ 0xBB ^ (0x58 ^ 4) ^ -" ".length())) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllIlIIIllIIllIlI);
                "".length();
                if (" ".length() <= 0) {
                    return ((0x8B ^ 0xB1) & ~(0x67 ^ 0x5D)) != 0;
                }
            } else if (z.lIllIlIIllIIIII(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIllIIllIll) ? 1 : 0)) {
                int llllllllllllllIlllIlIIIllIIlllIl = lIIllllIlIIll[1];
            }
            "".length();
            if (((0x6B ^ 0x42) & ~(0x5F ^ 0x76)) == 0) continue;
            return ((0x5D ^ 0x5A) & ~(0x40 ^ 0x47)) != 0;
        }
        return bl2;
    }

    private static void lIllIlIIlIllIII() {
        lIIllllIlIIlI = new String[lIIllllIlIIll[2]];
        z.lIIllllIlIIlI[z.lIIllllIlIIll[0]] = z.lIllIlIIlIlIllI("mraJGbcv3QA=", "ZpZNa");
        z.lIIllllIlIIlI[z.lIIllllIlIIll[1]] = z.lIllIlIIlIlIlll("qk43qXSQmf9+mTfv2R4UQQ==", "gbymL");
        z.lIIllllIlIIlI[z.lIIllllIlIIll[4]] = z.lIllIlIIlIlIllI("EEH39Hzv1OXjaY7WYZApsw==", "TUSXY");
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
        void llllllllllllllIlllIlIIIlllIlIIII;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n2 = nArray.length;
        int llllllllllllllIlllIlIIIlllIIllll = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(llllllllllllllIlllIlIIIlllIIllll, (int)llllllllllllllIlllIlIIIlllIlIIII)) {
            z llllllllllllllIlllIlIIIlllIlIIll;
            void llllllllllllllIlllIlIIIlllIlIIIl;
            void llllllllllllllIlllIlIIIlllIIlllI = llllllllllllllIlllIlIIIlllIlIIIl[llllllllllllllIlllIlIIIlllIIllll];
            if (z.lIllIlIIlIlllIl((int)llllllllllllllIlllIlIIIlllIIlllI, llllllllllllllIlllIlIIIlllIlIIll.F())) {
                return lIIllllIlIIll[1];
            }
            ++llllllllllllllIlllIlIIIlllIIllll;
            "".length();
            if (null == null) continue;
            return ("   ".length() & ~"   ".length()) != 0;
        }
        return lIIllllIlIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    public Prayer H() {
        String[] llllllllllllllIlllIlIIIlllIIIIlI;
        z llllllllllllllIlllIlIIIlllIIIllI;
        Widget llllllllllllllIlllIlIIIlllIIIIll;
        void llllllllllllllIlllIlIIIlllIIIlIl;
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (z.lIllIlIIlIlllII(itemContainer)) {
            return this.aT.meleePrayer().z();
        }
        Item llllllllllllllIlllIlIIIlllIIIlII = llllllllllllllIlllIlIIIlllIIIlIl.getItem(lIIllllIlIIll[2]);
        if (z.lIllIlIIlIllllI(llllllllllllllIlllIlIIIlllIIIlII)) {
            llllllllllllllIlllIlIIIlllIIIIll = WeaponMap.StyleMap.getOrDefault(llllllllllllllIlllIlIIIlllIIIlII.getId(), WeaponStyle.MELEE);
            switch (A.aU[llllllllllllllIlllIlIIIlllIIIIll.ordinal()]) {
                case 1: {
                    return llllllllllllllIlllIlIIIlllIIIllI.aT.meleePrayer().z();
                }
                case 2: {
                    return llllllllllllllIlllIlIIIlllIIIllI.aT.rangePrayer().z();
                }
                case 3: {
                    return llllllllllllllIlllIlIIIlllIIIllI.aT.magePrayer().z();
                }
            }
        }
        if (z.lIllIlIIlIllllI(llllllllllllllIlllIlIIIlllIIIIll = Widgets.get((WidgetInfo)Combat.getAttackStyle().getWidgetInfo())) && z.lIllIlIIlIllllI(llllllllllllllIlllIlIIIlllIIIIlI = llllllllllllllIlllIlIIIlllIIIIll.getActions()) && z.lIllIlIIlIlllIl(llllllllllllllIlllIlIIIlllIIIIlI.length, lIIllllIlIIll[1])) {
            String llllllllllllllIlllIlIIIlllIIIIIl = llllllllllllllIlllIlIIIlllIIIIlI[lIIllllIlIIll[0]];
            int llllllllllllllIlllIlIIIlllIIIIII = lIIllllIlIIll[3];
            switch (llllllllllllllIlllIlIIIlllIIIIIl.hashCode()) {
                case 78729436: {
                    if (!z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIlllIIIIIl.equals(lIIllllIlIIlI[lIIllllIlIIll[0]]) ? 1 : 0)) break;
                    llllllllllllllIlllIlIIIlllIIIIII = lIIllllIlIIll[0];
                    "".length();
                    if (null == null) break;
                    return null;
                }
                case -2067063020: {
                    if (!z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIlllIIIIIl.equals(lIIllllIlIIlI[lIIllllIlIIll[1]]) ? 1 : 0)) break;
                    llllllllllllllIlllIlIIIlllIIIIII = lIIllllIlIIll[1];
                    "".length();
                    if ((0x3F ^ 0x3B) >= "  ".length()) break;
                    return null;
                }
                case -2145894367: {
                    if (!z.lIllIlIIlIllIll(llllllllllllllIlllIlIIIlllIIIIIl.equals(lIIllllIlIIlI[lIIllllIlIIll[4]]) ? 1 : 0)) break;
                    llllllllllllllIlllIlIIIlllIIIIII = lIIllllIlIIll[4];
                }
            }
            switch (llllllllllllllIlllIlIIIlllIIIIII) {
                case 0: {
                    return llllllllllllllIlllIlIIIlllIIIllI.aT.rangePrayer().z();
                }
                case 1: 
                case 2: {
                    return llllllllllllllIlllIlIIIlllIIIllI.aT.magePrayer().z();
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
        void llllllllllllllIlllIlIIIllIllIllI;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int llllllllllllllIlllIlIIIllIllIlIl = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(llllllllllllllIlllIlIIIllIllIlIl, (int)llllllllllllllIlllIlIIIllIllIllI)) {
            void llllllllllllllIlllIlIIIllIlllIII;
            void llllllllllllllIlllIlIIIllIllIlll;
            void llllllllllllllIlllIlIIIllIllIlII = llllllllllllllIlllIlIIIllIllIlll[llllllllllllllIlllIlIIIllIllIlIl];
            if (z.lIllIlIIlIlllIl((int)llllllllllllllIlllIlIIIllIllIlII, (int)llllllllllllllIlllIlIIIllIlllIII)) {
                return lIIllllIlIIll[1];
            }
            ++llllllllllllllIlllIlIIIllIllIlIl;
            "".length();
            if (" ".length() > ((12 + 111 - 42 + 79 ^ 151 + 142 - 215 + 81) & (0x5A ^ 0x69 ^ (0x29 ^ 0x25) ^ -" ".length()))) continue;
            return ((145 + 225 - 330 + 192 ^ 106 + 59 - 130 + 129) & (104 + 157 - 188 + 125 ^ 125 + 44 - 114 + 83 ^ -" ".length())) != 0;
        }
        return lIIllllIlIIll[0];
    }

    private static String lIllIlIIlIlIlll(String llllllllllllllIlllIlIIIllIIIIIll, String llllllllllllllIlllIlIIIllIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIllIIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIllIIIIlll.init(lIIllllIlIIll[4], llllllllllllllIlllIlIIIllIIIlIII);
            return new String(llllllllllllllIlllIlIIIllIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIllIIIIllI) {
            llllllllllllllIlllIlIIIllIIIIllI.printStackTrace();
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

    private static String lIllIlIIlIlIllI(String llllllllllllllIlllIlIIIllIIlIIlI, String llllllllllllllIlllIlIIIllIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIll[6]), "DES");
            Cipher llllllllllllllIlllIlIIIllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIllIIlIlII.init(lIIllllIlIIll[4], llllllllllllllIlllIlIIIllIIlIlIl);
            return new String(llllllllllllllIlllIlIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIllIIlIIll) {
            llllllllllllllIlllIlIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void D() {
        void llllllllllllllIlllIlIIIlllIlllIl;
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int llllllllllllllIlllIlIIIlllIlllII = lIIllllIlIIll[0];
        while (z.lIllIlIIlIllIlI(llllllllllllllIlllIlIIIlllIlllII, (int)llllllllllllllIlllIlIIIlllIlllIl)) {
            void llllllllllllllIlllIlIIIlllIllllI;
            void llllllllllllllIlllIlIIIlllIllIll = llllllllllllllIlllIlIIIlllIllllI[llllllllllllllIlllIlIIIlllIlllII];
            if (z.lIllIlIIlIllIll(Prayers.isEnabled((Prayer)llllllllllllllIlllIlIIIlllIllIll) ? 1 : 0)) {
                Widget llllllllllllllIlllIlIIIlllIllIlI = Widgets.get((WidgetInfo)llllllllllllllIlllIlIIIlllIllIll.getWidgetInfo());
                if (z.lIllIlIIlIlllII(llllllllllllllIlllIlIIIlllIllIlI)) {
                    "".length();
                    if (((4 + 119 - 61 + 114 ^ 79 + 100 - 61 + 18) & (22 + 79 - -11 + 31 ^ 93 + 33 - 123 + 180 ^ -" ".length())) < 0) {
                        return;
                    }
                } else {
                    WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllIlIIIlllIllIlI);
                }
            }
            ++llllllllllllllIlllIlIIIlllIlllII;
            "".length();
            if ((0x3B ^ 0x3E) != 0) continue;
            return;
        }
    }

    private static void lIllIlIIlIllIIl() {
        lIIllllIlIIll = new int[7];
        z.lIIllllIlIIll[0] = (0xC3 ^ 0x95) & ~(0x62 ^ 0x34);
        z.lIIllllIlIIll[1] = " ".length();
        z.lIIllllIlIIll[2] = "   ".length();
        z.lIIllllIlIIll[3] = -" ".length();
        z.lIIllllIlIIll[4] = "  ".length();
        z.lIIllllIlIIll[5] = 0xFFFF95AB & 0x7FF6;
        z.lIIllllIlIIll[6] = 0xA3 ^ 0xAB;
    }
}

