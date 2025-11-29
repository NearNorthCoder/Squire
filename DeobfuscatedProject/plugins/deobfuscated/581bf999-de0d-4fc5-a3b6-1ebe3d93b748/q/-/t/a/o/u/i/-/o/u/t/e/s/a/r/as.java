/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.Angle
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Akkha")
public class as
extends ap {
    private static /* synthetic */ String[] lIllIIllllI;
    private static /* synthetic */ int[] lIllIIlllll;
    private final /* synthetic */ m dh;
    private /* synthetic */ int di;

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> bz() {
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int[] nArray = new int[lIllIIlllll[2]];
        nArray[as.lIllIIlllll[0]] = lIllIIlllll[6];
        Iterator llllllllllllllllIlIlIIlIllIlllIl = NPCs.getAll((int[])nArray).iterator();
        while (as.lIIlIllIlIIIll(llllllllllllllllIlIlIIlIllIlllIl.hasNext() ? 1 : 0)) {
            NPC llllllllllllllllIlIlIIlIllIlllII = (NPC)llllllllllllllllIlIlIIlIllIlllIl.next();
            int llllllllllllllllIlIlIIlIllIllIll = lIllIIlllll[0];
            while (as.lIIlIllIlIlIII(llllllllllllllllIlIlIIlIllIllIll, lIllIIlllll[7])) {
                WorldPoint llllllllllllllllIlIlIIlIllIllIlI = llllllllllllllllIlIlIIlIllIlllII.getWorldLocation();
                if (as.lIIlIllIlIIlII(llllllllllllllllIlIlIIlIllIllIlI)) {
                    0;
                    if (2 > 3) {
                        return null;
                    }
                } else {
                    void llllllllllllllllIlIlIIlIllIllllI;
                    Angle llllllllllllllllIlIlIIlIllIllIIl = new Angle(llllllllllllllllIlIlIIlIllIlllII.getOrientation());
                    int llllllllllllllllIlIlIIlIllIllIII = (llllllllllllllllIlIlIIlIllIllIIl.getAngle() + lIllIIlllll[2]) / lIllIIlllll[8];
                    if (as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIllIllIII)) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dy(-llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if (((56 + 214 - 238 + 191 ^ 144 + 53 - 119 + 79) & (0xBC ^ 0x9D ^ (0xC8 ^ 0xAB) ^ -1)) < 0) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[2])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dy(llllllllllllllllIlIlIIlIllIllIll).dx(-llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if (((0x7A ^ 0x35 ^ (0xEA ^ 0x96)) & (0 ^ 0x5E ^ (0xF2 ^ 0x9F) ^ -1)) != 0) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[3])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dx(-llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if ((0x21 ^ 0x25) > (0x71 ^ 0x75)) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[9])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dx(-llllllllllllllllIlIlIIlIllIllIll).dy(llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if (null != null) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[7])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dy(llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if ((3 & ~3) >= 1) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[10])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dy(llllllllllllllllIlIlIIlIllIllIll).dx(llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if (3 != 3) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIllIllIII, lIllIIlllll[11])) {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dx(llllllllllllllllIlIlIIlIllIllIll));
                        0;
                        0;
                        if (3 == 2) {
                            return null;
                        }
                    } else {
                        llllllllllllllllIlIlIIlIllIllllI.add(llllllllllllllllIlIlIIlIllIllIlI.dx(llllllllllllllllIlIlIIlIllIllIll).dy(-llllllllllllllllIlIlIIlIllIllIll));
                        0;
                    }
                }
                ++llllllllllllllllIlIlIIlIllIllIll;
                0;
                if (null == null) continue;
                return null;
            }
            0;
            if (3 > 2) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lIIlIllIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIlIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIllIlIIIll(int n2) {
        return n2 != 0;
    }

    static {
        as.lIIlIllIlIIIlI();
        as.lIIlIllIlIIIII();
    }

    private static void lIIlIllIlIIIII() {
        lIllIIllllI = new String[lIllIIlllll[2]];
        as.lIllIIllllI[as.lIllIIlllll[0]] = as."Attack";
    }

    private static String lIIlIllIIlllll(String llllllllllllllllIlIlIIlIllIIIIlI, String llllllllllllllllIlIlIIlIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIlIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIlllll[12]), "DES");
            Cipher llllllllllllllllIlIlIIlIllIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIlIllIIIllI.init(lIllIIlllll[3], llllllllllllllllIlIlIIlIllIIIlll);
            return new String(llllllllllllllllIlIlIIlIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIlIllIIIlIl) {
            llllllllllllllllIlIlIIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected as(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dh = m2;
    }

    @Override
    public boolean bl() {
        int n2;
        boolean llllllllllllllllIlIlIIlIlllIlIll;
        boolean bl2;
        as llllllllllllllllIlIlIIlIlllIllIl;
        if (as.lIIlIllIlIIIll(this.bu() ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        NPC llllllllllllllllIlIlIIlIlllIllII = llllllllllllllllIlIlIIlIlllIllIl.J();
        if (as.lIIlIllIlIIlII(llllllllllllllllIlIlIIlIlllIllII)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIllIl.g(llllllllllllllllIlIlIIlIlllIllII) ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIllIl.dh.K() ? 1 : 0) && as.lIIlIllIlIIllI(super.br(), llllllllllllllllIlIlIIlIlllIllIl.cW.meleeGearAkkha()) && as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIllII.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIllIl.bw() ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIlll(llllllllllllllllIlIlIIlIlllIllII.getId(), lIllIIlllll[1])) {
            bl2 = lIllIIlllll[2];
            0;
            if (((0x29 ^ 0x1B) & ~(0xB ^ 0x39)) >= 3) {
                return ((0x5A ^ 0x44) & ~(0xB9 ^ 0xA7)) != 0;
            }
        } else {
            bl2 = lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIIll((llllllllllllllllIlIlIIlIlllIlIll = bl2) ? 1 : 0)) {
            WorldPoint llllllllllllllllIlIlIIlIlllIlIlI = Players.getLocal().getWorldLocation();
            List<WorldPoint> llllllllllllllllIlIlIIlIlllIlIIl = llllllllllllllllIlIlIIlIlllIllIl.bz();
            if (as.lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIlIIl.contains(llllllllllllllllIlIlIIlIlllIlIlI) ? 1 : 0)) {
                WorldPoint llllllllllllllllIlIlIIlIlllIlIII = llllllllllllllllIlIlIIlIlllIlIlI.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIlIIl.contains(worldPoint) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];
                        0;
                        if (((0xE7 ^ 0xC4) & ~(0x7A ^ 0x59)) < 0) {
                            return ((0xF ^ 0x43) & ~(0x70 ^ 0x3C)) != 0;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)llllllllllllllllIlIlIIlIlllIllII))).orElse(null);
                if (as.lIIlIllIlIIlII(llllllllllllllllIlIlIIlIlllIlIII)) {
                    return lIllIIlllll[0];
                }
                Movement.setDestination((WorldPoint)llllllllllllllllIlIlIIlIlllIlIII);
                return lIllIIlllll[2];
            }
            if (as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIllII.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint llllllllllllllllIlIlIIlIlllIlIII = llllllllllllllllIlIlIIlIlllIlIlI.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint2 -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(worldPoint2.equals((Object)llllllllllllllllIlIlIIlIlllIlIlI) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];
                        0;
                        if (((168 + 114 - 109 + 14 ^ 104 + 100 - 90 + 18) & (0x93 ^ 0xC6 ^ (0x53 ^ 0x39) ^ -1)) != 0) {
                            return ((0xF ^ 0x1C ^ (0x85 ^ 0xA7)) & (7 ^ 0x43 ^ (0xDE ^ 0xAB) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).filter(worldPoint -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(llllllllllllllllIlIlIIlIlllIlIIl.contains(worldPoint) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];
                        0;
                        if (2 != 2) {
                            return ((0xCA ^ 0xC7) & ~(9 ^ 4)) != 0;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)llllllllllllllllIlIlIIlIlllIllII))).orElse(null);
                if (as.lIIlIllIlIIlII(llllllllllllllllIlIlIIlIlllIlIII)) {
                    return lIllIIlllll[0];
                }
                Movement.setDestination((WorldPoint)llllllllllllllllIlIlIIlIlllIlIII);
                return lIllIIlllll[2];
            }
        }
        SquireAutoTOA squireAutoTOA = llllllllllllllllIlIlIIlIlllIllIl.aY;
        if (as.lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIlIll ? 1 : 0)) {
            n2 = lIllIIlllll[4];
            0;
            if (1 < 0) {
                return ((0xF7 ^ 0xB8 ^ 2) & (0x31 ^ 0x4A ^ (0x41 ^ 0x77) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlllll[5];
        }
        squireAutoTOA.a(n2);
        llllllllllllllllIlIlIIlIlllIllIl.e(llllllllllllllllIlIlIIlIlllIlIll);
        0;
        llllllllllllllllIlIlIIlIlllIllII.interact(lIllIIllllI[lIllIIlllll[0]]);
        if (as.lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIllII.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllllIlIlIIlIlllIllIl.di = llllllllllllllllIlIlIIlIlllIllIl.cu.getTickCount();
        }
        return lIllIIlllll[2];
    }

    private static boolean lIIlIllIlIIlII(Object object) {
        return object == null;
    }

    private static void lIIlIllIlIIIlI() {
        lIllIIlllll = new int[13];
        as.lIllIIlllll[0] = (94 + 14 - -49 + 23 ^ 82 + 31 - -2 + 44) & (42 + 15 - 17 + 101 ^ 117 + 107 - 213 + 155 ^ -1);
        as.lIllIIlllll[1] = 0xFFFFAF77 & 0x7E9B;
        as.lIllIIlllll[2] = 1;
        as.lIllIIlllll[3] = 2;
        as.lIllIIlllll[4] = 8 ^ 0x75 ^ (0x3F ^ 0x58);
        as.lIllIIlllll[5] = 4 ^ 0x29;
        as.lIllIIlllll[6] = 0xFFFFBE7F & 0x6F9C;
        as.lIllIIlllll[7] = 45 + 80 - 30 + 60 ^ 19 + 131 - -5 + 4;
        as.lIllIIlllll[8] = -(0xFFFFEEBB & 0x37FF) & (0xFFFFE7FA & 0x3FBF);
        as.lIllIIlllll[9] = 3;
        as.lIllIIlllll[10] = 176 + 103 - 135 + 36 ^ 124 + 59 - 133 + 127;
        as.lIllIIlllll[11] = 0x48 ^ 0x4E;
        as.lIllIIlllll[12] = 0xA6 ^ 0x95 ^ (0x13 ^ 0x28);
    }

    private static boolean lIIlIllIlIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (as.lIIlIllIlIIIll(this.bw() ? 1 : 0)) {
            configStorageBox = this.cW.akkhaFinalSpec();
            0;
            if (1 <= 0) {
                return null;
            }
        } else {
            configStorageBox = null;
        }
        return configStorageBox;
    }
}

