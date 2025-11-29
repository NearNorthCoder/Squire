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
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Thieving", priority=10000, blocking=true)
public class ThievingTask
extends CoxTaskBase {
    
    private  int am;
    private final  int es = 7603;
    private  n ak;
    private final  int er = 29742;
    
    private  n al;

    private static boolean llIllIIlllIlIl(int n2) {
        return n2 > 0;
    }

    @Inject
    protected ThievingTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIllIIIII[0];
        this.er = lIlIIllIIIII[1];
        this.es = lIlIIllIIIII[2];
    }

    static {
        bk.llIllIIlllIIll();
        bk.llIllIIlllIIlI();
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllIIlllllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIllIIlllIIlI() {
        lIlIIlIlllll = new String[lIlIIllIIIII[18]];
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[7]] = "Deposit";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[6]] = "Open";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[11]] = "Enter";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[12]] = "Passage";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[13]] = "Enter";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[14]] = "Trough";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[15]] = "Deposit";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[16]] = "Corrupted scavenger";
    }

    private static boolean llIllIIllllIII(Object object) {
        return object == null;
    }

    private static boolean llIllIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIIlllIlII(Object object) {
        return object != null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bk.llIllIIllllIll((Object)this.ak.bw, (Object)N.THIEVING)) {
            bl2 = lIlIIllIIIII[6];

        } else {
            bl2 = lIlIIllIIIII[7];
        }
        return bl2;
    }

    private static boolean llIllIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean cg() {
        bk var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bk.llIllIIllllIlI(nPC.getName().contains(lIlIIlIlllll[lIlIIllIIIII[16]]) ? 1 : 0) && (!bk.llIllIIlllllII(nPC.getAnimation(), lIlIIllIIIII[17]) || bk.llIllIIlllllIl(nPC.getId(), lIlIIllIIIII[2]))) {
                n2 = lIlIIllIIIII[6];

                if ((0xC6 ^ 0xC2) <= 0) {
                    return false;
                }
            } else {
                n2 = lIlIIllIIIII[7];
            }
            return n2 != 0;
        });
        if (bk.llIllIIlllIlII(nPC2)) {
            return this.cS();
        }
        int var3 = lIlIIllIIIII[3] - var2.co.J() + (lIlIIllIIIII[4] - Skills.getLevel((Skill)Skill.THIEVING)) / lIlIIllIIIII[5];
        if (bk.llIllIIlllIlIl(var3)) {
            int[] nArray = new int[lIlIIllIIIII[6]];
            nArray[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
            int var4 = Inventory.getCount((boolean)lIlIIllIIIII[6], (int[])nArray);
            if (!bk.llIllIIlllIllI(var4, var3) || bk.llIllIIlllIlll(var4, lIlIIllIIIII[9])) {
                TileObject var5 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (bk.llIllIIllllIlI(tileObject.getName().contains(lIlIIlIlllll[lIlIIllIIIII[14]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIllIIIII[6]];
                        stringArray[bk.lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[15]];
                        if (bk.llIllIIllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIllIIIII[6];

                            if (((172 + 178 - 303 + 187 ^ 57 + 153 - 187 + 155) & (126 + 38 - 47 + 108 ^ 13 + 173 - 3 + 2 ^ -1)) <= 0) return n2 != 0;
                            return ((0x69 ^ 0x58 ^ (0x30 ^ 0x3A)) & (0x47 ^ 0x41 ^ (0x1E ^ 0x23) ^ -1)) != 0;
                        }
                    }
                    n2 = lIlIIllIIIII[7];
                    return n2 != 0;
                });
                if (bk.llIllIIllllIII(var5)) {
                    return lIlIIllIIIII[7];
                }
                if (!bk.llIllIIllllIIl(var2.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var2.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIllIIIII[7];
                }
                var5.interact(lIlIIlIlllll[lIlIIllIIIII[7]]);
                return lIlIIllIIIII[6];
            }
            if (bk.llIllIIllllIlI(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIIIII[6]];
                nArray2[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
                if (bk.llIllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    var2.co.x();

                    return lIlIIllIIIII[6];
                }
            }
            int[] nArray3 = new int[lIlIIllIIIII[6]];
            nArray3[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[1];
            TileObject var5 = TileObjects.getNearest((int[])nArray3);
            if (bk.llIllIIllllIII(var5)) {
                return lIlIIllIIIII[7];
            }
            if (!bk.llIllIIllllIIl(var2.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var2.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            var5.interact(lIlIIlIlllll[lIlIIllIIIII[6]]);
            return lIlIIllIIIII[6];
        }
        this.cS();

        return lIlIIllIIIII[6];
    }

    private static boolean llIllIIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIllllIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bk var6;
        if (bk.llIllIIllllIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bk.llIllIIlllIlII(Movement.getDestination()) && bk.llIllIIllllIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            Movement.setDestination((WorldPoint)var6.al.bs);
            return lIlIIllIIIII[6];
        }
        TileObject var7 = var6.cR();
        if (bk.llIllIIllllIII(var7)) {
            Movement.setDestination((WorldPoint)var6.ak.bq.dx(lIlIIllIIIII[10]).dy(lIlIIllIIIII[10]));
            return lIlIIllIIIII[6];
        }
        if (!bk.llIllIIllllIIl(var6.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var6.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIIIII[7];
        }
        var1_1.interact(lIlIIlIlllll[lIlIIllIIIII[11]]);
        return lIlIIllIIIII[6];
    }

    private static boolean llIllIIllllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bk.llIllIIllllIlI(tileObject.getName().equals(lIlIIlIlllll[lIlIIllIIIII[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIIIII[6]];
                stringArray[bk.lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[13]];
                if (bk.llIllIIllllIlI(tileObject.hasAction(stringArray) ? 1 : 0) && bk.llIllIIllllIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIIIII[6];

                    if (2 > -1) return n2 != 0;
                    return ((0xE3 ^ 0xC7 ^ (0x22 ^ 0x3A)) & (0x71 ^ 0x25 ^ (0x13 ^ 0x7B) ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIIIII[7];
            return n2 != 0;
        });
    }
}

