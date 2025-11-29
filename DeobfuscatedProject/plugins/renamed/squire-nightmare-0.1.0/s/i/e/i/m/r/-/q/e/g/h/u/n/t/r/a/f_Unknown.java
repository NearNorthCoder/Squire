/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.QEnum;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.REnum;

@Singleton
public class f_Unknown {
    private final /* synthetic */ ItemManager bt;
    private static final /* synthetic */ Logger bo;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ SquireNightmarePlugin bq;
    private final /* synthetic */ SquireNightmareConfig bp;
    private final /* synthetic */ int bs = 0;
    private static /* synthetic */ String[] llllIIlIlIlI;
    private final /* synthetic */ e br;
    public /* synthetic */ boolean bu;

    @Inject
    public f(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2, ItemManager itemManager) {
        this.bs = llllIIlIlIll[0];
        this.bu = llllIIlIlIll[0];
        this.bp = squireNightmareConfig;
        this.bq = squireNightmarePlugin;
        this.br = e2;
        this.bt = itemManager;
    }

    private static void lIIIlllllIIllIl() {
        llllIIlIlIll = new int[23];
        f.llllIIlIlIll[0] = (219 + 122 - 205 + 84 ^ 79 + 127 - 163 + 94) & (1 ^ 6 ^ (0x5D ^ 0xF) ^ -1);
        f.llllIIlIlIll[1] = 1;
        f.llllIIlIlIll[2] = 2;
        f.llllIIlIlIll[3] = 3;
        f.llllIIlIlIll[4] = 0x5A ^ 0x5E;
        f.llllIIlIlIll[5] = 89 + 91 - 91 + 59 ^ 39 + 0 - 33 + 139;
        f.llllIIlIlIll[6] = 0xC6 ^ 0x8E ^ (0x32 ^ 0x7C);
        f.llllIIlIlIll[7] = 4 ^ 0 ^ 3;
        f.llllIIlIlIll[8] = 0x43 ^ 0x4B;
        f.llllIIlIlIll[9] = 0xB4 ^ 0xBD;
        f.llllIIlIlIll[10] = 0x24 ^ 0x59 ^ (0xCA ^ 0xBD);
        f.llllIIlIlIll[11] = 0x3F ^ 0x34;
        f.llllIIlIlIll[12] = 39 + 7 - 24 + 117 ^ 121 + 21 - 132 + 125;
        f.llllIIlIlIll[13] = 2 ^ (0x38 ^ 0x37);
        f.llllIIlIlIll[14] = 0x23 ^ 0x18 ^ (0x23 ^ 0x40) & ~(0xD8 ^ 0xBB);
        f.llllIIlIlIll[15] = 0xFB ^ 0xB4;
        f.llllIIlIlIll[16] = 3 ^ 0x5F ^ (0x92 ^ 0xAF);
        f.llllIIlIlIll[17] = 0x4D ^ 0x66;
        f.llllIIlIlIll[18] = 0xE ^ 0;
        f.llllIIlIlIll[19] = 0xB ^ 4;
        f.llllIIlIlIll[20] = 0x63 ^ 0x73;
        f.llllIIlIlIll[21] = 0x3B ^ 0x10 ^ (0x76 ^ 0x4C);
        f.llllIIlIlIll[22] = 0x79 ^ 4 ^ (0x7C ^ 0x13);
    }

    private static String lIIIlllllIIlIlI(String var13, String var45) {
        try {
            SecretKeySpec var34 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var45.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[8]), "DES");
            Cipher var26 = Cipher.getInstance("DES");
            var26.init(llllIIlIlIll[2], var34);
            return new String(var26.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    public boolean aD() {
        return this.bu;
    }

    public int t() {
        Objects.requireNonNull(this);
        0;
        return llllIIlIlIll[0];
    }

    static {
        f.lIIIlllllIIllIl();
        f.lIIIlllllIIllII();
        bo = LoggerFactory.getLogger(f.class);
    }

    private static boolean lIIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    public SquireNightmareConfig ag() {
        return this.bp;
    }

    public String toString() {
        return "AttackManager(config=" + this.ag() + ", plugin=" + this.aB() + ", areaManager=" + this.aC() + ", lastAttack=" + this.t() + ", itemManager=" + this.L() + ", isMidFinalPhaseAttack=" + this.aD() + ")";
    }

    private static boolean lIIIlllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllllIIlIIl(String var3, String var39) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var39.toCharArray();
        int var41 = llllIIlIlIll[0];
        char[] var27 = var3.toCharArray();
        int var22 = var27.length;
        int var35 = llllIIlIlIll[0];
        while (f.lIIIlllllIlIllI(var35, var22)) {
            char var42 = var27[var35];
            var1.append((char)(var42 ^ var15[var41 % var15.length]));
            0;
            ++var41;
            ++var35;
            0;
            if (-(165 + 143 - 240 + 110 ^ 175 + 0 - 7 + 14) <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public SquireNightmarePlugin aB() {
        return this.bq;
    }

    private static void lIIIlllllIIllII() {
        llllIIlIlIlI = new String[llllIIlIlIll[22]];
        f.llllIIlIlIlI[f.llllIIlIlIll[0]] = f."unable to find a brew to free up to make room for swap. resorting to prayer pots or balms now...";
        f.llllIIlIlIlI[f.llllIIlIlIll[1]] = f."UNABLE TO MAKE SPACE FOR GEAR SWAP! ERRROR ERROR!";
        f.llllIIlIlIlI[f.llllIIlIlIll[2]] = f."[AttackManager]: Getting rid of {} to make space for switch.";
        f.llllIIlIlIlI[f.llllIIlIlIll[3]] = f."anglerfish";
        f.llllIIlIlIlI[f.llllIIlIlIll[4]] = f."Eat";
        f.llllIIlIlIlI[f.llllIIlIlIll[5]] = f."Correcting your noobness and setting your trident to LONGRANGE. BAD BOY FOR NOT READING THE GUIDE!";
        f.llllIIlIlIlI[f.llllIIlIlIll[6]] = f."Longrange";
        f.llllIIlIlIlI[f.llllIIlIlIll[7]] = f."Correcting your noobness and setting your ranged weapon to RAPID";
        f.llllIIlIlIlI[f.llllIIlIlIll[8]] = f."Rapid";
        f.llllIIlIlIlI[f.llllIIlIlIll[9]] = f."Correcting your noobness and setting your chins to RAPID";
        f.llllIIlIlIlI[f.llllIIlIlIll[10]] = f."Medium fuse";
        f.llllIIlIlIlI[f.llllIIlIlIll[11]] = f."player in shroom area, not attacking";
        f.llllIIlIlIlI[f.llllIIlIlIll[12]] = f."Attack";
        f.llllIIlIlIlI[f.llllIIlIlIll[13]] = f."Charge";
        f.llllIIlIlIlI[f.llllIIlIlIll[18]] = f."prayer potion";
        f.llllIIlIlIlI[f.llllIIlIlIll[19]] = f."balm";
        f.llllIIlIlIlI[f.llllIIlIlIll[20]] = f."brew";
        f.llllIIlIlIlI[f.llllIIlIlIll[21]] = f."Eat";
    }

    private static boolean lIIIlllllIlIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block35: {
            block36: {
                ItemManager var31;
                ItemManager var20;
                block34: {
                    f var9;
                    f var12;
                    block32: {
                        block33: {
                            e var2;
                            e var28;
                            block31: {
                                block29: {
                                    block30: {
                                        SquireNightmarePlugin var14;
                                        SquireNightmarePlugin var29;
                                        block28: {
                                            block26: {
                                                block27: {
                                                    SquireNightmareConfig var25;
                                                    SquireNightmareConfig var7;
                                                    block25: {
                                                        void var40;
                                                        if (f.lIIIlllllIlIlII(object, this)) {
                                                            return llllIIlIlIll[1];
                                                        }
                                                        if (f.lIIIlllllIlIIIl(var40 instanceof f)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        var12 = (f)var40;
                                                        if (f.lIIIlllllIlIIIl(var12.a(var9) ? 1 : 0)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        if (f.lIIIlllllIlIlIl(var9.t(), var12.t())) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        if (f.lIIIlllllIlIlIl(var9.aD() ? 1 : 0, var12.aD() ? 1 : 0)) {
                                                            return llllIIlIlIll[0];
                                                        }
                                                        var7 = var9.ag();
                                                        var25 = var12.ag();
                                                        if (!f.lIIIlllllIIlllI(var7)) break block25;
                                                        if (!f.lIIIlllllIIllll(var25)) break block26;
                                                        0;
                                                        
                                                        }
                                                        break block27;
                                                    }
                                                    if (!f.lIIIlllllIlIIIl(var7.equals(var25) ? 1 : 0)) break block26;
                                                }
                                                return llllIIlIlIll[0];
                                            }
                                            var29 = var9.aB();
                                            var14 = var12.aB();
                                            if (!f.lIIIlllllIIlllI((Object)var29)) break block28;
                                            if (!f.lIIIlllllIIllll((Object)var14)) break block29;
                                            0;
                                            if (3 <= 2) {
                                                return false;
                                            }
                                            break block30;
                                        }
                                        if (!f.lIIIlllllIlIIIl(((Object)((Object)var29)).equals((Object)var14) ? 1 : 0)) break block29;
                                    }
                                    return llllIIlIlIll[0];
                                }
                                var28 = var9.aC();
                                var2 = var12.aC();
                                if (!f.lIIIlllllIIlllI(var28)) break block31;
                                if (!f.lIIIlllllIIllll(var2)) break block32;
                                0;
                                if (((176 + 25 - 88 + 120 ^ 104 + 34 - 131 + 177) & (0xD1 ^ 0xA1 ^ (0x2E ^ 0xF) ^ -1)) > 3) {
                                    return ((0xC0 ^ 0x8E ^ (0xED ^ 0x9D)) & (16 + 3 - -50 + 90 ^ 16 + 38 - 50 + 157 ^ -1)) != 0;
                                }
                                break block33;
                            }
                            if (!f.lIIIlllllIlIIIl(((Object)var28).equals(var2) ? 1 : 0)) break block32;
                        }
                        return llllIIlIlIll[0];
                    }
                    var20 = var9.L();
                    var31 = var12.L();
                    if (!f.lIIIlllllIIlllI(var20)) break block34;
                    if (!f.lIIIlllllIIllll(var31)) break block35;
                    0;
                    if (-(83 + 125 - 113 + 75 ^ 30 + 168 - 185 + 161) >= 0) {
                        return ((0x32 ^ 0x5A ^ (0x4B ^ 0x33)) & (0x5A ^ 0x31 ^ (0x36 ^ 0x4D) ^ -1)) != 0;
                    }
                    break block36;
                }
                if (!f.lIIIlllllIlIIIl(var20.equals(var31) ? 1 : 0)) break block35;
            }
            return llllIIlIlIll[0];
        }
        return llllIIlIlIll[1];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(NPC nPC, EquipmentSetup equipmentSetup) {
        void var4;
        void var5;
        if (!f.lIIIlllllIIllll(nPC) || f.lIIIlllllIlIIII(nPC.isDead() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        if (f.lIIIlllllIIllll(var5) && f.lIIIlllllIlIIIl(var5.isFullyEquipped() ? 1 : 0)) {
            if (f.lIIIlllllIlIIII(Inventory.isFull() ? 1 : 0) && f.lIIIlllllIIllll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && f.lIIIlllllIlIIlI(var5.get(EquipmentInventorySlot.SHIELD))) {
                f var21;
                var21.aA();
                0;
            }
            var5.swap();
        }
        Widget var16 = Widgets.get((WidgetInfo)WidgetInfo.COMBAT_STYLE_FOUR);
        Widget var30 = Widgets.get((WidgetInfo)WidgetInfo.COMBAT_STYLE_TWO);
        if (f.lIIIlllllIlIIII(q.LONGRANGE.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.LONGRANGE.bj() ? 1 : 0) && (!f.lIIIlllllIlIIll((Object)p.bs(), (Object)r.TRIDENT_WEAPON) || f.lIIIlllllIlIlII((Object)p.bs(), (Object)r.TYPE_28)) && f.lIIIlllllIIllll(var16)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[5]]);
            var16.interact(llllIIlIlIlI[llllIIlIlIll[6]]);
        }
        if (f.lIIIlllllIlIIII(q.RAPID.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.RAPID.bj() ? 1 : 0) && f.lIIIlllllIIllll(var30)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[7]]);
            var30.interact(llllIIlIlIlI[llllIIlIlIll[8]]);
        }
        if (f.lIIIlllllIlIIII(q.MEDIUM_FUSE.bk() ? 1 : 0) && f.lIIIlllllIlIIIl(q.MEDIUM_FUSE.bj() ? 1 : 0) && f.lIIIlllllIIllll(var30)) {
            Tabs.open((Tab)Tab.COMBAT);
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[9]]);
            var30.interact(llllIIlIlIlI[llllIIlIlIll[10]]);
        }
        if (f.lIIIlllllIlIIIl(e.ax().isEmpty() ? 1 : 0)) {
            List<WorldArea> var32 = e.ax();
            WorldPoint var6 = Players.getLocal().getWorldLocation();
            if (f.lIIIlllllIlIIII(var32.stream().anyMatch(worldArea -> worldArea.contains(var6)) ? 1 : 0)) {
                Log.info((String)llllIIlIlIlI[llllIIlIlIll[11]]);
                return llllIIlIlIll[0];
            }
        }
        if (f.lIIIlllllIlIlII(Players.getLocal().getInteracting(), var4)) {
            return llllIIlIlIll[0];
        }
        String[] stringArray = new String[llllIIlIlIll[2]];
        stringArray[f.llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[12]];
        stringArray[f.llllIIlIlIll[1]] = llllIIlIlIlI[llllIIlIlIll[13]];
        nPC.interact(stringArray);
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIlIIlI(int n2) {
        return n2 <= 0;
    }

    public ItemManager L() {
        return this.bt;
    }

    protected boolean a(Object object) {
        return object instanceof f;
    }

    private static boolean lIIIlllllIIllll(Object object) {
        return object != null;
    }

    private static boolean lIIIlllllIlIIII(int n2) {
        return n2 != 0;
    }

    public e aC() {
        return this.br;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aA() {
        void var17;
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIlIlIll[1]];
            stringArray[f.llllIIlIlIll[0]] = llllIIlIlIlI[llllIIlIlIll[21]];
            return item.hasAction(stringArray);
        });
        if (f.lIIIlllllIIlllI(item2)) {
            Item item3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[20]]));
            if (f.lIIIlllllIIllll(item3)) {
                item3.drop();
                return llllIIlIlIll[1];
            }
            Log.warn((String)llllIIlIlIlI[llllIIlIlIll[0]]);
            Item var43 = Inventory.getFirst(item -> {
                boolean bl;
                if (!f.lIIIlllllIlIIIl(item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[18]]) ? 1 : 0) || f.lIIIlllllIlIIII(item.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[19]]) ? 1 : 0)) {
                    bl = llllIIlIlIll[1];
                    0;
                    if (((146 + 177 - 141 + 7 ^ 75 + 129 - 159 + 91) & (108 + 114 - 164 + 105 ^ 72 + 128 - 165 + 115 ^ -1)) < 0) {
                        return ((89 + 58 - -33 + 10 ^ 36 + 14 - -65 + 19) & (0x50 ^ 0x4B ^ (0xB1 ^ 0x92) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIIlIlIll[0];
                }
                return bl;
            });
            if (f.lIIIlllllIIllll(var43)) {
                var43.drop();
                return llllIIlIlIll[1];
            }
            Log.error((String)llllIIlIlIlI[llllIIlIlIll[1]]);
            return llllIIlIlIll[0];
        }
        Object[] objectArray = new Object[llllIIlIlIll[1]];
        objectArray[f.llllIIlIlIll[0]] = var17.getName();
        Log.info((String)llllIIlIlIlI[llllIIlIlIll[2]], (Object[])objectArray);
        if (f.lIIIlllllIlIIII(var17.getName().toLowerCase().contains(llllIIlIlIlI[llllIIlIlIll[3]]) ? 1 : 0)) {
            var17.interact(llllIIlIlIlI[llllIIlIlIll[4]]);
            0;
            if (((0x87 ^ 0x83) & ~(0x9D ^ 0x99)) != 0) {
                return false;
            }
        } else {
            var17.drop();
        }
        return llllIIlIlIll[1];
    }

    private static boolean lIIIlllllIIlllI(Object object) {
        return object == null;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        f var38;
        int n6;
        int n7 = llllIIlIlIll[14];
        int n8 = llllIIlIlIll[1];
        n8 = n8 * llllIIlIlIll[14] + this.t();
        int n9 = n8 * llllIIlIlIll[14];
        if (f.lIIIlllllIlIIII(this.aD() ? 1 : 0)) {
            n6 = llllIIlIlIll[15];
            0;
            
            }
        } else {
            n6 = llllIIlIlIll[16];
        }
        int var18 = n9 + n6;
        SquireNightmareConfig var36 = var38.ag();
        int n10 = var18 * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(var36)) {
            n5 = llllIIlIlIll[17];
            0;
            if (1 < ((0x99 ^ 0xB8) & ~(0x3F ^ 0x1E))) {
                return (0x18 ^ 0x11) & ~(0x32 ^ 0x3B);
            }
        } else {
            n5 = var36.hashCode();
        }
        var18 = n10 + n5;
        SquireNightmarePlugin var37 = var38.aB();
        int n11 = var18 * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI((Object)var37)) {
            n4 = llllIIlIlIll[17];
            0;
            if (((0x83 ^ 0xA1) & ~(0x24 ^ 6)) > ((0x29 ^ 0x21) & ~(0xAE ^ 0xA6))) {
                return (7 ^ 0x33) & ~(0x65 ^ 0x51);
            }
        } else {
            n4 = ((Object)((Object)var37)).hashCode();
        }
        var18 = n11 + n4;
        e var33 = var38.aC();
        int n12 = var18 * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(var33)) {
            n3 = llllIIlIlIll[17];
            0;
            if (-1 != -1) {
                return (0xAE ^ 0xA0 ^ (0xA0 ^ 0x8A)) & (0xE ^ 0x7A ^ (0x38 ^ 0x68) ^ -1);
            }
        } else {
            n3 = ((Object)var33).hashCode();
        }
        var18 = n12 + n3;
        ItemManager var11 = var38.L();
        int n13 = var18 * llllIIlIlIll[14];
        if (f.lIIIlllllIIlllI(var11)) {
            n2 = llllIIlIlIll[17];
            0;
            if (((0xB8 ^ 0xB5 ^ (0x84 ^ 0xBB)) & (0xC8 ^ 0x9A ^ (0x3A ^ 0x5A) ^ -1)) < ((118 + 30 - -68 + 35 ^ 48 + 133 - 125 + 108) & (0x39 ^ 0x20 ^ (0x54 ^ 0x12) ^ -1))) {
                return (91 + 167 - 108 + 46 ^ 145 + 118 - 156 + 47) & (0xCB ^ 0xA0 ^ (0x18 ^ 0x2D) ^ -1);
            }
        } else {
            n2 = var11.hashCode();
        }
        n8 = n13 + n2;
        return n8;
    }

    public void u(boolean bl) {
        this.bu = bl;
    }

    private static boolean lIIIlllllIlIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlllllIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIlllllIIlIll(String var44, String var8) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(llllIIlIlIll[2], var24);
            return new String(var19.doFinal(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

