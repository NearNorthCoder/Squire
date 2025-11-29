package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/f.class */
public class C0009f {
    private final /* synthetic */ ItemManager bt;
    private static final /* synthetic */ Logger bo;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ SquireNightmarePlugin bq;
    private final /* synthetic */ SquireNightmareConfig bp;
    private static /* synthetic */ String[] llllIIlIlIlI;
    private final /* synthetic */ C0008e br;
    private final /* synthetic */ int bs = llllIIlIlIll[0];
    public /* synthetic */ boolean bu = llllIIlIlIll[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public C0009f(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e, ItemManager itemManager) {
        this.bp = squireNightmareConfig;
        this.bq = squireNightmarePlugin;
        this.br = c0008e;
        this.bt = itemManager;
    }

    private static void lIIIlllllIIllIl() {
        llllIIlIlIll = new int[23];
        llllIIlIlIll[0] = ((((219 + 122) - 205) + 84) ^ (((79 + 127) - 163) + 94)) & (((1 ^ 6) ^ (93 ^ 15)) ^ (-" ".length()));
        llllIIlIlIll[1] = " ".length();
        llllIIlIlIll[2] = "  ".length();
        llllIIlIlIll[3] = "   ".length();
        llllIIlIlIll[4] = 90 ^ 94;
        llllIIlIlIll[5] = (((89 + 91) - 91) + 59) ^ (((39 + 0) - 33) + 139);
        llllIIlIlIll[6] = (198 ^ 142) ^ (50 ^ 124);
        llllIIlIlIll[7] = (4 ^ 0) ^ "   ".length();
        llllIIlIlIll[8] = 67 ^ 75;
        llllIIlIlIll[9] = 180 ^ 189;
        llllIIlIlIll[10] = (36 ^ 89) ^ (202 ^ 189);
        llllIIlIlIll[11] = 63 ^ 52;
        llllIIlIlIll[12] = (((39 + 7) - 24) + 117) ^ (((121 + 21) - 132) + 125);
        llllIIlIlIll[13] = "  ".length() ^ (56 ^ 55);
        llllIIlIlIll[14] = (35 ^ 24) ^ ((35 ^ 64) & ((216 ^ 187) ^ (-1)));
        llllIIlIlIll[15] = 251 ^ 180;
        llllIIlIlIll[16] = (3 ^ 95) ^ (146 ^ 175);
        llllIIlIlIll[17] = 77 ^ 102;
        llllIIlIlIll[18] = 14 ^ 0;
        llllIIlIlIll[19] = 11 ^ 4;
        llllIIlIlIll[20] = 99 ^ 115;
        llllIIlIlIll[21] = (59 ^ 16) ^ (118 ^ 76);
        llllIIlIlIll[22] = (121 ^ 4) ^ (124 ^ 19);
    }

    private static String lIIIlllllIIlIlI(String lllllllllllllllIIlIllllIIIIllIIl, String lllllllllllllllIIlIllllIIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIIIIllIII.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[8]), "DES");
            Cipher lllllllllllllllIIlIllllIIIIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllllIIIIllIll.init(llllIIlIlIll[2], lllllllllllllllIIlIllllIIIIlllII);
            return new String(lllllllllllllllIIlIllllIIIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIIIIllIlI) {
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
        lIIIlllllIIllIl();
        lIIIlllllIIllII();
        bo = LoggerFactory.getLogger(C0009f.class);
    }

    private static boolean lIIIlllllIlIIIl(int i) {
        return i == 0;
    }

    public SquireNightmareConfig ag() {
        return this.bp;
    }

    public String toString() {
        return "AttackManager(config=" + ag() + ", plugin=" + aB() + ", areaManager=" + aC() + ", lastAttack=" + t() + ", itemManager=" + L() + ", isMidFinalPhaseAttack=" + aD() + ")";
    }

    private static boolean lIIIlllllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlllllIIlIIl(String lllllllllllllllIIlIlllIlllllllII, String lllllllllllllllIIlIlllIllllllIll) {
        String lllllllllllllllIIlIlllIlllllllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIllllllIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlllIllllllIIl = lllllllllllllllIIlIlllIllllllIll.toCharArray();
        int lllllllllllllllIIlIlllIllllllIII = llllIIlIlIll[0];
        char[] charArray = lllllllllllllllIIlIlllIlllllllII2.toCharArray();
        int length = charArray.length;
        int i = llllIIlIlIll[0];
        while (lIIIlllllIlIllI(i, length)) {
            char lllllllllllllllIIlIlllIlllllllIl = charArray[i];
            lllllllllllllllIIlIlllIllllllIlI.append((char) (lllllllllllllllIIlIlllIlllllllIl ^ lllllllllllllllIIlIlllIllllllIIl[lllllllllllllllIIlIlllIllllllIII % lllllllllllllllIIlIlllIllllllIIl.length]));
            "".length();
            lllllllllllllllIIlIlllIllllllIII++;
            i++;
            "".length();
            if ((-((((165 + 143) - 240) + 110) ^ (((175 + 0) - 7) + 14))) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlllIllllllIlI);
    }

    public SquireNightmarePlugin aB() {
        return this.bq;
    }

    private static void lIIIlllllIIllII() {
        llllIIlIlIlI = new String[llllIIlIlIll[22]];
        llllIIlIlIlI[llllIIlIlIll[0]] = lIIIlllllIIlIIl("BgMTJzkWTQYqdRUEHCF1Ek0QNzAETQYqdRUfFyB1Bh1SMTpTABMuMFMfHSo4UwsdN3UAGhM1e1MfFzY6ARkbKzJTGR1lJQEMCyAnUx0dMSZTAgBlNxIBHzZ1HQIFa3td", "smrEU");
        llllIIlIlIlI[llllIIlIlIll[1]] = lIIIlllllIIlIlI("25nTy1x6AdvwNj4lW0N9aOgmuH5h5hUiLEklud3o8MuMU5xa4CfYeRl0yYheOfF1FVaIx9Z2lJ8=", "YnMhD");
        llllIIlIlIlI[llllIIlIlIll[2]] = lIIIlllllIIlIlI("z4DtKhFrbEWIX2bIM0OBvcveFgC+qaf8cNwnHatrtHUIPC3MRr7pFAPkmW8pdGouLPkVgPdNxuPLuSW9ycRqUQ==", "jVvEZ");
        llllIIlIlIlI[llllIIlIlIll[3]] = lIIIlllllIIlIlI("BkbdQ2NX1qHYd3bi0ee2Hg==", "oOHCg");
        llllIIlIlIlI[llllIIlIlIll[4]] = lIIIlllllIIlIlI("p1LdvCfljVI=", "dCnaF");
        llllIIlIlIlI[llllIIlIlIll[5]] = lIIIlllllIIlIIl("BysBGRwnMBoFHmQ9HB4LZCocBBsqIQAYWSUqF0sKITAHAhcjZAoEDDZkBxkQICEdH1kwK1MnNgoDISo3AwFdSzsFAFMpNh1kNSQrZAo8P1kWATIvMAoDUz8xAWQ0PjAAAVI=", "DDsky");
        llllIIlIlIlI[llllIIlIlIll[6]] = lIIIlllllIIlIlI("BRGf72fYZ7NkqtWAu7Y9Iw==", "IuBuA");
        llllIIlIlIlI[llllIIlIlIll[7]] = lIIIlllllIIlIlI("HzSU0gHF8mA2OhSQmicKk0R42nJoRLbyyrSIZfiwt3KTFI5eF/x2xZBpkRKUSdDfN/bIVuY92Vks/d+4K7Acn51Ec3NKSVL8", "fRBYa");
        llllIIlIlIlI[llllIIlIlIll[8]] = lIIIlllllIIlIlI("tQRXY0H+bDc=", "IgwVC");
        llllIIlIlIlI[llllIIlIlIll[9]] = lIIIlllllIIlIlI("YszIZtqIa8kVwuQZEyJTCKptET+YOpbClBQS+3qC0SqrC4VLcTKs+sFWPiARbkKKagcy2XyK+fu5uRIsIGuz0g==", "CXrIq");
        llllIIlIlIlI[llllIIlIlIll[10]] = lIIIlllllIIlIIl("FTINDzc1dw8TMT0=", "XWifB");
        llllIIlIlIlI[llllIIlIlIll[11]] = lIIIlllllIIlIlI("B4PnxzfR2pNuhSpp55VDsCRvKUyhjtvWiQoXEVoJhrRc/OxxfnkbXg==", "wozLj");
        llllIIlIlIlI[llllIIlIlIll[12]] = lIIIlllllIIlIIl("Cjk/CSEg", "KMKhB");
        llllIIlIlIlI[llllIIlIlIll[13]] = lIIIlllllIIlIll("cR0SD3kbiHE=", "netIE");
        llllIIlIlIlI[llllIIlIlIll[18]] = lIIIlllllIIlIIl("Gyc4PC8ZdSkqPgI6Nw==", "kUYEJ");
        llllIIlIlIlI[llllIIlIlIll[19]] = lIIIlllllIIlIlI("AMjaKCIvLGQ=", "EUaun");
        llllIIlIlIlI[llllIIlIlIll[20]] = lIIIlllllIIlIll("ayp/i/wAH0c=", "ckNNV");
        llllIIlIlIlI[llllIIlIlIll[21]] = lIIIlllllIIlIlI("EwdgQc9u7rk=", "ZBzNQ");
    }

    private static boolean lIIIlllllIlIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if (lIIIlllllIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:
        if (lIIIlllllIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bf, code lost:
        if (lIIIlllllIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0231, code lost:
        if (lIIIlllllIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllllIlIlII(obj, this)) {
            return llllIIlIlIll[1];
        }
        if (lIIIlllllIlIIIl(obj instanceof C0009f ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        C0009f c0009f = (C0009f) obj;
        if (!lIIIlllllIlIIIl(c0009f.a(this) ? 1 : 0) && !lIIIlllllIlIlIl(t(), c0009f.t())) {
            if (lIIIlllllIlIlIl(aD() ? 1 : 0, c0009f.aD() ? 1 : 0)) {
                return llllIIlIlIll[0];
            }
            SquireNightmareConfig ag = ag();
            SquireNightmareConfig ag2 = c0009f.ag();
            if (lIIIlllllIIlllI(ag)) {
                if (lIIIlllllIIllll(ag2)) {
                    "".length();
                    if (0 != 0) {
                        return ((79 ^ 87) ^ (208 ^ 140)) & (((51 ^ 112) ^ (81 ^ 86)) ^ (-" ".length()));
                    }
                    return llllIIlIlIll[0];
                }
                SquireNightmarePlugin aB = aB();
                SquireNightmarePlugin aB2 = c0009f.aB();
                if (lIIIlllllIIlllI(aB)) {
                    if (lIIIlllllIIllll(aB2)) {
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return ((((130 + 71) - 112) + 71) ^ (((63 + 126) - 120) + 86)) & (((((81 + 7) - 23) + 119) ^ (((74 + 38) - 11) + 30)) ^ (-" ".length()));
                        }
                        return llllIIlIlIll[0];
                    }
                    C0008e aC = aC();
                    C0008e aC2 = c0009f.aC();
                    if (lIIIlllllIIlllI(aC)) {
                        if (lIIIlllllIIllll(aC2)) {
                            "".length();
                            if ((((((176 + 25) - 88) + 120) ^ (((104 + 34) - 131) + 177)) & (((209 ^ 161) ^ (46 ^ 15)) ^ (-" ".length()))) > "   ".length()) {
                                return ((192 ^ 142) ^ (237 ^ 157)) & (((((16 + 3) - (-50)) + 90) ^ (((16 + 38) - 50) + 157)) ^ (-" ".length()));
                            }
                            return llllIIlIlIll[0];
                        }
                        ItemManager L = L();
                        ItemManager L2 = c0009f.L();
                        if (lIIIlllllIIlllI(L)) {
                            if (lIIIlllllIIllll(L2)) {
                                "".length();
                                if ((-((((83 + 125) - 113) + 75) ^ (((30 + 168) - 185) + 161))) >= 0) {
                                    return ((50 ^ 90) ^ (75 ^ 51)) & (((90 ^ 49) ^ (54 ^ 77)) ^ (-" ".length()));
                                }
                                return llllIIlIlIll[0];
                            }
                            return llllIIlIlIll[1];
                        }
                    }
                }
            }
        }
        return llllIIlIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean a(NPC npc, EquipmentSetup equipmentSetup) {
        if (!lIIIlllllIIllll(npc) || lIIIlllllIlIIII(npc.isDead() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        if (lIIIlllllIIllll(equipmentSetup) && lIIIlllllIlIIIl(equipmentSetup.isFullyEquipped() ? 1 : 0)) {
            if (lIIIlllllIlIIII(Inventory.isFull() ? 1 : 0) && lIIIlllllIIllll(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIIIlllllIlIIlI(equipmentSetup.get(EquipmentInventorySlot.SHIELD))) {
                aA();
                "".length();
            }
            equipmentSetup.swap();
        }
        Widget widget = Widgets.get(WidgetInfo.COMBAT_STYLE_FOUR);
        Widget widget2 = Widgets.get(WidgetInfo.COMBAT_STYLE_TWO);
        if (lIIIlllllIlIIII(EnumC0020q.LONGRANGE.bk() ? 1 : 0) && lIIIlllllIlIIIl(EnumC0020q.LONGRANGE.bj() ? 1 : 0) && ((!lIIIlllllIlIIll(C0019p.bs(), EnumC0021r.TRIDENT_WEAPON) || lIIIlllllIlIlII(C0019p.bs(), EnumC0021r.TYPE_28)) && lIIIlllllIIllll(widget))) {
            Tabs.open(Tab.COMBAT);
            Log.warn(llllIIlIlIlI[llllIIlIlIll[5]]);
            widget.interact(llllIIlIlIlI[llllIIlIlIll[6]]);
        }
        if (lIIIlllllIlIIII(EnumC0020q.RAPID.bk() ? 1 : 0) && lIIIlllllIlIIIl(EnumC0020q.RAPID.bj() ? 1 : 0) && lIIIlllllIIllll(widget2)) {
            Tabs.open(Tab.COMBAT);
            Log.warn(llllIIlIlIlI[llllIIlIlIll[7]]);
            widget2.interact(llllIIlIlIlI[llllIIlIlIll[8]]);
        }
        if (lIIIlllllIlIIII(EnumC0020q.MEDIUM_FUSE.bk() ? 1 : 0) && lIIIlllllIlIIIl(EnumC0020q.MEDIUM_FUSE.bj() ? 1 : 0) && lIIIlllllIIllll(widget2)) {
            Tabs.open(Tab.COMBAT);
            Log.warn(llllIIlIlIlI[llllIIlIlIll[9]]);
            widget2.interact(llllIIlIlIlI[llllIIlIlIll[10]]);
        }
        if (lIIIlllllIlIIIl(C0008e.ax().isEmpty() ? 1 : 0)) {
            List<WorldArea> ax = C0008e.ax();
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIIIlllllIlIIII(ax.stream().anyMatch(worldArea -> {
                return worldArea.contains(worldLocation);
            }) ? 1 : 0)) {
                Log.info(llllIIlIlIlI[llllIIlIlIll[11]]);
                return llllIIlIlIll[0];
            }
        }
        if (lIIIlllllIlIlII(Players.getLocal().getInteracting(), npc)) {
            return llllIIlIlIll[0];
        }
        String[] strArr = new String[llllIIlIlIll[2]];
        strArr[llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[12]];
        strArr[llllIIlIlIll[1]] = llllIIlIlIlI[llllIIlIlIll[13]];
        npc.interact(strArr);
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIlIIlI(int i) {
        return i <= 0;
    }

    public ItemManager L() {
        return this.bt;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0009f;
    }

    private static boolean lIIIlllllIIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllllIlIIII(int i) {
        return i != 0;
    }

    public C0008e aC() {
        return this.br;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    public boolean aA() {
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llllIIlIlIll[1]];
            strArr[llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[21]];
            return item.hasAction(strArr);
        });
        if (lIIIlllllIIlllI(first)) {
            Item first2 = Inventory.getFirst(item2 -> {
                return item2.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[20]]);
            });
            if (lIIIlllllIIllll(first2)) {
                first2.drop();
                return llllIIlIlIll[1];
            }
            Log.warn(llllIIlIlIlI[llllIIlIlIll[0]]);
            Item first3 = Inventory.getFirst(item3 -> {
                if (!lIIIlllllIlIIIl(item3.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[18]]) ? 1 : 0) || lIIIlllllIlIIII(item3.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[19]]) ? 1 : 0)) {
                    ?? r0 = llllIIlIlIll[1];
                    "".length();
                    return (((((146 + 177) - 141) + 7) ^ (((75 + 129) - 159) + 91)) & (((((108 + 114) - 164) + 105) ^ (((72 + 128) - 165) + 115)) ^ (-" ".length()))) < 0 ? ((((89 + 58) - (-33)) + 10) ^ (((36 + 14) - (-65)) + 19)) & (((80 ^ 75) ^ (177 ^ 146)) ^ (-" ".length())) : r0;
                }
                return llllIIlIlIll[0];
            });
            if (lIIIlllllIIllll(first3)) {
                first3.drop();
                return llllIIlIlIll[1];
            }
            Log.error(llllIIlIlIlI[llllIIlIlIll[1]]);
            return llllIIlIlIll[0];
        }
        String str = llllIIlIlIlI[llllIIlIlIll[2]];
        Object[] objArr = new Object[llllIIlIlIll[1]];
        objArr[llllIIlIlIll[0]] = first.getName();
        Log.info(str, objArr);
        if (lIIIlllllIlIIII(first.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[3]]) ? 1 : 0)) {
            first.interact(llllIIlIlIlI[llllIIlIlIll[4]]);
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            first.drop();
        }
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i2 = llllIIlIlIll[14];
        int t = ((llllIIlIlIll[1] * llllIIlIlIll[14]) + t()) * llllIIlIlIll[14];
        if (lIIIlllllIlIIII(aD() ? 1 : 0)) {
            i = llllIIlIlIll[15];
            "".length();
            if (0 != 0) {
                return (24 ^ 14) & ((138 ^ 156) ^ (-1));
            }
        } else {
            i = llllIIlIlIll[16];
        }
        int lllllllllllllllIIlIllllIIIlIIlll = t + i;
        SquireNightmareConfig ag = ag();
        int i3 = lllllllllllllllIIlIllllIIIlIIlll * llllIIlIlIll[14];
        if (lIIIlllllIIlllI(ag)) {
            hashCode = llllIIlIlIll[17];
            "".length();
            if (" ".length() < ((153 ^ 184) & ((63 ^ 30) ^ (-1)))) {
                return (24 ^ 17) & ((50 ^ 59) ^ (-1));
            }
        } else {
            hashCode = ag.hashCode();
        }
        int lllllllllllllllIIlIllllIIIlIIlll2 = i3 + hashCode;
        SquireNightmarePlugin aB = aB();
        int i4 = lllllllllllllllIIlIllllIIIlIIlll2 * llllIIlIlIll[14];
        if (lIIIlllllIIlllI(aB)) {
            hashCode2 = llllIIlIlIll[17];
            "".length();
            if (((131 ^ 161) & ((36 ^ 6) ^ (-1))) > ((41 ^ 33) & ((174 ^ 166) ^ (-1)))) {
                return (7 ^ 51) & ((101 ^ 81) ^ (-1));
            }
        } else {
            hashCode2 = aB.hashCode();
        }
        int lllllllllllllllIIlIllllIIIlIIlll3 = i4 + hashCode2;
        C0008e aC = aC();
        int i5 = lllllllllllllllIIlIllllIIIlIIlll3 * llllIIlIlIll[14];
        if (lIIIlllllIIlllI(aC)) {
            hashCode3 = llllIIlIlIll[17];
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return ((174 ^ 160) ^ (160 ^ 138)) & (((14 ^ 122) ^ (56 ^ 104)) ^ (-" ".length()));
            }
        } else {
            hashCode3 = aC.hashCode();
        }
        int lllllllllllllllIIlIllllIIIlIIlll4 = i5 + hashCode3;
        ItemManager L = L();
        int i6 = lllllllllllllllIIlIllllIIIlIIlll4 * llllIIlIlIll[14];
        if (lIIIlllllIIlllI(L)) {
            hashCode4 = llllIIlIlIll[17];
            "".length();
            if ((((184 ^ 181) ^ (132 ^ 187)) & (((200 ^ 154) ^ (58 ^ 90)) ^ (-" ".length()))) < (((((118 + 30) - (-68)) + 35) ^ (((48 + 133) - 125) + 108)) & (((57 ^ 32) ^ (84 ^ 18)) ^ (-" ".length())))) {
                return ((((91 + 167) - 108) + 46) ^ (((145 + 118) - 156) + 47)) & (((203 ^ 160) ^ (24 ^ 45)) ^ (-" ".length()));
            }
        } else {
            hashCode4 = L.hashCode();
        }
        return i6 + hashCode4;
    }

    public void u(boolean z) {
        this.bu = z;
    }

    private static boolean lIIIlllllIlIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIlllllIlIlIl(int i, int i2) {
        return i != i2;
    }

    private static String lIIIlllllIIlIll(String lllllllllllllllIIlIllllIIIIIllII, String lllllllllllllllIIlIllllIIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIIIIIlllI.init(llllIIlIlIll[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIIIIIllIl) {
            lllllllllllllllIIlIllllIIIIIllIl.printStackTrace();
            return null;
        }
    }
}
