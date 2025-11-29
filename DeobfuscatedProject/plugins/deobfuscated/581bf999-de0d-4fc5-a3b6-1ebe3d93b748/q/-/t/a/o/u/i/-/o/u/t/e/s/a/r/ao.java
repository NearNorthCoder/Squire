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
        TileItem llllllllllllllllIlIIIIIlllIIlIll = TileItems.getNearest(tileItem -> {
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
        if (ao.lIlIIIIIIIIlII(llllllllllllllllIlIIIIIlllIIlIll)) {
            llllllllllllllllIlIIIIIlllIIlIll.interact(llIIlIIIIlI[llIIlIIIIll[0]]);
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

    private static String lIIllllllllllI(String llllllllllllllllIlIIIIIllIIIlIll, String llllllllllllllllIlIIIIIllIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIllIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIIIllIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIIIllIIIllIl.init(llIIlIIIIll[6], llllllllllllllllIlIIIIIllIIIlllI);
            return new String(llllllllllllllllIlIIIIIllIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIIllIIIllII) {
            llllllllllllllllIlIIIIIllIIIllII.printStackTrace();
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
        void llllllllllllllllIlIIIIIllIIlllIl;
        if (ao.lIlIIIIIIIIIlI(chatMessage.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[1]]) ? 1 : 0)) {
            this.r();
        }
        if (ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIllIIlllIl.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[6]]) ? 1 : 0)) {
            ao llllllllllllllllIlIIIIIllIIllllI;
            llllllllllllllllIlIIIIIllIIllllI.r();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(NPC nPC, boolean bl2) {
        int llllllllllllllllIlIIIIIllIllIllI;
        int n2;
        int[] nArray = new int[llIIlIIIIll[1]];
        nArray[ao.llIIlIIIIll[0]] = llIIlIIIIll[2];
        if (!ao.lIlIIIIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0) || ao.lIlIIIIIIIIlIl(Combat.getMissingHealth(), llIIlIIIIll[3])) {
            n2 = llIIlIIIIll[1];
            0;
            if (1 != 1) {
                return ((0x54 ^ 0xE) & ~(0x4C ^ 0x16)) != 0;
            }
        } else {
            n2 = llIIlIIIIll[0];
        }
        if (ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIllIllIllI = n2)) {
            int n3;
            void llllllllllllllllIlIIIIIllIlllIII;
            ao llllllllllllllllIlIIIIIllIlllIIl;
            void llllllllllllllllIlIIIIIllIllIlll;
            if (ao.lIlIIIIIIIIIlI((int)llllllllllllllllIlIIIIIllIllIlll) && ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIllIlllIIl.f((NPC)llllllllllllllllIlIIIIIllIlllIII) ? 1 : 0)) {
                n3 = llIIlIIIIll[1];
                0;
                if (3 <= ((167 + 108 - 111 + 34 ^ 97 + 114 - 105 + 30) & (137 + 26 - 10 + 56 ^ 157 + 97 - 97 + 2 ^ -1))) {
                    return ((166 + 4 - 25 + 79 ^ 132 + 6 - 33 + 72) & (12 + 92 - -54 + 58 ^ 65 + 107 - 155 + 120 ^ -1)) != 0;
                }
            } else {
                n3 = llIIlIIIIll[0];
            }
            int llllllllllllllllIlIIIIIllIllIlIl = n3;
            return llllllllllllllllIlIIIIIllIlllIIl.e(llllllllllllllllIlIIIIIllIllIlIl != 0);
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
        ao llllllllllllllllIlIIIIIlllIIllll;
        if (!ao.lIlIIIIIIIIIlI(this.j(this.bi()) ? 1 : 0) || ao.lIlIIIIIIIIIll(this.aS() ? 1 : 0)) {
            llllllllllllllllIlIIIIIlllIIllll.r();
            return llIIlIIIIll[0];
        }
        if (ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIlllIIllll.bj() ? 1 : 0)) {
            return llllllllllllllllIlIIIIIlllIIllll.bn();
        }
        if (ao.lIlIIIIIIIIIll(llllllllllllllllIlIIIIIlllIIllll.bk() ? 1 : 0)) {
            return llllllllllllllllIlIIIIIlllIIllll.bm();
        }
        if (ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIlllIIllll.bo() ? 1 : 0)) {
            llllllllllllllllIlIIIIIlllIIllll.cV.c(llllllllllllllllIlIIIIIlllIIllll.cV.a(llllllllllllllllIlIIIIIlllIIllll.br()));
            0;
        }
        return this.bl();
    }

    public abstract boolean bj();

    private static String lIIlllllllllIl(String llllllllllllllllIlIIIIIlIlllllII, String llllllllllllllllIlIIIIIlIllllIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIlIllllIll.getBytes(StandardCharsets.UTF_8)), llIIlIIIIll[10]), "DES");
            Cipher llllllllllllllllIlIIIIIllIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIIllIIIIIII.init(llIIlIIIIll[6], llllllllllllllllIlIIIIIllIIIIIIl);
            return new String(llllllllllllllllIlIIIIIllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIIlIlllllll) {
            llllllllllllllllIlIIIIIlIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIlllllllllll(String llllllllllllllllIlIIIIIlIllIlllI, String llllllllllllllllIlIIIIIlIllIllIl) {
        llllllllllllllllIlIIIIIlIllIlllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIIlIllIllII = new StringBuilder();
        char[] llllllllllllllllIlIIIIIlIllIlIll = llllllllllllllllIlIIIIIlIllIllIl.toCharArray();
        int llllllllllllllllIlIIIIIlIllIlIlI = llIIlIIIIll[0];
        char[] llllllllllllllllIlIIIIIlIllIIlII = llllllllllllllllIlIIIIIlIllIlllI.toCharArray();
        int llllllllllllllllIlIIIIIlIllIIIll = llllllllllllllllIlIIIIIlIllIIlII.length;
        int llllllllllllllllIlIIIIIlIllIIIlI = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(llllllllllllllllIlIIIIIlIllIIIlI, llllllllllllllllIlIIIIIlIllIIIll)) {
            char llllllllllllllllIlIIIIIlIllIllll = llllllllllllllllIlIIIIIlIllIIlII[llllllllllllllllIlIIIIIlIllIIIlI];
            llllllllllllllllIlIIIIIlIllIllII.append((char)(llllllllllllllllIlIIIIIlIllIllll ^ llllllllllllllllIlIIIIIlIllIlIll[llllllllllllllllIlIIIIIlIllIlIlI % llllllllllllllllIlIIIIIlIllIlIll.length]));
            0;
            ++llllllllllllllllIlIIIIIlIllIlIlI;
            ++llllllllllllllllIlIIIIIlIllIIIlI;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIIIlIllIllII);
    }

    public void a(Interactable interactable, String string, int n2) {
        Executors.newSingleThreadExecutor().submit(() -> {
            int llllllllllllllllIlIIIIIllIIllIII;
            int llllllllllllllllIlIIIIIllIIlIlIl = llIIlIIIIll[0];
            while (ao.lIlIIIIIIIIlIl(llllllllllllllllIlIIIIIllIIlIlIl, llllllllllllllllIlIIIIIllIIllIII)) {
                void llllllllllllllllIlIIIIIllIIlIllI;
                void llllllllllllllllIlIIIIIllIIlIlll;
                llllllllllllllllIlIIIIIllIIlIlll.interact((String)llllllllllllllllIlIIIIIllIIlIllI);
                Time.sleep((long)25L);
                0;
                ++llllllllllllllllIlIIIIIllIIlIlIl;
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
        void llllllllllllllllIlIIIIIlllIIIIIl;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int llllllllllllllllIlIIIIIlllIIIIII = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(llllllllllllllllIlIIIIIlllIIIIII, (int)llllllllllllllllIlIIIIIlllIIIIIl)) {
            ao llllllllllllllllIlIIIIIlllIIIlII;
            void llllllllllllllllIlIIIIIlllIIIIlI;
            void llllllllllllllllIlIIIIIllIllllll = llllllllllllllllIlIIIIIlllIIIIlI[llllllllllllllllIlIIIIIlllIIIIII];
            if (ao.lIlIIIIIIIIllI(llllllllllllllllIlIIIIIlllIIIlII.aX(), (int)llllllllllllllllIlIIIIIllIllllll)) {
                return llIIlIIIIll[1];
            }
            ++llllllllllllllllIlIIIIIlllIIIIII;
            0;
            if (null == null) continue;
            return ((0x83 ^ 0xB0) & ~(0x8A ^ 0xB9)) != 0;
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
        ao llllllllllllllllIlIIIIIllIlIIllI;
        if (ao.lIlIIIIIIIlIIl(this.bs())) {
            return llIIlIIIIll[0];
        }
        int[] llllllllllllllllIlIIIIIllIlIIlII = llllllllllllllllIlIIIIIllIlIIllI.cV.a(llllllllllllllllIlIIIIIllIlIIllI.bs());
        int llllllllllllllllIlIIIIIllIlIIIll = llllllllllllllllIlIIIIIllIlIIlII.length;
        int llllllllllllllllIlIIIIIllIlIIIlI = llIIlIIIIll[0];
        while (ao.lIlIIIIIIIIlIl(llllllllllllllllIlIIIIIllIlIIIlI, llllllllllllllllIlIIIIIllIlIIIll)) {
            int llllllllllllllllIlIIIIIllIlIIIIl = llllllllllllllllIlIIIIIllIlIIlII[llllllllllllllllIlIIIIIllIlIIIlI];
            if (!ao.lIlIIIIIIIllII(llllllllllllllllIlIIIIIllIlIIIIl, llIIlIIIIll[4]) || ao.lIlIIIIIIIIllI(llllllllllllllllIlIIIIIllIlIIIIl, llIIlIIIIll[5])) {
                boolean bl2;
                void llllllllllllllllIlIIIIIllIlIIlIl;
                if (ao.lIlIIIIIIIIlIl(llllllllllllllllIlIIIIIllIlIIllI.e.b((NPC)llllllllllllllllIlIIIIIllIlIIlIl), llllllllllllllllIlIIIIIllIlIIllI.bt())) {
                    bl2 = llIIlIIIIll[1];
                    0;
                    if (((0xAA ^ 0x8C) & ~(0x24 ^ 2)) != 0) {
                        return ((0x51 ^ 0x6F) & ~(0xBD ^ 0x83)) != 0;
                    }
                } else {
                    bl2 = llIIlIIIIll[0];
                }
                return bl2;
            }
            ++llllllllllllllllIlIIIIIllIlIIIlI;
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
        void llllllllllllllllIlIIIIIllIlIllll;
        double llllllllllllllllIlIIIIIllIlIllIl;
        double d2;
        int[] llllllllllllllllIlIIIIIllIlIlllI;
        ao llllllllllllllllIlIIIIIllIllIIII;
        int[] nArray;
        if (ao.lIlIIIIIIIlIIl(this.bs())) {
            nArray = null;
            0;
            if (null != null) {
                return ((69 + 1 - -29 + 57 ^ 76 + 13 - -26 + 20) & (58 + 42 - 58 + 147 ^ 81 + 72 - 146 + 159 ^ -1)) != 0;
            }
        } else {
            nArray = llllllllllllllllIlIIIIIllIllIIII.cV.a(llllllllllllllllIlIIIIIllIllIIII.bs());
        }
        if (ao.lIlIIIIIIIlIIl(llllllllllllllllIlIIIIIllIlIlllI = nArray)) {
            d2 = 500.0;
            0;
            if (-1 >= ((0x52 ^ 0x33) & ~(0x36 ^ 0x57))) {
                return ((0x9C ^ 0xB9) & ~(0x27 ^ 2)) != 0;
            }
        } else {
            d2 = llllllllllllllllIlIIIIIllIlIllIl = (double)q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.d.b(llllllllllllllllIlIIIIIllIlIlllI);
        }
        if (ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIllIllIIII.aZ() ? 1 : 0)) {
            llllllllllllllllIlIIIIIllIlIllIl /= 2.0;
        }
        if (!ao.lIlIIIIIIIlIlI(ao.lIlIIIIIIIIlll(Combat.getSpecEnergy(), llllllllllllllllIlIIIIIllIlIllIl)) || !ao.lIlIIIIIIIIIlI((int)llllllllllllllllIlIIIIIllIlIllll) || !ao.lIlIIIIIIIIlII(llllllllllllllllIlIIIIIllIlIlllI) || ao.lIlIIIIIIIIIlI(llllllllllllllllIlIIIIIllIllIIII.bq() ? 1 : 0)) {
            llllllllllllllllIlIIIIIllIllIIII.cV.c(llllllllllllllllIlIIIIIllIllIIII.cV.a(llllllllllllllllIlIIIIIllIllIIII.br()));
            0;
            return llIIlIIIIll[0];
        }
        llllllllllllllllIlIIIIIllIllIIII.cV.c(llllllllllllllllIlIIIIIllIlIlllI);
        0;
        if (ao.lIlIIIIIIIIIll(Combat.isSpecEnabled() ? 1 : 0) && ao.lIlIIIIIIIlIlI(ao.lIlIIIIIIIlIII(Combat.getSpecEnergy(), llllllllllllllllIlIIIIIllIlIllIl)) && ao.lIlIIIIIIIlIll(llllllllllllllllIlIIIIIllIllIIII.cu.getTickCount() - llllllllllllllllIlIIIIIllIllIIII.cX, llIIlIIIIll[1])) {
            Combat.toggleSpec();
            llllllllllllllllIlIIIIIllIllIIII.cX = llllllllllllllllIlIIIIIllIllIIII.cu.getTickCount();
        }
        return llIIlIIIIll[1];
    }
}

