package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Special Attack", priority = 6, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.an  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/an.class */
public class an extends af {
    private static /* synthetic */ int[] lllIlllIllll;
    private static final /* synthetic */ Logger ee;
    private static /* synthetic */ String[] lllIlllIlllI;

    private static boolean lIIIlllIIIIIIIl(Object obj) {
        return obj == null;
    }

    private int cB() {
        return Static.getClient().getEnum(lllIlllIllll[1]).getIntValue(cq().get(EquipmentInventorySlot.WEAPON)) / lllIlllIllll[9];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean cC() {
        double d;
        double d2;
        double d3;
        int specialAttackEnergy = CombatOptions.getSpecialAttackEnergy();
        if (lIIIlllIIIIIllI(specialAttackEnergy, cB())) {
            return lllIlllIllll[0];
        }
        if (lIIIlllIIIIIIlI(this.cM.Q(), lllIlllIllll[7])) {
            return lllIlllIllll[3];
        }
        int[] iArr = new int[lllIlllIllll[3]];
        iArr[lllIlllIllll[0]] = lllIlllIllll[10];
        if (lIIIllIllllllll(Equipment.contains(iArr) ? 1 : 0)) {
            d = 20.0d;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            d = 10.0d;
        }
        double d4 = d;
        if (!lIIIlllIIIIIIII(this.cM.X().isEmpty() ? 1 : 0) || lIIIllIllllllll(this.cM.W().get(this.cM.Q() - lllIlllIllll[3]).isEmpty() ? 1 : 0)) {
            switch (this.cM.Q()) {
                case 1:
                case 2:
                case 3:
                    return lllIlllIllll[3];
                case 4:
                    return lllIlllIllll[0];
            }
        }
        double orElse = this.cM.X().stream().mapToDouble((v0) -> {
            return v0.toMillis();
        }).average().orElse(0.0d) / 1000.0d;
        double orElse2 = this.cM.W().get(this.cM.Q() - lllIlllIllll[3]).stream().mapToDouble((v0) -> {
            return v0.toMillis();
        }).average().orElse(0.0d) / 1000.0d;
        if (lIIIlllIIIIIIlI(this.cM.Q(), lllIlllIllll[6])) {
            d2 = (orElse - orElse2) - (this.cM.W().get(lllIlllIllll[6]).stream().mapToDouble((v0) -> {
                return v0.toMillis();
            }).average().orElse(0.0d) / 1000.0d);
            "".length();
            if (0 != 0) {
                return ((51 ^ 69) ^ (37 ^ 48)) & (((167 ^ 178) ^ (4 ^ 114)) ^ (-" ".length()));
            }
        } else {
            d2 = orElse - orElse2;
        }
        double d5 = (d2 / 30.0d) * d4;
        if (lIIIlllIIIIIIlI(this.cM.Q(), lllIlllIllll[6])) {
            d3 = 105.0d;
            "".length();
            if (0 != 0) {
                return true & ((true ^ true) ^ true);
            }
        } else {
            d3 = 100.0d;
        }
        if (lIIIlllIIIIIlll(lIIIlllIIIIIlIl(d5 + specialAttackEnergy, d3))) {
            ?? r0 = lllIlllIllll[3];
            "".length();
            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlllIllll[0];
    }

    private static int lIIIlllIIIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIIllIllllllIl() {
        lllIlllIlllI = new String[lllIlllIllll[14]];
        lllIlllIlllI[lllIlllIllll[0]] = lIIIllIlllllIlI("Dgg6chwyEzoiTy4IOiBPJBcqMU8gAi4iADlHPDcbIhdvJQYjD28zTyACLiIAOUc7Og4jRyczHHcJIHIcJwIsc052", "WgORo");
        lllIlllIlllI[lllIlllIllll[3]] = lIIIllIlllllIlI("ByYmAy9EJzwbawEoJ08tCyY3Tz8LaTUdLgFpJh9rFzkyDC5ELzwdaxc5NgxrFz4yH3Rb", "dISoK");
        lllIlllIlllI[lllIlllIllll[4]] = lIIIllIlllllIll("RYer7sThQypjKyxr7xUFrjc8bwQG41dpOveoP6RMf/cmEm+BxkqBMUSEavN3gQM5/hTs0f5Ih8X4a2jng0/z5UYZq0uVbVsobkd/MBpvmXey5nEQM9gLadZBMVaDtdJPiOpyzVzJQyE8r2exRGwRqw==", "oCciw");
        lllIlllIlllI[lllIlllIllll[5]] = lIIIllIlllllIlI("BTMEPwA=", "AAmQk");
        lllIlllIlllI[lllIlllIllll[6]] = lIIIllIlllllIll("qGHZC+ZBA3G1NRvWsBNeNYaA0leGfOX6KhN0rijAIW+iLmpRfQI56Glg8PEkc/mEFRFLEbFQX4o=", "gNkMc");
        lllIlllIlllI[lllIlllIllll[7]] = lIIIllIllllllII("JpcjrBW9S2Y=", "zkuiu");
        lllIlllIlllI[lllIlllIllll[8]] = lIIIllIlllllIlI("Nh0lJDYc", "wiQEU");
        lllIlllIlllI[lllIlllIllll[11]] = lIIIllIlllllIll("lqlkdkr/nAJwk7SCDKUYDQ==", "RXatf");
        lllIlllIlllI[lllIlllIllll[12]] = lIIIllIlllllIll("Pby945kyX3A=", "TlOXb");
        lllIlllIlllI[lllIlllIllll[13]] = lIIIllIlllllIlI("ODcgDw==", "ZEExS");
        lllIlllIlllI[lllIlllIllll[9]] = lIIIllIllllllII("jqsCPwyVMgQ=", "BQRWf");
    }

    private static void lIIIllIlllllllI() {
        lllIlllIllll = new int[15];
        lllIlllIllll[0] = (27 ^ 50) & ((6 ^ 47) ^ (-1));
        lllIlllIllll[1] = (-((-909) & 24493)) & (-66) & 24555;
        lllIlllIllll[2] = (-8269) & 32493;
        lllIlllIllll[3] = " ".length();
        lllIlllIllll[4] = "  ".length();
        lllIlllIllll[5] = "   ".length();
        lllIlllIllll[6] = 83 ^ 87;
        lllIlllIllll[7] = (((10 + 181) - 162) + 156) ^ (((75 + 52) - 119) + 180);
        lllIlllIllll[8] = 8 ^ 14;
        lllIlllIllll[9] = 28 ^ 22;
        lllIlllIllll[10] = (-4225) & 30199;
        lllIlllIllll[11] = 35 ^ 36;
        lllIlllIllll[12] = (((16 + 0) - (-46)) + 86) ^ (((16 + 26) - (-50)) + 64);
        lllIlllIllll[13] = 39 ^ 46;
        lllIlllIllll[14] = (61 ^ 117) ^ (14 ^ 77);
    }

    private static boolean lIIIlllIIIIIlll(int i) {
        return i >= 0;
    }

    @Inject
    public an(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f, c0008e);
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.af, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.specGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIlllIIIIIIII(int i) {
        return i == 0;
    }

    private static boolean lIIIllIllllllll(int i) {
        return i != 0;
    }

    private static String lIIIllIlllllIlI(String lllllllllllllllIIllIIlIIIIlllIIl, String lllllllllllllllIIllIIlIIIIlllIII) {
        String lllllllllllllllIIllIIlIIIIlllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIlIIIIlllIII.toCharArray();
        int lllllllllllllllIIllIIlIIIIllIlIl = lllIlllIllll[0];
        char[] charArray2 = lllllllllllllllIIllIIlIIIIlllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIllll[0];
        while (lIIIlllIIIIIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIlIIIIllIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIIlIIIIllIlIl++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.af, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        if (!lIIIllIllllllll(this.cK.assistantMode() ? 1 : 0) && !lIIIlllIIIIIIII(cs() ? 1 : 0)) {
            if (lIIIllIllllllll(SquireNightmarePlugin.D.contains(Integer.valueOf(this.cS.getId())) ? 1 : 0)) {
                int i = cq().get(EquipmentInventorySlot.WEAPON);
                if (lIIIlllIIIIIIII(Arrays.stream(Static.getClient().getEnum(lllIlllIllll[1]).getKeys()).anyMatch(i2 -> {
                    if (lIIIlllIIIIIIlI(i2, i)) {
                        ?? r0 = lllIlllIllll[3];
                        "".length();
                        return (((((78 + 83) - 40) + 41) ^ (((87 + 38) - 37) + 102)) & (((26 ^ 48) ^ (180 ^ 130)) ^ (-" ".length()))) < 0 ? ((53 ^ 63) ^ (115 ^ 86)) & (((17 ^ 3) ^ (55 ^ 10)) ^ (-" ".length())) : r0;
                    }
                    return lllIlllIllll[0];
                }) ? 1 : 0)) {
                    Log.warn(lllIlllIlllI[lllIlllIllll[0]]);
                    return lllIlllIllll[0];
                }
                if ((!lIIIlllIIIIIIIl(Players.getLocal().getInteracting()) || !lIIIlllIIIIIIlI(i, lllIlllIllll[2])) && !lIIIlllIIIIIIII(cC() ? 1 : 0)) {
                    if (lIIIllIllllllll(cu() ? 1 : 0)) {
                        return cA();
                    }
                }
                return lllIlllIllll[0];
            }
            return lllIlllIllll[0];
        }
        return lllIlllIllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    private boolean cA() {
        if (!lIIIllIllllllll(Inventory.isFull() ? 1 : 0) || !lIIIlllIIIIIIll(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) || !lIIIlllIIIIIlII(cq().get(EquipmentInventorySlot.SHIELD))) {
            if (lIIIlllIIIIIIII(cq().isEquipped() ? 1 : 0)) {
                cq().swap();
            }
            if (lIIIlllIIIIIIII(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
                Combat.toggleSpec();
            }
            this.cS.interact(lllIlllIlllI[lllIlllIllll[8]]);
            return lllIlllIllll[3];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lllIlllIllll[3]];
            strArr[lllIlllIllll[0]] = lllIlllIlllI[lllIlllIllll[9]];
            return item.hasAction(strArr);
        });
        if (!lIIIlllIIIIIIIl(first)) {
            first.interact(lllIlllIlllI[lllIlllIllll[7]]);
            return lllIlllIllll[3];
        }
        ee.info(lllIlllIlllI[lllIlllIllll[3]]);
        Item first2 = Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[13]]);
        });
        if (lIIIlllIIIIIIll(first2)) {
            first2.drop();
            return lllIlllIllll[3];
        }
        Log.warn(lllIlllIlllI[lllIlllIllll[4]]);
        Item first3 = Inventory.getFirst(item3 -> {
            if (!lIIIlllIIIIIIII(item3.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[11]]) ? 1 : 0) || lIIIllIllllllll(item3.getName().toLowerCase().contains(lllIlllIlllI[lllIlllIllll[12]]) ? 1 : 0)) {
                ?? r0 = lllIlllIllll[3];
                "".length();
                return "  ".length() <= ((65 ^ 94) & ((138 ^ 149) ^ (-1))) ? (true ^ true) & ((false ^ true) ^ true) : r0;
            }
            return lllIlllIllll[0];
        });
        if (!lIIIlllIIIIIIll(first3)) {
            Log.error(lllIlllIlllI[lllIlllIllll[6]]);
            return lllIlllIllll[0];
        }
        first3.interact(lllIlllIlllI[lllIlllIllll[5]]);
        first3.drop();
        return lllIlllIllll[3];
    }

    private static boolean lIIIlllIIIIIlII(int i) {
        return i <= 0;
    }

    private static String lIIIllIlllllIll(String lllllllllllllllIIllIIlIIIlIIlIIl, String lllllllllllllllIIllIIlIIIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), lllIlllIllll[12]), "DES");
            Cipher lllllllllllllllIIllIIlIIIlIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIIIlIIlIll.init(lllIlllIllll[4], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIIIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIIlIIlIlI) {
            lllllllllllllllIIllIIlIIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIIIIIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIllIlllllllI();
        lIIIllIllllllIl();
        ee = LoggerFactory.getLogger(an.class);
    }

    private static String lIIIllIllllllII(String lllllllllllllllIIllIIlIIIIlIIlII, String lllllllllllllllIIllIIlIIIIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIIIIlIIllI.init(lllIlllIllll[4], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIIIlIIlIl) {
            lllllllllllllllIIllIIlIIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIIlI(int i, int i2) {
        return i == i2;
    }
}
