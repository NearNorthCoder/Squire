package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking for birdhouse stuff", priority = 10, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aE  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aE.class */
public class aE extends Task {
    private static /* synthetic */ int[] lIlllIIllIIl;
    protected final /* synthetic */ SquireFarmerConfig co;
    protected final /* synthetic */ C0035j cn;
    private final /* synthetic */ SquireFarmer cp;
    private static /* synthetic */ String[] lIlllIIlIlII;

    private static boolean lllIlIllllIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIlIlllIlllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlIlllIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIlIlllIlIll(int i) {
        return i == 0;
    }

    private static boolean lllIlIllllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean bt() {
        EnumC0021au[] values = EnumC0021au.values();
        int length = values.length;
        int i = lIlllIIllIIl[0];
        while (lllIlIllllIIII(i, length)) {
            EnumC0021au enumC0021au = values[i];
            int[] iArr = new int[lIlllIIllIIl[1]];
            iArr[lIlllIIllIIl[0]] = enumC0021au.au();
            iArr[lIlllIIllIIl[3]] = enumC0021au.au() + lIlllIIllIIl[3];
            if (lllIlIlllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIIllIIl[1]];
                iArr2[lIlllIIllIIl[0]] = enumC0021au.au();
                iArr2[lIlllIIllIIl[3]] = enumC0021au.au() + lIlllIIllIIl[3];
                Bank.depositAll(iArr2);
                return lIlllIIllIIl[3];
            }
            i++;
            "".length();
            if ((-((102 ^ 106) ^ (13 ^ 5))) >= 0) {
                return ((((160 + 118) - 153) + 75) ^ (((39 + 150) - 109) + 72)) & (((102 ^ 121) ^ (1 ^ 78)) ^ (-" ".length()));
            }
        }
        return lIlllIIllIIl[0];
    }

    static {
        lllIlIlllIlIlI();
        lllIlIllIllllI();
    }

    private static void lllIlIlllIlIlI() {
        lIlllIIllIIl = new int[7];
        lIlllIIllIIl[0] = (206 ^ 139) & ((249 ^ 188) ^ (-1));
        lIlllIIllIIl[1] = "  ".length();
        lIlllIIllIIl[2] = (-22565) & 24319;
        lIlllIIllIIl[3] = " ".length();
        lIlllIIllIIl[4] = (-((-1097) & 17629)) & (-4609) & 23487;
        lIlllIIllIIl[5] = "   ".length();
        lIlllIIllIIl[6] = (105 ^ 115) ^ (158 ^ 140);
    }

    private static boolean lllIlIlllIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    public boolean run() {
        if (!lllIlIlllIlIll(this.co.birdhouses_enabled() ? 1 : 0) && !lllIlIlllIllII(this.cp.a(), EnumC0040o.BIRD_HOUSE) && !lllIlIlllIllIl(this.cn.O())) {
            boolean anyMatch = Stream.of((Object[]) EnumC0022av.values()).anyMatch(enumC0022av -> {
                int[] iArr = new int[lIlllIIllIIl[3]];
                iArr[lIlllIIllIIl[0]] = enumC0022av.aA();
                return Inventory.contains(iArr);
            });
            if (lllIlIlllIlIll(this.cn.N())) {
                int[] iArr = new int[lIlllIIllIIl[1]];
                iArr[lIlllIIllIIl[0]] = lIlllIIllIIl[2];
                iArr[lIlllIIllIIl[3]] = lIlllIIllIIl[4];
                if (lllIlIlllIlllI(Inventory.getCount(iArr), lIlllIIllIIl[1]) && lllIlIlllIllll(Inventory.contains(item -> {
                    return Stream.of((Object[]) G.values()).anyMatch(g -> {
                        if (lllIlIllllIIlI(g.aA(), item.getId())) {
                            ?? r0 = lIlllIIllIIl[3];
                            "".length();
                            return (((((19 + 40) - (-109)) + 15) ^ (((108 + 95) - 45) + 20)) & (((48 ^ 71) ^ (29 ^ 111)) ^ (-" ".length()))) > "  ".length() ? ((14 ^ 91) ^ (116 ^ 64)) & (((189 ^ 172) ^ (2 ^ 114)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIIllIIl[0];
                    });
                }) ? 1 : 0) && lllIlIlllIlIll(anyMatch ? 1 : 0)) {
                    return lIlllIIllIIl[0];
                }
            }
            if (!lllIlIlllIllll(Bank.isOpen() ? 1 : 0)) {
                if (lllIlIlllIllll(Bank.open() ? 1 : 0)) {
                    return lIlllIIllIIl[3];
                }
                Movement.walkTo(BankLocation.getNearestCommon());
                "".length();
                return lIlllIIllIIl[3];
            } else if (lllIlIlllIllll(bt() ? 1 : 0)) {
                return lIlllIIllIIl[3];
            } else {
                if (lllIlIlllIllll(anyMatch ? 1 : 0)) {
                    Bank.depositAll(item2 -> {
                        return Stream.of((Object[]) EnumC0022av.values()).anyMatch(enumC0022av2 -> {
                            if (lllIlIllllIIlI(item2.getId(), enumC0022av2.aA())) {
                                ?? r0 = lIlllIIllIIl[3];
                                "".length();
                                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIllIIl[0];
                        });
                    });
                    return lIlllIIllIIl[3];
                }
                String[] strArr = new String[lIlllIIllIIl[3]];
                strArr[lIlllIIllIIl[0]] = lIlllIIlIlII[lIlllIIllIIl[0]];
                if (lllIlIlllIllll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlllIIllIIl[1]];
                    strArr2[lIlllIIllIIl[0]] = lIlllIIlIlII[lIlllIIllIIl[3]];
                    strArr2[lIlllIIllIIl[3]] = lIlllIIlIlII[lIlllIIllIIl[1]];
                    Bank.depositAll(strArr2);
                    return lIlllIIllIIl[3];
                } else if (lllIlIlllIlIll(Inventory.contains(item3 -> {
                    return Stream.of((Object[]) G.values()).anyMatch(g -> {
                        if (lllIlIllllIIlI(g.aA(), item3.getId())) {
                            ?? r0 = lIlllIIllIIl[3];
                            "".length();
                            return (((93 ^ 66) ^ (70 ^ 93)) & (((((117 + 48) - 107) + 70) ^ (((118 + 7) - 43) + 50)) ^ (-" ".length()))) < 0 ? ((((59 + 88) - 102) + 127) ^ (((10 + 42) - (-41)) + 63)) & (((49 ^ 116) ^ (219 ^ 174)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIIllIIl[0];
                    });
                }) ? 1 : 0)) {
                    Bank.withdrawAll(item4 -> {
                        return Stream.of((Object[]) G.values()).anyMatch(g -> {
                            if (lllIlIllllIIlI(g.aA(), item4.getId())) {
                                ?? r0 = lIlllIIllIIl[3];
                                "".length();
                                return 0 != 0 ? ((((11 + 56) - (-52)) + 90) ^ (((54 + 130) - 121) + 68)) & (((135 ^ 184) ^ (71 ^ 42)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIIllIIl[0];
                        });
                    }, Bank.WithdrawMode.ITEM);
                    return lIlllIIllIIl[3];
                } else {
                    int[] iArr2 = new int[lIlllIIllIIl[3]];
                    iArr2[lIlllIIllIIl[0]] = lIlllIIllIIl[2];
                    if (lllIlIlllIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lIlllIIllIIl[2], lIlllIIllIIl[3], Bank.WithdrawMode.ITEM);
                        "".length();
                        if ("   ".length() < ((15 ^ 35) & ((52 ^ 24) ^ (-1)))) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        int[] iArr3 = new int[lIlllIIllIIl[3]];
                        iArr3[lIlllIIllIIl[0]] = lIlllIIllIIl[4];
                        if (lllIlIlllIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            Bank.withdraw(lIlllIIllIIl[4], lIlllIIllIIl[3], Bank.WithdrawMode.ITEM);
                            "".length();
                            if ("  ".length() != "  ".length()) {
                                return ((97 ^ 109) ^ (107 ^ 94)) & (((41 ^ 78) ^ (91 ^ 5)) ^ (-" ".length()));
                            }
                        } else {
                            C birdhouse_type = this.co.birdhouse_type();
                            Bank.withdraw(item5 -> {
                                if (!lllIlIllllIIIl(item5.getId(), birdhouse_type.au()) || lllIlIllllIIlI(item5.getId(), birdhouse_type.av())) {
                                    ?? r0 = lIlllIIllIIl[3];
                                    "".length();
                                    return ((51 ^ 39) & ((185 ^ 173) ^ (-1))) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlllIIllIIl[0];
                            }, this.cn.N(), Bank.WithdrawMode.ITEM);
                        }
                    }
                    return lIlllIIllIIl[3];
                }
            }
        }
        return lIlllIIllIIl[0];
    }

    private static boolean lllIlIlllIllIl(Object obj) {
        return obj == null;
    }

    private static String lllIlIllIllIll(String lllllllllllllllIlIllIllIllIlllll, String lllllllllllllllIlIllIllIllIllllI) {
        String lllllllllllllllIlIllIllIllIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllIllIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIllIllIllIlllII = lllllllllllllllIlIllIllIllIllllI.toCharArray();
        int lllllllllllllllIlIllIllIllIllIll = lIlllIIllIIl[0];
        char[] charArray = lllllllllllllllIlIllIllIllIlllll2.toCharArray();
        int lllllllllllllllIlIllIllIllIlIlII = charArray.length;
        int i = lIlllIIllIIl[0];
        while (lllIlIllllIIII(i, lllllllllllllllIlIllIllIllIlIlII)) {
            lllllllllllllllIlIllIllIllIlllIl.append((char) (charArray[i] ^ lllllllllllllllIlIllIllIllIlllII[lllllllllllllllIlIllIllIllIllIll % lllllllllllllllIlIllIllIllIlllII.length]));
            "".length();
            lllllllllllllllIlIllIllIllIllIll++;
            i++;
            "".length();
            if ("   ".length() == ((((131 + 123) - 174) + 54) ^ (((27 + 49) - 16) + 70))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIllIllIlllIl);
    }

    private static String lllIlIllIlllIl(String lllllllllllllllIlIllIllIllIIlIlI, String lllllllllllllllIlIllIllIllIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIllIIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllIllIIlIll) {
            lllllllllllllllIlIllIllIllIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public aE(SquireFarmer squireFarmer, C0035j c0035j, SquireFarmerConfig squireFarmerConfig) {
        this.cp = squireFarmer;
        this.cn = c0035j;
        this.co = squireFarmerConfig;
    }

    private static void lllIlIllIllllI() {
        lIlllIIlIlII = new String[lIlllIIllIIl[5]];
        lIlllIIlIlII[lIlllIIllIIl[0]] = lllIlIllIllIll("GxoEHnQ3FgUO", "YsvzT");
        lIlllIIlIlII[lIlllIIllIIl[3]] = lllIlIllIlllII("heup4cx3+yw=", "iEjOs");
        lIlllIIlIlII[lIlllIIllIIl[1]] = lllIlIllIlllIl("GluJBYMg5mII16Oye9PxPQ==", "sVbni");
    }

    private static String lllIlIllIlllII(String lllllllllllllllIlIllIllIlllIllll, String lllllllllllllllIlIllIllIlllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIlllIllII.getBytes(StandardCharsets.UTF_8)), lIlllIIllIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIllIIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllIlllIlIll) {
            lllllllllllllllIlIllIllIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllIIlI(int i, int i2) {
        return i == i2;
    }
}
