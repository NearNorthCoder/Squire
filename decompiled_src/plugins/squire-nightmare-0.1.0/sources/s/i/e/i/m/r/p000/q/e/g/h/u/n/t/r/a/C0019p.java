package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.common.collect.Lists;
import gg.squire.api.combat.CombatOptions;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.query.results.WidgetQueryResults;
import net.unethicalite.api.query.widgets.WidgetQuery;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/p.class */
public final class C0019p {
    private static final /* synthetic */ int bV;
    private static final /* synthetic */ int bW;
    private static final /* synthetic */ int bY;
    private static final /* synthetic */ int bZ;
    private static final /* synthetic */ int bX;
    private static final /* synthetic */ int ca;
    private static /* synthetic */ int[] llllIIIIlIIl;
    private static /* synthetic */ String[] llllIIIIlIII;
    private static final /* synthetic */ int bU;

    private double bA() {
        if (lIIIlllIlIlIlIl(CombatOptions.getSpecialAttackEnergy(), llllIIIIlIIl[14])) {
            return 0.0d;
        }
        int[] iArr = new int[llllIIIIlIIl[5]];
        iArr[llllIIIIlIIl[2]] = llllIIIIlIIl[15];
        if (lIIIlllIlIllIIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIIIIlIIl[5]];
            iArr2[llllIIIIlIIl[2]] = llllIIIIlIIl[16];
            if (!lIIIlllIlIllIll(Equipment.contains(iArr2) ? 1 : 0)) {
                return 0.2d;
            }
        }
        return 0.2d * 2.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean bw() {
        if (lIIIlllIlIlIlIl(Vars.getVarp(llllIIIIlIIl[10]), llllIIIIlIIl[5])) {
            ?? r0 = llllIIIIlIIl[5];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIIIlIIl[2];
    }

    public static boolean bv() {
        int id = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
        return Arrays.stream(Static.getClient().getEnum(llllIIIIlIIl[9]).getKeys()).anyMatch(i -> {
            if (lIIIlllIlIlIlIl(i, id)) {
                ?? r0 = llllIIIIlIIl[5];
                "".length();
                return " ".length() > " ".length() ? ((200 ^ 155) ^ (246 ^ 161)) & (((((18 + 81) - 21) + 96) ^ (((10 + 101) - (-52)) + 7)) ^ (-" ".length())) : r0;
            }
            return llllIIIIlIIl[2];
        });
    }

    private static boolean lIIIlllIlIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIlIllIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public static boolean w(boolean z) {
        if (lIIIlllIlIlIlIl(z ? 1 : 0, bt() ? 1 : 0)) {
            return llllIIIIlIIl[5];
        }
        if (lIIIlllIlIllIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
            Tabs.open(Tab.COMBAT);
        }
        Widget bu = bu();
        if (lIIIlllIlIllIlI(bu)) {
            bu.interact(llllIIIIlIII[llllIIIIlIIl[2]]);
            return Time.sleepUntil(() -> {
                if (lIIIlllIlIlIlIl(bt() ? 1 : 0, z ? 1 : 0)) {
                    ?? r0 = llllIIIIlIIl[5];
                    "".length();
                    return (-" ".length()) >= (((((92 + 63) - 25) + 33) ^ (((110 + 83) - 171) + 117)) & (((185 ^ 135) ^ (39 ^ 49)) ^ (-" ".length()))) ? ((207 ^ 182) ^ (156 ^ 171)) & (((146 ^ 199) ^ (106 ^ 113)) ^ (-" ".length())) : r0;
                }
                return llllIIIIlIIl[2];
            }, Rand.nextInt(llllIIIIlIIl[6], llllIIIIlIIl[7]));
        }
        return llllIIIIlIIl[2];
    }

    public static List<C0018o> a(boolean z, Skill... skillArr) {
        ArrayList newArrayList = Lists.newArrayList(skillArr);
        EnumC0021r bs = bs();
        return lIIIlllIlIlIllI(bs) ? Collections.emptyList() : (List) Arrays.stream(bs.bE()).filter((v0) -> {
            return Objects.nonNull(v0);
        }).filter(c0018o -> {
            if (lIIIlllIlIllIll(z ? 1 : 0)) {
                Stream stream = Arrays.stream(c0018o.bo());
                Objects.requireNonNull(newArrayList);
                "".length();
                return stream.anyMatch((v1) -> {
                    return r1.contains(v1);
                });
            }
            Stream stream2 = Arrays.stream(c0018o.bo());
            Objects.requireNonNull(newArrayList);
            "".length();
            return stream2.allMatch((v1) -> {
                return r1.contains(v1);
            });
        }).collect(Collectors.toList());
    }

    private static void lIIIlllIlIlIIll() {
        llllIIIIlIII = new String[llllIIIIlIIl[17]];
        llllIIIIlIII[llllIIIIlIIl[2]] = lIIIlllIlIlIIlI("nVRFoHIY2SuhmKKMlksYBA==", "KXPkA");
        llllIIIIlIII[llllIIIIlIIl[5]] = lIIIlllIlIlIIlI("A1IOib5LHaP+RToRSWhJ6Q==", "bxuIk");
    }

    public static List<C0018o> a(EnumC0020q... enumC0020qArr) {
        EnumC0021r bs = bs();
        return lIIIlllIlIlIllI(bs) ? Collections.emptyList() : (List) Arrays.stream(bs.bE()).filter((v0) -> {
            return Objects.nonNull(v0);
        }).filter(c0018o -> {
            return Arrays.stream(enumC0020qArr).anyMatch(enumC0020q -> {
                if (lIIIlllIlIlllII(enumC0020q, c0018o.bl())) {
                    ?? r0 = llllIIIIlIIl[5];
                    "".length();
                    return ((38 ^ 105) & ((11 ^ 68) ^ (-1))) > ((72 ^ 126) & ((146 ^ 164) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIIlIIl[2];
            });
        }).collect(Collectors.toList());
    }

    public static List<C0018o> a(EnumC0017n... enumC0017nArr) {
        EnumC0021r bs = bs();
        return lIIIlllIlIlIllI(bs) ? Collections.emptyList() : (List) Arrays.stream(bs.bE()).filter((v0) -> {
            return Objects.nonNull(v0);
        }).filter(c0018o -> {
            return Arrays.stream(enumC0017nArr).anyMatch(enumC0017n -> {
                if (lIIIlllIlIlllII(enumC0017n, c0018o.bm())) {
                    ?? r0 = llllIIIIlIIl[5];
                    "".length();
                    return "   ".length() != "   ".length() ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                }
                return llllIIIIlIIl[2];
            });
        }).collect(Collectors.toList());
    }

    public static List<C0018o> br() {
        EnumC0021r bs = bs();
        return lIIIlllIlIlIllI(bs) ? Collections.emptyList() : (List) Arrays.stream(bs.bE()).filter((v0) -> {
            return Objects.nonNull(v0);
        }).collect(Collectors.toList());
    }

    private static Widget bu() {
        WidgetQuery query = Widgets.query(llllIIIIlIIl[8]);
        int[] iArr = new int[llllIIIIlIIl[5]];
        iArr[llllIIIIlIIl[2]] = llllIIIIlIIl[2];
        WidgetQuery types = query.types(iArr);
        String[] strArr = new String[llllIIIIlIIl[5]];
        strArr[llllIIIIlIIl[2]] = llllIIIIlIII[llllIIIIlIIl[5]];
        return (Widget) ((WidgetQueryResults) types.actions(strArr).results()).first();
    }

    public static List<C0018o> a(EnumC0016m... enumC0016mArr) {
        EnumC0021r bs = bs();
        return lIIIlllIlIlIllI(bs) ? Collections.emptyList() : (List) Arrays.stream(bs.bE()).filter((v0) -> {
            return Objects.nonNull(v0);
        }).filter(c0018o -> {
            return Arrays.stream(enumC0016mArr).anyMatch(enumC0016m -> {
                if (lIIIlllIlIlllII(enumC0016m, c0018o.bn())) {
                    ?? r0 = llllIIIIlIIl[5];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIIlIIl[2];
            });
        }).collect(Collectors.toList());
    }

    public static int by() {
        return Static.getClient().getEnum(llllIIIIlIIl[9]).getIntValue(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId()) / llllIIIIlIIl[12];
    }

    private double bB() {
        return (llllIIIIlIIl[14] - bx()) / bA();
    }

    private static boolean lIIIlllIlIlllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean bt() {
        if (lIIIlllIlIllIIl(Vars.getVarp(llllIIIIlIIl[4]))) {
            ?? r0 = llllIIIIlIIl[5];
            "".length();
            return (-" ".length()) > "  ".length() ? ((225 ^ 139) ^ (120 ^ 61)) & (((184 ^ 177) ^ (158 ^ 184)) ^ (-" ".length())) : r0;
        }
        return llllIIIIlIIl[2];
    }

    public static int bx() {
        return Vars.getVarp(llllIIIIlIIl[11]) / llllIIIIlIIl[12];
    }

    private static String lIIIlllIlIlIIlI(String lllllllllllllllIIllIIIIlIlIIIIll, String lllllllllllllllIIllIIIIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIlIIl[17], lllllllllllllllIIllIIIIlIlIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIlIlIIIlII) {
            lllllllllllllllIIllIIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static String bz() {
        return Static.getClient().getEnum(llllIIIIlIIl[13]).getStringValue(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId());
    }

    private static void lIIIlllIlIlIlII() {
        llllIIIIlIIl = new int[18];
        llllIIIIlIIl[0] = 18 ^ 57;
        llllIIIIlIIl[1] = -" ".length();
        llllIIIIlIIl[2] = (77 ^ 20) & ((220 ^ 133) ^ (-1));
        llllIIIIlIIl[3] = (-((-4357) & 32023)) & (-649) & 28671;
        llllIIIIlIIl[4] = (((23 ^ 127) + (251 ^ 128)) - (243 ^ 173)) + (66 ^ 101);
        llllIIIIlIIl[5] = " ".length();
        llllIIIIlIIl[6] = (-((-26273) & 30379)) & (-2306) & 7611;
        llllIIIIlIIl[7] = (-16568) & 18367;
        llllIIIIlIIl[8] = (-((-161) & 10663)) & (-16521) & 27615;
        llllIIIIlIIl[9] = (-85) & 990;
        llllIIIIlIIl[10] = (-((-5285) & 7925)) & (-5251) & 8191;
        llllIIIIlIIl[11] = (-14994) & 15293;
        llllIIIIlIIl[12] = 52 ^ 62;
        llllIIIIlIIl[13] = (-((-1979) & 30655)) & (-305) & 30719;
        llllIIIIlIIl[14] = (((43 + 174) - 185) + 196) ^ (((13 + 57) - (-5)) + 53);
        llllIIIIlIIl[15] = (-((-26109) & 32765)) & (-137) & 32767;
        llllIIIIlIIl[16] = (-((-3598) & 3855)) & (-545) & 28671;
        llllIIIIlIIl[17] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public static List<C0018o> a(Skill... skillArr) {
        return a((boolean) llllIIIIlIIl[2], skillArr);
    }

    private static boolean lIIIlllIlIllIll(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIlIlIlIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIIIlllIlIlIlII();
        lIIIlllIlIlIIll();
        bW = llllIIIIlIIl[13];
        bZ = llllIIIIlIIl[11];
        ca = llllIIIIlIIl[10];
        bX = llllIIIIlIIl[9];
        bU = llllIIIIlIIl[0];
        bV = llllIIIIlIIl[4];
        bY = llllIIIIlIIl[3];
    }

    public static C0018o bq() {
        int varp = Vars.getVarp(llllIIIIlIIl[0]);
        if (lIIIlllIlIlIlIl(varp, llllIIIIlIIl[1])) {
            return null;
        }
        EnumC0021r bs = bs();
        if (lIIIlllIlIlIllI(bs)) {
            return null;
        }
        return bs.bE()[varp];
    }

    private static boolean lIIIlllIlIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlllIlIlIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIlIlIlll(int i, int i2) {
        return i != i2;
    }

    @Nullable
    public static EnumC0021r bs() {
        int bit = Vars.getBit(llllIIIIlIIl[3]);
        if (lIIIlllIlIlIlll(bit, llllIIIIlIIl[1])) {
            EnumC0021r[] values = EnumC0021r.values();
            int length = values.length;
            int i = llllIIIIlIIl[2];
            while (lIIIlllIlIllIII(i, length)) {
                EnumC0021r enumC0021r = values[i];
                if (lIIIlllIlIlIlIl(bit, enumC0021r.bD())) {
                    return enumC0021r;
                }
                i++;
                "".length();
                if (((((8 + 23) - (-31)) + 70) ^ (((88 + 22) - 79) + 97)) <= (((172 ^ 166) ^ (80 ^ 24)) & (((((61 + 178) - (-2)) + 9) ^ (((120 + 162) - 247) + 149)) ^ (-" ".length())))) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
