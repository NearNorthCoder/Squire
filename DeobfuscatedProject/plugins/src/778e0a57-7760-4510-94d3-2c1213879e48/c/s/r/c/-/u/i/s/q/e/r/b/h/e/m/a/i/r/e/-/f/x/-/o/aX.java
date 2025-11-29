/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Start room", priority=10000, blocking=true)
public class aX
extends U {
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIlIllIlII;
    private static /* synthetic */ String[] lIlIlIllIIll;
    private /* synthetic */ n ak;
    private /* synthetic */ n al;

    static {
        aX.llIllllIlIlIII();
        aX.llIllllIlIIlll();
    }

    private static String llIllllIlIIlIl(String lllllllllllllllIllIIlllIlllllllI, String lllllllllllllllIllIIlllIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIllllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllllIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllllIIIIIIlI.init(lIlIlIllIlII[3], lllllllllllllllIllIIllllIIIIIIll);
            return new String(lllllllllllllllIllIIllllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIllllIIIIIIIl) {
            lllllllllllllllIllIIllllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllllIlIlIII() {
        lIlIlIllIlII = new int[6];
        aX.lIlIlIllIlII[0] = -" ".length();
        aX.lIlIlIllIlII[1] = " ".length();
        aX.lIlIlIllIlII[2] = (0x7C ^ 0x4E) & ~(0x98 ^ 0xAA);
        aX.lIlIlIllIlII[3] = "  ".length();
        aX.lIlIlIllIlII[4] = "   ".length();
        aX.lIlIlIllIlII[5] = 0x5E ^ 0x17 ^ (0xF4 ^ 0xB5);
    }

    @Inject
    protected aX(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIllIlII[0];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllllIlIlIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aX lllllllllllllllIllIIllllIIIIllII;
        if (aX.llIllllIlIlIlI(u.bf() ? 1 : 0)) {
            return lIlIlIllIlII[2];
        }
        lllllllllllllllIllIIllllIIIIllII.ak = lllllllllllllllIllIIllllIIIIllII.co.L();
        lllllllllllllllIllIIllllIIIIllII.am = lllllllllllllllIllIIllllIIIIllII.co.N();
        lllllllllllllllIllIIllllIIIIllII.al = lllllllllllllllIllIIllllIIIIllII.co.M();
        if (aX.llIllllIlIllII((Object)lllllllllllllllIllIIllllIIIIllII.ak.bw, (Object)N.START)) {
            bl2 = lIlIlIllIlII[1];
            "".length();
            if (" ".length() < 0) {
                return ((0x71 ^ 0x10) & ~(0xA2 ^ 0xC3)) != 0;
            }
        } else {
            bl2 = lIlIlIllIlII[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aX lllllllllllllllIllIIllllIIIIllll;
        TileObject lllllllllllllllIllIIllllIIIIlllI;
        if (aX.llIllllIlIlIIl(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return lIlIlIllIlII[1];
        }
        if (aX.llIllllIlIlIlI(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
        }
        if (aX.llIllllIlIlIll(lllllllllllllllIllIIllllIIIIlllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aX.llIllllIlIlIIl(tileObject.getName().equals(lIlIlIllIIll[lIlIlIllIlII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIlII[1]];
                stringArray[aX.lIlIlIllIlII[2]] = lIlIlIllIIll[lIlIlIllIlII[3]];
                if (aX.llIllllIlIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aX.llIllllIlIlIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIllIlII[1];
                    "".length();
                    if (((0xED ^ 0xC3) & ~(0x30 ^ 0x1E)) <= 0) return n2 != 0;
                    return ((9 ^ 0x12) & ~(6 ^ 0x1D)) != 0;
                }
            }
            n2 = lIlIlIllIlII[2];
            return n2 != 0;
        }))) {
            return lIlIlIllIlII[2];
        }
        var1_1.interact(lIlIlIllIIll[lIlIlIllIlII[2]]);
        return lIlIlIllIlII[1];
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllllIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static void llIllllIlIIlll() {
        lIlIlIllIIll = new String[lIlIlIllIlII[4]];
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[2]] = aX.llIllllIlIIlIl("mDmHPPObbSo=", "hdhVm");
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[1]] = aX.llIllllIlIIllI("etjQwSgc874=", "XeSbu");
        aX.lIlIlIllIIll[aX.lIlIlIllIlII[3]] = aX.llIllllIlIIlIl("e4D0Lxb40EA=", "LSGyX");
    }

    private static boolean llIllllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllllIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIllllIlIIllI(String lllllllllllllllIllIIlllIllllIIIl, String lllllllllllllllIllIIlllIllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIllllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlII[5]), "DES");
            Cipher lllllllllllllllIllIIlllIllllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIlllIllllIlIl.init(lIlIlIllIlII[3], lllllllllllllllIllIIlllIllllIllI);
            return new String(lllllllllllllllIllIIlllIllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllIllllIlII) {
            lllllllllllllllIllIIlllIllllIlII.printStackTrace();
            return null;
        }
    }
}

