/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

/* TASK: Eclipse moon -> EclipsemoonTask */
@TaskDesc(name="Eclipse moon")
public class g
extends Task {
    private static /* synthetic */ int[] lIIIIIIlIIlII;
    /* synthetic */ WorldArea Q;
    /* synthetic */ WorldArea E;
    /* synthetic */ WorldArea G;
    /* synthetic */ WorldArea H;
    private static /* synthetic */ Set<WorldPoint> P;
    /* synthetic */ WorldArea F;
    /* synthetic */ WorldArea C;
    private final /* synthetic */ SquireMoonsOfPerilConfig O;
    /* synthetic */ WorldArea B;
    private static /* synthetic */ String[] lIIIIIIlIIIll;
    /* synthetic */ WorldArea D;
    /* synthetic */ WorldArea I;

    private static boolean lIIlIlllIllIlll(int n, int n2) {
        return n < n2;
    }

    static {
        g.lIIlIlllIlIllll();
        g.lIIlIlllIlIlllI();
        P = new HashSet<WorldPoint>();
    }

    private static String lIIlIlllIlIlIll(String var1, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIIIIIlIIlII[22], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    @Inject
    public g(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.Q = new WorldArea(lIIIIIIlIIlII[0], lIIIIIIlIIlII[1], lIIIIIIlIIlII[2], lIIIIIIlIIlII[3], lIIIIIIlIIlII[4]);
        this.B = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
        this.C = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
        this.D = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
        this.E = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
        this.F = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));
        this.G = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
        this.H = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
        this.I = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));
        this.O = squireMoonsOfPerilConfig;
    }

    private static void lIIlIlllIlIllll() {
        lIIIIIIlIIlII = new int[41];
        g.lIIIIIIlIIlII[0] = 0xFFFFBFFF & 0x45BF;
        g.lIIIIIIlIIlII[1] = -(0xD0 ^ 0xB2) & (0xFFFFF7EB & 0x2DFF);
        g.lIIIIIIlIIlII[2] = 0x66 ^ 0x44 ^ (0x7A ^ 0x7E);
        g.lIIIIIIlIIlII[3] = 53 + 16 - -65 + 22 ^ 163 + 175 - 251 + 89;
        g.lIIIIIIlIIlII[4] = (0x56 ^ 0x14 ^ (0x41 ^ 0x32)) & (0x12 ^ 0x72 ^ (0x1C ^ 0x4D) ^ -1);
        g.lIIIIIIlIIlII[5] = 0xFFFFA7DD & 0x5DEE;
        g.lIIIIIIlIIlII[6] = -(0xFFFFF11F & 0x4EFF) & (0xFFFFEDFF & 0x77BF);
        g.lIIIIIIlIIlII[7] = 0xFFFFB7CF & 0x4DFD;
        g.lIIIIIIlIIlII[8] = -(0xFFFFFAD5 & 0x557F) & (0xFFFFFDFF & 0x77F6);
        g.lIIIIIIlIIlII[9] = 0xFFFF9DDE & 0x67EF;
        g.lIIIIIIlIIlII[10] = -(0xFFFFF777 & 0x5ACD) & (0xFFFFFFF7 & 0x77EF);
        g.lIIIIIIlIIlII[11] = 0xFFFFEDFF & 0x17CF;
        g.lIIIIIIlIIlII[12] = -(0xFFFFC76C & 0x78DF) & (0xFFFFE5FF & 0x7FEF);
        g.lIIIIIIlIIlII[13] = -(0x93 ^ 0x94) & (0xFFFFCDFF & 0x37D7);
        g.lIIIIIIlIIlII[14] = 0xFFFFF7F3 & 0xDDE;
        g.lIIIIIIlIIlII[15] = 0xFFFFF7DB & 0xDF7;
        g.lIIIIIIlIIlII[16] = 0xFFFFD7DE & 0x2DF5;
        g.lIIIIIIlIIlII[17] = 0xFFFFBFFE & 0x659F;
        g.lIIIIIIlIIlII[18] = 0xFFFFE7BF & 0x3DDF;
        g.lIIIIIIlIIlII[19] = -(0xFFFFEA0F & 0x5FF2) & (0xFFFFFFBD & 0x6FDF);
        g.lIIIIIIlIIlII[20] = -(0xFFFFF7FB & 0x4A67) & (0xFFFFEFFF & 0x77FF);
        g.lIIIIIIlIIlII[21] = 1;
        g.lIIIIIIlIIlII[22] = 2;
        g.lIIIIIIlIIlII[23] = 3;
        g.lIIIIIIlIIlII[24] = -(0xFFFFCEE9 & 0x7D37) & (0xFFFFFEF5 & 0x7FFE);
        g.lIIIIIIlIIlII[25] = 131 + 101 - 193 + 145 ^ 0 + 95 - -15 + 78;
        g.lIIIIIIlIIlII[26] = 0xB3 ^ 0xB6;
        g.lIIIIIIlIIlII[27] = -(0xFFFFE7EB & 0x3897) & (0xFFFFFFFE & 0x77B7);
        g.lIIIIIIlIIlII[28] = 0x15 ^ 0x53 ^ (0xC7 ^ 0x87);
        g.lIIIIIIlIIlII[29] = 24 + 110 - 84 + 93 ^ 22 + 26 - 20 + 108;
        g.lIIIIIIlIIlII[30] = -1;
        g.lIIIIIIlIIlII[31] = 0xFFFFBDE7 & 0x67BD;
        g.lIIIIIIlIIlII[32] = 0xFFFFBFEF & 0x45DB;
        g.lIIIIIIlIIlII[33] = 0xFFFFBDFA & 0x47D5;
        g.lIIIIIIlIIlII[34] = 0xFFFFAFB3 & 0x75EC;
        g.lIIIIIIlIIlII[35] = 61 + 16 - -98 + 16 ^ 27 + 30 - 15 + 141;
        g.lIIIIIIlIIlII[36] = -(0xFFFFC932 & 0x77EF) & (0xFFFFFFFF & 0x73FD);
        g.lIIIIIIlIIlII[37] = 0xC6 ^ 0xAD ^ (0x19 ^ 0x7B);
        g.lIIIIIIlIIlII[38] = 0x22 ^ 0x28;
        g.lIIIIIIlIIlII[39] = 0xFFFFBEFF & 0x73D7;
        g.lIIIIIIlIIlII[40] = 0xA6 ^ 0xAD;
    }

    private static boolean lIIlIlllIllIllI(int n, int n2) {
        return n != n2;
    }

    private static String lIIlIlllIlIllII(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var24 = var19.toCharArray();
        int var15 = lIIIIIIlIIlII[4];
        char[] var26 = var18.toCharArray();
        int var4 = var26.length;
        int var17 = lIIIIIIlIIlII[4];
        while (g.lIIlIlllIllIlll(var17, var4)) {
            char var23 = var26[var17];
            var14.append((char)(var23 ^ var24[var15 % var24.length]));
            0;
            ++var15;
            ++var17;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var2;
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIlIIlII[35]];
        worldAreaArray[g.lIIIIIIlIIlII[4]] = this.B;
        worldAreaArray[g.lIIIIIIlIIlII[21]] = this.C;
        worldAreaArray[g.lIIIIIIlIIlII[22]] = this.D;
        worldAreaArray[g.lIIIIIIlIIlII[23]] = this.E;
        worldAreaArray[g.lIIIIIIlIIlII[25]] = this.F;
        worldAreaArray[g.lIIIIIIlIIlII[26]] = this.G;
        worldAreaArray[g.lIIIIIIlIIlII[28]] = this.H;
        worldAreaArray[g.lIIIIIIlIIlII[29]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var9 = lIIIIIIlIIlII[4];
        while (g.lIIlIlllIllIlll(var9, var2.size())) {
            void var20;
            if (g.lIIlIlllIllIIIl(((WorldArea)var2.get(var9)).contains((WorldPoint)var20) ? 1 : 0)) {
                WorldArea lllllllllllllllIIIllllIIlIIIlllI = (WorldArea)var2.get(var9);
                0;
                if (null == null) break;
                return null;
            }
            ++var9;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean lIIlIlllIllIIII(int n) {
        return n == 0;
    }

    private static boolean lIIlIlllIllIIIl(int n) {
        return n != 0;
    }

    public boolean run() {
        WorldPoint var7;
        WorldPoint lllllllllllllllIIIllllIIlIIllIII2;
        NPC lllllllllllllllIIIllllIIlIIllIIl2;
        WorldPoint lllllllllllllllIIIllllIIlIIllIlI2;
        NPC var10;
        NPC var13;
        g var16;
        if (g.lIIlIlllIllIIII(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIlII[4];
        }
        if (g.lIIlIlllIllIIII(var16.b().isFullyEquipped() ? 1 : 0)) {
            if (g.lIIlIlllIllIIIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIIlII[21]];
                stringArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[4]];
                if (g.lIIlIlllIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && g.lIIlIlllIllIIlI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && g.lIIlIlllIllIIll(var16.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIIlII[21]];
                    stringArray2[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[22]]);
                }
            }
            var16.b().swap();
        }
        if (g.lIIlIlllIllIIlI(var13 = NPCs.getNearest(nPC -> {
            int n;
            if (g.lIIlIlllIllIlIl(nPC.getId(), lIIIIIIlIIlII[39]) && g.lIIlIlllIllIIIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIlII[21];
                0;
                if ((0x1F ^ 0x1B) < 0) {
                    return false;
                }
            } else {
                n = lIIIIIIlIIlII[4];
            }
            return n != 0;
        })) && g.lIIlIlllIllIIlI(var10 = var16.d(var13.getWorldLocation()))) {
            if (g.lIIlIlllIllIIII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[23]];
                Movement.setDestination((WorldPoint)var13.getWorldLocation());
                return lIIIIIIlIIlII[4];
            }
            if (g.lIIlIlllIllIIIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lIIIIIIlIIlII[21]];
                nArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
                lllllllllllllllIIIllllIIlIIllIlI2 = NPCs.getNearest((int[])nArray);
                if (g.lIIlIlllIllIIlI(lllllllllllllllIIIllllIIlIIllIlI2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[25]];
                    if (g.lIIlIlllIllIIIl(l.l() ? 1 : 0) && g.lIIlIlllIllIIIl(Inventory.contains(item -> item.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[38]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[37]])).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[26]]);
                        return lIIIIIIlIIlII[4];
                    }
                    int[] nArray2 = new int[lIIIIIIlIIlII[21]];
                    nArray2[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[27];
                    if (g.lIIlIlllIllIIIl(Equipment.contains((int[])nArray2) ? 1 : 0) && g.lIIlIlllIllIlII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
                        return lIIIIIIlIIlII[4];
                    }
                    lllllllllllllllIIIllllIIlIIllIlI2.interact(lIIIIIIlIIIll[lIIIIIIlIIlII[28]]);
                    return lIIIIIIlIIlII[21];
                }
            }
        }
        if (g.lIIlIlllIllIIlI(var10 = NPCs.getNearest(nPC -> {
            int n;
            if (g.lIIlIlllIllIlIl(nPC.getId(), lIIIIIIlIIlII[36]) && g.lIIlIlllIllIIIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIlII[21];
                0;
                if (((105 + 46 - 94 + 97 ^ 95 + 147 - 126 + 78) & (0xC ^ 0x5F ^ (0xAF ^ 0xA4) ^ -1)) != 0) {
                    return ((0x5A ^ 0x5F ^ (0x96 ^ 0xC5)) & (47 + 211 - 249 + 203 ^ 82 + 56 - 89 + 81 ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIlIIlII[4];
            }
            return n != 0;
        }))) {
            if (g.lIIlIlllIllIIIl(var10.isMoving() ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[29]];
                if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)var10.getWorldLocation()) ? 1 : 0)) {
                    int lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[4];
                    int lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[4];
                    if (g.lIIlIlllIllIlIl(var10.getWorldLocation().getY(), lIIIIIIlIIlII[19]) && g.lIIlIlllIllIllI(var10.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[30];
                    }
                    if (g.lIIlIlllIllIlIl(var10.getWorldLocation().getX(), lIIIIIIlIIlII[5])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[21];
                    }
                    if (g.lIIlIlllIllIlIl(var10.getWorldLocation().getY(), lIIIIIIlIIlII[10]) && g.lIIlIlllIllIllI(var10.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[21];
                    }
                    if (g.lIIlIlllIllIlIl(var10.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[30];
                    }
                    WorldPoint lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(var10.getWorldLocation().getX() + lllllllllllllllIIIllllIIlIIllIlI2, var10.getWorldLocation().getY() + lllllllllllllllIIIllllIIlIIllIIl2, lIIIIIIlIIlII[4]);
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                    return lIIIIIIlIIlII[21];
                }
            }
            if (g.lIIlIlllIllIIII(var10.isMoving() ? 1 : 0)) {
                lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var10.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIIl2);
                        return lIIIIIIlIIlII[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var10.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[31], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                        return lIIIIIIlIIlII[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var10.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                    var7 = new WorldPoint(lIIIIIIlIIlII[32], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var7);
                        return lIIIIIIlIIlII[21];
                    }
                }
            }
        }
        lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(lIIIIIIlIIlII[33], lIIIIIIlIIlII[34], lIIIIIIlIIlII[4]);
        if (g.lIIlIlllIllIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
            SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[35]];
            int[] nArray = new int[lIIIIIIlIIlII[21]];
            nArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
            lllllllllllllllIIIllllIIlIIllIIl2 = NPCs.getNearest((int[])nArray);
            if (g.lIIlIlllIllIIlI(lllllllllllllllIIIllllIIlIIllIIl2)) {
                P.add(lllllllllllllllIIIllllIIlIIllIIl2.getWorldLocation());
                0;
            }
            if (g.lIIlIlllIllIIII(SquireMoonsOfPeril.j.isEmpty() ? 1 : 0) && g.lIIlIlllIllIIIl((lllllllllllllllIIIllllIIlIIllIII2 = SquireMoonsOfPeril.j.iterator()).hasNext() ? 1 : 0)) {
                var7 = lllllllllllllllIIIllllIIlIIllIII2.next();
                Movement.setDestination((WorldPoint)var7);
                lllllllllllllllIIIllllIIlIIllIII2.remove();
                Time.sleepTicks((int)lIIIIIIlIIlII[21]);
                0;
                return lIIIIIIlIIlII[21];
            }
        }
        return lIIIIIIlIIlII[21];
    }

    private static boolean lIIlIlllIllIlII(Object object, Object object2) {
        return object != object2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.Q.contains(worldPoint);
    }

    private static boolean lIIlIlllIllIIll(int n) {
        return n <= 0;
    }

    private static void lIIlIlllIlIlllI() {
        lIIIIIIlIIIll = new String[lIIIIIIlIIlII[40]];
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[4]] = g."Cooked bream";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[21]] = g."Cooked bream";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[22]] = g."Eat";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[23]] = g."Move to safe spot";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[25]] = g."Attacking";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[26]] = g."Drink";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[28]] = g."Attack";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[29]] = g."Walking with moon";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[35]] = g."Turning spec";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[37]] = g."Moonlight potion";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[38]] = g."Moonlight potion";
    }

    private static boolean lIIlIlllIllIlIl(int n, int n2) {
        return n == n2;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.O.eclipseGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIllIIlI(Object object) {
        return object != null;
    }

    private static String lIIlIlllIlIllIl(String var11, String var3) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIlII[35]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIIIIIlIIlII[22], var21);
            return new String(var5.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

