package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
@TaskDesc(name = "Doing pressure plates puzzle", register = true, priority = 5, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.br  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/br.class */
public class C0045br extends AbstractC0040bm {
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
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIlllIIIlllII.toCharArray();
        int llllllllllllllllIIllIlllIIIllIIl = llIlIIIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIllII[0];
        while (lIlIIlIlIIlIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIllIlllIIIllIIl % charArray.length]));
            "".length();
            llllllllllllllllIIllIlllIIIllIIl++;
            i++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIlIlIIIIll();
        lIlIIlIlIIIIlI();
        fw = (Set) Arrays.stream(EnumC0046bs.values()).map((v0) -> {
            return v0.ci();
        }).collect(Collectors.toSet());
        fx = (Set) Arrays.stream(EnumC0046bs.values()).map((v0) -> {
            return v0.ch();
        }).collect(Collectors.toSet());
        Point[] pointArr = new Point[llIlIIIllII[5]];
        pointArr[llIlIIIllII[0]] = new Point(llIlIIIllII[6], llIlIIIllII[7]);
        pointArr[llIlIIIllII[2]] = new Point(llIlIIIllII[6], llIlIIIllII[8]);
        pointArr[llIlIIIllII[4]] = new Point(llIlIIIllII[9], llIlIIIllII[7]);
        pointArr[llIlIIIllII[10]] = new Point(llIlIIIllII[9], llIlIIIllII[8]);
        fy = pointArr;
        ImmutableMap.Builder put = ImmutableMap.builder().put(Integer.valueOf(llIlIIIllII[1]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[3]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[12]))).put(Integer.valueOf(llIlIIIllII[13]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[12]))).put(Integer.valueOf(llIlIIIllII[15]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[17]), Integer.valueOf(llIlIIIllII[18]))).put(Integer.valueOf(llIlIIIllII[19]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[3]), Integer.valueOf(llIlIIIllII[20]), Integer.valueOf(llIlIIIllII[21]), Integer.valueOf(llIlIIIllII[22]), Integer.valueOf(llIlIIIllII[23]))).put(Integer.valueOf(llIlIIIllII[18]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[3]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[12]), Integer.valueOf(llIlIIIllII[19]))).put(Integer.valueOf(llIlIIIllII[24]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]))).put(Integer.valueOf(llIlIIIllII[26]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[27]), Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]))).put(Integer.valueOf(llIlIIIllII[28]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[3]), Integer.valueOf(llIlIIIllII[20]), Integer.valueOf(llIlIIIllII[21]), Integer.valueOf(llIlIIIllII[22]), Integer.valueOf(llIlIIIllII[5]))).put(Integer.valueOf(llIlIIIllII[29]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[0]), Integer.valueOf(llIlIIIllII[2]), Integer.valueOf(llIlIIIllII[21]), Integer.valueOf(llIlIIIllII[25]), Integer.valueOf(llIlIIIllII[30]))).put(Integer.valueOf(llIlIIIllII[31]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]), Integer.valueOf(llIlIIIllII[30]))).put(Integer.valueOf(llIlIIIllII[32]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]), Integer.valueOf(llIlIIIllII[23]))).put(Integer.valueOf(llIlIIIllII[33]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[0]), Integer.valueOf(llIlIIIllII[20]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]), Integer.valueOf(llIlIIIllII[23]))).put(Integer.valueOf(llIlIIIllII[34]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[4]), Integer.valueOf(llIlIIIllII[10]), Integer.valueOf(llIlIIIllII[5]), Integer.valueOf(llIlIIIllII[20]), Integer.valueOf(llIlIIIllII[14])));
        Integer valueOf = Integer.valueOf(llIlIIIllII[35]);
        Integer valueOf2 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf3 = Integer.valueOf(llIlIIIllII[3]);
        Integer valueOf4 = Integer.valueOf(llIlIIIllII[20]);
        Integer valueOf5 = Integer.valueOf(llIlIIIllII[21]);
        Integer valueOf6 = Integer.valueOf(llIlIIIllII[22]);
        Integer valueOf7 = Integer.valueOf(llIlIIIllII[27]);
        Integer[] numArr = new Integer[llIlIIIllII[2]];
        numArr[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[23]);
        ImmutableMap.Builder put2 = put.put(valueOf, ImmutableSet.of(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, numArr)).put(Integer.valueOf(llIlIIIllII[36]), ImmutableSet.of(Integer.valueOf(llIlIIIllII[14]), Integer.valueOf(llIlIIIllII[11]), Integer.valueOf(llIlIIIllII[16]), Integer.valueOf(llIlIIIllII[25]), Integer.valueOf(llIlIIIllII[23]), Integer.valueOf(llIlIIIllII[30]), new Integer[llIlIIIllII[0]]));
        Integer valueOf8 = Integer.valueOf(llIlIIIllII[37]);
        Integer valueOf9 = Integer.valueOf(llIlIIIllII[27]);
        Integer valueOf10 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf11 = Integer.valueOf(llIlIIIllII[11]);
        Integer valueOf12 = Integer.valueOf(llIlIIIllII[16]);
        Integer valueOf13 = Integer.valueOf(llIlIIIllII[25]);
        Integer valueOf14 = Integer.valueOf(llIlIIIllII[23]);
        Integer[] numArr2 = new Integer[llIlIIIllII[2]];
        numArr2[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[30]);
        ImmutableMap.Builder put3 = put2.put(valueOf8, ImmutableSet.of(valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, numArr2));
        Integer valueOf15 = Integer.valueOf(llIlIIIllII[6]);
        Integer valueOf16 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf17 = Integer.valueOf(llIlIIIllII[2]);
        Integer valueOf18 = Integer.valueOf(llIlIIIllII[4]);
        Integer valueOf19 = Integer.valueOf(llIlIIIllII[10]);
        Integer valueOf20 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf21 = Integer.valueOf(llIlIIIllII[27]);
        Integer[] numArr3 = new Integer[llIlIIIllII[2]];
        numArr3[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[23]);
        ImmutableMap.Builder put4 = put3.put(valueOf15, ImmutableSet.of(valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, numArr3));
        Integer valueOf22 = Integer.valueOf(llIlIIIllII[38]);
        Integer valueOf23 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf24 = Integer.valueOf(llIlIIIllII[11]);
        Integer valueOf25 = Integer.valueOf(llIlIIIllII[16]);
        Integer valueOf26 = Integer.valueOf(llIlIIIllII[25]);
        Integer valueOf27 = Integer.valueOf(llIlIIIllII[23]);
        Integer valueOf28 = Integer.valueOf(llIlIIIllII[30]);
        Integer[] numArr4 = new Integer[llIlIIIllII[2]];
        numArr4[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[18]);
        ImmutableMap.Builder put5 = put4.put(valueOf22, ImmutableSet.of(valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, numArr4));
        Integer valueOf29 = Integer.valueOf(llIlIIIllII[39]);
        Integer valueOf30 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf31 = Integer.valueOf(llIlIIIllII[3]);
        Integer valueOf32 = Integer.valueOf(llIlIIIllII[20]);
        Integer valueOf33 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf34 = Integer.valueOf(llIlIIIllII[16]);
        Integer valueOf35 = Integer.valueOf(llIlIIIllII[17]);
        Integer[] numArr5 = new Integer[llIlIIIllII[2]];
        numArr5[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[18]);
        ImmutableMap.Builder put6 = put5.put(valueOf29, ImmutableSet.of(valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, numArr5));
        Integer valueOf36 = Integer.valueOf(llIlIIIllII[40]);
        Integer valueOf37 = Integer.valueOf(llIlIIIllII[4]);
        Integer valueOf38 = Integer.valueOf(llIlIIIllII[10]);
        Integer valueOf39 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf40 = Integer.valueOf(llIlIIIllII[21]);
        Integer valueOf41 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf42 = Integer.valueOf(llIlIIIllII[11]);
        Integer[] numArr6 = new Integer[llIlIIIllII[2]];
        numArr6[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[16]);
        ImmutableMap.Builder put7 = put6.put(valueOf36, ImmutableSet.of(valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, numArr6));
        Integer valueOf43 = Integer.valueOf(llIlIIIllII[41]);
        Integer valueOf44 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf45 = Integer.valueOf(llIlIIIllII[27]);
        Integer valueOf46 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf47 = Integer.valueOf(llIlIIIllII[11]);
        Integer valueOf48 = Integer.valueOf(llIlIIIllII[16]);
        Integer valueOf49 = Integer.valueOf(llIlIIIllII[25]);
        Integer[] numArr7 = new Integer[llIlIIIllII[2]];
        numArr7[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[23]);
        ImmutableMap.Builder put8 = put7.put(valueOf43, ImmutableSet.of(valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, numArr7));
        Integer valueOf50 = Integer.valueOf(llIlIIIllII[42]);
        Integer valueOf51 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf52 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf53 = Integer.valueOf(llIlIIIllII[20]);
        Integer valueOf54 = Integer.valueOf(llIlIIIllII[27]);
        Integer valueOf55 = Integer.valueOf(llIlIIIllII[16]);
        Integer valueOf56 = Integer.valueOf(llIlIIIllII[25]);
        Integer[] numArr8 = new Integer[llIlIIIllII[2]];
        numArr8[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[23]);
        ImmutableMap.Builder put9 = put8.put(valueOf50, ImmutableSet.of(valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, numArr8));
        Integer valueOf57 = Integer.valueOf(llIlIIIllII[43]);
        Integer valueOf58 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf59 = Integer.valueOf(llIlIIIllII[3]);
        Integer valueOf60 = Integer.valueOf(llIlIIIllII[27]);
        Integer valueOf61 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf62 = Integer.valueOf(llIlIIIllII[11]);
        Integer valueOf63 = Integer.valueOf(llIlIIIllII[16]);
        Integer[] numArr9 = new Integer[llIlIIIllII[2]];
        numArr9[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[25]);
        ImmutableMap.Builder put10 = put9.put(valueOf57, ImmutableSet.of(valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, numArr9));
        Integer valueOf64 = Integer.valueOf(llIlIIIllII[44]);
        Integer valueOf65 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf66 = Integer.valueOf(llIlIIIllII[2]);
        Integer valueOf67 = Integer.valueOf(llIlIIIllII[3]);
        Integer valueOf68 = Integer.valueOf(llIlIIIllII[21]);
        Integer valueOf69 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf70 = Integer.valueOf(llIlIIIllII[25]);
        Integer[] numArr10 = new Integer[llIlIIIllII[2]];
        numArr10[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[30]);
        ImmutableMap.Builder put11 = put10.put(valueOf64, ImmutableSet.of(valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, numArr10));
        Integer valueOf71 = Integer.valueOf(llIlIIIllII[8]);
        Integer valueOf72 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf73 = Integer.valueOf(llIlIIIllII[3]);
        Integer valueOf74 = Integer.valueOf(llIlIIIllII[14]);
        Integer valueOf75 = Integer.valueOf(llIlIIIllII[11]);
        Integer valueOf76 = Integer.valueOf(llIlIIIllII[23]);
        Integer valueOf77 = Integer.valueOf(llIlIIIllII[12]);
        Integer[] numArr11 = new Integer[llIlIIIllII[2]];
        numArr11[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[17]);
        ImmutableMap.Builder put12 = put11.put(valueOf71, ImmutableSet.of(valueOf72, valueOf73, valueOf74, valueOf75, valueOf76, valueOf77, numArr11));
        Integer valueOf78 = Integer.valueOf(llIlIIIllII[45]);
        Integer valueOf79 = Integer.valueOf(llIlIIIllII[0]);
        Integer valueOf80 = Integer.valueOf(llIlIIIllII[2]);
        Integer valueOf81 = Integer.valueOf(llIlIIIllII[4]);
        Integer valueOf82 = Integer.valueOf(llIlIIIllII[10]);
        Integer valueOf83 = Integer.valueOf(llIlIIIllII[5]);
        Integer valueOf84 = Integer.valueOf(llIlIIIllII[3]);
        Integer[] numArr12 = new Integer[llIlIIIllII[2]];
        numArr12[llIlIIIllII[0]] = Integer.valueOf(llIlIIIllII[14]);
        fz = put12.put(valueOf78, ImmutableSet.of(valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, valueOf84, numArr12)).build();
        fA = Pattern.compile(llIlIIIlIll[llIlIIIllII[10]]);
    }

    private static void lIlIIlIlIIIIlI() {
        llIlIIIlIll = new String[llIlIIIllII[5]];
        llIlIIIlIll[llIlIIIllII[0]] = lIlIIlIlIIIIII("OTggHCAWImMBJBo6JgE=", "xVCuE");
        llIlIIIlIll[llIlIIIllII[2]] = lIlIIlIlIIIIII("OjgeIT8QIg==", "sVmQZ");
        llIlIIIlIll[llIlIIIllII[4]] = lIlIIlIlIIIIIl("xEMZtOIHCZqIqCPaNjwMGQ9YVEftN9+eArk9Aow+JB7p77lI9yOisRTBqRBfXwS0", "WWssN");
        llIlIIIlIll[llIlIIIllII[10]] = lIlIIlIlIIIIIl("Saj8XJJ9Sg2iFbl/FELv6qzOJRakXSSrob2y0WzR9WEzTWfm1Qy3Z2JYV0BXtqJVaKkLa0I3ioXyit+v1MWusA==", "gHCyO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIlIlIIlIII(chatMessage.getMessage().startsWith(llIlIIIlIll[llIlIIIllII[4]]) ? 1 : 0)) {
            this.fC = llIlIIIllII[0];
            this.fm = llIlIIIllII[0];
            return;
        }
        Matcher matcher = fA.matcher(Text.removeTags(chatMessage.getMessage()));
        if (lIlIIlIlIIIllI(matcher.matches() ? 1 : 0)) {
            return;
        }
        this.fC = Integer.parseInt(matcher.group(llIlIIIllII[2]));
    }

    private static int lIlIIlIlIIIlIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    @Inject
    protected C0045br(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
        this.fo = Collections.emptySet();
    }

    private static void lIlIIlIlIIIIll() {
        llIlIIIllII = new int[46];
        llIlIIIllII[0] = ((6 ^ 20) ^ (2 ^ 68)) & (((197 ^ 167) ^ (50 ^ 4)) ^ (-" ".length()));
        llIlIIIllII[1] = 125 ^ 105;
        llIlIIIllII[2] = " ".length();
        llIlIIIllII[3] = 109 ^ 104;
        llIlIIIllII[4] = "  ".length();
        llIlIIIllII[5] = 78 ^ 74;
        llIlIIIllII[6] = 74 ^ 110;
        llIlIIIllII[7] = 124 ^ 68;
        llIlIIIllII[8] = 80 ^ 124;
        llIlIIIllII[9] = (229 ^ 191) ^ (125 ^ 18);
        llIlIIIllII[10] = "   ".length();
        llIlIIIllII[11] = 88 ^ 83;
        llIlIIIllII[12] = 131 ^ 146;
        llIlIIIllII[13] = 99 ^ 118;
        llIlIIIllII[14] = (((60 + 66) - 95) + 154) ^ (((1 + 131) - 90) + 137);
        llIlIIIllII[15] = 58 ^ 44;
        llIlIIIllII[16] = (16 ^ 124) ^ (50 ^ 82);
        llIlIIIllII[17] = (90 ^ 26) ^ (250 ^ 168);
        llIlIIIllII[18] = 104 ^ 112;
        llIlIIIllII[19] = 101 ^ 114;
        llIlIIIllII[20] = (5 ^ 102) ^ (116 ^ 17);
        llIlIIIllII[21] = (17 ^ 111) ^ (7 ^ 126);
        llIlIIIllII[22] = 163 ^ 171;
        llIlIIIllII[23] = 112 ^ 126;
        llIlIIIllII[24] = 83 ^ 74;
        llIlIIIllII[25] = 190 ^ 179;
        llIlIIIllII[26] = (7 ^ 14) ^ (64 ^ 83);
        llIlIIIllII[27] = (156 ^ 184) ^ (28 ^ 49);
        llIlIIIllII[28] = (225 ^ 146) ^ (66 ^ 42);
        llIlIIIllII[29] = 216 ^ 196;
        llIlIIIllII[30] = 25 ^ 10;
        llIlIIIllII[31] = 139 ^ 150;
        llIlIIIllII[32] = (((79 + 0) - 76) + 152) ^ (((117 + 65) - 104) + 55);
        llIlIIIllII[33] = 127 ^ 96;
        llIlIIIllII[34] = (228 ^ 171) ^ (67 ^ 44);
        llIlIIIllII[35] = (77 ^ 3) ^ (44 ^ 67);
        llIlIIIllII[36] = (48 ^ 80) ^ (120 ^ 58);
        llIlIIIllII[37] = 95 ^ 124;
        llIlIIIllII[38] = 99 ^ 70;
        llIlIIIllII[39] = 157 ^ 187;
        llIlIIIllII[40] = (((114 + 166) - 245) + 143) ^ (((125 + 14) - 105) + 115);
        llIlIIIllII[41] = (((23 + 10) - (-31)) + 89) ^ (((174 + 100) - 183) + 86);
        llIlIIIllII[42] = 51 ^ 26;
        llIlIIIllII[43] = (((118 + 81) - 117) + 55) ^ (((140 + 13) - 78) + 88);
        llIlIIIllII[44] = (78 ^ 101) ^ ((162 ^ 139) & ((190 ^ 151) ^ (-1)));
        llIlIIIllII[45] = 189 ^ 144;
    }

    private Set<Integer> b(Tile[][] tileArr, Point point) {
        HashSet hashSet = new HashSet();
        int i = llIlIIIllII[0];
        while (lIlIIlIlIIlIlI(i, llIlIIIllII[3])) {
            int i2 = llIlIIIllII[0];
            while (lIlIIlIlIIlIlI(i2, llIlIIIllII[3])) {
                IntStream mapToInt = Arrays.stream(tileArr[point.getX() + i2][point.getY() - i].getGameObjects()).filter((v0) -> {
                    return Objects.nonNull(v0);
                }).mapToInt((v0) -> {
                    return v0.getId();
                });
                Set<Integer> set = fw;
                Objects.requireNonNull(set);
                "".length();
                if (lIlIIlIlIIlIII(mapToInt.anyMatch((v1) -> {
                    return r1.contains(v1);
                }) ? 1 : 0)) {
                    hashSet.add(Integer.valueOf((i * llIlIIIllII[3]) + i2));
                    "".length();
                }
                i2++;
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
            }
            i++;
            "".length();
            if ((((((231 + 209) - 384) + 184) ^ (((33 + 76) - 96) + 162)) & (((((131 + 216) - 332) + 225) ^ (((69 + 134) - 199) + 171)) ^ (-" ".length()))) != (((231 ^ 156) ^ (12 ^ 89)) & (((236 ^ 185) ^ (195 ^ 184)) ^ (-" ".length())))) {
                return null;
            }
        }
        return hashSet;
    }

    private Point a(Tile[][] tileArr) {
        Point[] pointArr = fy;
        int length = pointArr.length;
        int i = llIlIIIllII[0];
        while (lIlIIlIlIIlIlI(i, length)) {
            Point point = pointArr[i];
            GroundObject groundObject = tileArr[point.getX()][point.getY()].getGroundObject();
            if (lIlIIlIlIIlIll(groundObject) && lIlIIlIlIIllII(groundObject.getId(), EnumC0046bs.FOOT.ch())) {
                return point;
            }
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return null;
    }

    private static boolean lIlIIlIlIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIlIIlIII(int i) {
        return i != 0;
    }

    private static boolean lIlIIlIlIIIllI(int i) {
        return i == 0;
    }

    private static String lIlIIlIlIIIIIl(String llllllllllllllllIIllIlllIIIIlIII, String llllllllllllllllIIllIlllIIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlllIIIIIlll.getBytes(StandardCharsets.UTF_8)), llIlIIIllII[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIllII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlllIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlllIIIIlIIl) {
            llllllllllllllllIIllIlllIIIIlIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (lIlIIlIlIIlIII(fw.contains(Integer.valueOf(gameObjectSpawned.getGameObject().getId())) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }

    private static boolean lIlIIlIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlIlIIlIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        if (lIlIIlIlIIIllI(this.fm ? 1 : 0) && lIlIIlIlIIIlll(this.fC, llIlIIIllII[1])) {
            ca();
            return llIlIIIllII[2];
        } else if (lIlIIlIlIIlIII(this.fo.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[llIlIIIllII[2]];
            strArr[llIlIIIllII[0]] = llIlIIIlIll[llIlIIIllII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIlIIlIlIIIlII(nearest)) {
                return llIlIIIllII[0];
            }
            nearest.interact(llIlIIIlIll[llIlIIIllII[2]]);
            return llIlIIIllII[2];
        } else {
            this.cu.getLocalPlayer().getWorldLocation();
            WorldPoint orElse = this.fo.stream().filter(worldPoint -> {
                return TileObjects.getAll(tileObject -> {
                    return fw.contains(Integer.valueOf(tileObject.getId()));
                }).stream().noneMatch(tileObject2 -> {
                    return tileObject2.getWorldLocation().equals(worldPoint);
                });
            }).min(Comparator.comparingInt((v0) -> {
                return v0.getX();
            }).thenComparingDouble(worldPoint2 -> {
                return worldPoint2.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation());
            })).orElse(null);
            if (!lIlIIlIlIIIlII(orElse) && !lIlIIlIlIIlIIl(lIlIIlIlIIIlIl(orElse.pathTo(this.cu, orElse).stream().filter(worldPoint3 -> {
                return TileObjects.getAll(tileObject -> {
                    return fx.contains(Integer.valueOf(tileObject.getId()));
                }).stream().anyMatch(tileObject2 -> {
                    return tileObject2.getWorldLocation().equals(worldPoint3);
                });
            }).count(), 1L))) {
                Movement.setDestination(orElse);
                return llIlIIIllII[2];
            }
            return llIlIIIllII[0];
        }
    }

    private static boolean lIlIIlIlIIllII(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        return TileObjects.getNearest(tileObject -> {
            return fx.contains(Integer.valueOf(tileObject.getId()));
        }).getWorldX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return fx.contains(Integer.valueOf(tileObject.getId()));
        });
        return lIlIIlIlIIIlII(nearest) ? llIlIIIllII[0] : Reachable.isWalkable(nearest.getWorldLocation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fm = llIlIIIllII[0];
        this.fB = new HashSet();
        this.fC = llIlIIIllII[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIlIIlIlIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlIlIIIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        return llIlIIIllII[0];
    }

    private Set<WorldPoint> b(Point point) {
        return (Set) Sets.difference(fz.get(Integer.valueOf(this.fC)), this.fB).stream().map(num -> {
            return WorldPoint.fromScene(this.cu, point.getX() + (num.intValue() % llIlIIIllII[3]), point.getY() - (num.intValue() / llIlIIIllII[3]), this.cu.getPlane());
        }).collect(Collectors.toSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private void ca() {
        if (lIlIIlIlIIlIlI(this.fC, llIlIIIllII[1])) {
            return;
        }
        this.fm = llIlIIIllII[2];
        Tile[][] tileArr = this.cu.getScene().getTiles()[this.cu.getPlane()];
        Point a = a(tileArr);
        if (lIlIIlIlIIIlII(a)) {
            return;
        }
        this.fB = b(tileArr, a);
        this.fo = b(a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (lIlIIlIlIIlIII(fw.contains(Integer.valueOf(gameObjectDespawned.getGameObject().getId())) ? 1 : 0)) {
            this.fm = llIlIIIllII[0];
        }
    }
}
