package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling Spec and Gear", priority = 305)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.x  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/x.class */
public class x extends Task {
    private static /* synthetic */ int[] lIllIllIIIII;
    final /* synthetic */ SquireDukeSucellusConfig aU;
    final /* synthetic */ SquireDukeSucellus aS;
    private static /* synthetic */ String[] lIllIlIlllll;
    final /* synthetic */ C0000a aT;

    @Inject
    public x(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aS = squireDukeSucellus;
        this.aT = squireDukeSucellus.s();
        this.aU = squireDukeSucellusConfig;
    }

    private static String lllIlIIIlIlIlI(String lllllllllllllllIlIllllIIIIIIIlll, String lllllllllllllllIlIllllIIIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIllIIIII[12]), "DES");
            Cipher lllllllllllllllIlIllllIIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIIIIIlIIl.init(lIllIllIIIII[5], lllllllllllllllIlIllllIIIIIIlIlI);
            return new String(lllllllllllllllIlIllllIIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIIIIIlIII) {
            lllllllllllllllIlIllllIIIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIllIlIl(int i, int i2) {
        return i == i2;
    }

    private int T() {
        return Static.getClient().getEnum(lIllIllIIIII[4]).getIntValue(S().get(EquipmentInventorySlot.WEAPON)) / lIllIllIIIII[6];
    }

    private static boolean lllIlIIIllIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIIIllIllI(int i, int i2) {
        return i < i2;
    }

    private static String lllIlIIIlIllII(String lllllllllllllllIlIlllIlllllllIlI, String lllllllllllllllIlIlllIlllllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIllllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIllllllllII.init(lIllIllIIIII[5], secretKeySpec);
            return new String(lllllllllllllllIlIlllIllllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlllllllIll) {
            lllllllllllllllIlIlllIlllllllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIlllI() {
        lIllIllIIIII = new int[13];
        lIllIllIIIII[0] = ((44 ^ 30) ^ (245 ^ 142)) & (((((251 + 117) - 301) + 185) ^ (((179 + 87) - 90) + 5)) ^ (-" ".length()));
        lIllIllIIIII[1] = " ".length();
        lIllIllIIIII[2] = (-((-9763) & 13987)) & (-2057) & 32255;
        lIllIllIIIII[3] = (232 ^ 188) ^ (136 ^ 178);
        lIllIllIIIII[4] = (-((-21250) & 32551)) & (-16449) & 28655;
        lIllIllIIIII[5] = "  ".length();
        lIllIllIIIII[6] = (7 ^ 79) ^ (232 ^ 170);
        lIllIllIIIII[7] = "   ".length();
        lIllIllIIIII[8] = (171 ^ 148) ^ (6 ^ 61);
        lIllIllIIIII[9] = 33 ^ 36;
        lIllIllIIIII[10] = 194 ^ 196;
        lIllIllIIIII[11] = 75 ^ 76;
        lIllIllIIIII[12] = (((92 + 158) - 190) + 103) ^ (((146 + 126) - 216) + 115);
    }

    private void U() {
        EquipmentSetup equipmentSetup = ((BankLoadout) this.aU.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (lllIlIIIllIIII(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private static boolean lllIlIIIlIllll(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIIllIIlI(int i) {
        return i != 0;
    }

    private static boolean lllIlIIIllIIIl(Object obj) {
        return obj != null;
    }

    static {
        lllIlIIIlIlllI();
        lllIlIIIlIllIl();
    }

    private static void lllIlIIIlIllIl() {
        lIllIlIlllll = new String[lIllIllIIIII[11]];
        lIllIlIlllll[lIllIllIIIII[0]] = lllIlIIIlIlIlI("xpq9AJokVXY=", "YcgVW");
        lIllIlIlllll[lIllIllIIIII[1]] = lllIlIIIlIlIll("BSAiNQ==", "KOLPl");
        lIllIlIlllll[lIllIllIIIII[5]] = lllIlIIIlIllII("QRSQKQu89+8oxcMO76trDPnLZ451YcAaUp93T2exC3fKPNqXR5w8uVF2rVUjKA3Vg0Q497GjoIqVDilveGc+aHuCX5UTulee", "dBVxF");
        lIllIlIlllll[lIllIllIIIII[7]] = lllIlIIIlIlIll("IjIODg==", "eSzkV");
        lIllIlIlllll[lIllIllIIIII[8]] = lllIlIIIlIllII("FZOjeNYO5jZTDkly7GZ2NA==", "GRwIJ");
        lIllIlIlllll[lIllIllIIIII[9]] = lllIlIIIlIlIlI("i7tyQzXItyUWWTFOoqP6gw==", "bmBVX");
        lIllIlIlllll[lIllIllIIIII[10]] = lllIlIIIlIlIll("MBgBNDsa", "qluUX");
    }

    private static boolean lllIlIIIllIIII(int i) {
        return i == 0;
    }

    private static boolean lllIlIIIllIIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        if (lllIlIIIlIllll(NPCs.getNearest(npc -> {
            if (lllIlIIIllIIlI(npc.getName().equals(lIllIlIlllll[lIllIllIIIII[9]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIllIIIII[1]];
                strArr[lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[10]];
                if (lllIlIIIllIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIllIIIII[1];
                    "".length();
                    return "   ".length() < (-" ".length()) ? ((((63 + 25) - 61) + 106) ^ (((63 + 117) - 47) + 62)) & (((38 ^ 80) ^ (144 ^ 160)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIllIIIII[0];
        }))) {
            if (lllIlIIIllIIII(this.aU.lightbearer() ? 1 : 0)) {
                return lIllIllIIIII[0];
            }
            int[] iArr = new int[lIllIllIIIII[1]];
            iArr[lIllIllIIIII[0]] = lIllIllIIIII[2];
            Item first = Inventory.getFirst(iArr);
            if (lllIlIIIlIllll(first)) {
                return lIllIllIIIII[0];
            }
            first.interact(lIllIlIlllll[lIllIllIIIII[0]]);
            return lIllIllIIIII[0];
        }
        if (!lllIlIIIlIllll(TileObjects.getNearest(tileObject -> {
            if (lllIlIIIllIIlI(tileObject.getName().equals(lIllIlIlllll[lIllIllIIIII[7]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIllIIIII[1]];
                strArr[lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[8]];
                if (lllIlIIIllIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIllIIIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIllIIIII[0];
        })) && !lllIlIIIlIllll(Players.getLocal())) {
            String selected = this.aU.specGear().getSelected();
            if (!lllIlIIIllIIIl(selected) || lllIlIIIllIIlI(selected.equals(lIllIlIlllll[lIllIllIIIII[1]]) ? 1 : 0)) {
                return lIllIllIIIII[0];
            }
            if (!lllIlIIIllIIll(CombatOptions.getSpecialAttackEnergy(), T()) || (lllIlIIIllIIlI(this.aU.lowHpSpec() ? 1 : 0) && lllIlIIIllIlII(this.aT.u(), lIllIllIIIII[3]))) {
                U();
                return lIllIllIIIII[0];
            }
            int i = S().get(EquipmentInventorySlot.WEAPON);
            if (lllIlIIIllIIII(Arrays.stream(Static.getClient().getEnum(lIllIllIIIII[4]).getKeys()).anyMatch(i2 -> {
                if (lllIlIIIllIlIl(i2, i)) {
                    ?? r0 = lIllIllIIIII[1];
                    "".length();
                    return ((196 ^ 150) & ((103 ^ 53) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIllIIIII[0];
            }) ? 1 : 0)) {
                Log.warn(lIllIlIlllll[lIllIllIIIII[5]]);
                return lIllIllIIIII[0];
            }
            if (lllIlIIIllIIII(S().isEquipped() ? 1 : 0)) {
                S().swap();
            }
            if (lllIlIIIllIIlI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
                return lIllIllIIIII[0];
            }
            Combat.toggleSpec();
            return lIllIllIIIII[1];
        }
        return lIllIllIIIII[0];
    }

    private static String lllIlIIIlIlIll(String lllllllllllllllIlIlllIlllllIlIlI, String lllllllllllllllIlIlllIlllllIlIIl) {
        String lllllllllllllllIlIlllIlllllIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllllIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIlllllIlIIl.toCharArray();
        int lllllllllllllllIlIlllIlllllIIllI = lIllIllIIIII[0];
        char[] charArray2 = lllllllllllllllIlIlllIlllllIlIlI2.toCharArray();
        int lllllllllllllllIlIlllIllllIlllll = charArray2.length;
        int lllllllllllllllIlIlllIllllIllllI = lIllIllIIIII[0];
        while (lllIlIIIllIllI(lllllllllllllllIlIlllIllllIllllI, lllllllllllllllIlIlllIllllIlllll)) {
            char lllllllllllllllIlIlllIlllllIlIll = charArray2[lllllllllllllllIlIlllIllllIllllI];
            lllllllllllllllIlIlllIlllllIlIII.append((char) (lllllllllllllllIlIlllIlllllIlIll ^ charArray[lllllllllllllllIlIlllIlllllIIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlllllIIllI++;
            lllllllllllllllIlIlllIllllIllllI++;
            "".length();
            if ((((((183 + 122) - 211) + 104) ^ (((127 + 145) - 259) + 141)) & (((166 ^ 149) ^ (239 ^ 128)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlllllIlIII);
    }

    private EquipmentSetup S() {
        return (EquipmentSetup) this.aU.specGear().selected(EquipmentSetup.class);
    }
}
