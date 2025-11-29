/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

public abstract class U
extends Task {
    protected final /* synthetic */ SquireChambersConfig cp;
    private static /* synthetic */ int[] lIlIIIIIllII;
    protected static /* synthetic */ a aa;
    private static /* synthetic */ String[] lIlIIIIIlIll;
    protected /* synthetic */ Random cr;
    protected final /* synthetic */ SquireChambersPlugin co;
    protected /* synthetic */ Player bS;
    protected final /* synthetic */ Client cq;

    /*
     * WARNING - void declaration
     */
    protected boolean e(n n2) {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (U.llIlIlIIIllIlI(tileObject.getName().equals(lIlIIIIIlIll[lIlIIIIIllII[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIllII[0]];
                stringArray[U.lIlIIIIIllII[1]] = lIlIIIIIlIll[lIlIIIIIllII[5]];
                if (U.llIlIlIIIllIlI(tileObject.hasAction(stringArray) ? 1 : 0) && U.llIlIlIIIllIlI(n2.a((Locatable)tileObject) ? 1 : 0)) {
                    n3 = lIlIIIIIllII[0];
                    0;
                    if (1 >= 1) return n3 != 0;
                    return false;
                }
            }
            n3 = lIlIIIIIllII[1];
            return n3 != 0;
        });
        if (U.llIlIlIIIlllII(tileObject2)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIlIIIII(Movement.getRunEnergy(), lIlIIIIIllII[3])) {
            U var6;
            void var27;
            if (U.llIlIlIIIlIlll(Movement.getRunEnergy(), lIlIIIIIllII[4]) && U.llIlIlIIIlIlll(var27.distanceTo((Locatable)var6.bS), lIlIIIIIllII[5])) {
                var27.interact(lIlIIIIIlIll[lIlIIIIIllII[1]]);
                return lIlIIIIIllII[0];
            }
            return lIlIIIIIllII[1];
        }
        tileObject2.interact(lIlIIIIIlIll[lIlIIIIIllII[0]]);
        return lIlIIIIIllII[0];
    }

    private static boolean llIlIlIIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private void cl() {
        List<Prayer> list = this.ci();
        if (U.llIlIlIIIlllIl(list) && U.llIlIlIIIlIllI(list.isEmpty() ? 1 : 0) && U.llIlIlIIIllllI(Prayers.getPoints())) {
            void var1;
            if (U.llIlIlIIIllIIl((Object)this.co.L().aM(), (Object)N.VESPULA)) {
                Prayers.flick(list, (boolean)lIlIIIIIllII[0]);
                0;
                return;
            }
            Prayers.flick((List)var1);
            0;
            0;
            if (((0x87 ^ 0xC2) & ~(0x22 ^ 0x67)) > 0) {
                return;
            }
        } else {
            Prayers.disableAll();
        }
    }

    private static boolean llIlIlIIIlllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean cn() {
        void var1_1;
        U var9;
        if (U.llIlIlIIIllIlI(Inventory.contains(item -> item.getName().startsWith(lIlIIIIIlIll[lIlIIIIIllII[9]])) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> {
            int n2;
            if (U.llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[8]) && U.llIlIlIIIllIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIIIIIllII[0];
                0;
                if (1 < ((0x15 ^ 0x5E ^ (0x32 ^ 0x76)) & (112 + 43 - 144 + 118 ^ 140 + 23 - 62 + 41 ^ -1))) {
                    return ((0x3E ^ 0x2C ^ (0x1E ^ 0x50) & ~(0x29 ^ 0x67)) & (0xB ^ 0x6E ^ (0x76 ^ 1) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIIIllII[1];
            }
            return n2 != 0;
        });
        if (U.llIlIlIIIlllII(var3)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            var9.co.x();
            0;
            return lIlIIIIIllII[0];
        }
        if (U.llIlIlIIIllIlI(var9.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        }
        var1_1.interact(lIlIIIIIlIll[lIlIIIIIllII[6]]);
        return lIlIIIIIllII[0];
    }

    protected boolean co() {
        U var33;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (U.llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[7]) && U.llIlIlIIIllIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIIIIIllII[0];
                0;
                if (1 <= 0) {
                    return ((0x56 ^ 0x42 ^ (0xA3 ^ 0x87)) & (0x5F ^ 3 ^ (0x28 ^ 0x44) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIIIllII[1];
            }
            return n2 != 0;
        });
        if (U.llIlIlIIIlllII(tileItem2)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            var33.co.x();
            0;
            return lIlIIIIIllII[0];
        }
        if (U.llIlIlIIIllIlI(var33.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        }
        tileItem2.interact(lIlIIIIIlIll[lIlIIIIIllII[2]]);
        return lIlIIIIIllII[0];
    }

    private static boolean llIlIlIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIllllI(int n2) {
        return n2 > 0;
    }

    private static void llIlIlIIIlIlIl() {
        lIlIIIIIllII = new int[13];
        U.lIlIIIIIllII[0] = 1;
        U.lIlIIIIIllII[1] = (0xDE ^ 0xA8 ^ (0x69 ^ 0x14)) & (5 + 21 - -34 + 86 ^ 84 + 28 - 15 + 56 ^ -1);
        U.lIlIIIIIllII[2] = 3;
        U.lIlIIIIIllII[3] = 0x28 ^ 0xB ^ (0x53 ^ 0x4C);
        U.lIlIIIIIllII[4] = 0xFA ^ 0xA0;
        U.lIlIIIIIllII[5] = 32 + 57 - -67 + 4 ^ 63 + 87 - 121 + 137;
        U.lIlIIIIIllII[6] = 2;
        U.lIlIIIIIllII[7] = 0xFFFFD9FD & 0x3FAF;
        U.lIlIIIIIllII[8] = -(0xFFFFFEDC & 0xD7F) & (0xFFFFDE5F & Short.MAX_VALUE);
        U.lIlIIIIIllII[9] = 0x12 ^ 0xB ^ (6 ^ 0x1B);
        U.lIlIIIIIllII[10] = 0x83 ^ 0x86;
        U.lIlIIIIIllII[11] = 0x21 ^ 0x3E ^ (0x50 ^ 0x48);
        U.lIlIIIIIllII[12] = 0xA8 ^ 0xA0;
    }

    public boolean run() {
        U var32;
        if (U.llIlIlIIIlIllI(this.cq.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIllIlI(var32.cp.pause() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        aa = var32.co.C();
        if (U.llIlIlIIIlllII(aa)) {
            return lIlIIIIIllII[1];
        }
        var32.bS = Players.getLocal();
        if (U.llIlIlIIIlllII(var32.bS)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(var32.ch() ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        this.cl();
        this.cm();
        return this.cg();
    }

    public abstract boolean ch();

    private static boolean llIlIlIIIlllll(int n2) {
        return n2 <= 0;
    }

    static {
        U.llIlIlIIIlIlIl();
        U.llIlIlIIIlIlII();
    }

    private static boolean llIlIlIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIlIIIlIIll(String var22, String var7) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var34 = var7.toCharArray();
        int var25 = lIlIIIIIllII[1];
        char[] var15 = var22.toCharArray();
        int var21 = var15.length;
        int var8 = lIlIIIIIllII[1];
        while (U.llIlIlIIIlIlll(var8, var21)) {
            char var4 = var15[var8];
            var14.append((char)(var4 ^ var34[var25 % var34.length]));
            0;
            ++var25;
            ++var8;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean llIlIlIIIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlIIIlIIlI(String var18, String var17) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var31 = Cipher.getInstance("Blowfish");
            var31.init(lIlIIIIIllII[6], var24);
            return new String(var31.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIlIlII() {
        lIlIIIIIlIll = new String[lIlIIIIIllII[11]];
        U.lIlIIIIIlIll[U.lIlIIIIIllII[1]] = U."Touch";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[0]] = U."Touch";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[6]] = U."Take";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[2]] = U."Take";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[9]] = U."Overload";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[10]] = U."Energy well";
        U.lIlIIIIIlIll[U.lIlIIIIIllII[5]] = U."Touch";
    }

    private static boolean llIlIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIlllIl(Object object) {
        return object != null;
    }

    @Inject
    protected U(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        this.cr = new Random();
        this.co = squireChambersPlugin;
        this.cp = squireChambersConfig;
        this.cq = client;
    }

    /*
     * WARNING - void declaration
     */
    private void cm() {
        void var23;
        EquipmentSetup equipmentSetup = this.cj();
        if (U.llIlIlIIIlllII(equipmentSetup)) {
            return;
        }
        if (U.llIlIlIIIllIlI(var23.isEquipped() ? 1 : 0)) {
            return;
        }
        if (U.llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0) && U.llIlIlIIIlllIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && U.llIlIlIIIlllll(var23.get(EquipmentInventorySlot.SHIELD))) {
            U var11;
            var11.co.x();
            0;
        }
        Gear.swapTo((EquipmentSetup)equipmentSetup);
        0;
    }

    public abstract List<Prayer> ci();

    public abstract EquipmentSetup cj();

    private static String llIlIlIIIlIIIl(String var12, String var29) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllII[12]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIlIIIIIllII[6], var26);
            return new String(var19.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public abstract boolean cg();

    protected boolean ck() {
        U var16;
        int var13;
        int n2;
        if (U.llIlIlIIIlIllI(aa.e().contains((Object)N.UNKNOWN_COMBAT) ? 1 : 0) && U.llIlIlIIIlIllI(aa.e().contains((Object)N.UNKNOWN_PUZZLE) ? 1 : 0)) {
            n2 = lIlIIIIIllII[0];
            0;
            
            }
        } else {
            n2 = lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(var13 = n2)) {
            return lIlIIIIIllII[1];
        }
        List<N> var20 = aa.e();
        ArrayList<N> var10 = new ArrayList<N>();
        ArrayList<N> var2 = new ArrayList<N>();
        int lllllllllllllllIlllIIlIIIlllIlII22 = lIlIIIIIllII[1];
        while (U.llIlIlIIIlIlll(lllllllllllllllIlllIIlIIIlllIlII22, var20.size())) {
            N var28 = var20.get(lllllllllllllllIlllIIlIIIlllIlII22);
            if (U.llIlIlIIIllIII((Object)var28, (Object)N.START) && U.llIlIlIIIllIII((Object)var28, (Object)N.SCAVENGERS) && U.llIlIlIIIllIII((Object)var28, (Object)N.FARMING)) {
                if (U.llIlIlIIIllIIl((Object)var28, (Object)N.END)) {
                    0;
                    if (3 <= 0) {
                        return ((0x34 ^ 0x4A ^ (0x25 ^ 0x17)) & (0xAC ^ 0xA0 ^ (0x57 ^ 0x17) ^ -1)) != 0;
                    }
                } else {
                    if (U.llIlIlIIIllIIl((Object)var28.bY(), (Object)P.COMBAT)) {
                        var10.add(var28);
                        0;
                    }
                    if (U.llIlIlIIIllIIl((Object)var28.bY(), (Object)P.PUZZLE)) {
                        var2.add(var28);
                        0;
                    }
                }
            }
            ++lllllllllllllllIlllIIlIIIlllIlII22;
            0;
            if (2 != 0) continue;
            return false;
        }
        if (U.llIlIlIIIlIllI(var16.cp.enableCrabs() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.CRABS) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(var16.cp.enableIceDemon() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(var16.cp.enableThieving() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (U.llIlIlIIIlIllI(var16.cp.enableTightrope() ? 1 : 0) && U.llIlIlIIIllIlI(aa.e().contains((Object)N.TIGHTROPE) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        ArrayList<N> lllllllllllllllIlllIIlIIIlllIlII22 = new ArrayList<N>();
        if (U.llIlIlIIIllIlI(var16.cp.enableVespula() ? 1 : 0) && U.llIlIlIIIllIlI(aa.g() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.VESPULA);
            0;
        }
        if (U.llIlIlIIIllIlI(var16.cp.enableVasa() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.VASA);
            0;
        }
        if (U.llIlIlIIIllIlI(var16.cp.enableTekton() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.TEKTON);
            0;
        }
        if (U.llIlIlIIIllIlI(var16.cp.enableMuttadiles() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.MUTTADILES);
            0;
        }
        if (U.llIlIlIIIllIlI(var16.cp.enableGuardians() ? 1 : 0)) {
            lllllllllllllllIlllIIlIIIlllIlII22.add(N.GUARDIANS);
            0;
        }
        if (U.llIlIlIIIllIlI(lllllllllllllllIlllIIlIIIlllIlII22.containsAll(var10) ? 1 : 0) && U.llIlIlIIIllIll(var10.size(), lIlIIIIIllII[2])) {
            return lIlIIIIIllII[0];
        }
        return lIlIIIIIllII[1];
    }

    private static boolean llIlIlIIIllIII(Object object, Object object2) {
        return object != object2;
    }
}

