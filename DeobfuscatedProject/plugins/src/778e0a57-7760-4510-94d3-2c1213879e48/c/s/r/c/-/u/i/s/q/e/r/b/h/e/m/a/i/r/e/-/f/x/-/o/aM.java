/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@TaskDesc(name="Loot Chest", priority=50000, blocking=true)
public class aM
extends aR {
    private static /* synthetic */ String[] lIlIIlllllII;
    private static /* synthetic */ int[] lIlIIlllllIl;

    private static void llIllIllIlllll() {
        lIlIIlllllIl = new int[13];
        aM.lIlIIlllllIl[0] = (1 ^ 0x59 ^ (0xE7 ^ 0xBA)) & (0x3C ^ 0x26 ^ (0xB ^ 0x14) ^ -" ".length());
        aM.lIlIIlllllIl[1] = " ".length();
        aM.lIlIIlllllIl[2] = 0xFFFFE3FF & 0x1E1B;
        aM.lIlIIlllllIl[3] = 0x80 ^ 0x85;
        aM.lIlIIlllllIl[4] = "  ".length();
        aM.lIlIIlllllIl[5] = "   ".length();
        aM.lIlIIlllllIl[6] = 0x6F ^ 0x42 ^ (0x1F ^ 0x36);
        aM.lIlIIlllllIl[7] = 0xA8 ^ 0xAE;
        aM.lIlIIlllllIl[8] = 0xAF ^ 0xA8;
        aM.lIlIIlllllIl[9] = 114 + 104 - 95 + 4 ^ (0xC1 ^ 0xB5);
        aM.lIlIIlllllIl[10] = 0x72 ^ 0x7A;
        aM.lIlIIlllllIl[11] = 0xB7 ^ 0xBE;
        aM.lIlIIlllllIl[12] = 0x98 ^ 0x92;
    }

    private static void llIllIllIllllI() {
        lIlIIlllllII = new String[lIlIIlllllIl[12]];
        aM.lIlIIlllllII[aM.lIlIIlllllIl[0]] = aM.llIllIllIllIll("ztpmAAPfUG6DRqZAn86atQ==", "eqbKp");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[1]] = aM.llIllIllIlllII("ERQ7PAgq", "BqZNk");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[4]] = aM.llIllIllIlllIl("OdHam3Xg36I=", "xqiFb");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[5]] = aM.llIllIllIlllII("HDIKAQ==", "HSadX");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[6]] = aM.llIllIllIlllII("Ey8lFw==", "GNNrZ");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[3]] = aM.llIllIllIlllIl("BsBFUIv2ai4=", "kDSrC");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[7]] = aM.llIllIllIllIll("9ONpBhVEHPg=", "ZeAyM");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[8]] = aM.llIllIllIlllIl("J0yj0ZHH32w=", "tdveA");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[10]] = aM.llIllIllIlllII("NAc3IAcbHXQqChAaIA==", "uiTIb");
        aM.lIlIIlllllII[aM.lIlIIlllllIl[11]] = aM.llIllIllIlllII("AQEIFhc6", "Rdidt");
    }

    @Inject
    protected aM(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIllIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        aM.llIllIllIlllll();
        aM.llIllIllIllllI();
    }

    private static boolean llIllIlllIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private boolean do() {
        int n2;
        Widget widget = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[1], (int)lIlIIlllllIl[9]);
        if (aM.llIllIlllIIIIl(widget) && aM.llIllIlllIIIII(widget.isVisible() ? 1 : 0)) {
            n2 = lIlIIlllllIl[1];
            "".length();
            if ((7 + 8 - 8 + 149 ^ 116 + 74 - 159 + 121) == " ".length()) {
                return (("  ".length() ^ (0x17 ^ 0x13)) & (0xA2 ^ 0xC6 ^ (0x57 ^ 0x35) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIIlllllIl[0];
        }
        return n2 != 0;
    }

    private static boolean llIllIlllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIllIlllII(String lllllllllllllllIllIlIllIIlllllll, String lllllllllllllllIllIlIllIIllllllI) {
        lllllllllllllllIllIlIllIIlllllll = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIllIlIIIIIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIllIlIIIIIIl = lllllllllllllllIllIlIllIIllllllI.toCharArray();
        int lllllllllllllllIllIlIllIlIIIIIII = lIlIIlllllIl[0];
        char[] lllllllllllllllIllIlIllIIllllIlI = lllllllllllllllIllIlIllIIlllllll.toCharArray();
        int lllllllllllllllIllIlIllIIllllIIl = lllllllllllllllIllIlIllIIllllIlI.length;
        int lllllllllllllllIllIlIllIIllllIII = lIlIIlllllIl[0];
        while (aM.llIllIlllIIllI(lllllllllllllllIllIlIllIIllllIII, lllllllllllllllIllIlIllIIllllIIl)) {
            char lllllllllllllllIllIlIllIlIIIIlIl = lllllllllllllllIllIlIllIIllllIlI[lllllllllllllllIllIlIllIIllllIII];
            lllllllllllllllIllIlIllIlIIIIIlI.append((char)(lllllllllllllllIllIlIllIlIIIIlIl ^ lllllllllllllllIllIlIllIlIIIIIIl[lllllllllllllllIllIlIllIlIIIIIII % lllllllllllllllIllIlIllIlIIIIIIl.length]));
            "".length();
            ++lllllllllllllllIllIlIllIlIIIIIII;
            ++lllllllllllllllIllIlIllIIllllIII;
            "".length();
            if (((17 + 54 - -66 + 24 ^ 31 + 104 - 51 + 54) & (135 + 8 - 67 + 81 ^ 25 + 5 - -19 + 133 ^ -" ".length())) == ((0x75 ^ 0x65 ^ (0x7B ^ 0x34)) & (239 + 172 - 205 + 41 ^ 145 + 47 - 154 + 130 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIllIlIIIIIlI);
    }

    private static boolean llIllIlllIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aM.llIllIlllIIIll(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dn() {
        void lllllllllllllllIllIlIllIlIIlIlII;
        void lllllllllllllllIllIlIllIlIIlIIll;
        Widget widget = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[0]);
        Widget widget2 = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[1]);
        Widget widget3 = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[4]);
        if (aM.llIllIlllIIIIl(widget)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[4]];
            if (aM.llIllIlllIIIII(widget.hasAction(stringArray) ? 1 : 0)) {
                widget.interact(lIlIIlllllII[lIlIIlllllIl[5]]);
                return lIlIIlllllIl[1];
            }
        }
        if (aM.llIllIlllIIIIl(lllllllllllllllIllIlIllIlIIlIIll)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[6]];
            if (aM.llIllIlllIIIII(lllllllllllllllIllIlIllIlIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                lllllllllllllllIllIlIllIlIIlIIll.interact(lIlIIlllllII[lIlIIlllllIl[3]]);
                return lIlIIlllllIl[1];
            }
        }
        if (aM.llIllIlllIIIIl(lllllllllllllllIllIlIllIlIIlIlII)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[7]];
            if (aM.llIllIlllIIIII(lllllllllllllllIllIlIllIlIIlIlII.hasAction(stringArray) ? 1 : 0)) {
                lllllllllllllllIllIlIllIlIIlIlII.interact(lIlIIlllllII[lIlIIlllllIl[8]]);
                return lIlIIlllllIl[1];
            }
        }
        this.ea.b(lIlIIlllllIl[1]);
        return lIlIIlllllIl[0];
    }

    private static boolean llIllIlllIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIllIlllIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        aM lllllllllllllllIllIlIllIlIIllIll;
        if (aM.llIllIlllIIIII(this.eb.pause() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIIII(lllllllllllllllIllIlIllIlIIllIll.ea.G() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIlII(lllllllllllllllIllIlIllIlIIllIll.ec.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        lllllllllllllllIllIlIllIlIIllIll.bS = Players.getLocal();
        if (aM.llIllIlllIIIll(lllllllllllllllIllIlIllIlIIllIll.bS)) {
            return lIlIIlllllIl[0];
        }
        if (!aM.llIllIlllIIlIl((Object)u.bh(), (Object)w.GET_OUT) || aM.llIllIlllIIIII(lllllllllllllllIllIlIllIlIIllIll.bS.getPlane())) {
            return lIlIIlllllIl[0];
        }
        return this.cg();
    }

    private static String llIllIllIllIll(String lllllllllllllllIllIlIllIIllIllll, String lllllllllllllllIllIlIllIIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIllIIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIllIIlllIIIl.init(lIlIIlllllIl[4], lllllllllllllllIllIlIllIIlllIIlI);
            return new String(lllllllllllllllIllIlIllIIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllIIlllIIII) {
            lllllllllllllllIllIlIllIIlllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlllIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aM lllllllllllllllIllIlIllIlIlIIlll;
        TileObject lllllllllllllllIllIlIllIlIlIIllI;
        if (aM.llIllIlllIIIII(this.do() ? 1 : 0)) {
            return this.dn();
        }
        if (aM.llIllIlllIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (aM.llIllIlllIIIIl(lllllllllllllllIllIlIllIlIlIIllI = lllllllllllllllIllIlIllIlIlIIlll.dq()) && aM.llIllIlllIIIlI(lllllllllllllllIllIlIllIlIlIIllI.getWorldY(), lllllllllllllllIllIlIllIlIlIIlll.bS.getWorldY())) {
            lllllllllllllllIllIlIllIlIlIIllI.interact(lIlIIlllllII[lIlIIlllllIl[0]]);
            return lIlIIlllllIl[1];
        }
        TileObject lllllllllllllllIllIlIllIlIlIIlIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aM.llIllIlllIIIII(tileObject.getName().equals(lIlIIlllllII[lIlIIlllllIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlllllIl[1]];
                stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[11]];
                if (aM.llIllIlllIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlllllIl[1];
                    "".length();
                    if ("   ".length() >= "   ".length()) return n2 != 0;
                    return ((30 + 6 - -73 + 109 ^ 127 + 41 - 153 + 130) & (0x88 ^ 0x8C ^ (0xF9 ^ 0xB6) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIlllllIl[0];
            return n2 != 0;
        });
        if (aM.llIllIlllIIIll(lllllllllllllllIllIlIllIlIlIIlIl)) {
            return lIlIIlllllIl[0];
        }
        var2_2.interact(lIlIIlllllII[lIlIIlllllIl[1]]);
        return lIlIIlllllIl[1];
    }

    private static String llIllIllIlllIl(String lllllllllllllllIllIlIllIIllIIIlI, String lllllllllllllllIllIlIllIIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIIlIlllll.getBytes(StandardCharsets.UTF_8)), lIlIIlllllIl[10]), "DES");
            Cipher lllllllllllllllIllIlIllIIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIlIllIIllIIlII.init(lIlIIlllllIl[4], lllllllllllllllIllIlIllIIllIIlIl);
            return new String(lllllllllllllllIllIlIllIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllIIllIIIll) {
            lllllllllllllllIllIlIllIIllIIIll.printStackTrace();
            return null;
        }
    }
}

