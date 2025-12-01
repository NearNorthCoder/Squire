package u.i.r.d.s.e.r.q.y.a.h.p000;

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
@TaskDesc(name = "Looting Items", priority = 10, blocking = true, register = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.A  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/A.class */
public class A extends Task {
    private static /* synthetic */ int[] llllIIIlllll;
    private final /* synthetic */ SquireAlchemicalHydraConfig ba;
    private final /* synthetic */ Set<TileItem> bb = new HashSet();
    private final /* synthetic */ C0000a aY;
    private final /* synthetic */ C0002c aZ;
    private static /* synthetic */ String[] llllIIIllllI;

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (lIIIllllIlllIIl(itemDespawned.getItem().getId(), llllIIIlllll[7])) {
            this.bb.clear();
        }
    }

    private static boolean lIIIllllIllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIIllllIllIllI(Object obj) {
        return obj == null;
    }

    private static String lIIIllllIlIllII(String lllllllllllllllIIlIlIlllIIIlIIlI, String lllllllllllllllIIlIlIlllIIIlIIIl) {
        String lllllllllllllllIIlIlIlllIIIlIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIlllIIIlIIIl.toCharArray();
        int lllllllllllllllIIlIlIlllIIIIlllI = llllIIIlllll[0];
        char[] charArray2 = lllllllllllllllIIlIlIlllIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIlllll[0];
        while (lIIIllllIllIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlIlllIIIIlllI % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIlllIIIIlllI++;
            i++;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIllllIllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllllIlllIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIIIllllIlIlllI(String lllllllllllllllIIlIlIlllIIlIIIlI, String lllllllllllllllIIlIlIlllIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIlllll[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllIIlIIIll) {
            lllllllllllllllIIlIlIlllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIllIlll(int i) {
        return i != 0;
    }

    private static void lIIIllllIlIllll() {
        llllIIIllllI = new String[llllIIIlllll[27]];
        llllIIIllllI[llllIIIlllll[0]] = lIIIllllIlIllII("Azcu", "FVZvd");
        llllIIIllllI[llllIIIlllll[3]] = lIIIllllIlIllIl("qviA5M7Ht3s=", "ZlaNt");
        llllIIIllllI[llllIIIlllll[5]] = lIIIllllIlIllII("IQoy", "dkFzT");
        llllIIIllllI[llllIIIlllll[6]] = lIIIllllIlIllII("HCA4JA==", "XRWTx");
        llllIIIllllI[llllIIIlllll[8]] = lIIIllllIlIllIl("YxwUG4i9Kig=", "QVzZl");
        llllIIIllllI[llllIIIlllll[13]] = lIIIllllIlIllIl("5R5HNYcb5nQ=", "ZGcHS");
        llllIIIllllI[llllIIIlllll[2]] = lIIIllllIlIlllI("ZX04VtZm8M8=", "AAzyD");
        llllIIIllllI[llllIIIlllll[14]] = lIIIllllIlIllII("LhoLMQ==", "loyHI");
        llllIIIllllI[llllIIIlllll[15]] = lIIIllllIlIllII("HBgyEAA=", "YuBdy");
        llllIIIllllI[llllIIIlllll[16]] = lIIIllllIlIllIl("l+pnIK5JGKA=", "DGByL");
        llllIIIllllI[llllIIIlllll[4]] = lIIIllllIlIllII("IgQF", "geqRj");
        llllIIIllllI[llllIIIlllll[17]] = lIIIllllIlIllII("PxcHNh8=", "zzwBf");
        llllIIIllllI[llllIIIlllll[18]] = lIIIllllIlIllII("ISwH", "dMsdc");
        llllIIIllllI[llllIIIlllll[19]] = lIIIllllIlIlllI("qbU56h2dzFE=", "oYKWS");
        llllIIIllllI[llllIIIlllll[20]] = lIIIllllIlIllIl("N3JCWoAuQOY=", "FEqYM");
        llllIIIllllI[llllIIIlllll[21]] = lIIIllllIlIllIl("AQSavRH1X5sTrySL/R++Vw==", "XIftK");
        llllIIIllllI[llllIIIlllll[22]] = lIIIllllIlIlllI("iJ4Yf4/0WtGQI2ru/cst1A==", "FjyQK");
        llllIIIllllI[llllIIIlllll[23]] = lIIIllllIlIllII("Ki0hDiEnInIKJzwlPRQ=", "HLRzH");
        llllIIIllllI[llllIIIlllll[24]] = lIIIllllIlIllII("JSwgEB85Kg==", "WMNwv");
        llllIIIllllI[llllIIIlllll[25]] = lIIIllllIlIlllI("vALK739pP0w=", "zxXsm");
        llllIIIllllI[llllIIIlllll[1]] = lIIIllllIlIllIl("zh6fdgQ6Emo=", "pKeJi");
        llllIIIllllI[llllIIIlllll[26]] = lIIIllllIlIllII("EAc2", "UfBQE");
    }

    private TileItem aj() {
        int[] iArr = new int[llllIIIlllll[3]];
        iArr[llllIIIlllll[0]] = llllIIIlllll[9];
        return TileItems.getNearest(iArr);
    }

    private TileItem ao() {
        return TileItems.getNearest(tileItem -> {
            if (lIIIllllIllIlll(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[13]]) ? 1 : 0) && lIIIllllIllIIIl(tileItem.getName().contains(llllIIIllllI[llllIIIlllll[2]]) ? 1 : 0)) {
                ?? r0 = llllIIIlllll[3];
                "".length();
                return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIlllll[0];
        });
    }

    private static boolean lIIIllllIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllllIllIIll(int i, int i2) {
        return i > i2;
    }

    private TileItem am() {
        int[] iArr = new int[llllIIIlllll[3]];
        iArr[llllIIIlllll[0]] = llllIIIlllll[10];
        return TileItems.getNearest(iArr);
    }

    private static boolean lIIIllllIllIlIl(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public A(C0000a c0000a, C0002c c0002c, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aY = c0000a;
        this.aZ = c0002c;
        this.ba = squireAlchemicalHydraConfig;
    }

    private TileItem ap() {
        TileItem orElse = this.aZ.p().orElse(null);
        if (lIIIllllIllIllI(orElse)) {
            return null;
        }
        if (!lIIIllllIlllIIl(this.aZ.a(orElse), llllIIIlllll[12]) && lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) {
            return this.aZ.q().orElse(orElse);
        }
        return orElse;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        if (lIIIllllIlllIIl(item.getId(), llllIIIlllll[7])) {
            this.bb.add(item);
            "".length();
        }
    }

    private static void lIIIllllIllIIII() {
        llllIIIlllll = new int[28];
        llllIIIlllll[0] = (25 ^ 59) & ((54 ^ 20) ^ (-1));
        llllIIIlllll[1] = 151 ^ 131;
        llllIIIlllll[2] = (((111 + 57) - 38) + 25) ^ (((123 + 69) - 96) + 61);
        llllIIIlllll[3] = " ".length();
        llllIIIlllll[4] = 22 ^ 28;
        llllIIIlllll[5] = "  ".length();
        llllIIIlllll[6] = "   ".length();
        llllIIIlllll[7] = (-((-8867) & 11967)) & (-1) & 4095;
        llllIIIlllll[8] = 157 ^ 153;
        llllIIIlllll[9] = ((5 + 13) - (-73)) + 78;
        llllIIIlllll[10] = (-12819) & 13203;
        llllIIIlllll[11] = (-5125) & 8150;
        llllIIIlllll[12] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        llllIIIlllll[13] = 3 ^ 6;
        llllIIIlllll[14] = 18 ^ 21;
        llllIIIlllll[15] = (50 ^ 126) ^ (60 ^ 120);
        llllIIIlllll[16] = (174 ^ 152) ^ (66 ^ 125);
        llllIIIlllll[17] = 154 ^ 145;
        llllIIIlllll[18] = 88 ^ 84;
        llllIIIlllll[19] = (((170 + 123) - 93) + 5) ^ (((88 + 117) - 31) + 18);
        llllIIIlllll[20] = (((6 + 131) - 124) + 149) ^ (((48 + 101) - 62) + 85);
        llllIIIlllll[21] = 164 ^ 171;
        llllIIIlllll[22] = (((121 + 98) - 106) + 45) ^ (((11 + 12) - 5) + 124);
        llllIIIlllll[23] = 27 ^ 10;
        llllIIIlllll[24] = 177 ^ 163;
        llllIIIlllll[25] = (20 ^ 38) ^ (146 ^ 179);
        llllIIIlllll[26] = 185 ^ 172;
        llllIIIlllll[27] = (234 ^ 174) ^ (57 ^ 107);
    }

    private static String lIIIllllIlIllIl(String lllllllllllllllIIlIlIlllIIlIllll, String lllllllllllllllIIlIlIlllIIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlllll[5], lllllllllllllllIIlIlIlllIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllIIllIIII) {
            lllllllllllllllIIlIlIlllIIllIIII.printStackTrace();
            return null;
        }
    }

    private TileItem an() {
        int[] iArr = new int[llllIIIlllll[3]];
        iArr[llllIIIlllll[0]] = llllIIIlllll[11];
        return TileItems.getNearest(iArr);
    }

    private TileItem al() {
        return TileItems.getNearest(tileItem -> {
            if (lIIIllllIllIlll(tileItem.isStackable() ? 1 : 0)) {
                int[] iArr = new int[llllIIIlllll[3]];
                iArr[llllIIIlllll[0]] = tileItem.getId();
                if (lIIIllllIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    ?? r0 = llllIIIlllll[3];
                    "".length();
                    return "  ".length() < (((33 ^ 15) ^ (184 ^ 193)) & (((((12 + 197) - 57) + 91) ^ (((61 + 102) - 72) + 73)) ^ (-" ".length()))) ? ((36 ^ 69) ^ (126 ^ 47)) & (((((182 + 115) - 290) + 239) ^ (((78 + 193) - 139) + 66)) ^ (-" ".length())) : r0;
                }
            }
            return llllIIIlllll[0];
        });
    }

    private static boolean lIIIllllIllIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e4, code lost:
        if (lIIIllllIllIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (!lIIIllllIllIIIl(this.aY.g() ? 1 : 0) && !lIIIllllIllIIlI(this.aY.k())) {
            TileItem al = al();
            TileItem tileItem = al;
            if (lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && lIIIllllIllIIIl(Inventory.contains(item -> {
                String[] strArr = new String[llllIIIlllll[3]];
                strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[26]];
                return item.hasAction(strArr);
            }) ? 1 : 0)) {
                tileItem = am();
                "".length();
                if (!(true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIIllllIllIlII(Skills.getBoostedLevel(Skill.PRAYER), this.ba.restorePrayAt()) && lIIIllllIllIIIl(Inventory.contains(item2 -> {
                if (!lIIIllllIllIIIl(item2.getName().contains(llllIIIllllI[llllIIIlllll[25]]) ? 1 : 0) || lIIIllllIllIlll(item2.getName().contains(llllIIIllllI[llllIIIlllll[1]]) ? 1 : 0)) {
                    ?? r0 = llllIIIlllll[3];
                    "".length();
                    return "   ".length() > "   ".length() ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                }
                return llllIIIlllll[0];
            }) ? 1 : 0)) {
                tileItem = an();
                "".length();
                if ((((121 ^ 127) ^ (90 ^ 83)) & (((104 ^ 18) ^ (108 ^ 25)) ^ (-" ".length()))) > "   ".length()) {
                    return ((((59 + 110) - 36) + 116) ^ (((32 + 111) - 73) + 128)) & (((63 ^ 93) ^ (57 ^ 100)) ^ (-" ".length()));
                }
            } else if (lIIIllllIllIlIl(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), llllIIIlllll[2]) && lIIIllllIllIIIl(Inventory.contains(item3 -> {
                return item3.getName().toLowerCase().contains(llllIIIllllI[llllIIIlllll[24]]);
            }) ? 1 : 0)) {
                tileItem = aj();
                "".length();
                if ("  ".length() == ((100 ^ 104) & ((6 ^ 10) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIIllllIllIllI(al)) {
                tileItem = ak();
            }
            if (lIIIllllIllIllI(tileItem)) {
                Predicate predicate = str -> {
                    if (!lIIIllllIllIIIl(str.toLowerCase().contains(llllIIIllllI[llllIIIlllll[22]]) ? 1 : 0) || lIIIllllIllIlll(str.toLowerCase().contains(llllIIIllllI[llllIIIlllll[23]]) ? 1 : 0)) {
                        ?? r0 = llllIIIlllll[3];
                        "".length();
                        return ((188 ^ 130) & ((188 ^ 130) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIIIlllll[0];
                };
                boolean contains = Inventory.contains(item4 -> {
                    return predicate.test(item4.getName());
                });
                tileItem = (TileItem) TileItems.getAll().stream().filter(tileItem2 -> {
                    if (!lIIIllllIllIlll(contains ? 1 : 0) || lIIIllllIllIIIl(predicate.test(tileItem2.getName()) ? 1 : 0)) {
                        ?? r0 = llllIIIlllll[3];
                        "".length();
                        return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIIIlllll[0];
                }).filter(tileItem3 -> {
                    if (lIIIllllIllIIIl(tileItem3.getName().startsWith(llllIIIllllI[llllIIIlllll[21]]) ? 1 : 0)) {
                        ?? r0 = llllIIIlllll[3];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIIIlllll[0];
                }).max(Comparator.comparingInt(tileItem4 -> {
                    return Prices.getItemPrice(tileItem4.getId()) * tileItem4.getQuantity();
                })).orElse(null);
            }
            if (lIIIllllIllIllI(tileItem)) {
                return llllIIIlllll[0];
            }
            TileItem ao = ao();
            if (lIIIllllIllIIlI(ao)) {
                tileItem = ao;
            }
            if (lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) {
                if (lIIIllllIllIlll(tileItem.isStackable() ? 1 : 0)) {
                    int[] iArr = new int[llllIIIlllll[3]];
                    iArr[llllIIIlllll[0]] = tileItem.getId();
                }
                Stream stream = y.aU.stream();
                String name = tileItem.getName();
                Objects.requireNonNull(name);
                "".length();
                if (lIIIllllIllIIIl(stream.anyMatch((v1) -> {
                    return r1.contains(v1);
                }) ? 1 : 0) && lIIIllllIllIIIl(tileItem.isNoted() ? 1 : 0) && !lIIIllllIllIlll(tileItem.isStackable() ? 1 : 0)) {
                    if (lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && lIIIllllIllIlll(Inventory.contains(item5 -> {
                        String[] strArr = new String[llllIIIlllll[3]];
                        strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[4]];
                        return item5.hasAction(strArr);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item6 -> {
                            String[] strArr = new String[llllIIIlllll[3]];
                            strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[16]];
                            return item6.hasAction(strArr);
                        }).interact(llllIIIllllI[llllIIIlllll[5]]);
                        return llllIIIlllll[3];
                    } else if (lIIIllllIlllIII(tileItem, ao)) {
                        Inventory.getFirst(item7 -> {
                            String[] strArr = new String[llllIIIlllll[5]];
                            strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[14]];
                            strArr[llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[15]];
                            return item7.hasAction(strArr);
                        }).interact(llllIIIllllI[llllIIIlllll[6]]);
                        return llllIIIlllll[3];
                    } else {
                        return llllIIIlllll[0];
                    }
                }
                Item first = Inventory.getFirst(item8 -> {
                    String[] strArr = new String[llllIIIlllll[3]];
                    strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[20]];
                    return item8.hasAction(strArr);
                });
                if (lIIIllllIllIIlI(first) && lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[4])) {
                    first.interact(llllIIIllllI[llllIIIlllll[0]]);
                    return llllIIIlllll[3];
                }
                Item first2 = Inventory.getFirst(item9 -> {
                    String[] strArr = new String[llllIIIlllll[5]];
                    strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[18]];
                    strArr[llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[19]];
                    return item9.hasAction(strArr);
                });
                if (lIIIllllIllIllI(first2)) {
                    first2 = Inventory.getFirst(item10 -> {
                        String[] strArr = new String[llllIIIlllll[3]];
                        strArr[llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[17]];
                        return item10.hasAction(strArr);
                    });
                }
                first2.interact(llllIIIllllI[llllIIIlllll[3]]);
                return llllIIIlllll[3];
            }
            if (lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7]) && lIIIllllIllIIIl(this.bb.contains(tileItem) ? 1 : 0)) {
                return llllIIIlllll[0];
            }
            tileItem.interact(llllIIIllllI[llllIIIlllll[8]]);
            return llllIIIlllll[3];
        }
        return llllIIIlllll[0];
    }

    static {
        lIIIllllIllIIII();
        lIIIllllIlIllll();
    }

    private TileItem ak() {
        return (TileItem) TileItems.getAll().stream().filter(tileItem -> {
            Stream stream = y.aU.stream();
            String name = tileItem.getName();
            Objects.requireNonNull(name);
            "".length();
            return stream.anyMatch((v1) -> {
                return r1.contains(v1);
            });
        }).max(Comparator.comparingInt(tileItem2 -> {
            return Prices.getItemPrice(tileItem2.getId());
        })).orElse(null);
    }
}
