/*
 * Deobfuscated TOA Akkha Attack Task
 * Handles attacking Akkha during the fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

@TaskDesc(name="Attacking Akkha")
public class AttackingAkkhaTask
extends AutotoaManager {

    private final  m dh;
    private  int di;

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> bz() {
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int[] nArray = new int[var2[2]];
        nArray[as.var2[0]] = var2[6];
        Iterator var3 = NPCs.getAll((int[])nArray).iterator();
        while (as.var4(var3.hasNext() ? 1 : 0)) {
            NPC var5 = (NPC)var3.next();
            int var6 = var2[0];
            while (as.var7(var6, var2[7])) {
                WorldPoint var8 = var5.getWorldLocation();
                if (as.var9(var8)) {
                    0;
                    if (2 > 3) {
                        return null;
                    }
                } else {
                    void var10;
                    Angle var11 = new Angle(var5.getOrientation());
                    int var12 = (var11.getAngle() + var2[2]) / var2[8];
                    if (as.var13(var12)) {
                        var10.add(var8.dy(-var6));
                        0;
                        0;
                        if (((56 + 214 - 238 + 191 ^ 144 + 53 - 119 + 79) & (0xBC ^ 0x9D ^ (0xC8 ^ 0xAB) ^ -1)) < 0) {
                            return null;
                        }
                    } else if (as.var14(var12, var2[2])) {
                        var10.add(var8.dy(var6).dx(-var6));
                        0;
                        0;
                        if (((0x7A ^ 0x35 ^ (0xEA ^ 0x96)) & (0 ^ 0x5E ^ (0xF2 ^ 0x9F) ^ -1)) != 0) {
                            return null;
                        }
                    } else if (as.var14(var12, var2[3])) {
                        var10.add(var8.dx(-var6));
                        0;
                        0;
                        if ((0x21 ^ 0x25) > (0x71 ^ 0x75)) {
                            return null;
                        }
                    } else if (as.var14(var12, var2[9])) {
                        var10.add(var8.dx(-var6).dy(var6));
                        0;
                        0;
                        if null != null {
                            return null;
                        }
                    } else if (as.var14(var12, var2[7])) {
                        var10.add(var8.dy(var6));
                        0;
                        0;
                        if ((3 & ~3) >= 1) {
                            return null;
                        }
                    } else if (as.var14(var12, var2[10])) {
                        var10.add(var8.dy(var6).dx(var6));
                        0;
                        0;
                        if (3 != 3) {
                            return null;
                        }
                    } else if (as.var14(var12, var2[11])) {
                        var10.add(var8.dx(var6));
                        0;
                        0;
                        if (3 == 2) {
                            return null;
                        }
                    } else {
                        var10.add(var8.dx(var6).dy(-var6));
                        0;
                    }
                }
                ++var6;
                0;
                if null == null continue;
                return null;
            }
            0;
            if (3 > 2) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    static {
        as.var16();
        as.var17();
    }

    private static void var17() {
        var1 = new String[var2[2]];
        as.var1[as.var2[0]] = "Attack";
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingAkkhaTask(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dh = m2;
    }

    @Override
    public boolean bl() {
        int n2;
        boolean var24;
        boolean bl2;
        as var25;
        if (as.var4(this.bu() ? 1 : 0)) {
            return var2[0];
        }
        NPC var26 = var25.J();
        if (as.var9(var26)) {
            return var2[0];
        }
        if (as.var13(var25.g(var26) ? 1 : 0)) {
            return var2[0];
        }
        if (as.var4(var25.dh.K() ? 1 : 0) && as.var15(super.br(), var25.cW.meleeGearAkkha()) && as.var13(var26.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && as.var13(var25.bw() ? 1 : 0)) {
            return var2[0];
        }
        if (as.var14(var26.getId(), var2[1])) {
            bl2 = var2[2];
            0;
            if (((0x29 ^ 0x1B) & ~(0xB ^ 0x39)) >= 3) {
                return ((0x5A ^ 0x44) & ~(0xB9 ^ 0xA7)) != 0;
            }
        } else {
            bl2 = var2[0];
        }
        if (as.var4((var24 = bl2) ? 1 : 0)) {
            WorldPoint var27 = Players.getLocal().getWorldLocation();
            List<WorldPoint> var28 = var25.bz();
            if (as.var4(var28.contains(var27) ? 1 : 0)) {
                WorldPoint var29 = var27.createWorldArea(var2[3]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (as.var13(var28.contains(worldPoint) ? 1 : 0)) {
                        bl2 = var2[2];
                        0;
                        if (((0xE7 ^ 0xC4) & ~(0x7A ^ 0x59)) < 0) {
                            return ((0xF ^ 0x43) & ~(0x70 ^ 0x3C)) != 0;
                        }
                    } else {
                        bl2 = var2[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var26))).orElse(null);
                if (as.var9(var29)) {
                    return var2[0];
                }
                Movement.setDestination((WorldPoint)var29);
                return var2[2];
            }
            if (as.var13(var26.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint var29 = var27.createWorldArea(var2[3]).toWorldPointList().stream().filter(worldPoint2 -> {
                    boolean bl2;
                    if (as.var13(worldPoint2.equals((Object)var27) ? 1 : 0)) {
                        bl2 = var2[2];
                        0;
                        if (((168 + 114 - 109 + 14 ^ 104 + 100 - 90 + 18) & (0x93 ^ 0xC6 ^ (0x53 ^ 0x39) ^ -1)) != 0) {
                            return ((0xF ^ 0x1C ^ (0x85 ^ 0xA7)) & (7 ^ 0x43 ^ (0xDE ^ 0xAB) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = var2[0];
                    }
                    return bl2;
                }).filter(Reachable::isWalkable).filter(worldPoint -> {
                    boolean bl2;
                    if (as.var13(var28.contains(worldPoint) ? 1 : 0)) {
                        bl2 = var2[2];
                        0;
                        if (2 != 2) {
                            return ((0xCA ^ 0xC7) & ~(9 ^ 4)) != 0;
                        }
                    } else {
                        bl2 = var2[0];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var26))).orElse(null);
                if (as.var9(var29)) {
                    return var2[0];
                }
                Movement.setDestination((WorldPoint)var29);
                return var2[2];
            }
        }
        SquireAutoTOA squireAutoTOA = var25.aY;
        if (as.var4(var24)) {
            n2 = var2[4];
            0;
            if (1 < 0) {
                return ((0xF7 ^ 0xB8 ^ 2) & (0x31 ^ 0x4A ^ (0x41 ^ 0x77) ^ -1)) != 0;
            }
        } else {
            n2 = var2[5];
        }
        squireAutoTOA.a(n2);
        var25.e(var24);
        0;
        var26.interact(var1[var2[0]]);
        if (as.var4(var26.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var25.di = var25.cu.getTickCount();
        }
        return var2[2];
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static void var16() {
        var2 = new int[13];
        as.var2[0] = (94 + 14 - -49 + 23 ^ 82 + 31 - -2 + 44) & (42 + 15 - 17 + 101 ^ 117 + 107 - 213 + 155 ^ -1);
        as.var2[1] = 0xFFFFAF77 & 0x7E9B;
        as.var2[2] = 1;
        as.var2[3] = 2;
        as.var2[4] = 8 ^ 0x75 ^ (0x3F ^ 0x58);
        as.var2[5] = 4 ^ 0x29;
        as.var2[6] = 0xFFFFBE7F & 0x6F9C;
        as.var2[7] = 45 + 80 - 30 + 60 ^ 19 + 131 - -5 + 4;
        as.var2[8] = -(0xFFFFEEBB & 0x37FF) & (0xFFFFE7FA & 0x3FBF);
        as.var2[9] = 3;
        as.var2[10] = 176 + 103 - 135 + 36 ^ 124 + 59 - 133 + 127;
        as.var2[11] = 0x48 ^ 0x4E;
        as.var2[12] = 0xA6 ^ 0x95 ^ (0x13 ^ 0x28);
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (as.var4(this.bw() ? 1 : 0)) {
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

