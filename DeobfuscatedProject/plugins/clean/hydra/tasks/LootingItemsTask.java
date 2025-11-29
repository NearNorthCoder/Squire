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
package gg.squire.hydra.tasks;

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
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.CHelper;
import gg.squire.hydra.tasks.AlchingItemsTask;

@TaskDesc(name="Looting Items", priority=10, blocking=true, register=true)
public class LootingItemsTask
extends Task {
    
    private final  SquireAlchemicalHydraConfig ba;
    private final  Set<TileItem> bb;
    private final  a aY;
    private final  c aZ;

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

        return String.valueOf(var1);
    }

    private static boolean lIIIllllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllIllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllllIlIllll() {
        llllIIIllllI = new String[llllIIIlllll[27]];
        A.llllIIIllllI[A.llllIIIlllll[0]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[3]] = "Drop";
        A.llllIIIllllI[A.llllIIIlllll[5]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[6]] = "Drop";
        A.llllIIIllllI[A.llllIIIlllll[8]] = "Take";
        A.llllIIIllllI[A.llllIIIlllll[13]] = "Hydra";
        A.llllIIIllllI[A.llllIIIlllll[2]] = "bones";
        A.llllIIIllllI[A.llllIIIlllll[14]] = "Bury";
        A.llllIIIllllI[A.llllIIIlllll[15]] = "Empty";
        A.llllIIIllllI[A.llllIIIlllll[16]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[4]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[17]] = "Empty";
        A.llllIIIllllI[A.llllIIIlllll[18]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[19]] = "Bury";
        A.llllIIIllllI[A.llllIIIlllll[20]] = "Eat";
        A.llllIIIllllI[A.llllIIIlllll[21]] = "Super restore";
        A.llllIIIllllI[A.llllIIIlllll[22]] = "ranging potion";
        A.llllIIIllllI[A.llllIIIlllll[23]] = "bastion potion";
        A.llllIIIllllI[A.llllIIIlllll[24]] = "ranging";
        A.llllIIIllllI[A.llllIIIlllll[25]] = "restore";
        A.llllIIIllllI[A.llllIIIlllll[1]] = "Prayer";
        A.llllIIIllllI[A.llllIIIlllll[26]] = "Eat";
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
    public LootingItemsTask(a a2, c c2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.bb = new HashSet<TileItem>();
        this.aY = a2;
        this.aZ = c2;
        this.ba = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem ap() {
        void var2;
        A var3;
        TileItem tileItem = this.aZ.p().orElse(null);
        if (A.lIIIllllIllIllI(tileItem)) {
            return null;
        }
        if (A.lIIIllllIlllIIl(var3.aZ.a((TileItem)var2), llllIIIlllll[12])) {
            return var2;
        }
        if (A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) {
            return var3.aZ.q().orElse((TileItem)var2);
        }
        return tileItem;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (A.lIIIllllIlllIIl(tileItem.getId(), llllIIIlllll[7])) {
            this.bb.add(tileItem);

        }
    }

    private TileItem an() {
        int[] nArray = new int[llllIIIlllll[3]];
        nArray[A.llllIIIlllll[0]] = llllIIIlllll[11];
        return TileItems.getNearest((int[])nArray);
    }

    private static  boolean a(boolean bl, Predicate predicate, TileItem tileItem) {
        boolean bl2;
        if (!A.lIIIllllIllIlll(bl ? 1 : 0) || A.lIIIllllIllIIIl(predicate.test(tileItem.getName()) ? 1 : 0)) {
            bl2 = llllIIIlllll[3];

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
        TileItem var4;
        A var5;
        block25: {
            TileItem var6;
            block26: {
                TileItem var7;
                if (A.lIIIllllIllIIIl(this.aY.g() ? 1 : 0)) {
                    return llllIIIlllll[0];
                }
                if (A.lIIIllllIllIIlI(var5.aY.k())) {
                    return llllIIIlllll[0];
                }
                var4 = var7 = var5.al();
                if (A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[1]) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[26]];
                    return item.hasAction(stringArray);
                }) ? 1 : 0)) {
                    var4 = var5.am();

                    if ((0xC6 ^ 0xC2) == 0) {
                        return false;
                    }
                } else if (A.lIIIllllIllIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), var5.ba.restorePrayAt()) && A.lIIIllllIllIIIl(Inventory.contains(item -> {
                    int n2;
                    if (!A.lIIIllllIllIIIl(item.getName().contains(llllIIIllllI[llllIIIlllll[25]]) ? 1 : 0) || A.lIIIllllIllIlll(item.getName().contains(llllIIIllllI[llllIIIlllll[1]]) ? 1 : 0)) {
                        n2 = llllIIIlllll[3];

                        if (3 > 3) {
                            return (1 & (1 ^ -1)) != 0;
                        }
                    } else {
                        n2 = llllIIIlllll[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var4 = var5.an();

                    if (((0x79 ^ 0x7F ^ (0x5A ^ 0x53)) & (0x68 ^ 0x12 ^ (0x6C ^ 0x19) ^ -1)) > 3) {
                        return ((59 + 110 - 36 + 116 ^ 32 + 111 - 73 + 128) & (0x3F ^ 0x5D ^ (0x39 ^ 0x64) ^ -1)) != 0;
                    }
                } else if (A.lIIIllllIllIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), llllIIIlllll[2]) && A.lIIIllllIllIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llllIIIllllI[llllIIIlllll[24]])) ? 1 : 0)) {
                    var4 = var5.aj();

                    if (2 == ((0x64 ^ 0x68) & ~(6 ^ 0xA))) {
                        return false;
                    }
                } else if (A.lIIIllllIllIllI(var7)) {
                    var4 = var5.ak();
                }
                if (A.lIIIllllIllIllI(var4)) {
                    var6 = string -> {
                        boolean bl;
                        if (!A.lIIIllllIllIIIl(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[22]]) ? 1 : 0) || A.lIIIllllIllIlll(string.toLowerCase().contains(llllIIIllllI[llllIIIlllll[23]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];

                            if (((0xBC ^ 0x82) & ~(0xBC ^ 0x82)) >= 2) {
                                return false;
                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    };
                    boolean var8 = Inventory.contains(item -> var6.test(item.getName()));
                    var4 = TileItems.getAll().stream().filter(arg_0 -> A.a(var8, (Predicate)var6, arg_0)).filter(tileItem -> {
                        boolean bl;
                        if (A.lIIIllllIllIIIl(tileItem.getName().startsWith(llllIIIllllI[llllIIIlllll[21]]) ? 1 : 0)) {
                            bl = llllIIIlllll[3];

                            }
                        } else {
                            bl = llllIIIlllll[0];
                        }
                        return bl;
                    }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
                }
                if (A.lIIIllllIllIllI(var4)) {
                    return llllIIIlllll[0];
                }
                var6 = var5.ao();
                if (A.lIIIllllIllIIlI(var6)) {
                    var4 = var6;
                }
                if (!A.lIIIllllIllIlll(Inventory.isFull() ? 1 : 0)) break block25;
                if (!A.lIIIllllIllIlll(var4.isStackable() ? 1 : 0)) break block26;
                int[] nArray = new int[llllIIIlllll[3]];
                nArray[A.llllIIIlllll[0]] = var4.getId();
                if (!A.lIIIllllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
            }
            Stream stream = y.aU.stream();
            String string2 = var4.getName();
            Objects.requireNonNull(string2);

            if (!A.lIIIllllIllIIIl(stream.anyMatch(string2::contains) ? 1 : 0) || !A.lIIIllllIllIIIl(var4.isNoted() ? 1 : 0) || A.lIIIllllIllIlll(var4.isStackable() ? 1 : 0)) {
                Item var8 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[3]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[20]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIIlI(var8) && A.lIIIllllIllIIll(Combat.getMissingHealth(), llllIIIlllll[4])) {
                    var8.interact(llllIIIllllI[llllIIIlllll[0]]);
                    return llllIIIlllll[3];
                }
                Item var9 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllIIIlllll[5]];
                    stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[18]];
                    stringArray[A.llllIIIlllll[3]] = llllIIIllllI[llllIIIlllll[19]];
                    return item.hasAction(stringArray);
                });
                if (A.lIIIllllIllIllI(var9)) {
                    var9 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[llllIIIlllll[3]];
                        stringArray[A.llllIIIlllll[0]] = llllIIIllllI[llllIIIlllll[17]];
                        return item.hasAction(stringArray);
                    });
                }
                var9.interact(llllIIIllllI[llllIIIlllll[3]]);
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
            if (A.lIIIllllIlllIII(var4, var6)) {
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
        if (A.lIIIllllIlllIIl(var4.getId(), llllIIIlllll[7]) && A.lIIIllllIllIIIl(var5.bb.contains(var4) ? 1 : 0)) {
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

            return stream.anyMatch(string::contains);
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
    }
}

