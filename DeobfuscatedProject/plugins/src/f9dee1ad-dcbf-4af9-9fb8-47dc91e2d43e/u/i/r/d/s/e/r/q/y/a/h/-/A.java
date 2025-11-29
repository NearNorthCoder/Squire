/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.c;
import u.i.r.d.s.e.r.q.y.a.h.-.y;

@TaskDesc(name="Looting Items", priority=10, blocking=true, register=true)
public class A
extends Task {
    private static /* synthetic */ int[] llllIIIlllll;
    private final /* synthetic */ SquireAlchemicalHydraConfig ba;
    private final /* synthetic */ Set<TileItem> bb;
    private final /* synthetic */ a aY;
    private final /* synthetic */ c aZ;
    private static /* synthetic */ String[] llllIIIllllI;

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem tileItem = itemDespawned.getItem();
        if (A.lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7])) {
            this.bb.clear();
        }
    }

    private static boolean lIIIllllIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIllIllI(Object object) {
        return object == null;
    }

    private static String lIIIllllIlIllII(String lllllllllllllllIIlIlIlllIIIIllIl, String lllllllllllllllIIlIlIlllIIIlIIIl) {
        lllllllllllllllIIlIlIlllIIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlllIIIlIIII = new StringBuilder();
        char[] lllllllllllllllIIlIlIlllIIIIllll = lllllllllllllllIIlIlIlllIIIlIIIl.toCharArray();
        int lllllllllllllllIIlIlIlllIIIIlllI = llllIIIlllll[0];
        char[] lllllllllllllllIIlIlIlllIIIIlIII = lllllllllllllllIIlIlIlllIIIIllIl.toCharArray();
        int lllllllllllllllIIlIlIlllIIIIIlll = lllllllllllllllIIlIlIlllIIIIlIII.length;
        int lllllllllllllllIIlIlIlllIIIIIllI = llllIIIlllll[0];
        while (A.lIIIllllIllIlII(lllllllllllllllIIlIlIlllIIIIIllI, lllllllllllllllIIlIlIlllIIIIIlll)) {
            char lllllllllllllllIIlIlIlllIIIlIIll = lllllllllllllllIIlIlIlllIIIIlIII[lllllllllllllllIIlIlIlllIIIIIllI];
            lllllllllllllllIIlIlIlllIIIlIIII.append((char)(lllllllllllllllIIlIlIlllIIIlIIll ^ lllllllllllllllIIlIlIlllIIIIllll[lllllllllllllllIIlIlIlllIIIIlllI % lllllllllllllllIIlIlIlllIIIIllll.length]));
            "".length();
            ++lllllllllllllllIIlIlIlllIIIIlllI;
            ++lllllllllllllllIIlIlIlllIIIIIllI;
            "".length();
            if (" ".length() != "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIlllIIIlIIII);
    }

    private static boolean lIIIllllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIllllIlIlllI(String lllllllllllllllIIlIlIlllIIlIIIII, String lllllllllllllllIIlIlIlllIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIlllll[15]), "DES");
            Cipher lllllllllllllllIIlIlIlllIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlllIIlIIlII.init(llllIIIlllll[5], lllllllllllllllIIlIlIlllIIlIIlIl);
            return new String(lllllllllllllllIIlIlIlllIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllIIlIIIll) {
            lllllllllllllllIIlIlIlllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllllIlIllll() {
        llllIIIllllI = new String[llllIIIlllll[27]];
        A.llllIIIllllI[A.llllIIIlllll[0]] = A.lIIIllllIlIllII("Azcu", "FVZvd");
        A.llllIIIllllI[A.llllIIIlllll[3]] = A.lIIIllllIlIllIl("qviA5M7Ht3s=", "ZlaNt");
        A.llllIIIllllI[A.llllIIIlllll[5]] = A.lIIIllllIlIllII("IQoy", "dkFzT");
        A.llllIIIllllI[A.llllIIIlllll[6]] = A.lIIIllllIlIllII("HCA4JA==", "XRWTx");
        A.llllIIIllllI[A.llllIIIlllll[8]] = A.lIIIllllIlIllIl("YxwUG4i9Kig=", "QVzZl");
        A.llllIIIllllI[A.llllIIIlllll[13]] = A.lIIIllllIlIllIl("5R5HNYcb5nQ=", "ZGcHS");
        A.llllIIIllllI[A.llllIIIlllll[2]] = A.lIIIllllIlIlllI("ZX04VtZm8M8=", "AAzyD");
        A.llllIIIllllI[A.llllIIIlllll[14]] = A.lIIIllllIlIllII("LhoLMQ==", "loyHI");
        A.llllIIIllllI[A.llllIIIlllll[15]] = A.lIIIllllIlIllII("HBgyEAA=", "YuBdy");
        A.llllIIIllllI[A.llllIIIlllll[16]] = A.lIIIllllIlIllIl("l+pnIK5JGKA=", "DGByL");
        A.llllIIIllllI[A.llllIIIlllll[4]] = A.lIIIllllIlIllII("IgQF", "geqRj");
        A.llllIIIllllI[A.llllIIIlllll[17]] = A.lIIIllllIlIllII("PxcHNh8=", "zzwBf");
        A.llllIIIllllI[A.llllIIIlllll[18]] = A.lIIIllllIlIllII("ISwH", "dMsdc");
        A.llllIIIllllI[A.llllIIIlllll[19]] = A.lIIIllllIlIlllI("qbU56h2dzFE=", "oYKWS");
        A.llllIIIllllI[A.llllIIIlllll[20]] = A.lIIIllllIlIllIl("N3JCWoAuQOY=", "FEqYM");
        A.llllIIIllllI[A.llllIIIlllll[21]] = A.lIIIllllIlIllIl("AQSavRH1X5sTrySL/R++Vw==", "XIftK");
        A.llllIIIllllI[A.llllIIIlllll[22]] = A.lIIIllllIlIlllI("iJ4Yf4/0WtGQI2ru/cst1A==", "FjyQK");
        A.llllIIIllllI[A.llllIIIlllll[23]] = A.lIIIllllIlIllII("Ki0hDiEnInIKJzwlPRQ=", "HLRzH");
        A.llllIIIllllI[A.llllIIIlllll[24]] = A.lIIIllllIlIllII("JSwgEB85Kg==", "WMNwv");
        A.llllIIIllllI[A.llllIIIlllll[25]] = A.lIIIllllIlIlllI("vALK739pP0w=", "zxXsm");
        A.llllIIIllllI[A.llllIIIlllll[1]] = A.lIIIllllIlIllIl("zh6fdgQ6Emo=", "pKeJi");
        A.llllIIIllllI[A.llllIIIlllll[26]] = A.lIIIllllIlIllII("EAc2", "UfBQE");
    }

    private TileItem aj() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[9];
        return TileItems.getNearest((int[])nArray);
    }

    private TileItem ao() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.lIIIllllIllIlll(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[13]]) ? 1 : 0) && A.lIIIllllIllIIIl(tileItem.getName().contains(llllIIIllllI[llllIIIlllll[2]]) ? 1 : 0)) {
                n2 = llllIIIlllll[3];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0x39 ^ 0x1C) & ~(0x7F ^ 0x5A)) != 0;
                }
            } else {
                n2 = llllIIIlllll[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIIIllllIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllllIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private TileItem am() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[10];
        return TileItems.getNearest((int[])nArray);
    }

    private static boolean lIIIllllIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public A(a a2, c c2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.bb = new HashSet<TileItem>();
        this.aY = a2;
        this.aZ = c2;
        this.ba = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem ap() {
        void lllllllllllllllIIlIlIlllIlIlIIll;
        A lllllllllllllllIIlIlIlllIlIlIlII;
        TileItem tileItem = this.aZ.p().orElse(null);
        if (A.lIIIllllIllIllI(tileItem)) {
            return null;
        }
        if (A.lIIIllllIlllIIl(lllllllllllllllIIlIlIlllIlIlIlII.aZ.a((TileItem)lllllllllllllllIIlIlIlllIlIlIIll), llllIIIlllll[12])) {
            return lllllllllllllllIIlIlIlllIlIlIIll;
        }
        if (A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) {
            return lllllllllllllllIIlIlIlllIlIlIlII.aZ.q().orElse((TileItem)lllllllllllllllIIlIlIlllIlIlIIll);
        }
        return tileItem;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (A.lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7])) {
            this.bb.add(tileItem);
            "".length();
        }
    }

    private static void lIIIllllIllIIII() {
        llllIIIlllll = new int[28];
        A.llllIIIlllll[0] = (0x19 ^ 0x3B) & ~(0x36 ^ 0x14);
        A.llllIIIlllll[1] = 0x97 ^ 0x83;
        A.llllIIIlllll[2] = 111 + 57 - 38 + 25 ^ 123 + 69 - 96 + 61;
        A.llllIIIlllll[3] = " ".length();
        A.llllIIIlllll[4] = 0x16 ^ 0x1C;
        A.llllIIIlllll[5] = "  ".length();
        A.llllIIIlllll[6] = "   ".length();
        A.llllIIIlllll[7] = -(0xFFFFDD5D & 0x2EBF) & (0xFFFFFFFF & 0xFFF);
        A.llllIIIlllll[8] = 0x9D ^ 0x99;
        A.llllIIIlllll[9] = 5 + 13 - -73 + 78;
        A.llllIIIlllll[10] = 0xFFFFCDED & 0x3393;
        A.llllIIIlllll[11] = 0xFFFFEBFB & 0x1FD6;
        A.llllIIIlllll[12] = -" ".length() & (0xFFFFFFFF & Integer.MAX_VALUE);
        A.llllIIIlllll[13] = 3 ^ 6;
        A.llllIIIlllll[14] = 0x12 ^ 0x15;
        A.llllIIIlllll[15] = 0x32 ^ 0x7E ^ (0x3C ^ 0x78);
        A.llllIIIlllll[16] = 0xAE ^ 0x98 ^ (0x42 ^ 0x7D);
        A.llllIIIlllll[17] = 0x9A ^ 0x91;
        A.llllIIIlllll[18] = 0x58 ^ 0x54;
        A.llllIIIlllll[19] = 170 + 123 - 93 + 5 ^ 88 + 117 - 31 + 18;
        A.llllIIIlllll[20] = 6 + 131 - 124 + 149 ^ 48 + 101 - 62 + 85;
        A.llllIIIlllll[21] = 0xA4 ^ 0xAB;
        A.llllIIIlllll[22] = 121 + 98 - 106 + 45 ^ 11 + 12 - 5 + 124;
        A.llllIIIlllll[23] = 0x1B ^ 0xA;
        A.llllIIIlllll[24] = 0xB1 ^ 0xA3;
        A.llllIIIlllll[25] = 0x14 ^ 0x26 ^ (0x92 ^ 0xB3);
        A.llllIIIlllll[26] = 0xB9 ^ 0xAC;
        A.llllIIIlllll[27] = 0xEA ^ 0xAE ^ (0x39 ^ 0x6B);
    }

    private static String lIIIllllIlIllIl(String lllllllllllllllIIlIlIlllIIlIllIl, String lllllllllllllllIIlIlIlllIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlllIIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlllIIllIIIl.init(llllIIIlllll[5], lllllllllllllllIIlIlIlllIIllIIlI);
            return new String(lllllllllllllllIIlIlIlllIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllIIllIIII) {
            lllllllllllllllIIlIlIlllIIllIIII.printStackTrace();
            return null;
        }
    }

    private TileItem an() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[11];
        return TileItems.getNearest((int[])nArray);
    }

    private static /* synthetic */ boolean a(boolean bl, Predicate predicate, TileItem tileItem) {
        boolean bl2;
        if (!A.lIIIllllIllIlll(bl ? 1 : 0) || A.lIIIllllIllIIIl(predicate.test(tileItem.getName()) ? 1 : 0)) {
            bl2 = llllIIIlllll[3];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xF2 ^ 0xA4) & ~(0x78 ^ 0x2E)) != 0;
            }
        } else {
            bl2 = llllIIIlllll[0];
        }
        return bl2;
    }

    private TileItem al() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.lIIIllllIllIlll(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[llllIIIlllll[3]];
                nArray[A.llllIIIlllll[0]] = tileItem.getId();
                if (A.lIIIllllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = llllIIIlllll[3];
                    "".length();
                    if ("  ".length() >= ((0x21 ^ 0xF ^ (0xB8 ^ 0xC1)) & (12 + 197 - 57 + 91 ^ 61 + 102 - 72 + 73 ^ -" ".length()))) return n2 != 0;
                    return ((0x24 ^ 0x45 ^ (0x7E ^ 0x2F)) & (182 + 115 - 290 + 239 ^ 78 + 193 - 139 + 66 ^ -" ".length())) != 0;
                }
            }
            n2 = llllIIIlllll[0];
            return n2 != 0;
        });
    }

    private static boolean lIIIllllIllIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem lllllllllllllllIIlIlIlllIlIllIlI;
        A lllllllllllllllIIlIlIlllIlIlllII;
        block25: {
            TileItem lllllllllllllllIIlIlIlllIlIllIIl;
            block26: {
                TileItem lllllllllllllllIIlIlIlllIlIllIll;
                if (A.lIIIllllIllIIIl(this.aY.g() ? 1 : 0)) {
                    return llllIIIlllll[0];
                }
                if (A.lIIIllllIllIIlI(lllllllllllllllIIlIlIlllIlIlllII.aY.k())) {
                    return llllIIIlllll[0];
                }
                lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIllIll = lllllllllllllllIIlIlIlllIlIlllII.al();
                if (A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[26]];
                    return item.hasAction(stringArray);
                }) ? 1 : 0)) {
                    lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIlllII.am();
                    "".length();
                    if ((0xC6 ^ 0xC2) == 0) {
                        return ((0x3C ^ 8) & ~(0x7D ^ 0x49)) != 0;
                    }
                } else if (A.lIIIllllIllIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), lllllllllllllllIIlIlIlllIlIlllII.ba.restorePrayAt()) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    int n2;
                    if (!A.lIIIllllIllIIIl(item.getName().contains(llllIIIllllI[llllIIIlllll[25]]) ? 1 : 0) || A.lIIIllllIllIlll(item.getName().contains(llllIIIllllI[llllIIIlllll[1]]) ? 1 : 0)) {
                        n2 = llllIIIlllll[3];
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = llllIIIlllll[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIlllII.an();
                    "".length();
                    if (((0x79 ^ 0x7F ^ (0x5A ^ 0x53)) & (0x68 ^ 0x12 ^ (0x6C ^ 0x19) ^ -" ".length())) > "   ".length()) {
                        return ((59 + 110 - 36 + 116 ^ 32 + 111 - 73 + 128) & (0x3F ^ 0x5D ^ (0x39 ^ 0x64) ^ -" ".length())) != 0;
                    }
                } else if (A.lIIIllllIllIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), llllIIIlllll[2]) && A.lIIIllllIllIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llllIIIllllI[llllIIIlllll[24]])) ? 1 : 0)) {
                    lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIlllII.aj();
                    "".length();
                    if ("  ".length() == ((0x64 ^ 0x68) & ~(6 ^ 0xA))) {
                        return ((0x83 ^ 0xC5) & ~(0x7B ^ 0x3D)) != 0;
                    }
                } else if (A.lIIIllllIllIllI(lllllllllllllllIIlIlIlllIlIllIll)) {
                    lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIlllII.ak();
                }
                if (A.lIIIllllIllIllI(lllllllllllllllIIlIlIlllIlIllIlI)) {
                    lllllllllllllllIIlIlIlllIlIllIIl = string -> {
                        boolean bl;
                        if (!A.lIIIllllIllIIIl(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[22]]) ? 1 : 0) || A.lIIIllllIllIlll(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[23]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];
                            "".length();
                            if (((0xBC ^ 0x82) & ~(0xBC ^ 0x82)) >= "  ".length()) {
                                return ((0x34 ^ 0x12) & ~(0xA7 ^ 0x81)) != 0;
                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    };
                    boolean lllllllllllllllIIlIlIlllIlIllIII = Inventory.contains(item -> lllllllllllllllIIlIlIlllIlIllIIl.test(item.getName()));
                    lllllllllllllllIIlIlIlllIlIllIlI = TileItems.getAll().stream().filter(arg_0 -> A.a(lllllllllllllllIIlIlIlllIlIllIII, (Predicate)lllllllllllllllIIlIlIlllIlIllIIl, arg_0)).filter(tileItem -> {
                        boolean bl;
                        if (A.lIIIllllIllIIIl(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[21]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];
                            "".length();
                            if (null != null) {
                                return ((0xF ^ 0x2C) & ~(0xB6 ^ 0x95)) != 0;
                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
                }
                if (A.lIIIllllIllIllI(lllllllllllllllIIlIlIlllIlIllIlI)) {
                    return llllIIIlllll[0];
                }
                lllllllllllllllIIlIlIlllIlIllIIl = lllllllllllllllIIlIlIlllIlIlllII.ao();
                if (A.lIIIllllIllIIlI(lllllllllllllllIIlIlIlllIlIllIIl)) {
                    lllllllllllllllIIlIlIlllIlIllIlI = lllllllllllllllIIlIlIlllIlIllIIl;
                }
                if (!A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) break block25;
                if (!A.lIIIllllIllIlll(lllllllllllllllIIlIlIlllIlIllIlI.isStackable() ? 1 : 0)) break block26;
                int[] nArray = new int[llllIIIlllll[3]];
                nArray[A.llllIIIlllll[0]] = lllllllllllllllIIlIlIlllIlIllIlI.getId();
                if (!A.lIIIllllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
            }
            Stream stream = y.aU.stream();
            String string2 = lllllllllllllllIIlIlIlllIlIllIlI.getName();
            Objects.requireNonNull(string2);
            "".length();
            if (!A.lIIIllllIllIIIl(stream.anyMatch(string2::contains) ? 1 : 0) || !A.lIIIllllIllIIIl(lllllllllllllllIIlIlIlllIlIllIlI.isNoted() ? 1 : 0) || A.lIIIllllIllIlll(lllllllllllllllIIlIlIlllIlIllIlI.isStackable() ? 1 : 0)) {
                Item lllllllllllllllIIlIlIlllIlIllIII = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[20]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIIlI(lllllllllllllllIIlIlIlllIlIllIII) && A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[4])) {
                    lllllllllllllllIIlIlIlllIlIllIII.interact(llllIIIllllI[llllIIIlllll[0]]);
                    return llllIIIlllll[3];
                }
                Item lllllllllllllllIIlIlIlllIlIlIlll = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[5]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[18]];
                    stringArray[A.llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[19]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIllI(lllllllllllllllIIlIlIlllIlIlIlll)) {
                    lllllllllllllllIIlIlIlllIlIlIlll = Inventory.getFirst(item -> {
                        String[] stringArray = new String[llllIIIlllll[3]];
                        stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[17]];
                        return item.hasAction(stringArray);
                    });
                }
                lllllllllllllllIIlIlIlllIlIlIlll.interact(llllIIIllllI[llllIIIlllll[3]]);
                return llllIIIlllll[3];
            }
            if (A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && A.lIIIllllIllIlll(Inventory.contains(item -> {
                String[] stringArray = new String[llllIIIlllll[3]];
                stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[4]];
                return item.hasAction(stringArray);
            }) ? 1 : 0)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[16]];
                    return item.hasAction(stringArray);
                }).interact(llllIIIllllI[llllIIIlllll[5]]);
                return llllIIIlllll[3];
            }
            if (A.lIIIllllIlllIII(lllllllllllllllIIlIlIlllIlIllIlI, lllllllllllllllIIlIlIlllIlIllIIl)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[5]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[14]];
                    stringArray[A.llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[15]];
                    return item.hasAction(stringArray);
                }).interact(llllIIIllllI[llllIIIlllll[6]]);
                return llllIIIlllll[3];
            }
            return llllIIIlllll[0];
        }
        if (A.lIIIllllIlllIIl(lllllllllllllllIIlIlIlllIlIllIlI.getId(), llllIIIlllll[7]) && A.lIIIllllIllIIIl(lllllllllllllllIIlIlIlllIlIlllII.bb.contains(lllllllllllllllIIlIlIlllIlIllIlI) ? 1 : 0)) {
            return llllIIIlllll[0];
        }
        var2_2.interact(llllIIIllllI[llllIIIlllll[8]]);
        return llllIIIlllll[3];
    }

    static {
        A.lIIIllllIllIIII();
        A.lIIIllllIlIllll();
    }

    private TileItem ak() {
        return TileItems.getAll().stream().filter(tileItem -> {
            Stream stream = y.aU.stream();
            String string = tileItem.getName();
            Objects.requireNonNull(string);
            "".length();
            return stream.anyMatch(string::contains);
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
    }
}

