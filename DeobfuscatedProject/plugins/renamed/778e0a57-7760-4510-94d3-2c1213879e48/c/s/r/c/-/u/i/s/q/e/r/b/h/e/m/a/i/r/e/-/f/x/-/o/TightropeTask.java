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

/* TASK: Tightrope -> TightropeTask */
@TaskDesc(name="Tightrope", priority=10000, blocking=true)
public class TightropeTask
extends U_Unknown {
    private static /* synthetic */ int[] lIlIlIIIllIl;
    private /* synthetic */ n ak;
    private final /* synthetic */ int eu = 7603;
    private static /* synthetic */ String[] lIlIlIIIllII;
    private /* synthetic */ n al;
    private final /* synthetic */ int et = 29742;
    private /* synthetic */ int am;

    private static void llIlllIIIllIll() {
        lIlIlIIIllIl = new int[36];
        bl.lIlIlIIIllIl[0] = -1;
        bl.lIlIlIIIllIl[1] = -(0xFFFFDAD7 & 0x27AA) & (0xFFFFFEEF & 0x77BF);
        bl.lIlIlIIIllIl[2] = 0xFFFFBFB7 & 0x5DFB;
        bl.lIlIlIIIllIl[3] = 1;
        bl.lIlIlIIIllIl[4] = (0x63 ^ 0x47) & ~(0x6D ^ 0x49);
        bl.lIlIlIIIllIl[5] = 2;
        bl.lIlIlIIIllIl[6] = 3;
        bl.lIlIlIIIllIl[7] = 0xC7 ^ 0xAD ^ (0x47 ^ 0x29);
        bl.lIlIlIIIllIl[8] = 0xE ^ 6 ^ (6 ^ 0xB);
        bl.lIlIlIIIllIl[9] = 12 + 59 - -27 + 34 ^ 28 + 60 - 20 + 62;
        bl.lIlIlIIIllIl[10] = 0xA8 ^ 0xAF;
        bl.lIlIlIIIllIl[11] = 0x8A ^ 0x82;
        bl.lIlIlIIIllIl[12] = 0x91 ^ 0x9E ^ (0x63 ^ 0x65);
        bl.lIlIlIIIllIl[13] = 0x73 ^ 0x79;
        bl.lIlIlIIIllIl[14] = 0x76 ^ 0x7D;
        bl.lIlIlIIIllIl[15] = 0x43 ^ 0x79 ^ (0xB ^ 0x3D);
        bl.lIlIlIIIllIl[16] = 59 + 99 - 127 + 139 ^ 128 + 34 - 69 + 74;
        bl.lIlIlIIIllIl[17] = 2 ^ 0xC;
        bl.lIlIlIIIllIl[18] = 0x25 ^ 0x7C ^ (0xDD ^ 0x8B);
        bl.lIlIlIIIllIl[19] = 0x35 ^ 0x25;
        bl.lIlIlIIIllIl[20] = 0xAB ^ 0xBA;
        bl.lIlIlIIIllIl[21] = 3 ^ (0x2A ^ 0x3B);
        bl.lIlIlIIIllIl[22] = 0xA6 ^ 0xB5;
        bl.lIlIlIIIllIl[23] = 0x76 ^ 0x62;
        bl.lIlIlIIIllIl[24] = 0x6B ^ 0x7E;
        bl.lIlIlIIIllIl[25] = 129 + 26 - 100 + 132 ^ 53 + 19 - -86 + 15;
        bl.lIlIlIIIllIl[26] = 0x89 ^ 0x9E;
        bl.lIlIlIIIllIl[27] = 51 + 7 - -47 + 76 ^ 11 + 93 - -62 + 7;
        bl.lIlIlIIIllIl[28] = 0x30 ^ 0x29;
        bl.lIlIlIIIllIl[29] = 0xAF ^ 0xB5;
        bl.lIlIlIIIllIl[30] = 170 + 102 - 65 + 9 ^ 121 + 154 - 115 + 35;
        bl.lIlIlIIIllIl[31] = 121 + 126 - 118 + 22 ^ 13 + 83 - -6 + 37;
        bl.lIlIlIIIllIl[32] = 21 + 159 - 129 + 122 ^ 87 + 42 - -25 + 22;
        bl.lIlIlIIIllIl[33] = 0x1E ^ 0;
        bl.lIlIlIIIllIl[34] = 0x7A ^ 0x65;
        bl.lIlIlIIIllIl[35] = 0x9A ^ 0x81 ^ (0x70 ^ 0x4B);
    }

    private static String llIlllIIIlIIIl(String var1, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIlIIIllIl[5], var7);
            return new String(var19.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected bl(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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
                    0;
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
        bl var5;
        if (bl.llIlllIIIlllIl(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bl.llIlllIIIllllI(Movement.getDestination()) && bl.llIlllIIIlllIl(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIIIllIl[4];
            }
            Movement.setDestination((WorldPoint)var5.al.bs);
            return lIlIlIIIllIl[3];
        }
        TileObject var11 = var5.cR();
        if (bl.llIlllIIIlllII(var11)) {
            return lIlIlIIIllIl[4];
        }
        if (!bl.llIlllIIIlllll(var5.bS.isMoving() ? 1 : 0) || bl.llIlllIIIlllIl(var5.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        var1_1.interact(lIlIlIIIllII[lIlIlIIIllIl[24]]);
        return lIlIlIIIllIl[3];
    }

    private static String llIlllIIIlIIII(String var17, String var24) {
        try {
            SecretKeySpec var29 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIlIlIIIllIl[11]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIlIlIIIllIl[5], var29);
            return new String(var28.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
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
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[4]] = bl."Keystone crystal";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[3]] = bl."Dispel";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[5]] = bl."Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[6]] = bl."Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[7]] = bl."Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[8]] = bl."Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[9]] = bl."Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[10]] = bl."attacking mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[11]] = bl."Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[12]] = bl."attacking ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[13]] = bl."Attack";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[14]] = bl."Keystone crystal";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[15]] = bl."Take";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[16]] = bl."getting keystone";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[17]] = bl."cant find tightrope?";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[18]] = bl."Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[19]] = bl."Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[20]] = bl."Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[21]] = bl."ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[22]] = bl."Deathly ranger";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[23]] = bl."Deathly mage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[24]] = bl."Enter";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[25]] = bl."Passage";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[26]] = bl."Enter";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[27]] = bl."Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[28]] = bl."Tightrope";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[29]] = bl."Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[30]] = bl."Deathly";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[31]] = bl."Tightrope";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[32]] = bl."Cross";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[33]] = bl."Shimmering barrier";
        bl.lIlIlIIIllII[bl.lIlIlIIIllIl[34]] = bl."Dispel";
    }

    static {
        bl.llIlllIIIllIll();
        bl.llIlllIIIlIIlI();
    }

    private static String llIlllIIIIllll(String var21, String var26) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var6 = var26.toCharArray();
        int var27 = lIlIlIIIllIl[4];
        char[] var14 = var21.toCharArray();
        int var9 = var14.length;
        int var31 = lIlIlIIIllIl[4];
        while (bl.llIlllIIlIIIIl(var31, var9)) {
            char var30 = var14[var31];
            var15.append((char)(var30 ^ var6[var27 % var6.length]));
            0;
            ++var27;
            ++var31;
            0;
            if (1 >= ((0x4B ^ 0x6E) & ~(0xA6 ^ 0x83))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var5_5;
        void var2;
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
        NPC var12 = NPCs.getNearest(nPC -> {
            int n2;
            if (bl.llIlllIIIlllIl(nPC.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[27]]) ? 1 : 0) && bl.llIlllIIIllllI(nPC.getInteracting()) && bl.llIlllIIIlllIl(nPC.getInteracting().equals(Players.getLocal()) ? 1 : 0)) {
                n2 = lIlIlIIIllIl[3];
                0;
                if ((0x74 ^ 0x79 ^ (0x49 ^ 0x40)) < -1) {
                    return ((0x89 ^ 0xA2 ^ (0xFA ^ 0x9D)) & (0xFE ^ 0xBE ^ (0x57 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIIIllIl[4];
            }
            return n2 != 0;
        });
        Prayer var10 = Prayer.PROTECT_FROM_MISSILES;
        if (!bl.llIlllIIIlllII(var2) || bl.llIlllIIIllllI(var12) && bl.llIlllIIIlllll(var12.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[21]]) ? 1 : 0)) {
            var10 = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add((Prayer)var5_5);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var6_6;
        bl var18;
        TileObject var20;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bl.llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[33]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIllIl[3]];
                stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[34]];
                if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIIllIl[3];
                    0;
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
            void var4;
            if (bl.llIlllIIIlllIl(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                var4.interact(lIlIlIIIllII[lIlIlIIIllIl[3]]);
                return lIlIlIIIllIl[3];
            }
            var20 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bl.llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[31]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlIIIllIl[3]];
                    stringArray[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[32]];
                    if (bl.llIlllIIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIlIIIllIl[3];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0x9D ^ 0xA0 ^ (0x81 ^ 0x86)) & (11 + 100 - 43 + 81 ^ 2 + 164 - 45 + 54 ^ -1)) != 0;
                    }
                }
                n2 = lIlIlIIIllIl[4];
                return n2 != 0;
            });
            if (bl.llIlllIIIllllI(var20)) {
                var20.interact(lIlIlIIIllII[lIlIlIIIllIl[5]]);
                return lIlIlIIIllIl[4];
            }
        }
        if (bl.llIlllIIIllllI(var18.bS.getInteracting()) && bl.llIlllIIIlllIl(var18.bS.getInteracting().getName().contains(lIlIlIIIllII[lIlIlIIIllIl[6]]) ? 1 : 0) && bl.llIlllIIIlllll(var18.bS.getInteracting().isDead() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        var20 = NPCs.getNearest(nPC -> {
            int n2;
            if (bl.llIlllIIIlllIl(nPC.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[30]]) ? 1 : 0) && bl.llIlllIIIlllIl(this.ak.a((Locatable)nPC) ? 1 : 0) && bl.llIlllIIIllllI(nPC.getInteracting())) {
                n2 = lIlIlIIIllIl[3];
                0;
                
                }
            } else {
                n2 = lIlIlIIIllIl[4];
            }
            return n2 != 0;
        });
        if (bl.llIlllIIIllllI(var20)) {
            var20.interact(lIlIlIIIllII[lIlIlIIIllIl[7]]);
            return lIlIlIIIllIl[3];
        }
        String[] stringArray2 = new String[lIlIlIIIllIl[3]];
        stringArray2[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[8]];
        NPC var16 = NPCs.getNearest((String[])stringArray2);
        String[] stringArray3 = new String[lIlIlIIIllIl[3]];
        stringArray3[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[9]];
        NPC var23 = NPCs.getNearest((String[])stringArray3);
        if (bl.llIlllIIIllllI(var23)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[10]]);
            var23.interact(lIlIlIIIllII[lIlIlIIIllIl[11]]);
            return lIlIlIIIllIl[3];
        }
        if (bl.llIlllIIIllllI(var16)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[12]]);
            var16.interact(lIlIlIIIllII[lIlIlIIIllIl[13]]);
            return lIlIlIIIllIl[3];
        }
        String[] stringArray4 = new String[lIlIlIIIllIl[3]];
        stringArray4[bl.lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[14]];
        TileObject var8 = TileObjects.getNearest((String[])stringArray4);
        if (bl.llIlllIIIllllI(var8) && bl.llIlllIIIlllIl(Reachable.isWalkable((WorldPoint)var8.getWorldLocation()) ? 1 : 0)) {
            if (bl.llIlllIIIlllIl(Inventory.isFull() ? 1 : 0)) {
                var18.co.x();
                0;
                return lIlIlIIIllIl[3];
            }
            var8.interact(lIlIlIIIllII[lIlIlIIIllIl[15]]);
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
                    0;
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
            0;
            
            }
        } else {
            bl2 = lIlIlIIIllIl[4];
        }
        return bl2;
    }
}

