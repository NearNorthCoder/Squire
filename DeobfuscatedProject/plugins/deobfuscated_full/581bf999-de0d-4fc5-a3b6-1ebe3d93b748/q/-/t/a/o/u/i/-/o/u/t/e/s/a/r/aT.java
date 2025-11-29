/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class aT
extends ao {
    private static final /* synthetic */ int eq;
    private static /* synthetic */ String[] lIllIIlllIl;
    private static /* synthetic */ int[] lIllIlIIIII;

    private static boolean lIIlIllIlIllII(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlIllIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlIllIlIIIIl() {
        lIllIIlllIl = new String[lIllIlIIIII[21]];
        aT.lIllIIlllIl[aT.lIllIlIIIII[2]] = aT."Barrier";
        aT.lIllIIlllIl[aT.lIllIlIIIII[1]] = aT."Statue";
        aT.lIllIIlllIl[aT.lIllIlIIIII[4]] = aT."Quick-Pass";
        aT.lIllIIlllIl[aT.lIllIlIIIII[3]] = aT."Take";
        aT.lIllIIlllIl[aT.lIllIlIIIII[6]] = aT."Take";
        aT.lIllIIlllIl[aT.lIllIlIIIII[7]] = aT."Drop";
        aT.lIllIIlllIl[aT.lIllIlIIIII[8]] = aT."Entry";
        aT.lIllIIlllIl[aT.lIllIlIIIII[9]] = aT."Quick-Enter";
        aT.lIllIIlllIl[aT.lIllIlIIIII[10]] = aT."Venom pool";
        aT.lIllIIlllIl[aT.lIllIlIIIII[11]] = aT."Venom pool";
        aT.lIllIIlllIl[aT.lIllIlIIIII[12]] = aT."Eat";
        aT.lIllIIlllIl[aT.lIllIlIIIII[13]] = aT."hammer";
        aT.lIllIIlllIl[aT.lIllIlIIIII[14]] = aT."Hammers";
        aT.lIllIIlllIl[aT.lIllIlIIIII[15]] = aT."Anti";
        aT.lIllIIlllIl[aT.lIllIlIIIII[16]] = aT."hammer";
        aT.lIllIIlllIl[aT.lIllIlIIIII[17]] = aT."Statius";
        aT.lIllIIlllIl[aT.lIllIlIIIII[18]] = aT."Potions";
        aT.lIllIIlllIl[aT.lIllIlIIIII[19]] = aT."Anti";
        aT.lIllIIlllIl[aT.lIllIlIIIII[20]] = aT."Barrier";
    }

    private static String lIIlIllIIlllII(String var5, String var12) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIllIlIIIII[10]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllIlIIIII[4], var19);
            return new String(var18.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public int bi() {
        return lIllIlIIIII[0];
    }

    @Override
    public boolean bj() {
        boolean bl2;
        String[] stringArray = new String[lIllIlIIIII[1]];
        stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[2]];
        if (aT.lIIlIllIlIlIlI(TileObjects.getAll((String[])stringArray).size(), lIllIlIIIII[3])) {
            bl2 = lIllIlIIIII[1];
            0;
            
            }
        } else {
            bl2 = lIllIlIIIII[2];
        }
        return bl2;
    }

    @Inject
    protected aT(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public boolean bl() {
        TileObject var20;
        aT var16;
        String[] stringArray = new String[lIllIlIIIII[1]];
        stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[1]];
        TileObject tileObject3 = TileObjects.getNearest((String[])stringArray);
        TileObject tileObject4 = TileObjects.getNearest(tileObject2 -> {
            int n2;
            if (aT.lIIlIllIlIlllI(tileObject2.getWorldX(), tileObject3.getWorldX()) && aT.lIIlIllIlIllIl(tileObject2.getName().equals(lIllIIlllIl[lIllIlIIIII[20]]) ? 1 : 0) && aT.lIIlIllIlIllll(tileObject2.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                n2 = lIllIlIIIII[1];
                0;
                if (-2 >= 0) {
                    return false;
                }
            } else {
                n2 = lIllIlIIIII[2];
            }
            return n2 != 0;
        });
        if (aT.lIIlIllIlIllII(tileObject4)) {
            tileObject4.interact(lIllIIlllIl[lIllIlIIIII[4]]);
            return lIllIlIIIII[1];
        }
        int[] nArray = new int[lIllIlIIIII[1]];
        nArray[aT.lIllIlIIIII[2]] = lIllIlIIIII[5];
        if (aT.lIIlIllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (aT.lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
                var16.b(item -> {
                    boolean bl2;
                    if (aT.lIIlIllIlIlIll(item.getName().contains(lIllIIlllIl[lIllIlIIIII[19]]) ? 1 : 0)) {
                        bl2 = lIllIlIIIII[1];
                        0;
                        if (((125 + 68 - 80 + 64 ^ 18 + 9 - -79 + 34) & (0x7C ^ 0x3D ^ (8 ^ 0x74) ^ -1)) != 0) {
                            return ((0x14 ^ 0x45 ^ (0x4D ^ 0x52)) & (0x63 ^ 1 ^ (0x5A ^ 0x76) ^ -1)) != 0;
                        }
                    } else {
                        bl2 = lIllIlIIIII[2];
                    }
                    return bl2;
                });
                return lIllIlIIIII[1];
            }
            var20 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aT.lIIlIllIlIllIl(tileObject.getName().equals(lIllIIlllIl[lIllIlIIIII[18]]) ? 1 : 0) && aT.lIIlIllIlIllIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIllIlIIIII[1];
                    0;
                    if (-(130 + 88 - 131 + 66 ^ 85 + 37 - -25 + 9) >= 0) {
                        return ((0x33 ^ 0x28 ^ (0x2F ^ 0xA)) & (5 ^ 0x74 ^ (0xDE ^ 0x91) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIlIIIII[2];
                }
                return n2 != 0;
            });
            if (aT.lIIlIllIlIllII(var20)) {
                var20.interact(lIllIIlllIl[lIllIlIIIII[3]]);
                return lIllIlIIIII[1];
            }
        }
        if (aT.lIIlIllIlIlIll(Inventory.contains(item -> {
            int n2;
            if (aT.lIIlIllIlIllIl(item.getName().toLowerCase().contains(lIllIIlllIl[lIllIlIIIII[16]]) ? 1 : 0) && aT.lIIlIllIlIlIll(item.getName().contains(lIllIIlllIl[lIllIlIIIII[17]]) ? 1 : 0)) {
                n2 = lIllIlIIIII[1];
                0;
                if ((0x1F ^ 0x1B) == 0) {
                    return false;
                }
            } else {
                n2 = lIllIlIIIII[2];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (aT.lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
                var16.b(item -> {
                    boolean bl2;
                    if (aT.lIIlIllIlIlIll(item.getName().contains(lIllIIlllIl[lIllIlIIIII[15]]) ? 1 : 0)) {
                        bl2 = lIllIlIIIII[1];
                        0;
                        if (1 >= 3) {
                            return false;
                        }
                    } else {
                        bl2 = lIllIlIIIII[2];
                    }
                    return bl2;
                });
                return lIllIlIIIII[1];
            }
            var20 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aT.lIIlIllIlIllIl(tileObject.getName().equals(lIllIIlllIl[lIllIlIIIII[14]]) ? 1 : 0) && aT.lIIlIllIlIllIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIllIlIIIII[1];
                    0;
                    if (2 <= 0) {
                        return ((0xC1 ^ 0xBF ^ (0xFE ^ 0x8B)) & (0xF1 ^ 0xB4 ^ (0x13 ^ 0x5D) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIlIIIII[2];
                }
                return n2 != 0;
            });
            if (aT.lIIlIllIlIllII(var20)) {
                var20.interact(lIllIIlllIl[lIllIlIIIII[6]]);
                return lIllIlIIIII[1];
            }
        }
        if (aT.lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray2 = new int[lIllIlIIIII[1]];
            nArray2[aT.lIllIlIIIII[2]] = lIllIlIIIII[5];
            if ((!aT.lIIlIllIlIllIl(Inventory.contains((int[])nArray2) ? 1 : 0) || aT.lIIlIllIlIlIll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllIIlllIl[lIllIlIIIII[13]])) ? 1 : 0)) && aT.lIIlIllIlIllII(var20 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIIIII[1]];
                stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[12]];
                return item.hasAction(stringArray);
            }))) {
                var20.interact(lIllIIlllIl[lIllIlIIIII[7]]);
                return lIllIlIIIII[1];
            }
        }
        return this.bC();
    }

    private static boolean lIIlIllIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aT.lIIlIllIlIlIIl();
        aT.lIIlIllIlIIIIl();
        eq = lIllIlIIIII[0];
    }

    public abstract boolean bC();

    private static boolean lIIlIllIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIllIlIlIIl() {
        lIllIlIIIII = new int[22];
        aT.lIllIlIIIII[0] = -(0xFFFFB76F & 0x4CB6) & (0xFFFFBFFF & 0x7F77);
        aT.lIllIlIIIII[1] = 1;
        aT.lIllIlIIIII[2] = (0x24 ^ 0x7D) & ~(0x2A ^ 0x73);
        aT.lIllIlIIIII[3] = 3;
        aT.lIllIlIIIII[4] = 2;
        aT.lIllIlIIIII[5] = 0xFFFFFBB1 & 0x6EEF;
        aT.lIllIlIIIII[6] = 0x85 ^ 0x81;
        aT.lIllIlIIIII[7] = 0x7C ^ 0x2E ^ (2 ^ 0x55);
        aT.lIllIlIIIII[8] = 0x85 ^ 0x83;
        aT.lIllIlIIIII[9] = 0x20 ^ 0x27;
        aT.lIllIlIIIII[10] = 0x27 ^ 0x2F;
        aT.lIllIlIIIII[11] = 0xB0 ^ 0xB9;
        aT.lIllIlIIIII[12] = 3 ^ (0x22 ^ 0x2B);
        aT.lIllIlIIIII[13] = 0x5B ^ 0x2A ^ (0x71 ^ 0xB);
        aT.lIllIlIIIII[14] = 0x1D ^ 0x7A ^ (0x4F ^ 0x24);
        aT.lIllIlIIIII[15] = 0x6D ^ 0x60;
        aT.lIllIlIIIII[16] = 16 + 48 - -23 + 41 ^ 4 + 42 - 40 + 136;
        aT.lIllIlIIIII[17] = 74 + 84 - 79 + 63 ^ 50 + 112 - 118 + 85;
        aT.lIllIlIIIII[18] = 0xA3 ^ 0xB3;
        aT.lIllIlIIIII[19] = 0x44 ^ 0x55;
        aT.lIllIlIIIII[20] = 0x8A ^ 0xC2 ^ (0x74 ^ 0x2E);
        aT.lIllIlIIIII[21] = 0x60 ^ 0x73;
    }

    private static String lIIlIllIIlllIl(String var7, String var8) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIllIlIIIII[4], var11);
            return new String(var15.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bk() {
        boolean bl2;
        if (aT.lIIlIllIlIlIll(this.bj() ? 1 : 0)) {
            bl2 = lIllIlIIIII[1];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            bl2 = lIllIlIIIII[2];
        }
        return bl2;
    }

    private static boolean lIIlIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    protected boolean p(WorldPoint worldPoint) {
        boolean bl2;
        String[] stringArray = new String[lIllIlIIIII[1]];
        stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[11]];
        if (aT.lIIlIllIlIllII(TileObjects.getFirstAt((WorldPoint)worldPoint, (String[])stringArray))) {
            bl2 = lIllIlIIIII[1];
            0;
            if (1 == 0) {
                return false;
            }
        } else {
            bl2 = lIllIlIIIII[2];
        }
        return bl2;
    }

    public void g(WorldPoint worldPoint2) {
        this.a(worldPoint2, worldPoint -> lIllIlIIIII[1]);
    }

    @Override
    public boolean bn() {
        if (aT.lIIlIllIlIllIl(super.bn() ? 1 : 0)) {
            return lIllIlIIIII[1];
        }
        String[] stringArray = new String[lIllIlIIIII[1]];
        stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[8]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (aT.lIIlIllIlIllII(var3)) {
            var3.interact(lIllIIlllIl[lIllIlIIIII[9]]);
            return lIllIlIIIII[1];
        }
        return lIllIlIIIII[2];
    }

    protected WorldPoint c(WorldPoint worldPoint3, WorldPoint worldPoint4) {
        WorldArea worldArea = worldPoint3.toWorldArea().offset(lIllIlIIIII[4]);
        return worldArea.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (aT.lIIlIllIlIlIll(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = lIllIlIIIII[1];
                0;
                
                }
            } else {
                bl2 = lIllIlIIIII[2];
            }
            return bl2;
        }).filter(worldPoint2 -> {
            boolean bl2;
            if (aT.lIIlIllIlIlIll(worldPoint2.equals((Object)worldPoint3) ? 1 : 0)) {
                bl2 = lIllIlIIIII[1];
                0;
                
                }
            } else {
                bl2 = lIllIlIIIII[2];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint4))).orElse(worldPoint4);
    }

    @Override
    public void a(WorldPoint worldPoint2, Predicate<WorldPoint> predicate) {
        String[] stringArray = new String[lIllIlIIIII[1]];
        stringArray[aT.lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[10]];
        Set set = TileObjects.getAll((String[])stringArray).stream().map(Locatable::getWorldLocation).collect(Collectors.toSet());
        super.a(worldPoint2, worldPoint -> {
            int n2;
            if (aT.lIIlIllIlIlIll(set.contains(worldPoint) ? 1 : 0) && aT.lIIlIllIlIllIl(predicate.test((WorldPoint)worldPoint) ? 1 : 0)) {
                n2 = lIllIlIIIII[1];
                0;
                if (3 != 3) {
                    return ((0x16 ^ 0 ^ 3) & (0x71 ^ 0x6F ^ (0x12 ^ 0x19) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlIIIII[2];
            }
            return n2 != 0;
        });
    }

    private static String lIIlIllIIllllI(String var1, String var6) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var4 = var6.toCharArray();
        int var22 = lIllIlIIIII[2];
        char[] var17 = var1.toCharArray();
        int var13 = var17.length;
        int var14 = lIllIlIIIII[2];
        while (aT.lIIlIllIlIlllI(var14, var13)) {
            char var2 = var17[var14];
            var10.append((char)(var2 ^ var4[var22 % var4.length]));
            0;
            ++var22;
            ++var14;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }
}

