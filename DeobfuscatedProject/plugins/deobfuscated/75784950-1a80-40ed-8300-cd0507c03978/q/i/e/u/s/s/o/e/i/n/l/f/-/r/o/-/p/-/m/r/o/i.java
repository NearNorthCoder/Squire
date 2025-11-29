/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Waiting rooms")
public class i
extends Task {
    private static /* synthetic */ String[] lIIIIIIlIlIll;
    private static /* synthetic */ int[] lIIIIIIlIllIl;
    final /* synthetic */ WorldArea ad;
    private final /* synthetic */ SquireMoonsOfPerilConfig ac;
    final /* synthetic */ WorldArea ae;
    final /* synthetic */ WorldArea af;

    @Inject
    public i(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.ad = new WorldArea(lIIIIIIlIllIl[0], lIIIIIIlIllIl[1], lIIIIIIlIllIl[2], lIIIIIIlIllIl[3], lIIIIIIlIllIl[4]);
        this.ae = new WorldArea(lIIIIIIlIllIl[5], lIIIIIIlIllIl[6], lIIIIIIlIllIl[7], lIIIIIIlIllIl[2], lIIIIIIlIllIl[4]);
        this.af = new WorldArea(lIIIIIIlIllIl[8], lIIIIIIlIllIl[9], lIIIIIIlIllIl[10], lIIIIIIlIllIl[11], lIIIIIIlIllIl[4]);
        this.ac = squireMoonsOfPerilConfig;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.ac.blueMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllllIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlllllIIIIl(Object object) {
        return object != null;
    }

    private boolean e() {
        boolean bl;
        if (!i.lIIlIllllIllllI(this.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !i.lIIlIllllIllllI(this.ae.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || i.lIIlIlllllIIIII(this.af.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lIIIIIIlIllIl[12];
            0;
            if (2 <= ((0xA4 ^ 0x94) & ~(0xBC ^ 0x8C))) {
                return ((0x91 ^ 0x94) & ~(0xA3 ^ 0xA6)) != 0;
            }
        } else {
            bl = lIIIIIIlIllIl[4];
        }
        return bl;
    }

    private static String lIIlIllllIllIIl(String lllllllllllllllIIIlllIllIIlIIIll, String lllllllllllllllIIIlllIllIIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIllIl[18]), "DES");
            Cipher lllllllllllllllIIIlllIllIIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIIlllIllIIlIIlIl.init(lIIIIIIlIllIl[13], lllllllllllllllIIIlllIllIIlIIllI);
            return new String(lllllllllllllllIIIlllIllIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIllIIlIIlII) {
            lllllllllllllllIIIlllIllIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIllllI(int n) {
        return n == 0;
    }

    public boolean run() {
        i lllllllllllllllIIIlllIllIlIIIllI;
        if (i.lIIlIllllIllllI(this.e() ? 1 : 0)) {
            return lIIIIIIlIllIl[4];
        }
        if (i.lIIlIlllllIIIII(lllllllllllllllIIIlllIllIlIIIllI.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && i.lIIlIllllIllllI(lllllllllllllllIIIlllIllIlIIIllI.b().isFullyEquipped() ? 1 : 0)) {
            if (i.lIIlIlllllIIIII(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIllIl[12]];
                stringArray[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[4]];
                if (i.lIIlIlllllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0) && i.lIIlIlllllIIIIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && i.lIIlIlllllIIIlI(lllllllllllllllIIIlllIllIlIIIllI.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIllIl[12]];
                    stringArray2[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[12]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIlIlIll[lIIIIIIlIllIl[13]]);
                }
            }
            lllllllllllllllIIIlllIllIlIIIllI.b().swap();
        }
        SquireMoonsOfPeril.g = lIIIIIIlIlIll[lIIIIIIlIllIl[14]];
        String[] stringArray = new String[lIIIIIIlIllIl[12]];
        stringArray[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[15]];
        TileObject lllllllllllllllIIIlllIllIlIIIlIl = TileObjects.getNearest((String[])stringArray);
        if (i.lIIlIlllllIIIIl(lllllllllllllllIIIlllIllIlIIIlIl)) {
            lllllllllllllllIIIlllIllIlIIIlIl.interact(lIIIIIIlIlIll[lIIIIIIlIllIl[16]]);
            return lIIIIIIlIllIl[12];
        }
        return lIIIIIIlIllIl[4];
    }

    private static void lIIlIllllIllIlI() {
        lIIIIIIlIlIll = new String[lIIIIIIlIllIl[17]];
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[4]] = i."Cooked bream";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[12]] = i."Cooked bream";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[13]] = i."Eat";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[14]] = i."Use Statue";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[15]] = i."Statue";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[16]] = i."Use";
    }

    private static boolean lIIlIlllllIIIlI(int n) {
        return n <= 0;
    }

    private static boolean lIIlIlllllIIIII(int n) {
        return n != 0;
    }

    private static String lIIlIllllIllIII(String lllllllllllllllIIIlllIllIIllIIll, String lllllllllllllllIIIlllIllIIllIlll) {
        lllllllllllllllIIIlllIllIIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllIllIIllIllI = new StringBuilder();
        char[] lllllllllllllllIIIlllIllIIllIlIl = lllllllllllllllIIIlllIllIIllIlll.toCharArray();
        int lllllllllllllllIIIlllIllIIllIlII = lIIIIIIlIllIl[4];
        char[] lllllllllllllllIIIlllIllIIlIlllI = lllllllllllllllIIIlllIllIIllIIll.toCharArray();
        int lllllllllllllllIIIlllIllIIlIllIl = lllllllllllllllIIIlllIllIIlIlllI.length;
        int lllllllllllllllIIIlllIllIIlIllII = lIIIIIIlIllIl[4];
        while (i.lIIlIlllllIIIll(lllllllllllllllIIIlllIllIIlIllII, lllllllllllllllIIIlllIllIIlIllIl)) {
            char lllllllllllllllIIIlllIllIIlllIIl = lllllllllllllllIIIlllIllIIlIlllI[lllllllllllllllIIIlllIllIIlIllII];
            lllllllllllllllIIIlllIllIIllIllI.append((char)(lllllllllllllllIIIlllIllIIlllIIl ^ lllllllllllllllIIIlllIllIIllIlIl[lllllllllllllllIIIlllIllIIllIlII % lllllllllllllllIIIlllIllIIllIlIl.length]));
            0;
            ++lllllllllllllllIIIlllIllIIllIlII;
            ++lllllllllllllllIIIlllIllIIlIllII;
            0;
            if (3 > 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllIllIIllIllI);
    }

    private static void lIIlIllllIlllIl() {
        lIIIIIIlIllIl = new int[19];
        i.lIIIIIIlIllIl[0] = -(0xFFFFAB8B & 0x5E7D) & (0xFFFF8F9F & Short.MAX_VALUE);
        i.lIIIIIIlIllIl[1] = -(0x96 ^ 0x93) & (0xFFFFFFB7 & 0x25FF);
        i.lIIIIIIlIllIl[2] = 0x2C ^ 0x3E;
        i.lIIIIIIlIllIl[3] = 8 ^ 4;
        i.lIIIIIIlIllIl[4] = (0xFF ^ 0xBF) & ~(0xC6 ^ 0x86);
        i.lIIIIIIlIllIl[5] = -(0xFFFFFB9D & 0x7C7F) & (0xFFFFFFFF & 0x7D9C);
        i.lIIIIIIlIllIl[6] = -(0xFFFFD0E9 & 0x6F7F) & (0xFFFFF7FF & 0x6DFF);
        i.lIIIIIIlIllIl[7] = 0xB7 ^ 0x95 ^ (0xF ^ 0x22);
        i.lIIIIIIlIllIl[8] = -(0xFFFFDBDF & 0x3E66) & (0xFFFFFFF7 & 0x1FFF);
        i.lIIIIIIlIllIl[9] = 0xFFFFBDFF & 0x6798;
        i.lIIIIIIlIllIl[10] = 0x8C ^ 0x81;
        i.lIIIIIIlIllIl[11] = 10 + 105 - 66 + 109 ^ 57 + 73 - 80 + 92;
        i.lIIIIIIlIllIl[12] = 1;
        i.lIIIIIIlIllIl[13] = 2;
        i.lIIIIIIlIllIl[14] = 3;
        i.lIIIIIIlIllIl[15] = 0xAE ^ 0xAA;
        i.lIIIIIIlIllIl[16] = 0x23 ^ 0x6F ^ (0xF3 ^ 0xBA);
        i.lIIIIIIlIllIl[17] = 3 + 64 - -63 + 32 ^ 137 + 80 - 152 + 99;
        i.lIIIIIIlIllIl[18] = 0xBE ^ 0xB6;
    }

    static {
        i.lIIlIllllIlllIl();
        i.lIIlIllllIllIlI();
    }
}

