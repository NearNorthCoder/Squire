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

/* TASK: Muttadiles -> MuttadilesTask */
@TaskDesc(name="Muttadiles", priority=10000, blocking=true)
public class MuttadilesTask
extends U_Unknown {
    private static /* synthetic */ String[] lIlIIllIlIII;
    private final /* synthetic */ int dE = 7563;
    private final /* synthetic */ int dD = 7562;
    private /* synthetic */ n ak;
    private /* synthetic */ n al;
    private static /* synthetic */ int[] lIlIIllIlllI;
    private final /* synthetic */ int dC = 7561;
    private /* synthetic */ int am;
    /* synthetic */ int dB;

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aB lllllllllllllllIllIlIllllllIIIII;
        if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        TileItem var23 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[20]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];
                0;
                
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[19]])) ? 1 : 0)) {
            var23 = TileItems.getNearest(tileItem -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[18]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];
                    0;
                    if ((0x17 ^ 0x12) <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIIllIlllI[0];
                }
                return n2 != 0;
            });
        }
        if (aB.llIllIlIlIlIII(var23)) {
            return lIlIIllIlllI[0];
        }
        var1_1.interact(lIlIIllIlIII[lIlIIllIlllI[17]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    protected aB(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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

    private static String llIllIlIIlIIll(String var9, String var12) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var32 = var12.toCharArray();
        int var33 = lIlIIllIlllI[0];
        char[] var24 = var9.toCharArray();
        int var22 = var24.length;
        int var17 = lIlIIllIlllI[0];
        while (aB.llIllIlIlIllIl(var17, var22)) {
            char var27 = var24[var17];
            var21.append((char)(var27 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var17;
            0;
            if ((0xA6 ^ 0x80 ^ (0x42 ^ 0x61)) != 0) continue;
            return null;
        }
        return String.valueOf(var21);
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
                    0;
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
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[0]] = aB."Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[5]] = aB."Meat tree";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[6]] = aB."Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[7]] = aB."Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[9]] = aB."Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[10]] = aB."Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[11]] = aB."Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[12]] = aB."Muttadile";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[13]] = aB."Attack";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[14]] = aB."tendrils are null";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[15]] = aB."Pass";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[16]] = aB."Enter";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[17]] = aB."Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[18]] = aB."Revitalisation";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[19]] = aB."Revitalisation";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[20]] = aB."Xeric's";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[21]] = aB."Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[22]] = aB."Meat tree";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[23]] = aB."Noxious tendrils";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[24]] = aB."Pass";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[25]] = aB."Passage";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[26]] = aB."Enter";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[27]] = aB."Bronze axe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[28]] = aB."Take";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[29]] = aB."axe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[30]] = aB."pickaxe";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[32]] = aB."Cut";
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[33]] = aB."Meat tree";
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileObject.getName().equals(lIlIIllIlIII[lIlIIllIlllI[25]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlllI[5]];
                stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[26]];
                if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];
                    0;
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
        aB var14;
        if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aB.llIllIlIlIlIlI(Movement.getDestination()) && aB.llIllIlIlIIllI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            Movement.setDestination((WorldPoint)var14.al.bs);
            return lIlIIllIlllI[5];
        }
        TileObject var10 = var14.cR();
        if (aB.llIllIlIlIlIII(var10)) {
            return lIlIIllIlllI[0];
        }
        if (!aB.llIllIlIlIlIIl(var14.bS.isMoving() ? 1 : 0) || aB.llIllIlIlIIllI(var14.bS.isAnimating() ? 1 : 0)) {
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

    private static String llIllIlIIlIlII(String var5, String var19) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIlIIllIlllI[13]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIIllIlllI[6], var4);
            return new String(var1.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static void llIllIlIlIIlIl() {
        lIlIIllIlllI = new int[35];
        aB.lIlIIllIlllI[0] = (0x15 ^ 0x31 ^ (0x1A ^ 0x2E)) & (151 + 65 - 193 + 146 ^ 164 + 4 - 67 + 84 ^ -1);
        aB.lIlIIllIlllI[1] = 0xFFFFDFCB & 0x3DBD;
        aB.lIlIIllIlllI[2] = -(0x3B ^ 0x2E) & (0xFFFFFDFE & 0x1F9F);
        aB.lIlIIllIlllI[3] = 0xFFFFFFBB & 0x1DCF;
        aB.lIlIIllIlllI[4] = -1;
        aB.lIlIIllIlllI[5] = 1;
        aB.lIlIIllIlllI[6] = 2;
        aB.lIlIIllIlllI[7] = 3;
        aB.lIlIIllIlllI[8] = 0x1E ^ 0x59 ^ (0x28 ^ 0x53);
        aB.lIlIIllIlllI[9] = 0x91 ^ 0x95;
        aB.lIlIIllIlllI[10] = 0x57 ^ 0x52;
        aB.lIlIIllIlllI[11] = 184 + 172 - 199 + 34 ^ 66 + 128 - 179 + 170;
        aB.lIlIIllIlllI[12] = 0x70 ^ 0x3B ^ (0x3C ^ 0x70);
        aB.lIlIIllIlllI[13] = 0x39 ^ 0x32 ^ 3;
        aB.lIlIIllIlllI[14] = 0x6C ^ 0x65;
        aB.lIlIIllIlllI[15] = 0x34 ^ 0x3E;
        aB.lIlIIllIlllI[16] = 0x43 ^ 0x13 ^ (0x24 ^ 0x7F);
        aB.lIlIIllIlllI[17] = 0x97 ^ 0x9B;
        aB.lIlIIllIlllI[18] = 0x4C ^ 0x41;
        aB.lIlIIllIlllI[19] = 0x5C ^ 0x52;
        aB.lIlIIllIlllI[20] = 116 + 84 - 126 + 96 ^ 85 + 81 - 37 + 36;
        aB.lIlIIllIlllI[21] = 0xB9 ^ 0xA9;
        aB.lIlIIllIlllI[22] = 0x4E ^ 0x5F;
        aB.lIlIIllIlllI[23] = 0x6B ^ 0x21 ^ (0x99 ^ 0xC1);
        aB.lIlIIllIlllI[24] = 0xA1 ^ 0xB2;
        aB.lIlIIllIlllI[25] = 0xB1 ^ 0xA5;
        aB.lIlIIllIlllI[26] = 0xB3 ^ 0x9F ^ (0xD ^ 0x34);
        aB.lIlIIllIlllI[27] = 0x1E ^ 8;
        aB.lIlIIllIlllI[28] = 199 + 102 - 202 + 114 ^ 145 + 19 - 93 + 123;
        aB.lIlIIllIlllI[29] = 0x88 ^ 0xAA ^ (0x7C ^ 0x46);
        aB.lIlIIllIlllI[30] = 0x9A ^ 0x83;
        aB.lIlIIllIlllI[31] = -(0xFFFFAFF3 & 0x576E) & (0xFFFFFFFB & 0x77EF);
        aB.lIlIIllIlllI[32] = 0xB9 ^ 0xA3;
        aB.lIlIIllIlllI[33] = 0x1E ^ 5;
        aB.lIlIIllIlllI[34] = 0x1B ^ 0x48 ^ (0x1D ^ 0x52);
    }

    private static boolean llIllIlIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlIlIlIII(Object object) {
        return object == null;
    }

    private static String llIllIlIIlIlIl(String var26, String var31) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var31.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var34 = Cipher.getInstance("Blowfish");
            var34.init(lIlIIllIlllI[6], var28);
            return new String(var34.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
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
        List var20;
        WorldPoint var6;
        aB var25;
        if (aB.llIllIlIlIIllI(this.cU() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        Player var15 = Players.getLocal();
        int var7 = Static.getClient().getTickCount();
        if (aB.llIllIlIlIIlll(var15.distanceTo(var25.ak.bs), lIlIIllIlllI[5]) && aB.llIllIlIlIIllI(var25.cT() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        NPC var13 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIllIlllI[5]];
            stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[32]];
            if (aB.llIllIlIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(nPC.getName().contains(lIlIIllIlIII[lIlIIllIlllI[33]]) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];
                0;
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
        NPC var16 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIIllIlllI[5]];
        nArray2[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC var8 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIlIIllIlllI[5]];
        nArray3[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC var18 = NPCs.getNearest((int[])nArray3);
        if (aB.llIllIlIlIlIII(var16) && aB.llIllIlIlIlIII(var8) && aB.llIllIlIlIlIII(var18)) {
            return var25.cS();
        }
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> {
            int n2;
            if (aB.llIllIlIlIIllI(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[29]]) ? 1 : 0) && aB.llIllIlIlIlIIl(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[30]]) ? 1 : 0) && aB.llIllIlIlIllII(item.getId(), lIlIIllIlllI[31])) {
                n2 = lIlIIllIlllI[5];
                0;
                if (3 == ((104 + 140 - 197 + 103 ^ 132 + 162 - 206 + 103) & (0xF6 ^ 0xC5 ^ (0x38 ^ 0x22) ^ -1))) {
                    return ((0x61 ^ 0x65 ^ (0x63 ^ 0x35)) & (38 + 14 - -66 + 112 ^ 54 + 167 - 107 + 66 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                var25.co.x();
                0;
                return lIlIIllIlllI[5];
            }
            TileObject var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIllIlllI[5]];
                    stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[28]];
                    if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIllIlllI[5];
                        0;
                        if (((0xCE ^ 0x8D) & ~(0x16 ^ 0x55)) <= 1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIllIlllI[0];
                return n2 != 0;
            });
            if (aB.llIllIlIlIlIII(var2)) {
                return lIlIIllIlllI[0];
            }
            var2.interact(lIlIIllIlIII[lIlIIllIlllI[0]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(var13)) {
            if ((!aB.llIllIlIlIlIlI(var15.getInteracting()) || aB.llIllIlIlIlIIl(var15.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[5]]) ? 1 : 0)) && aB.llIllIlIlIlIll(var7 - var25.co.H(), lIlIIllIlllI[6])) {
                var13.interact(lIlIIllIlIII[lIlIIllIlllI[6]]);
                return lIlIIllIlllI[5];
            }
            if (aB.llIllIlIlIlIll(var7 - var25.co.H(), lIlIIllIlllI[6])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIII(var16)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIlI(var15.getInteracting()) && aB.llIllIlIlIIllI(var15.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[7]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIllII(var16.getHealthRatio(), lIlIIllIlllI[4]) && aB.llIllIlIlIllIl(var16.getHealthRatio(), lIlIIllIlllI[8])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIIllI(var16.getWorldArea().isInMeleeDistance(var15.getWorldLocation()) ? 1 : 0)) {
                var16.interact(lIlIIllIlIII[lIlIIllIlllI[9]]);
                return lIlIIllIlllI[5];
            }
            return lIlIIllIlllI[0];
        }
        if (aB.llIllIlIlIlIlI(var16)) {
            if (aB.llIllIlIlIlIlI(var15.getInteracting()) && aB.llIllIlIlIIllI(var15.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[10]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            var16.interact(lIlIIllIlIII[lIlIIllIlllI[11]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIII(var8)) {
            return lIlIIllIlllI[0];
        }
        int var2 = var8.getWorldArea().distanceTo(var15.getWorldLocation());
        if (aB.llIllIlIlIIlll(var2, lIlIIllIlllI[7]) && aB.llIllIlIlIlIlI(var6 = (WorldPoint)(var20 = var25.i(var8).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aB.llIllIlIlIllIl(var8.getWorldArea().distanceTo(worldPoint), lIlIIllIlllI[11])) {
                n2 = lIlIIllIlllI[5];
                0;
                if (-1 >= 0) {
                    return false;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> var8.getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var15.getWorldLocation()))).orElse(null))) {
            System.out.println("Player: " + String.valueOf(var15.getWorldLocation()) + String.valueOf(var8.getWorldLocation()));
            Movement.setDestination((WorldPoint)var6);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(var15.getInteracting()) && aB.llIllIlIlIIllI(var15.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[12]]) ? 1 : 0)) {
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
            0;
            if (-3 > 0) {
                return ((96 + 159 - 125 + 57 ^ 69 + 90 - 21 + 9) & (0x21 ^ 0x27 ^ (0x77 ^ 0x59) ^ -1)) != 0;
            }
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
                0;
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
        void var30;
        void var11;
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
        Prayer var3 = Prayer.PROTECT_FROM_MISSILES;
        if (aB.llIllIlIlIlIlI(var11) && aB.llIllIlIlIIllI(var11.getWorldArea().isInMeleeDistance(var30.getWorldLocation()) ? 1 : 0)) {
            var3 = Prayer.PROTECT_FROM_MELEE;
        }
        arrayList.add((Prayer)var6_6);
        0;
        arrayList.addAll(Prayers.getOffensive());
        0;
        return arrayList;
    }
}

