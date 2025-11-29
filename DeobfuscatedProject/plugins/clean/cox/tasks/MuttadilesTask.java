/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
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
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Muttadiles", priority=10000, blocking=true)
public class MuttadilesTask
extends CoxTaskBase {
    
    private final  int dE = 7563;
    private final  int dD = 7562;
    private  n ak;
    private  n al;
    
    private final  int dC = 7561;
    private  int am;
     int dB;

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aB var1;
        if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        TileItem var2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[20]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];

                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[19]])) ? 1 : 0)) {
            var2 = TileItems.getNearest(tileItem -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[18]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];

                    if ((0x17 ^ 0x12) <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIIllIlllI[0];
                }
                return n2 != 0;
            });
        }
        if (aB.llIllIlIlIlIII(var2)) {
            return lIlIIllIlllI[0];
        }
        var1_1.interact(lIlIIllIlIII[lIlIIllIlllI[17]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    protected MuttadilesTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dB = lIlIIllIlllI[0];
        this.dC = lIlIIllIlllI[1];
        this.dD = lIlIIllIlllI[2];
        this.dE = lIlIIllIlllI[3];
        this.am = lIlIIllIlllI[4];
    }

    private static boolean llIllIlIlIlIll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var3);
    }

    static {
        aB.llIllIlIlIIlIl();
        aB.llIllIlIlIIlII();
    }

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[23]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlllI[5]];
                stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[24]];
                if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];

                    if (((0x6E ^ 0x64) & ~(0x9F ^ 0x95)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIllIlllI[0];
            return n2 != 0;
        });
        if (aB.llIllIlIlIlIII(tileObject2)) {
            System.out.println(lIlIIllIlIII[lIlIIllIlllI[14]]);
            return lIlIIllIlllI[0];
        }
        tileObject2.interact(lIlIIllIlIII[lIlIIllIlllI[15]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static void llIllIlIlIIlII() {
        lIlIIllIlIII = new String[lIlIIllIlllI[34]];
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[0]] = "Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[5]] = "Meat tree";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[6]] = "Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[7]] = "Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[9]] = "Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[10]] = "Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[11]] = "Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[12]] = "Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[13]] = "Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[14]] = "tendrils are null";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[15]] = "Pass";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[16]] = "Enter";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[17]] = "Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[18]] = "Revitalisation";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[19]] = "Revitalisation";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[20]] = "Xeric's";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[21]] = "Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[22]] = "Meat tree";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[23]] = "Noxious tendrils";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[24]] = "Pass";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[25]] = "Passage";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[26]] = "Enter";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[27]] = "Bronze axe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[28]] = "Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[29]] = "axe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[30]] = "pickaxe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[32]] = "Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[33]] = "Meat tree";
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileObject.getName().equals(lIlIIllIlIII[lIlIIllIlllI[25]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlllI[5]];
                stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[26]];
                if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];

                    if (3 > 1) return n2 != 0;
                    return ((0xD9 ^ 0x98 ^ (0x3F ^ 0x50)) & (0x57 ^ 0x7A ^ 3 ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIlllI[0];
            return n2 != 0;
        });
    }

    private static boolean llIllIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aB var4;
        if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aB.llIllIlIlIlIlI(Movement.getDestination()) && aB.llIllIlIlIIllI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            Movement.setDestination((WorldPoint)var4.al.bs);
            return lIlIIllIlllI[5];
        }
        TileObject var5 = var4.cR();
        if (aB.llIllIlIlIlIII(var5)) {
            return lIlIIllIlllI[0];
        }
        if (!aB.llIllIlIlIlIIl(var4.bS.isMoving() ? 1 : 0) || aB.llIllIlIlIIllI(var4.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        var1_1.interact(lIlIIllIlIII[lIlIIllIlllI[16]]);
        return lIlIIllIlllI[5];
    }

    private WorldArea i(NPC nPC) {
        if (aB.llIllIlIlIlIII(nPC)) {
            return null;
        }
        int n2 = lIlIIllIlllI[10];
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), lIlIIllIlllI[6] * n2 + nPC.getWorldArea().getWidth(), lIlIIllIlllI[6] * n2 + nPC.getWorldArea().getWidth());
    }

    private static boolean llIllIlIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlIlIlIII(Object object) {
        return object == null;
    }

    private static boolean llIllIlIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIllIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var5_5;
        List var6;
        WorldPoint var7;
        aB var8;
        if (aB.llIllIlIlIIllI(this.cU() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        Player var9 = Players.getLocal();
        int var10 = Static.getClient().getTickCount();
        if (aB.llIllIlIlIIlll(var9.distanceTo(var8.ak.bs), lIlIIllIlllI[5]) && aB.llIllIlIlIIllI(var8.cT() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        NPC var11 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIllIlllI[5]];
            stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[32]];
            if (aB.llIllIlIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(nPC.getName().contains(lIlIIllIlIII[lIlIIllIlllI[33]]) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];

                if (2 == 3) {
                    return ((0xF4 ^ 0x90 ^ (0xFA ^ 0xB9)) & (0x27 ^ 1 ^ 1 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        int[] nArray = new int[lIlIIllIlllI[5]];
        nArray[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC var12 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIIllIlllI[5]];
        nArray2[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC var13 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIlIIllIlllI[5]];
        nArray3[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC var14 = NPCs.getNearest((int[])nArray3);
        if (aB.llIllIlIlIlIII(var12) && aB.llIllIlIlIlIII(var13) && aB.llIllIlIlIlIII(var14)) {
            return var8.cS();
        }
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> {
            int n2;
            if (aB.llIllIlIlIIllI(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[29]]) ? 1 : 0) && aB.llIllIlIlIlIIl(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[30]]) ? 1 : 0) && aB.llIllIlIlIllII(item.getId(), lIlIIllIlllI[31])) {
                n2 = lIlIIllIlllI[5];

                if (3 == ((104 + 140 - 197 + 103 ^ 132 + 162 - 206 + 103) & (0xF6 ^ 0xC5 ^ (0x38 ^ 0x22) ^ -1))) {
                    return ((0x61 ^ 0x65 ^ (0x63 ^ 0x35)) & (38 + 14 - -66 + 112 ^ 54 + 167 - 107 + 66 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                var8.co.x();

                return lIlIIllIlllI[5];
            }
            TileObject var15 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIllIlllI[5]];
                    stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[28]];
                    if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIllIlllI[5];

                        if (((0xCE ^ 0x8D) & ~(0x16 ^ 0x55)) <= 1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIllIlllI[0];
                return n2 != 0;
            });
            if (aB.llIllIlIlIlIII(var15)) {
                return lIlIIllIlllI[0];
            }
            var15.interact(lIlIIllIlIII[lIlIIllIlllI[0]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(var11)) {
            if ((!aB.llIllIlIlIlIlI(var9.getInteracting()) || aB.llIllIlIlIlIIl(var9.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[5]]) ? 1 : 0)) && aB.llIllIlIlIlIll(var10 - var8.co.H(), lIlIIllIlllI[6])) {
                var11.interact(lIlIIllIlIII[lIlIIllIlllI[6]]);
                return lIlIIllIlllI[5];
            }
            if (aB.llIllIlIlIlIll(var10 - var8.co.H(), lIlIIllIlllI[6])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIII(var12)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIlI(var9.getInteracting()) && aB.llIllIlIlIIllI(var9.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[7]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIllII(var12.getHealthRatio(), lIlIIllIlllI[4]) && aB.llIllIlIlIllIl(var12.getHealthRatio(), lIlIIllIlllI[8])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIIllI(var12.getWorldArea().isInMeleeDistance(var9.getWorldLocation()) ? 1 : 0)) {
                var12.interact(lIlIIllIlIII[lIlIIllIlllI[9]]);
                return lIlIIllIlllI[5];
            }
            return lIlIIllIlllI[0];
        }
        if (aB.llIllIlIlIlIlI(var12)) {
            if (aB.llIllIlIlIlIlI(var9.getInteracting()) && aB.llIllIlIlIIllI(var9.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[10]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            var12.interact(lIlIIllIlIII[lIlIIllIlllI[11]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIII(var13)) {
            return lIlIIllIlllI[0];
        }
        int var15 = var13.getWorldArea().distanceTo(var9.getWorldLocation());
        if (aB.llIllIlIlIIlll(var15, lIlIIllIlllI[7]) && aB.llIllIlIlIlIlI(var7 = (WorldPoint)(var6 = var8.i(var13).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aB.llIllIlIlIllIl(var13.getWorldArea().distanceTo(worldPoint), lIlIIllIlllI[11])) {
                n2 = lIlIIllIlllI[5];

            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> var13.getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var9.getWorldLocation()))).orElse(null))) {
            System.out.println("Player: " + String.valueOf(var9.getWorldLocation()) + String.valueOf(var13.getWorldLocation()));
            Movement.setDestination((WorldPoint)var7);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(var9.getInteracting()) && aB.llIllIlIlIIllI(var9.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[12]]) ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        var5_5.interact(lIlIIllIlIII[lIlIIllIlllI[13]]);
        return lIlIIllIlllI[5];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aB.llIllIlIlIlllI((Object)this.ak.bw, (Object)N.MUTTADILES)) {
            bl2 = lIlIIllIlllI[5];

        } else {
            bl2 = lIlIIllIlllI[0];
        }
        return bl2;
    }

    private static boolean llIllIlIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public EquipmentSetup cj() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIllIlllI[5]];
            stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[21]];
            if (aB.llIllIlIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(nPC.getName().contains(lIlIIllIlIII[lIlIIllIlllI[22]]) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];

                if ((30 + 112 - 61 + 48 ^ 30 + 27 - 11 + 86) <= 0) {
                    return false;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        return s.b(s.e(N.MUTTADILES));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var6_6;
        void var16;
        void var17;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Player player = Players.getLocal();
        int[] nArray = new int[lIlIIllIlllI[5]];
        nArray[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIIllIlllI[5]];
        nArray2[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC nPC2 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIlIIllIlllI[5]];
        nArray3[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC nPC3 = NPCs.getNearest((int[])nArray3);
        if (aB.llIllIlIlIlIII(nPC2) && aB.llIllIlIlIlIII(nPC3) && aB.llIllIlIlIlIII(nPC)) {
            return null;
        }
        Prayer var18 = Prayer.PROTECT_FROM_MISSILES;
        if (aB.llIllIlIlIlIlI(var17) && aB.llIllIlIlIIllI(var17.getWorldArea().isInMeleeDistance(var16.getWorldLocation()) ? 1 : 0)) {
            var18 = Prayer.PROTECT_FROM_MELEE;
        }
        arrayList.add((Prayer)var6_6);

        arrayList.addAll(Prayers.getOffensive());

        return arrayList;
    }
}

