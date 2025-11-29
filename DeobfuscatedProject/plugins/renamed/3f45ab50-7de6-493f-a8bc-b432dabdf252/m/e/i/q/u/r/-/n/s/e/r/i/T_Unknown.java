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
package m.e.i.q.u.r.-.n.s.e.r.i;

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
import m.e.i.q.u.r.-.n.s.e.r.i.DEnum;
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
public class T_Unknown {
    private final /* synthetic */ Client aA;
    private static final /* synthetic */ int aw;
    public static final /* synthetic */ Set<Integer> av;
    private static final /* synthetic */ int ay;
    private static final /* synthetic */ int ax;
    private /* synthetic */ boolean aD;
    private static /* synthetic */ String[] lllllIllIlII;
    private static /* synthetic */ int[] lllllIllIlIl;
    private /* synthetic */ int aB;
    private /* synthetic */ int aC;
    private static final /* synthetic */ Set<Integer> az;

    private static void lIIlIIlllIlIlII() {
        lllllIllIlII = new String[lllllIllIlIl[23]];
        T.lllllIllIlII[T.lllllIllIlIl[0]] = T."Some ore is ready";
        T.lllllIllIlII[T.lllllIllIlIl[1]] = T."Ore vein";
    }

    private static boolean lIIlIIlllIllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        int var8;
        T var1;
        void var2;
        Actor actor = animationChanged.getActor();
        if (T.lIIlIIlllIllIIl(actor instanceof NPC)) {
            return;
        }
        Player var12 = (Player)var2;
        if (T.lIIlIIlllIllllI(var12, var1.aA.getLocalPlayer()) && T.lIIlIIlllIlIllI(var8 = var12.getAnimation(), lllllIllIlIl[7])) {
            var1.aB = var1.aC;
            var1.aC = lllllIllIlIl[0];
            var1.aD = var1.G();
        }
    }

    private static boolean lIIlIIlllIllIIl(int n2) {
        return n2 != 0;
    }

    public boolean G() {
        boolean bl;
        if (T.lIIlIIlllIllIII(this.D(), this.H())) {
            bl = lllllIllIlIl[1];
            0;
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
        T var16;
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
        if (T.lIIlIIlllIllIll(var16.M(), lllllIllIlIl[1]) && T.lIIlIIlllIllIIl(Inventory.isFull() ? 1 : 0)) {
            n2 = lllllIllIlIl[1];
            0;
            if (-3 > 0) {
                return false;
            }
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

    private static String lIIlIIlllIlIIlI(String var13, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllllIllIlIl[25]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllllIllIlIl[23], var19);
            return new String(var10.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllIlIlIl() {
        lllllIllIlIl = new int[26];
        T.lllllIllIlIl[0] = (0x65 ^ 0x34) & ~(0x44 ^ 0x15);
        T.lllllIllIlIl[1] = 1;
        T.lllllIllIlIl[2] = -(0xFFFF9A8F & 0x7571) & (0xFFFFFEFB & 0x3FEF);
        T.lllllIllIlIl[3] = -(0xFFFFAEF9 & 0x7947) & (0xFFFFBFFE & 0x7DF5);
        T.lllllIllIlIl[4] = 0xFFFFB5F6 & 0x5FBF;
        T.lllllIllIlIl[5] = (0x2F ^ 0x37) + (0x49 ^ 0) - 3 + (0x5A ^ 5);
        T.lllllIllIlIl[6] = 0x55 ^ 0x39;
        T.lllllIllIlIl[7] = 0xFFFFA7DE & 0x5B61;
        T.lllllIllIlIl[8] = 0xFFFFEFDF & 0x11E3;
        T.lllllIllIlIl[9] = 0xFFFFF7E7 & 0x9D9;
        T.lllllIllIlIl[10] = 0xFFFFA7BF & 0x59FF;
        T.lllllIllIlIl[11] = -(0xFFFFBF1F & 0x5CE1) & (0xFFFFFDFE & 0x1FBD);
        T.lllllIllIlIl[12] = -(0xFFFFFF27 & 0x7AF9) & (0xFFFFFBF5 & 0x7FEF);
        T.lllllIllIlIl[13] = 0xFFFFEFFF & 0x3EEC;
        T.lllllIllIlIl[14] = 0xFFFFFDFF & 0x3B57;
        T.lllllIllIlIl[15] = -(0xFFFFE5FD & 0x5E87) & (0xFFFFFFDD & 0x7DFE);
        T.lllllIllIlIl[16] = 0xFFFFBFF9 & 0x795F;
        T.lllllIllIlIl[17] = 0xFFFFBB77 & 0x7EDF;
        T.lllllIllIlIl[18] = 0xFFFFFB58 & 0x3EFF;
        T.lllllIllIlIl[19] = 0xFFFFFE7D & 0x3BDB;
        T.lllllIllIlIl[20] = 3;
        T.lllllIllIlIl[21] = -(0xFFFFE2A7 & 0x5DF9) & (0xFFFFFFFF & 0x7BF7);
        T.lllllIllIlIl[22] = -(0xFFFFF5A8 & 0x4E7F) & (0xFFFFFF7F & Short.MAX_VALUE);
        T.lllllIllIlIl[23] = 2;
        T.lllllIllIlIl[24] = 0xFFFFBBD9 & 0x7F7F;
        T.lllllIllIlIl[25] = 0x83 ^ 0x8B;
    }

    public boolean B() {
        boolean bl;
        if (T.lIIlIIlllIlIllI(Vars.getBit((int)lllllIllIlIl[3]), lllllIllIlIl[1])) {
            bl = lllllIllIlIl[1];
            0;
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
        void var22;
        int[] nArray;
        int[] nArray2 = nArray = this.aA.getMapRegions();
        int n2 = nArray2.length;
        int var3 = lllllIllIlIl[0];
        while (T.lIIlIIlllIlllII(var3, (int)var22)) {
            void var18;
            void var21 = var18[var3];
            if (T.lIIlIIlllIllIlI(az.contains((int)var21) ? 1 : 0)) {
                return lllllIllIlIl[0];
            }
            ++var3;
            0;
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
        T var9;
        int[] nArray = new int[lllllIllIlIl[1]];
        nArray[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        if (T.lIIlIIlllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIllIlIl[0];
        }
        int[] nArray2 = new int[lllllIllIlIl[1]];
        nArray2[T.lllllIllIlIl[0]] = lllllIllIlIl[2];
        if (T.lIIlIIlllIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0) && !T.lIIlIIlllIllIlI(Inventory.isFull() ? 1 : 0) || T.lIIlIIlllIllIII(var9.D(), var9.H())) {
            bl = lllllIllIlIl[1];
            0;
            
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
            0;
            if (((46 + 49 - -35 + 0 ^ 102 + 116 - 156 + 93) & (0x2A ^ 8 ^ (0x1F ^ 0x24) ^ -1)) != 0) {
                return (99 + 1 - 5 + 72 ^ 103 + 118 - 193 + 169) & (58 + 129 - -29 + 35 ^ 0 + 30 - -1 + 122 ^ -1);
            }
        } else {
            n2 = lllllIllIlIl[6];
        }
        return n2;
    }

    @Inject
    public T(Client client) {
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
            0;
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
        void var20;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (T.lIIlIIlllIlllll(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var4 = var20.getMessage();
        if (T.lIIlIIlllIllIIl(var4.contains(lllllIllIlII[lllllIllIlIl[0]]) ? 1 : 0)) {
            lllllllllllllllIIlIIlIIlIlIIllll.aB = lllllIllIlIl[0];
        }
    }

    public TileObject a(d d2) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (T.lIIlIIlllIllIIl(d2.f().contains(tileObject.getWorldLocation()) ? 1 : 0) && T.lIIlIIlllIllIIl(tileObject.getName().equals(lllllIllIlII[lllllIllIlIl[1]]) ? 1 : 0)) {
                n2 = lllllIllIlIl[1];
                0;
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

    private static String lIIlIIlllIlIIll(String var11, String var5) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllllIllIlIl[23], var14);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.H() - this.D();
    }

    public boolean F() {
        boolean bl;
        if (T.lIIlIIlllIlIlll(this.E())) {
            bl = lllllIllIlIl[1];
            0;
            
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

