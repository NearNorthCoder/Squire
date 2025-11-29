package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/a.class */
public abstract class AbstractC0000a extends Task {
    protected final /* synthetic */ SquireBankStander i;
    protected final /* synthetic */ BankStanderConfig j;

    /* renamed from: k  reason: collision with root package name */
    protected final /* synthetic */ EnumC0001b f0k;
    protected /* synthetic */ InventorySetup l;
    private static /* synthetic */ int[] lllIIIIllIl;
    private static /* synthetic */ String[] lllIIIIllII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        if (lIlIllIIlIlIIl(this.j.activity(), this.f0k)) {
            return lllIIIIllIl[0];
        }
        this.l = this.i.a();
        if (!lIlIllIIlIlIlI(this.l) && !lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0) && !lIlIllIIlIllII(Movement.shouldWalk() ? 1 : 0)) {
            if (lIlIllIIlIlIIl(this.j.activity(), EnumC0001b.GLASS_MAKE)) {
                if (lIlIllIIlIllII(g().isEmpty() ? 1 : 0)) {
                    for (Map.Entry<Integer, Integer> entry : g().entrySet()) {
                        ?? r0 = lllIIIIllIl[1];
                        int[] iArr = new int[lllIIIIllIl[1]];
                        iArr[lllIIIIllIl[0]] = entry.getKey().intValue();
                        if (lIlIllIIlIllIl(Inventory.getCount((boolean) r0, iArr), entry.getValue().intValue())) {
                            f();
                            return lllIIIIllIl[1];
                        }
                        "".length();
                        if ((-" ".length()) >= 0) {
                            return ((33 ^ 24) ^ (42 ^ 20)) & (((27 ^ 121) ^ (76 ^ 41)) ^ (-" ".length()));
                        }
                    }
                }
                if (lIlIllIIlIllIl(this.i.e(), i())) {
                    return lllIIIIllIl[0];
                }
            }
            return h();
        }
        return lllIIIIllIl[0];
    }

    private static String lIlIllIIlIIllI(String llllllllllllllllIIlIlIlIIlIlIIII, String llllllllllllllllIIlIlIlIIlIIllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIlIIllll.getBytes(StandardCharsets.UTF_8)), lllIIIIllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIllIl[3], llllllllllllllllIIlIlIlIIlIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIlIlIIIl) {
            llllllllllllllllIIlIlIlIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIIlIlIII();
        lIlIllIIlIIlll();
    }

    public abstract int i();

    public abstract Map<Integer, Integer> g();

    private static void lIlIllIIlIIlll() {
        lllIIIIllII = new String[lllIIIIllIl[16]];
        lllIIIIllII[lllIIIIllIl[0]] = lIlIllIIlIIlII("e6z9UniqyaDO72lGMAdjSw==", "yNruf");
        lllIIIIllII[lllIIIIllIl[1]] = lIlIllIIlIIlIl("CjAkNA1tBz05ASwsIj9JLy0qLgE=", "MBEZi");
        lllIIIIllII[lllIIIIllIl[3]] = lIlIllIIlIIllI("ieHVzEGKzFQabqWi7thcjQ==", "jNVOU");
        lllIIIIllII[lllIIIIllIl[4]] = lIlIllIIlIIlII("/ta9N+WDmginLkB3QOMgsUF1Ng6nKUHl", "boAOm");
        lllIIIIllII[lllIIIIllIl[5]] = lIlIllIIlIIlIl("EAoeKUIRCh0nDg==", "RkpBb");
        lllIIIIllII[lllIIIIllIl[2]] = lIlIllIIlIIlIl("LC8+PRwc", "nNPVy");
        lllIIIIllII[lllIIIIllIl[6]] = lIlIllIIlIIllI("HwnX/TVxkYcaD3nWTRfEcUInjxpmMl5/", "mEBcm");
        lllIIIIllII[lllIIIIllIl[7]] = lIlIllIIlIIlII("1y/Pg6p36tyxWrbptv9S9x/fz74BFFj6", "aXVuE");
        lllIIIIllII[lllIIIIllIl[8]] = lIlIllIIlIIlIl("DzsEBjoqaSYQMj05BRs=", "NIjiV");
        lllIIIIllII[lllIIIIllIl[9]] = lIlIllIIlIIlIl("FyYCDBA6Oh5ZJzM8GQ==", "VUjyu");
        lllIIIIllII[lllIIIIllIl[10]] = lIlIllIIlIIlIl("BwIJIQ==", "EcgJl");
        lllIIIIllII[lllIIIIllIl[11]] = lIlIllIIlIIllI("xoJ6ENQ/6Vs=", "akMUA");
        lllIIIIllII[lllIIIIllIl[12]] = lIlIllIIlIIlIl("KBMVBA==", "gcpjp");
        lllIIIIllII[lllIIIIllIl[13]] = lIlIllIIlIIlIl("NyA+MQ==", "uAPZX");
        lllIIIIllII[lllIIIIllIl[14]] = lIlIllIIlIIlIl("BhUK", "SfoYa");
        lllIIIIllII[lllIIIIllIl[15]] = lIlIllIIlIIlII("CzdU9/E40+8=", "QnoLe");
    }

    private static boolean lIlIllIIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIIlIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIllIIlIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIlIllII(int i) {
        return i == 0;
    }

    public AbstractC0000a(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig, EnumC0001b enumC0001b) {
        this.i = squireBankStander;
        this.j = bankStanderConfig;
        this.f0k = enumC0001b;
    }

    private void f() {
        if (lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.openMainTab();
        } else if (lIlIllIIlIlIll(Bank.isPinWindowOpen() ? 1 : 0)) {
        } else {
            String[] strArr = new String[lllIIIIllIl[2]];
            strArr[lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[0]];
            strArr[lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[1]];
            strArr[lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[3]];
            strArr[lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[4]];
            strArr[lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[5]];
            ArrayList arrayList = new ArrayList(TileObjects.getAll(strArr));
            String[] strArr2 = new String[lllIIIIllIl[2]];
            strArr2[lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[2]];
            strArr2[lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[6]];
            strArr2[lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[7]];
            strArr2[lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[8]];
            strArr2[lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[9]];
            arrayList.addAll(NPCs.getAll(strArr2));
            "".length();
            Player local = Players.getLocal();
            Locatable locatable = (Interactable) arrayList.stream().sorted(Comparator.comparingInt(interactable -> {
                return ((Locatable) interactable).distanceTo(local);
            })).limit(5L).filter(interactable2 -> {
                String[] strArr3 = new String[lllIIIIllIl[4]];
                strArr3[lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[13]];
                strArr3[lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[14]];
                strArr3[lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[15]];
                return interactable2.hasAction(strArr3);
            }).filter(interactable3 -> {
                return Reachable.isInteractable((Locatable) interactable3);
            }).min(Comparator.comparingInt(interactable4 -> {
                return ((Locatable) interactable4).distanceTo(local);
            })).orElse(null);
            if (lIlIllIIlIlIlI(locatable)) {
                return;
            }
            Locatable locatable2 = locatable;
            if (lIlIllIIlIlllI(locatable2.distanceTo(local), lllIIIIllIl[8])) {
                Movement.setDestination(locatable2.getWorldLocation());
                return;
            }
            String[] strArr3 = new String[lllIIIIllIl[4]];
            strArr3[lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[10]];
            strArr3[lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[11]];
            strArr3[lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[12]];
            locatable.interact(strArr3);
        }
    }

    private static void lIlIllIIlIlIII() {
        lllIIIIllIl = new int[17];
        lllIIIIllIl[0] = ((232 ^ 142) ^ (187 ^ 188)) & (((((114 + 89) - (-5)) + 38) ^ (((58 + 121) - 36) + 8)) ^ (-" ".length()));
        lllIIIIllIl[1] = " ".length();
        lllIIIIllIl[2] = (18 ^ 4) ^ (58 ^ 41);
        lllIIIIllIl[3] = "  ".length();
        lllIIIIllIl[4] = "   ".length();
        lllIIIIllIl[5] = (((3 + 15) - (-69)) + 76) ^ (((133 + 20) - 32) + 46);
        lllIIIIllIl[6] = (118 ^ 74) ^ (42 ^ 16);
        lllIIIIllIl[7] = 41 ^ 46;
        lllIIIIllIl[8] = (16 ^ 99) ^ (99 ^ 24);
        lllIIIIllIl[9] = 51 ^ 58;
        lllIIIIllIl[10] = 29 ^ 23;
        lllIIIIllIl[11] = (((21 + 72) - (-83)) + 8) ^ (((170 + 70) - 200) + 139);
        lllIIIIllIl[12] = 133 ^ 137;
        lllIIIIllIl[13] = (((13 + 108) - 31) + 116) ^ (((34 + 79) - (-52)) + 30);
        lllIIIIllIl[14] = 202 ^ 196;
        lllIIIIllIl[15] = 106 ^ 101;
        lllIIIIllIl[16] = 127 ^ 111;
    }

    private static String lIlIllIIlIIlIl(String llllllllllllllllIIlIlIlIIllIIlIl, String llllllllllllllllIIlIlIlIIllIIlII) {
        String llllllllllllllllIIlIlIlIIllIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIIllIIIll = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIIllIIIlI = llllllllllllllllIIlIlIlIIllIIlII.toCharArray();
        int llllllllllllllllIIlIlIlIIllIIIIl = lllIIIIllIl[0];
        char[] charArray = llllllllllllllllIIlIlIlIIllIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllIIIIllIl[0];
        while (lIlIllIIlIllIl(i, length)) {
            llllllllllllllllIIlIlIlIIllIIIll.append((char) (charArray[i] ^ llllllllllllllllIIlIlIlIIllIIIlI[llllllllllllllllIIlIlIlIIllIIIIl % llllllllllllllllIIlIlIlIIllIIIlI.length]));
            "".length();
            llllllllllllllllIIlIlIlIIllIIIIl++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIlIIllIIIll);
    }

    public abstract boolean h();

    private static boolean lIlIllIIlIlllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIlIlIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIlIIlII(String llllllllllllllllIIlIlIlIIlllIlIl, String llllllllllllllllIIlIlIlIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIllIl[3], llllllllllllllllIIlIlIlIIllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIlllIllI) {
            llllllllllllllllIIlIlIlIIlllIllI.printStackTrace();
            return null;
        }
    }
}
