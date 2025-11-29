/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.c_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.AlchingItemsTask;

/* TASK: Looting Items -> LootingTask */
@TaskDesc(name="Looting Items", priority=10, blocking=true, register=true)
public class LootingItemsTask
extends Task {
    private static /* synthetic */ int[] llllIIIlllll;
    private final /* synthetic */ SquireAlchemicalHydraConfig ba;
    private final /* synthetic */ Set<TileItem> bb;
    private final /* synthetic */ a aY;
    private final /* synthetic */ c aZ;
    private static /* synthetic */ String[] llllIIIllllI;

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem tileItem = itemDespawned.getItem();
        if (A.lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7])) {
            this.bb.clear();
        }
    }

    private static boolean lIIIllllIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIllIllI(Object object) {
        return object == null;
    }

    private static String lIIIllllIlIllII(String var9, String var7) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var1 = var7.toCharArray();
        int var20 = llllIIIlllll[0];
        char[] var27 = var9.toCharArray();
        int var11 = var27.length;
        int var26 = llllIIIlllll[0];
        while (A.lIIIllllIllIlII(var26, var11)) {
            char var2 = var27[var26];
            var19.append((char)(var2 ^ var1[var20 % var1.length]));
            0;
            ++var20;
            ++var26;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIIllllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIllllIlIlllI(String var4, String var21) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), llllIIIlllll[15]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llllIIIlllll[5], var24);
            return new String(var12.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllllIlIllll() {
        llllIIIllllI = new String[llllIIIlllll[27]];
        A.llllIIIllllI[A.llllIIIlllll[0]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[3]] = A."Drop";
        A.llllIIIllllI[A.llllIIIlllll[5]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[6]] = A."Drop";
        A.llllIIIllllI[A.llllIIIlllll[8]] = A."Take";
        A.llllIIIllllI[A.llllIIIlllll[13]] = A."Hydra";
        A.llllIIIllllI[A.llllIIIlllll[2]] = A."bones";
        A.llllIIIllllI[A.llllIIIlllll[14]] = A."Bury";
        A.llllIIIllllI[A.llllIIIlllll[15]] = A."Empty";
        A.llllIIIllllI[A.llllIIIlllll[16]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[4]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[17]] = A."Empty";
        A.llllIIIllllI[A.llllIIIlllll[18]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[19]] = A."Bury";
        A.llllIIIllllI[A.llllIIIlllll[20]] = A."Eat";
        A.llllIIIllllI[A.llllIIIlllll[21]] = A."Super restore";
        A.llllIIIllllI[A.llllIIIlllll[22]] = A."ranging potion";
        A.llllIIIllllI[A.llllIIIlllll[23]] = A."bastion potion";
        A.llllIIIllllI[A.llllIIIlllll[24]] = A."ranging";
        A.llllIIIllllI[A.llllIIIlllll[25]] = A."restore";
        A.llllIIIllllI[A.llllIIIlllll[1]] = A."Prayer";
        A.llllIIIllllI[A.llllIIIlllll[26]] = A."Eat";
    }

    private TileItem aj() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[9];
        return TileItems.getNearest((int[])nArray);
    }

    private TileItem ao() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.lIIIllllIllIlll(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[13]]) ? 1 : 0) && A.lIIIllllIllIIIl(tileItem.getName().contains(llllIIIllllI[llllIIIlllll[2]]) ? 1 : 0)) {
                n2 = llllIIIlllll[3];
                0;
                if (3 != 3) {
                    return false;
                }
            } else {
                n2 = llllIIIlllll[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIIIllllIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllllIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private TileItem am() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[10];
        return TileItems.getNearest((int[])nArray);
    }

    private static boolean lIIIllllIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public A(a a2, c c2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.bb = new HashSet<TileItem>();
        this.aY = a2;
        this.aZ = c2;
        this.ba = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem ap() {
        void var18;
        A var23;
        TileItem tileItem = this.aZ.p().orElse(null);
        if (A.lIIIllllIllIllI(tileItem)) {
            return null;
        }
        if (A.lIIIllllIlllIIl(var23.aZ.a((TileItem)var18), llllIIIlllll[12])) {
            return var18;
        }
        if (A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) {
            return var23.aZ.q().orElse((TileItem)var18);
        }
        return tileItem;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (A.lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7])) {
            this.bb.add(tileItem);
            0;
        }
    }

    private static void lIIIllllIllIIII() {
        llllIIIlllll = new int[28];
        A.llllIIIlllll[0] = (0x19 ^ 0x3B) & ~(0x36 ^ 0x14);
        A.llllIIIlllll[1] = 0x97 ^ 0x83;
        A.llllIIIlllll[2] = 111 + 57 - 38 + 25 ^ 123 + 69 - 96 + 61;
        A.llllIIIlllll[3] = 1;
        A.llllIIIlllll[4] = 0x16 ^ 0x1C;
        A.llllIIIlllll[5] = 2;
        A.llllIIIlllll[6] = 3;
        A.llllIIIlllll[7] = -(0xFFFFDD5D & 0x2EBF) & (0xFFFFFFFF & 0xFFF);
        A.llllIIIlllll[8] = 0x9D ^ 0x99;
        A.llllIIIlllll[9] = 5 + 13 - -73 + 78;
        A.llllIIIlllll[10] = 0xFFFFCDED & 0x3393;
        A.llllIIIlllll[11] = 0xFFFFEBFB & 0x1FD6;
        A.llllIIIlllll[12] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        A.llllIIIlllll[13] = 3 ^ 6;
        A.llllIIIlllll[14] = 0x12 ^ 0x15;
        A.llllIIIlllll[15] = 0x32 ^ 0x7E ^ (0x3C ^ 0x78);
        A.llllIIIlllll[16] = 0xAE ^ 0x98 ^ (0x42 ^ 0x7D);
        A.llllIIIlllll[17] = 0x9A ^ 0x91;
        A.llllIIIlllll[18] = 0x58 ^ 0x54;
        A.llllIIIlllll[19] = 170 + 123 - 93 + 5 ^ 88 + 117 - 31 + 18;
        A.llllIIIlllll[20] = 6 + 131 - 124 + 149 ^ 48 + 101 - 62 + 85;
        A.llllIIIlllll[21] = 0xA4 ^ 0xAB;
        A.llllIIIlllll[22] = 121 + 98 - 106 + 45 ^ 11 + 12 - 5 + 124;
        A.llllIIIlllll[23] = 0x1B ^ 0xA;
        A.llllIIIlllll[24] = 0xB1 ^ 0xA3;
        A.llllIIIlllll[25] = 0x14 ^ 0x26 ^ (0x92 ^ 0xB3);
        A.llllIIIlllll[26] = 0xB9 ^ 0xAC;
        A.llllIIIlllll[27] = 0xEA ^ 0xAE ^ (0x39 ^ 0x6B);
    }

    private static String lIIIllllIlIllIl(String var22, String var10) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llllIIIlllll[5], var8);
            return new String(var15.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private TileItem an() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[11];
        return TileItems.getNearest((int[])nArray);
    }

    private static /* synthetic */ boolean a(boolean bl, Predicate predicate, TileItem tileItem) {
        boolean bl2;
        if (!A.lIIIllllIllIlll(bl ? 1 : 0) || A.lIIIllllIllIIIl(predicate.test(tileItem.getName()) ? 1 : 0)) {
            bl2 = llllIIIlllll[3];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            bl2 = llllIIIlllll[0];
        }
        return bl2;
    }

    private TileItem al() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.lIIIllllIllIlll(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[llllIIIlllll[3]];
                nArray[A.llllIIIlllll[0]] = tileItem.getId();
                if (A.lIIIllllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = llllIIIlllll[3];
                    0;
                    if (2 >= ((0x21 ^ 0xF ^ (0xB8 ^ 0xC1)) & (12 + 197 - 57 + 91 ^ 61 + 102 - 72 + 73 ^ -1))) return n2 != 0;
                    return ((0x24 ^ 0x45 ^ (0x7E ^ 0x2F)) & (182 + 115 - 290 + 239 ^ 78 + 193 - 139 + 66 ^ -1)) != 0;
                }
            }
            n2 = llllIIIlllll[0];
            return n2 != 0;
        });
    }

    private static boolean lIIIllllIllIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem var6;
        A var13;
        block25: {
            TileItem var3;
            block26: {
                TileItem var14;
                if (A.lIIIllllIllIIIl(this.aY.g() ? 1 : 0)) {
                    return llllIIIlllll[0];
                }
                if (A.lIIIllllIllIIlI(var13.aY.k())) {
                    return llllIIIlllll[0];
                }
                var6 = var14 = var13.al();
                if (A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[26]];
                    return item.hasAction(stringArray);
                }) ? 1 : 0)) {
                    var6 = var13.am();
                    0;
                    if ((0xC6 ^ 0xC2) == 0) {
                        return false;
                    }
                } else if (A.lIIIllllIllIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), var13.ba.restorePrayAt()) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    int n2;
                    if (!A.lIIIllllIllIIIl(item.getName().contains(llllIIIllllI[llllIIIlllll[25]]) ? 1 : 0) || A.lIIIllllIllIlll(item.getName().contains(llllIIIllllI[llllIIIlllll[1]]) ? 1 : 0)) {
                        n2 = llllIIIlllll[3];
                        0;
                        if (3 > 3) {
                            return (1 & (1 ^ -1)) != 0;
                        }
                    } else {
                        n2 = llllIIIlllll[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var6 = var13.an();
                    0;
                    if (((0x79 ^ 0x7F ^ (0x5A ^ 0x53)) & (0x68 ^ 0x12 ^ (0x6C ^ 0x19) ^ -1)) > 3) {
                        return ((59 + 110 - 36 + 116 ^ 32 + 111 - 73 + 128) & (0x3F ^ 0x5D ^ (0x39 ^ 0x64) ^ -1)) != 0;
                    }
                } else if (A.lIIIllllIllIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), llllIIIlllll[2]) && A.lIIIllllIllIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llllIIIllllI[llllIIIlllll[24]])) ? 1 : 0)) {
                    var6 = var13.aj();
                    0;
                    if (2 == ((0x64 ^ 0x68) & ~(6 ^ 0xA))) {
                        return false;
                    }
                } else if (A.lIIIllllIllIllI(var14)) {
                    var6 = var13.ak();
                }
                if (A.lIIIllllIllIllI(var6)) {
                    var3 = string -> {
                        boolean bl;
                        if (!A.lIIIllllIllIIIl(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[22]]) ? 1 : 0) || A.lIIIllllIllIlll(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[23]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];
                            0;
                            if (((0xBC ^ 0x82) & ~(0xBC ^ 0x82)) >= 2) {
                                return false;
                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    };
                    boolean var17 = Inventory.contains(item -> var3.test(item.getName()));
                    var6 = TileItems.getAll().stream().filter(arg_0 -> A.a(var17, (Predicate)var3, arg_0)).filter(tileItem -> {
                        boolean bl;
                        if (A.lIIIllllIllIIIl(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[21]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];
                            0;
                            
                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
                }
                if (A.lIIIllllIllIllI(var6)) {
                    return llllIIIlllll[0];
                }
                var3 = var13.ao();
                if (A.lIIIllllIllIIlI(var3)) {
                    var6 = var3;
                }
                if (!A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) break block25;
                if (!A.lIIIllllIllIlll(var6.isStackable() ? 1 : 0)) break block26;
                int[] nArray = new int[llllIIIlllll[3]];
                nArray[A.llllIIIlllll[0]] = var6.getId();
                if (!A.lIIIllllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
            }
            Stream stream = y.aU.stream();
            String string2 = var6.getName();
            Objects.requireNonNull(string2);
            0;
            if (!A.lIIIllllIllIIIl(stream.anyMatch(string2::contains) ? 1 : 0) || !A.lIIIllllIllIIIl(var6.isNoted() ? 1 : 0) || A.lIIIllllIllIlll(var6.isStackable() ? 1 : 0)) {
                Item var17 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[20]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIIlI(var17) && A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[4])) {
                    var17.interact(llllIIIllllI[llllIIIlllll[0]]);
                    return llllIIIlllll[3];
                }
                Item var25 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[5]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[18]];
                    stringArray[A.llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[19]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIllI(var25)) {
                    var25 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[llllIIIlllll[3]];
                        stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[17]];
                        return item.hasAction(stringArray);
                    });
                }
                var25.interact(llllIIIllllI[llllIIIlllll[3]]);
                return llllIIIlllll[3];
            }
            if (A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && A.lIIIllllIllIlll(Inventory.contains(item -> {
                String[] stringArray = new String[llllIIIlllll[3]];
                stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[4]];
                return item.hasAction(stringArray);
            }) ? 1 : 0)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[16]];
                    return item.hasAction(stringArray);
                }).interact(llllIIIllllI[llllIIIlllll[5]]);
                return llllIIIlllll[3];
            }
            if (A.lIIIllllIlllIII(var6, var3)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[5]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[14]];
                    stringArray[A.llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[15]];
                    return item.hasAction(stringArray);
                }).interact(llllIIIllllI[llllIIIlllll[6]]);
                return llllIIIlllll[3];
            }
            return llllIIIlllll[0];
        }
        if (A.lIIIllllIlllIIl(var6.getId(), llllIIIlllll[7]) && A.lIIIllllIllIIIl(var13.bb.contains(var6) ? 1 : 0)) {
            return llllIIIlllll[0];
        }
        var2_2.interact(llllIIIllllI[llllIIIlllll[8]]);
        return llllIIIlllll[3];
    }

    static {
        A.lIIIllllIllIIII();
        A.lIIIllllIlIllll();
    }

    private TileItem ak() {
        return TileItems.getAll().stream().filter(tileItem -> {
            Stream stream = y.aU.stream();
            String string = tileItem.getName();
            Objects.requireNonNull(string);
            0;
            return stream.anyMatch(string::contains);
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
    }
}

