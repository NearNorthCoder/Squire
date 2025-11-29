/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Point
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Doing pressure plates puzzle", register=true, priority=5, blocking=true)
public class br
extends bm {
    private static final /* synthetic */ Pattern fA;
    private /* synthetic */ boolean fm;
    private static /* synthetic */ int[] llIlIIIllII;
    private /* synthetic */ Set<WorldPoint> fo;
    private static final /* synthetic */ Map<Integer, Set<Integer>> fz;
    private static /* synthetic */ String[] llIlIIIlIll;
    private static final /* synthetic */ Point[] fy;
    private /* synthetic */ Set<Integer> fB;
    private /* synthetic */ int fC;
    private static final /* synthetic */ Set<Integer> fx;
    private static final /* synthetic */ Set<Integer> fw;

    private static String lIlIIlIlIIIIII(String llllllllllllllllIIllIlllIIIlllIl, String llllllllllllllllIIllIlllIIIlllII) {
        llllllllllllllllIIllIlllIIIlllIl = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlllIIIllIll = new StringBuilder();
        char[] llllllllllllllllIIllIlllIIIllIlI = llllllllllllllllIIllIlllIIIlllII.toCharArray();
        int llllllllllllllllIIllIlllIIIllIIl = llIlIIIllII[0];
        char[] llllllllllllllllIIllIlllIIIlIIll = llllllllllllllllIIllIlllIIIlllIl.toCharArray();
        int llllllllllllllllIIllIlllIIIlIIlI = llllllllllllllllIIllIlllIIIlIIll.length;
        int llllllllllllllllIIllIlllIIIlIIIl = llIlIIIllII[0];
        while (br.lIlIIlIlIIlIlI(llllllllllllllllIIllIlllIIIlIIIl, llllllllllllllllIIllIlllIIIlIIlI)) {
            char llllllllllllllllIIllIlllIIIllllI = llllllllllllllllIIllIlllIIIlIIll[llllllllllllllllIIllIlllIIIlIIIl];
            llllllllllllllllIIllIlllIIIllIll.append((char)(llllllllllllllllIIllIlllIIIllllI ^ llllllllllllllllIIllIlllIIIllIlI[llllllllllllllllIIllIlllIIIllIIl % llllllllllllllllIIllIlllIIIllIlI.length]));
            0;
            ++llllllllllllllllIIllIlllIIIllIIl;
            ++llllllllllllllllIIllIlllIIIlIIIl;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlllIIIllIll);
    }

    static {
        br.lIlIIlIlIIIIll();
        br.lIlIIlIlIIIIlI();
        fw = Arrays.stream(bs.values()).map(bs::ci).collect(Collectors.toSet());
        fx = Arrays.stream(bs.values()).map(bs::ch).collect(Collectors.toSet());
        Point[] pointArray = new Point[llIlIIIllII[5]];
        pointArray[br.llIlIIIllII[0]] = new Point(llIlIIIllII[6], llIlIIIllII[7]);
        pointArray[br.llIlIIIllII[2]] = new Point(llIlIIIllII[6], llIlIIIllII[8]);
        pointArray[br.llIlIIIllII[4]] = new Point(llIlIIIllII[9], llIlIIIllII[7]);
        pointArray[br.llIlIIIllII[10]] = new Point(llIlIIIllII[9], llIlIIIllII[8]);
        fy = pointArray;
        Object[] objectArray = new Integer[llIlIIIllII[2]];
        objectArray[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray2 = new Integer[llIlIIIllII[2]];
        objectArray2[br.llIlIIIllII[0]] = llIlIIIllII[30];
        Object[] objectArray3 = new Integer[llIlIIIllII[2]];
        objectArray3[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray4 = new Integer[llIlIIIllII[2]];
        objectArray4[br.llIlIIIllII[0]] = llIlIIIllII[18];
        Object[] objectArray5 = new Integer[llIlIIIllII[2]];
        objectArray5[br.llIlIIIllII[0]] = llIlIIIllII[18];
        Object[] objectArray6 = new Integer[llIlIIIllII[2]];
        objectArray6[br.llIlIIIllII[0]] = llIlIIIllII[16];
        Object[] objectArray7 = new Integer[llIlIIIllII[2]];
        objectArray7[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray8 = new Integer[llIlIIIllII[2]];
        objectArray8[br.llIlIIIllII[0]] = llIlIIIllII[23];
        Object[] objectArray9 = new Integer[llIlIIIllII[2]];
        objectArray9[br.llIlIIIllII[0]] = llIlIIIllII[25];
        Object[] objectArray10 = new Integer[llIlIIIllII[2]];
        objectArray10[br.llIlIIIllII[0]] = llIlIIIllII[30];
        Object[] objectArray11 = new Integer[llIlIIIllII[2]];
        objectArray11[br.llIlIIIllII[0]] = llIlIIIllII[17];
        Object[] objectArray12 = new Integer[llIlIIIllII[2]];
        objectArray12[br.llIlIIIllII[0]] = llIlIIIllII[14];
        fz = ImmutableMap.builder().put((Object)llIlIIIllII[1], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12])).put((Object)llIlIIIllII[13], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12])).put((Object)llIlIIIllII[15], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[17], (Object)llIlIIIllII[18])).put((Object)llIlIIIllII[19], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[18], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[11], (Object)llIlIIIllII[12], (Object)llIlIIIllII[19])).put((Object)llIlIIIllII[24], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25])).put((Object)llIlIIIllII[26], (Object)ImmutableSet.of((Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25])).put((Object)llIlIIIllII[28], (Object)ImmutableSet.of((Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[5])).put((Object)llIlIIIllII[29], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[21], (Object)llIlIIIllII[25], (Object)llIlIIIllII[30])).put((Object)llIlIIIllII[31], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[30])).put((Object)llIlIIIllII[32], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[33], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[20], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23])).put((Object)llIlIIIllII[34], (Object)ImmutableSet.of((Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[20], (Object)llIlIIIllII[14])).put((Object)llIlIIIllII[35], (Object)ImmutableSet.of((Object)llIlIIIllII[5], (Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[21], (Object)llIlIIIllII[22], (Object)llIlIIIllII[27], (Object[])objectArray)).put((Object)llIlIIIllII[36], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object)llIlIIIllII[30], (Object[])new Integer[llIlIIIllII[0]])).put((Object)llIlIIIllII[37], (Object)ImmutableSet.of((Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object[])objectArray2)).put((Object)llIlIIIllII[6], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[27], (Object[])objectArray3)).put((Object)llIlIIIllII[38], (Object)ImmutableSet.of((Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object)llIlIIIllII[23], (Object)llIlIIIllII[30], (Object[])objectArray4)).put((Object)llIlIIIllII[39], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[20], (Object)llIlIIIllII[14], (Object)llIlIIIllII[16], (Object)llIlIIIllII[17], (Object[])objectArray5)).put((Object)llIlIIIllII[40], (Object)ImmutableSet.of((Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[21], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object[])objectArray6)).put((Object)llIlIIIllII[41], (Object)ImmutableSet.of((Object)llIlIIIllII[5], (Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object[])objectArray7)).put((Object)llIlIIIllII[42], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[5], (Object)llIlIIIllII[20], (Object)llIlIIIllII[27], (Object)llIlIIIllII[16], (Object)llIlIIIllII[25], (Object[])objectArray8)).put((Object)llIlIIIllII[43], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[27], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[16], (Object[])objectArray9)).put((Object)llIlIIIllII[44], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[3], (Object)llIlIIIllII[21], (Object)llIlIIIllII[14], (Object)llIlIIIllII[25], (Object[])objectArray10)).put((Object)llIlIIIllII[8], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[3], (Object)llIlIIIllII[14], (Object)llIlIIIllII[11], (Object)llIlIIIllII[23], (Object)llIlIIIllII[12], (Object[])objectArray11)).put((Object)llIlIIIllII[45], (Object)ImmutableSet.of((Object)llIlIIIllII[0], (Object)llIlIIIllII[2], (Object)llIlIIIllII[4], (Object)llIlIIIllII[10], (Object)llIlIIIllII[5], (Object)llIlIIIllII[3], (Object[])objectArray12)).build();
        fA = Pattern.compile(llIlIIIlIll[llIlIIIllII[10]]);
    }

    private static void lIlIIlIlIIIIlI() {
        llIlIIIlIll = new String[llIlIIIllII[5]];
        br.llIlIIIlIll[br.llIlIIIllII[0]] = br."Ancient tablet";
        br.llIlIIIlIll[br.llIlIIIllII[2]] = br."Inspect";
        br.llIlIIIlIll[br.llIlIIIllII[4]] = br."Your party failed to complete the challenge";
        br.llIlIIIlIll[br.llIlIIIllII[10]] = br."The number (\\d+) has been hastily chipped into the stone.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var2_2;
        void llllllllllllllllIIllIlllIIlIlIIl;
        if (br.lIlIIlIlIIlIII(chatMessage.getMessage().startsWith(llIlIIIlIll[llIlIIIllII[4]]) ? 1 : 0)) {
            this.fC = llIlIIIllII[0];
            this.fm = llIlIIIllII[0];
            return;
        }
        Matcher llllllllllllllllIIllIlllIIlIlIII = fA.matcher(Text.removeTags((String)llllllllllllllllIIllIlllIIlIlIIl.getMessage()));
        if (br.lIlIIlIlIIIllI(llllllllllllllllIIllIlllIIlIlIII.matches() ? 1 : 0)) {
            return;
        }
        this.fC = Integer.parseInt(var2_2.group(llIlIIIllII[2]));
    }

    private static int lIlIIlIlIIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Inject
    protected br(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fo = Collections.emptySet();
    }

    private static void lIlIIlIlIIIIll() {
        llIlIIIllII = new int[46];
        br.llIlIIIllII[0] = (6 ^ 0x14 ^ (2 ^ 0x44)) & (0xC5 ^ 0xA7 ^ (0x32 ^ 4) ^ -1);
        br.llIlIIIllII[1] = 0x7D ^ 0x69;
        br.llIlIIIllII[2] = 1;
        br.llIlIIIllII[3] = 0x6D ^ 0x68;
        br.llIlIIIllII[4] = 2;
        br.llIlIIIllII[5] = 0x4E ^ 0x4A;
        br.llIlIIIllII[6] = 0x4A ^ 0x6E;
        br.llIlIIIllII[7] = 0x7C ^ 0x44;
        br.llIlIIIllII[8] = 0x50 ^ 0x7C;
        br.llIlIIIllII[9] = 0xE5 ^ 0xBF ^ (0x7D ^ 0x12);
        br.llIlIIIllII[10] = 3;
        br.llIlIIIllII[11] = 0x58 ^ 0x53;
        br.llIlIIIllII[12] = 0x83 ^ 0x92;
        br.llIlIIIllII[13] = 0x63 ^ 0x76;
        br.llIlIIIllII[14] = 60 + 66 - 95 + 154 ^ 1 + 131 - 90 + 137;
        br.llIlIIIllII[15] = 0x3A ^ 0x2C;
        br.llIlIIIllII[16] = 0x10 ^ 0x7C ^ (0x32 ^ 0x52);
        br.llIlIIIllII[17] = 0x5A ^ 0x1A ^ (0xFA ^ 0xA8);
        br.llIlIIIllII[18] = 0x68 ^ 0x70;
        br.llIlIIIllII[19] = 0x65 ^ 0x72;
        br.llIlIIIllII[20] = 5 ^ 0x66 ^ (0x74 ^ 0x11);
        br.llIlIIIllII[21] = 0x11 ^ 0x6F ^ (7 ^ 0x7E);
        br.llIlIIIllII[22] = 0xA3 ^ 0xAB;
        br.llIlIIIllII[23] = 0x70 ^ 0x7E;
        br.llIlIIIllII[24] = 0x53 ^ 0x4A;
        br.llIlIIIllII[25] = 0xBE ^ 0xB3;
        br.llIlIIIllII[26] = 7 ^ 0xE ^ (0x40 ^ 0x53);
        br.llIlIIIllII[27] = 0x9C ^ 0xB8 ^ (0x1C ^ 0x31);
        br.llIlIIIllII[28] = 0xE1 ^ 0x92 ^ (0x42 ^ 0x2A);
        br.llIlIIIllII[29] = 0xD8 ^ 0xC4;
        br.llIlIIIllII[30] = 0x19 ^ 0xA;
        br.llIlIIIllII[31] = 0x8B ^ 0x96;
        br.llIlIIIllII[32] = 79 + 0 - 76 + 152 ^ 117 + 65 - 104 + 55;
        br.llIlIIIllII[33] = 0x7F ^ 0x60;
        br.llIlIIIllII[34] = 0xE4 ^ 0xAB ^ (0x43 ^ 0x2C);
        br.llIlIIIllII[35] = 0x4D ^ 3 ^ (0x2C ^ 0x43);
        br.llIlIIIllII[36] = 0x30 ^ 0x50 ^ (0x78 ^ 0x3A);
        br.llIlIIIllII[37] = 0x5F ^ 0x7C;
        br.llIlIIIllII[38] = 0x63 ^ 0x46;
        br.llIlIIIllII[39] = 0x9D ^ 0xBB;
        br.llIlIIIllII[40] = 114 + 166 - 245 + 143 ^ 125 + 14 - 105 + 115;
        br.llIlIIIllII[41] = 23 + 10 - -31 + 89 ^ 174 + 100 - 183 + 86;
        br.llIlIIIllII[42] = 0x33 ^ 0x1A;
        br.llIlIIIllII[43] = 118 + 81 - 117 + 55 ^ 140 + 13 - 78 + 88;
        br.llIlIIIllII[44] = 0x4E ^ 0x65 ^ (0xA2 ^ 0x8B) & ~(0xBE ^ 0x97);
        br.llIlIIIllII[45] = 0xBD ^ 0x90;
    }

    /*
     * WARNING - void declaration
     */
    private Set<Integer> b(Tile[][] tileArray, Point point) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int llllllllllllllllIIllIlllIlIIIlll = llIlIIIllII[0];
        while (br.lIlIIlIlIIlIlI(llllllllllllllllIIllIlllIlIIIlll, llIlIIIllII[3])) {
            int llllllllllllllllIIllIlllIlIIIllI = llIlIIIllII[0];
            while (br.lIlIIlIlIIlIlI(llllllllllllllllIIllIlllIlIIIllI, llIlIIIllII[3])) {
                void llllllllllllllllIIllIlllIlIIlIIl;
                void llllllllllllllllIIllIlllIlIIlIlI;
                void llllllllllllllllIIllIlllIlIIIlIl = llllllllllllllllIIllIlllIlIIlIlI[llllllllllllllllIIllIlllIlIIlIIl.getX() + llllllllllllllllIIllIlllIlIIIllI][llllllllllllllllIIllIlllIlIIlIIl.getY() - llllllllllllllllIIllIlllIlIIIlll];
                IntStream intStream = Arrays.stream(llllllllllllllllIIllIlllIlIIIlIl.getGameObjects()).filter(Objects::nonNull).mapToInt(TileObject::getId);
                Set<Integer> set = fw;
                Objects.requireNonNull(set);
                0;
                int n2 = intStream.anyMatch(set::contains);
                if (br.lIlIIlIlIIlIII(n2)) {
                    void llllllllllllllllIIllIlllIlIIlIII;
                    llllllllllllllllIIllIlllIlIIlIII.add(llllllllllllllllIIllIlllIlIIIlll * llIlIIIllII[3] + llllllllllllllllIIllIlllIlIIIllI);
                    0;
                }
                ++llllllllllllllllIIllIlllIlIIIllI;
                0;
                if (1 >= 1) continue;
                return null;
            }
            ++llllllllllllllllIIllIlllIlIIIlll;
            0;
            if (((231 + 209 - 384 + 184 ^ 33 + 76 - 96 + 162) & (131 + 216 - 332 + 225 ^ 69 + 134 - 199 + 171 ^ -1)) == ((0xE7 ^ 0x9C ^ (0xC ^ 0x59)) & (0xEC ^ 0xB9 ^ (0xC3 ^ 0xB8) ^ -1))) continue;
            return null;
        }
        return hashSet;
    }

    /*
     * WARNING - void declaration
     */
    private Point a(Tile[][] tileArray) {
        void llllllllllllllllIIllIlllIIlllIlI;
        Point[] pointArray = fy;
        int n2 = pointArray.length;
        int llllllllllllllllIIllIlllIIlllIIl = llIlIIIllII[0];
        while (br.lIlIIlIlIIlIlI(llllllllllllllllIIllIlllIIlllIIl, (int)llllllllllllllllIIllIlllIIlllIlI)) {
            void llllllllllllllllIIllIlllIIllllII;
            void llllllllllllllllIIllIlllIIlllIll;
            void llllllllllllllllIIllIlllIIlllIII = llllllllllllllllIIllIlllIIlllIll[llllllllllllllllIIllIlllIIlllIIl];
            void llllllllllllllllIIllIlllIIllIlll = llllllllllllllllIIllIlllIIllllII[llllllllllllllllIIllIlllIIlllIII.getX()][llllllllllllllllIIllIlllIIlllIII.getY()];
            GroundObject llllllllllllllllIIllIlllIIllIllI = llllllllllllllllIIllIlllIIllIlll.getGroundObject();
            if (br.lIlIIlIlIIlIll(llllllllllllllllIIllIlllIIllIllI) && br.lIlIIlIlIIllII(llllllllllllllllIIllIlllIIllIllI.getId(), bs.FOOT.ch())) {
                return llllllllllllllllIIllIlllIIlllIII;
            }
            ++llllllllllllllllIIllIlllIIlllIIl;
            0;
            if (2 > 0) continue;
            return null;
        }
        return null;
    }

    private static boolean lIlIIlIlIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIlIlIIIIIl(String llllllllllllllllIIllIlllIIIIIllI, String llllllllllllllllIIllIlllIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIllIlllIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlllIIIIIlll.getBytes(StandardCharsets.UTF_8)), llIlIIIllII[22]), "DES");
            Cipher llllllllllllllllIIllIlllIIIIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIIllIlllIIIIlIlI.init(llIlIIIllII[4], llllllllllllllllIIllIlllIIIIlIll);
            return new String(llllllllllllllllIIllIlllIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlllIIIIlIIl) {
            llllllllllllllllIIllIlllIIIIlIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (br.lIlIIlIlIIlIII(fw.contains(gameObjectSpawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }

    private static boolean lIlIIlIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_3;
        br llllllllllllllllIIllIlllIlIllIll;
        if (br.lIlIIlIlIIIllI(this.fm ? 1 : 0) && br.lIlIIlIlIIIlll(this.fC, llIlIIIllII[1])) {
            this.ca();
            return llIlIIIllII[2];
        }
        if (br.lIlIIlIlIIlIII(llllllllllllllllIIllIlllIlIllIll.fo.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIlIIIllII[2]];
            stringArray[br.llIlIIIllII[0]] = llIlIIIlIll[llIlIIIllII[0]];
            TileObject llllllllllllllllIIllIlllIlIllIlI = TileObjects.getNearest((String[])stringArray);
            if (br.lIlIIlIlIIIlII(llllllllllllllllIIllIlllIlIllIlI)) {
                return llIlIIIllII[0];
            }
            llllllllllllllllIIllIlllIlIllIlI.interact(llIlIIIlIll[llIlIIIllII[2]]);
            return llIlIIIllII[2];
        }
        WorldPoint llllllllllllllllIIllIlllIlIllIlI = llllllllllllllllIIllIlllIlIllIll.cu.getLocalPlayer().getWorldLocation();
        WorldPoint llllllllllllllllIIllIlllIlIllIIl = llllllllllllllllIIllIlllIlIllIll.fo.stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fw.contains(tileObject.getId())).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).min(Comparator.comparingInt(WorldPoint::getX).thenComparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
        if (br.lIlIIlIlIIIlII(llllllllllllllllIIllIlllIlIllIIl)) {
            return llIlIIIllII[0];
        }
        long llllllllllllllllIIllIlllIlIllIII = llllllllllllllllIIllIlllIlIllIIl.pathTo(llllllllllllllllIIllIlllIlIllIll.cu, llllllllllllllllIIllIlllIlIllIIl).stream().filter(worldPoint -> TileObjects.getAll(tileObject -> fx.contains(tileObject.getId())).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint))).count();
        if (br.lIlIIlIlIIlIIl(br.lIlIIlIlIIIlIl(llllllllllllllllIIllIlllIlIllIII, 1L))) {
            return llIlIIIllII[0];
        }
        Movement.setDestination((WorldPoint)var2_3);
        return llIlIIIllII[2];
    }

    private static boolean lIlIIlIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bZ() {
        return TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId())).getWorldX();
    }

    @Override
    public boolean bk() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> fx.contains(tileObject.getId()));
        if (br.lIlIIlIlIIIlII(tileObject2)) {
            return llIlIIIllII[0];
        }
        return Reachable.isWalkable((WorldPoint)tileObject2.getWorldLocation());
    }

    @Override
    public void r() {
        this.fm = llIlIIIllII[0];
        this.fB = new HashSet<Integer>();
        this.fC = llIlIIIllII[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIlIIlIlIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIIIlII(Object object) {
        return object == null;
    }

    @Override
    public boolean bj() {
        return llIlIIIllII[0];
    }

    private Set<WorldPoint> b(Point point) {
        Sets.SetView setView = Sets.difference(fz.get(this.fC), this.fB);
        return setView.stream().map(n2 -> WorldPoint.fromScene((Client)this.cu, (int)(point.getX() + n2 % llIlIIIllII[3]), (int)(point.getY() - n2 / llIlIIIllII[3]), (int)this.cu.getPlane())).collect(Collectors.toSet());
    }

    /*
     * WARNING - void declaration
     */
    private void ca() {
        void var2_2;
        void var1_1;
        br llllllllllllllllIIllIlllIlIlIlII;
        if (br.lIlIIlIlIIlIlI(this.fC, llIlIIIllII[1])) {
            return;
        }
        llllllllllllllllIIllIlllIlIlIlII.fm = llIlIIIllII[2];
        Tile[][] llllllllllllllllIIllIlllIlIlIIll = llllllllllllllllIIllIlllIlIlIlII.cu.getScene().getTiles()[llllllllllllllllIIllIlllIlIlIlII.cu.getPlane()];
        Point llllllllllllllllIIllIlllIlIlIIlI = llllllllllllllllIIllIlllIlIlIlII.a(llllllllllllllllIIllIlllIlIlIIll);
        if (br.lIlIIlIlIIIlII(llllllllllllllllIIllIlllIlIlIIlI)) {
            return;
        }
        this.fB = this.b((Tile[][])var1_1, (Point)var2_2);
        this.fo = this.b((Point)var2_2);
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (br.lIlIIlIlIIlIII(fw.contains(gameObjectDespawned.getGameObject().getId()) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }
}

