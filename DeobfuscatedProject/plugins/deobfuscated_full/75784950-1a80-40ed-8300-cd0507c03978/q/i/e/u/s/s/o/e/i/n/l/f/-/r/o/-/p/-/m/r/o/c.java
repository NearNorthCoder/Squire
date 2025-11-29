/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
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
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

/* TASK: Blue moon -> BluemoonTask */
@TaskDesc(name="Blue moon")
public class c
extends Task {
    /* synthetic */ WorldArea E;
    /* synthetic */ WorldArea G;
    /* synthetic */ WorldArea F;
    private final /* synthetic */ SquireMoonsOfPerilConfig z;
    /* synthetic */ WorldArea C;
    /* synthetic */ WorldArea D;
    /* synthetic */ WorldArea I;
    private /* synthetic */ int A;
    /* synthetic */ WorldArea H;
    private static /* synthetic */ int[] lIIIIIIIllIIl;
    /* synthetic */ WorldArea q;
    /* synthetic */ WorldArea B;
    private static /* synthetic */ String[] lIIIIIIIlIllI;

    private static String lIIlIllIllIIIIl(String var19, String var17) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var23 = var17.toCharArray();
        int var2 = lIIIIIIIllIIl[4];
        char[] var10 = var19.toCharArray();
        int var4 = var10.length;
        int var11 = lIIIIIIIllIIl[4];
        while (c.lIIlIllIlllIlII(var11, var4)) {
            char var26 = var10[var11];
            var8.append((char)(var26 ^ var23[var2 % var23.length]));
            0;
            ++var2;
            ++var11;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void lIIlIllIllIIIlI() {
        lIIIIIIIlIllI = new String[lIIIIIIIllIIl[52]];
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[4]] = c."Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[21]] = c."Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[22]] = c."Eat";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[23]] = c."Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[24]] = c."Out of food & low HP!!";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[25]] = c."Quick-escape";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[26]] = c."Move to safe spot";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[28]] = c."Attacking";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[29]] = c."Drink";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[30]] = c."Attack";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[31]] = c."Lighting brazier";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[32]] = c."Light";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[35]] = c."Lit, going to middle";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[38]] = c."Avoiding ice";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[39]] = c."Attacking frozen wep";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[40]] = c."Attack";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[41]] = c."Avoiding ice";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[42]] = c."Brazier";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[43]] = c."Light";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[44]] = c."Moonlight potion";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[45]] = c."Moonlight potion";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[47]] = c."Stairs";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[48]] = c."Quick-escape";
    }

    private static boolean lIIlIllIlllIIII(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean b(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];
            0;
            
            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static String lIIlIllIlIllIII(String var7, String var12) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIIIIIIIllIIl[22], var22);
            return new String(var21.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlllIIll(int n, int n2) {
        return n > n2;
    }

    private static String lIIlIllIlIlIlll(String var24, String var27) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var27.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIIl[29]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIIIIIIIllIIl[22], var14);
            return new String(var28.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Inject
    public c(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(lIIIIIIIllIIl[0], lIIIIIIIllIIl[1], lIIIIIIIllIIl[2], lIIIIIIIllIIl[3], lIIIIIIIllIIl[4]);
        this.B = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.C = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.D = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.E = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.F = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.G = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.H = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.I = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.z = squireMoonsOfPerilConfig;
    }

    private static int lIIlIllIllIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIllIlllIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllIlllIIlI(int n) {
        return n < 0;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.z.blueMoonGear().selected(EquipmentSetup.class);
    }

    static {
        c.lIIlIllIllIIlll();
        c.lIIlIllIllIIIlI();
    }

    public boolean run() {
        List lllllllllllllllIIIlllllIlIlIIlll2;
        Collection<Object> var9;
        Object var20;
        NPC var3;
        c var29;
        if (c.lIIlIllIllIllII(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIllIIl[4];
        }
        if (c.lIIlIllIllIllII(var29.b().isFullyEquipped() ? 1 : 0)) {
            if (c.lIIlIllIllIllIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIllIIl[21]];
                stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[4]];
                if (c.lIIlIllIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIllIlllI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && c.lIIlIllIllIllll(var29.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIIllIIl[21]];
                    stringArray2[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[22]]);
                }
            }
            var29.b().swap();
        }
        NPC var18 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[51]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];
                0;
                if (-(0x6D ^ 0x47 ^ (0x9A ^ 0xB4)) >= 0) {
                    return ((0x82 ^ 0x84 ^ (0x75 ^ 0x61)) & (136 + 56 - 94 + 65 ^ 78 + 28 - 14 + 85 ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        NPC var13 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[49]) && c.lIIlIllIlllIllI(nPC.getAnimation(), lIIIIIIIllIIl[50])) {
                n = lIIIIIIIllIIl[21];
                0;
                if (2 <= 1) {
                    return ((0x5E ^ 0x76 ^ (0x11 ^ 9)) & (0x90 ^ 0xBF ^ (0x84 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        String[] stringArray = new String[lIIIIIIIllIIl[21]];
        stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[23]];
        if (c.lIIlIllIllIllII(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIlllIIII(var18) && c.lIIlIllIlllIIII(var13) && c.lIIlIllIlllIIlI(c.lIIlIllIllIlIlI(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[24]];
            var3 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[47]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[48]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];
                        0;
                        if (null == null) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(var3)) {
                var3.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[25]]);
                return lIIIIIIIllIIl[4];
            }
        }
        if (c.lIIlIllIllIlllI(var3 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[46]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];
                0;
                if (2 == 1) {
                    return ((0xCC ^ 0xC1 ^ (0x99 ^ 0x9F)) & (0xC5 ^ 0x80 ^ (0x8B ^ 0xC5) ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        }))) {
            var20 = var29.d(var3.getWorldLocation());
            if (c.lIIlIllIllIllII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[26]];
                Movement.setDestination((WorldPoint)var3.getWorldLocation());
                return lIIIIIIIllIIl[4];
            }
            if (c.lIIlIllIllIllIl(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lIIIIIIIllIIl[21]];
                nArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIllIIl[27];
                var9 = NPCs.getNearest((int[])nArray);
                if (c.lIIlIllIllIlllI(var9)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[28]];
                    if (c.lIIlIllIllIllIl(l.l() ? 1 : 0) && c.lIIlIllIllIllIl(Inventory.contains(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[45]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[44]])).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[29]]);
                        return lIIIIIIIllIIl[4];
                    }
                    var9.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[30]]);
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(var18)) {
            if (c.lIIlIllIllIllII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIIIIIIIllIIl[21];
            }
            var20 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[42]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[43]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0) && c.lIIlIllIllIllIl(this.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];
                        0;
                        if (((0xA6 ^ 0xBF) & ~(0x5E ^ 0x47)) < 2) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(var20)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[31]];
                var20.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[32]]);
                return lIIIIIIIllIIl[21];
            }
            if (c.lIIlIllIlllIIII(var20)) {
                var9 = new WorldPoint(lIIIIIIIllIIl[33], lIIIIIIIllIIl[34], lIIIIIIIllIIl[4]);
                if (c.lIIlIllIlllIIll(Players.getLocal().getWorldLocation().distanceTo(var9), lIIIIIIIllIIl[24])) {
                    WorldArea lllllllllllllllIIIlllllIlIlIIlll2 = new WorldArea(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[24], lIIIIIIIllIIl[23], lIIIIIIIllIIl[4]);
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[35]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2.getRandom());
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(var13)) {
            var20 = var29.c(lIIIIIIIllIIl[36]);
            var9 = var29.c(lIIIIIIIllIIl[37]);
            lllllllllllllllIIIlllllIlIlIIlll2 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            WorldPoint var16 = lllllllllllllllIIIlllllIlIlIIlll2.stream().filter(arg_0 -> c.c((Set)var20, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(var20.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(var16)) {
                if (c.lIIlIllIlllIlII(var29.A, lIIIIIIIllIIl[22])) {
                    var29.A += lIIIIIIIllIIl[21];
                    Time.sleepTicks((int)lIIIIIIIllIIl[21]);
                    0;
                    Time.sleep((long)300L);
                    0;
                }
                if (c.lIIlIllIlllIlIl(var29.A, lIIIIIIIllIIl[22])) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[38]];
                    Movement.setDestination((WorldPoint)var16);
                    var29.A = lIIIIIIIllIIl[4];
                    return lIIIIIIIllIIl[4];
                }
            }
            if (!c.lIIlIllIllIllII(var20.isEmpty() ? 1 : 0) || c.lIIlIllIllIllIl(var9.isEmpty() ? 1 : 0)) {
                var29.A = lIIIIIIIllIIl[4];
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[39]];
                var13.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[40]]);
                return lIIIIIIIllIIl[21];
            }
        }
        if (c.lIIlIllIlllIIII(var13)) {
            var20 = var29.c(lIIIIIIIllIIl[36]);
            var9 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            lllllllllllllllIIIlllllIlIlIIlll2 = var9.stream().filter(arg_0 -> c.b((Set)var20, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(var20.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIIlll2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[41]];
                Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2);
                var29.A = lIIIIIIIllIIl[4];
                return lIIIIIIIllIIl[4];
            }
        }
        return lIIIIIIIllIIl[21];
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var5;
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIIllIIl[29]];
        worldAreaArray[c.lIIIIIIIllIIl[4]] = this.B;
        worldAreaArray[c.lIIIIIIIllIIl[21]] = this.C;
        worldAreaArray[c.lIIIIIIIllIIl[22]] = this.D;
        worldAreaArray[c.lIIIIIIIllIIl[23]] = this.E;
        worldAreaArray[c.lIIIIIIIllIIl[24]] = this.F;
        worldAreaArray[c.lIIIIIIIllIIl[25]] = this.G;
        worldAreaArray[c.lIIIIIIIllIIl[26]] = this.H;
        worldAreaArray[c.lIIIIIIIllIIl[28]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var15 = lIIIIIIIllIIl[4];
        while (c.lIIlIllIlllIlII(var15, var5.size())) {
            void var25;
            if (c.lIIlIllIllIllIl(((WorldArea)var5.get(var15)).contains((WorldPoint)var25) ? 1 : 0)) {
                WorldArea lllllllllllllllIIIlllllIlIIlllIl = (WorldArea)var5.get(var15);
                0;
                if (-(0x94 ^ 0x90) < 0) break;
                return null;
            }
            ++var15;
            0;
            if (-(0x82 ^ 0x86) <= 0) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean lIIlIllIllIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlllIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIllIllIllII(int n) {
        return n == 0;
    }

    private static /* synthetic */ boolean c(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];
            0;
            if (((0xD ^ 0x38) & ~(0xAF ^ 0x9A)) > (0xB8 ^ 0xBC)) {
                return false;
            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllIllIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIllIllIllll(int n) {
        return n <= 0;
    }

    private static void lIIlIllIllIIlll() {
        lIIIIIIIllIIl = new int[53];
        c.lIIIIIIIllIIl[0] = 0xFFFFE5CF & 0x1FBB;
        c.lIIIIIIIllIIl[1] = -(0xFFFFFA6B & 0x4FD5) & (0xFFFFEFFF & Short.MAX_VALUE);
        c.lIIIIIIIllIIl[2] = 27 + 66 - 77 + 119 ^ 46 + 63 - -61 + 4;
        c.lIIIIIIIllIIl[3] = 0x72 ^ 0x57;
        c.lIIIIIIIllIIl[4] = (0x81 ^ 0xA2) & ~(0x59 ^ 0x7A);
        c.lIIIIIIIllIIl[5] = -(0xFFFFFD2A & 0x3AF7) & (0xFFFFBFFF & 0x7DBF);
        c.lIIIIIIIllIIl[6] = 0xFFFFE7EE & 0x3DDD;
        c.lIIIIIIIllIIl[7] = -(0xFFFFA7FD & 0x7A63) & (0xFFFFAFFF & 0x77FF);
        c.lIIIIIIIllIIl[8] = -(0xFFFFFB77 & 0x4E89) & (0xFFFFFFED & 0x6FDF);
        c.lIIIIIIIllIIl[9] = 0xFFFFDFDE & 0x25BD;
        c.lIIIIIIIllIIl[10] = -(0xFFFF92EE & 0x7D13) & (0xFFFFF7EF & 0x3DDF);
        c.lIIIIIIIllIIl[11] = 0xFFFF859D & Short.MAX_VALUE;
        c.lIIIIIIIllIIl[12] = -(0xFFFFF857 & 0xFB9) & (0xFFFFADFF & 0x7FDF);
        c.lIIIIIIIllIIl[13] = -(0xFFFFFA6F & 0x5FB3) & (0xFFFFFFF7 & 0x7FFB);
        c.lIIIIIIIllIIl[14] = 0xFFFFF5D7 & 0x2FFA;
        c.lIIIIIIIllIIl[15] = -(0xFFFFFB39 & 0x44CF) & (0xFFFFF5DB & 0x6FFF);
        c.lIIIIIIIllIIl[16] = 0xFFFFB7FE & 0x6DD5;
        c.lIIIIIIIllIIl[17] = -(0xFFFFEECF & 0x733F) & (0xFFFFF7FF & 0x6FAF);
        c.lIIIIIIIllIIl[18] = 0xFFFFDFE6 & 0x25BB;
        c.lIIIIIIIllIIl[19] = 0xFFFFAFBB & 0x55E7;
        c.lIIIIIIIllIIl[20] = 0xFFFFC7F5 & 0x3DAE;
        c.lIIIIIIIllIIl[21] = 1;
        c.lIIIIIIIllIIl[22] = 2;
        c.lIIIIIIIllIIl[23] = 3;
        c.lIIIIIIIllIIl[24] = 0xB9 ^ 0xB0 ^ (0x6B ^ 0x66);
        c.lIIIIIIIllIIl[25] = 0x73 ^ 0x76;
        c.lIIIIIIIllIIl[26] = 0x92 ^ 0x94;
        c.lIIIIIIIllIIl[27] = 0xFFFFF2F5 & 0x3FDF;
        c.lIIIIIIIllIIl[28] = 0xA0 ^ 0xA7;
        c.lIIIIIIIllIIl[29] = 0x2D ^ 0x25;
        c.lIIIIIIIllIIl[30] = 0x6F ^ 0x40 ^ (0x1C ^ 0x3A);
        c.lIIIIIIIllIIl[31] = 0x39 ^ 0x33;
        c.lIIIIIIIllIIl[32] = 0x56 ^ 0x5D;
        c.lIIIIIIIllIIl[33] = 0xFFFFF5AF & 0xFF0;
        c.lIIIIIIIllIIl[34] = 0xFFFFEFCF & 0x35FB;
        c.lIIIIIIIllIIl[35] = 70 + 125 - 159 + 107 ^ 50 + 101 - 47 + 27;
        c.lIIIIIIIllIIl[36] = 0xFFFF8BFB & 0x7ED7;
        c.lIIIIIIIllIIl[37] = 0xFFFFAFD6 & 0x5AFB;
        c.lIIIIIIIllIIl[38] = 0x16 ^ 0x1B;
        c.lIIIIIIIllIIl[39] = 0xC0 ^ 0x81 ^ (0xDE ^ 0x91);
        c.lIIIIIIIllIIl[40] = 0xB0 ^ 0xBF;
        c.lIIIIIIIllIIl[41] = 0xEA ^ 0x97 ^ (0xE9 ^ 0x84);
        c.lIIIIIIIllIIl[42] = 123 + 5 - 122 + 146 ^ 49 + 68 - 64 + 84;
        c.lIIIIIIIllIIl[43] = 0x20 ^ 0x32;
        c.lIIIIIIIllIIl[44] = 0x2D ^ 0x3E;
        c.lIIIIIIIllIIl[45] = 0x77 ^ 0x63;
        c.lIIIIIIIllIIl[46] = -(0xFFFFD7F9 & 0x6D2F) & (0xFFFFF7FF & Short.MAX_VALUE);
        c.lIIIIIIIllIIl[47] = 43 + 2 - -76 + 56 ^ 154 + 50 - 138 + 98;
        c.lIIIIIIIllIIl[48] = 0x32 ^ 0x24;
        c.lIIIIIIIllIIl[49] = -(0xFFFFE55D & 0x1FBB) & (0xFFFFFFFD & 0x37FB);
        c.lIIIIIIIllIIl[50] = -(0xFFFFD2DB & 0x7DE5) & (0xFFFFFFFF & 0x7BD7);
        c.lIIIIIIIllIIl[51] = -(0xFFFFBD3F & 0x4FDD) & (0xFFFFFFFF & 0x3FFF);
        c.lIIIIIIIllIIl[52] = 155 + 93 - 204 + 137 ^ 9 + 98 - -46 + 9;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }

    private Set<WorldPoint> c(int n) {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
            if (c.lIIlIllIlllIllI(graphicsObject.getId(), n)) {
                hashSet.add(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)graphicsObject.getLocation()));
                0;
            }
        });
        return hashSet;
    }

    private static boolean lIIlIllIlllIlIl(int n, int n2) {
        return n >= n2;
    }
}

