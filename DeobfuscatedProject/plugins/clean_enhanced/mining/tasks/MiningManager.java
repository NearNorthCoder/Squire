/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Set;
import gg.squire.mining.tasks.GameEnum7;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@Singleton
public class MiningManager {
    private final  Client aA;
    private static final  int aw;
    public static final  Set<Integer> av;
    private static final  int ay;
    private static final  int ax;
    private  boolean aD;

    private  int aB;
    private  int aC;
    private static final  Set<Integer> az;

    private static void var3() {
        var1 = new String[var2[23]];
        T.var1[T.var2[0]] = "Some ore is ready";
        T.var1[T.var2[1]] = "Ore vein";
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        int var5;
        T var6;
        void var7;
        Actor actor = animationChanged.getActor();
        if (T.var8(actor instanceof NPC)) {
            return;
        }
        Player var9 = (Player)var7;
        if (T.var10(var9, var6.aA.getLocalPlayer()) && T.var11(var5 = var9.getAnimation(), var2[7])) {
            var6.aB = var6.aC;
            var6.aC = var2[0];
            var6.aD = var6.G();
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    public boolean G() {
        boolean bl;
        if (T.var12(this.D(), this.H())) {
            bl = var2[1];
            0;
            if (1 <= 0) {
                return ((52 + 168 - 152 + 175 ^ 53 + 144 - 102 + 80) & (0x38 ^ 0x3D ^ (0xEA ^ 0xB3) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public void a(boolean bl) {
        this.aD = bl;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    public boolean J() {
        int n2;
        T var14;
        if (T.var15(this.M())) {
            return var2[0];
        }
        if (T.var8(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[var2[1]];
            nArray[T.var2[0]] = var2[2];
            if (T.var8(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return var2[1];
            }
        }
        if (T.var4(var14.M(), var2[1]) && T.var8(Inventory.isFull() ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (-3 > 0) {
                return ((0xAE ^ 0xBF) & ~(0xD0 ^ 0xC1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public boolean O() {
        return this.aD;
    }

    public int N() {
        return this.aC;
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void var23() {
        var2 = new int[26];
        T.var2[0] = (0x65 ^ 0x34) & ~(0x44 ^ 0x15);
        T.var2[1] = 1;
        T.var2[2] = -(0xFFFF9A8F & 0x7571) & (0xFFFFFEFB & 0x3FEF);
        T.var2[3] = -(0xFFFFAEF9 & 0x7947) & (0xFFFFBFFE & 0x7DF5);
        T.var2[4] = 0xFFFFB5F6 & 0x5FBF;
        T.var2[5] = (0x2F ^ 0x37) + (0x49 ^ 0) - 3 + (0x5A ^ 5);
        T.var2[6] = 0x55 ^ 0x39;
        T.var2[7] = 0xFFFFA7DE & 0x5B61;
        T.var2[8] = 0xFFFFEFDF & 0x11E3;
        T.var2[9] = 0xFFFFF7E7 & 0x9D9;
        T.var2[10] = 0xFFFFA7BF & 0x59FF;
        T.var2[11] = -(0xFFFFBF1F & 0x5CE1) & (0xFFFFFDFE & 0x1FBD);
        T.var2[12] = -(0xFFFFFF27 & 0x7AF9) & (0xFFFFFBF5 & 0x7FEF);
        T.var2[13] = 0xFFFFEFFF & 0x3EEC;
        T.var2[14] = 0xFFFFFDFF & 0x3B57;
        T.var2[15] = -(0xFFFFE5FD & 0x5E87) & (0xFFFFFFDD & 0x7DFE);
        T.var2[16] = 0xFFFFBFF9 & 0x795F;
        T.var2[17] = 0xFFFFBB77 & 0x7EDF;
        T.var2[18] = 0xFFFFFB58 & 0x3EFF;
        T.var2[19] = 0xFFFFFE7D & 0x3BDB;
        T.var2[20] = 3;
        T.var2[21] = -(0xFFFFE2A7 & 0x5DF9) & (0xFFFFFFFF & 0x7BF7);
        T.var2[22] = -(0xFFFFF5A8 & 0x4E7F) & (0xFFFFFF7F & Short.MAX_VALUE);
        T.var2[23] = 2;
        T.var2[24] = 0xFFFFBBD9 & 0x7F7F;
        T.var2[25] = 0x83 ^ 0x8B;
    }

    public boolean B() {
        boolean bl;
        if (T.var11(Vars.getBit((int)var2[3]), var2[1])) {
            bl = var2[1];
            0;
            if (((6 ^ 0x56) & ~(0xC5 ^ 0x95)) <= -1) {
                return ((0x90 ^ 0xBD) & ~(0xEC ^ 0xC1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public int C() {
        return Vars.getBit((int)var2[4]);
    }

    static {
        T.var23();
        T.var3();
        aw = var2[7];
        ay = var2[6];
        ax = var2[5];
        av = ImmutableSet.of((Object)var2[8], (Object)var2[9], (Object)var2[10], (Object)var2[11], (Object)var2[12], (Object)var2[13], (Object[])new Integer[var2[0]]);
        Object[] objectArray = new Integer[var2[20]];
        objectArray[T.var2[0]] = var2[21];
        objectArray[T.var2[1]] = var2[22];
        objectArray[T.var2[23]] = var2[24];
        az = ImmutableSet.of((Object)var2[14], (Object)var2[15], (Object)var2[16], (Object)var2[17], (Object)var2[18], (Object)var2[19], (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean K() {
        void var24;
        int[] nArray;
        int[] nArray2 = nArray = this.aA.getMapRegions();
        int n2 = nArray2.length;
        int var25 = var2[0];
        while (T.var13(var25, (int)var24)) {
            void var26;
            void var27 = var26[var25];
            if (T.var15(az.contains((int)var27) ? 1 : 0)) {
                return var2[0];
            }
            ++var25;
            0;
            if ((0x24 ^ 0x58 ^ (0xCF ^ 0xB7)) >= ((0x57 ^ 0x40 ^ (0x5B ^ 0x69)) & (0x13 ^ 0x70 ^ (0x74 ^ 0x32) ^ -1))) continue;
            return ((183 + 103 - 182 + 121 ^ 80 + 109 - 43 + 33) & (23 + 162 - -14 + 5 ^ 31 + 92 - -18 + 17 ^ -1)) != 0;
        }
        return var2[1];
    }

    public void A() {
        this.aB = var2[0];
        int[] nArray = new int[var2[1]];
        nArray[T.var2[0]] = var2[2];
        this.aC = Inventory.getCount((int[])nArray);
        this.aD = this.G();
    }

    public boolean I() {
        boolean bl;
        T var28;
        int[] nArray = new int[var2[1]];
        nArray[T.var2[0]] = var2[2];
        if (T.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray2 = new int[var2[1]];
        nArray2[T.var2[0]] = var2[2];
        if (T.var8(Inventory.contains((int[])nArray2) ? 1 : 0) && !T.var15(Inventory.isFull() ? 1 : 0) || T.var12(var28.D(), var28.H())) {
            bl = var2[1];
            0;
            if null != null {
                return ((0xDA ^ 0xB8) & ~(0xF2 ^ 0x90)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public int H() {
        int n2;
        if (T.var8(this.B() ? 1 : 0)) {
            n2 = var2[5];
            0;
            if (((46 + 49 - -35 + 0 ^ 102 + 116 - 156 + 93) & (0x2A ^ 8 ^ (0x1F ^ 0x24) ^ -1)) != 0) {
                return (99 + 1 - 5 + 72 ^ 103 + 118 - 193 + 169) & (58 + 129 - -29 + 35 ^ 0 + 30 - -1 + 122 ^ -1);
            }
        } else {
            n2 = var2[6];
        }
        return n2;
    }

    @Inject
    public MiningManager(Client client) {
        this.aA = client;
    }

    public int M() {
        return this.aB;
    }

    public int D() {
        return this.C() + this.N() + this.M();
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (T.var16(itemContainerChanged.getContainerId(), InventoryID.INVENTORY.getId())) {
            return;
        }
        int[] nArray = new int[var2[1]];
        nArray[T.var2[0]] = var2[2];
        this.aC = Inventory.getCount((int[])nArray);
    }

    public boolean L() {
        boolean bl;
        if (T.var15(this.M())) {
            bl = var2[1];
            0;
            if (((71 + 106 - 72 + 31 ^ 127 + 122 - 174 + 100) & (0x59 ^ 0x36 ^ (0xD7 ^ 0x9F) ^ -1)) < 0) {
                return ((26 + 44 - -6 + 56 ^ 57 + 7 - 31 + 104) & (0x9B ^ 0x8B ^ (0x9F ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var29;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (T.var30(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var31 = var29.getMessage();
        if (T.var8(var31.contains(var1[var2[0]]) ? 1 : 0)) {
            var32.aB = var2[0];
        }
    }

    public TileObject a(d d2) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (T.var8(d2.f().contains(tileObject.getWorldLocation()) ? 1 : 0) && T.var8(tileObject.getName().equals(var1[var2[1]]) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (((0x78 ^ 0x1B) & ~(0x3E ^ 0x5D)) != 0) {
                    return ((0x81 ^ 0xB5) & ~(0x8F ^ 0xBB)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.H() - this.D();
    }

    public boolean F() {
        boolean bl;
        if (T.var39(this.E())) {
            bl = var2[1];
            0;
            if null != null {
                return ((0x1C ^ 0x2E) & ~(0x1B ^ 0x29)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var39(int n2) {
        return n2 < 0;
    }

    private static boolean var30(Object object, Object object2) {
        return object != object2;
    }
}

