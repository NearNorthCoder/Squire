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
 *  net.runelite.api.Projectile
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
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
import java.util.ArrayList;
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
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Ice Demon", priority=10000, blocking=true)
public class IceDemonTask
extends CoxTaskBase {
    private final  int eo = 29742;
    private  n al;
    private  n ak;
    
    private final  int ep = 7603;
    private final  int eq = 1324;
    private  int am;

    private static boolean llIlIlllIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bj.llIlIlllIIIlIl((Object)this.ak.bw, (Object)N.ICE_DEMON)) {
            bl2 = lIlIIIllIlll[7];

            if (2 < ((226 + 138 - 174 + 41 ^ 115 + 20 - 86 + 121) & (0x5A ^ 0x4F ^ (0x3B ^ 0x63) ^ -1))) {
                return ((79 + 106 - 72 + 29 ^ 137 + 56 - 83 + 75) & (0xE1 ^ 0xBD ^ (0xEA ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIllIlll[8];
        }
        return bl2;
    }

    @Inject
    protected IceDemonTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIllIlll[0];
        this.eo = lIlIIIllIlll[1];
        this.ep = lIlIIIllIlll[2];
        this.eq = lIlIIIllIlll[3];
    }

    private static boolean llIlIlllIIIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[31]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[30]]));
        if (bj.llIlIlllIIIIII(nPC2) && bj.llIlIlllIIIIIl(nPC3)) {
            void var1;
            arrayList.addAll(Prayers.getOffensive());

            arrayList.add(Prayer.PROTECT_FROM_MISSILES);

            return var1;
        }
        return null;
    }

    private boolean ex() {
        if (bj.llIlIlllIIIlII(Inventory.contains(item -> {
            int n2;
            if (bj.llIlIllIllllll(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[25]]) ? 1 : 0) && bj.llIlIlllIIIlII(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[26]]) ? 1 : 0) && bj.llIlIlllIIIllI(item.getId(), lIlIIIllIlll[27])) {
                n2 = lIlIIIllIlll[7];

                }
            } else {
                n2 = lIlIIIllIlll[8];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                this.co.x();

                return lIlIIIllIlll[7];
            }
            TileObject var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[14]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];

                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var2)) {
                return lIlIIIllIlll[8];
            }
            var2.interact(lIlIIIllIllI[lIlIIIllIlll[20]]);
            return lIlIIIllIlll[7];
        }
        String[] stringArray = new String[lIlIIIllIlll[7]];
        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[21]];
        if (bj.llIlIlllIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                bj var3;
                var3.co.x();

                return lIlIIIllIlll[7];
            }
            TileObject var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[23]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];

                        if (1 <= 2) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var2)) {
                return lIlIIIllIlll[8];
            }
            var2.interact(lIlIIIllIllI[lIlIIIllIlll[19]]);
            return lIlIIIllIlll[7];
        }
        return lIlIIIllIlll[8];
    }

    static {
        bj.llIlIllIllllIl();
        bj.llIlIllIllllII();
    }

    private static boolean llIlIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllIIIIII(Object object) {
        return object == null;
    }

    private static void llIlIllIllllII() {
        lIlIIIllIllI = new String[lIlIIIllIlll[37]];
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[8]] = "setting kindling deposited because ice demon is dead";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[7]] = "Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[9]] = "Attack";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[12]] = "Light";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[13]] = "Chop";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[6]] = "Enter";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[15]] = "Calculating safespot";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[16]] = "Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[20]] = "Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[21]] = "Tinderbox";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[19]] = "Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[22]] = "Tinderbox";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[23]] = "Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[24]] = "Bronze axe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[14]] = "Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[25]] = "axe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[26]] = "pickaxe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[28]] = "Passage";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[29]] = "Enter";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[30]] = "Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[31]] = "Icefiend";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[32]] = "Sapling";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[33]] = "Chop";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[34]] = "Brazier";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[35]] = "Light";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[36]] = "Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[11]] = "Icefiend";
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bj.llIlIllIllllll(tileObject.getName().equals(lIlIIIllIllI[lIlIIIllIlll[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllIlll[7]];
                stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[29]];
                if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0) && bj.llIlIllIllllll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];

                    if (((135 + 79 - 141 + 67 ^ 154 + 172 - 152 + 8) & (0x13 ^ 0x15 ^ (0x86 ^ 0xBA) ^ -1)) < 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIllIlll[8];
            return n2 != 0;
        });
    }

    private static boolean llIlIlllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIllIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIlllllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bj var4;
        if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bj.llIlIlllIIIIIl(Movement.getDestination()) && bj.llIlIllIllllll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            Movement.setDestination((WorldPoint)var4.al.bs);
            return lIlIIIllIlll[7];
        }
        TileObject var5 = var4.cR();
        if (bj.llIlIlllIIIIII(var5)) {
            Movement.setDestination((WorldPoint)var4.ak.bq.dx(lIlIIIllIlll[14]).dy(lIlIIIllIlll[14]));
            return lIlIIIllIlll[7];
        }
        if (!bj.llIlIlllIIIlII(var4.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var4.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllIlll[8];
        }
        var1_1.interact(lIlIIIllIllI[lIlIIIllIlll[6]]);
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var7;
        bj var8;
        void var9;
        void var10;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[11]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[36]]));
        int n2 = lIlIIIllIlll[4] - this.co.K() + (lIlIIIllIlll[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIIIllIlll[6];
        if (bj.llIlIllIlllllI(n2) && bj.llIlIllIllllll(this.ex() ? 1 : 0)) {
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIlllIIIIII(var10) && bj.llIlIlllIIIIII(var9)) {
            return var8.cS();
        }
        if (bj.llIlIlllIIIIIl(var9) && bj.llIlIllIllllll(var9.isDead() ? 1 : 0)) {
            System.out.println(lIlIIIllIllI[lIlIIIllIlll[8]]);
            var8.co.g(lIlIIIllIlll[5]);
        }
        if (bj.llIlIlllIIIIII(var10)) {
            Projectile var11 = Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIllIllllll(this.bS.getWorldLocation().createWorldArea(lIlIIIllIlll[7]).toWorldPointList().contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];

                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var11)) {
                if (bj.llIlIlllIIIIIl(var8.bS.getInteracting()) && bj.llIlIllIllllll(var8.bS.getInteracting().getName().contains(lIlIIIllIllI[lIlIIIllIlll[7]]) ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                var9.interact(lIlIIIllIllI[lIlIIIllIlll[9]]);
                return lIlIIIllIlll[7];
            }
            System.out.println(WorldPoint.fromLocal((Client)var8.cq, (LocalPoint)var11.getTarget()));
            System.out.println(var8.bS.getWorldLocation());
            Movement.setDestination((WorldPoint)var8.cX());
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIllIlllllI((int)var7)) {
            TileObject lllllllllllllllIllIlllllIlIIlIll2;
            int[] nArray = new int[lIlIIIllIlll[7]];
            nArray[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
            int var11 = Inventory.getCount((boolean)lIlIIIllIlll[7], (int[])nArray);
            if (!bj.llIlIlllIIIIlI(var11, (int)var7) || bj.llIlIlllIIIIll(var11, lIlIIIllIlll[11])) {
                TileObject lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[34]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIllIlll[7]];
                        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[35]];
                        if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIIllIlll[7];

                            if (-2 <= 0) return n2 != 0;
                            return ((0x1D ^ 0x58 ^ (0x4C ^ 0x1B)) & (0x54 ^ 5 ^ (0x27 ^ 0x64) ^ -1)) != 0;
                        }
                    }
                    n2 = lIlIIIllIlll[8];
                    return n2 != 0;
                });
                if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIlIll2)) {
                    return lIlIIIllIlll[8];
                }
                if (!bj.llIlIlllIIIlII(var8.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var8.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                lllllllllllllllIllIlllllIlIIlIll2.interact(lIlIIIllIllI[lIlIIIllIlll[12]]);
                return lIlIIIllIlll[7];
            }
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIllIlll[7]];
                nArray2[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
                if (bj.llIlIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    var8.co.x();

                    return lIlIIIllIlll[7];
                }
            }
            if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[32]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[33]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];

                        if (3 > 2) return n2 != 0;
                        return ((0xA6 ^ 0xAA ^ (0x4D ^ 9)) & (7 + 31 - 1 + 215 ^ 23 + 167 - 123 + 113 ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            }))) {
                return lIlIIIllIlll[8];
            }
            if (!bj.llIlIlllIIIlII(var8.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var8.bS.isAnimating() ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            lllllllllllllllIllIlllllIlIIlIll2.interact(lIlIIIllIllI[lIlIIIllIlll[13]]);
        }
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private WorldPoint cX() {
        System.out.println(lIlIIIllIllI[lIlIIIllIlll[15]]);
        String[] stringArray = new String[lIlIIIllIlll[7]];
        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[16]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        List list = new WorldArea(nPC.getWorldLocation().dx(lIlIIIllIlll[17]).dy(lIlIIIllIlll[17]), lIlIIIllIlll[15], lIlIIIllIlll[15]).toWorldPointList();
        List list2 = new WorldArea(nPC.getWorldLocation().dx(lIlIIIllIlll[18]).dy(lIlIIIllIlll[18]), lIlIIIllIlll[19], lIlIIIllIlll[19]).toWorldPointList();
        list2.removeIf(worldPoint -> list.contains(worldPoint));

        WorldPoint worldPoint2 = list2.stream().filter(worldPoint -> {
            int n2;
            if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && bj.llIlIlllIIIIIl(Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIlllIIIlII(worldPoint.createWorldArea(lIlIIIllIlll[7]).contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];

                    if (3 < 1) {
                        return false;
                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            }))) {
                n2 = lIlIIIllIlll[7];

                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = lIlIIIllIlll[8];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        System.out.println("Safespot: " + String.valueOf(worldPoint2) + " | player: " + String.valueOf(this.bS.getWorldLocation()));
        return worldPoint2;
    }

    private static boolean llIlIlllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.ICE_DEMON));
    }

}

