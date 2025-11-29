/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Model
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aq;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.o;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class ap
extends ao {
    protected static final /* synthetic */ int cY;
    protected static final /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIllIllIlII;
    protected static final /* synthetic */ int da;
    private static final /* synthetic */ int db;
    private static final /* synthetic */ int dc;
    private static /* synthetic */ int[] lIllIlllIII;

    private static boolean lIIllIIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public o bv() {
        switch (aq.dd[this.bx().ordinal()]) {
            case 1: {
                return o.DEATH;
            }
            case 2: {
                return o.FIRE;
            }
            case 3: {
                return o.AIR;
            }
            case 4: {
                return o.LIGHTNING;
            }
        }
        return o.LIGHTNING;
    }

    @Override
    public boolean bj() {
        int n2;
        String[] stringArray = new String[lIllIlllIII[1]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[2]];
        stringArray[ap.lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (ap.lIIlIlllllllll(nPC) && ap.lIIllIIIIIIIII(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            n2 = lIllIlllIII[3];
            0;
            if (3 <= 1) {
                return false;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    static {
        ap.lIIlIllllllllI();
        ap.lIIlIlllllIlIl();
        cY = lIllIlllIII[9];
        dc = lIllIlllIII[6];
        cZ = lIllIlllIII[5];
        db = lIllIlllIII[0];
        da = lIllIlllIII[7];
    }

    @Override
    public int bi() {
        return lIllIlllIII[0];
    }

    public boolean bw() {
        int[] nArray = new int[lIllIlllIII[3]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[9];
        return this.e(nArray);
    }

    private static boolean lIIllIIIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIllllllllI() {
        lIllIlllIII = new int[20];
        ap.lIllIlllIII[0] = 0xFFFFFF57 & 0x39FC;
        ap.lIllIlllIII[1] = 2;
        ap.lIllIlllIII[2] = (0x2A ^ 0x30) & ~(0x4E ^ 0x54);
        ap.lIllIlllIII[3] = 1;
        ap.lIllIlllIII[4] = 0x9C ^ 0x98;
        ap.lIllIlllIII[5] = -(0xFFFF9599 & 0x7AF7) & (0xFFFFFFFF & 0x3E9E);
        ap.lIllIlllIII[6] = 0xFFFFFE0F & 0x2FFF;
        ap.lIllIlllIII[7] = 0xFFFFEF54 & 0x3EBB;
        ap.lIllIlllIII[8] = 3;
        ap.lIllIlllIII[9] = -(0xFFFFEB3D & 0x55CF) & (0xFFFFFF1F & 0x6FFF);
        ap.lIllIlllIII[10] = 0xA9 ^ 0xAC;
        ap.lIllIlllIII[11] = 0 ^ 6;
        ap.lIllIlllIII[12] = 26 + 72 - -35 + 19 ^ 15 + 41 - 22 + 125;
        ap.lIllIlllIII[13] = 0x36 ^ 0x13 ^ (0x63 ^ 0x4E);
        ap.lIllIlllIII[14] = 0 ^ 9;
        ap.lIllIlllIII[15] = 39 + 163 - 91 + 70 ^ 10 + 13 - -68 + 100;
        ap.lIllIlllIII[16] = 0xA5 ^ 0x9B ^ (0x2D ^ 0x18);
        ap.lIllIlllIII[17] = 181 + 145 - 273 + 131 ^ 45 + 22 - -38 + 75;
        ap.lIllIlllIII[18] = 38 + 3 - 13 + 118 ^ 42 + 98 - 17 + 36;
        ap.lIllIlllIII[19] = 0xAB ^ 0xA5;
    }

    public boolean g(NPC nPC) {
        int n2;
        Model model = nPC.getModel();
        if (ap.lIIlIlllllllll(model) && ap.lIIllIIIIIIlII(model.getOverrideAmount())) {
            n2 = lIllIlllIII[3];
            0;
            if ((0x43 ^ 0x47) == 0) {
                return false;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    public void g(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        if (ap.lIIllIIIIIIIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (ap.lIIlIlllllllll(nPC.getName()) && ap.lIIllIIIIIIIII(nPC.getName().contains(lIllIllIlII[lIllIlllIII[18]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo((Locatable)player), lIllIlllIII[4])) {
                n2 = lIllIlllIII[3];
                0;
                if (1 == 2) {
                    return ((155 + 39 - 70 + 67 ^ 139 + 39 - 62 + 66) & (0xE3 ^ 0x91 ^ (0x75 ^ 0xE) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlllIII[2];
            }
            return n2 != 0;
        }))) {
            Movement.setDestination((WorldPoint)worldPoint);
            return;
        }
        WorldPoint worldPoint2 = player.getWorldLocation();
        WorldPoint worldPoint3 = this.c(worldPoint2, worldPoint);
        Movement.setDestination((WorldPoint)worldPoint3);
    }

    private static boolean lIIllIIIIIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[lIllIlllIII[3]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (ap.lIIllIIIIIIIIl(tileObject)) {
            return lIllIlllIII[2];
        }
        this.r();
        tileObject.interact(lIllIllIlII[lIllIlllIII[8]]);
        return lIllIlllIII[3];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (ap.lIIllIIIIIIIII(super.bn() ? 1 : 0)) {
            return lIllIlllIII[3];
        }
        if (ap.lIIllIIIIIIIII(Dialog.isOpen() ? 1 : 0) && ap.lIIllIIIIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIlllIII[3];
        }
        String[] stringArray = new String[lIllIlllIII[1]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[4]];
        stringArray[ap.lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[10]];
        NPC var29 = NPCs.getNearest((String[])stringArray);
        if (ap.lIIllIIIIIIIIl(var29)) {
            return lIllIlllIII[2];
        }
        String[] stringArray2 = new String[lIllIlllIII[3]];
        stringArray2[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[11]];
        if (ap.lIIllIIIIIIIII(var29.hasAction(stringArray2) ? 1 : 0)) {
            var29.interact(lIllIllIlII[lIllIlllIII[12]]);
            return lIllIlllIII[3];
        }
        var1_1.interact(lIllIllIlII[lIllIlllIII[13]]);
        return lIllIlllIII[3];
    }

    private static String lIIlIllllIllII(String var18, String var12) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIllIlllIII[1], var28);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllllIlIl() {
        lIllIllIlII = new String[lIllIlllIII[19]];
        ap.lIllIllIlII[ap.lIllIlllIII[2]] = ap."Osmumten";
        ap.lIllIllIlII[ap.lIllIlllIII[3]] = ap."Het";
        ap.lIllIllIlII[ap.lIllIlllIII[1]] = ap."Teleport crystal";
        ap.lIllIllIlII[ap.lIllIlllIII[8]] = ap."Quick-Use";
        ap.lIllIllIlII[ap.lIllIlllIII[4]] = ap."Het";
        ap.lIllIllIlII[ap.lIllIlllIII[10]] = ap."Osmumten";
        ap.lIllIllIlII[ap.lIllIlllIII[11]] = ap."Quick-leave";
        ap.lIllIllIlII[ap.lIllIlllIII[12]] = ap."Quick-leave";
        ap.lIllIllIlII[ap.lIllIlllIII[13]] = ap."Talk-to";
        ap.lIllIllIlII[ap.lIllIlllIII[14]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[15]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[16]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[17]] = ap."orb";
        ap.lIllIllIlII[ap.lIllIlllIII[18]] = ap."Orb";
    }

    protected ap(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    public List<NPC> by() {
        String[] stringArray = new String[lIllIlllIII[3]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[14]];
        return NPCs.getAll((String[])stringArray);
    }

    public NPC J() {
        int[] nArray = new int[lIllIlllIII[4]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[5];
        nArray[ap.lIllIlllIII[3]] = lIllIlllIII[6];
        nArray[ap.lIllIlllIII[1]] = lIllIlllIII[7];
        nArray[ap.lIllIlllIII[8]] = lIllIlllIII[9];
        return NPCs.getNearest((int[])nArray);
    }

    private static String lIIlIlllllIlII(String var1, String var4) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var7 = var4.toCharArray();
        int var30 = lIllIlllIII[2];
        char[] var27 = var1.toCharArray();
        int var3 = var27.length;
        int var14 = lIllIlllIII[2];
        while (ap.lIIllIIIIIIIll(var14, var3)) {
            char var16 = var27[var14];
            var19.append((char)(var16 ^ var7[var30 % var7.length]));
            0;
            ++var30;
            ++var14;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIlIlllllllll(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[lIllIlllIII[4]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[5];
        nArray[ap.lIllIlllIII[3]] = lIllIlllIII[6];
        nArray[ap.lIllIlllIII[1]] = lIllIlllIII[7];
        nArray[ap.lIllIlllIII[8]] = lIllIlllIII[9];
        return this.e(nArray);
    }

    private static String lIIlIllllIlIlI(String var23, String var15) {
        try {
            SecretKeySpec var32 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIlllIII[13]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIlllIII[1], var32);
            return new String(var9.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public n bx() {
        NPC var13;
        WorldPoint var17;
        ap var21;
        n var11;
        NPC var25;
        int var2;
        int var10;
        List<NPC> list = this.by();
        if (ap.lIIllIIIIIIIlI(list.size(), lIllIlllIII[4])) {
            void var5;
            n[] nArray = n.values();
            int n2 = nArray.length;
            var10 = lIllIlllIII[2];
            while (ap.lIIllIIIIIIIll(var10, var2)) {
                var11 = var25[var10];
                var17 = var11.a(var21.cu);
                var13 = NPCs.getNearest((WorldPoint)var17, nPC -> {
                    int n2;
                    if (ap.lIIllIIIIIIIII(nPC.getName().equals(lIllIllIlII[lIllIlllIII[16]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo(var17), lIllIlllIII[11])) {
                        n2 = lIllIlllIII[3];
                        0;
                        if (3 == 0) {
                            return false;
                        }
                    } else {
                        n2 = lIllIlllIII[2];
                    }
                    return n2 != 0;
                });
                if (ap.lIIlIlllllllll(var13) && ap.lIIllIIIIIIIII(var21.g(var13) ? 1 : 0)) {
                    return var11;
                }
                ++var10;
                0;
                if ((0x33 ^ 0x37) != 3) continue;
                return null;
            }
            var25 = var5.stream().filter(var21::g).findFirst().orElse(null);
            if (ap.lIIlIlllllllll(var25)) {
                return n.a(var21.cu, var25.getWorldLocation());
            }
        }
        var25 = n.values();
        var2 = ((n[])var25).length;
        var10 = lIllIlllIII[2];
        while (ap.lIIllIIIIIIIll(var10, var2)) {
            var11 = var25[var10];
            var17 = var11.a(var21.cu);
            var13 = NPCs.getNearest((WorldPoint)var17, nPC -> {
                int n2;
                if (ap.lIIllIIIIIIIII(nPC.getName().equals(lIllIllIlII[lIllIlllIII[15]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo(var17), lIllIlllIII[11])) {
                    n2 = lIllIlllIII[3];
                    0;
                    if (1 == 2) {
                        return false;
                    }
                } else {
                    n2 = lIllIlllIII[2];
                }
                return n2 != 0;
            });
            if (ap.lIIllIIIIIIIIl(var13)) {
                return var11;
            }
            ++var10;
            0;
            if (-1 < (0xBF ^ 0xBB)) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ap var31;
        void var26;
        NPC nPC = this.J();
        if (ap.lIIllIIIIIIIIl(nPC)) {
            return this.cW.meleeGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(var26.getId(), lIllIlllIII[5])) {
            return var31.cW.mageGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(var26.getId(), lIllIlllIII[6])) {
            return var31.cW.meleeGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(var26.getId(), lIllIlllIII[7])) {
            return var31.cW.rangeGearAkkha();
        }
        return this.cW.meleeGearAkkha();
    }

    private static boolean lIIllIIIIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean bu() {
        int n2;
        void var6;
        ap var24;
        NPC nPC = this.J();
        if (ap.lIIllIIIIIIIIl(nPC)) {
            return lIllIlllIII[2];
        }
        if (ap.lIIllIIIIIIIII(var24.cW.butterfly() ? 1 : 0) && ap.lIIllIIIIIIIlI(var6.getId(), lIllIlllIII[5]) && ap.lIIllIIIIIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            n2 = lIllIlllIII[3];
            0;
            if (-1 >= (0x4C ^ 0x7F ^ (0xF1 ^ 0xC6))) {
                return ((0x7D ^ 0x21 ^ (0x1F ^ 0x63)) & (94 + 96 - 75 + 19 ^ 4 + 36 - -93 + 33 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    public WorldPoint c(WorldPoint worldPoint3, WorldPoint worldPoint4) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (ap.lIIlIlllllllll(nPC.getName()) && ap.lIIllIIIIIIIII(nPC.getName().toLowerCase().contains(lIllIllIlII[lIllIlllIII[17]]) ? 1 : 0)) {
                n2 = lIllIlllIII[3];
                0;
                if (1 != 1) {
                    return false;
                }
            } else {
                n2 = lIllIlllIII[2];
            }
            return n2 != 0;
        });
        WorldArea worldArea = worldPoint3.toWorldArea().offset(lIllIlllIII[1]);
        Predicate<WorldPoint> predicate = worldPoint -> list.stream().noneMatch(nPC -> nPC.getWorldLocation().equals(worldPoint));
        Stream<WorldPoint> stream = worldArea.toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (ap.lIIllIIIIIIlII(worldPoint2.equals((Object)worldPoint3) ? 1 : 0)) {
                bl2 = lIllIlllIII[3];
                0;
                if (1 <= ((0x58 ^ 0x71) & ~(0xEB ^ 0xC2))) {
                    return false;
                }
            } else {
                bl2 = lIllIlllIII[2];
            }
            return bl2;
        }).filter(predicate).filter(worldPoint2 -> {
            boolean bl2;
            List list = worldPoint3.pathTo(this.cu, worldPoint2);
            if (!ap.lIIlIlllllllll(list) || ap.lIIllIIIIIIIII(list.stream().allMatch(predicate) ? 1 : 0)) {
                bl2 = lIllIlllIII[3];
                0;
                if (3 < ((0x17 ^ 0x2E) & ~(0x25 ^ 0x1C))) {
                    return false;
                }
            } else {
                bl2 = lIllIlllIII[2];
            }
            return bl2;
        }).filter(Reachable::isWalkable);
        WorldPoint worldPoint5 = worldPoint4;
        Objects.requireNonNull(worldPoint5);
        0;
        return stream.min(Comparator.comparingInt(arg_0 -> ((WorldPoint)worldPoint5).distanceTo(arg_0))).orElse(worldPoint4);
    }
}

