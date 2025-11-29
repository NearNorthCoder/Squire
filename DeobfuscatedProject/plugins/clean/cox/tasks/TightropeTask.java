/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Tightrope", priority=10000, blocking=true)
public class TightropeTask
extends CoxTaskBase {
    
    private  n ak;
    private final  int eu = 7603;
    
    private  n al;
    private final  int et = 29742;
    private  int am;

    private static boolean llIlllIIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected TightropeTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIIIllIl[0];
        this.et = lIlIlIIIllIl[1];
        this.eu = lIlIlIIIllIl[2];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bl.llIlllIIIlllIl(tileObject.getName().equals(lIlIlIIIllII[lIlIlIIIllIl[25]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIllIl[3]];
                stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[26]];
                if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0) && bl.llIlllIIIlllIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIIIllIl[3];

                    if (((0x64 ^ 0x60) & ~(0xF ^ 0xB)) <= 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIIllIl[4];
            return n2 != 0;
        });
    }

    private static boolean llIlllIIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIlllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bl var1;
        if (bl.llIlllIIIlllIl(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bl.llIlllIIIllllI(Movement.getDestination()) && bl.llIlllIIIlllIl(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIIIllIl[4];
            }
            Movement.setDestination((WorldPoint)var1.al.bs);
            return lIlIlIIIllIl[3];
        }
        TileObject var2 = var1.cR();
        if (bl.llIlllIIIlllII(var2)) {
            return lIlIlIIIllIl[4];
        }
        if (!bl.llIlllIIIlllll(var1.bS.isMoving() ? 1 : 0) || bl.llIlllIIIlllIl(var1.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        var1_1.interact(lIlIlIIIllII[lIlIlIIIllIl[24]]);
        return lIlIlIIIllIl[3];
    }

    private static boolean llIlllIIIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIIllllI(Object object) {
        return object != null;
    }

    private static boolean llIlllIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlllIIIlIIlI() {
        lIlIlIIIllII = new String[lIlIlIIIllIl[35]];
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[4]] = "Keystone crystal";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[3]] = "Dispel";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[5]] = "Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[6]] = "Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[7]] = "Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[8]] = "Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[9]] = "Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[10]] = "attacking mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[11]] = "Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[12]] = "attacking ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[13]] = "Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[14]] = "Keystone crystal";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[15]] = "Take";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[16]] = "getting keystone";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[17]] = "cant find tightrope?";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[18]] = "Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[19]] = "Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[20]] = "Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[21]] = "ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[22]] = "Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[23]] = "Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[24]] = "Enter";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[25]] = "Passage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[26]] = "Enter";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[27]] = "Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[28]] = "Tightrope";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[29]] = "Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[30]] = "Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[31]] = "Tightrope";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[32]] = "Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[33]] = "Shimmering barrier";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[34]] = "Dispel";
    }

    static {
        bl.llIlllIIIllIll();
        bl.llIlllIIIlIIlI();
    }

        return String.valueOf(var3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var5_5;
        void var4;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        String[] stringArray = new String[lIlIlIIIllIl[3]];
        stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[19]];
        NPC nPC2 = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIlIlIIIllIl[3]];
        stringArray2[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[20]];
        NPC nPC3 = NPCs.getNearest((String[])stringArray2);
        if (bl.llIlllIIIlllII(nPC2) && bl.llIlllIIIlllII(nPC3)) {
            return null;
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (bl.llIlllIIIlllIl(nPC.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[27]]) ? 1 : 0) && bl.llIlllIIIllllI(nPC.getInteracting()) && bl.llIlllIIIlllIl(nPC.getInteracting().equals(Players.getLocal()) ? 1 : 0)) {
                n2 = lIlIlIIIllIl[3];

                if ((0x74 ^ 0x79 ^ (0x49 ^ 0x40)) < -1) {
                    return ((0x89 ^ 0xA2 ^ (0xFA ^ 0x9D)) & (0xFE ^ 0xBE ^ (0x57 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIIIllIl[4];
            }
            return n2 != 0;
        });
        Prayer var6 = Prayer.PROTECT_FROM_MISSILES;
        if (!bl.llIlllIIIlllII(var4) || bl.llIlllIIIllllI(var5) && bl.llIlllIIIlllll(var5.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[21]]) ? 1 : 0)) {
            var6 = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add((Prayer)var5_5);

        arrayList.addAll(list);

        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var6_6;
        bl var7;
        TileObject var8;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bl.llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[33]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIllIl[3]];
                stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[34]];
                if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIIllIl[3];

                    if (-(0x29 ^ 0x2D) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIIllIl[4];
            return n2 != 0;
        });
        if (bl.llIlllIIIlllII(tileObject2)) {
            return this.cS();
        }
        String[] stringArray = new String[lIlIlIIIllIl[3]];
        stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[4]];
        if (bl.llIlllIIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            void var9;
            if (bl.llIlllIIIlllIl(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                var9.interact(lIlIlIIIllII[lIlIlIIIllIl[3]]);
                return lIlIlIIIllIl[3];
            }
            var8 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bl.llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[31]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlIIIllIl[3]];
                    stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[32]];
                    if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIlIIIllIl[3];

                        if (null == null) return n2 != 0;
                        return ((0x9D ^ 0xA0 ^ (0x81 ^ 0x86)) & (11 + 100 - 43 + 81 ^ 2 + 164 - 45 + 54 ^ -1)) != 0;
                    }
                }
                n2 = lIlIlIIIllIl[4];
                return n2 != 0;
            });
            if (bl.llIlllIIIllllI(var8)) {
                var8.interact(lIlIlIIIllII[lIlIlIIIllIl[5]]);
                return lIlIlIIIllIl[4];
            }
        }
        if (bl.llIlllIIIllllI(var7.bS.getInteracting()) && bl.llIlllIIIlllIl(var7.bS.getInteracting().getName().contains(lIlIlIIIllII[lIlIlIIIllIl[6]]) ? 1 : 0) && bl.llIlllIIIlllll(var7.bS.getInteracting().isDead() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        var8 = NPCs.getNearest(nPC -> {
            int n2;
            if (bl.llIlllIIIlllIl(nPC.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[30]]) ? 1 : 0) && bl.llIlllIIIlllIl(this.ak.a((Locatable)nPC) ? 1 : 0) && bl.llIlllIIIllllI(nPC.getInteracting())) {
                n2 = lIlIlIIIllIl[3];

                }
            } else {
                n2 = lIlIlIIIllIl[4];
            }
            return n2 != 0;
        });
        if (bl.llIlllIIIllllI(var8)) {
            var8.interact(lIlIlIIIllII[lIlIlIIIllIl[7]]);
            return lIlIlIIIllIl[3];
        }
        String[] stringArray2 = new String[lIlIlIIIllIl[3]];
        stringArray2[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[8]];
        NPC var10 = NPCs.getNearest((String[])stringArray2);
        String[] stringArray3 = new String[lIlIlIIIllIl[3]];
        stringArray3[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[9]];
        NPC var11 = NPCs.getNearest((String[])stringArray3);
        if (bl.llIlllIIIllllI(var11)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[10]]);
            var11.interact(lIlIlIIIllII[lIlIlIIIllIl[11]]);
            return lIlIlIIIllIl[3];
        }
        if (bl.llIlllIIIllllI(var10)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[12]]);
            var10.interact(lIlIlIIIllII[lIlIlIIIllIl[13]]);
            return lIlIlIIIllIl[3];
        }
        String[] stringArray4 = new String[lIlIlIIIllIl[3]];
        stringArray4[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[14]];
        TileObject var12 = TileObjects.getNearest((String[])stringArray4);
        if (bl.llIlllIIIllllI(var12) && bl.llIlllIIIlllIl(Reachable.isWalkable((WorldPoint)var12.getWorldLocation()) ? 1 : 0)) {
            if (bl.llIlllIIIlllIl(Inventory.isFull() ? 1 : 0)) {
                var7.co.x();

                return lIlIlIIIllIl[3];
            }
            var12.interact(lIlIlIIIllII[lIlIlIIIllIl[15]]);
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[16]]);
            return lIlIlIIIllIl[3];
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bl.llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIllIl[3]];
                stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[29]];
                if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIIllIl[3];

                    if (1 < 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIIllIl[4];
            return n2 != 0;
        });
        if (bl.llIlllIIIlllII(var13)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[17]]);
            return lIlIlIIIllIl[4];
        }
        var6_6.interact(lIlIlIIIllII[lIlIlIIIllIl[18]]);
        return lIlIlIIIllIl[3];
    }

    @Override
    public EquipmentSetup cj() {
        if (bl.llIlllIIIlllIl(this.cp.tightropeBody() ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIllIl[3]];
            stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[22]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            String[] stringArray2 = new String[lIlIlIIIllIl[3]];
            stringArray2[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[23]];
            NPC nPC2 = NPCs.getNearest((String[])stringArray2);
            if (bl.llIlllIIIllllI(nPC) && bl.llIlllIIIlllII(nPC2)) {
                int n2 = s.bb().get(EquipmentInventorySlot.BODY);
                return s.b(s.e(N.TIGHTROPE)).derive(EquipmentInventorySlot.BODY, n2);
            }
        }
        return s.b(s.e(N.TIGHTROPE));
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bl.llIlllIIlIIIII((Object)this.ak.bw, (Object)N.TIGHTROPE)) {
            bl2 = lIlIlIIIllIl[3];

            }
        } else {
            bl2 = lIlIlIIIllIl[4];
        }
        return bl2;
    }
}

