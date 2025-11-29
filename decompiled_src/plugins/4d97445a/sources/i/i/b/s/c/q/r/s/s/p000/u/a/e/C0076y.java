package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Special Attack", priority = 15)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/y.class */
public class C0076y extends Task {
    private final /* synthetic */ SquireCerberusConfig aN;
    private static /* synthetic */ String[] llIIIIIIl;
    private static final /* synthetic */ int aM;
    private final /* synthetic */ C0000a aO;
    private static /* synthetic */ int[] llIIllIII;

    private static boolean lIllIIlIllI(int i2) {
        return i2 == 0;
    }

    private static void lIlIlIIIlII() {
        llIIIIIIl = new String[llIIllIII[7]];
        llIIIIIIl[llIIllIII[0]] = lIlIlIIIIlI("EiUW", "WDbaH");
        llIIIIIIl[llIIllIII[1]] = lIlIlIIIIll("d2EhhlKO5DE=", "KNInT");
        llIIIIIIl[llIIllIII[6]] = lIlIlIIIIll("aYGn3ZHZetU=", "EHIuO");
    }

    @Inject
    public C0076y(SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.aN = squireCerberusConfig;
        this.aO = c0000a;
    }

    static {
        lIllIIlIlIl();
        lIlIlIIIlII();
        aM = llIIllIII[4];
    }

    public static int j(int i2) {
        return lIllIIllIll(i2, llIIllIII[2]) ? llIIllIII[3] : Static.getClient().getEnum(llIIllIII[4]).getIntValue(i2) / llIIllIII[5];
    }

    private static boolean lIllIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlllII(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIIllIII(Object obj) {
        return obj == null;
    }

    private static String lIlIlIIIIlI(String lIllIIllIllIIIl, String lIllIIllIllIIII) {
        String lIllIIllIllIIIl2 = new String(Base64.getDecoder().decode(lIllIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllIlIllll = new StringBuilder();
        char[] charArray = lIllIIllIllIIII.toCharArray();
        int lIllIIllIlIllIl = llIIllIII[0];
        char[] charArray2 = lIllIIllIllIIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = llIIllIII[0];
        while (lIllIIllIlI(i2, length)) {
            char lIllIIllIllIIlI = charArray2[i2];
            lIllIIllIlIllll.append((char) (lIllIIllIllIIlI ^ charArray[lIllIIllIlIllIl % charArray.length]));
            "".length();
            lIllIIllIlIllIl++;
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIllIIllIlIllll);
    }

    private static boolean lIllIIllIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIllIIllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIllIIllIIl(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    public boolean run() {
        int i2;
        if (lIllIIlIllI(this.aN.cerbSpecGear().isSelected() ? 1 : 0)) {
            return llIIllIII[0];
        }
        C0055d k = this.aO.k();
        if (!lIllIIlIlll(k) || lIllIIllIII(k.y())) {
            return llIIllIII[0];
        }
        if (lIllIIlIllI(Reachable.isInteractable(k.y()) ? 1 : 0)) {
            return llIIllIII[0];
        }
        EquipmentSetup equipmentSetup = ((BankLoadout) this.aN.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        EquipmentSetup equipmentSetup2 = (EquipmentSetup) this.aN.cerbSpecGear().selected(EquipmentSetup.class);
        if (lIllIIllIIl(Combat.getSpecEnergy(), j(equipmentSetup2.get(EquipmentInventorySlot.WEAPON)))) {
            i2 = llIIllIII[1];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llIIllIII[0];
        }
        if (lIllIIlIllI(i2)) {
            if (lIllIIlIllI(Gear.isEquipped(equipmentSetup.getIds()) ? 1 : 0)) {
                Gear.swapTo(equipmentSetup);
                "".length();
                return llIIllIII[1];
            }
            return llIIllIII[0];
        } else if (!lIllIIlIllI(Gear.isEquipped(equipmentSetup2.getIds()) ? 1 : 0)) {
            if (lIllIIlIllI(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
                return llIIllIII[1];
            }
            return llIIllIII[0];
        } else if (!lIllIIllIlI(Inventory.getFreeSlots(), llIIllIII[1])) {
            Gear.swapTo(equipmentSetup2);
            "".length();
            return llIIllIII[1];
        } else {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llIIllIII[1]];
                strArr[llIIllIII[0]] = llIIIIIIl[llIIllIII[1]];
                if (lIllIIlllII(item.hasAction(strArr) ? 1 : 0) && lIllIIlIllI(item.getName().contains(llIIIIIIl[llIIllIII[6]]) ? 1 : 0)) {
                    ?? r0 = llIIllIII[1];
                    "".length();
                    return 0 != 0 ? ((107 ^ 33) ^ (12 ^ 29)) & (((70 ^ 17) ^ (98 ^ 110)) ^ (-" ".length())) : r0;
                }
                return llIIllIII[0];
            });
            if (lIllIIlIlll(first)) {
                first.interact(llIIIIIIl[llIIllIII[0]]);
                return llIIllIII[1];
            }
            return llIIllIII[0];
        }
    }

    private static void lIllIIlIlIl() {
        llIIllIII = new int[8];
        llIIllIII[0] = (31 ^ 17) & ((21 ^ 27) ^ (-1));
        llIIllIII[1] = " ".length();
        llIIllIII[2] = -" ".length();
        llIIllIII[3] = (-16391) & 17727;
        llIIllIII[4] = (-19570) & 20475;
        llIIllIII[5] = (((74 + 127) - 143) + 92) ^ (((6 + 71) - 9) + 88);
        llIIllIII[6] = "  ".length();
        llIIllIII[7] = "   ".length();
    }

    private static String lIlIlIIIIll(String lIllIIllIIlllII, String lIllIIllIIllIll) {
        try {
            SecretKeySpec lIllIIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIllIIllllI = Cipher.getInstance("Blowfish");
            lIllIIllIIllllI.init(llIIllIII[6], lIllIIllIIlllll);
            return new String(lIllIIllIIllllI.doFinal(Base64.getDecoder().decode(lIllIIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIllIIlllIl) {
            lIllIIllIIlllIl.printStackTrace();
            return null;
        }
    }
}
