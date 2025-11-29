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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum40;
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

    private static void lIIlIIlllIlIlII() {
        lllllIllIlII = new String[lllllIllIlIl[23]];
        T.lllllIllIlII[T.lllllIllIlIl[0]] = "Some ore is ready";
        T.lllllIllIlII[T.lllllIllIlIl[1]] = "Ore vein";
    }

    private static boolean lIIlIIlllIllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        int var1;
        T var2;
        void var3;
        Actor actor = animationChanged.getActor();
        if (T.lIIlIIlllIllIIl(actor instanceof NPC)) {
            return;
        }
        Player var4 = (Player)var3;
        if (T.lIIlIIlllIllllI(var4, var2.aA.getLocalPlayer()) && T.lIIlIIlllIlIllI(var1 = var4.getAnimation(), lllllIllIlIl[7])) {
            var2.aB = var2.aC;
            var2.aC = lllllIllIlIl[0];
            var2.aD = var2.G();
        }
    }

    private static boolean lIIlIIlllIllIIl(int n2) {
        return n2 != 0;
    }

    public boolean G() {
        boolean bl;
        if (T.lIIlIIlllIllIII(this.D(), this.H())) {
            bl = lllllIllIlIl[1];

            if (1 <= 0) {
                return ((52 + 168 - 152 + 175 ^ 53 + 144 - 102 + 80) & (0x38 ^ 0x3D ^ (0xEA ^ 0xB3) ^ -1)) != 0;
            }
        } else {
            bl = lllllIllIlIl[0];
        }
        return bl;
    }

    public void a(boolean bl) {
        this.aD = bl;
    }

    private static boolean lIIlIIlllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean J() {
        int n2;
        T var5;
        if (T.lIIlIIlllIllIlI(this.M())) {
            return lllllIllIlIl[0];
        }
        if (T.lIIlIIlllIllIIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllllIllIlIl[1]];
            nArray[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
            if (T.lIIlIIlllIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllllIllIlIl[1];
            }
        }
        if (T.lIIlIIlllIllIll(var5.M(), lllllIllIlIl[1]) && T.lIIlIIlllIllIIl(Inventory.isFull() ? 1 : 0)) {
            n2 = lllllIllIlIl[1];

        } else {
            n2 = lllllIllIlIl[0];
        }
        return n2 != 0;
    }

    public boolean O() {
        return this.aD;
    }

    public int N() {
        return this.aC;
    }

    private static boolean lIIlIIlllIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean B() {
        boolean bl;
        if (T.lIIlIIlllIlIllI(Vars.getBit((int)lllllIllIlIl[3]), lllllIllIlIl[1])) {
            bl = lllllIllIlIl[1];

            if (((6 ^ 0x56) & ~(0xC5 ^ 0x95)) <= -1) {
                return false;
            }
        } else {
            bl = lllllIllIlIl[0];
        }
        return bl;
    }

    public int C() {
        return Vars.getBit((int)lllllIllIlIl[4]);
    }

    static {
        T.lIIlIIlllIlIlIl();
        T.lIIlIIlllIlIlII();
        aw = lllllIllIlIl[7];
        ay = lllllIllIlIl[6];
        ax = lllllIllIlIl[5];
        av = ImmutableSet.of((Object)lllllIllIlIl[8], (Object)lllllIllIlIl[9], (Object)lllllIllIlIl[10], (Object)lllllIllIlIl[11], (Object)lllllIllIlIl[12], (Object)lllllIllIlIl[13], (Object[])new Integer[lllllIllIlIl[0]]);
        Object[] objectArray = new Integer[lllllIllIlIl[20]];
        objectArray[T.lllllIllIlIl[0]] = lllllIllIlIl[21];
        objectArray[T.lllllIllIlIl[1]] = lllllIllIlIl[22];
        objectArray[T.lllllIllIlIl[23]] = lllllIllIlIl[24];
        az = ImmutableSet.of((Object)lllllIllIlIl[14], (Object)lllllIllIlIl[15], (Object)lllllIllIlIl[16], (Object)lllllIllIlIl[17], (Object)lllllIllIlIl[18], (Object)lllllIllIlIl[19], (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean K() {
        void var6;
        int[] nArray;
        int[] nArray2 = nArray = this.aA.getMapRegions();
        int n2 = nArray2.length;
        int var7 = lllllIllIlIl[0];
        while (T.lIIlIIlllIlllII(var7, (int)var6)) {
            void var8;
            void var9 = var8[var7];
            if (T.lIIlIIlllIllIlI(az.contains((int)var9) ? 1 : 0)) {
                return lllllIllIlIl[0];
            }
            ++var7;

            if ((0x24 ^ 0x58 ^ (0xCF ^ 0xB7)) >= ((0x57 ^ 0x40 ^ (0x5B ^ 0x69)) & (0x13 ^ 0x70 ^ (0x74 ^ 0x32) ^ -1))) continue;
            return false;
        }
        return lllllIllIlIl[1];
    }

    public void A() {
        this.aB = lllllIllIlIl[0];
        int[] nArray = new int[lllllIllIlIl[1]];
        nArray[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        this.aC = Inventory.getCount((int[])nArray);
        this.aD = this.G();
    }

    public boolean I() {
        boolean bl;
        T var10;
        int[] nArray = new int[lllllIllIlIl[1]];
        nArray[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        if (T.lIIlIIlllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIllIlIl[0];
        }
        int[] nArray2 = new int[lllllIllIlIl[1]];
        nArray2[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        if (T.lIIlIIlllIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0) && !T.lIIlIIlllIllIlI(Inventory.isFull() ? 1 : 0) || T.lIIlIIlllIllIII(var10.D(), var10.H())) {
            bl = lllllIllIlIl[1];

            }
        } else {
            bl = lllllIllIlIl[0];
        }
        return bl;
    }

    public int H() {
        int n2;
        if (T.lIIlIIlllIllIIl(this.B() ? 1 : 0)) {
            n2 = lllllIllIlIl[5];

            if (((46 + 49 - -35 + 0 ^ 102 + 116 - 156 + 93) & (0x2A ^ 8 ^ (0x1F ^ 0x24) ^ -1)) != 0) {
                return (99 + 1 - 5 + 72 ^ 103 + 118 - 193 + 169) & (58 + 129 - -29 + 35 ^ 0 + 30 - -1 + 122 ^ -1);
            }
        } else {
            n2 = lllllIllIlIl[6];
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
        if (T.lIIlIIlllIlllIl(itemContainerChanged.getContainerId(), InventoryID.INVENTORY.getId())) {
            return;
        }
        int[] nArray = new int[lllllIllIlIl[1]];
        nArray[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        this.aC = Inventory.getCount((int[])nArray);
    }

    public boolean L() {
        boolean bl;
        if (T.lIIlIIlllIllIlI(this.M())) {
            bl = lllllIllIlIl[1];

            if (((71 + 106 - 72 + 31 ^ 127 + 122 - 174 + 100) & (0x59 ^ 0x36 ^ (0xD7 ^ 0x9F) ^ -1)) < 0) {
                return ((26 + 44 - -6 + 56 ^ 57 + 7 - 31 + 104) & (0x9B ^ 0x8B ^ (0x9F ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = lllllIllIlIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var11;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (T.lIIlIIlllIlllll(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var12 = var11.getMessage();
        if (T.lIIlIIlllIllIIl(var12.contains(lllllIllIlII[lllllIllIlIl[0]]) ? 1 : 0)) {
            var13.aB = lllllIllIlIl[0];
        }
    }

    public TileObject a(d d2) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (T.lIIlIIlllIllIIl(d2.f().contains(tileObject.getWorldLocation()) ? 1 : 0) && T.lIIlIIlllIllIIl(tileObject.getName().equals(lllllIllIlII[lllllIllIlIl[1]]) ? 1 : 0)) {
                n2 = lllllIllIlIl[1];

                if (((0x78 ^ 0x1B) & ~(0x3E ^ 0x5D)) != 0) {
                    return false;
                }
            } else {
                n2 = lllllIllIlIl[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIIlIIlllIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIlllIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIlllIllllI(Object object, Object object2) {
        return object == object2;
    }

    public int E() {
        return this.H() - this.D();
    }

    public boolean F() {
        boolean bl;
        if (T.lIIlIIlllIlIlll(this.E())) {
            bl = lllllIllIlIl[1];

            }
        } else {
            bl = lllllIllIlIl[0];
        }
        return bl;
    }

    private static boolean lIIlIIlllIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlllIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIIlllIlllll(Object object, Object object2) {
        return object != object2;
    }
}

