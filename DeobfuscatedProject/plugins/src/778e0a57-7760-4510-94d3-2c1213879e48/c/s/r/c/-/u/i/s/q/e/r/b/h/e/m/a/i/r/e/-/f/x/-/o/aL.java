/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Trying Olm HEAD", priority=21000, blocking=true)
public class aL
extends aR {
    private static /* synthetic */ int[] lIlIllIllIII;
    private static /* synthetic */ String[] lIlIllIlIlll;

    static {
        aL.lllIIIIIllIIll();
        aL.lllIIIIIllIIlI();
    }

    @Override
    public EquipmentSetup cj() {
        return s.bc();
    }

    private /* synthetic */ boolean e(List list, WorldPoint worldPoint) {
        int n2;
        if (aL.lllIIIIIllIlIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIllIllIII[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x50 ^ 0x19) & ~(0x8E ^ 0xC7)) != 0;
            }
        } else {
            n2 = lIlIllIllIII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIIIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIIIIllIlII(int n2) {
        return n2 == 0;
    }

    private static String lllIIIIIllIIIl(String lllllllllllllllIllIIlIIlllllIlII, String lllllllllllllllIllIIlIIlllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIlllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIlllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIlllllIllI.init(lIlIllIllIII[3], lllllllllllllllIllIIlIIlllllIlll);
            return new String(lllllllllllllllIllIIlIIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIlllllIlIl) {
            lllllllllllllllIllIIlIIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIllIIII(String lllllllllllllllIllIIlIIllllIIlIl, String lllllllllllllllIllIIlIIllllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIllIllIII[6]), "DES");
            Cipher lllllllllllllllIllIIlIIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIIllllIlIIl.init(lIlIllIllIII[3], lllllllllllllllIllIIlIIllllIlIlI);
            return new String(lllllllllllllllIllIIlIIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIllllIlIII) {
            lllllllllllllllIllIIlIIllllIlIII.printStackTrace();
            return null;
        }
    }

    private /* synthetic */ boolean f(List list, WorldPoint worldPoint) {
        int n2;
        if (aL.lllIIIIIllIlIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIllIllIII[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x56 ^ 0x43) & ~(0x84 ^ 0x91)) != 0;
            }
        } else {
            n2 = lIlIllIllIII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIIIlllIII(Object object) {
        return object != null;
    }

    private static boolean lllIIIIIllIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        GraphicsObject lllllllllllllllIllIIlIlIIIIlIlII;
        Object lllllllllllllllIllIIlIlIIIIlIllI;
        aL lllllllllllllllIllIIlIlIIIIllIIl;
        if (aL.lllIIIIIllIlII(this.ct() ? 1 : 0)) {
            if (aL.lllIIIIIllIlIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIllIllIII[0];
            }
            return lIlIllIllIII[1];
        }
        if (aL.lllIIIIIllIlII(lllllllllllllllIllIIlIlIIIIllIIl.ed.at() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        if (!aL.lllIIIIIllIlII(lllllllllllllllIllIIlIlIIIIllIIl.ds() ? 1 : 0) || aL.lllIIIIIllIlIl(lllllllllllllllIllIIlIlIIIIllIIl.du() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        lllllllllllllllIllIIlIlIIIIllIIl.cm();
        NPC lllllllllllllllIllIIlIlIIIIllIII = NPCs.getNearest(nPC -> {
            int n2;
            if (aL.lllIIIIIllIlIl(nPC.getName().equals(lIlIllIlIlll[lIlIllIllIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIllIII[0]];
                stringArray[aL.lIlIllIllIII[1]] = lIlIllIlIlll[lIlIllIllIII[4]];
                if (aL.lllIIIIIllIlIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIllIII[0];
                    "".length();
                    if (-"  ".length() < 0) return n2 != 0;
                    return ((0x1A ^ 0x33 ^ (0xEB ^ 0x8E)) & (106 + 173 - 111 + 61 ^ 91 + 164 - 99 + 13 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIllIllIII[1];
            return n2 != 0;
        });
        if (aL.lllIIIIIllIllI(lllllllllllllllIllIIlIlIIIIllIII)) {
            return lIlIllIllIII[1];
        }
        List<WorldPoint> lllllllllllllllIllIIlIlIIIIlIlll = lllllllllllllllIllIIlIlIIIIllIIl.dH();
        System.out.println("Turn: " + lllllllllllllllIllIIlIlIIIIllIIl.dI() + " | " + lllllllllllllllIllIIlIlIIIIllIIl.ed.az() + " | direction: " + lllllllllllllllIllIIlIlIIIIllIIl.ed.am());
        if (aL.lllIIIIIllIlIl(lllllllllllllllIllIIlIlIIIIllIIl.dI() ? 1 : 0) && (!aL.lllIIIIIllIlII(((String)(lllllllllllllllIllIIlIlIIIIlIllI = lllllllllllllllIllIIlIlIIIIllIIl.k(lIlIllIllIII[1]))).equals(lIlIllIlIlll[lIlIllIllIII[1]]) ? 1 : 0) || aL.lllIIIIIllIlIl(((String)lllllllllllllllIllIIlIlIIIIlIllI).equals(lIlIllIlIlll[lIlIllIllIII[0]]) ? 1 : 0))) {
            lllllllllllllllIllIIlIlIIIIlIlll = lllllllllllllllIllIIlIlIIIIllIIl.m((String)lllllllllllllllIllIIlIlIIIIlIllI);
        }
        lllllllllllllllIllIIlIlIIIIlIllI = new ArrayList();
        Iterator lllllllllllllllIllIIlIlIIIIlIlIl = lllllllllllllllIllIIlIlIIIIllIIl.ec.getGraphicsObjects().iterator();
        while (aL.lllIIIIIllIlIl(lllllllllllllllIllIIlIlIIIIlIlIl.hasNext() ? 1 : 0)) {
            lllllllllllllllIllIIlIlIIIIlIlII = (GraphicsObject)lllllllllllllllIllIIlIlIIIIlIlIl.next();
            if (aL.lllIIIIIllIlll(lllllllllllllllIllIIlIlIIIIlIlII.getId(), lIlIllIllIII[2])) {
                WorldPoint lllllllllllllllIllIIlIlIIIIlIIll = WorldPoint.fromLocal((Client)lllllllllllllllIllIIlIlIIIIllIIl.ec, (LocalPoint)lllllllllllllllIllIIlIlIIIIlIlII.getLocation());
                List lllllllllllllllIllIIlIlIIIIlIIlI = lllllllllllllllIllIIlIlIIIIlIIll.createWorldArea(lIlIllIllIII[0]).toWorldPointList();
                lllllllllllllllIllIIlIlIIIIlIllI.addAll(lllllllllllllllIllIIlIlIIIIlIIlI);
                "".length();
            }
            "".length();
            if ((0x31 ^ 0x35) != 0) continue;
            return ((0x53 ^ 0x44) & ~(0x1C ^ 0xB)) != 0;
        }
        if (aL.lllIIIIIllIlII(lllllllllllllllIllIIlIlIIIIlIlll.contains(lllllllllllllllIllIIlIlIIIIllIIl.bS.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIllIIlIlIIIIlIlIl = lllllllllllllllIllIIlIlIIIIlIlll.stream().filter(arg_0 -> lllllllllllllllIllIIlIlIIIIllIIl.f((List)lllllllllllllllIllIIlIlIIIIlIllI, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aL.lllIIIIIlllIII(Movement.getDestination()) && aL.lllIIIIIllIlIl(Movement.getDestination().equals((Object)lllllllllllllllIllIIlIlIIIIlIlIl) ? 1 : 0)) {
                lllllllllllllllIllIIlIlIIIIlIlII = lllllllllllllllIllIIlIlIIIIllIIl.bS.getWorldLocation().createWorldArea(lIlIllIllIII[3]).toWorldPointList().stream().filter(arg_0 -> lllllllllllllllIllIIlIlIIIIllIIl.e((List)lllllllllllllllIllIIlIlIIIIlIllI, arg_0)).min(Comparator.comparingDouble(arg_0 -> aL.c((WorldPoint)lllllllllllllllIllIIlIlIIIIlIlIl, arg_0)).thenComparingDouble(object -> lllllllllllllllIllIIlIlIIIIllIII.getWorldArea().distanceTo((WorldPoint)object))).orElse(null);
                if (!aL.lllIIIIIlllIII(lllllllllllllllIllIIlIlIIIIlIlII) || aL.lllIIIIIllIlll(lllllllllllllllIllIIlIlIIIIlIlII.getWorldX(), lllllllllllllllIllIIlIlIIIIlIlIl.getWorldX())) {
                    return lIlIllIllIII[1];
                }
                Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlIIIIlIlII);
                return lIlIllIllIII[0];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlIIIIlIlIl);
            return lIlIllIllIII[0];
        }
        this.dr();
        "".length();
        return lIlIllIllIII[0];
    }

    private static /* synthetic */ double c(WorldPoint worldPoint, Object object) {
        return ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint);
    }

    private static void lllIIIIIllIIlI() {
        lIlIllIlIlll = new String[lIlIllIllIII[5]];
        aL.lIlIllIlIlll[aL.lIlIllIllIII[1]] = aL.lllIIIIIllIIII("TatWXG72tMQ=", "SWcbK");
        aL.lIlIllIlIlll[aL.lIlIllIllIII[0]] = aL.lllIIIIIllIIIl("wm5KooxFkWw=", "kNZjS");
        aL.lIlIllIlIlll[aL.lIlIllIllIII[3]] = aL.lllIIIIIllIIII("/lMOh7W8YNQtnBnWJyY95g==", "LcXsE");
        aL.lIlIllIlIlll[aL.lIlIllIllIII[4]] = aL.lllIIIIIllIIIl("1AxvR7Mzxww=", "fOyHb");
    }

    private static boolean lllIIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aL.lllIIIIIllIllI(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    @Inject
    protected aL(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIllIIll() {
        lIlIllIllIII = new int[7];
        aL.lIlIllIllIII[0] = " ".length();
        aL.lIlIllIllIII[1] = (0x54 ^ 0x4E) & ~(0x56 ^ 0x4C);
        aL.lIlIllIllIII[2] = 0xFFFFBDA7 & 0x47FF;
        aL.lIlIllIllIII[3] = "  ".length();
        aL.lIlIllIllIII[4] = "   ".length();
        aL.lIlIllIllIII[5] = 0x37 ^ 0x33;
        aL.lIlIllIllIII[6] = 0x4B ^ 0x67 ^ (0x2F ^ 0xB);
    }
}

