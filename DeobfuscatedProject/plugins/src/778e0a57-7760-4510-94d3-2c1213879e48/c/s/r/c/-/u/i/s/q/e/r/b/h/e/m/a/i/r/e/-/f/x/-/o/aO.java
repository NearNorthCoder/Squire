/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Melee Hand", priority=20000)
public class aO
extends aR {
    private static /* synthetic */ int[] lIlIIlIIlIll;
    private static /* synthetic */ String[] lIlIIlIIlIlI;
    private /* synthetic */ boolean dZ;

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aO.llIllIIIlIllII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    private static void llIllIIIlIIllI() {
        lIlIIlIIlIlI = new String[lIlIIlIIlIll[7]];
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[0]] = aO.llIllIIIlIIlII("BB+r110ZBoY=", "XTiph");
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[3]] = aO.llIllIIIlIIlIl("BwopNwoP", "JCmsF");
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[4]] = aO.llIllIIIlIIlII("ZVokModijRo=", "tkDyD");
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[2]] = aO.llIllIIIlIIlIl("Ly0ILxUn", "bdLkY");
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[1]] = aO.llIllIIIlIIlII("wL9WD7oKOqg=", "qbHQm");
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aO lllllllllllllllIllIllIlllIIlllIl;
        void lllllllllllllllIllIllIlllIIllIll;
        List<WorldPoint> lllllllllllllllIllIllIlllIIlllII;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (aO.llIllIIIlIlIlI(n2, lIlIIlIIlIll[1])) {
            lllllllllllllllIllIllIlllIIlllII = this.dH();
        }
        if (aO.llIllIIIlIlIlI((int)lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[4])) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIIlllIl.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[3])) {
            if (!aO.llIllIIIlIlIll(lllllllllllllllIllIllIlllIIlllIl.ed.az(), lIlIIlIIlIll[2]) || aO.llIllIIIlIlIlI(lllllllllllllllIllIllIlllIIlllIl.ed.az(), lIlIIlIIlIll[4])) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIIlllIl.dK());
                return lIlIIlIIlIll[3];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIIlllIl.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[2])) {
            if (aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIIlllIl.ed.am().equals(lIlIIlIIlIlI[lIlIIlIIlIll[2]]) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIIlllIl.dJ());
                return lIlIIlIIlIll[3];
            }
            lllllllllllllllIllIllIlllIIlllII = lllllllllllllllIllIllIlllIIlllIl.dQ().toWorldPointList();
        }
        String lllllllllllllllIllIllIlllIIllIlI = lllllllllllllllIllIllIlllIIlllIl.k(lIlIIlIIlIll[3]);
        if (aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIIlllIl.dI() ? 1 : 0) && aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIIllIlI.equals(lIlIIlIIlIlI[lIlIIlIIlIll[1]]) ? 1 : 0)) {
            return lllllllllllllllIllIllIlllIIlllIl.dt();
        }
        if (aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIIlllII.size())) {
            lllllllllllllllIllIllIlllIIlllII = lllllllllllllllIllIllIlllIIlllIl.dH();
        }
        if (aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIIlllII.contains(lllllllllllllllIllIllIlllIIlllIl.bS.getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllllllllllllIllIllIlllIIllIIl = lllllllllllllllIllIllIlllIIlllII.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIIllIIl);
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[3];
    }

    private static boolean llIllIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIlIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        aO.llIllIIIlIIlll();
        aO.llIllIIIlIIllI();
    }

    private static boolean llIllIIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public void db() {
        if (aO.llIllIIIlIlIIl(this.cj().isFullyEquipped() ? 1 : 0) && aO.llIllIIIlIllIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] nArray = new int[lIlIIlIIlIll[4]];
            nArray[aO.lIlIIlIIlIll[0]] = lIlIIlIIlIll[5];
            nArray[aO.lIlIIlIIlIll[3]] = lIlIIlIIlIll[6];
            if (aO.llIllIIIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.Q();
    }

    private static boolean llIllIIIlIllIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected aO(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIlIIlIll[0];
    }

    private static void llIllIIIlIIlll() {
        lIlIIlIIlIll = new int[9];
        aO.lIlIIlIIlIll[0] = (0x47 ^ 0x41 ^ (0x41 ^ 6)) & (0x12 ^ 0x2C ^ 1 + 57 - -57 + 12 ^ -" ".length());
        aO.lIlIIlIIlIll[1] = 0x47 ^ 0x43;
        aO.lIlIIlIIlIll[2] = "   ".length();
        aO.lIlIIlIIlIll[3] = " ".length();
        aO.lIlIIlIIlIll[4] = "  ".length();
        aO.lIlIIlIIlIll[5] = 0xFFFFDBFA & 0x7DC7;
        aO.lIlIIlIIlIll[6] = 0xFFFFFEF3 & 0x2F7D;
        aO.lIlIIlIIlIll[7] = 0x33 ^ 0xA ^ (0x26 ^ 0x1A);
        aO.lIlIIlIIlIll[8] = 65 + 63 - 88 + 91 ^ 122 + 91 - 104 + 30;
    }

    private static String llIllIIIlIIlII(String lllllllllllllllIllIllIlllIIIIlll, String lllllllllllllllIllIllIlllIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIll[8]), "DES");
            Cipher lllllllllllllllIllIllIlllIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlllIIIlIIl.init(lIlIIlIIlIll[4], lllllllllllllllIllIllIlllIIIlIlI);
            return new String(lllllllllllllllIllIllIlllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlllIIIlIII) {
            lllllllllllllllIllIllIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIlIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aO lllllllllllllllIllIllIlllIlIIlII;
        if (aO.llIllIIIlIlIII(this.ct() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIlIIlII.du() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIlIIlII.ds() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        lllllllllllllllIllIllIlllIlIIlII.cm();
        lllllllllllllllIllIllIlllIlIIlII.db();
        if (aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIlIIlII.ed.aG())) {
            lllllllllllllllIllIllIlllIlIIlII.dt();
            "".length();
            return lIlIIlIIlIll[0];
        }
        String lllllllllllllllIllIllIlllIlIIIll = lllllllllllllllIllIllIlllIlIIlII.ed.am();
        if (aO.llIllIIIlIlIlI(lllllllllllllllIllIllIlllIlIIlII.ed.az(), lIlIIlIIlIll[1])) {
            return lllllllllllllllIllIllIlllIlIIlII.dt();
        }
        if (aO.llIllIIIlIlIlI(lllllllllllllllIllIllIlllIlIIlII.ed.aA(), lIlIIlIIlIll[2])) {
            int n2;
            if (!aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIlIIIll.equals(lIlIIlIIlIlI[lIlIIlIIlIll[0]]) ? 1 : 0) || aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIlIIIll.equals(lIlIIlIIlIlI[lIlIIlIIlIll[3]]) ? 1 : 0)) {
                n2 = lIlIIlIIlIll[3];
                "".length();
                if (null != null) {
                    return ((0x43 ^ 0x20 ^ (0x19 ^ 0x2B)) & (21 + 219 - 161 + 144 ^ 122 + 52 - 113 + 81 ^ -" ".length())) != 0;
                }
            } else {
                lllllllllllllllIllIllIlllIlIIlII.dZ = lIlIIlIIlIll[0];
                n2 = lllllllllllllllIllIllIlllIlIIlII.dZ ? 1 : 0;
            }
        }
        if (aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIlIIlII.dZ ? 1 : 0)) {
            return lllllllllllllllIllIllIlllIlIIlII.dp();
        }
        if (aO.llIllIIIlIlIIl(lllllllllllllllIllIllIlllIlIIIll.equals(lIlIIlIIlIlI[lIlIIlIIlIll[4]]) ? 1 : 0) && aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIlIIlII.bS.getWorldLocation().equals((Object)lllllllllllllllIllIllIlllIlIIlII.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIlIIlII.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIII(lllllllllllllllIllIllIlllIlIIlII.bS.getWorldLocation().equals((Object)lllllllllllllllIllIllIlllIlIIlII.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIlllIlIIlII.dL());
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[0];
    }

    private static String llIllIIIlIIlIl(String lllllllllllllllIllIllIllIlllIIlI, String lllllllllllllllIllIllIllIlllIIIl) {
        lllllllllllllllIllIllIllIlllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIllIlllIlIl = new StringBuilder();
        char[] lllllllllllllllIllIllIllIlllIlII = lllllllllllllllIllIllIllIlllIIIl.toCharArray();
        int lllllllllllllllIllIllIllIlllIIll = lIlIIlIIlIll[0];
        char[] lllllllllllllllIllIllIllIllIllIl = lllllllllllllllIllIllIllIlllIIlI.toCharArray();
        int lllllllllllllllIllIllIllIllIllII = lllllllllllllllIllIllIllIllIllIl.length;
        int lllllllllllllllIllIllIllIllIlIll = lIlIIlIIlIll[0];
        while (aO.llIllIIIlIlllI(lllllllllllllllIllIllIllIllIlIll, lllllllllllllllIllIllIllIllIllII)) {
            char lllllllllllllllIllIllIllIllllIII = lllllllllllllllIllIllIllIllIllIl[lllllllllllllllIllIllIllIllIlIll];
            lllllllllllllllIllIllIllIlllIlIl.append((char)(lllllllllllllllIllIllIllIllllIII ^ lllllllllllllllIllIllIllIlllIlII[lllllllllllllllIllIllIllIlllIIll % lllllllllllllllIllIllIllIlllIlII.length]));
            "".length();
            ++lllllllllllllllIllIllIllIlllIIll;
            ++lllllllllllllllIllIllIllIllIlIll;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIllIlllIlIl);
    }
}

