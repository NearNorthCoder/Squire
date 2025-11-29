/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Guardians", priority=10000, blocking=true)
public class GuardiansTask
extends CoxTaskBase {
    private  n al;
     int dA;
    private  int am;
     int dB;

    private  n ak;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        void var1;
        aA var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[15]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];

                    if (((0xC3 ^ 0x81) & ~(0x83 ^ 0xC1)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return this.cS();
        }
        if (aA.llIlIlIllIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.THIRD) && aA.llIlIlIllIIIlI(var2.cj().isFullyEquipped() ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            return lIlIIIlIIIlI[2];
        }
        int var3 = var2.cq.getTickCount();
        WorldPoint var4 = var2.cQ();
        if (aA.llIlIlIllIIIll(var2.bS.distanceTo(var4), lIlIIIlIIIlI[2])) {
            var2.dA += lIlIIIlIIIlI[2];
            if (aA.llIlIlIllIIlII(var2.dA, lIlIIIlIIIlI[3])) {
                List var5 = var2.bS.getWorldLocation().createWorldArea(lIlIIIlIIIlI[2]).toWorldPointList();
                WorldPoint var6 = var5.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(arg_0 -> aA.a((NPC)var1, arg_0)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
                Movement.setDestination((WorldPoint)var6);
                return lIlIIIlIIIlI[2];
            }
            if (aA.llIlIlIllIIlIl(var2.dA, lIlIIIlIIIlI[3]) && aA.llIlIlIllIIlIl(var3 - var2.dB, lIlIIIlIIIlI[4])) {
                var2.dB = var3;
                var1.interact(lIlIIIIllIlI[lIlIIIlIIIlI[1]]);
                return lIlIIIlIIIlI[2];
            }
            return lIlIIIlIIIlI[2];
        }
        var2.dA = lIlIIIlIIIlI[1];
        if (aA.llIlIlIllIIIlI(var1.getWorldArea().isInMeleeDistance(var2.bS.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4);
            return lIlIIIlIIIlI[2];
        }
        if (aA.llIlIlIllIIIlI(var2.bS.getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            return lIlIIIlIIIlI[2];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return lIlIIIlIIIlI[2];
    }

    private static boolean llIlIlIllIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIlIllIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIlIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aA.llIlIlIlIlllll();
        aA.llIlIlIlIIIlIl();
    }

    private static  double a(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    private static boolean llIlIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIlIllIIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected GuardiansTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIlIIIlI[0];
        this.dA = lIlIIIlIIIlI[1];
        this.dB = lIlIIIlIIIlI[1];
    }

    private static void llIlIlIlIIIlIl() {
        lIlIIIIllIlI = new String[lIlIIIlIIIlI[16]];
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[1]] = "Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[2]] = "size is 2";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[3]] = "Enter";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[6]] = "Passage";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[4]] = "Enter";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[8]] = "Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[7]] = "Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[10]] = "Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[11]] = "Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[12]] = "Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[13]] = "Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[14]] = "Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[15]] = "Attack";
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aA.llIlIlIllIlIIl((Object)this.ak.bw, (Object)N.GUARDIANS)) {
            bl2 = lIlIIIlIIIlI[2];

            if ((0xF4 ^ 0xBA ^ (0x39 ^ 0x73)) <= 0) {
                return ((0xFC ^ 0xC3 ^ (0x88 ^ 0xA3)) & (0x1C ^ 0x2C ^ (0xE5 ^ 0xC1) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.GUARDIANS));
    }

    private static boolean llIlIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea cP() {
        void var7;
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[13]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];

                    if (((0xC7 ^ 0xC1 ^ (0xBA ^ 0x9B)) & (0xDF ^ 0x86 ^ (0x5D ^ 0x23) ^ -1)) == 0) return n2 != 0;
                    return ((0xEA ^ 0x82 ^ (0xA1 ^ 0x83)) & (0xE1 ^ 0xB1 ^ (0x93 ^ 0x89) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIllI(list.size())) {
            return null;
        }
        if (aA.llIlIlIllIIlII(var7.size(), lIlIIIlIIIlI[3])) {
            WorldPoint var8 = ((NPC)var7.get(lIlIIIlIIIlI[1])).getWorldLocation();
            WorldPoint var9 = ((NPC)var7.get(lIlIIIlIIIlI[2])).getWorldLocation();
            System.out.println(lIlIIIIllIlI[lIlIIIlIIIlI[2]]);
            if (!aA.llIlIlIllIIlll(var8.getWorldX(), var9.getWorldX()) || aA.llIlIlIllIlIII(var8.getWorldY(), var9.getWorldY())) {
                return new WorldArea(var8.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), var9.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
            }
            return new WorldArea(var9.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), var8.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
        }
        return new WorldArea(((NPC)list.get(lIlIIIlIIIlI[1])).getWorldLocation().dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lIlIIIlIIIlI[7], lIlIIIlIIIlI[7]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aA var10;
        void var11;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[7]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];

                    if (-1 <= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return null;
        }
        if (aA.llIlIlIllIIlIl(var11.getWorldLocation().distanceTo((Locatable)var10.bS), lIlIIIlIIIlI[8])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static boolean llIlIlIllIlIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aA var12;
        if (aA.llIlIlIllIIIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aA.llIlIlIllIlIlI(Movement.getDestination()) && aA.llIlIlIllIIIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIlIIIlI[1];
            }
            Movement.setDestination((WorldPoint)var12.al.bs);
            return lIlIIIlIIIlI[2];
        }
        TileObject var13 = var12.cR();
        if (aA.llIlIlIllIIIII(var13)) {
            Movement.setDestination((WorldPoint)var12.ak.bq.dx(lIlIIIlIIIlI[9]).dy(lIlIIIlIIIlI[9]));
            return lIlIIIlIIIlI[2];
        }
        if (!aA.llIlIlIllIIllI(var12.bS.isMoving() ? 1 : 0) || aA.llIlIlIllIIIlI(var12.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIlIIIlI[1];
        }
        var1_1.interact(lIlIIIIllIlI[lIlIIIlIIIlI[3]]);
        return lIlIIIlIIIlI[2];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.llIlIlIllIIIlI(tileObject.getName().equals(lIlIIIIllIlI[lIlIIIlIIIlI[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[4]];
                if (aA.llIlIlIllIIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && aA.llIlIlIllIIIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
    }

    private WorldPoint cQ() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[11]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];

                    if (-1 < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        WorldArea worldArea = this.cP();
        List list = worldArea.getMeleeTiles(this.cq);
        WorldPoint worldPoint2 = list.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(nPC2.getWorldLocation()))).orElse(null);
        return worldPoint2;
    }

        return String.valueOf(var14);
    }

    private static boolean llIlIlIllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIllIIllI(int n2) {
        return n2 == 0;
    }
}

