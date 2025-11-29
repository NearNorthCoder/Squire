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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s_Unknown;
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

/* TASK: Ice Demon -> IcedemonTask */
@TaskDesc(name="Ice Demon", priority=10000, blocking=true)
public class IceDemonTask
extends U_Unknown {
    private final /* synthetic */ int eo = 29742;
    private /* synthetic */ n al;
    private /* synthetic */ n ak;
    private static /* synthetic */ int[] lIlIIIllIlll;
    private final /* synthetic */ int ep = 7603;
    private final /* synthetic */ int eq = 1324;
    private /* synthetic */ int am;
    private static /* synthetic */ String[] lIlIIIllIllI;

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
            0;
            if (2 < ((226 + 138 - 174 + 41 ^ 115 + 20 - 86 + 121) & (0x5A ^ 0x4F ^ (0x3B ^ 0x63) ^ -1))) {
                return ((79 + 106 - 72 + 29 ^ 137 + 56 - 83 + 75) & (0xE1 ^ 0xBD ^ (0xEA ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIllIlll[8];
        }
        return bl2;
    }

    @Inject
    protected bj(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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
            void var19;
            arrayList.addAll(Prayers.getOffensive());
            0;
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            return var19;
        }
        return null;
    }

    private boolean ex() {
        if (bj.llIlIlllIIIlII(Inventory.contains(item -> {
            int n2;
            if (bj.llIlIllIllllll(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[25]]) ? 1 : 0) && bj.llIlIlllIIIlII(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[26]]) ? 1 : 0) && bj.llIlIlllIIIllI(item.getId(), lIlIIIllIlll[27])) {
                n2 = lIlIIIllIlll[7];
                0;
                
                }
            } else {
                n2 = lIlIIIllIlll[8];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                0;
                return lIlIIIllIlll[7];
            }
            TileObject var12 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[14]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];
                        0;
                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var12)) {
                return lIlIIIllIlll[8];
            }
            var12.interact(lIlIIIllIllI[lIlIIIllIlll[20]]);
            return lIlIIIllIlll[7];
        }
        String[] stringArray = new String[lIlIIIllIlll[7]];
        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[21]];
        if (bj.llIlIlllIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                bj var29;
                var29.co.x();
                0;
                return lIlIIIllIlll[7];
            }
            TileObject var12 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[23]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];
                        0;
                        if (1 <= 2) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var12)) {
                return lIlIIIllIlll[8];
            }
            var12.interact(lIlIIIllIllI[lIlIIIllIlll[19]]);
            return lIlIIIllIlll[7];
        }
        return lIlIIIllIlll[8];
    }

    static {
        bj.llIlIllIllllIl();
        bj.llIlIllIllllII();
    }

    private static String llIlIllIlllIlI(String var3, String var5) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlll[20]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIIIllIlll[9], var20);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String llIlIllIlllIIl(String var8, String var11) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIlIIIllIlll[9], var28);
            return new String(var15.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllIIIIII(Object object) {
        return object == null;
    }

    private static void llIlIllIllllII() {
        lIlIIIllIllI = new String[lIlIIIllIlll[37]];
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[8]] = bj."setting kindling deposited because ice demon is dead";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[7]] = bj."Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[9]] = bj."Attack";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[12]] = bj."Light";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[13]] = bj."Chop";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[6]] = bj."Enter";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[15]] = bj."Calculating safespot";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[16]] = bj."Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[20]] = bj."Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[21]] = bj."Tinderbox";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[19]] = bj."Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[22]] = bj."Tinderbox";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[23]] = bj."Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[24]] = bj."Bronze axe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[14]] = bj."Take";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[25]] = bj."axe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[26]] = bj."pickaxe";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[28]] = bj."Passage";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[29]] = bj."Enter";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[30]] = bj."Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[31]] = bj."Icefiend";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[32]] = bj."Sapling";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[33]] = bj."Chop";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[34]] = bj."Brazier";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[35]] = bj."Light";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[36]] = bj."Ice demon";
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[11]] = bj."Icefiend";
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bj.llIlIllIllllll(tileObject.getName().equals(lIlIIIllIllI[lIlIIIllIlll[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllIlll[7]];
                stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[29]];
                if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0) && bj.llIlIllIllllll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    0;
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
        bj var2;
        if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bj.llIlIlllIIIIIl(Movement.getDestination()) && bj.llIlIllIllllll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            Movement.setDestination((WorldPoint)var2.al.bs);
            return lIlIIIllIlll[7];
        }
        TileObject var27 = var2.cR();
        if (bj.llIlIlllIIIIII(var27)) {
            Movement.setDestination((WorldPoint)var2.ak.bq.dx(lIlIIIllIlll[14]).dy(lIlIIIllIlll[14]));
            return lIlIIIllIlll[7];
        }
        if (!bj.llIlIlllIIIlII(var2.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var2.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllIlll[8];
        }
        var1_1.interact(lIlIIIllIllI[lIlIIIllIlll[6]]);
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlIllIlllIll(String var25, String var21) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var4 = var21.toCharArray();
        int var14 = lIlIIIllIlll[8];
        char[] var9 = var25.toCharArray();
        int var26 = var9.length;
        int var7 = lIlIIIllIlll[8];
        while (bj.llIlIlllIIIIlI(var7, var26)) {
            char var1 = var9[var7];
            var22.append((char)(var1 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var7;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var17;
        bj var18;
        void var24;
        void var16;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[11]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[36]]));
        int n2 = lIlIIIllIlll[4] - this.co.K() + (lIlIIIllIlll[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIIIllIlll[6];
        if (bj.llIlIllIlllllI(n2) && bj.llIlIllIllllll(this.ex() ? 1 : 0)) {
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIlllIIIIII(var16) && bj.llIlIlllIIIIII(var24)) {
            return var18.cS();
        }
        if (bj.llIlIlllIIIIIl(var24) && bj.llIlIllIllllll(var24.isDead() ? 1 : 0)) {
            System.out.println(lIlIIIllIllI[lIlIIIllIlll[8]]);
            var18.co.g(lIlIIIllIlll[5]);
        }
        if (bj.llIlIlllIIIIII(var16)) {
            Projectile var23 = Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIllIllllll(this.bS.getWorldLocation().createWorldArea(lIlIIIllIlll[7]).toWorldPointList().contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    0;
                    
                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(var23)) {
                if (bj.llIlIlllIIIIIl(var18.bS.getInteracting()) && bj.llIlIllIllllll(var18.bS.getInteracting().getName().contains(lIlIIIllIllI[lIlIIIllIlll[7]]) ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                var24.interact(lIlIIIllIllI[lIlIIIllIlll[9]]);
                return lIlIIIllIlll[7];
            }
            System.out.println(WorldPoint.fromLocal((Client)var18.cq, (LocalPoint)var23.getTarget()));
            System.out.println(var18.bS.getWorldLocation());
            Movement.setDestination((WorldPoint)var18.cX());
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIllIlllllI((int)var17)) {
            TileObject lllllllllllllllIllIlllllIlIIlIll2;
            int[] nArray = new int[lIlIIIllIlll[7]];
            nArray[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
            int var23 = Inventory.getCount((boolean)lIlIIIllIlll[7], (int[])nArray);
            if (!bj.llIlIlllIIIIlI(var23, (int)var17) || bj.llIlIlllIIIIll(var23, lIlIIIllIlll[11])) {
                TileObject lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[34]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIllIlll[7]];
                        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[35]];
                        if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIIllIlll[7];
                            0;
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
                if (!bj.llIlIlllIIIlII(var18.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var18.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                lllllllllllllllIllIlllllIlIIlIll2.interact(lIlIIIllIllI[lIlIIIllIlll[12]]);
                return lIlIIIllIlll[7];
            }
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIllIlll[7]];
                nArray2[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
                if (bj.llIlIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    var18.co.x();
                    0;
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
                        0;
                        if (3 > 2) return n2 != 0;
                        return ((0xA6 ^ 0xAA ^ (0x4D ^ 9)) & (7 + 31 - 1 + 215 ^ 23 + 167 - 123 + 113 ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            }))) {
                return lIlIIIllIlll[8];
            }
            if (!bj.llIlIlllIIIlII(var18.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(var18.bS.isAnimating() ? 1 : 0)) {
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
        0;
        WorldPoint worldPoint2 = list2.stream().filter(worldPoint -> {
            int n2;
            if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && bj.llIlIlllIIIIIl(Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIlllIIIlII(worldPoint.createWorldArea(lIlIIIllIlll[7]).contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    0;
                    if (3 < 1) {
                        return false;
                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            }))) {
                n2 = lIlIIIllIlll[7];
                0;
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

    private static void llIlIllIllllIl() {
        lIlIIIllIlll = new int[38];
        bj.lIlIIIllIlll[0] = -1;
        bj.lIlIIIllIlll[1] = -(0xFFFFDBDB & 0x2F66) & (0xFFFFFF7F & 0x7FEF);
        bj.lIlIIIllIlll[2] = 0xFFFFFDB7 & 0x1FFB;
        bj.lIlIIIllIlll[3] = -(0xFFFFD591 & 0x3A7F) & (0xFFFFBF7D & 0x55BE);
        bj.lIlIIIllIlll[4] = 2 + 157 - 136 + 158 ^ 130 + 112 - 121 + 10;
        bj.lIlIIIllIlll[5] = 157 + 246 - 368 + 217 ^ 114 + 137 - 114 + 15;
        bj.lIlIIIllIlll[6] = 0 + 41 - 39 + 138 ^ 41 + 52 - 17 + 61;
        bj.lIlIIIllIlll[7] = 1;
        bj.lIlIIIllIlll[8] = (165 + 96 - 188 + 108 ^ 100 + 17 - -10 + 58) & (87 + 57 - 8 + 50 ^ 169 + 28 - 129 + 114 ^ -1);
        bj.lIlIIIllIlll[9] = 2;
        bj.lIlIIIllIlll[10] = 0xFFFFF3FF & 0x5D3F;
        bj.lIlIIIllIlll[11] = 0x66 ^ 0x7C;
        bj.lIlIIIllIlll[12] = 3;
        bj.lIlIIIllIlll[13] = 159 + 87 - 196 + 125 ^ 147 + 49 - 59 + 34;
        bj.lIlIIIllIlll[14] = 67 + 151 - 183 + 134 ^ 138 + 56 - 117 + 90;
        bj.lIlIIIllIlll[15] = 37 + 34 - -43 + 69 ^ 90 + 5 - 86 + 168;
        bj.lIlIIIllIlll[16] = 93 + 20 - 73 + 101 ^ 4 + 15 - 18 + 137;
        bj.lIlIIIllIlll[17] = -2;
        bj.lIlIIIllIlll[18] = -(0xA9 ^ 0xB1 ^ (0x31 ^ 0x2D));
        bj.lIlIIIllIlll[19] = 0x26 ^ 0x2C;
        bj.lIlIIIllIlll[20] = 0xB5 ^ 0xBD;
        bj.lIlIIIllIlll[21] = 0x77 ^ 0x7E;
        bj.lIlIIIllIlll[22] = 0x58 ^ 0x53;
        bj.lIlIIIllIlll[23] = 0x4F ^ 0x56 ^ (0x55 ^ 0x40);
        bj.lIlIIIllIlll[24] = 0x64 ^ 0x69;
        bj.lIlIIIllIlll[25] = 0x39 ^ 0x7C ^ (0x7F ^ 0x35);
        bj.lIlIIIllIlll[26] = 0xB1 ^ 0xA1;
        bj.lIlIIIllIlll[27] = 0xFFFFFDCE & 0x72BB;
        bj.lIlIIIllIlll[28] = 0xB9 ^ 0xA8;
        bj.lIlIIIllIlll[29] = 98 + 5 - 90 + 128 ^ 104 + 23 - 47 + 79;
        bj.lIlIIIllIlll[30] = 0x16 ^ 0x36 ^ (0x8F ^ 0xBC);
        bj.lIlIIIllIlll[31] = 29 + 104 - 129 + 126 ^ 35 + 59 - 71 + 127;
        bj.lIlIIIllIlll[32] = 1 ^ 0x14;
        bj.lIlIIIllIlll[33] = 0x8E ^ 0x98;
        bj.lIlIIIllIlll[34] = 0x53 ^ 0x44;
        bj.lIlIIIllIlll[35] = 0x6C ^ 0x74;
        bj.lIlIIIllIlll[36] = 64 + 72 - 71 + 79 ^ 82 + 22 - 71 + 104;
        bj.lIlIIIllIlll[37] = 0x99 ^ 0x82;
    }
}

