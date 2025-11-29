/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

public abstract class U
extends Task {
    protected final /* synthetic */ SquireChambersConfig cp;
    private static /* synthetic */ int[] lIlIIIIIllII;
    protected static /* synthetic */ a aa;
    private static /* synthetic */ String[] lIlIIIIIlIll;
    protected /* synthetic */ Random cr;
    protected final /* synthetic */ SquireChambersPlugin co;
    protected /* synthetic */ Player bS;
    protected final /* synthetic */ Client cq;

    /*
     * WARNING - void declaration
     */
    protected boolean e(n n2) {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (U.llIlIlIIIllIlI(tileObject.getName().equals(lIlIIIIIlIll[lIlIIIIIllII[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIllII[0]];
                stringArray[U.lIlIIIIIllII[1]] = lIlIIIIIlIll[lIlIIIIIllII[5]];
                if (U.llIlIlIIIllIlI(tileObject.hasAction(stringArray) ? 1 : 0) && U.llIlIlIIIllIlI(n2.a((Locatable)tileObject) ? 1 : 0)) {
                    n3 = lIlIIIIIllII[0];
                    "".length();
                    if (" ".length() >= " ".length()) return n3 != 0;
                    return ((0x2C ^ 0x72) & ~(0x4C ^ 0x12)) != 0;
                }
            }
            n3 = lIlIIIIIllII[1];
            return n3 != 0;
        });
        if (U.llIlIlIIIlllII(tileObject2)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIlIIIII(Movement.getRunEnergy(), lIlIIIIIllII[3])) {
            U lllllllllllllllIlllIIlIIIllIIlIl;
            void lllllllllllllllIlllIIlIIIllIIIll;
            if (U.llIlIlIIIlIlll(Movement.getRunEnergy(), lIlIIIIIllII[4]) && U.llIlIlIIIlIlll(lllllllllllllllIlllIIlIIIllIIIll.distanceTo((Locatable)lllllllllllllllIlllIIlIIIllIIlIl.bS), lIlIIIIIllII[5])) {
                lllllllllllllllIlllIIlIIIllIIIll.interact(lIlIIIIIlIll[lIlIIIIIllII[1]]);
                return lIlIIIIIllII[0];
            }
            return lIlIIIIIllII[1];
        }
        tileObject2.interact(lIlIIIIIlIll[lIlIIIIIllII[0]]);
        return lIlIIIIIllII[0];
    }

    private static boolean llIlIlIIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private void cl() {
        List<Prayer> list = this.ci();
        if (U.llIlIlIIIlllIl(list) && U.llIlIlIIIlIllI(list.isEmpty() ? 1 : 0) && U.llIlIlIIIllllI(Prayers.getPoints())) {
            void lllllllllllllllIlllIIlIIIllIllIl;
            if (U.llIlIlIIIllIIl((Object)this.co.L().aM(), (Object)N.VESPULA)) {
                Prayers.flick(list, (boolean)lIlIIIIIllII[0]);
                "".length();
                return;
            }
            Prayers.flick((List)lllllllllllllllIlllIIlIIIllIllIl);
            "".length();
            "".length();
            if (((0x87 ^ 0xC2) & ~(0x22 ^ 0x67)) > 0) {
                return;
            }
        } else {
            Prayers.disableAll();
        }
    }

    private static boolean llIlIlIIIlllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean cn() {
        void var1_1;
        U lllllllllllllllIlllIIlIIIllIIIII;
        if (U.llIlIlIIIllIlI(Inventory.contains(item -> item.getName().startsWith(lIlIIIIIlIll[lIlIIIIIllII[9]])) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        TileItem lllllllllllllllIlllIIlIIIlIlllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (U.llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[8]) && U.llIlIlIIIllIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIIIIIllII[0];
                "".length();
                if (" ".length() < ((0x15 ^ 0x5E ^ (0x32 ^ 0x76)) & (112 + 43 - 144 + 118 ^ 140 + 23 - 62 + 41 ^ -" ".length()))) {
                    return ((0x3E ^ 0x2C ^ (0x1E ^ 0x50) & ~(0x29 ^ 0x67)) & (0xB ^ 0x6E ^ (0x76 ^ 1) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIIIIllII[1];
            }
            return n2 != 0;
        });
        if (U.llIlIlIIIlllII(lllllllllllllllIlllIIlIIIlIlllll)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIllIIIII.co.x();
            "".length();
            return lIlIIIIIllII[0];
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllIIIII.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        }
        var1_1.interact(lIlIIIIIlIll[lIlIIIIIllII[6]]);
        return lIlIIIIIllII[0];
    }

    protected boolean co() {
        U lllllllllllllllIlllIIlIIIlIlllII;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (U.llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[7]) && U.llIlIlIIIllIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIIIIIllII[0];
                "".length();
                if (" ".length() <= 0) {
                    return ((0x56 ^ 0x42 ^ (0xA3 ^ 0x87)) & (0x5F ^ 3 ^ (0x28 ^ 0x44) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIIIIllII[1];
            }
            return n2 != 0;
        });
        if (U.llIlIlIIIlllII(tileItem2)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlIlllII.co.x();
            "".length();
            return lIlIIIIIllII[0];
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIlIlllII.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        }
        tileItem2.interact(lIlIIIIIlIll[lIlIIIIIllII[2]]);
        return lIlIIIIIllII[0];
    }

    private static boolean llIlIlIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIllllI(int n2) {
        return n2 > 0;
    }

    private static void llIlIlIIIlIlIl() {
        lIlIIIIIllII = new int[13];
        U.lIlIIIIIllII[0] = " ".length();
        U.lIlIIIIIllII[1] = (0xDE ^ 0xA8 ^ (0x69 ^ 0x14)) & (5 + 21 - -34 + 86 ^ 84 + 28 - 15 + 56 ^ -" ".length());
        U.lIlIIIIIllII[2] = "   ".length();
        U.lIlIIIIIllII[3] = 0x28 ^ 0xB ^ (0x53 ^ 0x4C);
        U.lIlIIIIIllII[4] = 0xFA ^ 0xA0;
        U.lIlIIIIIllII[5] = 32 + 57 - -67 + 4 ^ 63 + 87 - 121 + 137;
        U.lIlIIIIIllII[6] = "  ".length();
        U.lIlIIIIIllII[7] = 0xFFFFD9FD & 0x3FAF;
        U.lIlIIIIIllII[8] = -(0xFFFFFEDC & 0xD7F) & (0xFFFFDE5F & Short.MAX_VALUE);
        U.lIlIIIIIllII[9] = 0x12 ^ 0xB ^ (6 ^ 0x1B);
        U.lIlIIIIIllII[10] = 0x83 ^ 0x86;
        U.lIlIIIIIllII[11] = 0x21 ^ 0x3E ^ (0x50 ^ 0x48);
        U.lIlIIIIIllII[12] = 0xA8 ^ 0xA0;
    }

    public boolean run() {
        U lllllllllllllllIlllIIlIIIlllIIIl;
        if (U.llIlIlIIIlIllI(this.cq.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIlllIIIl.cp.pause() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        aa = lllllllllllllllIlllIIlIIIlllIIIl.co.C();
        if (U.llIlIlIIIlllII(aa)) {
            return lIlIIIIIllII[1];
        }
        lllllllllllllllIlllIIlIIIlllIIIl.bS = Players.getLocal();
        if (U.llIlIlIIIlllII(lllllllllllllllIlllIIlIIIlllIIIl.bS)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIlllIIIl.ch() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        this.cl();
        this.cm();
        return this.cg();
    }

    public abstract boolean ch();

    private static boolean llIlIlIIIlllll(int n2) {
        return n2 <= 0;
    }

    static {
        U.llIlIlIIIlIlIl();
        U.llIlIlIIIlIlII();
    }

    private static boolean llIlIlIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIlIIIlIIll(String lllllllllllllllIlllIIlIIIlIIlIII, String lllllllllllllllIlllIIlIIIlIIIIlI) {
        lllllllllllllllIlllIIlIIIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIIIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIlllIIlIIIlIIIlIl = lllllllllllllllIlllIIlIIIlIIIIlI.toCharArray();
        int lllllllllllllllIlllIIlIIIlIIIlII = lIlIIIIIllII[1];
        char[] lllllllllllllllIlllIIlIIIIlllllI = lllllllllllllllIlllIIlIIIlIIlIII.toCharArray();
        int lllllllllllllllIlllIIlIIIIllllIl = lllllllllllllllIlllIIlIIIIlllllI.length;
        int lllllllllllllllIlllIIlIIIIllllII = lIlIIIIIllII[1];
        while (U.llIlIlIIIlIlll(lllllllllllllllIlllIIlIIIIllllII, lllllllllllllllIlllIIlIIIIllllIl)) {
            char lllllllllllllllIlllIIlIIIlIIlIIl = lllllllllllllllIlllIIlIIIIlllllI[lllllllllllllllIlllIIlIIIIllllII];
            lllllllllllllllIlllIIlIIIlIIIllI.append((char)(lllllllllllllllIlllIIlIIIlIIlIIl ^ lllllllllllllllIlllIIlIIIlIIIlIl[lllllllllllllllIlllIIlIIIlIIIlII % lllllllllllllllIlllIIlIIIlIIIlIl.length]));
            "".length();
            ++lllllllllllllllIlllIIlIIIlIIIlII;
            ++lllllllllllllllIlllIIlIIIIllllII;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlIIIlIIIllI);
    }

    private static boolean llIlIlIIIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlIIIlIIlI(String lllllllllllllllIlllIIlIIIIllIIIl, String lllllllllllllllIlllIIlIIIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlIIIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlIIIIllIlIl.init(lIlIIIIIllII[6], lllllllllllllllIlllIIlIIIIllIllI);
            return new String(lllllllllllllllIlllIIlIIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIIIIllIlII) {
            lllllllllllllllIlllIIlIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIlIlII() {
        lIlIIIIIlIll = new String[lIlIIIIIllII[11]];
        U.lIlIIIIIlIll[U.lIlIIIIIllII[1]] = U.llIlIlIIIlIIIl("5SgPyKsEmcU=", "SpgjG");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[0]] = U.llIlIlIIIlIIlI("1mplxjzWiVw=", "gPMoi");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[6]] = U.llIlIlIIIlIIll("AAYjLA==", "TgHIi");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[2]] = U.llIlIlIIIlIIlI("rMYUTM3t4oI=", "XvVbG");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[9]] = U.llIlIlIIIlIIIl("ltPx4Rthtk+hLkY8Q9ZSwg==", "JVCjq");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[10]] = U.llIlIlIIIlIIll("FzsSBjArdQAROz4=", "RUwtW");
        U.lIlIIIIIlIll[U.lIlIIIIIllII[5]] = U.llIlIlIIIlIIIl("UlUHxIn78dA=", "bCgqX");
    }

    private static boolean llIlIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIlllIl(Object object) {
        return object != null;
    }

    @Inject
    protected U(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        this.cr = new Random();
        this.co = squireChambersPlugin;
        this.cp = squireChambersConfig;
        this.cq = client;
    }

    /*
     * WARNING - void declaration
     */
    private void cm() {
        void lllllllllllllllIlllIIlIIIllIlIIl;
        EquipmentSetup equipmentSetup = this.cj();
        if (U.llIlIlIIIlllII(equipmentSetup)) {
            return;
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllIlIIl.isEquipped() ? 1 : 0)) {
            return;
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0) && U.llIlIlIIIlllIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && U.llIlIlIIIlllll(lllllllllllllllIlllIIlIIIllIlIIl.get(EquipmentInventorySlot.SHIELD))) {
            U lllllllllllllllIlllIIlIIIllIlIlI;
            lllllllllllllllIlllIIlIIIllIlIlI.co.x();
            "".length();
        }
        Gear.swapTo((EquipmentSetup)equipmentSetup);
        "".length();
    }

    public abstract List<Prayer> ci();

    public abstract EquipmentSetup cj();

    private static String llIlIlIIIlIIIl(String lllllllllllllllIlllIIlIIIIlIIllI, String lllllllllllllllIlllIIlIIIIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIIIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllII[12]), "DES");
            Cipher lllllllllllllllIlllIIlIIIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlIIIIlIlIII.init(lIlIIIIIllII[6], lllllllllllllllIlllIIlIIIIlIlIIl);
            return new String(lllllllllllllllIlllIIlIIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIIIIlIIlll) {
            lllllllllllllllIlllIIlIIIIlIIlll.printStackTrace();
            return null;
        }
    }

    public abstract boolean cg();

    protected boolean ck() {
        U lllllllllllllllIlllIIlIIIllllIIl;
        int lllllllllllllllIlllIIlIIIllllIII;
        int n2;
        if (U.llIlIlIIIlIllI(aa.e().contains((Object)N.UNKNOWN_COMBAT) ? 1 : 0) && U.llIlIlIIIlIllI(aa.e().contains((Object)N.UNKNOWN_PUZZLE) ? 1 : 0)) {
            n2 = lIlIIIIIllII[0];
            "".length();
            if (null != null) {
                return ((0x6D ^ 0x2F) & ~(0xC9 ^ 0x8B)) != 0;
            }
        } else {
            n2 = lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIllllIII = n2)) {
            return lIlIIIIIllII[1];
        }
        List<N> lllllllllllllllIlllIIlIIIlllIlll = aa.e();
        ArrayList<N> lllllllllllllllIlllIIlIIIlllIllI = new ArrayList<N>();
        ArrayList<N> lllllllllllllllIlllIIlIIIlllIlIl = new ArrayList<N>();
        int lllllllllllllllIlllIIlIIIlllIlII22 = lIlIIIIIllII[1];
        while (U.llIlIlIIIlIlll(lllllllllllllllIlllIIlIIIlllIlII22, lllllllllllllllIlllIIlIIIlllIlll.size())) {
            N lllllllllllllllIlllIIlIIIlllIIll = lllllllllllllllIlllIIlIIIlllIlll.get(lllllllllllllllIlllIIlIIIlllIlII22);
            if (U.llIlIlIIIllIII((Object)lllllllllllllllIlllIIlIIIlllIIll, (Object)N.START) && U.llIlIlIIIllIII((Object)lllllllllllllllIlllIIlIIIlllIIll, (Object)N.SCAVENGERS) && U.llIlIlIIIllIII((Object)lllllllllllllllIlllIIlIIIlllIIll, (Object)N.FARMING)) {
                if (U.llIlIlIIIllIIl((Object)lllllllllllllllIlllIIlIIIlllIIll, (Object)N.END)) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x34 ^ 0x4A ^ (0x25 ^ 0x17)) & (0xAC ^ 0xA0 ^ (0x57 ^ 0x17) ^ -" ".length())) != 0;
                    }
                } else {
                    if (U.llIlIlIIIllIIl((Object)lllllllllllllllIlllIIlIIIlllIIll.bY(), (Object)P.COMBAT)) {
                        lllllllllllllllIlllIIlIIIlllIllI.add(lllllllllllllllIlllIIlIIIlllIIll);
                        "".length();
                    }
                    if (U.llIlIlIIIllIIl((Object)lllllllllllllllIlllIIlIIIlllIIll.bY(), (Object)P.PUZZLE)) {
                        lllllllllllllllIlllIIlIIIlllIlIl.add(lllllllllllllllIlllIIlIIIlllIIll);
                        "".length();
                    }
                }
            }
            ++lllllllllllllllIlllIIlIIIlllIlII22;
            "".length();
            if ("  ".length() != 0) continue;
            return ((0xC ^ 0x6F) & ~(6 ^ 0x65)) != 0;
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableCrabs() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.CRABS) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableIceDemon() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableThieving() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableTightrope() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.TIGHTROPE) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        ArrayList<N> lllllllllllllllIlllIIlIIIlllIlII22 = new ArrayList<N>();
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableVespula() ? 1 : 0) && U.llIlIlIIIllIlI(aa.g() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.VESPULA);
            "".length();
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableVasa() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.VASA);
            "".length();
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableTekton() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.TEKTON);
            "".length();
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableMuttadiles() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.MUTTADILES);
            "".length();
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIllllIIl.cp.enableGuardians() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.GUARDIANS);
            "".length();
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIlllIlII22.containsAll(lllllllllllllllIlllIIlIIIlllIllI) ? 1 : 0) && U.llIlIlIIIllIll(lllllllllllllllIlllIIlIIIlllIllI.size(), lIlIIIIIllII[2])) {
            return lIlIIIIIllII[0];
        }
        return lIlIIIIIllII[1];
    }

    private static boolean llIlIlIIIllIII(Object object, Object object2) {
        return object != object2;
    }
}

