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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Mage Hand", priority=20000)
public class aN
extends aR {
    private static /* synthetic */ int[] lIlIIIlIllll;
    private static /* synthetic */ String[] lIlIIIlIlllI;
    private /* synthetic */ boolean dZ;

    @Override
    public boolean cg() {
        List<WorldPoint> lllllllllllllllIlllIIIIIlIlIllIl;
        String lllllllllllllllIlllIIIIIlIlIllII;
        aN lllllllllllllllIlllIIIIIlIlIlllI;
        if (aN.llIlIllIIllIIl(this.ct() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        if (aN.llIlIllIIllIIl(lllllllllllllllIlllIIIIIlIlIlllI.du() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        lllllllllllllllIlllIIIIIlIlIlllI.cm();
        lllllllllllllllIlllIIIIIlIlIlllI.db();
        if (aN.llIlIllIIllIIl(lllllllllllllllIlllIIIIIlIlIlllI.ed.aH())) {
            lllllllllllllllIlllIIIIIlIlIlllI.dw();
            "".length();
            return lIlIIIlIllll[1];
        }
        System.out.println("Turn: " + lllllllllllllllIlllIIIIIlIlIlllI.dI() + " | " + lllllllllllllllIlllIIIIIlIlIlllI.ed.az() + " | direction: " + lllllllllllllllIlllIIIIIlIlIlllI.ed.am());
        if (aN.llIlIllIIllIlI(lllllllllllllllIlllIIIIIlIlIlllI.dI() ? 1 : 0)) {
            System.out.println(lIlIIIlIlllI[lIlIIIlIllll[0]]);
            lllllllllllllllIlllIIIIIlIlIllII = lllllllllllllllIlllIIIIIlIlIlllI.k(lIlIIIlIllll[0]);
            if (aN.llIlIllIIllIlI(lllllllllllllllIlllIIIIIlIlIllII.equals(lIlIIIlIlllI[lIlIIIlIllll[1]]) ? 1 : 0) && (!aN.llIlIllIIllIlI(lllllllllllllllIlllIIIIIlIlIlllI.ed.at() ? 1 : 0) || aN.llIlIllIIllIll(lllllllllllllllIlllIIIIIlIlIlllI.ed.aH(), lllllllllllllllIlllIIIIIlIlIlllI.dU()))) {
                lllllllllllllllIlllIIIIIlIlIllIl = lllllllllllllllIlllIIIIIlIlIlllI.m(lllllllllllllllIlllIIIIIlIlIllII);
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((0x20 ^ 0x1C) & ~(0x55 ^ 0x69)) != 0;
                }
            } else {
                return lllllllllllllllIlllIIIIIlIlIlllI.dw();
            }
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0) {
                return ((0xF9 ^ 0x94 ^ (0x8F ^ 0xC4)) & (4 + 53 - -10 + 89 ^ 35 + 116 - 91 + 126 ^ -" ".length())) != 0;
            }
        } else {
            lllllllllllllllIlllIIIIIlIlIllIl = lllllllllllllllIlllIIIIIlIlIlllI.dH();
        }
        if (aN.llIlIllIIllIIl(lllllllllllllllIlllIIIIIlIlIllIl.contains(lllllllllllllllIlllIIIIIlIlIlllI.bS.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIlllIIIIIlIlIllII = lllllllllllllllIlllIIIIIlIlIllIl.stream().filter(worldPoint -> {
                int n2;
                if (aN.llIlIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aN.llIlIllIIllIIl(this.ed.ap().contains(worldPoint) ? 1 : 0)) {
                    n2 = lIlIIIlIllll[1];
                    "".length();
                    if ((60 + 0 - 42 + 118 ^ 44 + 73 - 110 + 133) <= "   ".length()) {
                        return ((213 + 172 - 292 + 128 ^ 71 + 79 - 127 + 136) & (0x9C ^ 0xB4 ^ (0xAD ^ 0xC7) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIIlIllll[0];
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aN.llIlIllIIlllII(Movement.getDestination()) && aN.llIlIllIIllIlI(Movement.getDestination().equals((Object)lllllllllllllllIlllIIIIIlIlIllII) ? 1 : 0)) {
                return lIlIIIlIllll[0];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIIIIlIlIllII);
            return lIlIIIlIllll[1];
        }
        return lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllIIlIllI(String lllllllllllllllIlllIIIIIlIIIlllI, String lllllllllllllllIlllIIIIIlIIlIIlI) {
        lllllllllllllllIlllIIIIIlIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIIIIIlIIlIIII = lllllllllllllllIlllIIIIIlIIlIIlI.toCharArray();
        int lllllllllllllllIlllIIIIIlIIIllll = lIlIIIlIllll[0];
        char[] lllllllllllllllIlllIIIIIlIIIlIIl = lllllllllllllllIlllIIIIIlIIIlllI.toCharArray();
        int lllllllllllllllIlllIIIIIlIIIlIII = lllllllllllllllIlllIIIIIlIIIlIIl.length;
        int lllllllllllllllIlllIIIIIlIIIIlll = lIlIIIlIllll[0];
        while (aN.llIlIllIIlllll(lllllllllllllllIlllIIIIIlIIIIlll, lllllllllllllllIlllIIIIIlIIIlIII)) {
            char lllllllllllllllIlllIIIIIlIIlIlII = lllllllllllllllIlllIIIIIlIIIlIIl[lllllllllllllllIlllIIIIIlIIIIlll];
            lllllllllllllllIlllIIIIIlIIlIIIl.append((char)(lllllllllllllllIlllIIIIIlIIlIlII ^ lllllllllllllllIlllIIIIIlIIlIIII[lllllllllllllllIlllIIIIIlIIIllll % lllllllllllllllIlllIIIIIlIIlIIII.length]));
            "".length();
            ++lllllllllllllllIlllIIIIIlIIIllll;
            ++lllllllllllllllIlllIIIIIlIIIIlll;
            "".length();
            if ((0xAC ^ 0xA8) >= (0x6C ^ 0x68)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIIIIlIIlIIIl);
    }

    private static boolean llIlIllIIlllII(Object object) {
        return object != null;
    }

    private static boolean llIlIllIIlllIl(Object object) {
        return object == null;
    }

    private static boolean llIlIllIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIllIIlIlIl(String lllllllllllllllIlllIIIIIIlllllII, String lllllllllllllllIlllIIIIIIllllIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIIlIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIIIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIIlIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIIlIIIIIII.init(lIlIIIlIllll[2], lllllllllllllllIlllIIIIIlIIIIIIl);
            return new String(lllllllllllllllIlllIIIIIlIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIIIIlllllll) {
            lllllllllllllllIlllIIIIIIlllllll.printStackTrace();
            return null;
        }
    }

    static {
        aN.llIlIllIIllIII();
        aN.llIlIllIIlIlll();
    }

    @Inject
    protected aN(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aN.llIlIllIIlllIl(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    private static void llIlIllIIllIII() {
        lIlIIIlIllll = new int[3];
        aN.lIlIIIlIllll[0] = (0xD1 ^ 0x95) & ~(0x54 ^ 0x10);
        aN.lIlIIIlIllll[1] = " ".length();
        aN.lIlIIIlIllll[2] = "  ".length();
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.P();
    }

    private static boolean llIlIllIIllllI(Object object, Object object2) {
        return object != object2;
    }

    public void db() {
        if (aN.llIlIllIIllIlI(this.cj().isFullyEquipped() ? 1 : 0) && aN.llIlIllIIllllI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }

    private static void llIlIllIIlIlll() {
        lIlIIIlIlllI = new String[lIlIIIlIllll[2]];
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[0]] = aN.llIlIllIIlIlIl("mMroPgC96I+Hj+12C6R0OVC4lGvrnnsb", "fxxNL");
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[1]] = aN.llIlIllIIlIllI("AD4kHRY=", "RwcUB");
    }
}

