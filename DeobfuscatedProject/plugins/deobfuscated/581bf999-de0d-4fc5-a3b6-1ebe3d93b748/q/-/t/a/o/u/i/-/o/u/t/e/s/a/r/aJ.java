/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.BoostingPotion
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Doing boulder dash", priority=100, blocking=true, register=true)
public class aJ
extends aI {
    private /* synthetic */ int dZ;
    private static /* synthetic */ String[] llIIllIIIlI;
    private static final /* synthetic */ int dT;
    private /* synthetic */ NPC dW;
    private final /* synthetic */ Set<NPC> dU;
    private /* synthetic */ int dY;
    private static final /* synthetic */ Point[] dQ;
    private final /* synthetic */ Set<NPC> dV;
    private static final /* synthetic */ int dR;
    private /* synthetic */ int ea;
    private static final /* synthetic */ int[] dS;
    private /* synthetic */ boolean dX;
    private static /* synthetic */ int[] llIIllIlIIl;

    private static boolean lIlIIIlIlllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public void r() {
        this.dW = null;
        this.dV.clear();
        this.dU.clear();
        this.dX = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
    }

    private static boolean lIlIIIlIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlIllIIII(int n2) {
        return n2 > 0;
    }

    private static /* synthetic */ boolean a(NPC nPC, int n2, NPC nPC2) {
        int n3;
        if (aJ.lIlIIIlIllIIll(nPC2.getId(), nPC.getId()) && aJ.lIlIIIlIllIlII(nPC2.getWorldLocation().getX(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIllIIlI(nPC2.getWorldArea().getX() + nPC2.getWorldArea().getWidth(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIlIllIl(nPC2.getWorldArea().getX(), n2)) {
            n3 = llIIllIlIIl[1];
            0;
            if (2 <= 1) {
                return ((0x28 ^ 0x6F) & ~(0x1F ^ 0x58)) != 0;
            }
        } else {
            n3 = llIIllIlIIl[0];
        }
        return n3 != 0;
    }

    private static boolean lIlIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void b(StatChanged statChanged) {
        if (aJ.lIlIIIlIllIIIl(this.dW)) {
            this.dU.add(this.dW);
            0;
        }
    }

    static {
        aJ.lIlIIIlIlIlIll();
        aJ.lIlIIIlIIIlIIl();
        dR = llIIllIlIIl[14];
        dT = llIIllIlIIl[13];
        Point[] pointArray = new Point[llIIllIlIIl[15]];
        pointArray[aJ.llIIllIlIIl[0]] = new Point(llIIllIlIIl[16], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[1]] = new Point(llIIllIlIIl[18], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[3]] = new Point(llIIllIlIIl[17], llIIllIlIIl[19]);
        pointArray[aJ.llIIllIlIIl[4]] = new Point(llIIllIlIIl[17], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[2]] = new Point(llIIllIlIIl[17], llIIllIlIIl[18]);
        pointArray[aJ.llIIllIlIIl[10]] = new Point(llIIllIlIIl[20], llIIllIlIIl[7]);
        pointArray[aJ.llIIllIlIIl[11]] = new Point(llIIllIlIIl[20], llIIllIlIIl[8]);
        dQ = pointArray;
        int[] nArray = new int[llIIllIlIIl[3]];
        nArray[aJ.llIIllIlIIl[0]] = llIIllIlIIl[21];
        nArray[aJ.llIIllIlIIl[1]] = llIIllIlIIl[14];
        dS = nArray;
    }

    private static String lIlIIIlIIIIllI(String llllllllllllllllIIlllIlllIlIlIIl, String llllllllllllllllIIlllIlllIlIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), llIIllIlIIl[12]), "DES");
            Cipher llllllllllllllllIIlllIlllIlIlIll = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlllIlIlIll.init(llIIllIlIIl[3], llllllllllllllllIIlllIlllIlIllII);
            return new String(llllllllllllllllIIlllIlllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlllIlIlIlI) {
            llllllllllllllllIIlllIlllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private void bE() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIllIIIlI[llIIllIlIIl[3]]));
        if (aJ.lIlIIIlIlIllll(item2)) {
            return;
        }
        int llllllllllllllllIIlllIllllllIlII = BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED);
        if (aJ.lIlIIIlIllIlll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + llllllllllllllllIIlllIllllllIlII - llIIllIlIIl[4])) {
            return;
        }
        item2.interact(llIIllIIIlI[llIIllIlIIl[1]]);
    }

    private static boolean lIlIIIlIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIIIlIlIlIll() {
        llIIllIlIIl = new int[22];
        aJ.llIIllIlIIl[0] = (0xD8 ^ 0xA1 ^ (8 ^ 0x7D)) & (0x40 ^ 0x33 ^ 69 + 11 - -11 + 36 ^ -1);
        aJ.llIIllIlIIl[1] = 1;
        aJ.llIIllIlIIl[2] = 0x55 ^ 0x51;
        aJ.llIIllIlIIl[3] = 2;
        aJ.llIIllIlIIl[4] = 3;
        aJ.llIIllIlIIl[5] = 0xFFFFBF56 & 0x6EAD;
        aJ.llIIllIlIIl[6] = 0x2D ^ 0x3B;
        aJ.llIIllIlIIl[7] = 0x62 ^ 0x55 ^ (0x4E ^ 0x64);
        aJ.llIIllIlIIl[8] = 0x3E ^ 0x1D;
        aJ.llIIllIlIIl[9] = 235 + 140 - 147 + 17;
        aJ.llIIllIlIIl[10] = 136 + 73 - 186 + 119 ^ 39 + 12 - -82 + 6;
        aJ.llIIllIlIIl[11] = 0xCB ^ 0x9E ^ (0xFD ^ 0xAE);
        aJ.llIIllIlIIl[12] = 0x17 ^ 0x1F;
        aJ.llIIllIlIIl[13] = 0xFFFFF69D & 0x2F77;
        aJ.llIIllIlIIl[14] = -(0xFFFFEDBF & 0x53C9) & (0xFFFFFFDF & 0x6FAF);
        aJ.llIIllIlIIl[15] = 0x70 ^ 0x77;
        aJ.llIIllIlIIl[16] = 0x3E ^ 0x22;
        aJ.llIIllIlIIl[17] = 0xC4 ^ 0x8B ^ (3 ^ 0x6C);
        aJ.llIIllIlIIl[18] = 137 + 54 - 43 + 2 ^ 101 + 40 - 108 + 103;
        aJ.llIIllIlIIl[19] = 0x2B ^ 0xF ^ (0x7D ^ 0x7B);
        aJ.llIIllIlIIl[20] = 0xB1 ^ 0x99;
        aJ.llIIllIlIIl[21] = 0xFFFFBE06 & 0x6FFF;
    }

    @Override
    public boolean bq() {
        return llIIllIlIIl[1];
    }

    private static boolean lIlIIIlIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIllIIIl(Object object) {
        return object != null;
    }

    private static int lIlIIIlIlIlllI(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    private static String lIlIIIlIIIlIII(String llllllllllllllllIIlllIllllIIlllI, String llllllllllllllllIIlllIllllIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIllllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIllllIlIIII.init(llIIllIlIIl[3], llllllllllllllllIIlllIllllIlIIIl);
            return new String(llllllllllllllllIIlllIllllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIllllIIllll) {
            llllllllllllllllIIlllIllllIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var8_12;
        void llllllllllllllllIIllllIIIIIIIlII;
        aJ llllllllllllllllIIllllIIIIIIIlIl;
        NPC nPC2 = this.bB();
        if (aJ.lIlIIIlIlIllll(nPC2)) {
            this.r();
            return llIIllIlIIl[0];
        }
        llllllllllllllllIIllllIIIIIIIlIl.bE();
        if (aJ.lIlIIIlIllIIII(llllllllllllllllIIllllIIIIIIIlIl.ea)) {
            llllllllllllllllIIllllIIIIIIIlIl.ea -= llIIllIlIIl[1];
            if (!aJ.lIlIIIlIllIIIl(llllllllllllllllIIllllIIIIIIIlIl.dW) || aJ.lIlIIIlIllIIlI(llllllllllllllllIIllllIIIIIIIlIl.dW.distanceTo((Locatable)Players.getLocal()), llIIllIlIIl[2])) {
                return llIIllIlIIl[1];
            }
        }
        if (aJ.lIlIIIlIllIIll(llllllllllllllllIIllllIIIIIIIlIl.dZ, llIIllIlIIl[3]) && !aJ.lIlIIIlIllIlII(llllllllllllllllIIllllIIIIIIIlIl.bA(), llIIllIlIIl[4]) || aJ.lIlIIIlIllIIll(llllllllllllllllIIllllIIIIIIIlIl.dZ, llIIllIlIIl[1]) && aJ.lIlIIIlIllIIll(llllllllllllllllIIllllIIIIIIIlIl.bA(), llIIllIlIIl[3])) {
            llllllllllllllllIIllllIIIIIIIlIl.dX = llIIllIlIIl[1];
        }
        WorldPoint llllllllllllllllIIllllIIIIIIIIll = Players.getLocal().getWorldLocation();
        llllllllllllllllIIllllIIIIIIIlIl.dZ = llllllllllllllllIIllllIIIIIIIlIl.bA();
        if (aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIlIl.dX ? 1 : 0) && aJ.lIlIIIlIllIlII(llllllllllllllllIIllllIIIIIIIlII.getId(), llIIllIlIIl[5])) {
            if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint llllllllllllllllIIllllIIIIIIIIlI = llllllllllllllllIIllllIIIIIIIlIl.a(new Point(llIIllIlIIl[6], llIIllIlIIl[7]));
            WorldPoint llllllllllllllllIIllllIIIIIIIIIl = llllllllllllllllIIllllIIIIIIIlIl.a(new Point(llIIllIlIIl[6], llIIllIlIIl[8]));
            WorldPoint llllllllllllllllIIllllIIIIIIIIII = Players.getLocal().getWorldLocation();
            if (aJ.lIlIIIlIllIIII(aJ.lIlIIIlIlIlllI(llllllllllllllllIIllllIIIIIIIIlI.distanceTo2DHypotenuse(llllllllllllllllIIllllIIIIIIIIII), llllllllllllllllIIllllIIIIIIIIIl.distanceTo2DHypotenuse(llllllllllllllllIIllllIIIIIIIIII)))) {
                llllllllllllllllIIllllIIIIIIIIlI = llllllllllllllllIIllllIIIIIIIIIl;
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIllllIIIIIIIIlI);
            return llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIIll(Players.getLocal().getGraphic(), llIIllIlIIl[9])) {
            llllllllllllllllIIllllIIIIIIIlIl.dX = llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIlIl(llllllllllllllllIIllllIIIIIIIlIl.dX ? 1 : 0)) {
            return llIIllIlIIl[0];
        }
        if (aJ.lIlIIIlIllIllI(llllllllllllllllIIllllIIIIIIIlII.getWorldArea().getX(), llllllllllllllllIIllllIIIIIIIIll.getWorldX()) && aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIlIl.cW.redX() ? 1 : 0)) {
            if (aJ.lIlIIIlIlIllIl(llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[10]]).getWorldX(), llllllllllllllllIIllllIIIIIIIIll.getWorldX())) {
                Movement.setDestination((WorldPoint)llllllllllllllllIIllllIIIIIIIIll.dx(llIIllIlIIl[1]));
                return llIIllIlIIl[1];
            }
            llllllllllllllllIIllllIIIIIIIlIl.dX = llIIllIlIIl[0];
            return llIIllIlIIl[0];
        }
        llllllllllllllllIIllllIIIIIIIlIl.bp();
        if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        List<NPC> llllllllllllllllIIllllIIIIIIIIlI = llllllllllllllllIIllllIIIIIIIlIl.bD();
        WorldPoint llllllllllllllllIIllllIIIIIIIIIl = llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIllIlll(llllllllllllllllIIllllIIIIIIIIIl.getWorldX(), llllllllllllllllIIllllIIIIIIIIll.getWorldX())) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIllllIIIIIIIIIl);
            return llIIllIlIIl[1];
        }
        List<WorldPoint> llllllllllllllllIIllllIIIIIIIIII = List.of(llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[4]]), llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[3]]), llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[2]]));
        List<WorldPoint> llllllllllllllllIIlllIllllllllll = List.of(llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[10]]), llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[11]]));
        int llllllllllllllllIIlllIlllllllllI = NPCs.getAll((int[])dS).size();
        if (aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIIlI.isEmpty() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlllIllllllllIl = llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[1]]);
            if (!aJ.lIlIIIlIllIlII(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[12]) || aJ.lIlIIIlIllIIIl(llllllllllllllllIIllllIIIIIIIlIl.dW) && aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIlIl.dW.getWorldArea().contains(llllllllllllllllIIllllIIIIIIIIll) ? 1 : 0) && aJ.lIlIIIlIllIlll(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10])) {
                llllllllllllllllIIlllIllllllllIl = llllllllllllllllIIlllIllllllllll.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(llllllllllllllllIIllllIIIIIIIIll))).orElse(null);
            }
            if (aJ.lIlIIIlIllIlll(llllllllllllllllIIlllIllllllllIl.getWorldX(), llllllllllllllllIIllllIIIIIIIIll.getWorldX())) {
                Movement.setDestination((WorldPoint)llllllllllllllllIIlllIllllllllIl);
            }
            return llIIllIlIIl[1];
        }
        NPC llllllllllllllllIIlllIllllllllIl = llllllllllllllllIIllllIIIIIIIIlI.stream().filter(nPC -> {
            int n2;
            if (aJ.lIlIIIlIllIIll(nPC.getId(), llIIllIlIIl[14]) && aJ.lIlIIIlIllIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIllIlIIl[1];
                0;
                if (3 <= ((25 + 141 - 78 + 64 ^ 80 + 58 - 81 + 85) & (0x8E ^ 0x82 ^ (0xD9 ^ 0xC3) ^ -1))) {
                    return ((0x9E ^ 0x91 ^ (0x47 ^ 0x1E)) & (132 + 46 - 26 + 64 ^ 4 + 16 - -29 + 93 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIlIIl[0];
            }
            return n2 != 0;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIllIlIl(this.dV.contains(nPC) ? 1 : 0)) {
                bl2 = llIIllIlIIl[1];
                0;
                if (((0xB ^ 0x54) & ~(0x7B ^ 0x24)) != 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIlllIIl(nPC, this.dW)) {
                bl2 = llIIllIlIIl[1];
                0;
                if ((0x24 ^ 0x20) == 0) {
                    return ((0xF3 ^ 0xBA) & ~(0x13 ^ 0x5A)) != 0;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).findFirst().orElse(null);
        if (aJ.lIlIIIlIlIllll(llllllllllllllllIIlllIllllllllIl)) {
            WorldPoint llllllllllllllllIIlllIllllllllII = llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[4]]);
            WorldPoint llllllllllllllllIIlllIlllllllIll = llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[3]]);
            WorldPoint llllllllllllllllIIlllIlllllllIlI = llllllllllllllllIIllllIIIIIIIlIl.a(dQ[llIIllIlIIl[2]]);
            if (aJ.lIlIIIlIlIllll(llllllllllllllllIIllllIIIIIIIlIl.dW)) {
                return llIIllIlIIl[0];
            }
            WorldArea llllllllllllllllIIlllIlllllllIIl = llllllllllllllllIIllllIIIIIIIlIl.dW.getWorldArea();
            WorldPoint[] worldPointArray = new WorldPoint[llIIllIlIIl[4]];
            worldPointArray[aJ.llIIllIlIIl[0]] = llllllllllllllllIIlllIllllllllII;
            worldPointArray[aJ.llIIllIlIIl[1]] = llllllllllllllllIIlllIlllllllIll;
            worldPointArray[aJ.llIIllIlIIl[3]] = llllllllllllllllIIlllIlllllllIlI;
            WorldPoint llllllllllllllllIIlllIlllllllIII = Stream.of(worldPointArray).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(llllllllllllllllIIlllIlllllllIIl.getCenter()))).orElse(null);
            if (aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIIII.stream().allMatch(worldPoint2 -> {
                boolean bl2;
                if (aJ.lIlIIIlIllIllI(worldPoint2.getWorldX(), llllllllllllllllIIllllIIIIIIIIll.getWorldX())) {
                    bl2 = llIIllIlIIl[1];
                    0;
                    if (-1 > 1) {
                        return ((0x7A ^ 0x12 ^ (0x87 ^ 0xB4)) & (101 + 183 - 250 + 206 ^ 140 + 97 - 110 + 44 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIIl[0];
                }
                return bl2;
            }) ? 1 : 0)) {
                if (aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIIIIII.contains(llllllllllllllllIIllllIIIIIIIIll) ? 1 : 0)) {
                    llllllllllllllllIIlllIlllllllIII = llllllllllllllllIIllllIIIIIIIIll.dx(llIIllIlIIl[1]);
                    0;
                    if (-1 > -1) {
                        return ((0x60 ^ 0x41) & ~(1 ^ 0x20)) != 0;
                    }
                } else if (aJ.lIlIIIlIlIllII(llllllllllllllllIIlllIlllllllIIl.contains(llllllllllllllllIIllllIIIIIIIIll) ? 1 : 0) && aJ.lIlIIIlIllIlll(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10])) {
                    llllllllllllllllIIlllIlllllllIII = llllllllllllllllIIlllIllllllllll.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(llllllllllllllllIIllllIIIIIIIIll))).orElse(null);
                    0;
                    if ((123 + 116 - 104 + 30 ^ 145 + 104 - 148 + 60) <= 0) {
                        return ((0x1F ^ 0x74 ^ (0xD5 ^ 0x97)) & (57 + 125 - 52 + 25 ^ 119 + 23 - -20 + 16 ^ -1)) != 0;
                    }
                } else if (aJ.lIlIIIlIllIlll(Math.abs(llllllllllllllllIIlllIlllllllIIl.getCenter().getWorldY() - llllllllllllllllIIllllIIIIIIIIll.getWorldY()), llIIllIlIIl[1])) {
                    llllllllllllllllIIlllIlllllllIII = new WorldPoint(llllllllllllllllIIllllIIIIIIIIll.getWorldX() + llIIllIlIIl[3], llllllllllllllllIIlllIlllllllIIl.getCenter().getWorldY(), llllllllllllllllIIllllIIIIIIIlIl.cu.getPlane());
                    0;
                    if (null != null) {
                        return ((76 + 111 - 108 + 49 ^ 60 + 85 - 47 + 59) & (81 + 49 - 100 + 110 ^ 140 + 49 - 45 + 1 ^ -1)) != 0;
                    }
                } else {
                    if (aJ.lIlIIIlIllIllI(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10])) {
                        return llIIllIlIIl[1];
                    }
                    llllllllllllllllIIlllIlllllllIII = llllllllllllllllIIlllIlllllllIIl.getCenter();
                }
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIlllIlllllllIII);
            return llIIllIlIIl[1];
        }
        llllllllllllllllIIlllIllllllllIl.interact(llIIllIIIlI[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIlIllII(Equipment.contains(item -> item.getName().contains(llIIllIIIlI[llIIllIlIIl[4]])) ? 1 : 0)) {
            llllllllllllllllIIllllIIIIIIIlIl.ea = llIIllIlIIl[1];
        }
        this.dW = var8_12;
        return llIIllIlIIl[1];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBoulderAttackStyle();
    }

    private static void lIlIIIlIIIlIIl() {
        llIIllIIIlI = new String[llIIllIlIIl[2]];
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[0]] = aJ."Attack";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[1]] = aJ."Drink";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[3]] = aJ."ranging";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[4]] = aJ."faerdhinen";
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (aJ.lIlIIIlIlllIII(animationChanged.getActor(), this.bB()) && aJ.lIlIIIlIllIIll(animationChanged.getActor().getAnimation(), llIIllIlIIl[13])) {
            this.dY = Static.getClient().getTickCount();
        }
    }

    @Inject
    protected aJ(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.dU = new HashSet<NPC>();
        this.dV = new HashSet<NPC>();
        this.dX = llIIllIlIIl[0];
        this.dZ = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
        this.aY = squireAutoTOA;
    }

    private static boolean lIlIIIlIllIlII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> bD() {
        int n2;
        List list = NPCs.getAll((int[])dS);
        int n3 = n2 = Players.getLocal().getWorldX();
        Iterator llllllllllllllllIIllllIIIIIlIlIl = list.iterator();
        while (aJ.lIlIIIlIlIllII(llllllllllllllllIIllllIIIIIlIlIl.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIllllIIIIIlIlll;
            NPC llllllllllllllllIIllllIIIIIlIlII = (NPC)llllllllllllllllIIllllIIIIIlIlIl.next();
            if (aJ.lIlIIIlIlIllIl(llllllllllllllllIIllllIIIIIlIlII.getWorldLocation().getX(), (int)llllllllllllllllIIllllIIIIIlIlll) && aJ.lIlIIIlIlIllII(NPCs.getAll(arg_0 -> aJ.a(llllllllllllllllIIllllIIIIIlIlII, (int)llllllllllllllllIIllllIIIIIlIlll, arg_0)).isEmpty() ? 1 : 0)) {
                int llllllllllllllllIIllllIIIIIlIllI = llllllllllllllllIIllllIIIIIlIlII.getWorldLocation().getX();
                0;
                if (((0x15 ^ 0x4A ^ (0x1E ^ 0x70)) & (2 ^ 0x38 ^ (0x5D ^ 0x56) ^ -1)) == 0) break;
                return null;
            }
            0;
            if ((21 + 187 - 25 + 6 ^ 128 + 112 - 74 + 18) != 0) continue;
            return null;
        }
        int n4 = n3;
        return list.stream().filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIllIIll(nPC.getWorldLocation().getX(), n4)) {
                bl2 = llIIllIlIIl[1];
                0;
                if (-3 > 0) {
                    return ((0xC2 ^ 0x94 ^ (0x14 ^ 0x7A)) & (0x17 ^ 0xE ^ (0x40 ^ 0x61) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).collect(Collectors.toList());
    }

    private static String lIlIIIlIIIIlll(String llllllllllllllllIIlllIlllIlllllI, String llllllllllllllllIIlllIlllIllllIl) {
        llllllllllllllllIIlllIlllIlllllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlllIllllII = new StringBuilder();
        char[] llllllllllllllllIIlllIlllIlllIll = llllllllllllllllIIlllIlllIllllIl.toCharArray();
        int llllllllllllllllIIlllIlllIlllIlI = llIIllIlIIl[0];
        char[] llllllllllllllllIIlllIlllIllIlII = llllllllllllllllIIlllIlllIlllllI.toCharArray();
        int llllllllllllllllIIlllIlllIllIIll = llllllllllllllllIIlllIlllIllIlII.length;
        int llllllllllllllllIIlllIlllIllIIlI = llIIllIlIIl[0];
        while (aJ.lIlIIIlIllIIlI(llllllllllllllllIIlllIlllIllIIlI, llllllllllllllllIIlllIlllIllIIll)) {
            char llllllllllllllllIIlllIlllIllllll = llllllllllllllllIIlllIlllIllIlII[llllllllllllllllIIlllIlllIllIIlI];
            llllllllllllllllIIlllIlllIllllII.append((char)(llllllllllllllllIIlllIlllIllllll ^ llllllllllllllllIIlllIlllIlllIll[llllllllllllllllIIlllIlllIlllIlI % llllllllllllllllIIlllIlllIlllIll.length]));
            0;
            ++llllllllllllllllIIlllIlllIlllIlI;
            ++llllllllllllllllIIlllIlllIllIIlI;
            0;
            if ((0x3B ^ 0x3F) >= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIlllIllllII);
    }

    private static boolean lIlIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

