/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.q;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.r;

@Singleton
public class f {
    private final /* synthetic */ ItemManager bt;
    private static final /* synthetic */ Logger bo;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ SquireNightmarePlugin bq;
    private final /* synthetic */ SquireNightmareConfig bp;
    private final /* synthetic */ int bs = 0;
    private static /* synthetic */ String[] llllIIlIlIlI;
    private final /* synthetic */ e br;
    public /* synthetic */ boolean bu;

    @Inject
    public f(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2, ItemManager itemManager) {
        this.bs = llllIIlIlIll[0];
        this.bu = llllIIlIlIll[0];
        this.bp = squireNightmareConfig;
        this.bq = squireNightmarePlugin;
        this.br = e2;
        this.bt = itemManager;
    }

    private static void lIIIlllllIIllIl() {
        llllIIlIlIll = new int[23];
        f.llllIIlIlIll[0] = (219 + 122 - 205 + 84 ^ 79 + 127 - 163 + 94) & (1 ^ 6 ^ (0x5D ^ 0xF) ^ -" ".length());
        f.llllIIlIlIll[1] = " ".length();
        f.llllIIlIlIll[2] = "  ".length();
        f.llllIIlIlIll[3] = "   ".length();
        f.llllIIlIlIll[4] = 0x5A ^ 0x5E;
        f.llllIIlIlIll[5] = 89 + 91 - 91 + 59 ^ 39 + 0 - 33 + 139;
        f.llllIIlIlIll[6] = 0xC6 ^ 0x8E ^ (0x32 ^ 0x7C);
        f.llllIIlIlIll[7] = 4 ^ 0 ^ "   ".length();
        f.llllIIlIlIll[8] = 0x43 ^ 0x4B;
        f.llllIIlIlIll[9] = 0xB4 ^ 0xBD;
        f.llllIIlIlIll[10] = 0x24 ^ 0x59 ^ (0xCA ^ 0xBD);
        f.llllIIlIlIll[11] = 0x3F ^ 0x34;
        f.llllIIlIlIll[12] = 39 + 7 - 24 + 117 ^ 121 + 21 - 132 + 125;
        f.llllIIlIlIll[13] = "  ".length() ^ (0x38 ^ 0x37);
        f.llllIIlIlIll[14] = 0x23 ^ 0x18 ^ (0x23 ^ 0x40) & ~(0xD8 ^ 0xBB);
        f.llllIIlIlIll[15] = 0xFB ^ 0xB4;
        f.llllIIlIlIll[16] = 3 ^ 0x5F ^ (0x92 ^ 0xAF);
        f.llllIIlIlIll[17] = 0x4D ^ 0x66;
        f.llllIIlIlIll[18] = 0xE ^ 0;
        f.llllIIlIlIll[19] = 0xB ^ 4;
        f.llllIIlIlIll[20] = 0x63 ^ 0x73;
        f.llllIIlIlIll[21] = 0x3B ^ 0x10 ^ (0x76 ^ 0x4C);
        f.llllIIlIlIll[22] = 0x79 ^ 4 ^ (0x7C ^ 0x13);
    }

    private static String lIIIlllllIIlIlI(String lllllllllllllllIIlIllllIIIIlIlll, String lllllllllllllllIIlIllllIIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIIIIllIII.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[8]), "DES");
            Cipher lllllllllllllllIIlIllllIIIIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllllIIIIllIll.init(llllIIlIlIll[2], lllllllllllllllIIlIllllIIIIlllII);
            return new String(lllllllllllllllIIlIllllIIIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIIIIllIlI) {
            lllllllllllllllIIlIllllIIIIllIlI.printStackTrace();
            return null;
        }
    }

    public boolean aD() {
        return this.bu;
    }

    public int t() {
        Objects.requireNonNull(this);
        "".length();
        return llllIIlIlIll[0];
    }

    static {
        f.lIIIlllllIIllIl();
        f.lIIIlllllIIllII();
        bo = LoggerFactory.getLogger(f.class);
    }

    private static boolean lIIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    public SquireNightmareConfig ag() {
        return this.bp;
    }

    public String toString() {
        return "AttackManager(config=" + this.ag() + ", plugin=" + this.aB() + ", areaManager=" + this.aC() + ", lastAttack=" + this.t() + ", itemManager=" + this.L() + ", isMidFinalPhaseAttack=" + this.aD() + ")";
    }

    private static boolean lIIIlllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllllIIlIIl(String lllllllllllllllIIlIlllIlllllIlll, String lllllllllllllllIIlIlllIlllllIllI) {
        lllllllllllllllIIlIlllIlllllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIllllllIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlllIllllllIIl = lllllllllllllllIIlIlllIlllllIllI.toCharArray();
        int lllllllllllllllIIlIlllIllllllIII = llllIIlIlIll[0];
        char[] lllllllllllllllIIlIlllIlllllIIlI = lllllllllllllllIIlIlllIlllllIlll.toCharArray();
        int lllllllllllllllIIlIlllIlllllIIIl = lllllllllllllllIIlIlllIlllllIIlI.length;
        int lllllllllllllllIIlIlllIlllllIIII = llllIIlIlIll[0];
        while (f.lIIIlllllIlIllI(lllllllllllllllIIlIlllIlllllIIII, lllllllllllllllIIlIlllIlllllIIIl)) {
            char lllllllllllllllIIlIlllIlllllllIl = lllllllllllllllIIlIlllIlllllIIlI[lllllllllllllllIIlIlllIlllllIIII];
            lllllllllllllllIIlIlllIllllllIlI.append((char)(lllllllllllllllIIlIlllIlllllllIl ^ lllllllllllllllIIlIlllIllllllIIl[lllllllllllllllIIlIlllIllllllIII % lllllllllllllllIIlIlllIllllllIIl.length]));
            "".length();
            ++lllllllllllllllIIlIlllIllllllIII;
            ++lllllllllllllllIIlIlllIlllllIIII;
            "".length();
            if (-(165 + 143 - 240 + 110 ^ 175 + 0 - 7 + 14) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIllllllIlI);
    }

    public SquireNightmarePlugin aB() {
        return this.bq;
    }

    private static void lIIIlllllIIllII() {
        llllIIlIlIlI = new String[llllIIlIlIll[22]];
        f.llllIIlIlIlI[f.llllIIlIlIll[0]] = f.lIIIlllllIIlIIl("BgMTJzkWTQYqdRUEHCF1Ek0QNzAETQYqdRUfFyB1Bh1SMTpTABMuMFMfHSo4UwsdN3UAGhM1e1MfFzY6ARkbKzJTGR1lJQEMCyAnUx0dMSZTAgBlNxIBHzZ1HQIFa3td", "smrEU");
        f.llllIIlIlIlI[f.llllIIlIlIll[1]] = f.lIIIlllllIIlIlI("25nTy1x6AdvwNj4lW0N9aOgmuH5h5hUiLEklud3o8MuMU5xa4CfYeRl0yYheOfF1FVaIx9Z2lJ8=", "YnMhD");
        f.llllIIlIlIlI[f.llllIIlIlIll[2]] = f.lIIIlllllIIlIlI("z4DtKhFrbEWIX2bIM0OBvcveFgC+qaf8cNwnHatrtHUIPC3MRr7pFAPkmW8pdGouLPkVgPdNxuPLuSW9ycRqUQ==", "jVvEZ");
        f.llllIIlIlIlI[f.llllIIlIlIll[3]] = f.lIIIlllllIIlIlI("BkbdQ2NX1qHYd3bi0ee2Hg==", "oOHCg");
        f.llllIIlIlIlI[f.llllIIlIlIll[4]] = f.lIIIlllllIIlIlI("p1LdvCfljVI=", "dCnaF");
        f.llllIIlIlIlI[f.llllIIlIlIll[5]] = f.lIIIlllllIIlIIl("BysBGRwnMBoFHmQ9HB4LZCocBBsqIQAYWSUqF0sKITAHAhcjZAoEDDZkBxkQICEdH1kwK1MnNgoDISo3AwFdSzsFAFMpNh1kNSQrZAo8P1kWATIvMAoDUz8xAWQ0PjAAAVI=", "DDsky");
        f.llllIIlIlIlI[f.llllIIlIlIll[6]] = f.lIIIlllllIIlIlI("BRGf72fYZ7NkqtWAu7Y9Iw==", "IuBuA");
        f.llllIIlIlIlI[f.llllIIlIlIll[7]] = f.lIIIlllllIIlIlI("HzSU0gHF8mA2OhSQmicKk0R42nJoRLbyyrSIZfiwt3KTFI5eF/x2xZBpkRKUSdDfN/bIVuY92Vks/d+4K7Acn51Ec3NKSVL8", "fRBYa");
        f.llllIIlIlIlI[f.llllIIlIlIll[8]] = f.lIIIlllllIIlIlI("tQRXY0H+bDc=", "IgwVC");
        f.llllIIlIlIlI[f.llllIIlIlIll[9]] = f.lIIIlllllIIlIlI("YszIZtqIa8kVwuQZEyJTCKptET+YOpbClBQS+3qC0SqrC4VLcTKs+sFWPiARbkKKagcy2XyK+fu5uRIsIGuz0g==", "CXrIq");
        f.llllIIlIlIlI[f.llllIIlIlIll[10]] = f.lIIIlllllIIlIIl("FTINDzc1dw8TMT0=", "XWifB");
        f.llllIIlIlIlI[f.llllIIlIlIll[11]] = f.lIIIlllllIIlIlI("B4PnxzfR2pNuhSpp55VDsCRvKUyhjtvWiQoXEVoJhrRc/OxxfnkbXg==", "wozLj");
        f.llllIIlIlIlI[f.llllIIlIlIll[12]] = f.lIIIlllllIIlIIl("Cjk/CSEg", "KMKhB");
        f.llllIIlIlIlI[f.llllIIlIlIll[13]] = f.lIIIlllllIIlIll("cR0SD3kbiHE=", "netIE");
        f.llllIIlIlIlI[f.llllIIlIlIll[18]] = f.lIIIlllllIIlIIl("Gyc4PC8ZdSkqPgI6Nw==", "kUYEJ");
        f.llllIIlIlIlI[f.llllIIlIlIll[19]] = f.lIIIlllllIIlIlI("AMjaKCIvLGQ=", "EUaun");
        f.llllIIlIlIlI[f.llllIIlIlIll[20]] = f.lIIIlllllIIlIll("ayp/i/wAH0c=", "ckNNV");
        f.llllIIlIlIlI[f.llllIIlIlIll[21]] = f.lIIIlllllIIlIlI("EwdgQc9u7rk=", "ZBzNQ");
    }

    private static boolean lIIIlllllIlIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block35: {
            block36: {
                ItemManager lllllllllllllllIIlIllllIIIllIIIl;
                ItemManager lllllllllllllllIIlIllllIIIllIIlI;
                block34: {
                    f lllllllllllllllIIlIllllIIIlllIll;
                    f lllllllllllllllIIlIllllIIIlllIIl;
                    block32: {
                        block33: {
                            e lllllllllllllllIIlIllllIIIllIIll;
                            e lllllllllllllllIIlIllllIIIllIlII;
                            block31: {
                                block29: {
                                    block30: {
                                        SquireNightmarePlugin lllllllllllllllIIlIllllIIIllIlIl;
                                        SquireNightmarePlugin lllllllllllllllIIlIllllIIIllIllI;
                                        block28: {
                                            block26: {
                                                block27: {
                                                    SquireNightmareConfig lllllllllllllllIIlIllllIIIllIlll;
                                                    SquireNightmareConfig lllllllllllllllIIlIllllIIIlllIII;
                                                    block25: {
                                                        void lllllllllllllllIIlIllllIIIlllIlI;
                                                        if (f.lIIIlllllIlIlII(object, this)) {
                                                            return llllIIlIlIll[1];
                                                        }
                                                        if (f.lIIIlllllIlIIIl(lllllllllllllllIIlIllllIIIlllIlI instanceof f)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        lllllllllllllllIIlIllllIIIlllIIl = (f)lllllllllllllllIIlIllllIIIlllIlI;
                                                        if (f.lIIIlllllIlIIIl(lllllllllllllllIIlIllllIIIlllIIl.a(lllllllllllllllIIlIllllIIIlllIll) ? 1 : 0)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        if (f.lIIIlllllIlIlIl(lllllllllllllllIIlIllllIIIlllIll.t(), lllllllllllllllIIlIllllIIIlllIIl.t())) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        if (f.lIIIlllllIlIlIl(lllllllllllllllIIlIllllIIIlllIll.aD() ? 1 : 0, lllllllllllllllIIlIllllIIIlllIIl.aD() ? 1 : 0)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        lllllllllllllllIIlIllllIIIlllIII = lllllllllllllllIIlIllllIIIlllIll.ag();
                                                        lllllllllllllllIIlIllllIIIllIlll = lllllllllllllllIIlIllllIIIlllIIl.ag();
                                                        if (!f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIlllIII)) break block25;
                                                        if (!f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIIllIlll)) break block26;
                                                        "".length();
                                                        if (null != null) {
                                                            return ((0x4F ^ 0x57 ^ (0xD0 ^ 0x8C)) & (0x33 ^ 0x70 ^ (0x51 ^ 0x56) ^ -" ".length())) != 0;
                                                        }
                                                        break block27;
                                                    }
                                                    if (!f.lIIIlllllIlIIIl(lllllllllllllllIIlIllllIIIlllIII.equals(lllllllllllllllIIlIllllIIIllIlll) ? 1 : 0)) break block26;
                                                }
                                                return llllIIlIlIll[0];
                                            }
                                            lllllllllllllllIIlIllllIIIllIllI = lllllllllllllllIIlIllllIIIlllIll.aB();
                                            lllllllllllllllIIlIllllIIIllIlIl = lllllllllllllllIIlIllllIIIlllIIl.aB();
                                            if (!f.lIIIlllllIIlllI((Object)lllllllllllllllIIlIllllIIIllIllI)) break block28;
                                            if (!f.lIIIlllllIIllll((Object)lllllllllllllllIIlIllllIIIllIlIl)) break block29;
                                            "".length();
                                            if ("   ".length() <= "  ".length()) {
                                                return ((130 + 71 - 112 + 71 ^ 63 + 126 - 120 + 86) & (81 + 7 - 23 + 119 ^ 74 + 38 - 11 + 30 ^ -" ".length())) != 0;
                                            }
                                            break block30;
                                        }
                                        if (!f.lIIIlllllIlIIIl(((Object)((Object)lllllllllllllllIIlIllllIIIllIllI)).equals((Object)lllllllllllllllIIlIllllIIIllIlIl) ? 1 : 0)) break block29;
                                    }
                                    return llllIIlIlIll[0];
                                }
                                lllllllllllllllIIlIllllIIIllIlII = lllllllllllllllIIlIllllIIIlllIll.aC();
                                lllllllllllllllIIlIllllIIIllIIll = lllllllllllllllIIlIllllIIIlllIIl.aC();
                                if (!f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIllIlII)) break block31;
                                if (!f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIIllIIll)) break block32;
                                "".length();
                                if (((176 + 25 - 88 + 120 ^ 104 + 34 - 131 + 177) & (0xD1 ^ 0xA1 ^ (0x2E ^ 0xF) ^ -" ".length())) > "   ".length()) {
                                    return ((0xC0 ^ 0x8E ^ (0xED ^ 0x9D)) & (16 + 3 - -50 + 90 ^ 16 + 38 - 50 + 157 ^ -" ".length())) != 0;
                                }
                                break block33;
                            }
                            if (!f.lIIIlllllIlIIIl(((Object)lllllllllllllllIIlIllllIIIllIlII).equals(lllllllllllllllIIlIllllIIIllIIll) ? 1 : 0)) break block32;
                        }
                        return llllIIlIlIll[0];
                    }
                    lllllllllllllllIIlIllllIIIllIIlI = lllllllllllllllIIlIllllIIIlllIll.L();
                    lllllllllllllllIIlIllllIIIllIIIl = lllllllllllllllIIlIllllIIIlllIIl.L();
                    if (!f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIllIIlI)) break block34;
                    if (!f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIIllIIIl)) break block35;
                    "".length();
                    if (-(83 + 125 - 113 + 75 ^ 30 + 168 - 185 + 161) >= 0) {
                        return ((0x32 ^ 0x5A ^ (0x4B ^ 0x33)) & (0x5A ^ 0x31 ^ (0x36 ^ 0x4D) ^ -" ".length())) != 0;
                    }
                    break block36;
                }
                if (!f.lIIIlllllIlIIIl(lllllllllllllllIIlIllllIIIllIIlI.equals(lllllllllllllllIIlIllllIIIllIIIl) ? 1 : 0)) break block35;
            }
            return llllIIlIlIll[0];
        }
        return llllIIlIlIll[1];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(NPC nPC, EquipmentSetup equipmentSetup) {
        void lllllllllllllllIIlIllllIIlIIllII;
        void lllllllllllllllIIlIllllIIlIIlIll;
        if (!f.lIIIlllllIIllll(nPC) || f.lIIIlllllIlIIII(nPC.isDead() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        if (f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIlIIlIll) && f.lIIIlllllIlIIIl(lllllllllllllllIIlIllllIIlIIlIll.isFullyEquipped() ? 1 : 0)) {
            if (f.lIIIlllllIlIIII(Inventory.isFull() ? 1 : 0) && f.lIIIlllllIIllll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && f.lIIIlllllIlIIlI(lllllllllllllllIIlIllllIIlIIlIll.get(EquipmentInventorySlot.SHIELD))) {
                f lllllllllllllllIIlIllllIIlIIllIl;
                lllllllllllllllIIlIllllIIlIIllIl.aA();
                "".length();
            }
            lllllllllllllllIIlIllllIIlIIlIll.swap();
        }
        Widget lllllllllllllllIIlIllllIIlIIlIlI = Widgets.get((WidgetInfo)WidgetInfo.COMBAT_STYLE_FOUR);
        Widget lllllllllllllllIIlIllllIIlIIlIIl = Widgets.get((WidgetInfo)WidgetInfo.COMBAT_STYLE_TWO);
        if (f.lIIIlllllIlIIII(q.LONGRANGE.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.LONGRANGE.bj() ? 1 : 0) && (!f.lIIIlllllIlIIll((Object)p.bs(), (Object)r.TRIDENT_WEAPON) || f.lIIIlllllIlIlII((Object)p.bs(), (Object)r.TYPE_28)) && f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIlIIlIlI)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[5]]);
            lllllllllllllllIIlIllllIIlIIlIlI.interact(llllIIlIlIlI[llllIIlIlIll[6]]);
        }
        if (f.lIIIlllllIlIIII(q.RAPID.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.RAPID.bj() ? 1 : 0) && f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIlIIlIIl)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[7]]);
            lllllllllllllllIIlIllllIIlIIlIIl.interact(llllIIlIlIlI[llllIIlIlIll[8]]);
        }
        if (f.lIIIlllllIlIIII(q.MEDIUM_FUSE.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.MEDIUM_FUSE.bj() ? 1 : 0) && f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIlIIlIIl)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[9]]);
            lllllllllllllllIIlIllllIIlIIlIIl.interact(llllIIlIlIlI[llllIIlIlIll[10]]);
        }
        if (f.lIIIlllllIlIIIl(e.ax().isEmpty() ? 1 : 0)) {
            List<WorldArea> lllllllllllllllIIlIllllIIlIIlIII = e.ax();
            WorldPoint lllllllllllllllIIlIllllIIlIIIlll = Players.getLocal().getWorldLocation();
            if (f.lIIIlllllIlIIII(lllllllllllllllIIlIllllIIlIIlIII.stream().anyMatch(worldArea -> worldArea.contains(lllllllllllllllIIlIllllIIlIIIlll)) ? 1 : 0)) {
                Log.info((String)llllIIlIlIlI[llllIIlIlIll[11]]);
                return llllIIlIlIll[0];
            }
        }
        if (f.lIIIlllllIlIlII(Players.getLocal().getInteracting(), lllllllllllllllIIlIllllIIlIIllII)) {
            return llllIIlIlIll[0];
        }
        String[] stringArray = new String[llllIIlIlIll[2]];
        stringArray[f.llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[12]];
        stringArray[f.llllIIlIlIll[1]] = llllIIlIlIlI[llllIIlIlIll[13]];
        nPC.interact(stringArray);
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIlIIlI(int n2) {
        return n2 <= 0;
    }

    public ItemManager L() {
        return this.bt;
    }

    protected boolean a(Object object) {
        return object instanceof f;
    }

    private static boolean lIIIlllllIIllll(Object object) {
        return object != null;
    }

    private static boolean lIIIlllllIlIIII(int n2) {
        return n2 != 0;
    }

    public e aC() {
        return this.br;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aA() {
        void lllllllllllllllIIlIllllIIlIlIlll;
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIlIlIll[1]];
            stringArray[f.llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[21]];
            return item.hasAction(stringArray);
        });
        if (f.lIIIlllllIIlllI(item2)) {
            Item item3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[20]]));
            if (f.lIIIlllllIIllll(item3)) {
                item3.drop();
                return llllIIlIlIll[1];
            }
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[0]]);
            Item lllllllllllllllIIlIllllIIlIlIlIl = Inventory.getFirst(item -> {
                boolean bl;
                if (!f.lIIIlllllIlIIIl(item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[18]]) ? 1 : 0) || f.lIIIlllllIlIIII(item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[19]]) ? 1 : 0)) {
                    bl = llllIIlIlIll[1];
                    "".length();
                    if (((146 + 177 - 141 + 7 ^ 75 + 129 - 159 + 91) & (108 + 114 - 164 + 105 ^ 72 + 128 - 165 + 115 ^ -" ".length())) < 0) {
                        return ((89 + 58 - -33 + 10 ^ 36 + 14 - -65 + 19) & (0x50 ^ 0x4B ^ (0xB1 ^ 0x92) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = llllIIlIlIll[0];
                }
                return bl;
            });
            if (f.lIIIlllllIIllll(lllllllllllllllIIlIllllIIlIlIlIl)) {
                lllllllllllllllIIlIllllIIlIlIlIl.drop();
                return llllIIlIlIll[1];
            }
            Log.error((String)llllIIlIlIlI[llllIIlIlIll[1]]);
            return llllIIlIlIll[0];
        }
        Object[] objectArray = new Object[llllIIlIlIll[1]];
        objectArray[f.llllIIlIlIll[0]] = lllllllllllllllIIlIllllIIlIlIlll.getName();
        Log.info((String)llllIIlIlIlI[llllIIlIlIll[2]], (Object[])objectArray);
        if (f.lIIIlllllIlIIII(lllllllllllllllIIlIllllIIlIlIlll.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[3]]) ? 1 : 0)) {
            lllllllllllllllIIlIllllIIlIlIlll.interact(llllIIlIlIlI[llllIIlIlIll[4]]);
            "".length();
            if (((0x87 ^ 0x83) & ~(0x9D ^ 0x99)) != 0) {
                return ((0xA3 ^ 0x90) & ~(0x96 ^ 0xA5)) != 0;
            }
        } else {
            lllllllllllllllIIlIllllIIlIlIlll.drop();
        }
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIIlllI(Object object) {
        return object == null;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        f lllllllllllllllIIlIllllIIIlIlIIl;
        int n6;
        int n7 = llllIIlIlIll[14];
        int n8 = llllIIlIlIll[1];
        n8 = n8 * llllIIlIlIll[14] + this.t();
        int n9 = n8 * llllIIlIlIll[14];
        if (f.lIIIlllllIlIIII(this.aD() ? 1 : 0)) {
            n6 = llllIIlIlIll[15];
            "".length();
            if (null != null) {
                return (0x18 ^ 0xE) & ~(0x8A ^ 0x9C);
            }
        } else {
            n6 = llllIIlIlIll[16];
        }
        int lllllllllllllllIIlIllllIIIlIIlll = n9 + n6;
        SquireNightmareConfig lllllllllllllllIIlIllllIIIlIIllI = lllllllllllllllIIlIllllIIIlIlIIl.ag();
        int n10 = lllllllllllllllIIlIllllIIIlIIlll * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIlIIllI)) {
            n5 = llllIIlIlIll[17];
            "".length();
            if (" ".length() < ((0x99 ^ 0xB8) & ~(0x3F ^ 0x1E))) {
                return (0x18 ^ 0x11) & ~(0x32 ^ 0x3B);
            }
        } else {
            n5 = lllllllllllllllIIlIllllIIIlIIllI.hashCode();
        }
        lllllllllllllllIIlIllllIIIlIIlll = n10 + n5;
        SquireNightmarePlugin lllllllllllllllIIlIllllIIIlIIlIl = lllllllllllllllIIlIllllIIIlIlIIl.aB();
        int n11 = lllllllllllllllIIlIllllIIIlIIlll * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI((Object)lllllllllllllllIIlIllllIIIlIIlIl)) {
            n4 = llllIIlIlIll[17];
            "".length();
            if (((0x83 ^ 0xA1) & ~(0x24 ^ 6)) > ((0x29 ^ 0x21) & ~(0xAE ^ 0xA6))) {
                return (7 ^ 0x33) & ~(0x65 ^ 0x51);
            }
        } else {
            n4 = ((Object)((Object)lllllllllllllllIIlIllllIIIlIIlIl)).hashCode();
        }
        lllllllllllllllIIlIllllIIIlIIlll = n11 + n4;
        e lllllllllllllllIIlIllllIIIlIIlII = lllllllllllllllIIlIllllIIIlIlIIl.aC();
        int n12 = lllllllllllllllIIlIllllIIIlIIlll * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIlIIlII)) {
            n3 = llllIIlIlIll[17];
            "".length();
            if (-" ".length() != -" ".length()) {
                return (0xAE ^ 0xA0 ^ (0xA0 ^ 0x8A)) & (0xE ^ 0x7A ^ (0x38 ^ 0x68) ^ -" ".length());
            }
        } else {
            n3 = ((Object)lllllllllllllllIIlIllllIIIlIIlII).hashCode();
        }
        lllllllllllllllIIlIllllIIIlIIlll = n12 + n3;
        ItemManager lllllllllllllllIIlIllllIIIlIIIll = lllllllllllllllIIlIllllIIIlIlIIl.L();
        int n13 = lllllllllllllllIIlIllllIIIlIIlll * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(lllllllllllllllIIlIllllIIIlIIIll)) {
            n2 = llllIIlIlIll[17];
            "".length();
            if (((0xB8 ^ 0xB5 ^ (0x84 ^ 0xBB)) & (0xC8 ^ 0x9A ^ (0x3A ^ 0x5A) ^ -" ".length())) < ((118 + 30 - -68 + 35 ^ 48 + 133 - 125 + 108) & (0x39 ^ 0x20 ^ (0x54 ^ 0x12) ^ -" ".length()))) {
                return (91 + 167 - 108 + 46 ^ 145 + 118 - 156 + 47) & (0xCB ^ 0xA0 ^ (0x18 ^ 0x2D) ^ -" ".length());
            }
        } else {
            n2 = lllllllllllllllIIlIllllIIIlIIIll.hashCode();
        }
        n8 = n13 + n2;
        return n8;
    }

    public void u(boolean bl) {
        this.bu = bl;
    }

    private static boolean lIIIlllllIlIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlllllIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIlllllIIlIll(String lllllllllllllllIIlIllllIIIIIlIlI, String lllllllllllllllIIlIllllIIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIIIIIlllI.init(llllIIlIlIll[2], lllllllllllllllIIlIllllIIIIIllll);
            return new String(lllllllllllllllIIlIllllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIIIIIllIl) {
            lllllllllllllllIIlIllllIIIIIllIl.printStackTrace();
            return null;
        }
    }
}

