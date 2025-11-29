/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.d;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.y;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class ao
extends Z {
    @Inject
    protected /* synthetic */ y e;
    protected final /* synthetic */ TOAConfig cW;
    private /* synthetic */ int cX;
    protected final /* synthetic */ z cV;
    private static /* synthetic */ String[] llIIlIIIIlI;
    protected static final /* synthetic */ int cU;
    private static /* synthetic */ int[] llIIlIIIIll;

    private static int lIlIIIIIIIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public boolean bn() {
        if (ao.lIlIIIIIIIIIlI(this.cV.c(this.cV.a(this.cW.kephriGearSwap())) ? 1 : 0)) {
            return llIIlIIIIll[1];
        }
        if (ao.lIlIIIIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
            return llIIlIIIIll[0];
        }
        TileItem var32 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ao.lIlIIIIIIIIIlI(tileItem.isTradable() ? 1 : 0) && ao.lIlIIIIIIIIIlI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ao.lIlIIIIIIIIIll(tileItem.getName().equals(llIIlIIIIlI[llIIlIIIIll[7]]) ? 1 : 0)) {
                n2 = llIIlIIIIll[1];
                0;
                if (2 <= 0) {
                    return ((0x5F ^ 0x13 ^ (0x52 ^ 0x4A)) & (0x67 ^ 0x61 ^ (0x64 ^ 0x36) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIIIll[0];
            }
            return n2 != 0;
        });
        if (ao.lIlIIIIIIIIlII(var32)) {
            var32.interact(llIIlIIIIlI[llIIlIIIIll[0]]);
            return llIIlIIIIll[1];
        }
        return llIIlIIIIll[0];
    }

    public WorldPoint d(RegionPoint regionPoint) {
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)this.cu, (WorldPoint)worldPoint2);
        return collection.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(new WorldPoint(this.cu.getBaseX(), this.cu.getBaseY(), this.cu.getPlane())))).orElse(worldPoint2);
    }

    public abstract ConfigStorageBox<EquipmentSetup> br();

    @Inject
    protected ao(Client client, z z2, TOAConfig tOAConfig) {
        super(client);
        this.cV = z2;
        this.cW = tOAConfig;
    }

    public boolean bq() {
        return llIIlIIIIll[0];
    }

    private static boolean lIlIIIIIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIIIIIlII(Object object) {
        return object != null;
    }

    private static String lIIllllllllllI(String var3, String var31) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var31.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIlIIIIll[6], var16);
            return new String(var4.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public boolean bm() {
        return llIIlIIIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var17;
        if (ao.lIlIIIIIIIIIlI(chatMessage.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[1]]) ? 1 : 0)) {
            this.r();
        }
        if (ao.lIlIIIIIIIIIlI(var17.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[6]]) ? 1 : 0)) {
            ao var47;
            var47.r();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(NPC nPC, boolean bl2) {
        int var14;
        int n2;
        int[] nArray = new int[llIIlIIIIll[1]];
        nArray[ao.llIIlIIIIll[0]] = llIIlIIIIll[2];
        if (!ao.lIlIIIIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0) || ao.lIlIIIIIIIIlIl(Combat.getMissingHealth(), llIIlIIIIll[3])) {
            n2 = llIIlIIIIll[1];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            n2 = llIIlIIIIll[0];
        }
        if (ao.lIlIIIIIIIIIlI(var14 = n2)) {
            int n3;
            void var37;
            ao var5;
            void var40;
            if (ao.lIlIIIIIIIIIlI((int)var40) && ao.lIlIIIIIIIIIlI(var5.f((NPC)var37) ? 1 : 0)) {
                n3 = llIIlIIIIll[1];
                0;
                if (3 <= ((167 + 108 - 111 + 34 ^ 97 + 114 - 105 + 30) & (137 + 26 - 10 + 56 ^ 157 + 97 - 97 + 2 ^ -1))) {
                    return false;
                }
            } else {
                n3 = llIIlIIIIll[0];
            }
            int var42 = n3;
            return var5.e(var42 != 0);
        }
        this.e(llIIlIIIIll[0]);
        0;
        return llIIlIIIIll[0];
    }

    private static void lIlIIIIIIIIIII() {
        llIIlIIIIlI = new String[llIIlIIIIll[9]];
        ao.llIIlIIIIlI[ao.llIIlIIIIll[0]] = ao."Take";
        ao.llIIlIIIIlI[ao.llIIlIIIIll[1]] = ao."You failed to survive";
        ao.llIIlIIIIlI[ao.llIIlIIIIll[6]] = ao."You have died";
        ao.llIIlIIIIlI[ao.llIIlIIIIll[7]] = ao."Vial";
    }

    public WorldPoint a(Point point) {
        RegionPoint regionPoint = new RegionPoint(point.getX(), point.getY(), this.cu.getPlane(), this.bi());
        return this.c(regionPoint);
    }

    static {
        ao.lIlIIIIIIIIIIl();
        ao.lIlIIIIIIIIIII();
        cU = llIIlIIIIll[8];
    }

    private static boolean lIlIIIIIIIlIlI(int n2) {
        return n2 >= 0;
    }

    public abstract boolean bl();

    private static void lIlIIIIIIIIIIl() {
        llIIlIIIIll = new int[11];
        ao.llIIlIIIIll[0] = (0xD6 ^ 0x84 ^ (0xAD ^ 0xA6)) & (181 + 113 - 278 + 205 ^ 87 + 80 - 42 + 7 ^ -1);
        ao.llIIlIIIIll[1] = 1;
        ao.llIIlIIIIll[2] = -(0xFFFF946B & 0x7FF5) & (0xFFFFFFFF & 0x7EFB);
        ao.llIIlIIIIll[3] = 0xB ^ 0x23;
        ao.llIIlIIIIll[4] = -(0x1F ^ 0x5E) & (0xFFFFBFDD & 0x6E7E);
        ao.llIIlIIIIll[5] = -(0xF5 ^ 0xBF) & (0xFFFFFFDF & 0x4FFB);
        ao.llIIlIIIIll[6] = 2;
        ao.llIIlIIIIll[7] = 3;
        ao.llIIlIIIIll[8] = 0xFFFFFD7B & 0x77AE;
        ao.llIIlIIIIll[9] = 0x94 ^ 0x90;
        ao.llIIlIIIIll[10] = 9 ^ 1;
    }

    private static boolean lIlIIIIIIIIIlI(int n2) {
        return n2 != 0;
    }

    public void bp() {
        this.e(llIIlIIIIll[1]);
        0;
    }

    public boolean run() {
        ao var36;
        if (!ao.lIlIIIIIIIIIlI(this.j(this.bi()) ? 1 : 0) || ao.lIlIIIIIIIIIll(this.aS() ? 1 : 0)) {
            var36.r();
            return llIIlIIIIll[0];
        }
        if (ao.lIlIIIIIIIIIlI(var36.bj() ? 1 : 0)) {
            return var36.bn();
        }
        if (ao.lIlIIIIIIIIIll(var36.bk() ? 1 : 0)) {
            return var36.bm();
        }
        if (ao.lIlIIIIIIIIIlI(var36.bo() ? 1 : 0)) {
            var36.cV.c(var36.cV.a(var36.br()));
            0;
        }
        return this.bl();
    }

    public abstract boolean bj();

    private static String lIIlllllllllIl(String var22, String var39) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var39.getBytes(StandardCharsets.UTF_8)), llIIlIIIIll[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIlIIIIll[6], var13);
            return new String(var11.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIlllllllllll(String var44, String var35) {
        var44 = new String(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var20 = var35.toCharArray();
        int var23 = llIIlIIIIll[0];
        char[] var15 = var44.toCharArray();
        int var1 = var15.length;
        int var6 = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(var6, var1)) {
            char var7 = var15[var6];
            var30.append((char)(var7 ^ var20[var23 % var20.length]));
            0;
            ++var23;
            ++var6;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    public void a(Interactable interactable, String string, int n2) {
        Executors.newSingleThreadExecutor().submit(() -> {
            int var8;
            int var29 = llIIlIIIIll[0];
            while (ao.lIlIIIIIIIIlIl(var29, var8)) {
                void var45;
                void var19;
                var19.interact((String)var45);
                Time.sleep((long)25L);
                0;
                ++var29;
                0;
                if (2 != 0) continue;
                return;
            }
        });
        0;
    }

    public int bt() {
        return llIIlIIIIll[1];
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(int ... nArray) {
        void var9;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var33 = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(var33, (int)var9)) {
            ao var18;
            void var12;
            void var26 = var12[var33];
            if (ao.lIlIIIIIIIIllI(var18.aX(), (int)var26)) {
                return llIIlIIIIll[1];
            }
            ++var33;
            0;
            
            return false;
        }
        return llIIlIIIIll[0];
    }

    private static int lIlIIIIIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIlIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(NPC nPC) {
        ao var2;
        if (ao.lIlIIIIIIIlIIl(this.bs())) {
            return llIIlIIIIll[0];
        }
        int[] var25 = var2.cV.a(var2.bs());
        int var43 = var25.length;
        int var34 = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(var34, var43)) {
            int var41 = var25[var34];
            if (!ao.lIlIIIIIIIllII(var41, llIIlIIIIll[4]) || ao.lIlIIIIIIIIllI(var41, llIIlIIIIll[5])) {
                boolean bl2;
                void var46;
                if (ao.lIlIIIIIIIIlIl(var2.e.b((NPC)var46), var2.bt())) {
                    bl2 = llIIlIIIIll[1];
                    0;
                    if (((0xAA ^ 0x8C) & ~(0x24 ^ 2)) != 0) {
                        return false;
                    }
                } else {
                    bl2 = llIIlIIIIll[0];
                }
                return bl2;
            }
            ++var34;
            0;
            if (3 >= (3 & (3 ^ -1))) continue;
            return ((0x13 ^ 0x7A ^ (0xA8 ^ 0xA0)) & (0x79 ^ 0x3C ^ (0x41 ^ 0x65) ^ -1)) != 0;
        }
        return llIIlIIIIll[1];
    }

    public boolean bo() {
        return llIIlIIIIll[0];
    }

    protected boolean aS() {
        return llIIlIIIIll[1];
    }

    private static boolean lIlIIIIIIIIIll(int n2) {
        return n2 == 0;
    }

    public abstract boolean bk();

    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    public void r() {
    }

    public abstract int bi();

    private static boolean lIlIIIIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(boolean bl2) {
        void var10;
        double var21;
        double d2;
        int[] var38;
        ao var28;
        int[] nArray;
        if (ao.lIlIIIIIIIlIIl(this.bs())) {
            nArray = null;
            0;
            
            }
        } else {
            nArray = var28.cV.a(var28.bs());
        }
        if (ao.lIlIIIIIIIlIIl(var38 = nArray)) {
            d2 = 500.0;
            0;
            if (-1 >= ((0x52 ^ 0x33) & ~(0x36 ^ 0x57))) {
                return false;
            }
        } else {
            d2 = var21 = (double)q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.d.b(var38);
        }
        if (ao.lIlIIIIIIIIIlI(var28.aZ() ? 1 : 0)) {
            var21 /= 2.0;
        }
        if (!ao.lIlIIIIIIIlIlI(ao.lIlIIIIIIIIlll(Combat.getSpecEnergy(), var21)) || !ao.lIlIIIIIIIIIlI((int)var10) || !ao.lIlIIIIIIIIlII(var38) || ao.lIlIIIIIIIIIlI(var28.bq() ? 1 : 0)) {
            var28.cV.c(var28.cV.a(var28.br()));
            0;
            return llIIlIIIIll[0];
        }
        var28.cV.c(var38);
        0;
        if (ao.lIlIIIIIIIIIll(Combat.isSpecEnabled() ? 1 : 0) && ao.lIlIIIIIIIlIlI(ao.lIlIIIIIIIlIII(Combat.getSpecEnergy(), var21)) && ao.lIlIIIIIIIlIll(var28.cu.getTickCount() - var28.cX, llIIlIIIIll[1])) {
            Combat.toggleSpec();
            var28.cX = var28.cu.getTickCount();
        }
        return llIIlIIIIll[1];
    }
}

