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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Akkha")
public class AttackingAkkhaTask
extends AutotoaTaskBase {

    private final  m dh;
    private  int di;

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> bz() {
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int[] nArray = new int[lIllIIlllll[2]];
        nArray[as.lIllIIlllll[0]] = lIllIIlllll[6];
        Iterator var1 = NPCs.getAll((int[])nArray).iterator();
        while (as.lIIlIllIlIIIll(var1.hasNext() ? 1 : 0)) {
            NPC var2 = (NPC)var1.next();
            int var3 = lIllIIlllll[0];
            while (as.lIIlIllIlIlIII(var3, lIllIIlllll[7])) {
                WorldPoint var4 = var2.getWorldLocation();
                if (as.lIIlIllIlIIlII(var4)) {

                    if (2 > 3) {
                        return null;
                    }
                } else {
                    void var5;
                    Angle var6 = new Angle(var2.getOrientation());
                    int var7 = (var6.getAngle() + lIllIIlllll[2]) / lIllIIlllll[8];
                    if (as.lIIlIllIlIIlIl(var7)) {
                        var5.add(var4.dy(-var3));

                        if (((56 + 214 - 238 + 191 ^ 144 + 53 - 119 + 79) & (0xBC ^ 0x9D ^ (0xC8 ^ 0xAB) ^ -1)) < 0) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[2])) {
                        var5.add(var4.dy(var3).dx(-var3));

                        if (((0x7A ^ 0x35 ^ (0xEA ^ 0x96)) & (0 ^ 0x5E ^ (0xF2 ^ 0x9F) ^ -1)) != 0) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[3])) {
                        var5.add(var4.dx(-var3));

                        if ((0x21 ^ 0x25) > (0x71 ^ 0x75)) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[9])) {
                        var5.add(var4.dx(-var3).dy(var3));

                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[7])) {
                        var5.add(var4.dy(var3));

                        if ((3 & ~3) >= 1) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[10])) {
                        var5.add(var4.dy(var3).dx(var3));

                        if (3 != 3) {
                            return null;
                        }
                    } else if (as.lIIlIllIlIIlll(var7, lIllIIlllll[11])) {
                        var5.add(var4.dx(var3));

                        if (3 == 2) {
                            return null;
                        }
                    } else {
                        var5.add(var4.dx(var3).dy(-var3));

                    }
                }
                ++var3;

                return null;
            }

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
        as.lIllIIllllI[as.lIllIIlllll[0]] = "Attack";
    }

    @Inject
    protected AttackingAkkhaTask(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dh = m2;
    }

    @Override
    public boolean bl() {
        int n2;
        boolean var8;
        boolean bl2;
        as var9;
        if (as.lIIlIllIlIIIll(this.bu() ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        NPC var10 = var9.J();
        if (as.lIIlIllIlIIlII(var10)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIlIl(var9.g(var10) ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIIll(var9.dh.K() ? 1 : 0) && as.lIIlIllIlIIllI(super.br(), var9.cW.meleeGearAkkha()) && as.lIIlIllIlIIlIl(var10.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && as.lIIlIllIlIIlIl(var9.bw() ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIlll(var10.getId(), lIllIIlllll[1])) {
            bl2 = lIllIIlllll[2];

            if (((0x29 ^ 0x1B) & ~(0xB ^ 0x39)) >= 3) {
                return false;
            }
        } else {
            bl2 = lIllIIlllll[0];
        }
        if (as.lIIlIllIlIIIll((var8 = bl2) ? 1 : 0)) {
            WorldPoint var11 = Players.getLocal().getWorldLocation();
            List<WorldPoint> var12 = var9.bz();
            if (as.lIIlIllIlIIIll(var12.contains(var11) ? 1 : 0)) {
                WorldPoint var13 = var11.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(var12.contains(worldPoint) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];

                        if (((0xE7 ^ 0xC4) & ~(0x7A ^ 0x59)) < 0) {
                            return false;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var10))).orElse(null);
                if (as.lIIlIllIlIIlII(var13)) {
                    return lIllIIlllll[0];
                }
                Movement.setDestination((WorldPoint)var13);
                return lIllIIlllll[2];
            }
            if (as.lIIlIllIlIIlIl(var10.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint var13 = var11.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint2 -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(worldPoint2.equals((Object)var11) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];

                        if (((168 + 114 - 109 + 14 ^ 104 + 100 - 90 + 18) & (0x93 ^ 0xC6 ^ (0x53 ^ 0x39) ^ -1)) != 0) {
                            return ((0xF ^ 0x1C ^ (0x85 ^ 0xA7)) & (7 ^ 0x43 ^ (0xDE ^ 0xAB) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).filter(worldPoint -> {
                    boolean bl2;
                    if (as.lIIlIllIlIIlIl(var12.contains(worldPoint) ? 1 : 0)) {
                        bl2 = lIllIIlllll[2];

                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        bl2 = lIllIIlllll[0];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var10))).orElse(null);
                if (as.lIIlIllIlIIlII(var13)) {
                    return lIllIIlllll[0];
                }
                Movement.setDestination((WorldPoint)var13);
                return lIllIIlllll[2];
            }
        }
        SquireAutoTOA squireAutoTOA = var9.aY;
        if (as.lIIlIllIlIIIll(var8 ? 1 : 0)) {
            n2 = lIllIIlllll[4];

            if (1 < 0) {
                return ((0xF7 ^ 0xB8 ^ 2) & (0x31 ^ 0x4A ^ (0x41 ^ 0x77) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlllll[5];
        }
        squireAutoTOA.a(n2);
        var9.e(var8);

        var10.interact(lIllIIllllI[lIllIIlllll[0]]);
        if (as.lIIlIllIlIIIll(var10.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var9.di = var9.cu.getTickCount();
        }
        return lIllIIlllll[2];
    }

    private static boolean lIIlIllIlIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIlIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (as.lIIlIllIlIIIll(this.bw() ? 1 : 0)) {
            configStorageBox = this.cW.akkhaFinalSpec();

            if (1 <= 0) {
                return null;
            }
        } else {
            configStorageBox = null;
        }
        return configStorageBox;
    }
}

