/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.rs.api.RSNPCComposition
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.u;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.rs.api.RSNPCComposition;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Swapping weapon", priority=4, register=true)
public class A
extends n {
    private final /* synthetic */ u bM;
    private /* synthetic */ HeadIcon bN;
    public static /* synthetic */ int bK;
    private final /* synthetic */ b bL;
    private /* synthetic */ int bO;
    private static /* synthetic */ String[] llIIllIlIIII;
    private static /* synthetic */ int[] llIIllIlIIIl;

    private static String llllllIlllIIll(String lllllllllllllllIlIIlIlIlIIIlIIII, String lllllllllllllllIlIIlIlIlIIIIlIlI) {
        lllllllllllllllIlIIlIlIlIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlIIIIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlIIIIllIl = lllllllllllllllIlIIlIlIlIIIIlIlI.toCharArray();
        int lllllllllllllllIlIIlIlIlIIIIllII = llIIllIlIIIl[1];
        char[] lllllllllllllllIlIIlIlIlIIIIIllI = lllllllllllllllIlIIlIlIlIIIlIIII.toCharArray();
        int lllllllllllllllIlIIlIlIlIIIIIlIl = lllllllllllllllIlIIlIlIlIIIIIllI.length;
        int lllllllllllllllIlIIlIlIlIIIIIlII = llIIllIlIIIl[1];
        while (A.llllllIlllllIl(lllllllllllllllIlIIlIlIlIIIIIlII, lllllllllllllllIlIIlIlIlIIIIIlIl)) {
            char lllllllllllllllIlIIlIlIlIIIlIIIl = lllllllllllllllIlIIlIlIlIIIIIllI[lllllllllllllllIlIIlIlIlIIIIIlII];
            lllllllllllllllIlIIlIlIlIIIIlllI.append((char)(lllllllllllllllIlIIlIlIlIIIlIIIl ^ lllllllllllllllIlIIlIlIlIIIIllIl[lllllllllllllllIlIIlIlIlIIIIllII % lllllllllllllllIlIIlIlIlIIIIllIl.length]));
            0;
            ++lllllllllllllllIlIIlIlIlIIIIllII;
            ++lllllllllllllllIlIIlIlIlIIIIIlII;
            0;
            if (3 != ((0x2E ^ 0x6F ^ (0x49 ^ 0x1F)) & (0x44 ^ 7 ^ (0x76 ^ 0x22) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlIIIIlllI);
    }

    private static boolean llllllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        A.llllllIlllIllI();
        A.llllllIlllIlIl();
        bK = llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIlI(int n2) {
        return n2 == 0;
    }

    private static String llllllIlllIIlI(String lllllllllllllllIlIIlIlIlIIlIIIII, String lllllllllllllllIlIIlIlIlIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIIlIIIlI.init(llIIllIlIIIl[2], lllllllllllllllIlIIlIlIlIIlIIIll);
            return new String(lllllllllllllllIlIIlIlIlIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlIIlIIIIl) {
            lllllllllllllllIlIIlIlIlIIlIIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (A.llllllIlllIlll(actor instanceof NPC) && A.llllllIllllIIl(actor.getName()) && A.llllllIlllIlll(e.aw.contains(actor.getName()) ? 1 : 0) && A.llllllIlllIlll(e.aD.contains(projectileSpawned.getProjectile().getId()) ? 1 : 0)) {
            this.bO = this.bL.z();
            bK += llIIllIlIIIl[0];
        }
    }

    @Override
    public boolean be() {
        if (A.llllllIlllIlll(this.ba.h().makeT3Offhand() ? 1 : 0)) {
            return this.bz();
        }
        return this.bA();
    }

    private static boolean llllllIllllIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC nPC = npcChanged.getNpc();
        if (A.llllllIllllIIl(nPC) && A.llllllIllllIIl(nPC.getName()) && A.llllllIlllIlll(e.aw.contains(nPC.getName()) ? 1 : 0)) {
            void lllllllllllllllIlIIlIlIlIlIIlIll;
            RSNPCComposition rSNPCComposition = (RSNPCComposition)npcChanged.getNpc().getComposition();
            short[] sArray = rSNPCComposition.getRsOverheadIcons();
            if (A.llllllIlllllII(sArray)) {
                return;
            }
            lllllllllllllllIlIIlIlIlIlIIllll.bN = HeadIcon.values()[lllllllllllllllIlIIlIlIlIlIIlIll[llIIllIlIIIl[1]]];
            bK = llIIllIlIIIl[1];
        }
    }

    private static String llllllIlllIlII(String lllllllllllllllIlIIlIlIlIIlIllIl, String lllllllllllllllIlIIlIlIlIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIllIlIIIl[8]), "DES");
            Cipher lllllllllllllllIlIIlIlIlIIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlIlIIlIllll.init(llIIllIlIIIl[2], lllllllllllllllIlIIlIlIlIIllIIII);
            return new String(lllllllllllllllIlIIlIlIlIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlIIlIlllI) {
            lllllllllllllllIlIIlIlIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllIlll(int n2) {
        return n2 != 0;
    }

    private boolean bz() {
        HeadIcon headIcon = this.ba.X().aD();
        if (A.llllllIllllIII(headIcon, HeadIcon.MAGIC)) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[10]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];
                    0;
                    if (3 < 2) {
                        return ((0x62 ^ 0x2D ^ (0xBB ^ 0xB6)) & (4 + 45 - 26 + 108 ^ 27 + 132 - 121 + 155 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(item2)) {
                item2.interact(llIIllIlIIII[llIIllIlIIIl[1]]);
                return llIIllIlIIIl[0];
            }
            0;
            if ((0xC2 ^ 0xA6 ^ (0x4C ^ 0x2C)) == ((135 + 112 - 124 + 88 ^ 133 + 123 - 197 + 140) & (42 + 190 - 201 + 183 ^ 111 + 55 - 147 + 175 ^ -1))) {
                return ((0xAB ^ 0xC5 ^ (0xDC ^ 0x93)) & (0xF2 ^ 0xA3 ^ (0x75 ^ 5) ^ -1)) != 0;
            }
        } else {
            Item lllllllllllllllIlIIlIlIlIllIIIll = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[9]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];
                    0;
                    if (-2 >= 0) {
                        return ((172 + 34 - 167 + 135 ^ 17 + 10 - -29 + 95) & (0x12 ^ 0x72 ^ (0x62 ^ 0x3B) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(lllllllllllllllIlIIlIlIlIllIIIll)) {
                lllllllllllllllIlIIlIlIlIllIIIll.interact(llIIllIlIIII[llIIllIlIIIl[0]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIllllIIl(Object object) {
        return object != null;
    }

    private static boolean llllllIlllllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bA() {
        void lllllllllllllllIlIIlIlIlIlIllIlI;
        HeadIcon headIcon = this.ba.X().aD();
        if (A.llllllIllllIlI(bK)) {
            Item item2 = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[8]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];
                    0;
                    if (3 > 3) {
                        return (3 & ~3) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(item2)) {
                item2.interact(llIIllIlIIII[llIIllIlIIIl[2]]);
                return llIIllIlIIIl[0];
            }
            0;
            if (null != null) {
                return ((1 ^ (0x2F ^ 0x21)) & (0xF7 ^ 0xC7 ^ (0xA6 ^ 0x99) ^ -1)) != 0;
            }
        } else if (A.llllllIllllIll(bK, llIIllIlIIIl[3]) && A.llllllIllllIlI(HeadIcon.RANGED.equals((Object)lllllllllllllllIlIIlIlIlIlIllIlI) ? 1 : 0)) {
            Item lllllllllllllllIlIIlIlIlIlIllIIl = Inventory.getFirst(item -> {
                int n2;
                String string = item.getName();
                if (A.llllllIllllIIl(string) && A.llllllIlllIlll(string.contains(llIIllIlIIII[llIIllIlIIIl[7]]) ? 1 : 0)) {
                    n2 = llIIllIlIIIl[0];
                    0;
                    if (((0x7A ^ 0x6B ^ (0xB0 ^ 0xC2)) & (0xA0 ^ 0x90 ^ (0x1C ^ 0x4F) ^ -1)) != 0) {
                        return ((0x36 ^ 0x56 ^ (0xFF ^ 0xB5)) & (0x34 ^ 0x15 ^ (0x93 ^ 0x98) ^ -1) & ((0xD2 ^ 0x83 ^ (0x66 ^ 8)) & (1 ^ (0x93 ^ 0xAD) ^ -1) & ((0x79 ^ 0x7F ^ (0xE4 ^ 0xA8)) & (119 + 179 - 147 + 41 ^ 11 + 44 - -13 + 70 ^ -1) ^ -1) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIlIIIl[1];
                }
                return n2 != 0;
            });
            if (A.llllllIllllIIl(lllllllllllllllIlIIlIlIlIlIllIIl)) {
                lllllllllllllllIlIIlIlIlIlIllIIl.interact(llIIllIlIIII[llIIllIlIIIl[4]]);
                return llIIllIlIIIl[0];
            }
            0;
            if (3 < 0) {
                return ((0x3F ^ 0x2E ^ (0x14 ^ 0x1D)) & (53 + 198 - 132 + 104 ^ 1 + 22 - -91 + 85 ^ -1)) != 0;
            }
        } else if (A.llllllIllllIll(bK, llIIllIlIIIl[3])) {
            Item lllllllllllllllIlIIlIlIlIlIllIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            Player lllllllllllllllIlIIlIlIlIlIllIII = Players.getLocal();
            WorldPoint lllllllllllllllIlIIlIlIlIlIlIlll = lllllllllllllllIlIIlIlIlIlIllIII.getWorldLocation();
            if (A.llllllIllllIIl(lllllllllllllllIlIIlIlIlIlIllIIl)) {
                A lllllllllllllllIlIIlIlIlIlIllIll;
                Item lllllllllllllllIlIIlIlIlIlIlIllI;
                if (A.llllllIllllIlI(Inventory.getFreeSlots()) && A.llllllIllllIIl(lllllllllllllllIlIIlIlIlIlIlIllI = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llIIllIlIIIl[0]];
                    stringArray[A.llIIllIlIIIl[1]] = llIIllIlIIII[llIIllIlIIIl[6]];
                    return item.hasAction(stringArray);
                }))) {
                    lllllllllllllllIlIIlIlIlIlIlIllI.interact(llIIllIlIIII[llIIllIlIIIl[5]]);
                }
                lllllllllllllllIlIIlIlIlIlIlIllI = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIlIlIlIlIlIlll);
                List<WorldPoint> lllllllllllllllIlIIlIlIlIlIlIlIl = lllllllllllllllIlIIlIlIlIlIllIll.bM.c(lllllllllllllllIlIIlIlIlIlIlIlll, lllllllllllllllIlIIlIlIlIlIllIll.ba.X().aI().getWorldLocation());
                u u2 = lllllllllllllllIlIIlIlIlIlIllIll.bM;
                Stream stream = lllllllllllllllIlIIlIlIlIlIlIlIl.stream();
                u u3 = lllllllllllllllIlIIlIlIlIlIllIll.bM;
                Objects.requireNonNull(u3);
                0;
                if (A.llllllIllllIlI(u2.d(stream.filter(u3::n).collect(Collectors.toList())) ? 1 : 0)) {
                    Movement.setDestination((int)lllllllllllllllIlIIlIlIlIlIlIllI.getX(), (int)lllllllllllllllIlIIlIlIlIlIlIllI.getY());
                    Time.sleepTick();
                    0;
                }
                lllllllllllllllIlIIlIlIlIlIllIIl.interact(llIIllIlIIII[llIIllIlIIIl[3]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static void llllllIlllIlIl() {
        llIIllIlIIII = new String[llIIllIlIIIl[11]];
        A.llIIllIlIIII[A.llIIllIlIIIl[1]] = A."Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[0]] = A."Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[2]] = A."Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[4]] = A."Wield";
        A.llIIllIlIIII[A.llIIllIlIIIl[5]] = A."Eat";
        A.llIIllIlIIII[A.llIIllIlIIIl[3]] = A."Remove";
        A.llIIllIlIIII[A.llIIllIlIIIl[6]] = A."Eat";
        A.llIIllIlIIII[A.llIIllIlIIIl[7]] = A."bow";
        A.llIIllIlIIII[A.llIIllIlIIIl[8]] = A."staff";
        A.llIIllIlIIII[A.llIIllIlIIIl[9]] = A."staff";
        A.llIIllIlIIII[A.llIIllIlIIIl[10]] = A."bow";
    }

    @Inject
    public A(c c2, b b2, u u2) {
        d[] dArray = new d[llIIllIlIIIl[0]];
        dArray[A.llIIllIlIIIl[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bN = null;
        this.bL = b2;
        this.bM = u2;
    }

    private static void llllllIlllIllI() {
        llIIllIlIIIl = new int[12];
        A.llIIllIlIIIl[0] = 1;
        A.llIIllIlIIIl[1] = (0x59 ^ 0x60 ^ (0x9F ^ 0xAA)) & (73 + 65 - 121 + 150 ^ 170 + 75 - 238 + 164 ^ -1);
        A.llIIllIlIIIl[2] = 2;
        A.llIIllIlIIIl[3] = 9 + 36 - -78 + 64 ^ 40 + 15 - -100 + 35;
        A.llIIllIlIIIl[4] = 3;
        A.llIIllIlIIIl[5] = 0x74 ^ 0x70;
        A.llIIllIlIIIl[6] = 0xC3 ^ 0xBF ^ (0x46 ^ 0x3C);
        A.llIIllIlIIIl[7] = 0x99 ^ 0x9E;
        A.llIIllIlIIIl[8] = 0x49 ^ 0x10 ^ (0x34 ^ 0x65);
        A.llIIllIlIIIl[9] = 0x82 ^ 0x8B;
        A.llIIllIlIIIl[10] = 0xC9 ^ 0xC5 ^ (0x9A ^ 0x9C);
        A.llIIllIlIIIl[11] = 69 + 112 - 91 + 95 ^ 134 + 8 - 8 + 44;
    }
}

