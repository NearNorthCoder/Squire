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

/* TASK: Trying Olm HEAD -> TryingolmheadTask */
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
            0;
            if (-1 != -1) {
                return false;
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

    private static String lllIIIIIllIIIl(String var17, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlIllIllIII[3], var12);
            return new String(var9.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIllIIII(String var16, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIllIllIII[6]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlIllIllIII[3], var11);
            return new String(var13.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private /* synthetic */ boolean f(List list, WorldPoint worldPoint) {
        int n2;
        if (aL.lllIIIIIllIlIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIllIllIII[0];
            0;
            if (1 < 0) {
                return false;
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
        GraphicsObject var8;
        Object var18;
        aL var5;
        if (aL.lllIIIIIllIlII(this.ct() ? 1 : 0)) {
            if (aL.lllIIIIIllIlIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIllIllIII[0];
            }
            return lIlIllIllIII[1];
        }
        if (aL.lllIIIIIllIlII(var5.ed.at() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        if (!aL.lllIIIIIllIlII(var5.ds() ? 1 : 0) || aL.lllIIIIIllIlIl(var5.du() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        var5.cm();
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (aL.lllIIIIIllIlIl(nPC.getName().equals(lIlIllIlIlll[lIlIllIllIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIllIII[0]];
                stringArray[aL.lIlIllIllIII[1]] = lIlIllIlIlll[lIlIllIllIII[4]];
                if (aL.lllIIIIIllIlIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIllIII[0];
                    0;
                    if (-2 < 0) return n2 != 0;
                    return ((0x1A ^ 0x33 ^ (0xEB ^ 0x8E)) & (106 + 173 - 111 + 61 ^ 91 + 164 - 99 + 13 ^ -1)) != 0;
                }
            }
            n2 = lIlIllIllIII[1];
            return n2 != 0;
        });
        if (aL.lllIIIIIllIllI(var1)) {
            return lIlIllIllIII[1];
        }
        List<WorldPoint> var3 = var5.dH();
        System.out.println("Turn: " + var5.dI() + " | " + var5.ed.az() + " | direction: " + var5.ed.am());
        if (aL.lllIIIIIllIlIl(var5.dI() ? 1 : 0) && (!aL.lllIIIIIllIlII(((String)(var18 = var5.k(lIlIllIllIII[1]))).equals(lIlIllIlIlll[lIlIllIllIII[1]]) ? 1 : 0) || aL.lllIIIIIllIlIl(((String)var18).equals(lIlIllIlIlll[lIlIllIllIII[0]]) ? 1 : 0))) {
            var3 = var5.m((String)var18);
        }
        var18 = new ArrayList();
        Iterator var14 = var5.ec.getGraphicsObjects().iterator();
        while (aL.lllIIIIIllIlIl(var14.hasNext() ? 1 : 0)) {
            var8 = (GraphicsObject)var14.next();
            if (aL.lllIIIIIllIlll(var8.getId(), lIlIllIllIII[2])) {
                WorldPoint var6 = WorldPoint.fromLocal((Client)var5.ec, (LocalPoint)var8.getLocation());
                List var4 = var6.createWorldArea(lIlIllIllIII[0]).toWorldPointList();
                var18.addAll(var4);
                0;
            }
            0;
            if ((0x31 ^ 0x35) != 0) continue;
            return false;
        }
        if (aL.lllIIIIIllIlII(var3.contains(var5.bS.getWorldLocation()) ? 1 : 0)) {
            var14 = var3.stream().filter(arg_0 -> var5.f((List)var18, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aL.lllIIIIIlllIII(Movement.getDestination()) && aL.lllIIIIIllIlIl(Movement.getDestination().equals((Object)var14) ? 1 : 0)) {
                var8 = var5.bS.getWorldLocation().createWorldArea(lIlIllIllIII[3]).toWorldPointList().stream().filter(arg_0 -> var5.e((List)var18, arg_0)).min(Comparator.comparingDouble(arg_0 -> aL.c((WorldPoint)var14, arg_0)).thenComparingDouble(object -> var1.getWorldArea().distanceTo((WorldPoint)object))).orElse(null);
                if (!aL.lllIIIIIlllIII(var8) || aL.lllIIIIIllIlll(var8.getWorldX(), var14.getWorldX())) {
                    return lIlIllIllIII[1];
                }
                Movement.setDestination((WorldPoint)var8);
                return lIlIllIllIII[0];
            }
            Movement.setDestination((WorldPoint)var14);
            return lIlIllIllIII[0];
        }
        this.dr();
        0;
        return lIlIllIllIII[0];
    }

    private static /* synthetic */ double c(WorldPoint worldPoint, Object object) {
        return ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint);
    }

    private static void lllIIIIIllIIlI() {
        lIlIllIlIlll = new String[lIlIllIllIII[5]];
        aL.lIlIllIlIlll[aL.lIlIllIllIII[1]] = aL."RIGHT";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[0]] = aL."LEFT";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[3]] = aL."Great Olm";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[4]] = aL."Attack";
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
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    @Inject
    protected aL(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIllIIll() {
        lIlIllIllIII = new int[7];
        aL.lIlIllIllIII[0] = 1;
        aL.lIlIllIllIII[1] = (0x54 ^ 0x4E) & ~(0x56 ^ 0x4C);
        aL.lIlIllIllIII[2] = 0xFFFFBDA7 & 0x47FF;
        aL.lIlIllIllIII[3] = 2;
        aL.lIlIllIllIII[4] = 3;
        aL.lIlIllIllIII[5] = 0x37 ^ 0x33;
        aL.lIlIllIllIII[6] = 0x4B ^ 0x67 ^ (0x2F ^ 0xB);
    }
}

