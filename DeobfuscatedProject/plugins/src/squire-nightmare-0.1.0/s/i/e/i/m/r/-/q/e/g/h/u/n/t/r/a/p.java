/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gg.squire.api.combat.CombatOptions
 *  javax.annotation.Nullable
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.query.results.WidgetQueryResults
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.m;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.n;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.q;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.r;

public final class p {
    private static final /* synthetic */ int bV;
    private static final /* synthetic */ int bW;
    private static final /* synthetic */ int bY;
    private static final /* synthetic */ int bZ;
    private static final /* synthetic */ int bX;
    private static final /* synthetic */ int ca;
    private static /* synthetic */ int[] llllIIIIlIIl;
    private static /* synthetic */ String[] llllIIIIlIII;
    private static final /* synthetic */ int bU;

    /*
     * WARNING - void declaration
     */
    private double bA() {
        double d2;
        block5: {
            void lllllllllllllllIIllIIIIlIllIIIll;
            block4: {
                d2 = 0.2;
                if (p.lIIIlllIlIlIlIl(CombatOptions.getSpecialAttackEnergy(), llllIIIIlIIl[14])) {
                    return 0.0;
                }
                int[] nArray = new int[llllIIIIlIIl[5]];
                nArray[p.llllIIIIlIIl[2]] = llllIIIIlIIl[15];
                if (!p.lIIIlllIlIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[llllIIIIlIIl[5]];
                nArray2[p.llllIIIIlIIl[2]] = llllIIIIlIIl[16];
                if (!p.lIIIlllIlIllIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            return (double)(lllllllllllllllIIllIIIIlIllIIIll * 2.0);
        }
        return d2;
    }

    public static boolean bw() {
        boolean bl;
        if (p.lIIIlllIlIlIlIl(Vars.getVarp((int)llllIIIIlIIl[10]), llllIIIIlIIl[5])) {
            bl = llllIIIIlIIl[5];
            "".length();
            if (null != null) {
                return ((0x60 ^ 0x4D) & ~(0x40 ^ 0x6D)) != 0;
            }
        } else {
            bl = llllIIIIlIIl[2];
        }
        return bl;
    }

    public static boolean bv() {
        int n2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        return Arrays.stream(Static.getClient().getEnum(llllIIIIlIIl[9]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (p.lIIIlllIlIlIlIl(n3, n2)) {
                bl = llllIIIIlIIl[5];
                "".length();
                if (" ".length() > " ".length()) {
                    return ((0xC8 ^ 0x9B ^ (0xF6 ^ 0xA1)) & (18 + 81 - 21 + 96 ^ 10 + 101 - -52 + 7 ^ -" ".length())) != 0;
                }
            } else {
                bl = llllIIIIlIIl[2];
            }
            return bl;
        });
    }

    private static boolean lIIIlllIlIllIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIlIllIIl(int n2) {
        return n2 == 0;
    }

    public static boolean w(boolean bl) {
        Widget lllllllllllllllIIllIIIIlIllIIlIl;
        if (p.lIIIlllIlIlIlIl(bl ? 1 : 0, p.bt() ? 1 : 0)) {
            return llllIIIIlIIl[5];
        }
        if (p.lIIIlllIlIllIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
            Tabs.open((Tab)Tab.COMBAT);
        }
        if (p.lIIIlllIlIllIlI(lllllllllllllllIIllIIIIlIllIIlIl = p.bu())) {
            boolean lllllllllllllllIIllIIIIlIllIIllI;
            lllllllllllllllIIllIIIIlIllIIlIl.interact(llllIIIIlIII[llllIIIIlIIl[2]]);
            return Time.sleepUntil(() -> {
                boolean bl2;
                if (p.lIIIlllIlIlIlIl(p.bt() ? 1 : 0, lllllllllllllllIIllIIIIlIllIIllI ? 1 : 0)) {
                    bl2 = llllIIIIlIIl[5];
                    "".length();
                    if (-" ".length() >= ((92 + 63 - 25 + 33 ^ 110 + 83 - 171 + 117) & (0xB9 ^ 0x87 ^ (0x27 ^ 0x31) ^ -" ".length()))) {
                        return ((0xCF ^ 0xB6 ^ (0x9C ^ 0xAB)) & (0x92 ^ 0xC7 ^ (0x6A ^ 0x71) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llllIIIIlIIl[2];
                }
                return bl2;
            }, (int)Rand.nextInt((int)llllIIIIlIIl[6], (int)llllIIIIlIIl[7]));
        }
        return llllIIIIlIIl[2];
    }

    public static List<o> a(boolean bl, Skill ... skillArray) {
        ArrayList arrayList = Lists.newArrayList((Object[])skillArray);
        r r2 = p.bs();
        if (p.lIIIlllIlIlIllI((Object)r2)) {
            return Collections.emptyList();
        }
        Stream<o> stream = Arrays.stream(r2.bE());
        return stream.filter(Objects::nonNull).filter(o2 -> {
            if (p.lIIIlllIlIllIll(bl ? 1 : 0)) {
                Stream<Skill> stream = Arrays.stream(o2.bo());
                List list2 = arrayList;
                Objects.requireNonNull(list2);
                "".length();
                return stream.anyMatch(list2::contains);
            }
            Stream<Skill> stream = Arrays.stream(o2.bo());
            List list3 = arrayList;
            Objects.requireNonNull(list3);
            "".length();
            return stream.allMatch(list3::contains);
        }).collect(Collectors.toList());
    }

    private static void lIIIlllIlIlIIll() {
        llllIIIIlIII = new String[llllIIIIlIIl[17]];
        p.llllIIIIlIII[p.llllIIIIlIIl[2]] = p.lIIIlllIlIlIIlI("nVRFoHIY2SuhmKKMlksYBA==", "KXPkA");
        p.llllIIIIlIII[p.llllIIIIlIIl[5]] = p.lIIIlllIlIlIIlI("A1IOib5LHaP+RToRSWhJ6Q==", "bxuIk");
    }

    public static List<o> a(q ... qArray) {
        r r2 = p.bs();
        if (p.lIIIlllIlIlIllI((Object)r2)) {
            return Collections.emptyList();
        }
        Stream<o> stream = Arrays.stream(r2.bE());
        return stream.filter(Objects::nonNull).filter(o2 -> Arrays.stream(qArray).anyMatch(q2 -> {
            boolean bl;
            if (p.lIIIlllIlIlllII(q2, (Object)o2.bl())) {
                bl = llllIIIIlIIl[5];
                "".length();
                if (((0x26 ^ 0x69) & ~(0xB ^ 0x44)) > ((0x48 ^ 0x7E) & ~(0x92 ^ 0xA4))) {
                    return ((0xF6 ^ 0xB8) & ~(0x10 ^ 0x5E)) != 0;
                }
            } else {
                bl = llllIIIIlIIl[2];
            }
            return bl;
        })).collect(Collectors.toList());
    }

    public static List<o> a(n ... nArray) {
        r r2 = p.bs();
        if (p.lIIIlllIlIlIllI((Object)r2)) {
            return Collections.emptyList();
        }
        Stream<o> stream = Arrays.stream(r2.bE());
        return stream.filter(Objects::nonNull).filter(o2 -> Arrays.stream(nArray).anyMatch(n2 -> {
            boolean bl;
            if (p.lIIIlllIlIlllII(n2, (Object)o2.bm())) {
                bl = llllIIIIlIIl[5];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = llllIIIIlIIl[2];
            }
            return bl;
        })).collect(Collectors.toList());
    }

    public static List<o> br() {
        r r2 = p.bs();
        if (p.lIIIlllIlIlIllI((Object)r2)) {
            return Collections.emptyList();
        }
        Stream<o> stream = Arrays.stream(r2.bE());
        return stream.filter(Objects::nonNull).collect(Collectors.toList());
    }

    private static Widget bu() {
        int[] nArray = new int[llllIIIIlIIl[5]];
        nArray[p.llllIIIIlIIl[2]] = llllIIIIlIIl[2];
        String[] stringArray = new String[llllIIIIlIIl[5]];
        stringArray[p.llllIIIIlIIl[2]] = llllIIIIlIII[llllIIIIlIIl[5]];
        return (Widget)((WidgetQueryResults)Widgets.query((int)llllIIIIlIIl[8]).types(nArray).actions(stringArray).results()).first();
    }

    public static List<o> a(m ... mArray) {
        r r2 = p.bs();
        if (p.lIIIlllIlIlIllI((Object)r2)) {
            return Collections.emptyList();
        }
        Stream<o> stream = Arrays.stream(r2.bE());
        return stream.filter(Objects::nonNull).filter(o2 -> Arrays.stream(mArray).anyMatch(m2 -> {
            boolean bl;
            if (p.lIIIlllIlIlllII(m2, (Object)o2.bn())) {
                bl = llllIIIIlIIl[5];
                "".length();
                if (" ".length() < 0) {
                    return ((0xB7 ^ 0x8E) & ~(0x96 ^ 0xAF)) != 0;
                }
            } else {
                bl = llllIIIIlIIl[2];
            }
            return bl;
        })).collect(Collectors.toList());
    }

    public static int by() {
        int n2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        int n3 = Static.getClient().getEnum(llllIIIIlIIl[9]).getIntValue(n2);
        return n3 / llllIIIIlIIl[12];
    }

    private double bB() {
        return (double)(llllIIIIlIIl[14] - p.bx()) / this.bA();
    }

    private static boolean lIIIlllIlIlllII(Object object, Object object2) {
        return object == object2;
    }

    public static boolean bt() {
        boolean bl;
        if (p.lIIIlllIlIllIIl(Vars.getVarp((int)llllIIIIlIIl[4]))) {
            bl = llllIIIIlIIl[5];
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0xE1 ^ 0x8B ^ (0x78 ^ 0x3D)) & (0xB8 ^ 0xB1 ^ (0x9E ^ 0xB8) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIIIIlIIl[2];
        }
        return bl;
    }

    public static int bx() {
        return Vars.getVarp((int)llllIIIIlIIl[11]) / llllIIIIlIIl[12];
    }

    private static String lIIIlllIlIlIIlI(String lllllllllllllllIIllIIIIlIlIIIIll, String lllllllllllllllIIllIIIIlIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIlIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIlIlIIIlIl.init(llllIIIIlIIl[17], lllllllllllllllIIllIIIIlIlIIIllI);
            return new String(lllllllllllllllIIllIIIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIlIlIIIlII) {
            lllllllllllllllIIllIIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static String bz() {
        int n2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        return Static.getClient().getEnum(llllIIIIlIIl[13]).getStringValue(n2);
    }

    private static void lIIIlllIlIlIlII() {
        llllIIIIlIIl = new int[18];
        p.llllIIIIlIIl[0] = 0x12 ^ 0x39;
        p.llllIIIIlIIl[1] = -" ".length();
        p.llllIIIIlIIl[2] = (0x4D ^ 0x14) & ~(0xDC ^ 0x85);
        p.llllIIIIlIIl[3] = -(0xFFFFEEFB & 0x7D17) & (0xFFFFFD77 & 0x6FFF);
        p.llllIIIIlIIl[4] = (0x17 ^ 0x7F) + (0xFB ^ 0x80) - (0xF3 ^ 0xAD) + (0x42 ^ 0x65);
        p.llllIIIIlIIl[5] = " ".length();
        p.llllIIIIlIIl[6] = -(0xFFFF995F & 0x76AB) & (0xFFFFF6FE & 0x1DBB);
        p.llllIIIIlIIl[7] = 0xFFFFBF48 & 0x47BF;
        p.llllIIIIlIIl[8] = -(0xFFFFFF5F & 0x29A7) & (0xFFFFBF77 & 0x6BDF);
        p.llllIIIIlIIl[9] = 0xFFFFFFAB & 0x3DE;
        p.llllIIIIlIIl[10] = -(0xFFFFEB5B & 0x1EF5) & (0xFFFFEB7D & 0x1FFF);
        p.llllIIIIlIIl[11] = 0xFFFFC56E & 0x3BBD;
        p.llllIIIIlIIl[12] = 0x34 ^ 0x3E;
        p.llllIIIIlIIl[13] = -(0xFFFFF845 & 0x77BF) & (0xFFFFFECF & 0x77FF);
        p.llllIIIIlIIl[14] = 43 + 174 - 185 + 196 ^ 13 + 57 - -5 + 53;
        p.llllIIIIlIIl[15] = -(0xFFFF9A03 & 0x7FFD) & (0xFFFFFF77 & Short.MAX_VALUE);
        p.llllIIIIlIIl[16] = -(0xFFFFF1F2 & 0xF0F) & (0xFFFFFDDF & 0x6FFF);
        p.llllIIIIlIIl[17] = "  ".length();
    }

    public static List<o> a(Skill ... skillArray) {
        return p.a(llllIIIIlIIl[2], skillArray);
    }

    private static boolean lIIIlllIlIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIlIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        p.lIIIlllIlIlIlII();
        p.lIIIlllIlIlIIll();
        bW = llllIIIIlIIl[13];
        bZ = llllIIIIlIIl[11];
        ca = llllIIIIlIIl[10];
        bX = llllIIIIlIIl[9];
        bU = llllIIIIlIIl[0];
        bV = llllIIIIlIIl[4];
        bY = llllIIIIlIIl[3];
    }

    /*
     * WARNING - void declaration
     */
    public static o bq() {
        void var1_1;
        int n2 = Vars.getVarp((int)llllIIIIlIIl[0]);
        if (p.lIIIlllIlIlIlIl(n2, llllIIIIlIIl[1])) {
            return null;
        }
        r lllllllllllllllIIllIIIIllIIlIIll = p.bs();
        if (p.lIIIlllIlIlIllI((Object)lllllllllllllllIIllIIIIllIIlIIll)) {
            return null;
        }
        return var1_1.bE()[n2];
    }

    private static boolean lIIIlllIlIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIlIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static r bs() {
        int n2 = Vars.getBit((int)llllIIIIlIIl[3]);
        if (p.lIIIlllIlIlIlll(n2, llllIIIIlIIl[1])) {
            void lllllllllllllllIIllIIIIlIllIlIll;
            r[] rArray = r.values();
            int n3 = rArray.length;
            int lllllllllllllllIIllIIIIlIllIlIlI = llllIIIIlIIl[2];
            while (p.lIIIlllIlIllIII(lllllllllllllllIIllIIIIlIllIlIlI, (int)lllllllllllllllIIllIIIIlIllIlIll)) {
                void lllllllllllllllIIllIIIIlIllIllIl;
                void lllllllllllllllIIllIIIIlIllIllII;
                void lllllllllllllllIIllIIIIlIllIlIIl = lllllllllllllllIIllIIIIlIllIllII[lllllllllllllllIIllIIIIlIllIlIlI];
                if (p.lIIIlllIlIlIlIl((int)lllllllllllllllIIllIIIIlIllIllIl, lllllllllllllllIIllIIIIlIllIlIIl.bD())) {
                    return lllllllllllllllIIllIIIIlIllIlIIl;
                }
                ++lllllllllllllllIIllIIIIlIllIlIlI;
                "".length();
                if ((8 + 23 - -31 + 70 ^ 88 + 22 - 79 + 97) > ((0xAC ^ 0xA6 ^ (0x50 ^ 0x18)) & (61 + 178 - -2 + 9 ^ 120 + 162 - 247 + 149 ^ -" ".length()))) continue;
                return null;
            }
        }
        return null;
    }
}

