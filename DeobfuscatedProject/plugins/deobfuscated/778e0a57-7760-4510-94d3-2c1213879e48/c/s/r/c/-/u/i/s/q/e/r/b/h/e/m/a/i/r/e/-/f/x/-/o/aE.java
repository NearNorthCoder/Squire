/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.H;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Tekton", priority=10000, blocking=true, register=true)
public class aE
extends U {
    private /* synthetic */ n al;
    private /* synthetic */ n ak;
    private final /* synthetic */ int dI = 660;
    /* synthetic */ int dJ;
    public final /* synthetic */ int dL = 7488;
    private static /* synthetic */ String[] lIlIllIIllII;
    public final /* synthetic */ int dK = 7473;
    public /* synthetic */ int dM;
    /* synthetic */ int dA;
    private static /* synthetic */ int[] lIlIllIIllll;
    private /* synthetic */ int dN;
    private /* synthetic */ int dO;
    private /* synthetic */ int am;
    /* synthetic */ int dB;

    private static boolean lllIIIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lllIIIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private boolean da() {
        int lllllllllllllllIllIIlIllIIlllIII;
        int n2;
        if (aE.lllIIIIIIlIIIl(Combat.getSpecEnergy(), lIlIllIIllll[14])) {
            return lIlIllIIllll[2];
        }
        Item lllllllllllllllIllIIlIllIIlllIlI = s.aY();
        if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIllIIlllIlI)) {
            return lIlIllIIllll[2];
        }
        int lllllllllllllllIllIIlIllIIlllIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        if (aE.lllIIIIIIIlIlI(lllllllllllllllIllIIlIllIIlllIlI.getId(), lllllllllllllllIllIIlIllIIlllIIl)) {
            n2 = lIlIllIIllll[5];
            0;
            if (-(9 + 17 - -46 + 90 ^ 143 + 103 - 219 + 140) >= 0) {
                return ((114 + 170 - 88 + 24 ^ 63 + 186 - 198 + 137) & (0x34 ^ 0x7C ^ (0xBA ^ 0x92) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIllll[2];
        }
        if (aE.lllIIIIIIIIlll(lllllllllllllllIllIIlIllIIlllIII = n2)) {
            return lIlIllIIllll[2];
        }
        Combat.toggleSpec();
        return lIlIllIIllll[5];
    }

    private static boolean lllIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        aE.lllIIIIIIIIlIl();
        aE.lllIIIIIIIIlII();
    }

    private static boolean lllIIIIIIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aE.lllIIIIIIIIllI(tileObject.getName().equals(lIlIllIIllII[lIlIllIIllll[23]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIllll[5]];
                stringArray[aE.lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[24]];
                if (aE.lllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aE.lllIIIIIIIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIllIIllll[5];
                    0;
                    if (((7 ^ 0x50) & ~(0x4D ^ 0x1A)) <= 2) return n2 != 0;
                    return ((0xD4 ^ 0x96) & ~(0x7E ^ 0x3C)) != 0;
                }
            }
            n2 = lIlIllIIllll[2];
            return n2 != 0;
        });
    }

    private static boolean lllIIIIIIIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        WorldPoint lllllllllllllllIllIIlIllIlllllll2;
        aE lllllllllllllllIllIIlIlllIIIIlII;
        if (aE.lllIIIIIIIIllI(this.co() ? 1 : 0)) {
            return lIlIllIIllll[5];
        }
        WorldPoint lllllllllllllllIllIIlIlllIIIIIll = H.TEKTON_START.c(lllllllllllllllIllIIlIlllIIIIlII.ak);
        TileObject lllllllllllllllIllIIlIlllIIIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aE.lllIIIIIIIIllI(tileObject.getName().contains(lIlIllIIllII[lIlIllIIllll[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIllll[5]];
                stringArray[aE.lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[29]];
                if (aE.lllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIIllll[5];
                    0;
                    if (((47 + 80 - 84 + 165 ^ 12 + 161 - -1 + 22) & (0xAB ^ 0x8B ^ (0xB7 ^ 0x83) ^ -1)) < 1) return n2 != 0;
                    return ((0xC ^ 0x29 ^ (0x59 ^ 0x6B)) & (0x88 ^ 0xBC ^ (0x4F ^ 0x6C) ^ -1)) != 0;
                }
            }
            n2 = lIlIllIIllll[2];
            return n2 != 0;
        });
        if (aE.lllIIIIIIIIlll(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIIlIlllIIIIIll) ? 1 : 0)) {
            if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIlllIIIIIlI)) {
                return lllllllllllllllIllIIlIlllIIIIlII.cS();
            }
            lllllllllllllllIllIIlIlllIIIIIlI.interact(lIlIllIIllII[lIlIllIIllll[2]]);
            return lIlIllIIllll[5];
        }
        NPC lllllllllllllllIllIIlIlllIIIIIIl = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[27]]));
        if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIlllIIIIIIl)) {
            return lllllllllllllllIllIIlIlllIIIIlII.cS();
        }
        lllllllllllllllIllIIlIlllIIIIlII.db();
        if (!aE.lllIIIIIIIlIIl(lllllllllllllllIllIIlIlllIIIIIIl.getAnimation(), lIlIllIIllll[4]) || aE.lllIIIIIIIlIlI(lllllllllllllllIllIIlIlllIIIIIIl.getAnimation(), lIlIllIIllll[6])) {
            lllllllllllllllIllIIlIlllIIIIlII.dM += lIlIllIIllll[5];
            System.out.println(lllllllllllllllIllIIlIlllIIIIlII.dM);
            if (aE.lllIIIIIIIlIll(lllllllllllllllIllIIlIlllIIIIlII.dM, lIlIllIIllll[5])) {
                lllllllllllllllIllIIlIlllIIIIIIl.interact(lIlIllIIllII[lIlIllIIllll[5]]);
                return lIlIllIIllll[5];
            }
            if (aE.lllIIIIIIIIlll(lllllllllllllllIllIIlIlllIIIIlII.cp.flinchTekton() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIlII.cY());
                return lIlIllIIllll[5];
            }
            if (aE.lllIIIIIIIlIll(lllllllllllllllIllIIlIlllIIIIlII.dM, lIlIllIIllll[7]) && aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIlII.cp.flinchTekton() ? 1 : 0)) {
                WorldPoint lllllllllllllllIllIIlIlllIIIIIII = lllllllllllllllIllIIlIlllIIIIlII.bS.getWorldArea().getMeleeTiles(lllllllllllllllIllIIlIlllIIIIlII.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> lllllllllllllllIllIIlIlllIIIIIIl.getWorldArea().distanceTo(worldPoint))).orElse(null);
                Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIIII);
                return lIlIllIIllll[5];
            }
        }
        lllllllllllllllIllIIlIlllIIIIlII.dM = lIlIllIIllll[2];
        if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIIIl.isMoving() ? 1 : 0) && aE.lllIIIIIIIllII(lllllllllllllllIllIIlIlllIIIIIIl.getWorldArea().distanceTo((Locatable)lllllllllllllllIllIIlIlllIIIIlII.bS), lIlIllIIllll[7])) {
            WorldPoint lllllllllllllllIllIIlIlllIIIIIII = H.TEKTON_START.c(lllllllllllllllIllIIlIlllIIIIlII.ak);
            Projectile lllllllllllllllIllIIlIllIlllllll2 = Projectiles.getNearest(projectile -> {
                int n2;
                if (aE.lllIIIIIIIlIlI(projectile.getId(), lIlIllIIllll[1]) && aE.lllIIIIIIIlIll(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget()).distanceTo(lllllllllllllllIllIIlIlllIIIIIII), lIlIllIIllll[5])) {
                    n2 = lIlIllIIllll[5];
                    0;
                    if (null != null) {
                        return ((0x17 ^ 0x1D ^ (0x12 ^ 0x50)) & (0xFD ^ 0x8E ^ (0xAC ^ 0x97) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIIllll[2];
                }
                return n2 != 0;
            });
            if (aE.lllIIIIIIIllIl(lllllllllllllllIllIIlIllIlllllll2)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIIII);
            return lIlIllIIllll[5];
        }
        if (aE.lllIIIIIIIlIlI(lllllllllllllllIllIIlIlllIIIIIIl.getPoseAnimation(), lIlIllIIllll[3])) {
            if (aE.lllIIIIIIIllIl(lllllllllllllllIllIIlIlllIIIIIlI)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIlII.cZ());
                return lIlIllIIllll[5];
            }
            WorldPoint lllllllllllllllIllIIlIlllIIIIIII = lllllllllllllllIllIIlIlllIIIIIll.createWorldArea(lIlIllIIllll[8]).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aE.lllIIIIIIIlIlI(lllllllllllllllIllIIlIlllIIIIIIl.getWorldArea().distanceTo(worldPoint), lIlIllIIllll[10])) {
                    n2 = lIlIllIIllll[5];
                    0;
                    if (((0x5C ^ 0x7E ^ (0x7F ^ 0x1D)) & (0xD5 ^ 0xAF ^ (0x58 ^ 0x62) ^ -1)) != 0) {
                        return ((0x51 ^ 0x54 ^ (0x76 ^ 0x7D)) & (0x44 ^ 0x34 ^ (0xF1 ^ 0x8F) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIIllll[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(lllllllllllllllIllIIlIlllIIIIIll))).orElse(null);
            if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIlllIIIIIII)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIIII);
            return lIlIllIIllll[5];
        }
        lllllllllllllllIllIIlIlllIIIIlII.da();
        0;
        if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIIIl.isMoving() ? 1 : 0)) {
            if (aE.lllIIIIIIIllIl(lllllllllllllllIllIIlIlllIIIIlII.bS.getInteracting()) && aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIlII.bS.getInteracting().equals(lllllllllllllllIllIIlIlllIIIIIIl) ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            lllllllllllllllIllIIlIlllIIIIIIl.interact(lIlIllIIllII[lIlIllIIllll[7]]);
            return lIlIllIIllll[5];
        }
        if (aE.lllIIIIIIIIlll(lllllllllllllllIllIIlIlllIIIIlII.cp.flinchTekton() ? 1 : 0)) {
            WorldPoint lllllllllllllllIllIIlIlllIIIIIII = lllllllllllllllIllIIlIlllIIIIlII.cX();
            if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIlllIIIIIII)) {
                return lIlIllIIllll[2];
            }
            lllllllllllllllIllIIlIllIlllllll2 = lllllllllllllllIllIIlIlllIIIIlII.cW();
            if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIllIlllllll2.contains(lllllllllllllllIllIIlIlllIIIIlII.bS.getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIllIIlIlllIIIIlII.dJ = lIlIllIIllll[2];
                lllllllllllllllIllIIlIlllIIIIlII.dA += lIlIllIIllll[5];
                if (aE.lllIIIIIIIlIlI(lllllllllllllllIllIIlIlllIIIIlII.dA, lIlIllIIllll[5])) {
                    lllllllllllllllIllIIlIlllIIIIIIl.interact(lIlIllIIllII[lIlIllIIllll[9]]);
                    return lIlIllIIllll[5];
                }
                Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlllIIIIIII);
                return lIlIllIIllll[5];
            }
            lllllllllllllllIllIIlIlllIIIIlII.dA = lIlIllIIllll[2];
            WorldPoint lllllllllllllllIllIIlIllIllllllI = lllllllllllllllIllIIlIlllIIIIlII.cY();
            if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIlII.bS.isMoving() ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIlII.bS.isMoving() ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIllIllllllI);
        }
        int lllllllllllllllIllIIlIlllIIIIIII = lllllllllllllllIllIIlIlllIIIIIIl.getAnimation();
        if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIlllIIIIIIl.getWorldArea().getMeleeTiles(lllllllllllllllIllIIlIlllIIIIlII.cq).contains(lllllllllllllllIllIIlIlllIIIIlII.bS.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIlIllIIllII[lIlIllIIllll[10]]);
            lllllllllllllllIllIIlIlllIIIIlII.dO = lIlIllIIllll[2];
            lllllllllllllllIllIIlIllIlllllll2 = lllllllllllllllIllIIlIlllIIIIlII.bS.getWorldArea().getMeleeTiles(lllllllllllllllIllIIlIlllIIIIlII.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> lllllllllllllllIllIIlIlllIIIIIIl.getWorldArea().distanceTo(worldPoint))).orElse(null);
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIllIlllllll2);
            System.out.println(lIlIllIIllII[lIlIllIIllll[8]]);
            return lIlIllIIllll[5];
        }
        System.out.println("last: " + lllllllllllllllIllIIlIlllIIIIlII.dN + " | current: " + lllllllllllllllIllIIlIlllIIIIIII + " | frame: " + lllllllllllllllIllIIlIlllIIIIIIl.getAnimationFrame());
        if (aE.lllIIIIIIIlIIl(lllllllllllllllIllIIlIlllIIIIIIl.getAnimation(), lIlIllIIllll[0]) && aE.lllIIIIIIIlllI(lllllllllllllllIllIIlIlllIIIIIIl.getAnimationFrame(), lIlIllIIllll[11]) && aE.lllIIIIIIIllll(lllllllllllllllIllIIlIlllIIIIlII.dO)) {
            lllllllllllllllIllIIlIlllIIIIlII.dN = lllllllllllllllIllIIlIlllIIIIIIl.getAnimation();
            lllllllllllllllIllIIlIlllIIIIIIl.interact(lIlIllIIllII[lIlIllIIllll[12]]);
        }
        this.dO += lIlIllIIllll[5];
        return lIlIllIIllll[5];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, int n4) {
        int n5;
        void lllllllllllllllIllIIlIllIlIlIIlI;
        void lllllllllllllllIllIIlIllIlIlIIll;
        void lllllllllllllllIllIIlIllIlIlIlII;
        if (aE.lllIIIIIIIIlll(n3)) {
            boolean bl2;
            if (!aE.lllIIIIIIIlIll(n2, lIlIllIIllll[17] - n4) || aE.lllIIIIIIlIIIl(n2, n4)) {
                bl2 = lIlIllIIllll[5];
                0;
                if (3 < 0) {
                    return ((0x48 ^ 8) & ~(0x38 ^ 0x78)) != 0;
                }
            } else {
                bl2 = lIlIllIIllll[2];
            }
            return bl2;
        }
        if (aE.lllIIIIIIIlllI((int)lllllllllllllllIllIIlIllIlIlIlII, (int)(lllllllllllllllIllIIlIllIlIlIIll - lllllllllllllllIllIIlIllIlIlIIlI)) && aE.lllIIIIIIIlIll((int)lllllllllllllllIllIIlIllIlIlIlII, (int)(lllllllllllllllIllIIlIllIlIlIIll + lllllllllllllllIllIIlIllIlIlIIlI))) {
            n5 = lIlIllIIllll[5];
            0;
            if (-1 > 3) {
                return ((0xF ^ 0x59) & ~(0xF8 ^ 0xAE)) != 0;
            }
        } else {
            n5 = lIlIllIIllll[2];
        }
        return n5 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int z(int n2) {
        int lllllllllllllllIllIIlIllIlIllIII = lIlIllIIllll[2];
        while (aE.lllIIIIIIlIIIl(lllllllllllllllIllIIlIllIlIllIII, lIlIllIIllll[10])) {
            void lllllllllllllllIllIIlIllIlIllIIl;
            aE lllllllllllllllIllIIlIllIlIllIlI;
            if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIllIlIllIlI.a((int)lllllllllllllllIllIIlIllIlIllIIl, lllllllllllllllIllIIlIllIlIllIII * lIlIllIIllll[15], lIlIllIIllll[16]) ? 1 : 0)) {
                return lllllllllllllllIllIIlIllIlIllIII * lIlIllIIllll[15];
            }
            ++lllllllllllllllIllIIlIllIlIllIII;
            0;
            if (3 > 0) continue;
            return (0x94 ^ 0x98 ^ (0x1D ^ 1)) & (118 + 147 - 161 + 57 ^ 161 + 50 - 146 + 112 ^ -1);
        }
        return lIlIllIIllll[0];
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cZ() {
        WorldPoint worldPoint2 = H.TEKTON_START.c(this.ak);
        List list = this.bS.getWorldLocation().createWorldArea(lIlIllIIllll[7]).toWorldPointList();
        int[] nArray = new int[lIlIllIIllll[5]];
        nArray[aE.lIlIllIIllll[2]] = lIlIllIIllll[1];
        List list2 = Projectiles.getAll((int[])nArray);
        ArrayList arrayList = new ArrayList();
        Iterator lllllllllllllllIllIIlIllIlIIIlII = list2.iterator();
        while (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIllIlIIIlII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIllIIlIllIlIIIlIl;
            aE lllllllllllllllIllIIlIllIlIIlIIl;
            Projectile lllllllllllllllIllIIlIllIlIIIIll = (Projectile)lllllllllllllllIllIIlIllIlIIIlII.next();
            WorldPoint lllllllllllllllIllIIlIllIlIIIIlI = WorldPoint.fromLocal((Client)lllllllllllllllIllIIlIllIlIIlIIl.cq, (LocalPoint)lllllllllllllllIllIIlIllIlIIIIll.getTarget());
            lllllllllllllllIllIIlIllIlIIIlIl.addAll(lllllllllllllllIllIIlIllIlIIIIlI.createWorldArea(lIlIllIIllll[5]).toWorldPointList());
            0;
            0;
            if (((119 + 6 - 64 + 73 ^ 5 + 97 - 34 + 74) & (0x2C ^ 0x25 ^ 1 ^ -1)) == 0) continue;
            return null;
        }
        WorldPoint worldPoint3 = list.stream().filter(worldPoint -> {
            int n2;
            if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aE.lllIIIIIIIIlll(arrayList.contains(worldPoint) ? 1 : 0)) {
                n2 = lIlIllIIllll[5];
                0;
                if ((0x9F ^ 0x9B) < (6 ^ 2)) {
                    return ((0x7C ^ 0x6C) & ~(0x81 ^ 0x91)) != 0;
                }
            } else {
                n2 = lIlIllIIllll[2];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo((Locatable)this.bS)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint2))).orElse(null);
        return worldPoint3;
    }

    private static boolean lllIIIIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlllllllIlII(String lllllllllllllllIllIIlIllIIIIIIII, String lllllllllllllllIllIIlIlIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIllIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIllllllll.getBytes(StandardCharsets.UTF_8)), lIlIllIIllll[18]), "DES");
            Cipher lllllllllllllllIllIIlIllIIIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIllIIIIIlII.init(lIlIllIIllll[7], lllllllllllllllIllIIlIllIIIIIlIl);
            return new String(lllllllllllllllIllIIlIllIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIllIIIIIIll) {
            lllllllllllllllIllIIlIllIIIIIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public EquipmentSetup cj() {
        int[] nArray;
        if (aE.lllIIIIIIIlllI(Combat.getSpecEnergy(), lIlIllIIllll[14]) && aE.lllIIIIIIIllIl(nArray = s.aZ())) {
            return s.b(s.aZ());
        }
        return s.b(s.e(N.TEKTON));
    }

    private static void lllIIIIIIIIlIl() {
        lIlIllIIllll = new int[31];
        aE.lIlIllIIllll[0] = -1;
        aE.lIlIllIIllll[1] = -(0xFFFFF4AF & 0x6F7A) & (0xFFFFFFBD & 0x66FF);
        aE.lIlIllIIllll[2] = (0xA0 ^ 0x95) & ~(0xA9 ^ 0x9C);
        aE.lIlIllIIllll[3] = 0xFFFFBFF9 & 0x5D37;
        aE.lIlIllIIllll[4] = 0xFFFFFF77 & 0x1DC8;
        aE.lIlIllIIllll[5] = 1;
        aE.lIlIllIIllll[6] = -(0xFFFFC18D & 0x7EF3) & (0xFFFFFDB6 & 0x5FFF);
        aE.lIlIllIIllll[7] = 2;
        aE.lIlIllIIllll[8] = 0x6F ^ 0x36 ^ (0xD9 ^ 0x85);
        aE.lIlIllIIllll[9] = 3;
        aE.lIlIllIIllll[10] = 0x7C ^ 0x78;
        aE.lIlIllIIllll[11] = 0x99 ^ 0x90;
        aE.lIlIllIIllll[12] = 3 ^ (0x90 ^ 0x95);
        aE.lIlIllIIllll[13] = 0x7B ^ 0x7C;
        aE.lIlIllIIllll[14] = 37 + 124 - -21 + 65 ^ 3 + 2 - -60 + 132;
        aE.lIlIllIIllll[15] = -(0xFFFFF5DF & 0x5FF7) & (0xFFFFD7F6 & 0x7FDF);
        aE.lIlIllIIllll[16] = 75 + 54 - -65 + 12 ^ 23 + 155 - 46 + 38;
        aE.lIlIllIIllll[17] = -(0xFFFFFC99 & 0x3B67) & (0xFFFFFFFF & 0x3FFF);
        aE.lIlIllIIllll[18] = 37 + 19 - -10 + 62 ^ 9 + 82 - 44 + 89;
        aE.lIlIllIIllll[19] = -(0xFFFFBE3E & 0x67CF) & (0xFFFFFFDF & 0x7FEF);
        aE.lIlIllIIllll[20] = -(0xFFFFF98D & 0x7FF) & (0xFFFFAFFF & 0x7FFD);
        aE.lIlIllIIllll[21] = 0xBE ^ 0xB4;
        aE.lIlIllIIllll[22] = 0xF4 ^ 0xB1 ^ (0x88 ^ 0xC6);
        aE.lIlIllIIllll[23] = 0x4D ^ 0x41;
        aE.lIlIllIIllll[24] = 0xB5 ^ 0xB8;
        aE.lIlIllIIllll[25] = 0xFA ^ 0xAA ^ (0x7B ^ 0x25);
        aE.lIlIllIIllll[26] = 0x3C ^ 0x53 ^ (0xD3 ^ 0xB3);
        aE.lIlIllIIllll[27] = 0x5A ^ 0x4A;
        aE.lIlIllIIllll[28] = 0x2A ^ 0x3B;
        aE.lIlIllIIllll[29] = 0x45 ^ 0x57;
        aE.lIlIllIIllll[30] = 0x7E ^ 0x6D;
    }

    private static boolean lllIIIIIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIIIIIIIIll(String lllllllllllllllIllIIlIllIIIlIIlI, String lllllllllllllllIllIIlIllIIIlIllI) {
        lllllllllllllllIllIIlIllIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIllIIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIllIIlIllIIIlIlII = lllllllllllllllIllIIlIllIIIlIllI.toCharArray();
        int lllllllllllllllIllIIlIllIIIlIIll = lIlIllIIllll[2];
        char[] lllllllllllllllIllIIlIllIIIIllIl = lllllllllllllllIllIIlIllIIIlIIlI.toCharArray();
        int lllllllllllllllIllIIlIllIIIIllII = lllllllllllllllIllIIlIllIIIIllIl.length;
        int lllllllllllllllIllIIlIllIIIIlIll = lIlIllIIllll[2];
        while (aE.lllIIIIIIlIIIl(lllllllllllllllIllIIlIllIIIIlIll, lllllllllllllllIllIIlIllIIIIllII)) {
            char lllllllllllllllIllIIlIllIIIllIII = lllllllllllllllIllIIlIllIIIIllIl[lllllllllllllllIllIIlIllIIIIlIll];
            lllllllllllllllIllIIlIllIIIlIlIl.append((char)(lllllllllllllllIllIIlIllIIIllIII ^ lllllllllllllllIllIIlIllIIIlIlII[lllllllllllllllIllIIlIllIIIlIIll % lllllllllllllllIllIIlIllIIIlIlII.length]));
            0;
            ++lllllllllllllllIllIIlIllIIIlIIll;
            ++lllllllllllllllIllIIlIllIIIIlIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlIllIIIlIlIl);
    }

    private static void lllIIIIIIIIlII() {
        lIlIllIIllII = new String[lIlIllIIllll[30]];
        aE.lIlIllIIllII[aE.lIlIllIIllll[2]] = aE."Cross";
        aE.lIlIllIIllII[aE.lIlIllIIllll[5]] = aE."Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[7]] = aE."Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[9]] = aE."Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[10]] = aE."IN MELEE TILES";
        aE.lIlIllIIllII[aE.lIlIllIIllll[8]] = aE."moving to stepback";
        aE.lIlIllIIllII[aE.lIlIllIIllll[12]] = aE."Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[13]] = aE."Drink";
        aE.lIlIllIIllII[aE.lIlIllIIllll[18]] = aE."Enter";
        aE.lIlIllIIllII[aE.lIlIllIIllll[11]] = aE."Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[21]] = aE."Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[22]] = aE."Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[23]] = aE."Passage";
        aE.lIlIllIIllII[aE.lIlIllIIllll[24]] = aE."Enter";
        aE.lIlIllIIllII[aE.lIlIllIIllll[25]] = aE."Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[26]] = aE."Stamina";
        aE.lIlIllIIllII[aE.lIlIllIIllll[27]] = aE."Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[28]] = aE."Fire";
        aE.lIlIllIIllII[aE.lIlIllIIllll[29]] = aE."Cross";
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[25]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static String lllIIIIIIIIIlI(String lllllllllllllllIllIIlIlIllllIlIl, String lllllllllllllllIllIIlIlIllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlIllllIlll.init(lIlIllIIllll[7], lllllllllllllllIllIIlIlIlllllIII);
            return new String(lllllllllllllllIllIIlIlIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIlIllllIllI) {
            lllllllllllllllIllIIlIlIllllIllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cX() {
        aE lllllllllllllllIllIIlIllIllIIllI;
        void lllllllllllllllIllIIlIllIllIIlIl;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[21]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint lllllllllllllllIllIIlIllIllIIlII = lllllllllllllllIllIIlIllIllIIlIl.getWorldLocation();
        System.out.println(lllllllllllllllIllIIlIllIllIIlIl.getOrientation());
        switch (lllllllllllllllIllIIlIllIllIIllI.z(lllllllllllllllIllIIlIllIllIIlIl.getOrientation())) {
            case 0: {
                return lllllllllllllllIllIIlIllIllIIlII.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            }
            case 512: {
                return lllllllllllllllIllIIlIllIllIIlII.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            }
            case 1024: {
                return lllllllllllllllIllIIlIllIllIIlII.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            }
            case 1536: {
                return lllllllllllllllIllIIlIllIllIIlII.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            }
        }
        return null;
    }

    @Inject
    protected aE(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIllIIllll[0];
        this.dI = lIlIllIIllll[1];
        this.dA = lIlIllIIllll[2];
        this.dB = lIlIllIIllll[2];
        this.dJ = lIlIllIIllll[2];
        this.dK = lIlIllIIllll[3];
        this.dL = lIlIllIIllll[4];
        this.dM = lIlIllIIllll[2];
        this.dN = lIlIllIIllll[0];
        this.dO = lIlIllIIllll[2];
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cY() {
        aE lllllllllllllllIllIIlIllIllIIIII;
        void lllllllllllllllIllIIlIllIlIlllll;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[11]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint lllllllllllllllIllIIlIllIlIllllI = lllllllllllllllIllIIlIllIlIlllll.getWorldLocation();
        switch (lllllllllllllllIllIIlIllIllIIIII.z(lllllllllllllllIllIIlIllIlIlllll.getOrientation())) {
            case 1536: {
                return lllllllllllllllIllIIlIllIlIllllI.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            }
            case 0: {
                return lllllllllllllllIllIIlIllIlIllllI.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            }
            case 512: {
                return lllllllllllllllIllIIlIllIlIllllI.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            }
            case 1024: {
                return lllllllllllllllIllIIlIllIlIllllI.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            }
        }
        return null;
    }

    private static boolean lllIIIIIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIIIIIllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void lllllllllllllllIllIIlIllIllllIll;
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIllIIllII[lIlIllIIllll[26]]));
        if (aE.lllIIIIIIIlIII(item2)) {
            return lIlIllIIllll[2];
        }
        if (aE.lllIIIIIIIllII(Movement.getRunEnergy(), (int)lllllllllllllllIllIIlIllIllllIll)) {
            return lIlIllIIllll[2];
        }
        item2.interact(lIlIllIIllII[lIlIllIIllll[13]]);
        return lIlIllIIllll[5];
    }

    private static boolean lllIIIIIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private List<WorldPoint> cW() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[22]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint worldPoint = nPC2.getWorldLocation();
        return List.of(worldPoint.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]), worldPoint.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]), worldPoint.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]), worldPoint.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]));
    }

    public void db() {
        if (aE.lllIIIIIIIIllI(this.cj().isFullyEquipped() ? 1 : 0) && aE.lllIIIIIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
            int[] nArray = new int[lIlIllIIllll[7]];
            nArray[aE.lIlIllIIllll[2]] = lIlIllIIllll[19];
            nArray[aE.lIlIllIIllll[5]] = lIlIllIIllll[20];
            if (aE.lllIIIIIIIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            }
        }
    }

    private static boolean lllIIIIIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aE lllllllllllllllIllIIlIllIIllllll;
        if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return lIlIllIIllll[5];
        }
        TileObject lllllllllllllllIllIIlIllIIlllllI = lllllllllllllllIllIIlIllIIllllll.cR();
        if (aE.lllIIIIIIIlIII(lllllllllllllllIllIIlIllIIlllllI)) {
            return lIlIllIIllll[2];
        }
        if (!aE.lllIIIIIIIIlll(lllllllllllllllIllIIlIllIIllllll.bS.isMoving() ? 1 : 0) || aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIllIIllllll.bS.isAnimating() ? 1 : 0)) {
            return lIlIllIIllll[2];
        }
        var1_1.interact(lIlIllIIllII[lIlIllIIllll[18]]);
        return lIlIllIIllll[5];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aE.lllIIIIIIlIIII((Object)this.ak.bw, (Object)N.TEKTON)) {
            bl2 = lIlIllIIllll[5];
            0;
            if (((0xB8 ^ 0xC3 ^ (0x33 ^ 0x6F)) & (0x18 ^ 7 ^ (0xA5 ^ 0x9D) ^ -1)) >= 1) {
                return ((0xD8 ^ 0xA6 ^ (0x27 ^ 0x6B)) & (0xC7 ^ 0x96 ^ (0x51 ^ 0x32) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIllIIllll[2];
        }
        return bl2;
    }
}

